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

import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.EventData;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.PeerAssociationResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.junit.Test;

/**
 * Unit tests for {@link NodeTypeFilter}.
 */
public class NodeTypeFilterTest {

    private static final String TEST_TYPE = "test:type";

    private final NodeTypeFilter nodeTypeFilter = NodeTypeFilter.of(TEST_TYPE);

    @Test
    public void should_testTrue_when_eventWithAcceptedTypeIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .setNodeType(TEST_TYPE)
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = nodeTypeFilter.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isTrue();
    }

    @Test
    public void should_testFalse_when_eventWithNoAcceptedTypeIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .setNodeType("test:other")
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = nodeTypeFilter.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isFalse();
    }

    @Test
    public void should_testFalse_when_eventWithoutTypeIsSent() {
        final NodeResource nodeResource = NodeResource.builder()
                .build();
        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setResource(nodeResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = nodeTypeFilter.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isFalse();
    }

    @Test
    public void should_testFalse_when_noNodeEventIsSent() {
        final PeerAssociationResource peerAssociationResource = new PeerAssociationResource("source-id", "target-id", "test:other");
        final EventData<PeerAssociationResource> eventData = EventData.<PeerAssociationResource>builder()
                .setResource(peerAssociationResource)
                .build();
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<PeerAssociationResource>>builder()
                .setData(eventData)
                .build();

        final boolean result = nodeTypeFilter.test((RepoEvent<DataAttributes<Resource>>) repoEvent);

        assertThat(result).isFalse();
    }
}
