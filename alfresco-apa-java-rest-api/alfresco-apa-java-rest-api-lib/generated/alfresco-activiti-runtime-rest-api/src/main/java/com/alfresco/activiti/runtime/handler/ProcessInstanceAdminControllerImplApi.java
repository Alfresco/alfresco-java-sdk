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
package com.alfresco.activiti.runtime.handler;

import com.alfresco.activiti.runtime.model.EntryResponseContentOfCloudProcessInstance;
import com.alfresco.activiti.runtime.model.ListResponseContentOfCloudProcessInstance;
import com.alfresco.activiti.runtime.model.ReceiveMessagePayload;
import com.alfresco.activiti.runtime.model.StartMessagePayload;
import com.alfresco.activiti.runtime.model.StartProcessPayload;
import com.alfresco.activiti.runtime.model.UpdateProcessPayload;

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

@Api(value = "ProcessInstanceAdminControllerImpl", description = "the ProcessInstanceAdminControllerImpl API")
public interface ProcessInstanceAdminControllerImplApi {

    @ApiOperation(value = "deleteProcessInstance", nickname = "deleteProcessInstanceUsingDELETE", notes = "", response = EntryResponseContentOfCloudProcessInstance.class, tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfCloudProcessInstance.class),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/admin/v1/process-instances/{processInstanceId}",
        produces = "application/json", 
        method = RequestMethod.DELETE)
    ResponseEntity<EntryResponseContentOfCloudProcessInstance> deleteProcessInstanceUsingDELETE(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getProcessInstanceById", nickname = "getProcessInstanceByIdUsingGET", notes = "", response = EntryResponseContentOfCloudProcessInstance.class, tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfCloudProcessInstance.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/process-instances/{processInstanceId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<EntryResponseContentOfCloudProcessInstance> getProcessInstanceByIdUsingGET(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "getProcessInstances", nickname = "getProcessInstancesUsingGET", notes = "", response = ListResponseContentOfCloudProcessInstance.class, tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentOfCloudProcessInstance.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/process-instances",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ListResponseContentOfCloudProcessInstance> getProcessInstancesUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "receive", nickname = "receiveUsingPUT", notes = "", tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/process-instances/message",
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<Void> receiveUsingPUT(@ApiParam(value = "" ) @Valid @RequestBody ReceiveMessagePayload body);


    @ApiOperation(value = "resume", nickname = "resumeUsingPOST", notes = "", response = EntryResponseContentOfCloudProcessInstance.class, tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/process-instances/{processInstanceId}/resume",
        produces = "application/json", 
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentOfCloudProcessInstance> resumeUsingPOST(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "startProcess", nickname = "startProcessUsingPOST", notes = "", response = EntryResponseContentOfCloudProcessInstance.class, tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/process-instances",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentOfCloudProcessInstance> startProcessUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody StartProcessPayload body);


    @ApiOperation(value = "start", nickname = "startUsingPOST", notes = "", response = EntryResponseContentOfCloudProcessInstance.class, tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/process-instances/message",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentOfCloudProcessInstance> startUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody StartMessagePayload body);


    @ApiOperation(value = "subprocesses", nickname = "subprocessesUsingGET", notes = "", response = ListResponseContentOfCloudProcessInstance.class, tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentOfCloudProcessInstance.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/process-instances/{processInstanceId}/subprocesses",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ListResponseContentOfCloudProcessInstance> subprocessesUsingGET(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId, @ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "suspend", nickname = "suspendUsingPOST", notes = "", response = EntryResponseContentOfCloudProcessInstance.class, tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/process-instances/{processInstanceId}/suspend",
        produces = "application/json", 
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentOfCloudProcessInstance> suspendUsingPOST(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "updateProcess", nickname = "updateProcessUsingPUT", notes = "", response = EntryResponseContentOfCloudProcessInstance.class, tags={ "process-instance-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfCloudProcessInstance.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/process-instances/{processInstanceId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<EntryResponseContentOfCloudProcessInstance> updateProcessUsingPUT(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId, @ApiParam(value = "" ) @Valid @RequestBody UpdateProcessPayload body);

}
