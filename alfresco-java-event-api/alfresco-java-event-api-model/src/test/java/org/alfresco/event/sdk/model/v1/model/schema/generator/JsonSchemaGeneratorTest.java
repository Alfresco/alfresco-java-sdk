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
package org.alfresco.event.sdk.model.v1.model.schema.generator;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.victools.jsonschema.generator.OptionPreset;
import com.github.victools.jsonschema.generator.SchemaGenerator;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfig;
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder;
import com.github.victools.jsonschema.generator.SchemaVersion;
import com.github.victools.jsonschema.generator.TypeContext;
import com.github.victools.jsonschema.module.jackson.JacksonModule;
import com.github.victools.jsonschema.module.jackson.JacksonOption;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.alfresco.event.sdk.model.v1.model.schema.ChildAssociationResource;
import org.alfresco.event.sdk.model.v1.model.schema.EventDataWithResourceBefore;
import org.alfresco.event.sdk.model.v1.model.schema.EventDataWithoutResourceBefore;
import org.alfresco.event.sdk.model.v1.model.schema.NodeResource;
import org.alfresco.event.sdk.model.v1.model.schema.PeerAssociationResource;
import org.alfresco.event.sdk.model.v1.model.schema.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.schema.Required;
import org.junit.Test;

/**
 * @author Jamal Kaabi-Mofrad
 */
public class JsonSchemaGeneratorTest {

    @Test
    public void jsonSchema() {
        for (final EventEntry entry : EventEntry.values()) {
            final SchemaGeneratorConfigBuilder configBuilder = getConfigBuilder(entry);

            final SchemaGeneratorConfig config = configBuilder.build();
            final SchemaGenerator generator = new SchemaGenerator(config);

            final JsonNode jsonSchema = generator.generateSchema(RepoEvent.class);

            entry.fileNames.forEach(file -> writeToFile(jsonSchema, file));
        }
    }

    private SchemaGeneratorConfigBuilder getConfigBuilder(final EventEntry entry) {
        final JacksonModule module = new JacksonModule(JacksonOption.RESPECT_JSONPROPERTY_ORDER);

        final SchemaGeneratorConfigBuilder configBuilder =
                new SchemaGeneratorConfigBuilder(SchemaVersion.DRAFT_2019_09, OptionPreset.PLAIN_JSON).with(module);

        configBuilder.forTypesInGeneral().withSubtypeResolver((declaredType, generationContext) -> {
            if (declaredType.getErasedType() == Resource.class) {
                final TypeContext typeContext = generationContext.getTypeContext();
                switch (entry) {
                    case NODE_ENTRY:
                        return List.of(typeContext.resolveSubtype(declaredType, NodeResource.class));
                    case CHILD_ASSOC_ENTRY:
                        return List.of(typeContext.resolveSubtype(declaredType, ChildAssociationResource.class));
                    case PEER_ASSOC_ENTRY:
                        return List.of(typeContext.resolveSubtype(declaredType, PeerAssociationResource.class));
                }
            }

            if (declaredType.getErasedType() == DataAttributes.class) {
                final TypeContext typeContext = generationContext.getTypeContext();
                if (entry == EventEntry.NODE_UPDATED_ENTRY) {
                    return List.of(typeContext.resolveSubtype(declaredType, EventDataWithResourceBefore.class));
                } else {
                    return List.of(typeContext.resolveSubtype(declaredType, EventDataWithoutResourceBefore.class));
                }
            }
            return null;
        });

        configBuilder.forFields().withTargetTypeOverridesResolver(field -> {
            if (field.getDeclaredType().getErasedType() == URI.class) {
                return Stream.of(String.class)
                        .map(specificSubtype -> field.getContext().resolve(String.class))
                        .collect(Collectors.toList());
            }
            return null;
        });

        configBuilder.forFields().withRequiredCheck(field -> {
            final Required annotation = field.getAnnotation(Required.class);
            return (annotation != null);
        });

        return configBuilder;
    }

    private void writeToFile(final JsonNode jsonSchema, final String fileName) {
        final File outputDir = new File("target/schema/");
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        try (final FileOutputStream outputStream = new FileOutputStream(new File(outputDir, fileName));
                final PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8))) {
            writer.print(jsonSchema.toPrettyString());
        } catch (final IOException e) {
            throw new RuntimeException("Error: Can not write to file " + fileName, e);
        }
    }

    enum EventEntry {
        NODE_ENTRY(List.of("nodeCreated.json", "nodeDeleted.json")),
        NODE_UPDATED_ENTRY(List.of("nodeUpdated.json")),
        CHILD_ASSOC_ENTRY(List.of("childAssocCreated.json", "childAssocDeleted.json")),
        PEER_ASSOC_ENTRY(List.of("peerAssocCreated.json", "peerAssocDeleted.json"));

        private final List<String> fileNames;

        EventEntry(final List<String> fileNames) {
            this.fileNames = fileNames;
        }
    }
}
