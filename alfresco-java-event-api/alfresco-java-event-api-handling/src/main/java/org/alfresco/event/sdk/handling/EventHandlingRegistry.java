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

package org.alfresco.event.sdk.handling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.alfresco.event.sdk.handling.handler.EventHandler;
import org.alfresco.event.sdk.model.v1.model.EventType;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Register for {@link EventHandler} instances. The event handlers are internally stored in a {@link Map} which key is an event type and its value a list of the
 * event handlers registered for that type.
 */
public class EventHandlingRegistry {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventHandlingRegistry.class);

    private final Map<String, List<EventHandler>> eventHandlers = new HashMap<>();

    /**
     * Constructor.
     *
     * @param eventHandlers given list of event handlers to add to the registry
     */
    public EventHandlingRegistry(final List<EventHandler> eventHandlers) {
        eventHandlers.forEach(this::registerHandler);
    }

    /**
     * Get the list of event handlers that correspond to a specific {@link RepoEvent}. The event type determines the list of handlers to provide.
     *
     * @param repoEvent given {@link RepoEvent} to get its handlers
     * @return the {@link List} of {@link EventHandler}s registered for the corresponding event type
     */
    public List<EventHandler> getEventHandlers(final RepoEvent repoEvent) {
        return eventHandlers.getOrDefault(repoEvent.getType(), Collections.emptyList());
    }

    private void registerHandler(final EventHandler eventHandler) {
        LOGGER.debug("Registering event handler {}", eventHandler);
        final EventType handledEventType = eventHandler.getHandledEventType();
        if (handledEventType != null) {
            final List<EventHandler> typedEventHandlers = eventHandlers.getOrDefault(handledEventType.getType(), new ArrayList<>());
            typedEventHandlers.add(eventHandler);
            eventHandlers.put(handledEventType.getType(), typedEventHandlers);
        } else {
            LOGGER.warn("Skipping registry of event handler {} because the event type handled is null", eventHandler);
        }
    }
}
