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
import org.alfresco.core.handler.GroupsApiClient;
import org.alfresco.core.model.GroupBodyCreate;
import org.alfresco.core.model.GroupEntry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import util.TestUtils;

/**
 * Integration tests for {@link GroupsApiClient}.
 */
@SpringBootTest
public class GroupsApiServiceIntegrationTests {

    @Autowired
    private GroupsApiClient groupsApiClient;

    @Test
    void should_createGroupAndGetGroup() {
        GroupBodyCreate groupBodyCreate = new GroupBodyCreate();
        groupBodyCreate.setId(TestUtils.getRandomGroupName());

        ResponseEntity<GroupEntry> createGroupResponse = groupsApiClient.createGroup(groupBodyCreate, null, null);
        ResponseEntity<GroupEntry> getGroupResponse = groupsApiClient.getGroup(createGroupResponse.getBody().getEntry().getId(), null, null);

        assertThat(createGroupResponse.getBody().getEntry().getId()).isEqualTo(getGroupResponse.getBody().getEntry().getId());
    }

    @Test
    void should_deleteGroup() {
        GroupBodyCreate groupBodyCreate = new GroupBodyCreate();
        groupBodyCreate.setId(TestUtils.getRandomGroupName());

        ResponseEntity<GroupEntry> createGroupResponse = groupsApiClient.createGroup(groupBodyCreate, null, null);
        groupsApiClient.deleteGroup(createGroupResponse.getBody().getEntry().getId(), null);

        Assertions.assertThrows(NotFound.class, () -> groupsApiClient.getGroup(createGroupResponse.getBody().getEntry().getId(), null, null));
    }
}
