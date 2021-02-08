/*
 * Copyright 2010-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.alfresco.event.sdk.handling.filter;

import static org.assertj.core.api.Assertions.assertThat;

import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.EventData;
import org.alfresco.event.sdk.model.v1.model.EventType;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.junit.Test;

/**
 * Unit tests for {@link EventTypeFilter}.
 */
public class EventTypeFilterTest {

    @Test
    public void should_testTrue_when_eventWithAcceptedEventTypeIsSent() {
        final RepoEvent<? extends DataAttributes<? extends Resource>> nodeCreatedRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.NODE_CREATED.getType())
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> nodeUpdatedRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.NODE_UPDATED.getType())
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> nodeDeletedRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.NODE_DELETED.getType())
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> childAssocCreatedRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.CHILD_ASSOC_CREATED.getType())
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> peerAssocDeletedRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.PEER_ASSOC_DELETED.getType())
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> permissionUpdatedRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.PERMISSION_UPDATED.getType())
                .build();

        final boolean nodeCreatedRepoEventResult = EventTypeFilter.NODE.test((RepoEvent<DataAttributes<Resource>>) nodeCreatedRepoEvent);
        final boolean nodeUpdatedRepoEventResult = EventTypeFilter.NODE_UPDATED.test((RepoEvent<DataAttributes<Resource>>) nodeUpdatedRepoEvent);
        final boolean nodeDeletedRepoEventResult = EventTypeFilter.NODE_DELETED.test((RepoEvent<DataAttributes<Resource>>) nodeDeletedRepoEvent);
        final boolean childAssocCreatedRepoEventResult = EventTypeFilter.CHILD_ASSOC.test((RepoEvent<DataAttributes<Resource>>) childAssocCreatedRepoEvent);
        final boolean peerAssocDeletedRepoEventResult = EventTypeFilter.PEER_ASSOC_DELETED
                .test((RepoEvent<DataAttributes<Resource>>) peerAssocDeletedRepoEvent);
        final boolean permissionUpdatedRepoEventResult = EventTypeFilter.PERMISSION_UPDATED
                .test((RepoEvent<DataAttributes<Resource>>) permissionUpdatedRepoEvent);

        assertThat(nodeCreatedRepoEventResult).isTrue();
        assertThat(nodeUpdatedRepoEventResult).isTrue();
        assertThat(nodeDeletedRepoEventResult).isTrue();
        assertThat(childAssocCreatedRepoEventResult).isTrue();
        assertThat(peerAssocDeletedRepoEventResult).isTrue();
        assertThat(permissionUpdatedRepoEventResult).isTrue();
    }

    @Test
    public void should_testFalse_when_eventWithoutAcceptedEventTypeIsSent() {
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.NODE_CREATED.getType())
                .build();

        final boolean result = EventTypeFilter.PERMISSION_UPDATED.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isFalse();
    }

    @Test
    public void should_testFalse_when_eventWithoutEventTypeIsSent() {
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .build();

        final boolean result = EventTypeFilter.NODE.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isFalse();
    }
}
