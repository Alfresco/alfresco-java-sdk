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
package org.alfresco.java.rest.client.sample.service;

import org.alfresco.activiti.audit.handler.AuditEventsControllerImplApi;
import org.alfresco.activiti.audit.model.CloudRuntimeEventModel;
import org.alfresco.activiti.audit.model.CloudRuntimeEventModel.EventTypeEnum;
import org.alfresco.activiti.audit.model.EntryResponseContentCloudRuntimeEventObjectCloudRuntimeEventType;
import org.alfresco.activiti.audit.model.ListResponseContentCloudRuntimeEventObjectCloudRuntimeEventType;
import org.alfresco.activiti.runtime.handler.ProcessInstanceControllerImplApiClient;
import org.alfresco.activiti.runtime.handler.ProcessInstanceTasksControllerImplApi;
import org.alfresco.activiti.runtime.handler.TaskControllerImplApi;
import org.alfresco.activiti.runtime.model.CompleteTaskPayload;
import org.alfresco.activiti.runtime.model.EntryResponseContentCloudProcessInstance;
import org.alfresco.activiti.runtime.model.EntryResponseContentCloudTask;
import org.alfresco.activiti.runtime.model.ListResponseContentCloudTask;
import org.alfresco.activiti.runtime.model.StartProcessPayload;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.http.entity.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RESTClientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RESTClientService.class);
    public static final String PROCESS_DEFINITION_KEY = "SingleTaskProcess";

    private final ProcessInstanceControllerImplApiClient processInstanceControllerImplApiClient;

    private final ProcessInstanceTasksControllerImplApi processInstanceTasksControllerImplApi;

    private final TaskControllerImplApi taskControllerImplApi;

    private final AuditEventsControllerImplApi auditEventsControllerImplApi;

    public RESTClientService(ProcessInstanceControllerImplApiClient processInstanceControllerImplApiClient,
        ProcessInstanceTasksControllerImplApi processInstanceTasksControllerImplApi,
        TaskControllerImplApi taskControllerImplApi,
        AuditEventsControllerImplApi auditEventsControllerImplApi) {
        this.processInstanceControllerImplApiClient = processInstanceControllerImplApiClient;
        this.processInstanceTasksControllerImplApi = processInstanceTasksControllerImplApi;
        this.taskControllerImplApi = taskControllerImplApi;
        this.auditEventsControllerImplApi = auditEventsControllerImplApi;
    }

    @Scheduled(fixedRate = 10000)
    public void triggerAPAInteractions(){

        LOGGER.info(String.format("Starting new process instance with %s definition key", PROCESS_DEFINITION_KEY));

        ResponseEntity<EntryResponseContentCloudProcessInstance> responseEntity = processInstanceControllerImplApiClient
            .startProcess(buildStartProcessPayload(PROCESS_DEFINITION_KEY));

        String processId = responseEntity.getBody().getEntry().getId();

        LOGGER.info(String.format("Process instance with id: %s created!", processId));

        LOGGER.info("Fetching task of the created process instance");

        ResponseEntity<ListResponseContentCloudTask> tasksOfProcessInstance = processInstanceTasksControllerImplApi
            .getTasks(processId, null, null, null);

        Optional<EntryResponseContentCloudTask> optionalTask = tasksOfProcessInstance
            .getBody()
            .getList()
            .getEntries()
            .stream()
            .findFirst();

        String taskId = optionalTask
            .get()
            .getEntry()
            .getId();

        LOGGER.info(String.format("Task of process instance with id: %s fetched!", taskId));

        CompleteTaskPayload completeTaskPayload = new CompleteTaskPayload();
        completeTaskPayload.setPayloadType(CompleteTaskPayload.PayloadTypeEnum.COMPLETETASKPAYLOAD);
        completeTaskPayload.setId(UUID.randomUUID().toString());

        taskControllerImplApi.completeTask(taskId, completeTaskPayload);

        LOGGER.info("Task completed and process finished!!");

        ResponseEntity<ListResponseContentCloudRuntimeEventObjectCloudRuntimeEventType> ListOfAuditRawEvents = auditEventsControllerImplApi
            .findAll("processInstanceId:" + processId,
            null,
            null,
            null);

        List<EventTypeEnum> listOfEventTypes = ListOfAuditRawEvents
            .getBody()
            .getList()
            .getEntries()
            .stream()
            .map(EntryResponseContentCloudRuntimeEventObjectCloudRuntimeEventType::getEntry)
            .map(CloudRuntimeEventModel::getEventType)
            .filter(eventTypeEnum -> eventTypeEnum.toString().contains("PROCESS") || eventTypeEnum.toString().contains("TASK"))
            .collect(Collectors.toList());

        LOGGER.info("This a list of the Audit events in chronological order:" + listOfEventTypes.toString());


    }

    private StartProcessPayload buildStartProcessPayload(String processDefinitionKey) {
        StartProcessPayload startProcessPayload = new StartProcessPayload();
        startProcessPayload.setId(UUID.randomUUID().toString());
        startProcessPayload.setPayloadType(StartProcessPayload.PayloadTypeEnum.STARTPROCESSPAYLOAD);
        startProcessPayload.setProcessDefinitionKey(processDefinitionKey);
        return startProcessPayload;
    }
}
