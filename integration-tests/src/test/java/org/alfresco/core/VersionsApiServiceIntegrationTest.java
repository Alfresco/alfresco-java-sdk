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

import org.alfresco.AbstractContentBasedIntegrationTest;
import org.alfresco.core.handler.VersionsApiClient;
import org.alfresco.core.model.VersionEntry;
import org.alfresco.core.model.VersionPaging;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

/**
 * Integration tests for {@link VersionsApiClient}.
 */
@SpringBootTest
public class VersionsApiServiceIntegrationTest extends AbstractContentBasedIntegrationTest {

    @Autowired
    private VersionsApiClient versionsApiClient;

    @Test
    void should_listVersionsAndGetVersion() {
        ResponseEntity<VersionPaging> listVersionsResponse = versionsApiClient.listVersionHistory(testNode.getId(), null, null, null, null);
        ResponseEntity<VersionEntry> getVersionResponse = versionsApiClient
            .getVersion(testNode.getId(), listVersionsResponse.getBody().getList().getEntries().get(0).getEntry().getId());

        assertThat(listVersionsResponse.getBody().getList().getEntries()).isNotEmpty();
        assertThat(getVersionResponse.getBody().getEntry().getId()).isNotNull();
    }
}
