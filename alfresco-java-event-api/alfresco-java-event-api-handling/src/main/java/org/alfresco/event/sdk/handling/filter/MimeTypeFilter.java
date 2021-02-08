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

import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * {@link EventFilter} that checks if an events makes reference to a content with a specific mime-type within a set of them.
 */
public class MimeTypeFilter extends AbstractEventFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(MimeTypeFilter.class);

    private final Set<String> acceptedMimeTypes;

    private MimeTypeFilter(final Set<String> acceptedMimeTypes) {
        this.acceptedMimeTypes = acceptedMimeTypes;
    }

    /**
     * Obtain a {@link MimeTypeFilter} for a specific mime-type.
     *
     * @param acceptedMimeTypes given list of mime-type's that must be accepted by the filter
     * @return created {@link MimeTypeFilter}
     */
    public static MimeTypeFilter of(final String... acceptedMimeTypes) {
        Objects.requireNonNull(acceptedMimeTypes);
        return new MimeTypeFilter(new HashSet<>(Arrays.asList(acceptedMimeTypes)));
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for MimeTypes {} and event {}", acceptedMimeTypes, event);
        return isContentEvent(event) && acceptedMimeTypes.contains(((NodeResource)event.getData().getResource()).getContent().getMimeType());
    }
}
