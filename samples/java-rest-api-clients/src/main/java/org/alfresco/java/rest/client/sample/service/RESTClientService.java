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
import com.alfresco.activiti.runtime.model.StartProcessPayload;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RESTClientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RESTClientService.class);

    private final ProcessInstanceControllerImplApiClient processInstanceControllerImplApiClient;

    public RESTClientService(ProcessInstanceControllerImplApiClient processInstanceControllerImplApiClient) {
        this.processInstanceControllerImplApiClient = processInstanceControllerImplApiClient;
    }

    @Scheduled(fixedRate = 5000)
    public void startProcessInstance(){

        LOGGER.info("STARTING PROCESS");

//        processInstanceControllerImplApiClient.startProcessUsingPOST1(buildStartProcessPayload(
//            "SingleTaskProcess",
//            null
//        ));

        LOGGER.info("PROCESS STARTED");
    }

    private StartProcessPayload buildStartProcessPayload(String processDefinitionKey,
        Map<String, Object> variables) {
        StartProcessPayload startProcessPayload = new StartProcessPayload();
        startProcessPayload.setId(UUID.randomUUID().toString());
        startProcessPayload.setPayloadType(StartProcessPayload.PayloadTypeEnum.STARTPROCESSPAYLOAD);
//        startProcessPayload.setProcessDefinitionId(processDefinitionId);
        startProcessPayload.setProcessDefinitionKey(processDefinitionKey);
        startProcessPayload.setVariables(variables);
        return startProcessPayload;
    }
}
