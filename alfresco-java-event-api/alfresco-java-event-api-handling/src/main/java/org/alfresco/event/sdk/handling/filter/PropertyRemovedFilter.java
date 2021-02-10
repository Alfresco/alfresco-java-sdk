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
 * {@link EventFilter} that checks if an event corresponds to the removal of a specific property to a node in the repository.
 */
public class PropertyRemovedFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyRemovedFilter.class);

    private final String removedProperty;

    private PropertyRemovedFilter(final String removedProperty) {
        this.removedProperty = Objects.requireNonNull(removedProperty);
    }

    /**
     * Obtain a {@link PropertyRemovedFilter} for a specific property.
     *
     * @param removedProperty given property name to be accepted by the filter
     * @return created {@link PropertyRemovedFilter}
     */
    public static PropertyRemovedFilter of(final String removedProperty) {
        return new PropertyRemovedFilter(removedProperty);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for property {} removed and event {}", removedProperty, event);
        return isNodeEvent(event) && checkPropertyRemoved(event);
    }

    private boolean checkPropertyRemoved(final RepoEvent<DataAttributes<Resource>> event) {
        return hasPropertyBefore(event, removedProperty) && !hasPropertyAfter(event, removedProperty);
    }
}
