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
package org.alfresco.event.sdk.handling.handler;

import org.alfresco.event.sdk.handling.filter.EventFilter;
import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.EventType;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;

import java.util.Set;

/**
 * Interface that declares the operations of a repo event handler.
 * <p>
 * An event handler will be triggered (the method <code>handleEvent</code> will be executed) when:
 * <ul>
 *     <li>The event type matches with the one of the returned by the method <code>getHandledEventTypes</code></li>
 *     <li>The event fulfills the conditions specified by the {@link EventFilter} returned by the method <code>getEventFilter</code></li>
 * </ul>
 * <p>
 * This class provides a default implementation for the method <code>getEventFilter</code> that provides an always-true filter. This means that, by default,
 * all events that match the event type will be handled by an event handler.
 */
public interface EventHandler {

    /**
     * Obtain the set of {@link EventType}'s that this handler will handle.
     *
     * @return the set of {@link EventType}'s handled by this handler. Ths value must not be <code>null</code>
     */
    Set<EventType> getHandledEventTypes();

    /**
     * Obtain the {@link EventFilter} that any event must fulfill to be handled by this handler.
     *
     * @return the {@link EventFilter} to be fulfilled. This value must nor be <code>null</code>
     */
    default EventFilter getEventFilter() {
        return event -> true;
    }

    /**
     * Handle a {@link RepoEvent} that must be treated by this handler.
     *
     * @param event the corresponding {@link org.alfresco.repo.event.v1.model.RepoEvent} to be handled
     */
    void handleEvent(RepoEvent<DataAttributes<Resource>> event);
}
