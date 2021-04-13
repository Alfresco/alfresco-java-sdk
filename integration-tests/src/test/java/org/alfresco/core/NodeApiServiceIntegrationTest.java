package org.alfresco.core;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.time.Duration;
import org.alfresco.core.handler.NodesApiClient;
import org.alfresco.core.model.NodeBodyCreate;
import org.alfresco.core.model.NodeEntry;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@SpringBootTest
public class NodeApiServiceIntegrationTest {

    @Autowired
    private NodesApiClient nodesApiClient;

    @Container
    public static DockerComposeContainer compose = new DockerComposeContainer(new File("src/test/resources/docker-compose.yml"))
        .withLocalCompose(true)
        .withExposedService("alfresco", 8080, Wait.forListeningPort().withStartupTimeout(Duration.ofSeconds(90)));

    @Test
    void should_getMyNode() throws Exception {
        //will be replaced with custom check
        Thread.sleep(50000);

        ResponseEntity<NodeEntry> node = nodesApiClient.getNode("-my-", null, null, null);
        assertThat(node.getBody()).isNotNull();
        assertThat(node.getBody().getEntry().getId()).isNotNull();
    }

    @Test
    void should_createNode() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = "test-app";
        nodeBody.setName(nodeName);
        nodeBody.setNodeType("cm:folder");
        ResponseEntity<NodeEntry> createdNode = nodesApiClient.createNode("-my-", nodeBody, null, null, null, null, null);
        ResponseEntity<NodeEntry> actualNode = nodesApiClient.getNode(createdNode.getBody().getEntry().getId(), null, null, null);

        assertThat(createdNode.getBody()).isNotNull();
        assertThat(createdNode.getBody().getEntry().getName()).isEqualTo(nodeName);
        assertThat(actualNode.getBody()).isNotNull();
        assertThat(actualNode.getBody().getEntry().getName()).isEqualTo(nodeName);
    }
}
