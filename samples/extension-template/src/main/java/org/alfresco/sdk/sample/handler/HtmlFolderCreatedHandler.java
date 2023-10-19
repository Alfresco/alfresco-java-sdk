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
package org.alfresco.sdk.sample.handler;

import org.alfresco.core.handler.ContentApi;
import org.alfresco.event.sdk.handling.filter.EventFilter;
import org.alfresco.event.sdk.handling.filter.IsFolderFilter;
import org.alfresco.event.sdk.handling.handler.OnNodeCreatedEventHandler;
import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.NodeResource;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

/**
 * Sample event handler to demonstrate the creation of nodes with content reacting to the creation of a folder named <code>TARGET_FOLDER_NAME</code>. When the
 * folder is created, a template HTML content is bootstrapped in it using the {@link ContentApi} interface.
 */
@Component
public class HtmlFolderCreatedHandler implements OnNodeCreatedEventHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(HtmlFolderCreatedHandler.class);
    private static final String HTML_TEMPLATE = "<!DOCTYPE html><html><head><title>TITLE</title></head><body><p>CONTENT</p></body></html>";
    private static final String TARGET_FOLDER_NAME = "html";

    @Autowired
    private ContentApi contentApi;

    @Override
    public void handleEvent(RepoEvent<DataAttributes<Resource>> event) {
        final NodeResource nodeResource = (NodeResource) event.getData().getResource();
        LOGGER.info("A folder named {} has been created!", nodeResource.getName());

        LOGGER.info("Adding an HTML template", nodeResource.getName());
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        FileItem fileItem = diskFileItemFactory.createItem("filedata", MediaType.APPLICATION_OCTET_STREAM_VALUE, true, "file.html");
        try {
            fileItem.getOutputStream().write(HTML_TEMPLATE.getBytes());
            MultipartFile multipartFile = new CommonsMultipartFile(fileItem);
            contentApi.createNode(nodeResource.getId(), multipartFile, "template.html", null, null, false, true, null, true, null, true, null, null);
        } catch (Exception excp) {
            LOGGER.error("Error creating the HTML template node", excp);
        } finally {
            fileItem.delete();
        }
    }

    @Override
    public EventFilter getEventFilter() {
        return IsFolderFilter.get()
            .and(event -> TARGET_FOLDER_NAME.equalsIgnoreCase(((NodeResource) event.getData().getResource()).getName()));
    }
}
