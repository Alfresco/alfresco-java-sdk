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

import java.util.Objects;

import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.NodeResource;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link EventFilter} that checks if an event is related to a node with an specific type.
 */
public class NodeTypeFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(NodeTypeFilter.class);

    private final String acceptedNodeType;

    private NodeTypeFilter(final String acceptedNodeType) {
        this.acceptedNodeType = Objects.requireNonNull(acceptedNodeType);
    }

    /**
     * Obtain a {@link NodeTypeFilter} for a specific type.
     *
     * @param acceptedNodeType given type name to be accepted by the filter.
     * @return created {@link NodeTypeFilter}
     */
    public static NodeTypeFilter of(final String acceptedNodeType) {
        return new NodeTypeFilter(acceptedNodeType);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for node type {} and event {}", acceptedNodeType, event);
        return isNodeEvent(event) && acceptedNodeType.equals(((NodeResource) event.getData().getResource()).getNodeType());
    }
}
