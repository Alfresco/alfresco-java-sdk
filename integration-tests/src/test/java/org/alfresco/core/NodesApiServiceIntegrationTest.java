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

import feign.FeignException.NotFound;
import org.alfresco.AbstractSiteBasedIntegrationTest;
import org.alfresco.core.handler.NodesApiClient;
import org.alfresco.core.model.NodeBodyCopy;
import org.alfresco.core.model.NodeBodyCreate;
import org.alfresco.core.model.NodeChildAssociationPaging;
import org.alfresco.core.model.NodeEntry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import util.Constants.NodeTypes;
import util.TestUtils;

/**
 * Integration tests for {@link NodesApiClient}.
 */
@SpringBootTest
public class NodesApiServiceIntegrationTest extends AbstractSiteBasedIntegrationTest {

    @Autowired
    private NodesApiClient nodesApiClient;

    @Test
    void should_createNodeAndGetNode() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);

        ResponseEntity<NodeEntry> createdNode = nodesApiClient.createNode(testSiteDocumentLibraryId, nodeBody, null, null, null, null, null);
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

        ResponseEntity<NodeEntry> createdNode = nodesApiClient.createNode(testSiteDocumentLibraryId, nodeBody, null, null, null, null, null);
        nodeBodyCopy.setTargetParentId(createdNode.getBody().getEntry().getId());
        ResponseEntity<NodeEntry> copyNode = nodesApiClient.copyNode(createdNode.getBody().getEntry().getId(), nodeBodyCopy, null, null);
        ResponseEntity<NodeEntry> copiedNode = nodesApiClient.getNode(copyNode.getBody().getEntry().getId(), null, null, null);

        assertThat(copiedNode.getBody().getEntry().getParentId()).isEqualTo(createdNode.getBody().getEntry().getId());
    }

    @Test
    void should_listNodeChildren() {
        ResponseEntity<NodeChildAssociationPaging> nodeChildren = nodesApiClient
            .listNodeChildren(testSiteDocumentLibraryId, null, null, null, null, null, null, null, null);

        assertThat(nodeChildren.getBody().getList().getEntries()).isNotNull();
    }

    @Test
    void should_deleteNode() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(NodeTypes.FOLDER);

        ResponseEntity<NodeEntry> createdNode = nodesApiClient.createNode(testSiteDocumentLibraryId, nodeBody, null, null, null, null, null);
        nodesApiClient.deleteNode(createdNode.getBody().getEntry().getId(), null);

        Assertions.assertThrows(NotFound.class, () -> nodesApiClient.getNode(createdNode.getBody().getEntry().getId(), null, null, null));
    }
}
