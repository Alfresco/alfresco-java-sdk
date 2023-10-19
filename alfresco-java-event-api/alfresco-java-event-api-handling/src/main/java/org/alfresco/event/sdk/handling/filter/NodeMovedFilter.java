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

import java.util.List;

import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.NodeResource;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link EventFilter} that checks if an event represents the movement of a node in the hierarchy in the repository.
 */
public class NodeMovedFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(NodeMovedFilter.class);

    private NodeMovedFilter() {
    }

    /**
     * Obtain a {@link NodeMovedFilter}.
     *
     * @return created {@link NodeMovedFilter}
     */
    public static NodeMovedFilter get() {
        return new NodeMovedFilter();
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking if event {} reflects a node moved", event);
        return isNodeEvent(event) && checkNodeMoved(event);
    }

    private boolean checkNodeMoved(final RepoEvent<DataAttributes<Resource>> event) {
        return hasResourceBefore(event) && checkPrimaryHierarchy(event);
    }

    private boolean checkPrimaryHierarchy(final RepoEvent<DataAttributes<Resource>> event) {
        final NodeResource nodeResourceBefore = (NodeResource) event.getData().getResourceBefore();
        final List<String> primaryHierarchy = nodeResourceBefore.getPrimaryHierarchy();
        return primaryHierarchy != null && !primaryHierarchy.isEmpty();
    }
}
