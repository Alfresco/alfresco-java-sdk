/*
 * Copyright 2010-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
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
 * {@link EventFilter} that checks if an event represents a node with a specific property with a specific value.
 */
public class PropertyValueFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyValueFilter.class);

    private final String propertyName;
    private final Serializable propertyValue;

    private PropertyValueFilter(final String propertyName, final Serializable propertyValue) {
        this.propertyName = Objects.requireNonNull(propertyName);
        this.propertyValue = Objects.requireNonNull(propertyValue);
    }

    /**
     * Obtain a {@link PropertyValueFilter} for a specific property and value.
     *
     * @param propertyName  given name of the property
     * @param propertyValue given value for the property
     * @return created {@link PropertyValueFilter}
     */
    public static PropertyValueFilter of(final String propertyName, final Serializable propertyValue) {
        return new PropertyValueFilter(propertyName, propertyValue);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for property {}, value {} and event {}", propertyName, propertyValue, event);
        return isNodeEvent(event) && checkPropertyValue(event);
    }

    private boolean checkPropertyValue(final RepoEvent<DataAttributes<Resource>> event) {
        final Map<String, Serializable> properties = ((NodeResource) event.getData().getResource()).getProperties();
        return properties != null && properties.containsKey(propertyName) && propertyValue.equals(properties.get(propertyName));
    }
}
