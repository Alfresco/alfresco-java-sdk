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
package org.alfresco;

import org.alfresco.core.handler.NodesApiClient;
import org.alfresco.core.model.Node;
import org.alfresco.core.model.NodeBodyCreate;
import org.alfresco.core.model.NodeEntry;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import util.TestUtils;

/**
 * Test scenario that creates a node before the execution. The node type must be determined by the children classes. The node is not deleted after the test
 * because it relies on the deletion of the whole site in {@link AbstractSiteBasedIntegrationTest}.
 */
public abstract class AbstractNodeBasedIntegrationTest extends AbstractSiteBasedIntegrationTest {

    @Autowired
    protected NodesApiClient nodesApiClient;

    protected Node testNode;

    @BeforeEach
    public void setup() {
        super.setup();
        createTestNode();
    }

    private void createTestNode() {
        NodeBodyCreate nodeBody = new NodeBodyCreate();
        String nodeName = TestUtils.getRandomNodeName();
        nodeBody.setName(nodeName);
        nodeBody.setNodeType(getTestNodeType());
        ResponseEntity<NodeEntry> createNodeResponse = nodesApiClient.createNode(testSiteDocumentLibraryId, nodeBody, null, null, true, null, null);
        testNode = createNodeResponse.getBody().getEntry();
    }

    protected abstract String getTestNodeType();
}
