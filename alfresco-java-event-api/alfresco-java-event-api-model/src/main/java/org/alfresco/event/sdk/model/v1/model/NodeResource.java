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
package org.alfresco.event.sdk.model.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Represents Alfresco node resource.
 */
//Any attribute that its value is null, will not be serialized.
@JsonInclude(Include.NON_NULL)
@JsonDeserialize(builder = NodeResource.Builder.class)
public class NodeResource extends AbstractNodeResource {

    private final String name;
    private final String nodeType;
    private final Boolean isFile;
    private final Boolean isFolder;
    private final UserInfo createdByUser;
    private final ZonedDateTime createdAt;
    private final UserInfo modifiedByUser;
    private final ZonedDateTime modifiedAt;
    private final ContentInfo content;
    private final Map<String, Serializable> properties;
    private final Set<String> aspectNames;

    private NodeResource(final Builder builder) {
        super(builder.id, builder.primaryHierarchy);
        this.name = builder.name;
        this.nodeType = builder.nodeType;
        this.isFile = builder.isFile;
        this.isFolder = builder.isFolder;
        this.createdByUser = builder.createdByUser;
        this.createdAt = builder.createdAt;
        this.modifiedByUser = builder.modifiedByUser;
        this.modifiedAt = builder.modifiedAt;
        this.content = builder.content;
        this.properties = builder.properties;
        this.aspectNames = builder.aspectNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getNodeType() {
        return nodeType;
    }

    @JsonProperty("isFile")
    public Boolean isFile() {
        return isFile;
    }

    @JsonProperty("isFolder")
    public Boolean isFolder() {
        return isFolder;
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

    public Map<String, Serializable> getProperties() {
        return properties;
    }

    public Set<String> getAspectNames() {
        return aspectNames;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeResource)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        final NodeResource that = (NodeResource) o;
        return Objects.equals(name, that.name)
                && Objects.equals(nodeType, that.nodeType)
                && Objects.equals(isFile, that.isFile)
                && Objects.equals(isFolder, that.isFolder)
                && Objects.equals(createdByUser, that.createdByUser)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(modifiedByUser, that.modifiedByUser)
                && Objects.equals(modifiedAt, that.modifiedAt)
                && Objects.equals(content, that.content)
                && Objects.equals(properties, that.properties)
                && Objects.equals(aspectNames, that.aspectNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, nodeType, isFile, isFolder, createdByUser,
                createdAt, modifiedByUser, modifiedAt, content,
                properties, aspectNames);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(500);
        sb.append("NodeResource [id=").append(id)
                .append(", name=").append(name)
                .append(", nodeType=").append(nodeType)
                .append(", isFile=").append(isFile)
                .append(", isFolder=").append(isFolder)
                .append(", createdByUser=").append(createdByUser)
                .append(", createdAt=").append(createdAt)
                .append(", modifiedByUser=").append(modifiedByUser)
                .append(", modifiedAt=").append(modifiedAt)
                .append(", content=").append(content)
                .append(", properties=").append(properties)
                .append(", aspectNames=").append(aspectNames)
                .append(", primaryHierarchy=").append(primaryHierarchy)
                .append(']');

        return sb.toString();
    }

    /**
     * Builder for creating a {@link NodeResource} instance.
     */
    @JsonPOJOBuilder(withPrefix = "set")
    public static class Builder {

        private String id;
        private String name;
        private String nodeType;
        private Boolean isFile;
        private Boolean isFolder;
        private UserInfo createdByUser;
        private ZonedDateTime createdAt;
        private UserInfo modifiedByUser;
        private ZonedDateTime modifiedAt;
        private List<String> primaryHierarchy;
        private ContentInfo content;
        private Map<String, Serializable> properties;
        private Set<String> aspectNames;

        public Builder() {
        }

        /**
         * Copy builder
         *
         * @param that existing {@code Builder} object
         */
        public Builder(final Builder that) {
            this.id = that.id;
            this.name = that.name;
            this.nodeType = that.nodeType;
            this.isFile = that.isFile;
            this.isFolder = that.isFolder;
            this.createdByUser = that.createdByUser;
            this.createdAt = that.createdAt;
            this.modifiedByUser = that.modifiedByUser;
            this.modifiedAt = that.modifiedAt;
            this.content = that.content;
            this.primaryHierarchy = that.primaryHierarchy;
            this.properties = that.properties;
            this.aspectNames = that.aspectNames;
        }

        public Builder setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setNodeType(final String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Builder setIsFile(final Boolean isFile) {
            this.isFile = isFile;
            return this;
        }

        public Builder setIsFolder(final Boolean isFolder) {
            this.isFolder = isFolder;
            return this;
        }

        public Builder setCreatedByUser(final UserInfo createdByUser) {
            this.createdByUser = createdByUser;
            return this;
        }

        public Builder setCreatedAt(final ZonedDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setModifiedByUser(final UserInfo modifiedByUser) {
            this.modifiedByUser = modifiedByUser;
            return this;
        }

        public Builder setModifiedAt(final ZonedDateTime modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder setPrimaryHierarchy(final List<String> primaryHierarchy) {
            this.primaryHierarchy = primaryHierarchy;
            return this;
        }

        public Builder setContent(final ContentInfo content) {
            this.content = content;
            return this;
        }

        public Builder setProperties(final Map<String, Serializable> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setAspectNames(final Set<String> aspectNames) {
            this.aspectNames = aspectNames;
            return this;
        }

        public NodeResource build() {
            return new NodeResource(this);
        }
    }
}
