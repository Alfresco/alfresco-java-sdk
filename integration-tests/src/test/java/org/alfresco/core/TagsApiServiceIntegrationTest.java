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

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.alfresco.core.handler.NodesApiClient;
import org.alfresco.core.handler.TagsApiClient;
import org.alfresco.core.model.NodeBodyCreate;
import org.alfresco.core.model.NodeEntry;
import org.alfresco.core.model.TagBody;
import org.alfresco.core.model.TagEntry;
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
import util.Constants.NodeIds;
import util.Constants.NodeTypes;
import util.Constants.TestContainers;
import util.Constants.Timeouts;
import util.TestUtils;

@Testcontainers
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TagsApiServiceIntegrationTest {

    @Container
    public static DockerComposeContainer compose = new DockerComposeContainer(new File("src/test/resources/docker-compose.yml"))
        .withLocalCompose(true)
        .withExposedService(TestContainers.SERVICE_NAME, TestContainers.SERVICE_PORT,
            Wait.forListeningPort().withStartupTimeout(Duration.ofSeconds(TestContainers.TIMEOUT_DURATION)));

    @Autowired
    private TagsApiClient tagsApiClient;

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
    void should_createTagAndGetTag() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);
        TagBody tagBody = new TagBody();
        tagBody.setTag("test-tag");

        ResponseEntity<NodeEntry> createNodeResponse = nodesApiClient.createNode(NodeIds.MY_NODE, nodeBody, null, null, null, null, null);
        long awaitTimeoutInMilliseconds = 10_000;
        await()
            .atMost(awaitTimeoutInMilliseconds, TimeUnit.MILLISECONDS)
            .pollDelay(2000, TimeUnit.MILLISECONDS)
            .untilAsserted(() ->
                assertThat(tagsApiClient.createTagForNode(createNodeResponse.getBody().getEntry().getId(), tagBody, null).getBody().getEntry().getId())
                    .isNotNull());

        ResponseEntity<TagEntry> createTagForNodeResponse = tagsApiClient.createTagForNode(createNodeResponse.getBody().getEntry().getId(), tagBody, null);
        ResponseEntity<TagEntry> getTagResponse = tagsApiClient.getTag(createTagForNodeResponse.getBody().getEntry().getId(), null);

        assertThat(createTagForNodeResponse.getBody().getEntry().getTag()).isEqualTo("test-tag");
        assertThat(getTagResponse.getBody().getEntry().getTag()).isEqualTo("test-tag");
    }

    @Test
    void should_deleteTag() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);
        TagBody tagBody = new TagBody();
        tagBody.setTag("test-tag");

        ResponseEntity<NodeEntry> createNodeResponse = nodesApiClient.createNode(NodeIds.MY_NODE, nodeBody, null, null, null, null, null);
        long awaitTimeoutInMilliseconds = 10_000;
        await()
            .atMost(awaitTimeoutInMilliseconds, TimeUnit.MILLISECONDS)
            .pollDelay(2000, TimeUnit.MILLISECONDS)
            .untilAsserted(() ->
                assertThat(tagsApiClient.createTagForNode(createNodeResponse.getBody().getEntry().getId(), tagBody, null).getBody().getEntry().getId())
                    .isNotNull());
        ResponseEntity<TagEntry> createTagForNodeResponse = tagsApiClient.createTagForNode(createNodeResponse.getBody().getEntry().getId(), tagBody, null);
        tagsApiClient.deleteTagFromNode(createNodeResponse.getBody().getEntry().getId(), createTagForNodeResponse.getBody().getEntry().getId());

        assertThat(tagsApiClient.getTag(createTagForNodeResponse.getBody().getEntry().getId(), null).getBody().getEntry()).isNotNull();
    }

    @Test
    void should_updateTag() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);
        TagBody tagBody = new TagBody();
        tagBody.setTag("test-tag");

        ResponseEntity<NodeEntry> createNodeResponse = nodesApiClient.createNode(NodeIds.MY_NODE, nodeBody, null, null, null, null, null);
        long awaitTimeoutInMilliseconds = 10_000;
        await()
            .atMost(awaitTimeoutInMilliseconds, TimeUnit.MILLISECONDS)
            .pollDelay(2000, TimeUnit.MILLISECONDS)
            .untilAsserted(() ->
                assertThat(tagsApiClient.createTagForNode(createNodeResponse.getBody().getEntry().getId(), tagBody, null).getBody().getEntry().getId())
                    .isNotNull());
        ResponseEntity<TagEntry> createTagForNodeResponse = tagsApiClient.createTagForNode(createNodeResponse.getBody().getEntry().getId(), tagBody, null);
        tagBody.setTag("updated-tag");
        ResponseEntity<TagEntry> updateTagResponse = tagsApiClient.updateTag(createTagForNodeResponse.getBody().getEntry().getId(), tagBody, null);

        assertThat(createTagForNodeResponse.getBody().getEntry().getTag()).isEqualTo("test-tag");
        assertThat(updateTagResponse.getBody().getEntry().getTag()).isEqualTo("updated-tag");
    }
}
