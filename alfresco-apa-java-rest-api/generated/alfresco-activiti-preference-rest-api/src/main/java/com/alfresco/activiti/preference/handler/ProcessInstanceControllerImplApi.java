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
/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.29).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.alfresco.activiti.preference.handler;

import com.alfresco.activiti.preference.model.CreateProcessInstancePayload;
import com.alfresco.activiti.preference.model.EntryResponseContentCloudProcessInstance;
import com.alfresco.activiti.preference.model.ListResponseContentCloudProcessInstance;
import com.alfresco.activiti.preference.model.ReceiveMessagePayload;
import com.alfresco.activiti.preference.model.SignalPayload;
import com.alfresco.activiti.preference.model.StartMessagePayload;
import com.alfresco.activiti.preference.model.StartProcessPayload;
import com.alfresco.activiti.preference.model.UpdateProcessPayload;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Api(value = "ProcessInstanceControllerImpl", description = "the ProcessInstanceControllerImpl API")
public interface ProcessInstanceControllerImplApi {

    @ApiOperation(value = "createProcessInstance", nickname = "createProcessInstanceUsingPOST", notes = "", response = EntryResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/create",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentCloudProcessInstance> createProcessInstanceUsingPOST(@ApiParam(value = "createProcessInstancePayload", required=true ) @Valid @RequestBody CreateProcessInstancePayload body);


    @ApiOperation(value = "deleteProcessInstance", nickname = "deleteProcessInstanceUsingDELETE1", notes = "", response = EntryResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}",
        produces = "application/json", 
        method = RequestMethod.DELETE)
    ResponseEntity<EntryResponseContentCloudProcessInstance> deleteProcessInstanceUsingDELETE1(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getProcessDiagram", nickname = "getProcessDiagramUsingGET", notes = "", response = String.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/model",
        produces = "image/svg+xml", 
        method = RequestMethod.GET)
    ResponseEntity<String> getProcessDiagramUsingGET(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getProcessInstanceById", nickname = "getProcessInstanceByIdUsingGET1", notes = "", response = EntryResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<EntryResponseContentCloudProcessInstance> getProcessInstanceByIdUsingGET1(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getProcessInstances", nickname = "getProcessInstancesUsingGET1", notes = "", response = ListResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ListResponseContentCloudProcessInstance> getProcessInstancesUsingGET1(@ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "receive", nickname = "receiveUsingPUT1", notes = "", tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/message",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Void> receiveUsingPUT1(@ApiParam(value = "receiveMessagePayload", required=true ) @Valid @RequestBody ReceiveMessagePayload body);


    @ApiOperation(value = "resume", nickname = "resumeUsingPOST1", notes = "", response = EntryResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/resume",
        produces = "application/json", 
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentCloudProcessInstance> resumeUsingPOST1(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "sendSignal", nickname = "sendSignalUsingPOST", notes = "", tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/signal",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> sendSignalUsingPOST(@ApiParam(value = "cmd", required=true ) @Valid @RequestBody SignalPayload body);


    @ApiOperation(value = "sendStartMessage", nickname = "sendStartMessageUsingPOST", notes = "", response = EntryResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/message",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentCloudProcessInstance> sendStartMessageUsingPOST(@ApiParam(value = "startMessagePayload", required=true ) @Valid @RequestBody StartMessagePayload body);


    @ApiOperation(value = "startCreatedProcess", nickname = "startCreatedProcessUsingPOST", notes = "", response = EntryResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/start",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentCloudProcessInstance> startCreatedProcessUsingPOST(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId, @ApiParam(value = "startProcessPayload" ) @Valid @RequestBody StartProcessPayload body);


    @ApiOperation(value = "startProcess", nickname = "startProcessUsingPOST1", notes = "", response = EntryResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentCloudProcessInstance> startProcessUsingPOST1(@ApiParam(value = "startProcessPayload", required=true ) @Valid @RequestBody StartProcessPayload body);


    @ApiOperation(value = "subprocesses", nickname = "subprocessesUsingGET1", notes = "", response = ListResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/subprocesses",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ListResponseContentCloudProcessInstance> subprocessesUsingGET1(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId, @ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "suspend", nickname = "suspendUsingPOST1", notes = "", response = EntryResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/suspend",
        produces = "application/json", 
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentCloudProcessInstance> suspendUsingPOST1(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "updateProcess", nickname = "updateProcessUsingPUT1", notes = "", response = EntryResponseContentCloudProcessInstance.class, tags={ "process-instance-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<EntryResponseContentCloudProcessInstance> updateProcessUsingPUT1(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId, @ApiParam(value = "payload", required=true ) @Valid @RequestBody UpdateProcessPayload body);

}
