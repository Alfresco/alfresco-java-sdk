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

import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;

/**
 * Definition of the operations related to the execution of the handling of the repository events.
 */
@FunctionalInterface
public interface EventHandlingExecutor {

    /**
     * Execute the event handlers that correspond to a specific {@link RepoEvent}.
     *
     * @param repoEvent given {@link RepoEvent} to be handled
     */
    void executeEventHandlers(final RepoEvent<DataAttributes<Resource>> repoEvent);
}
