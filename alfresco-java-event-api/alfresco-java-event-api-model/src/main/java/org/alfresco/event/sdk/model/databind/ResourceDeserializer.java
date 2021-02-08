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
package org.alfresco.event.sdk.model.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TextNode;
import java.io.IOException;
import java.util.Map;
import org.alfresco.event.sdk.model.v1.model.ChildAssociationResource;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.PeerAssociationResource;
import org.alfresco.event.sdk.model.v1.model.Resource;

/**
 * @author Jamal Kaabi-Mofrad
 */
public class ResourceDeserializer extends JsonDeserializer<Resource> {

    private static final String TYPE_FIELD = "@type";
    private static final Map<String, Class<?>> TYPE_MAP = Map.of(
            getName(NodeResource.class), NodeResource.class,
            getName(ChildAssociationResource.class), ChildAssociationResource.class,
            getName(PeerAssociationResource.class), PeerAssociationResource.class);

    public ResourceDeserializer() {
    }

    private static <T> String getName(final Class<T> aClass) {
        return aClass.getSimpleName();
    }

    @Override
    public Resource deserialize(final JsonParser parser, final DeserializationContext ctxt) throws IOException {
        final ObjectCodec objectCodec = parser.getCodec();
        final TreeNode treeNode = objectCodec.readTree(parser);
        final TextNode type = (TextNode) treeNode.get(TYPE_FIELD);
        if (type == null) {
            throw new EventDeserializerException("The resource type '@type' is not defined.");
        }
        final Class<?> registeredClass = TYPE_MAP.get(type.asText());
        if (registeredClass == null) {
            throw new EventDeserializerException("There is no type registered for: " + type.asText());
        }
        final ObjectMapper mapper = (ObjectMapper) objectCodec;
        final Object obj = mapper.readValue(treeNode.toString(), registeredClass);
        return (Resource) obj;
    }
}
