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
import org.alfresco.core.model.NodeBodyCopy;
import org.alfresco.core.model.NodeBodyCreate;
import org.alfresco.core.model.NodeChildAssociationPaging;
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
import util.Constants.NodeIds;
import util.Constants.NodeTypes;
import util.Constants.TestContainers;
import util.Constants.Timeouts;
import util.TestUtils;

@Testcontainers
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NodesApiServiceIntegrationTest {

    @Container
    public static DockerComposeContainer compose = new DockerComposeContainer(new File("src/test/resources/docker-compose.yml"))
        .withLocalCompose(true)
        .withExposedService(TestContainers.SERVICE_NAME, TestContainers.SERVICE_PORT,
            Wait.forListeningPort().withStartupTimeout(Duration.ofSeconds(TestContainers.TIMEOUT_DURATION)));

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
    void should_createNodeAndGetNode() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);

        ResponseEntity<NodeEntry> createdNode = nodesApiClient.createNode(NodeIds.MY_NODE, nodeBody, null, null, null, null, null);
        ResponseEntity<NodeEntry> actualNode = nodesApiClient.getNode(createdNode.getBody().getEntry().getId(), null, null, null);

        assertThat(createdNode.getBody()).isNotNull();
        assertThat(createdNode.getBody().getEntry().getName()).isEqualTo(nodeName);
        assertThat(actualNode.getBody()).isNotNull();
        assertThat(actualNode.getBody().getEntry().getName()).isEqualTo(nodeName);
    }

    @Test
    void should_copyNode() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        NodeBodyCopy nodeBodyCopy = new NodeBodyCopy();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);

        ResponseEntity<NodeEntry> createdNode = nodesApiClient.createNode(NodeIds.MY_NODE, nodeBody, null, null, null, null, null);
        nodeBodyCopy.setTargetParentId(createdNode.getBody().getEntry().getId());
        ResponseEntity<NodeEntry> copyNode = nodesApiClient.copyNode(createdNode.getBody().getEntry().getId(), nodeBodyCopy, null, null);
        ResponseEntity<NodeEntry> copiedNode = nodesApiClient.getNode(copyNode.getBody().getEntry().getId(), null, null, null);

        assertThat(copiedNode.getBody().getEntry().getParentId()).isEqualTo(createdNode.getBody().getEntry().getId());
    }

    @Test
    void should_listNodeChildren() {
        ResponseEntity<NodeChildAssociationPaging> nodeChildren = nodesApiClient
            .listNodeChildren(NodeIds.MY_NODE, null, null, null, null, null, null, null, null);

        assertThat(nodeChildren.getBody().getList().getEntries()).isNotNull();
    }

    @Test
    void should_deleteNode() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);

        ResponseEntity<NodeEntry> createdNode = nodesApiClient.createNode(NodeIds.MY_NODE, nodeBody, null, null, null, null, null);
        nodesApiClient.deleteNode(createdNode.getBody().getEntry().getId(), null);

        assertThat(nodesApiClient.getNode(createdNode.getBody().getEntry().getId(), null, null, null).getBody().getEntry()).isNull();
    }
}
