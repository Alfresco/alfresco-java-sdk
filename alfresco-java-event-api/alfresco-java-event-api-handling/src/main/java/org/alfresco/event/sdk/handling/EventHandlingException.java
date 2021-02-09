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
package org.alfresco.event.sdk.handling;

/**
 * {@link RuntimeException} that reflects a problem handling an event.
 */
public class EventHandlingException extends RuntimeException {

    /**
     * Construct a new event handling exception with the specified message and cause.
     *
     * @param message given message to add to the exception
     * @param cause   given {@link Throwable} that caused this exception
     */
    public EventHandlingException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
