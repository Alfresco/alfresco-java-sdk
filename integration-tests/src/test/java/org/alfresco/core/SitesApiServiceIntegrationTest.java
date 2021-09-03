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
import static org.awaitility.Awaitility.await;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.alfresco.core.handler.NodesApiClient;
import org.alfresco.core.handler.SitesApiClient;
import org.alfresco.core.model.SiteBodyCreate;
import org.alfresco.core.model.SiteEntry;
import org.alfresco.core.model.SiteMemberEntry;
import org.alfresco.core.model.SiteMembershipBodyCreate;
import org.alfresco.core.model.SiteMembershipBodyCreate.RoleEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import util.Constants.NodeIds;
import util.Constants.TestContainers;
import util.Constants.Timeouts;
import util.TestUtils;

@Testcontainers
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SitesApiServiceIntegrationTest {

    @Container
    public static DockerComposeContainer compose = new DockerComposeContainer(new File("src/test/resources/docker-compose.yml"))
        .withLocalCompose(true)
        .withExposedService(TestContainers.SERVICE_NAME, TestContainers.SERVICE_PORT,
            Wait.forListeningPort().withStartupTimeout(Duration.ofSeconds(TestContainers.TIMEOUT_DURATION)));

    @Autowired
    private SitesApiClient sitesApiClient;

    @Autowired
    private NodesApiClient nodesApiClient;

    @BeforeAll
    public void setUp() {
        await()
            .atMost(Timeouts.TWO_MINUTES_IN_MILLIS, TimeUnit.MILLISECONDS)
            .pollDelay(Timeouts.POLL_DELAY_IN_MILLIS, TimeUnit.MILLISECONDS)
            .untilAsserted(() ->
                assertThat(nodesApiClient
                    .getNode(NodeIds.MY_NODE, null, null, null)
                    .getStatusCode()).isEqualTo(HttpStatus.OK));
    }

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

        assertThat(sitesApiClient.getSite(createSiteResponse.getBody().getEntry().getId(), null, null).getBody().getEntry()).isNull();
    }
}
