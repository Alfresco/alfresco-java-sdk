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

import org.alfresco.AbstractFolderBasedIntegrationTest;
import org.alfresco.core.handler.TrashcanApiClient;
import org.alfresco.core.model.DeletedNodeEntry;
import org.alfresco.core.model.DeletedNodesPaging;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

/**
 * Integration tests for {@link TrashcanApiClient}.
 */
@SpringBootTest
public class TrashcanApiServiceIntegrationTest extends AbstractFolderBasedIntegrationTest {

    @Autowired
    private TrashcanApiClient trashcanApiClient;

    @Test
    void should_getDeletedNodeAndListDeletedNodes() {
        nodesApiClient.deleteNode(testNode.getId(), null);
        ResponseEntity<DeletedNodeEntry> getDeletedNodeResponse = trashcanApiClient.getDeletedNode(testNode.getId(), null);
        ResponseEntity<DeletedNodesPaging> listDeletedNodesResponse = trashcanApiClient.listDeletedNodes(null, null, null);

        assertThat(getDeletedNodeResponse.getBody().getEntry().getId()).isEqualTo(testNode.getId());
        assertThat(listDeletedNodesResponse.getBody().getList().getEntries()).isNotEmpty();
    }
}
