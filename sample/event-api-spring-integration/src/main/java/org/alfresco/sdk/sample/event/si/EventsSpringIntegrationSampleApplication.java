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
import org.springframework.integration.dsl.IntegrationFlows;

@SpringBootApplication
public class EventsSpringIntegrationSampleApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventsSpringIntegrationSampleApplication.class);

    public static void main(final String[] args) {
        SpringApplication.run(EventsSpringIntegrationSampleApplication.class, args);
    }

    @Bean
    public IntegrationFlow logTheCreationOfNodesOfTypeContent() {
        // @formatter:off
        return IntegrationFlows.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(EventTypeFilter.NODE_CREATED
                                                    .and(NodeTypeFilter.of("cm:content"))))
                .handle(t -> LOGGER.info("A new node of type cm:content has been created! - Event: {}", t.getPayload().toString()))
                .get();
        // @formatter:on
    }

    @Bean
    public IntegrationFlow logTheDeletionOfFolders() {
        // @formatter:off
        return IntegrationFlows.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(EventTypeFilter.NODE_DELETED
                                                    .and(IsFolderFilter.get())))
                .handle(t -> LOGGER.info("A folder has been deleted! - Event: {}", t.getPayload().toString()))
                .get();
        // @formatter:on
    }

    @Bean
    public IntegrationFlow logTheCreationOfHTMLContent() {
        // @formatter:off
        return IntegrationFlows.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(EventTypeFilter.NODE_CREATED
                                                    .and(MimeTypeFilter.of("text/html"))))
                .handle(t -> LOGGER.info("An HTML content has been created! - Event: {}", t.getPayload().toString()))
                .get();
        // @formatter:on
    }

    @Bean
    public IntegrationFlow logTheUpdateOfContent() {
        // @formatter:off
        return IntegrationFlows.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(ContentChangedFilter.get()))
                .handle(t -> LOGGER.info("A content has been updated! - Event: {}", t.getPayload().toString()))
                .get();
        // @formatter:on
    }

    @Bean
    public IntegrationFlow logTheModificationOfTitle() {
        // @formatter:off
        return IntegrationFlows.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(PropertyChangedFilter.of("cm:title")))
                .handle(t -> LOGGER.info("The title of a node has changed! - Event: {}", t.getPayload().toString()))
                .get();
        // @formatter:on
    }

    @Bean
    public IntegrationFlow logTheMovementOfANode() {
        // @formatter:off
        return IntegrationFlows.from(EventChannels.MAIN)
                .filter(IntegrationEventFilter.of(NodeMovedFilter.get()))
                .handle(t -> LOGGER.info("A node has been moved in the repository! - Event: {}", t.getPayload().toString()))
                .get();
        // @formatter:on
    }
}
