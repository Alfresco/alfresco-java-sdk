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
import java.util.Set;
import org.alfresco.event.sdk.model.v1.model.AbstractAssociationResource;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;

/**
 * Abstract {@link EventFilter} that provides common functionality for all events (i.e. common checks about events).
 */
public abstract class AbstractEventFilter implements EventFilter {

    protected boolean isEventWellFormed(final RepoEvent<DataAttributes<Resource>> event) {
        return event != null && event.getData() != null && event.getData().getResource() != null;
    }

    protected boolean isNodeEvent(final RepoEvent<DataAttributes<Resource>> event) {
        return isEventWellFormed(event) && event.getData().getResource() instanceof NodeResource;
    }

    protected boolean isContentEvent(final RepoEvent<DataAttributes<Resource>> event) {
        return isNodeEvent(event) && ((NodeResource) event.getData().getResource()).getContent() != null;
    }

    protected boolean isAssocEvent(final RepoEvent<DataAttributes<Resource>> event) {
        return isEventWellFormed(event) && event.getData().getResource() instanceof AbstractAssociationResource;
    }

    protected boolean hasResourceBefore(final RepoEvent<DataAttributes<Resource>> event) {
        return isEventWellFormed(event) && event.getData().getResourceBefore() != null;
    }

    protected boolean hasAspectBefore(final RepoEvent<DataAttributes<Resource>> event, final String aspect) {
        return hasResourceBefore(event) && hasAspect(event, aspect, true);
    }

    protected boolean hasAspectAfter(final RepoEvent<DataAttributes<Resource>> event, final String aspect) {
        return hasAspect(event, aspect, false);
    }

    private boolean hasAspect(final RepoEvent<DataAttributes<Resource>> event, final String aspect, final boolean before) {
        final Set<String> aspects = getNodeResource(event, before).getAspectNames();
        return aspects != null && aspects.contains(aspect);
    }

    protected boolean hasPropertyBefore(final RepoEvent<DataAttributes<Resource>> event, final String property) {
        return hasResourceBefore(event) && hasProperty(event, property, true);
    }

    protected boolean hasPropertyAfter(final RepoEvent<DataAttributes<Resource>> event, final String property) {
        return hasProperty(event, property, false);
    }

    private boolean hasProperty(final RepoEvent<DataAttributes<Resource>> event, final String property, final boolean before) {
        final Map<String, Serializable> properties = getNodeResource(event, before).getProperties();
        return properties != null && properties.containsKey(property) && properties.get(property) != null;
    }

    private NodeResource getNodeResource(final RepoEvent<DataAttributes<Resource>> event, final boolean before) {
        return before ? ((NodeResource) event.getData().getResourceBefore()) : ((NodeResource) event.getData().getResource());
    }
}
