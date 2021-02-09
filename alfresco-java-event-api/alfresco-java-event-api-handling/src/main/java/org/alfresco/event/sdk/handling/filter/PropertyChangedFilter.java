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

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link EventFilter} that checks if an event corresponds to the modification of a specific property of a node in the repository.
 */
public class PropertyChangedFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyChangedFilter.class);

    private final String changedProperty;

    private PropertyChangedFilter(final String addedProperty) {
        this.changedProperty = Objects.requireNonNull(addedProperty);
    }

    /**
     * Obtain a {@link PropertyChangedFilter} for a specific property.
     *
     * @param addedProperty given property name to be accepted by the filter
     * @return created {@link PropertyChangedFilter}
     */
    public static PropertyChangedFilter of(final String addedProperty) {
        return new PropertyChangedFilter(addedProperty);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for property {} added and event {}", changedProperty, event);
        return isNodeEvent(event) && hasResourceBefore(event) && checkPropertyAdded(event);
    }

    private boolean checkPropertyAdded(final RepoEvent<DataAttributes<Resource>> event) {
        final Map<String, Serializable> propertiesBefore = ((NodeResource) event.getData().getResourceBefore()).getProperties();
        final Map<String, Serializable> propertiesAfter = ((NodeResource) event.getData().getResource()).getProperties();
        return propertiesBefore != null && propertiesAfter != null && checkProperty(propertiesBefore, propertiesAfter);
    }

    private boolean checkProperty(final Map<String, Serializable> propertiesBefore, final Map<String, Serializable> propertiesAfter) {
        return propertiesAfter.containsKey(changedProperty) && propertiesBefore.containsKey(changedProperty) &&
                !propertiesBefore.get(changedProperty).equals(propertiesAfter.get(changedProperty));
    }
}
