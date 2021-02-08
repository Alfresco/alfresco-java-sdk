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
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.junit.Test;

/**
 * Unit tests for {@link IsFileFilter}.
 */
public class IsFileFilterTest {

    private final IsFileFilter isFileFilter = IsFileFilter.get();

    @Test
    public void should_testTrue_when_fileEventIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .setIsFile(true)
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = isFileFilter.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isTrue();
    }

    @Test
    public void should_testTrue_when_notFileEventIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .setIsFile(false)
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = isFileFilter.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isFalse();
    }
}
