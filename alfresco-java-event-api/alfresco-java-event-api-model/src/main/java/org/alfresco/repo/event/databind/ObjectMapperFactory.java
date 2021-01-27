/*
 * #%L
 * Alfresco Repository
 * %%
 * Copyright (C) 2005 - 2020 Alfresco Software Limited
 * %%
 * This file is part of the Alfresco software.
 * If the software was purchased under a paid Alfresco license, the terms of
 * the paid license agreement will prevail.  Otherwise, the software is
 * provided under the following open source license terms:
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.alfresco.repo.event.databind;

import java.time.ZonedDateTime;

import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.EventData;
import org.alfresco.repo.event.v1.model.Resource;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Repo Event object factory.
 *
 * @author Jamal Kaabi-Mofrad
 */
public class ObjectMapperFactory
{
    public static ObjectMapper createInstance()
    {
        return new ObjectMapperFactory().createObjectMapper();
    }

    public ObjectMapper createObjectMapper()
    {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        final SimpleModule module = getSimpleModule();
        final SimpleAbstractTypeResolver resolver = getSimpleAbstractTypeResolver();
        if(resolver != null)
        {
            module.setAbstractTypes(resolver);
        }

        mapper.registerModule(module);
        return mapper;
    }

    protected SimpleModule getSimpleModule()
    {
        final SimpleModule module =
                    new SimpleModule("Resource Serializer-Deserializer", new Version(0, 1, 0, "", "", ""));
        module.addSerializer(ZonedDateTime.class, new DateTimeSerializer());
        module.addDeserializer(ZonedDateTime.class, new DateTimeDeserializer());
        module.addDeserializer(Resource.class, new ResourceDeserializer());

        return module;
    }

    protected SimpleAbstractTypeResolver getSimpleAbstractTypeResolver()
    {
        SimpleAbstractTypeResolver resolver = new SimpleAbstractTypeResolver();
        resolver.addMapping(DataAttributes.class, EventData.class);
        return resolver;
    }
}
