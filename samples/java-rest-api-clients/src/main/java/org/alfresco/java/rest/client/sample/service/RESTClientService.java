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

import com.alfresco.activiti.runtime.handler.ProcessInstanceControllerImplApiClient;
import com.alfresco.activiti.runtime.handler.ProcessInstanceTasksControllerImplApi;
import com.alfresco.activiti.runtime.handler.TaskControllerImplApi;
import com.alfresco.activiti.runtime.model.EntryResponseContentOfCloudProcessInstance;
import com.alfresco.activiti.runtime.model.EntryResponseContentOfCloudTask;
import com.alfresco.activiti.runtime.model.ListResponseContentOfCloudTask;
import com.alfresco.activiti.runtime.model.StartProcessPayload;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RESTClientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RESTClientService.class);
    public static final String PROCESS_DEFINITION_KEY = "SingleTaskProcess";

    private final ProcessInstanceControllerImplApiClient processInstanceControllerImplApiClient;

    private final ProcessInstanceTasksControllerImplApi processInstanceTasksControllerImplApi;

    public RESTClientService(ProcessInstanceControllerImplApiClient processInstanceControllerImplApiClient,
        ProcessInstanceTasksControllerImplApi processInstanceTasksControllerImplApi) {
        this.processInstanceControllerImplApiClient = processInstanceControllerImplApiClient;
        this.processInstanceTasksControllerImplApi = processInstanceTasksControllerImplApi;
    }

    @Scheduled(fixedRate = 5000)
    public void startProcessInstance(){

        LOGGER.info(String.format("Starting new process instance with %s definition key", PROCESS_DEFINITION_KEY));

        ResponseEntity<EntryResponseContentOfCloudProcessInstance> responseEntity = processInstanceControllerImplApiClient
            .startProcessUsingPOST1(buildStartProcessPayload(PROCESS_DEFINITION_KEY));

        String processId = responseEntity.getBody().getEntry().getId();

        LOGGER.info(String.format("Process instance with id: %s created!", processId));

        LOGGER.info("Fetching task of the created process instance");

        ResponseEntity<ListResponseContentOfCloudTask> tasksOfProcessInstance = processInstanceTasksControllerImplApi
            .getTasksUsingGET(processId, null, null, null);

        Optional<EntryResponseContentOfCloudTask> optionalTask = tasksOfProcessInstance
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



    }

    private StartProcessPayload buildStartProcessPayload(String processDefinitionKey) {
        StartProcessPayload startProcessPayload = new StartProcessPayload();
        startProcessPayload.setId(UUID.randomUUID().toString());
        startProcessPayload.setPayloadType(StartProcessPayload.PayloadTypeEnum.STARTPROCESSPAYLOAD);
        startProcessPayload.setProcessDefinitionKey(processDefinitionKey);
        return startProcessPayload;
    }
}
