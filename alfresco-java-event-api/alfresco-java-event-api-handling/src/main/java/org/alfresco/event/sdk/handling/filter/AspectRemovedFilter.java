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
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link EventFilter} that checks if an event represents the removal of an aspect from a node in the repository.
 */
public class AspectRemovedFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AspectRemovedFilter.class);

    private final String removedAspect;

    private AspectRemovedFilter(final String removedAspect) {
        this.removedAspect = Objects.requireNonNull(removedAspect);
    }

    /**
     * Create a {@link AspectRemovedFilter} for a specific aspect.
     *
     * @param removedAspect given aspect name to be accepted by the filter
     * @return created {@link AspectRemovedFilter}
     */
    public static AspectRemovedFilter of(final String removedAspect) {
        return new AspectRemovedFilter(removedAspect);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for the removal of the aspect {} and event {}", removedAspect, event);
        return isNodeEvent(event) && checkAspectRemoved(event);
    }

    private boolean checkAspectRemoved(final RepoEvent<DataAttributes<Resource>> event) {
        return hasAspectBefore(event, removedAspect) && !hasAspectAfter(event, removedAspect);
    }
}
