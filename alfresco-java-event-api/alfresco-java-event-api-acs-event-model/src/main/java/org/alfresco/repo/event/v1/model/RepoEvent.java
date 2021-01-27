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
package org.alfresco.repo.event.v1.model;

import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Objects;

import org.alfresco.repo.event.EventAttributes;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Represents Alfresco event.
 *
 * @author Jamal Kaabi-Mofrad
 */
@JsonDeserialize(builder = RepoEvent.Builder.class)
public class RepoEvent<D extends DataAttributes<? extends Resource>> implements EventAttributes
{
    private static final String SPEC_VERSION = "1.0";
    private static final String CONTENT_TYPE = "application/json";

    private final String        specversion;
    private final String        type;
    private final String        id;
    private final URI           source;
    private final ZonedDateTime time;
    private final URI           dataschema;
    private final String        datacontenttype;
    private final D data;

    private RepoEvent(Builder<D> builder)
    {
        this.specversion = builder.specversion;
        this.type = builder.type;
        this.id = builder.id;
        this.source = builder.source;
        this.time = builder.time;
        this.datacontenttype = builder.datacontenttype;
        this.data = builder.data;
        this.dataschema = builder.dataschema;
    }

    public static <D extends DataAttributes<? extends Resource>> Builder<D> builder()
    {
        return new Builder<>();
    }

    @Override
    public String getSpecversion()
    {
        return specversion;
    }

    @Override
    public String getType()
    {
        return type;
    }

    @Override
    public String getId()
    {
        return id;
    }

    @Override
    public URI getSource()
    {
        return source;
    }

    @Override
    public ZonedDateTime getTime()
    {
        return time;
    }

    @Override
    public URI getDataschema()
    {
        return dataschema;
    }

    @Override
    public String getDatacontenttype()
    {
        return datacontenttype;
    }

    public D getData()
    {
        return data;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof RepoEvent))
        {
            return false;
        }
        RepoEvent<?> repoEvent = (RepoEvent<?>) o;
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
    public int hashCode()
    {
        return Objects.hash(specversion, type, id, source, dataschema, time, datacontenttype, data);
    }

    @Override
    public String toString()
    {
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
    public static class Builder<D extends DataAttributes<? extends Resource>>
    {
        private String specversion = SPEC_VERSION;
        private String type;
        private String id;
        private URI source;
        private ZonedDateTime time;
        private URI dataschema;
        private String datacontenttype = CONTENT_TYPE;
        private D data;

        public Builder<D> setSpecversion(String specversion)
        {
            this.specversion = specversion;
            return this;
        }

        public Builder<D> setType(String type)
        {
            this.type = type;
            return this;
        }

        public Builder<D> setId(String id)
        {
            this.id = id;
            return this;
        }

        public Builder<D> setSource(URI source)
        {
            this.source = source;
            return this;
        }

        public Builder<D> setTime(ZonedDateTime time)
        {
            this.time = time;
            return this;
        }

        public Builder<D> setDataschema(URI dataschema)
        {
            this.dataschema = dataschema;
            return this;
        }

        public Builder<D> setDatacontenttype(String datacontenttype)
        {
            this.datacontenttype = datacontenttype;
            return this;
        }

        public Builder<D> setData(D data)
        {
            this.data = data;
            return this;
        }

        public RepoEvent<D> build()
        {
            return new RepoEvent<>(this);
        }
    }
}
