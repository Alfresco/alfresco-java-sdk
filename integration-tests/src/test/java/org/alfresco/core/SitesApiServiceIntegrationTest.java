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
import org.alfresco.core.handler.SitesApiClient;
import org.alfresco.core.model.SiteBodyCreate;
import org.alfresco.core.model.SiteEntry;
import org.alfresco.core.model.SiteMemberEntry;
import org.alfresco.core.model.SiteMembershipBodyCreate;
import org.alfresco.core.model.SiteMembershipBodyCreate.RoleEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import util.TestUtils;

/**
 * Integration tests for {@link SitesApiClient}.
 */
@SpringBootTest
public class SitesApiServiceIntegrationTest {

    @Autowired
    private SitesApiClient sitesApiClient;

    @Test
    void should_createSiteAndGetSite() {
        SiteBodyCreate siteBodyCreate = new SiteBodyCreate();
        siteBodyCreate.setTitle(TestUtils.getRandomSiteName());

        ResponseEntity<SiteEntry> createSiteResponse = sitesApiClient.createSite(siteBodyCreate, null, null, null);
        ResponseEntity<SiteEntry> getSiteResponse = sitesApiClient.getSite(createSiteResponse.getBody().getEntry().getId(), null, null);

        assertThat(createSiteResponse.getBody()).isNotNull();
        assertThat(createSiteResponse.getBody().getEntry().getTitle()).isEqualTo(siteBodyCreate.getTitle());
        assertThat(getSiteResponse.getBody()).isNotNull();
        assertThat(getSiteResponse.getBody().getEntry().getTitle()).isEqualTo(siteBodyCreate.getTitle());
    }

    @Test
    void should_createSiteMembershipAndGetSiteMembership() {
        SiteBodyCreate siteBodyCreate = new SiteBodyCreate();
        siteBodyCreate.setTitle(TestUtils.getRandomSiteName());
        SiteMembershipBodyCreate siteMembershipBodyCreate = new SiteMembershipBodyCreate();
        siteMembershipBodyCreate.setRole(RoleEnum.SITEMANAGER);
        siteMembershipBodyCreate.setId("abeecher");

        ResponseEntity<SiteEntry> createSiteResponse = sitesApiClient.createSite(siteBodyCreate, null, null, null);
        ResponseEntity<SiteMemberEntry> createSiteMembershipResponse = sitesApiClient
            .createSiteMembership(createSiteResponse.getBody().getEntry().getId(), siteMembershipBodyCreate, null);
        ResponseEntity<SiteMemberEntry> getSiteMembershipResponse = sitesApiClient
            .getSiteMembership(createSiteResponse.getBody().getEntry().getId(), siteMembershipBodyCreate.getId(), null);

        assertThat(createSiteMembershipResponse.getBody().getEntry()).isNotNull();
        assertThat(getSiteMembershipResponse.getBody().getEntry()).isNotNull();
        assertThat(getSiteMembershipResponse.getBody().getEntry().getId()).isEqualTo(createSiteMembershipResponse.getBody().getEntry().getId());
        assertThat(getSiteMembershipResponse.getBody().getEntry().getRole().toString()).isEqualTo(RoleEnum.SITEMANAGER.toString());
    }

    @Test
    void should_deleteSite() {
        SiteBodyCreate siteBodyCreate = new SiteBodyCreate();
        siteBodyCreate.setTitle(TestUtils.getRandomSiteName());

        ResponseEntity<SiteEntry> createSiteResponse = sitesApiClient.createSite(siteBodyCreate, null, null, null);
        sitesApiClient.deleteSite(createSiteResponse.getBody().getEntry().getId(), true);

        Assertions.assertThrows(NotFound.class, () -> sitesApiClient.getSite(createSiteResponse.getBody().getEntry().getId(), null, null));
    }
}
