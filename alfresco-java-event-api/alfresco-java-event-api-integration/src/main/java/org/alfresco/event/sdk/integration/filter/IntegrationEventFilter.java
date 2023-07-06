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
package org.alfresco.event.sdk.integration.filter;

import java.util.Objects;
import org.alfresco.event.sdk.handling.filter.EventFilter;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

/**
 * {@link MessageSelector} implementation that is simply a wrapper of a {@link EventFilter}. This way any {@link EventFilter} can be used in a Spring
 * Integration context.
 */
public class IntegrationEventFilter implements MessageSelector {

    private static final Logger LOGGER = LoggerFactory.getLogger(IntegrationEventFilter.class);

    private final EventFilter eventFilter;

    private IntegrationEventFilter(final EventFilter eventFilter) {
        this.eventFilter = Objects.requireNonNull(eventFilter);
    }

    /**
     * Obtain a {@link IntegrationEventFilter} that filters following the conditions of a {@link EventFilter}.
     *
     * @param eventFilter given {@link EventFilter} to be applied
     * @return created {@link IntegrationEventFilter}
     */
    public static IntegrationEventFilter of(final EventFilter eventFilter) {
        return new IntegrationEventFilter(eventFilter);
    }

    @Override
    public boolean accept(final Message<?> source) {
        LOGGER.debug("Checking event filter {} for message {}", eventFilter, source);
        return eventFilter.test((RepoEvent<DataAttributes<Resource>>) source.getPayload());
    }
}
