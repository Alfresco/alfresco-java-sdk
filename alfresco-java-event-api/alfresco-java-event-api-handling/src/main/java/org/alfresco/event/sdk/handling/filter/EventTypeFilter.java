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
import org.alfresco.repo.event.v1.model.EventType;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * {@link EventFilter} that checks if an event is classified as a specific type.
 */
public class EventTypeFilter extends AbstractEventFilter {

    public static final EventFilter NODE_CREATED = EventTypeFilter.of(EventType.NODE_CREATED);
    public static final EventFilter NODE_UPDATED = EventTypeFilter.of(EventType.NODE_UPDATED);
    public static final EventFilter NODE_DELETED = EventTypeFilter.of(EventType.NODE_DELETED);
    public static final EventFilter NODE = NODE_CREATED.or(NODE_DELETED).or(NODE_UPDATED);
    public static final EventFilter CHILD_ASSOC_CREATED = EventTypeFilter.of(EventType.CHILD_ASSOC_CREATED);
    public static final EventFilter CHILD_ASSOC_DELETED = EventTypeFilter.of(EventType.CHILD_ASSOC_DELETED);
    public static final EventFilter CHILD_ASSOC = CHILD_ASSOC_CREATED.or(CHILD_ASSOC_DELETED);
    public static final EventFilter PEER_ASSOC_CREATED = EventTypeFilter.of(EventType.PEER_ASSOC_CREATED);
    public static final EventFilter PEER_ASSOC_DELETED = EventTypeFilter.of(EventType.PEER_ASSOC_DELETED);
    public static final EventFilter PEER_ASSOC = PEER_ASSOC_CREATED.or(PEER_ASSOC_DELETED);
    public static final EventFilter PERMISSION_UPDATED = EventTypeFilter.of(EventType.PERMISSION_UPDATED);

    private static final Logger LOGGER = LoggerFactory.getLogger(EventTypeFilter.class);

    private final String acceptedEventType;

    private EventTypeFilter(final String acceptedEventType) {
        this.acceptedEventType = Objects.requireNonNull(acceptedEventType);
    }

    /**
     * Create a {@link EventTypeFilter} for a specific event type.
     *
     * @param eventType given event type to be accepted by the filter
     * @return created {@link EventTypeFilter}
     */
    public static EventTypeFilter of(final EventType eventType) {
        return new EventTypeFilter(eventType.getType());
    }

    @Override
    public boolean test(final RepoEvent<DataAttributes<Resource>> event) {
        LOGGER.debug("Checking filter for type {} and event {}", acceptedEventType, event);
        return acceptedEventType.equals(event.getType());
    }
}
