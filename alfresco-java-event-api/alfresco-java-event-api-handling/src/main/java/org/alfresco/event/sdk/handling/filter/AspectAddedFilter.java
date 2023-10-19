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
import java.util.Set;

import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.NodeResource;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link EventFilter} that checks if an event represents the addition of an aspect to a node in the repository.
 */
public class AspectAddedFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(AspectAddedFilter.class);

    private final String addedAspect;

    private AspectAddedFilter(final String addedAspect) {
        this.addedAspect = Objects.requireNonNull(addedAspect);
    }

    /**
     * Create a {@link AspectAddedFilter} for a specific aspect.
     *
     * @param addedAspect given aspect name to be accepted by the filter
     * @return created {@link AspectAddedFilter}
     */
    public static AspectAddedFilter of(final String addedAspect) {
        return new AspectAddedFilter(addedAspect);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for the addition of the aspect {} and event {}", addedAspect, event);
        return isNodeEvent(event) && checkAspectAdded(event);
    }

    private boolean checkAspectAdded(final RepoEvent<DataAttributes<Resource>> event) {
        return hasResourceBefore(event) && notHasAspectBefore(event) && hasAspectAfter(event, addedAspect);
    }

    private boolean notHasAspectBefore(final RepoEvent<DataAttributes<Resource>> event) {
        final Set<String> aspectNames = ((NodeResource) event.getData().getResourceBefore()).getAspectNames();
        return aspectNames != null && !aspectNames.contains(addedAspect);
    }
}
