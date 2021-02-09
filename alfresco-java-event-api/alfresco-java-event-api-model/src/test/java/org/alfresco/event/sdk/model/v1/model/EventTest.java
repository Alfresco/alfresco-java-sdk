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

import static org.alfresco.event.sdk.model.util.TestUtil.JSON_COMPARATOR;
import static org.alfresco.event.sdk.model.util.TestUtil.getDataSchema;
import static org.alfresco.event.sdk.model.util.TestUtil.getSource;
import static org.alfresco.event.sdk.model.util.TestUtil.getTestNodePrimaryHierarchy;
import static org.alfresco.event.sdk.model.util.TestUtil.getUUID;
import static org.alfresco.event.sdk.model.util.TestUtil.parseTime;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Set;
import org.alfresco.event.sdk.model.databind.ObjectMapperFactory;
import org.alfresco.event.sdk.model.util.TestUtil;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class EventTest {

    private static final ObjectMapper OBJECT_MAPPER = ObjectMapperFactory.createInstance();

    @Test
    public void nodeCreatedEvent_marshalling() throws Exception {
        final NodeResource resource = NodeResource.builder()
                .setId(getUUID())
                .setName("testFile.txt")
                .setPrimaryHierarchy(getTestNodePrimaryHierarchy())
                .setIsFile(true)
                .setIsFolder(false)
                .setNodeType("cm:content")
                .setCreatedByUser(new UserInfo("john.doe", "John", "Doe"))
                .setCreatedAt(ZonedDateTime.now())
                .setModifiedByUser(new UserInfo("jane.doe", "Jane", "Doe"))
                .setModifiedAt(ZonedDateTime.now())
                .setProperties(Map.of("cm:title", "test title"))
                .setAspectNames(Set.of("cm:titled", "cm:auditable"))
                .setContent(new ContentInfo("text/plain", 16L, "UTF-8"))
                .build();

        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setEventGroupId(getUUID())
                .setResource(resource)
                .build();

        final RepoEvent<EventData<NodeResource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder().setId(getUUID())
                .setSource(getSource())
                .setTime(ZonedDateTime.now())
                .setType(EventType.NODE_CREATED.getType())
                .setData(eventData)
                .setDataschema(getDataSchema("nodeCreated"))
                .build();

        final String result = OBJECT_MAPPER.writeValueAsString(repoEvent);
        final String expectedJson = TestUtil.getResourceFileAsString("NodeCreatedEvent.json");
        // Compare the Json files
        checkExpectedJsonBody(expectedJson, result);
    }

    @Test
    public void nodeCreatedEvent_unmarshalling() throws Exception {
        final String nodeCreatedEventJson = TestUtil.getResourceFileAsString("NodeCreatedEvent.json");
        assertNotNull(nodeCreatedEventJson);
        final RepoEvent<EventData<NodeResource>> result = OBJECT_MAPPER.readValue(nodeCreatedEventJson, new TypeReference<>() {
        });

        final NodeResource resource = NodeResource.builder()
                .setId("7491120a-e2cb-478f-8599-ebf057cc0c7c")
                .setName("testFile.txt")
                .setPrimaryHierarchy(getTestNodePrimaryHierarchy())
                .setIsFile(true)
                .setIsFolder(false)
                .setNodeType("cm:content")
                .setCreatedByUser(new UserInfo("john.doe", "John", "Doe"))
                .setCreatedAt(parseTime("2020-04-27T12:37:03.555624+01:00"))
                .setModifiedByUser(new UserInfo("jane.doe", "Jane", "Doe"))
                .setModifiedAt(parseTime("2020-04-27T12:37:03.557956+01:00"))
                .setProperties(Map.of("cm:title", "test title"))
                .setAspectNames(Set.of("cm:titled", "cm:auditable"))
                .setContent(new ContentInfo("text/plain", 16L, "UTF-8"))
                .build();

        final EventData<NodeResource> eventData = EventData.<NodeResource>builder().setEventGroupId(
                "cb645043-e7d2-4e51-b61d-e6d01582cbab")
                .setResource(resource).build();

        final RepoEvent<EventData<NodeResource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder().setId(
                "97c1b36c-c569-4c66-8a31-7a8d0b6b804a")
                .setSource(getSource())
                .setTime(parseTime("2020-04-27T12:37:03.560134+01:00"))
                .setType(EventType.NODE_CREATED.getType())
                .setData(eventData)
                .setDataschema(getDataSchema("nodeCreated"))
                .build();

        assertEquals(repoEvent, result);
    }

    @Test
    public void nodeUpdatedEvent_marshalling() throws Exception {
        final NodeResource resource = NodeResource.builder()
                .setId(getUUID())
                .setName("testFile.txt")
                .setPrimaryHierarchy(getTestNodePrimaryHierarchy())
                .setIsFile(true)
                .setIsFolder(false)
                .setNodeType("cm:content")
                .setCreatedByUser(new UserInfo("john.doe", "John", "Doe"))
                .setCreatedAt(ZonedDateTime.now())
                .setModifiedByUser(new UserInfo("jane.doe", "Jane", "Doe"))
                .setModifiedAt(ZonedDateTime.now())
                .setProperties(Map.of("cm:title", "test title2", "cm:description", "test description."))
                .setAspectNames(Set.of("cm:titled", "cm:auditable"))
                .setContent(new ContentInfo("text/plain", 16L, "UTF-8"))
                .build();

        final NodeResource resourceBefore = NodeResource.builder()
                .setModifiedByUser(new UserInfo("jane.doe", "Jane", "Doe"))
                .setModifiedAt(ZonedDateTime.now())
                .setProperties(Map.of("cm:title", "test title"))
                .build();

        final EventData<NodeResource> eventData = EventData.<NodeResource>builder()
                .setEventGroupId(getUUID())
                .setResource(resource)
                .setResourceBefore(resourceBefore)
                .build();

        final RepoEvent<EventData<NodeResource>> repoEvent = RepoEvent.<EventData<NodeResource>>builder().setId(getUUID())
                .setSource(getSource())
                .setTime(ZonedDateTime.now())
                .setType(EventType.NODE_UPDATED.getType())
                .setData(eventData)
                .setDataschema(getDataSchema("nodeUpdated"))
                .build();

        final String result = OBJECT_MAPPER.writeValueAsString(repoEvent);
        final String expectedJson = TestUtil.getResourceFileAsString("NodeUpdatedEvent.json");
        // Compare the Json files
        checkExpectedJsonBody(expectedJson, result);
    }

    @Test
    public void nodeUpdatedEvent_unmarshalling() throws Exception {
        final String nodeUpdatedEventJson = TestUtil.getResourceFileAsString("NodeUpdatedEvent.json");
        assertNotNull(nodeUpdatedEventJson);
        final RepoEvent<EventData<NodeResource>> result = OBJECT_MAPPER.readValue(nodeUpdatedEventJson, new TypeReference<>() {
        });

        final NodeResource expectedResource = NodeResource.builder()
                .setId("d366f805-853f-46ac-a81c-af9c257ee876")
                .setName("testFile.txt")
                .setPrimaryHierarchy(getTestNodePrimaryHierarchy())
                .setIsFile(true)
                .setIsFolder(false)
                .setNodeType("cm:content")
                .setCreatedByUser(new UserInfo("john.doe", "John", "Doe"))
                .setCreatedAt(parseTime("2020-04-27T14:25:59.852475+01:00"))
                .setModifiedByUser(new UserInfo("jane.doe", "Jane", "Doe"))
                .setModifiedAt(parseTime("2020-04-27T14:25:59.854153+01:00"))
                .setProperties(Map.of("cm:title", "test title2", "cm:description", "test description."))
                .setAspectNames(Set.of("cm:titled", "cm:auditable"))
                .setContent(new ContentInfo("text/plain", 16L, "UTF-8"))
                .build();

        final NodeResource expectedResourceBefore = NodeResource.builder()
                .setModifiedByUser(new UserInfo("jane.doe", "Jane", "Doe"))
                .setModifiedAt(parseTime("2020-04-27T14:25:59.854558+01:00"))
                .setProperties(Map.of("cm:title", "test title"))
                .build();

        final EventData<NodeResource> expectedEventData = EventData.<NodeResource>builder()
                .setEventGroupId("ce852a52-609e-4b7d-8438-04e211fd76a0")
                .setResource(expectedResource)
                .setResourceBefore(expectedResourceBefore)
                .build();

        final RepoEvent<EventData<NodeResource>> expectedRepoEvent = RepoEvent.<EventData<NodeResource>>builder().setId(
                "df708027-e0a8-4b30-92a5-0d19235a7800")
                .setSource(getSource())
                .setTime(parseTime("2020-04-27T14:25:59.855866+01:00"))
                .setType(EventType.NODE_UPDATED.getType())
                .setData(expectedEventData)
                .setDataschema(getDataSchema("nodeUpdated"))
                .build();

        assertEquals(expectedRepoEvent, result);
    }

    @Test
    public void childAssocCreatedEvent_marshalling() throws Exception {
        final ChildAssociationResource childAssocResource = new ChildAssociationResource(getUUID(), getUUID(), "cm:contains");

        final EventData<ChildAssociationResource> eventData = EventData.<ChildAssociationResource>builder()
                .setEventGroupId(getUUID())
                .setResource(childAssocResource)
                .build();

        final RepoEvent<EventData<ChildAssociationResource>> repoEvent = RepoEvent.<EventData<ChildAssociationResource>>builder()
                .setId(getUUID())
                .setSource(getSource())
                .setTime(ZonedDateTime.now())
                .setType(EventType.CHILD_ASSOC_CREATED.getType())
                .setData(eventData)
                .setDataschema(getDataSchema("childAssocCreated"))
                .build();

        final String result = OBJECT_MAPPER.writeValueAsString(repoEvent);
        final String expectedJson = TestUtil.getResourceFileAsString("ChildAssocCreated.json");
        // Compare the Json files
        checkExpectedJsonBody(expectedJson, result);
    }

    @Test
    public void childAssocCreatedEvent_unmarshalling() throws Exception {
        final String childAssocCreatedEventJson = TestUtil.getResourceFileAsString("ChildAssocCreated.json");
        assertNotNull(childAssocCreatedEventJson);
        final RepoEvent<EventData<ChildAssociationResource>> result = OBJECT_MAPPER.readValue(childAssocCreatedEventJson, new TypeReference<>() {
        });

        final ChildAssociationResource expectedResource = new ChildAssociationResource("7624edb6-6f28-4130-a4fb-4a5362807a05",
                "5d9f3d6f-9802-4bb6-8ad3-0f9261d08894",
                "cm:contains");

        final EventData<ChildAssociationResource> expectedEventData = EventData.<ChildAssociationResource>builder()
                .setEventGroupId("d933857e-5f4f-406e-aa5f-c747901f5a8f")
                .setResource(expectedResource)
                .build();

        final RepoEvent<EventData<ChildAssociationResource>> expectedRepoEvent = RepoEvent.<EventData<ChildAssociationResource>>builder()
                .setId("928c28fc-da23-441d-bb8b-72b068a9ceb5")
                .setSource(getSource())
                .setTime(parseTime("2020-05-28T09:56:52.235411+01:00"))
                .setType(EventType.CHILD_ASSOC_CREATED.getType())
                .setData(expectedEventData)
                .setDataschema(getDataSchema("childAssocCreated"))
                .build();

        assertEquals(expectedRepoEvent, result);
    }

    @Test
    public void peerAssocCreatedEvent_marshalling() throws Exception {
        final PeerAssociationResource peerAssocResource = new PeerAssociationResource(getUUID(), getUUID(), "cm:references");

        final EventData<PeerAssociationResource> eventData = EventData.<PeerAssociationResource>builder()
                .setEventGroupId(getUUID())
                .setResource(peerAssocResource)
                .build();

        final RepoEvent<EventData<PeerAssociationResource>> repoEvent = RepoEvent.<EventData<PeerAssociationResource>>builder()
                .setId(getUUID())
                .setSource(getSource())
                .setTime(ZonedDateTime.now())
                .setType(EventType.PEER_ASSOC_CREATED.getType())
                .setData(eventData)
                .setDataschema(getDataSchema("peerAssocCreated"))
                .build();

        final String result = OBJECT_MAPPER.writeValueAsString(repoEvent);
        final String expectedJson = TestUtil.getResourceFileAsString("PeerAssocCreated.json");
        // Compare the Json files
        checkExpectedJsonBody(expectedJson, result);
    }

    @Test
    public void peerAssocCreatedEvent_unmarshalling() throws Exception {
        final String peerAssocCreatedEventJson = TestUtil.getResourceFileAsString("PeerAssocCreated.json");
        assertNotNull(peerAssocCreatedEventJson);
        final RepoEvent<EventData<PeerAssociationResource>> result = OBJECT_MAPPER.readValue(peerAssocCreatedEventJson, new TypeReference<>() {
        });

        final PeerAssociationResource expectedResource = new PeerAssociationResource("d323671c-9bd0-483e-8471-bd64cea73c09",
                "595c55b0-64b3-4f1b-95f8-c1cc6b3843a2",
                "cm:references");

        final EventData<PeerAssociationResource> expectedEventData = EventData.<PeerAssociationResource>builder()
                .setEventGroupId("b23f75d0-45da-40d1-9063-eb800a4f2444")
                .setResource(expectedResource)
                .build();

        final RepoEvent<EventData<PeerAssociationResource>> expectedRepoEvent = RepoEvent.<EventData<PeerAssociationResource>>builder()
                .setId("8677a369-a30d-469e-b313-e5bf1b590c8e")
                .setSource(getSource())
                .setTime(parseTime("2020-05-28T10:36:21.291392+01:00"))
                .setType(EventType.PEER_ASSOC_CREATED.getType())
                .setData(expectedEventData)
                .setDataschema(getDataSchema("peerAssocCreated"))
                .build();

        assertEquals(expectedRepoEvent, result);
    }

    private void checkExpectedJsonBody(final String expectedJsonBody, final String actualJsonBody) throws Exception {
        JSONAssert.assertEquals(expectedJsonBody, actualJsonBody, JSON_COMPARATOR);
    }
}
