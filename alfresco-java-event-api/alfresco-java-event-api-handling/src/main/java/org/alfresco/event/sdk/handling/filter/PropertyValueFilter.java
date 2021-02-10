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
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;

/**
 * Abstract {@link EventFilter} class that has the common functionality that checks if an event represents a node with a specific property with a specific
 * value.
 */
public abstract class PropertyValueFilter extends AbstractEventFilter {

    protected String propertyName;
    protected Serializable propertyValue;

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        return isNodeEvent(event) && checkPropertyValue(event);
    }

    protected abstract boolean checkPropertyValue(final RepoEvent<DataAttributes<Resource>> event);
}
