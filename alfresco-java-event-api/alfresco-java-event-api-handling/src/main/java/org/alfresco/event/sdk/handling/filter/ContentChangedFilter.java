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

import org.alfresco.event.sdk.model.v1.model.ContentInfo;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link EventFilter} that checks if an event represents a change in the content of a node in the repository.
 */
public class ContentChangedFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContentChangedFilter.class);

    private ContentChangedFilter() {
    }

    /**
     * Obtain a {@link ContentChangedFilter}.
     *
     * @return created {@link ContentChangedFilter}
     */
    public static ContentChangedFilter get() {
        return new ContentChangedFilter();
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking if event {} reflects a content changed", event);
        return isNodeEvent(event) && checkContentChanged(event);
    }

    private boolean checkContentChanged(final RepoEvent<DataAttributes<Resource>> event) {
        return hasResourceBefore(event) && checkContent(event);
    }

    private boolean checkContent(final RepoEvent<DataAttributes<Resource>> event) {
        final NodeResource nodeResourceBefore = (NodeResource) event.getData().getResourceBefore();
        final ContentInfo contentInfo = nodeResourceBefore.getContent();
        return contentInfo != null && (contentInfo.getEncoding() != null || contentInfo.getMimeType() != null || contentInfo.getSizeInBytes() != null);
    }
}
