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
package org.alfresco.event.sdk.handling.filter;

import org.alfresco.event.sdk.model.v1.model.*;
import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link AspectAddedFilter}.
 */
public class AspectAddedFilterTest {

    private static final String TEST_ASPECT = "test:aspect";

    private final AspectAddedFilter aspectAddedFilter = AspectAddedFilter.of(TEST_ASPECT);

    @Test
    public void should_testTrue_when_eventWithAspectAddedIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
            .setAspectNames(Set.of(TEST_ASPECT, "test:other"))
            .build();
        final NodeResource nodeResourceBefore = NodeResource.builder()
            .setAspectNames(Set.of("test:other"))
            .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
            .setResource(nodeResource)
            .setResourceBefore(nodeResourceBefore)
            .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
            .setData(eventData)
            .build();

        final boolean result = aspectAddedFilter.test((RepoEvent<DataAttributes<Resource>>)repoEvent);

        assertThat(result).isTrue();
    }

    @Test
    public void should_testFalse_when_eventWithoutAspectAddedIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
            .setAspectNames(Set.of("test:other", "test:another"))
            .build();
        final NodeResource nodeResourceBefore = NodeResource.builder()
            .setAspectNames(Set.of("test:other"))
            .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
            .setResource(nodeResource)
            .setResourceBefore(nodeResourceBefore)
            .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
            .setData(eventData)
            .build();

        final boolean result = aspectAddedFilter.test((RepoEvent<DataAttributes<Resource>>)repoEvent);

        assertThat(result).isFalse();
    }

    @Test
    public void should_testFalse_when_eventWithAspectAlreadyAddedIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
            .setAspectNames(Set.of(TEST_ASPECT, "test:other"))
            .build();
        final NodeResource nodeResourceBefore = NodeResource.builder()
            .setAspectNames(Set.of(TEST_ASPECT, "test:other"))
            .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
            .setResource(nodeResource)
            .setResourceBefore(nodeResourceBefore)
            .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
            .setData(eventData)
            .build();

        final boolean result = aspectAddedFilter.test((RepoEvent<DataAttributes<Resource>>)repoEvent);

        assertThat(result).isFalse();
    }

    @Test
    public void should_testFalse_when_eventWithoutAspectsIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
            .build();
        final NodeResource nodeResourceBefore = NodeResource.builder()
            .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
            .setResource(nodeResource)
            .setResourceBefore(nodeResourceBefore)
            .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
            .setData(eventData)
            .build();

        final boolean result = aspectAddedFilter.test((RepoEvent<DataAttributes<Resource>>)repoEvent);

        assertThat(result).isFalse();
    }
}
