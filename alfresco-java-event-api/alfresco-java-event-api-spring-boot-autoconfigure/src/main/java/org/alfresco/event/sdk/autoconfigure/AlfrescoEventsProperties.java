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

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Define the properties that allow the configuration of the Alfresco Java Events API SDK for Spring Boot.
 */
@ConfigurationProperties(prefix = "alfresco.events")
public class AlfrescoEventsProperties {

    /**
     * Name of the topic where the events are published by ACS. This corresponds to be property "repo.event2.topic.endpoint" in ACS.
     * <p>
     * Default value: alfresco.repo.event2
     */
    private String topicName = "alfresco.repo.event2";

    /**
     * Enable the Spring Integration way of handling messages from the events API.
     * <p>
     * Default value: true
     */
    private boolean enableSpringIntegration = true;

    /**
     * Enable the plain Java handlers to listen to the events produced by the API.
     * <p>
     * Default value: true
     */
    private boolean enableHandlers = true;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(final String topicName) {
        this.topicName = topicName;
    }

    public boolean isEnableSpringIntegration() {
        return enableSpringIntegration;
    }

    public void setEnableSpringIntegration(final boolean enableSpringIntegration) {
        this.enableSpringIntegration = enableSpringIntegration;
    }

    public boolean isEnableHandlers() {
        return enableHandlers;
    }

    public void setEnableHandlers(final boolean enableHandlers) {
        this.enableHandlers = enableHandlers;
    }
}
