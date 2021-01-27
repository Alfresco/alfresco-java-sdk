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

package org.alfresco.event.sdk.handling;

import org.alfresco.event.sdk.handling.handler.OnNodeCreatedEventHandler;
import org.alfresco.event.sdk.handling.handler.OnPermissionUpdatedEventHandler;
import org.alfresco.repo.event.v1.model.EventData;
import org.alfresco.repo.event.v1.model.EventType;
import org.alfresco.repo.event.v1.model.NodeResource;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link EventHandlingRegistry}.
 */
public class EventHandlingRegistryTest {

    private final OnNodeCreatedEventHandler onNodeCreatedEventHandler = event -> event.getData();
    private final OnPermissionUpdatedEventHandler onPermissionUpdatedEventHandler = event -> event.getData();

    private EventHandlingRegistry eventHandlingRegistry;

    @Before
    public void setup() {
        eventHandlingRegistry = new EventHandlingRegistry(List.of(onNodeCreatedEventHandler, onPermissionUpdatedEventHandler));
    }

    @Test
    public void should_registerEventHandlers_when_created() {
        final EventHandlingRegistry newRegistry = new EventHandlingRegistry(List.of(onNodeCreatedEventHandler));
        final RepoEvent<EventData<NodeResource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.NODE_CREATED.getType())
                .build();

        assertThat(newRegistry.getEventHandlers(repoEvent)).containsOnly(onNodeCreatedEventHandler);
    }

    @Test
    public void should_returnEventHandlersList_when_requestedExistingEventHandlers() {
        final RepoEvent<EventData<NodeResource>> nodeRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.NODE_CREATED.getType())
                .build();
        final RepoEvent<EventData<NodeResource>> permissionRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.PERMISSION_UPDATED.getType())
                .build();

        assertThat(eventHandlingRegistry.getEventHandlers(nodeRepoEvent)).containsOnly(onNodeCreatedEventHandler);
        assertThat(eventHandlingRegistry.getEventHandlers(permissionRepoEvent)).containsOnly(onPermissionUpdatedEventHandler);
    }

    @Test
    public void should_returnEmptyList_when_requestedNonExistingEventHandlers() {
        final RepoEvent<EventData<NodeResource>> nodeRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.NODE_DELETED.getType())
                .build();
        final RepoEvent<EventData<NodeResource>> childAssocRepoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setType(EventType.CHILD_ASSOC_CREATED.getType())
                .build();

        assertThat(eventHandlingRegistry.getEventHandlers(nodeRepoEvent)).isEmpty();
        assertThat(eventHandlingRegistry.getEventHandlers(childAssocRepoEvent)).isEmpty();
    }
}
