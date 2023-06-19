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
package org.alfresco.event.sdk.integration.transformer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.alfresco.event.sdk.handling.EventHandlingException;
import org.alfresco.event.sdk.model.databind.ObjectMapperFactory;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.integration.core.GenericTransformer;

/**
 * {@link GenericTransformer} implementation that transforms a repository event in JSON format (following the Repo Event JSON schema) into a {@link RepoEvent}
 * object.
 */
public class EventGenericTransformer implements GenericTransformer<String, RepoEvent<DataAttributes<Resource>>> {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventGenericTransformer.class);

    private final ObjectMapper objectMapper = new ObjectMapperFactory().createObjectMapper();

    @Override
    public RepoEvent<DataAttributes<Resource>> transform(final String eventJSON) {
        LOGGER.debug("Transforming JSON event {}", eventJSON);
        try {
            return objectMapper.readValue(eventJSON, new TypeReference<>() {
            });
        } catch (final JsonProcessingException excp) {
            LOGGER.error("An error occurred transforming the JSON event {}", eventJSON);
            throw new EventHandlingException("An error occurred transforming the JSON event", excp);
        }
    }
}
