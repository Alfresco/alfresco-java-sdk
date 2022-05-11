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
import org.alfresco.core.handler.QueriesApiClient;
import org.alfresco.core.handler.SitesApiClient;
import org.alfresco.core.model.PersonPaging;
import org.alfresco.core.model.SitePaging;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import util.Constants.PersonIds;

/**
 * Integration tests for {@link QueriesApiClient}.
 */
@SpringBootTest
public class QueriesApiServiceIntegrationTest extends AbstractSiteBasedIntegrationTest {

    @Autowired
    private QueriesApiClient queriesApiClient;

    @Autowired
    private SitesApiClient sitesApiClient;

    @Test
    void should_findPeople() {
        ResponseEntity<PersonPaging> findPeopleResponse = queriesApiClient.findPeople(PersonIds.EXISTING_TEST_USER, null, null, null, null);

        assertThat(findPeopleResponse.getBody().getList().getEntries()).isNotEmpty();
        assertThat(findPeopleResponse.getBody().getList().getEntries().get(0).getEntry().getId()).isEqualTo(PersonIds.EXISTING_TEST_USER);
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
