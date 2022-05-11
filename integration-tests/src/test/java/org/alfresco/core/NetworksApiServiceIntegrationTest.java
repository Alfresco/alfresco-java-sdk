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

import org.alfresco.core.handler.NetworksApiClient;
import org.alfresco.core.model.PersonNetworkEntry;
import org.alfresco.core.model.PersonNetworkPaging;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import util.Constants.PersonIds;

/**
 * Integration tests for {@link NetworksApiClient}.
 */
@SpringBootTest
public class NetworksApiServiceIntegrationTest {

    @Autowired
    private NetworksApiClient networksApiClient;

    @Test
    void should_listNetworksForPerson() {
        ResponseEntity<PersonNetworkPaging> listNetworksForPersonResponse = networksApiClient.listNetworksForPerson(PersonIds.CURRENT_USER, null, null, null);

        assertThat(listNetworksForPersonResponse.getBody().getList().getEntries()).isNotEmpty();
    }

    @Test
    void should_getNetwork() {
        ResponseEntity<PersonNetworkPaging> listNetworksForPersonResponse = networksApiClient.listNetworksForPerson(PersonIds.CURRENT_USER, null, null, null);
        ResponseEntity<PersonNetworkEntry> getNetworkResponse = networksApiClient
            .getNetwork(listNetworksForPersonResponse.getBody().getList().getEntries().get(0).getEntry().getId(), null);

        assertThat(getNetworkResponse.getBody().getEntry().getId()).isNotNull();
    }

    @Test
    void should_getNetworkForPerson() {
        ResponseEntity<PersonNetworkPaging> listNetworksForPersonResponse = networksApiClient.listNetworksForPerson(PersonIds.CURRENT_USER, null, null, null);
        ResponseEntity<PersonNetworkEntry> getNetworkForPersonResponse = networksApiClient
            .getNetworkForPerson(PersonIds.CURRENT_USER, listNetworksForPersonResponse.getBody().getList().getEntries().get(0).getEntry().getId(), null);

        assertThat(getNetworkForPersonResponse.getBody().getEntry().getId()).isNotNull();
    }
}
