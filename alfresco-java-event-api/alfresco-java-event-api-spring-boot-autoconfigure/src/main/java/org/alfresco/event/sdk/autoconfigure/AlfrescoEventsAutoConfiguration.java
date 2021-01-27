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

package org.alfresco.event.sdk.autoconfigure;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import javax.jms.Topic;
import org.alfresco.enterprise.repo.event.databind.EnterpriseObjectMapperFactory;
import org.alfresco.event.sdk.handling.EventHandlingExecutor;
import org.alfresco.event.sdk.handling.EventHandlingRegistry;
import org.alfresco.event.sdk.handling.SimpleEventHandlingExecutor;
import org.alfresco.event.sdk.handling.handler.EventHandler;
import org.alfresco.event.sdk.integration.EventChannels;
import org.alfresco.event.sdk.integration.transformer.EventGenericTransformer;
import org.alfresco.event.sdk.model.databind.ObjectMapperFactory;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.handler.LoggingHandler;
import org.springframework.integration.jms.dsl.Jms;
import org.springframework.integration.transformer.GenericTransformer;

/**
 * {@link org.springframework.boot.autoconfigure.EnableAutoConfiguration Auto-configuration} for Alfresco Event Java API.
 * <p>
 * This auto-configuration defines the beans required to read the Alfresco JSON events from an ActiveMQ topic, transform that event from JSON to {@link
 * RepoEvent} making use of the {@link EventGenericTransformer} and do up to two things:
 * <ul>
 *     <li>Forward a Spring Integration {@link org.springframework.messaging.Message} to a publish-subscribe channel</li>
 *     <li>Invoke the list of {@link EventHandler} registered to handle the specific event type consumed from the topic</li>
 * </ul>
 * <p>
 * This way the integrator can configure the Alfresco Java Event API to consume the events using Spring Integration or plain Java event handlers.
 */
@Configuration
@AutoConfigureAfter({IntegrationAutoConfiguration.class, ActiveMQAutoConfiguration.class, JmsAutoConfiguration.class})
@ConditionalOnClass(RepoEvent.class)
@EnableConfigurationProperties(AlfrescoEventsProperties.class)
public class AlfrescoEventsAutoConfiguration {

    @Autowired
    private AlfrescoEventsProperties alfrescoEventsProperties;

    @Autowired
    private List<EventHandler> eventHandlers;

    // CORE INTEGRATION WITH BROKER CONFIGURATION
    @Bean
    public IntegrationFlow acsEventsListeningFlow(final ActiveMQConnectionFactory activeMQConnectionFactory) {
        // @formatter:off
        return IntegrationFlows.from(Jms.messageDrivenChannelAdapter(activeMQConnectionFactory)
                .destination(acsEventsTopic())
                .errorChannel(acsEventErrorChannel()))
                .transform(acsEventTransformer())
                .routeToRecipients(route -> route
                        .recipient(EventChannels.SPRING_INTEGRATION, s -> alfrescoEventsProperties.isEnableSpringIntegration())
                        .recipient(EventChannels.HANDLERS, s -> alfrescoEventsProperties.isEnableHandlers()))
                .get();
        // @formatter:on
    }

    @Bean
    public Topic acsEventsTopic() {
        return new ActiveMQTopic(alfrescoEventsProperties.getTopicName());
    }

    @Bean(name = EventChannels.ERROR)
    public DirectChannel acsEventErrorChannel() {
        return new DirectChannel();
    }

    @Bean
    public GenericTransformer<String, RepoEvent<DataAttributes<Resource>>> acsEventTransformer() {
        return new EventGenericTransformer(acsEventObjectMapper());
    }

    @ConditionalOnMissingClass("org.alfresco.enterprise.repo.event.databind.EnterpriseObjectMapperFactory")
    @Bean
    public ObjectMapper acsEventObjectMapper() {
        return ObjectMapperFactory.createInstance();
    }

    @ConditionalOnClass(name = "org.alfresco.enterprise.repo.event.databind.EnterpriseObjectMapperFactory")
    @Bean(name = "acsEventObjectMapper")
    public ObjectMapper acsEventEnterpriseObjectMapper() {
        return EnterpriseObjectMapperFactory.createInstance();
    }

    // SPRING INTEGRATION OPTION CONFIGURATION
    @Bean
    public IntegrationFlow acsEventsSpringIntegrationFlow() {
        // @formatter:off
        return IntegrationFlows.from(EventChannels.SPRING_INTEGRATION)
                .log(LoggingHandler.Level.DEBUG)
                .channel(acsEventChannel())
                .get();
        // @formatter:on
    }

    @Bean(name = EventChannels.MAIN)
    public PublishSubscribeChannel acsEventChannel() {
        return new PublishSubscribeChannel();
    }

    // PLAIN HANDLERS OPTION CONFIGURATION
    @Bean
    public IntegrationFlow acsEventsHandlersFlow() {
        // @formatter:off
        return IntegrationFlows.from(EventChannels.HANDLERS)
                .log(LoggingHandler.Level.DEBUG)
                .handle(s -> eventHandlingExecutor().executeEventHandlers((RepoEvent<DataAttributes<Resource>>) s.getPayload()))
                .get();
        // @formatter:on
    }

    @Bean
    public EventHandlingExecutor eventHandlingExecutor() {
        return new SimpleEventHandlingExecutor(eventHandlingRegistry());
    }

    @Bean
    public EventHandlingRegistry eventHandlingRegistry() {
        return new EventHandlingRegistry(eventHandlers);
    }
}
