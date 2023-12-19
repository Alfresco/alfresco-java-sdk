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
package org.alfresco.sdk.sample.event.si;

import org.alfresco.event.sdk.handling.filter.ContentChangedFilter;
import org.alfresco.event.sdk.handling.filter.EventTypeFilter;
import org.alfresco.event.sdk.handling.filter.IsFolderFilter;
import org.alfresco.event.sdk.handling.filter.MimeTypeFilter;
import org.alfresco.event.sdk.handling.filter.NodeMovedFilter;
import org.alfresco.event.sdk.handling.filter.NodeTypeFilter;
import org.alfresco.event.sdk.handling.filter.PropertyChangedFilter;
import org.alfresco.event.sdk.integration.EventChannels;
import org.alfresco.event.sdk.integration.filter.IntegrationEventFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.IntegrationFlow;

@SpringBootApplication
public class EventsSpringIntegrationSampleApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventsSpringIntegrationSampleApplication.class);

    public static void main(final String[] args) {
        SpringApplication.run(EventsSpringIntegrationSampleApplication.class, args);
    }

    @Bean
    public IntegrationFlow logTheCreationOfNodesOfTypeContent() {
        return IntegrationFlow.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(EventTypeFilter.NODE_CREATED
                                                    .and(NodeTypeFilter.of("cm:content"))))
                .handle(t -> LOGGER.info("A new node of type cm:content has been created! - Event: {}", t.getPayload().toString()))
                .get();
    }

    @Bean
    public IntegrationFlow logTheDeletionOfFolders() {
        return IntegrationFlow.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(EventTypeFilter.NODE_DELETED
                                                    .and(IsFolderFilter.get())))
                .handle(t -> LOGGER.info("A folder has been deleted! - Event: {}", t.getPayload().toString()))
                .get();
    }

    @Bean
    public IntegrationFlow logTheCreationOfHTMLContent() {
        return IntegrationFlow.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(EventTypeFilter.NODE_CREATED
                                                    .and(MimeTypeFilter.of("text/html"))))
                .handle(t -> LOGGER.info("An HTML content has been created! - Event: {}", t.getPayload().toString()))
                .get();
    }

    @Bean
    public IntegrationFlow logTheUpdateOfContent() {
        return IntegrationFlow.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(ContentChangedFilter.get()))
                .handle(t -> LOGGER.info("A content has been updated! - Event: {}", t.getPayload().toString()))
                .get();
    }

    @Bean
    public IntegrationFlow logTheModificationOfTitle() {
        return IntegrationFlow.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(PropertyChangedFilter.of("cm:title")))
                .handle(t -> LOGGER.info("The title of a node has changed! - Event: {}", t.getPayload().toString()))
                .get();
    }

    @Bean
    public IntegrationFlow logTheMovementOfANode() {
        return IntegrationFlow.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(NodeMovedFilter.get()))
                .handle(t -> LOGGER.info("A node has been moved in the repository! - Event: {}", t.getPayload().toString()))
                .get();
    }
}
