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
package org.alfresco.event.sdk.model.databind;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.time.ZonedDateTime;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.EventData;
import org.alfresco.event.sdk.model.v1.model.Resource;

/**
 * Repo Event object factory.
 *
 * @author Jamal Kaabi-Mofrad
 */
public class ObjectMapperFactory {

    public static ObjectMapper createInstance() {
        return new ObjectMapperFactory().createObjectMapper();
    }

    public ObjectMapper createObjectMapper() {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        final SimpleModule module = getSimpleModule();
        final SimpleAbstractTypeResolver resolver = getSimpleAbstractTypeResolver();
        if (resolver != null) {
            module.setAbstractTypes(resolver);
        }

        mapper.registerModule(module);
        return mapper;
    }

    protected SimpleModule getSimpleModule() {
        final SimpleModule module =
                new SimpleModule("Resource Serializer-Deserializer", new Version(0, 1, 0, "", "", ""));
        module.addSerializer(ZonedDateTime.class, new DateTimeSerializer());
        module.addDeserializer(ZonedDateTime.class, new DateTimeDeserializer());
        module.addDeserializer(Resource.class, new ResourceDeserializer());

        return module;
    }

    protected SimpleAbstractTypeResolver getSimpleAbstractTypeResolver() {
        final SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(DataAttributes.class, EventData.class);
        return resolver;
    }
}
