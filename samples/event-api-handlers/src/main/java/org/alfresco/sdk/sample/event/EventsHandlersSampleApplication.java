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
package org.alfresco.sdk.sample.event;

import org.alfresco.event.sdk.handling.handler.OnNodeCreatedEventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class EventsHandlersSampleApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventsHandlersSampleApplication.class);

    public static void main(final String[] args) {
        SpringApplication.run(EventsHandlersSampleApplication.class, args);
    }

    /**
     * This event handler definition illustrates how you can use Spring's {@link Order} annotation to sort the execution of event handlers.
     */
    @Bean
    @Order(10)
    public OnNodeCreatedEventHandler firstCustomNodeCreatedEventHandler() {
        return repoEvent -> LOGGER.info("First Event handler triggered on node created - Event: {}", repoEvent);
    }

    /**
     * This event handler definition illustrates how you can use Spring's {@link Order} annotation to sort the execution of event handlers.
     */
    @Bean
    @Order(20)
    public OnNodeCreatedEventHandler secondCustomNodeCreatedEventHandler() {
        return repoEvent -> LOGGER.info("Second Event handler triggered on node created - Event: {}", repoEvent);
    }
}
