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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.alfresco.event.sdk.model.v1.model.ContentInfo;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.alfresco.event.sdk.model.v1.model.UserInfo;

/**
 * Event data object to generate the JSON schema for {@code NodeResource}.
 */
// Used with jsonschema-generator to control the order
@JsonPropertyOrder
public class NodeResource implements Resource {

    @Required
    private String id;
    private String name;
    private String nodeType;
    private Boolean file;
    private Boolean folder;
    private UserInfo createdByUser;
    private ZonedDateTime createdAt;
    private UserInfo modifiedByUser;
    private ZonedDateTime modifiedAt;
    private ContentInfo content;
    private List<String> primaryHierarchy;
    private Map<String, Serializable> properties;
    private Set<String> aspectNames;

    public NodeResource() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNodeType() {
        return nodeType;
    }

    @JsonProperty("isFile")
    public Boolean isFile() {
        return file;
    }

    @JsonProperty("isFolder")
    public Boolean isFolder() {
        return folder;
    }

    public UserInfo getCreatedByUser() {
        return createdByUser;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public UserInfo getModifiedByUser() {
        return modifiedByUser;
    }

    public ZonedDateTime getModifiedAt() {
        return modifiedAt;
    }

    public ContentInfo getContent() {
        return content;
    }

    public List<String> getPrimaryHierarchy() {
        return primaryHierarchy;
    }

    public Map<String, Serializable> getProperties() {
        return properties;
    }

    public Set<String> getAspectNames() {
        return aspectNames;
    }
}
