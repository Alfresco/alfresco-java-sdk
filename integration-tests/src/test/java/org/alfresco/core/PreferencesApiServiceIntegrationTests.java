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

import org.alfresco.core.handler.PreferencesApiClient;
import org.alfresco.core.model.PreferencePaging;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import util.Constants.PersonIds;

/**
 * Integration tests for {@link PreferencesApiClient}.
 */
@SpringBootTest
public class PreferencesApiServiceIntegrationTests {

    @Autowired
    private PreferencesApiClient preferencesApiClient;

    @Test
    void should_listPreferences() {
        ResponseEntity<PreferencePaging> listPreferencesResponse = preferencesApiClient.listPreferences(PersonIds.CURRENT_USER, null, null, null);

        assertThat(listPreferencesResponse.getBody().getList()).isNotNull();
    }
}
