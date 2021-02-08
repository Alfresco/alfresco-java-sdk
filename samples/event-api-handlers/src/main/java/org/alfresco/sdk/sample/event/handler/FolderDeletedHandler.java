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
