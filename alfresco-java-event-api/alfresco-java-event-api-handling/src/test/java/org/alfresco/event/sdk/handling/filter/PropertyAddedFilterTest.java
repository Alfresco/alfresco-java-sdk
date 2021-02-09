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

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;
import java.util.Map;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.EventData;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.junit.Test;

/**
 * Unit tests for {@link PropertyAddedFilter}.
 */
public class PropertyAddedFilterTest {

    private static final String TEST_PROPERTY = "test:prop";
    private static final String TEST_VALUE = "value";

    private final PropertyAddedFilter propertyAddedFilter = PropertyAddedFilter.of(TEST_PROPERTY);

    @Test
    public void should_testTrue_when_propertyAddedEventIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .setProperties(Map.of(TEST_PROPERTY, TEST_VALUE))
                .build();
        final NodeResource nodeBeforeResource = NodeResource.builder()
                .setProperties(Collections.EMPTY_MAP)
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .setResourceBefore(nodeBeforeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = propertyAddedFilter.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isTrue();
    }

    @Test
    public void should_testFalse_when_eventWithoutPropertyAddedIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .setProperties(Map.of(TEST_PROPERTY, TEST_VALUE))
                .build();
        final NodeResource nodeBeforeResource = NodeResource.builder()
                .setProperties(Map.of(TEST_PROPERTY, TEST_VALUE))
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .setResourceBefore(nodeBeforeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = propertyAddedFilter.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isFalse();
    }

    @Test
    public void should_testFalse_when_eventWithoutResourceBeforeIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = propertyAddedFilter.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isFalse();
    }
}
