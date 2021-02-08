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
package org.alfresco.sdk.sample.event.handler;

import org.alfresco.event.sdk.handling.filter.EventFilter;
import org.alfresco.event.sdk.handling.filter.IsFolderFilter;
import org.alfresco.event.sdk.handling.handler.OnNodeDeletedEventHandler;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.NodeResource;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Sample event handler to demonstrate reacting to the deletion of a folder node in the repository.
 */
@Component
public class FolderDeletedHandler implements OnNodeDeletedEventHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(FolderDeletedHandler.class);

    @Override
    public void handleEvent(final RepoEvent<DataAttributes<Resource>> repoEvent) {
        LOGGER.info("The folder named {} has been deleted!", ((NodeResource) repoEvent.getData().getResource()).getName());
    }

    @Override
    public EventFilter getEventFilter() {
        return IsFolderFilter.get();
    }
}
