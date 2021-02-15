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
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link EventFilter} that checks if an event is related to a node with an specific aspect.
 */
public class NodeAspectFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(NodeAspectFilter.class);

    private final String acceptedAspect;

    private NodeAspectFilter(final String acceptedAspect) {
        this.acceptedAspect = Objects.requireNonNull(acceptedAspect);
    }

    /**
     * Create a {@link NodeAspectFilter} for a specific aspect.
     *
     * @param acceptedAspect given aspect name to be accepted by the filter
     * @return created {@link NodeAspectFilter}
     */
    public static NodeAspectFilter of(final String acceptedAspect) {
        return new NodeAspectFilter(acceptedAspect);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for aspect {} and event {}", acceptedAspect, event);
        return isNodeEvent(event) && hasAspectAfter(event, acceptedAspect);
    }
}
