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

/**
 * List of supported event types.
 */
public enum EventType {
    NODE_CREATED(EventTypeConst.CREATED, ContextType.NODE), NODE_UPDATED(EventTypeConst.UPDATED, ContextType.NODE), NODE_DELETED(EventTypeConst.DELETED,
            ContextType.NODE),
    CHILD_ASSOC_CREATED(EventTypeConst.CREATED, ContextType.CHILD_ASSOC), CHILD_ASSOC_DELETED(EventTypeConst.DELETED, ContextType.CHILD_ASSOC),
    PEER_ASSOC_CREATED(EventTypeConst.CREATED, ContextType.PEER_ASSOC), PEER_ASSOC_DELETED(EventTypeConst.DELETED, ContextType.PEER_ASSOC),
    PERMISSION_UPDATED(EventTypeConst.UPDATED, ContextType.PERMISSION);

    private static final String PREFIX = "org.alfresco.event.";
    private final String type;
    private final ContextType contextType;

    EventType(final String type, final ContextType contextType) {
        this.type = type;
        this.contextType = contextType;
    }

    String getContext() {
        return contextType.getContext();
    }

    @Override
    public String toString() {
        return PREFIX + getContext() + type;
    }

    /**
     * Gets the type of an event prefixed with a reverse-DNS name.
     * <p>
     * See <a href="https://github.com/cloudevents/spec/blob/v1.0/spec.md#type">v1.0 spec#type</a>
     */
    public String getType() {
        return toString();
    }

    private enum ContextType {
        NODE("node."), CHILD_ASSOC("assoc.child."), PEER_ASSOC("assoc.peer."), PERMISSION("permission.");

        private final String context;

        ContextType(final String context) {
            this.context = context;
        }

        String getContext() {
            return context;
        }
    }

    private static class EventTypeConst {

        private static final String CREATED = "Created";
        private static final String UPDATED = "Updated";
        private static final String DELETED = "Deleted";
    }
}

