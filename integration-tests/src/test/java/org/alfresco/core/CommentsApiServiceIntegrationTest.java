/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static util.Constants.NodeIds;
import static util.Constants.TestContainers;
import static util.Constants.Timeouts;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.alfresco.core.handler.CommentsApiClient;
import org.alfresco.core.handler.NodesApiClient;
import org.alfresco.core.model.CommentBody;
import org.alfresco.core.model.CommentEntry;
import org.alfresco.core.model.CommentPaging;
import org.alfresco.core.model.NodeBodyCreate;
import org.alfresco.core.model.NodeEntry;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import util.Constants.NodeTypes;
import util.TestUtils;

@Testcontainers
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CommentsApiServiceIntegrationTest {

    @Container
    public static DockerComposeContainer compose = new DockerComposeContainer(new File("src/test/resources/docker-compose.yml"))
        .withLocalCompose(true)
        .withExposedService(TestContainers.SERVICE_NAME, TestContainers.SERVICE_PORT,
            Wait.forListeningPort().withStartupTimeout(Duration.ofSeconds(TestContainers.TIMEOUT_DURATION)));

    @Autowired
    private CommentsApiClient commentsApiClient;

    @Autowired
    private NodesApiClient nodesApiClient;

    @BeforeAll
    public void setUp() {
        await()
            .atMost(Timeouts.TWO_MINUTES_IN_MILLIS, TimeUnit.MILLISECONDS)
            .pollDelay(Timeouts.POLL_DELAY_IN_MILLIS, TimeUnit.MILLISECONDS)
            .untilAsserted(() ->
                assertThat(nodesApiClient
                    .getNode(NodeIds.MY_NODE, null, null, null)
                    .getStatusCode()).isEqualTo(HttpStatus.OK));
    }

    @Test
    void should_createCommentAndListComments() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);
        CommentBody commentBody = new CommentBody();
        commentBody.setContent("Test comment");

        ResponseEntity<NodeEntry> createNodeResponse = nodesApiClient.createNode(NodeIds.MY_NODE, nodeBody, null, null, null, null, null);
        ResponseEntity<CommentEntry> createCommentResponse = commentsApiClient
            .createComment(createNodeResponse.getBody().getEntry().getId(), commentBody, null);
        ResponseEntity<CommentPaging> listCommentsResponse = commentsApiClient.listComments(createNodeResponse.getBody().getEntry().getId(), null, null, null);

        assertThat(createCommentResponse.getBody()).isNotNull();
        assertThat(createCommentResponse.getBody().getEntry().getContent()).isEqualTo(commentBody.getContent());
        assertThat(listCommentsResponse.getBody().getList().getEntries()).isNotNull();
        assertThat(listCommentsResponse.getBody().getList().getEntries().get(0).getEntry().getContent()).isEqualTo(commentBody.getContent());
    }

    @Test
    void should_updateComment() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);
        CommentBody commentBody = new CommentBody();
        commentBody.setContent("Test comment");
        CommentBody updateCommentBody = new CommentBody();
        updateCommentBody.setContent("Updated comment");

        ResponseEntity<NodeEntry> createNodeResponse = nodesApiClient.createNode(NodeIds.MY_NODE, nodeBody, null, null, null, null, null);
        ResponseEntity<CommentEntry> createCommentResponse = commentsApiClient
            .createComment(createNodeResponse.getBody().getEntry().getId(), commentBody, null);
        ResponseEntity<CommentEntry> updateCommentResponse = commentsApiClient
            .updateComment(createNodeResponse.getBody().getEntry().getId(), createCommentResponse.getBody().getEntry().getId(), updateCommentBody, null);

        assertThat(updateCommentResponse.getBody().getEntry().getContent()).isEqualTo(updateCommentBody.getContent());
    }

    @Test
    void should_deleteComment() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);
        CommentBody commentBody = new CommentBody();
        commentBody.setContent("Test comment");

        ResponseEntity<NodeEntry> createNodeResponse = nodesApiClient.createNode(NodeIds.MY_NODE, nodeBody, null, null, null, null, null);
        ResponseEntity<CommentEntry> createCommentResponse = commentsApiClient
            .createComment(createNodeResponse.getBody().getEntry().getId(), commentBody, null);
        commentsApiClient.deleteComment(createNodeResponse.getBody().getEntry().getId(), createCommentResponse.getBody().getEntry().getId());

        assertThat(commentsApiClient.listComments(createNodeResponse.getBody().getEntry().getId(), null, null, null).getBody().getList().getEntries().isEmpty())
            .isTrue();
    }
}
