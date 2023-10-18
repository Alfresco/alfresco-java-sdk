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
package org.alfresco.sdk.sample.event.handler;

import org.alfresco.event.sdk.handling.filter.EventFilter;
import org.alfresco.event.sdk.handling.filter.NodeMovedFilter;
import org.alfresco.event.sdk.handling.handler.OnNodeUpdatedEventHandler;
import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.NodeResource;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Sample event handler to demonstrate reacting to the movement of a node in the repository.
 */
@Component
public class NodeMovedHandler implements OnNodeUpdatedEventHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(NodeMovedHandler.class);
    private static final String COMMA = ",";

    @Override
    public void handleEvent(final RepoEvent<DataAttributes<Resource>> repoEvent) {
        final NodeResource nodeResource = (NodeResource) repoEvent.getData().getResource();
        final NodeResource beforeNodeResource = (NodeResource) repoEvent.getData().getResourceBefore();
        final String name = nodeResource.getName();
        final String currentPrimaryHierarchy = String.join(COMMA, nodeResource.getPrimaryHierarchy());
        final String previousPrimaryHierarchy = String.join(COMMA, beforeNodeResource.getPrimaryHierarchy());

        LOGGER.info("The node {} has been moved from the hierarchy path [{}] to the new hierarchy path [{}] in the repository!", name, previousPrimaryHierarchy,
                currentPrimaryHierarchy);
    }

    @Override
    public EventFilter getEventFilter() {
        return NodeMovedFilter.get();
    }
}
