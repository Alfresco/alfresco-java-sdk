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

import org.alfresco.core.handler.SitesApiClient;
import org.alfresco.core.model.Site;
import org.alfresco.core.model.SiteBodyCreate;
import org.alfresco.core.model.SiteContainerEntry;
import org.alfresco.core.model.SiteEntry;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import util.TestUtils;

/**
 * Test scenario that creates a site before the execution and deletes it once the test is done.
 */
public abstract class AbstractSiteBasedIntegrationTest {

    @Autowired
    protected SitesApiClient sitesApiClient;

    protected Site testSite;
    protected String testSiteDocumentLibraryId;

    @BeforeEach
    public void setup() {
        createTestSite();
        getDocumentLibraryId();
    }

    @AfterEach
    public void tearDown() {
        deleteTestSite();
    }

    private void createTestSite() {
        SiteBodyCreate siteBodyCreate = new SiteBodyCreate();
        siteBodyCreate.setTitle(TestUtils.getRandomSiteName());
        ResponseEntity<SiteEntry> createSiteResponse = sitesApiClient.createSite(siteBodyCreate, null, null, null);
        testSite = createSiteResponse.getBody().getEntry();
    }

    private void getDocumentLibraryId() {
        ResponseEntity<SiteContainerEntry> getSiteContainerResponse = sitesApiClient.getSiteContainer(testSite.getTitle(), "documentLibrary", null);
        testSiteDocumentLibraryId = getSiteContainerResponse.getBody().getEntry().getId();
    }

    private void deleteTestSite() {
        sitesApiClient.deleteSite(testSite.getId(), true);
    }
}
