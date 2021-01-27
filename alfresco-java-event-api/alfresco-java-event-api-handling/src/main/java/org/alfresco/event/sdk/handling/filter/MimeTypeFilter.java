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

import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.NodeResource;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * {@link EventFilter} that checks if an events makes reference to a content with a specific mime-type.
 */
public class MimeTypeFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(MimeTypeFilter.class);

    private final String acceptedMimeType;

    private MimeTypeFilter(final String acceptedMimeType) {
        this.acceptedMimeType = Objects.requireNonNull(acceptedMimeType);
    }

    /**
     * Obtain a {@link MimeTypeFilter} for a specific mime-type.
     *
     * @param acceptedMimeType given mime-type that must be accepted by the filter
     * @return created {@link MimeTypeFilter}
     */
    public static MimeTypeFilter of(final String acceptedMimeType) {
        return new MimeTypeFilter(acceptedMimeType);
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for MimeType {} and event {}", acceptedMimeType, event);
        return isContentEvent(event) && acceptedMimeType.equals(((NodeResource)event.getData().getResource()).getContent().getMimeType());
    }
}
