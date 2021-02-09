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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Objects;

/**
 * Represents Alfresco event's data.
 *
 * @author Jamal Kaabi-Mofrad
 */
@JsonDeserialize(builder = EventData.Builder.class)
public class EventData<R extends Resource> implements DataAttributes<R> {

    private final String eventGroupId;

    @JsonTypeInfo(use = Id.NAME)
    private final R resource;

    @JsonInclude(Include.NON_NULL)
    @JsonTypeInfo(use = Id.NAME)
    private final R resourceBefore;

    private EventData(final Builder<R> builder) {
        this.eventGroupId = builder.eventGroupId;
        this.resource = builder.resource;
        this.resourceBefore = builder.resourceBefore;

    }

    public static <R extends Resource> Builder<R> builder() {
        return new Builder<>();
    }

    @Override
    public String getEventGroupId() {
        return eventGroupId;
    }

    @Override
    public R getResource() {
        return resource;
    }

    @Override
    public R getResourceBefore() {
        return resourceBefore;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EventData)) {
            return false;
        }
        final EventData<?> eventData = (EventData<?>) o;
        return Objects.equals(eventGroupId, eventData.eventGroupId)
                && Objects.equals(resource, eventData.resource)
                && Objects.equals(resourceBefore, eventData.resourceBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventGroupId, resource, resourceBefore);
    }

    @Override
    public String toString() {
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
    public static class Builder<R extends Resource> {

        private String eventGroupId;
        private R resource;
        private R resourceBefore;

        public Builder<R> setEventGroupId(final String eventGroupId) {
            this.eventGroupId = eventGroupId;
            return this;
        }

        public Builder<R> setResource(final R resource) {
            this.resource = resource;
            return this;
        }

        public Builder<R> setResourceBefore(final R resourceBefore) {
            this.resourceBefore = resourceBefore;
            return this;
        }

        public EventData<R> build() {
            return new EventData<>(this);
        }
    }
}
