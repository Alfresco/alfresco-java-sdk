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
package org.alfresco.event.sdk.model.v1.model.schema;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URI;
import java.time.ZonedDateTime;
import org.alfresco.event.sdk.model.EventAttributes;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.Resource;

/**
 * Event data object to generate the JSON schema for {@code RepoEvent}.
 *
 * @author Jamal Kaabi-Mofrad
 */
// Used with jsonschema-generator to control the order
@JsonPropertyOrder
public class RepoEvent<D extends DataAttributes<? extends Resource>> implements EventAttributes {

    @Required
    private String specversion;
    @Required
    private String type;
    @Required
    private String id;
    @Required
    private URI source;
    @Required
    private ZonedDateTime time;
    @Required
    private URI dataschema;
    @Required
    private String datacontenttype;
    @Required
    private D data;

    @Override
    public String getSpecversion() {
        return specversion;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public URI getSource() {
        return source;
    }

    @Override
    public ZonedDateTime getTime() {
        return time;
    }

    @Override
    public URI getDataschema() {
        return dataschema;
    }

    @Override
    public String getDatacontenttype() {
        return datacontenttype;
    }

    public D getData() {
        return data;
    }
}
