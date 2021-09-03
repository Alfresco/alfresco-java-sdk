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
import org.alfresco.core.handler.QueriesApiClient;
import org.alfresco.core.handler.SitesApiClient;
import org.alfresco.core.model.PersonPaging;
import org.alfresco.core.model.SitePaging;
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

@Testcontainers
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class QueriesApiServiceIntegrationTest {

    @Container
    public static DockerComposeContainer compose = new DockerComposeContainer(new File("src/test/resources/docker-compose.yml"))
        .withLocalCompose(true)
        .withExposedService(TestContainers.SERVICE_NAME, TestContainers.SERVICE_PORT,
            Wait.forListeningPort().withStartupTimeout(Duration.ofSeconds(TestContainers.TIMEOUT_DURATION)));

    @Autowired
    private QueriesApiClient queriesApiClient;

    @Autowired
    private NodesApiClient nodesApiClient;

    @Autowired
    private SitesApiClient sitesApiClient;

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
    void should_findPeople() {
        ResponseEntity<PersonPaging> findPeopleResponse = queriesApiClient.findPeople("admin", null, null, null, null);

        assertThat(findPeopleResponse.getBody().getList().getEntries()).isNotEmpty();
        assertThat(findPeopleResponse.getBody().getList().getEntries().get(0).getEntry().getId()).isEqualTo("admin");
    }

    @Test
    void should_findSites() {
        ResponseEntity<SitePaging> listSitesResponse = sitesApiClient.listSites(null, null, null, null, null, null);
        ResponseEntity<SitePaging> findSitesResponse = queriesApiClient
            .findSites(listSitesResponse.getBody().getList().getEntries().get(0).getEntry().getTitle(), null, null, null, null);

        assertThat(findSitesResponse.getBody().getList().getEntries()).isNotEmpty();
        assertThat(findSitesResponse.getBody().getList().getEntries().get(0).getEntry().getTitle())
            .isEqualTo(listSitesResponse.getBody().getList().getEntries().get(0).getEntry().getTitle());
    }
}
