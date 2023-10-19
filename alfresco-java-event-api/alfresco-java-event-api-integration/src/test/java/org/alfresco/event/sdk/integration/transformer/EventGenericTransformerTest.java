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
package org.alfresco.event.sdk.integration.transformer;

import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.alfresco.event.sdk.handling.EventHandlingException;
import org.alfresco.repo.event.v1.model.DataAttributes;
import org.alfresco.repo.event.v1.model.EventData;
import org.alfresco.repo.event.v1.model.NodeResource;
import org.alfresco.repo.event.v1.model.RepoEvent;
import org.alfresco.repo.event.v1.model.Resource;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;

/**
 * Unit tests for {@link EventGenericTransformer}.
 */
public class EventGenericTransformerTest {

    private static final String MOCK_PROPER_JSON = "{}";
    private static final String MOCK_INCORRECT_JSON = "not-valid";

    @Mock
    private ObjectMapper mockObjectMapper;

    private EventGenericTransformer eventGenericTransformer;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
        eventGenericTransformer = new EventGenericTransformer();
    }

    @Test
    public void should_returnRepoEventObject_when_properJSONEventIsReceived() throws Exception {
        final RepoEvent<? extends DataAttributes<? extends Resource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder()
                .build();
        given(mockObjectMapper.readValue(eq(MOCK_PROPER_JSON), any(TypeReference.class))).willReturn(repoEvent);

        final RepoEvent<? extends DataAttributes<? extends Resource>> result = eventGenericTransformer.transform(MOCK_PROPER_JSON);

        assertThat(result).isEqualTo(repoEvent);
    }

    @Test(expected = EventHandlingException.class)
    public void should_throwEventHandlingException_when_incorrectJSONEventIsReceived() throws Exception {
        given(mockObjectMapper.readValue(eq(MOCK_INCORRECT_JSON), any(TypeReference.class))).willThrow(new JsonEOFException(null, null, ""));

        eventGenericTransformer.transform(MOCK_INCORRECT_JSON);
    }
}
