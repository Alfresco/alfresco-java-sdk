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

import org.alfresco.AbstractSiteBasedIntegrationTest;
import org.alfresco.core.handler.NodesApiClient;
import org.alfresco.core.handler.RenditionsApiClient;
import org.alfresco.core.model.Node;
import org.alfresco.core.model.NodeBodyCreate;
import org.alfresco.core.model.NodeEntry;
import org.alfresco.core.model.RenditionBodyCreate;
import org.alfresco.core.model.RenditionEntry;
import org.alfresco.core.model.RenditionPaging;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import util.Constants.NodeTypes;
import util.TestUtils;

/**
 * Integration tests for {@link RenditionsApiClient}.
 */
@SpringBootTest
public class RenditionsApiServiceIntegrationTest extends AbstractSiteBasedIntegrationTest {

    public static final String DOCLIB = "doclib";

    @Autowired
    private RenditionsApiClient renditionsApiClient;

    @Autowired
    private NodesApiClient nodesApiClient;

    @Test
    void should_createRenditionAndGetRendition() {
        Node testNode = createTestNode();

        RenditionBodyCreate renditionBodyCreate = new RenditionBodyCreate();
        renditionBodyCreate.setId(DOCLIB);
        renditionsApiClient.createRendition(testNode.getId(), renditionBodyCreate);
        ResponseEntity<RenditionEntry> getRenditionResponse = renditionsApiClient.getRendition(testNode.getId(), "doclib");

        assertThat(getRenditionResponse.getBody().getEntry().getId()).isEqualTo("doclib");
    }

    @Test
    void should_listRenditions() {
        Node testNode = createTestNode();

        RenditionBodyCreate renditionBodyCreate = new RenditionBodyCreate();
        renditionBodyCreate.setId(DOCLIB);
        renditionsApiClient.createRendition(testNode.getId(), renditionBodyCreate);
        ResponseEntity<RenditionPaging> listRenditionsResponse = renditionsApiClient.listRenditions(testNode.getId(), null);

        assertThat(listRenditionsResponse.getBody().getList().getEntries()).isNotEmpty();
    }

    private Node createTestNode() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName + ".txt");
        nodeBody.setNodeType(NodeTypes.FILE);
        ResponseEntity<NodeEntry> createNodeResponse = nodesApiClient.createNode(testSiteDocumentLibraryId, nodeBody, null, null, null, null, null);
        return createNodeResponse.getBody().getEntry();
    }
}
