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

import java.io.IOException;
import java.util.Map;

import org.alfresco.repo.event.v1.model.ChildAssociationResource;
import org.alfresco.repo.event.v1.model.NodeResource;
import org.alfresco.repo.event.v1.model.PeerAssociationResource;
import org.alfresco.repo.event.v1.model.Resource;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TextNode;

/**
 * @author Jamal Kaabi-Mofrad
 */
public class ResourceDeserializer extends JsonDeserializer<Resource>
{
    private static final String                TYPE_FIELD = "@type";
    private static final Map<String, Class<?>> TYPE_MAP   = Map.of(
                getName(NodeResource.class), NodeResource.class,
                getName(ChildAssociationResource.class), ChildAssociationResource.class,
                getName(PeerAssociationResource.class), PeerAssociationResource.class);

    public ResourceDeserializer()
    {
    }

    private static <T> String getName(Class<T> aClass)
    {
        return aClass.getSimpleName();
    }

    @Override
    public Resource deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException
    {
        final ObjectCodec objectCodec = parser.getCodec();
        final TreeNode treeNode = objectCodec.readTree(parser);
        final TextNode type = (TextNode) treeNode.get(TYPE_FIELD);
        if (type == null)
        {
            throw new EventDeserializerException("The resource type '@type' is not defined.");
        }
        final Class<?> registeredClass = TYPE_MAP.get(type.asText());
        if (registeredClass == null)
        {
            throw new EventDeserializerException("There is no type registered for: " + type.asText());
        }
        final ObjectMapper mapper = (ObjectMapper) objectCodec;
        final Object obj = mapper.readValue(treeNode.toString(), registeredClass);
        return (Resource) obj;
    }
}
