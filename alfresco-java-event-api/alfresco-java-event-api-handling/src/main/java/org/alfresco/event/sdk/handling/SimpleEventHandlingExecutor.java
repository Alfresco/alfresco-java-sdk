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
package org.alfresco.event.sdk.handling;

import java.util.Objects;
import org.alfresco.event.sdk.handling.handler.EventHandler;
import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple implementation of {@link EventHandlingExecutor} that uses {@link EventHandlingRegistry} to get the {@link java.util.List} of {@link EventHandler}s to
 * execute based on the event type and after that executes the handling method for each of them whenever the {@link
 * org.alfresco.event.sdk.handling.filter.EventFilter} condition is fulfilled by the event.
 */
public class SimpleEventHandlingExecutor implements EventHandlingExecutor {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleEventHandlingExecutor.class);

    private final EventHandlingRegistry eventHandlingRegistry;

    /**
     * Constructor.
     *
     * @param eventHandlingRegistry given {@link EventHandlingRegistry}
     */
    public SimpleEventHandlingExecutor(final EventHandlingRegistry eventHandlingRegistry) {
        this.eventHandlingRegistry = Objects.requireNonNull(eventHandlingRegistry);
    }

    @Override
    public void executeEventHandlers(final RepoEvent<DataAttributes<Resource>> repoEvent) {
        LOGGER.debug("Executing event handlers for the event {}", repoEvent);
        eventHandlingRegistry.getEventHandlers(repoEvent)
                .forEach(eventHandler -> executeEventHandler(eventHandler, repoEvent));
    }

    private void executeEventHandler(final EventHandler eventHandler, final RepoEvent<DataAttributes<Resource>> repoEvent) {
        if (eventHandler.getEventFilter().test(repoEvent)) {
            LOGGER.debug("Executing event handler {} for the event {}", eventHandler, repoEvent);
            eventHandler.handleEvent(repoEvent);
        } else {
            LOGGER.debug("Skipping event handler {} because the event doesn't meet the filter", eventHandler);
        }
    }
}
