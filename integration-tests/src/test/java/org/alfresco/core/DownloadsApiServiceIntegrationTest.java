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
import org.alfresco.core.handler.DownloadsApiClient;
import org.alfresco.core.model.DownloadBodyCreate;
import org.alfresco.core.model.DownloadEntry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Integration tests for {@link DownloadsApiClient}.
 */
@SpringBootTest
public class DownloadsApiServiceIntegrationTest extends AbstractFolderBasedIntegrationTest {

    @Autowired
    private DownloadsApiClient downloadsApiClient;

    @Test
    void should_createDownloadAndGetDownload() {
        DownloadBodyCreate downloadBodyCreate = new DownloadBodyCreate();
        downloadBodyCreate.addNodeIdsItem(testNode.getId());
        ResponseEntity<DownloadEntry> createDownloadResponse = downloadsApiClient.createDownload(downloadBodyCreate, null);
        ResponseEntity<DownloadEntry> getDownloadResponse = downloadsApiClient.getDownload(createDownloadResponse.getBody().getEntry().getId(), null);

        assertThat(createDownloadResponse.getBody()).isNotNull();
        assertThat(createDownloadResponse.getBody().getEntry().getId()).isEqualTo(getDownloadResponse.getBody().getEntry().getId());
    }

    @Test
    void should_cancelDownload() {
        DownloadBodyCreate downloadBodyCreate = new DownloadBodyCreate();
        downloadBodyCreate.addNodeIdsItem(testNode.getId());
        ResponseEntity<DownloadEntry> createDownloadResponse = downloadsApiClient.createDownload(downloadBodyCreate, null);

        assertThat(downloadsApiClient.cancelDownload(createDownloadResponse.getBody().getEntry().getId()).getStatusCode()).isEqualTo(HttpStatus.ACCEPTED);
    }
}
