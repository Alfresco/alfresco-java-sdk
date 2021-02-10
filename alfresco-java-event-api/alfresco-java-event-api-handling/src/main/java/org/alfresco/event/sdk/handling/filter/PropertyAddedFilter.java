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
 * {@link EventFilter} that checks if an event corresponds to the addition of a specific property to a node in the repository.
 */
public class PropertyAddedFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyAddedFilter.class);

    private final String addedProperty;

    private PropertyAddedFilter(final String addedProperty) {
        this.addedProperty = Objects.requireNonNull(addedProperty);
    }

    /**
     * Obtain a {@link PropertyAddedFilter} for a specific property.
     *
     * @param addedProperty given property name to be accepted by the filter
     * @return created {@link PropertyAddedFilter}
     */
    public static PropertyAddedFilter of(final String addedProperty) {
        return new PropertyAddedFilter(addedProperty);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for property {} added and event {}", addedProperty, event);
        return isNodeEvent(event) && checkPropertyAdded(event);
    }

    private boolean checkPropertyAdded(final RepoEvent<DataAttributes<Resource>> event) {
        return !hasPropertyBefore(event, addedProperty) && hasPropertyAfter(event, addedProperty);
    }
}
