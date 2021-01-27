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

import org.alfresco.repo.event.v1.model.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for {@link ContentChangedFilter}.
 */
public class ContentChangedFilterTest {

    private final ContentChangedFilter contentChangedFilter = ContentChangedFilter.get();

    @Test
    public void should_testTrue_when_contentChangedEventIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .build();
        final NodeResource nodeBeforeResource = NodeResource.builder()
                .setContent(new ContentInfo("test/test", 1l, "UTF-8"))
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .setResourceBefore(nodeBeforeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = contentChangedFilter.test((RepoEvent<DataAttributes<Resource>>)repoEvent);

        assertThat(result).isTrue();
    }

    @Test
    public void should_testFalse_when_eventWithoutContentIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .build();
        final NodeResource nodeBeforeResource = NodeResource.builder()
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .setResourceBefore(nodeBeforeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = contentChangedFilter.test((RepoEvent<DataAttributes<Resource>>)repoEvent);

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

        final boolean result = contentChangedFilter.test((RepoEvent<DataAttributes<Resource>>)repoEvent);

        assertThat(result).isFalse();
    }
}
