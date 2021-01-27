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

import org.alfresco.repo.event.v1.model.*;

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
        return isNodeEvent(event) && ((NodeResource)event.getData().getResource()).getContent() != null;
    }

    protected boolean isAssocEvent(final RepoEvent<DataAttributes<Resource>> event) {
        return isEventWellFormed(event) && event.getData().getResource() instanceof AbstractAssociationResource;
    }

    protected boolean hasResourceBefore(final RepoEvent<DataAttributes<Resource>> event) {
        return isEventWellFormed(event) && event.getData().getResourceBefore() != null;
    }
}
