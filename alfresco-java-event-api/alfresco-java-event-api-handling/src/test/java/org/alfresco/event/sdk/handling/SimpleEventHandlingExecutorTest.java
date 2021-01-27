/*
 * Copyright 2010-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.alfresco.event.sdk.handling;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Collections;
import java.util.List;
import org.alfresco.event.sdk.handling.handler.EventHandler;
import org.alfresco.event.sdk.model.v1.model.DataAttributes;
import org.alfresco.event.sdk.model.v1.model.RepoEvent;
import org.alfresco.event.sdk.model.v1.model.Resource;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Unit tests for {@link SimpleEventHandlingExecutor}.
 */
public class SimpleEventHandlingExecutorTest {

    @Mock
    private EventHandler mockEventHandler;
    @Mock
    private EventHandlingRegistry mockEventHandlingRegistry;

    private SimpleEventHandlingExecutor simpleEventHandlingExecutor;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
        simpleEventHandlingExecutor = new SimpleEventHandlingExecutor(mockEventHandlingRegistry);
    }

    @Test
    public void should_executeEventHandler_when_repEventForExistingEventHandlerIsSent() {
        final RepoEvent<DataAttributes<Resource>> repoEvent = RepoEvent.<DataAttributes<Resource>>builder()
                .build();
        given(mockEventHandlingRegistry.getEventHandlers(repoEvent)).willReturn(List.of(mockEventHandler));
        given(mockEventHandler.getEventFilter()).willReturn(event -> true);

        simpleEventHandlingExecutor.executeEventHandlers(repoEvent);

        verify(mockEventHandler, times(1)).handleEvent(repoEvent);
    }

    @Test
    public void should_notExecuteEventHandler_when_repEventForExistingEventHandlerNotMatchingFiltersIsSent() {
        final RepoEvent<DataAttributes<Resource>> repoEvent = RepoEvent.<DataAttributes<Resource>>builder()
                .build();
        given(mockEventHandlingRegistry.getEventHandlers(repoEvent)).willReturn(List.of(mockEventHandler));
        given(mockEventHandler.getEventFilter()).willReturn(event -> false);

        simpleEventHandlingExecutor.executeEventHandlers(repoEvent);

        verify(mockEventHandler, never()).handleEvent(repoEvent);
    }

    @Test
    public void should_notExecuteEventHandler_when_repEventForNonExistingEventHandlerIsSent() {
        final RepoEvent<DataAttributes<Resource>> repoEvent = RepoEvent.<DataAttributes<Resource>>builder()
                .build();
        given(mockEventHandlingRegistry.getEventHandlers(repoEvent)).willReturn(Collections.EMPTY_LIST);
        given(mockEventHandler.getEventFilter()).willReturn(event -> false);

        simpleEventHandlingExecutor.executeEventHandlers(repoEvent);

        verify(mockEventHandler, never()).handleEvent(repoEvent);
    }
}
