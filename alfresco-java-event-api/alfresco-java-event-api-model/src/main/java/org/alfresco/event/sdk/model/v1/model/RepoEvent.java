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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Objects;
import org.alfresco.event.sdk.model.EventAttributes;

/**
 * Represents Alfresco event.
 *
 * @author Jamal Kaabi-Mofrad
 */
@JsonDeserialize(builder = RepoEvent.Builder.class)
public class RepoEvent<D extends DataAttributes<? extends Resource>> implements EventAttributes {

    private static final String SPEC_VERSION = "1.0";
    private static final String CONTENT_TYPE = "application/json";

    private final String specversion;
    private final String type;
    private final String id;
    private final URI source;
    private final ZonedDateTime time;
    private final URI dataschema;
    private final String datacontenttype;
    private final D data;

    private RepoEvent(final Builder<D> builder) {
        this.specversion = builder.specversion;
        this.type = builder.type;
        this.id = builder.id;
        this.source = builder.source;
        this.time = builder.time;
        this.datacontenttype = builder.datacontenttype;
        this.data = builder.data;
        this.dataschema = builder.dataschema;
    }

    public static <D extends DataAttributes<? extends Resource>> Builder<D> builder() {
        return new Builder<>();
    }

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

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepoEvent)) {
            return false;
        }
        final RepoEvent<?> repoEvent = (RepoEvent<?>) o;
        return Objects.equals(specversion, repoEvent.specversion)
                && Objects.equals(type, repoEvent.type)
                && Objects.equals(id, repoEvent.id)
                && Objects.equals(source, repoEvent.source)
                && Objects.equals(dataschema, repoEvent.dataschema)
                && Objects.equals(time, repoEvent.time)
                && Objects.equals(datacontenttype, repoEvent.datacontenttype)
                && Objects.equals(data, repoEvent.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specversion, type, id, source, dataschema, time, datacontenttype, data);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(250);
        sb.append("RepoEvent [specversion=").append(specversion)
                .append(", type=").append(type)
                .append(", id=").append(id)
                .append(", source=").append(source)
                .append(", time=").append(time)
                .append(", dataschema=").append(dataschema)
                .append(", datacontenttype=").append(datacontenttype)
                .append(", data=").append(data)
                .append(']');
        return sb.toString();
    }

    /**
     * Builder for creating a {@link RepoEvent} instance.
     */
    @JsonPOJOBuilder(withPrefix = "set")
    public static class Builder<D extends DataAttributes<? extends Resource>> {

        private String specversion = SPEC_VERSION;
        private String type;
        private String id;
        private URI source;
        private ZonedDateTime time;
        private URI dataschema;
        private String datacontenttype = CONTENT_TYPE;
        private D data;

        public Builder<D> setSpecversion(final String specversion) {
            this.specversion = specversion;
            return this;
        }

        public Builder<D> setType(final String type) {
            this.type = type;
            return this;
        }

        public Builder<D> setId(final String id) {
            this.id = id;
            return this;
        }

        public Builder<D> setSource(final URI source) {
            this.source = source;
            return this;
        }

        public Builder<D> setTime(final ZonedDateTime time) {
            this.time = time;
            return this;
        }

        public Builder<D> setDataschema(final URI dataschema) {
            this.dataschema = dataschema;
            return this;
        }

        public Builder<D> setDatacontenttype(final String datacontenttype) {
            this.datacontenttype = datacontenttype;
            return this;
        }

        public Builder<D> setData(final D data) {
            this.data = data;
            return this;
        }

        public RepoEvent<D> build() {
            return new RepoEvent<>(this);
        }
    }
}
