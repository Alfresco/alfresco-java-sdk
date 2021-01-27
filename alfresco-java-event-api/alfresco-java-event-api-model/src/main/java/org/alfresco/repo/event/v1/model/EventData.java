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

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Represents Alfresco event's data.
 *
 * @author Jamal Kaabi-Mofrad
 */
@JsonDeserialize(builder = EventData.Builder.class)
public class EventData<R extends Resource> implements DataAttributes<R>
{
    private final String eventGroupId;

    @JsonTypeInfo(use = Id.NAME)
    private final R resource;

    @JsonInclude(Include.NON_NULL)
    @JsonTypeInfo(use = Id.NAME)
    private final R resourceBefore;

    private EventData(Builder<R> builder)
    {
        this.eventGroupId = builder.eventGroupId;
        this.resource = builder.resource;
        this.resourceBefore = builder.resourceBefore;

    }

    public static <R extends Resource> Builder<R> builder()
    {
        return new Builder<>();
    }

    @Override
    public String getEventGroupId()
    {
        return eventGroupId;
    }

    @Override
    public R getResource()
    {
        return resource;
    }

    @Override
    public R getResourceBefore()
    {
        return resourceBefore;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (!(o instanceof EventData))
        {
            return false;
        }
        EventData<?> eventData = (EventData<?>) o;
        return Objects.equals(eventGroupId, eventData.eventGroupId)
                    && Objects.equals(resource, eventData.resource)
                    && Objects.equals(resourceBefore, eventData.resourceBefore);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(eventGroupId, resource, resourceBefore);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder(500);
        sb.append("EventData [eventGroupId=").append(eventGroupId)
          .append(", resource=").append(resource)
          .append(", resourceBefore=").append(resourceBefore)
          .append(']');
        return sb.toString();
    }

    /**
     * Builder for creating a {@link EventData} instance.
     */
    @JsonPOJOBuilder(withPrefix = "set")
    public static class Builder<R extends Resource>
    {
        private String eventGroupId;
        private R resource;
        private R resourceBefore;

        public Builder<R> setEventGroupId(String eventGroupId)
        {
            this.eventGroupId = eventGroupId;
            return this;
        }

        public Builder<R> setResource(R resource)
        {
            this.resource = resource;
            return this;
        }

        public Builder<R> setResourceBefore(R resourceBefore)
        {
            this.resourceBefore = resourceBefore;
            return this;
        }

        public EventData<R> build()
        {
            return new EventData<>(this);
        }
    }
}
