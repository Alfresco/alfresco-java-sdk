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
import org.alfresco.AbstractContentBasedIntegrationTest;
import org.alfresco.core.handler.SharedLinksApiClient;
import org.alfresco.core.model.SharedLinkBodyCreate;
import org.alfresco.core.model.SharedLinkEntry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

/**
 * Integration tests for {@link SharedLinksApiClient}.
 */
@SpringBootTest
public class SharedLinksApiServiceIntegrationTest extends AbstractContentBasedIntegrationTest {

    @Autowired
    private SharedLinksApiClient sharedLinksApiClient;

    @Test
    void should_createSharedLinkAndGetSharedLink() {
        SharedLinkBodyCreate sharedLinkBodyCreate = new SharedLinkBodyCreate();
        sharedLinkBodyCreate.setNodeId(testNode.getId());
        ResponseEntity<SharedLinkEntry> createSharedLinkResponse = sharedLinksApiClient.createSharedLink(sharedLinkBodyCreate, null, null);
        ResponseEntity<SharedLinkEntry> getSharedLinkResponse = sharedLinksApiClient.getSharedLink(createSharedLinkResponse.getBody().getEntry().getId(), null);

        assertThat(createSharedLinkResponse.getBody().getEntry().getId()).isEqualTo(getSharedLinkResponse.getBody().getEntry().getId());
    }

    @Test
    void should_deleteSharedLink() {
        SharedLinkBodyCreate sharedLinkBodyCreate = new SharedLinkBodyCreate();
        sharedLinkBodyCreate.setNodeId(testNode.getId());
        ResponseEntity<SharedLinkEntry> createSharedLinkResponse = sharedLinksApiClient.createSharedLink(sharedLinkBodyCreate, null, null);
        sharedLinksApiClient.deleteSharedLink(createSharedLinkResponse.getBody().getEntry().getId());

        Assertions.assertThrows(NotFound.class, () -> sharedLinksApiClient.getSharedLink(createSharedLinkResponse.getBody().getEntry().getId(), null));
    }
}
