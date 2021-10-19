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
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.alfresco.activiti.runtime.handler;

import com.alfresco.activiti.runtime.model.AssignTaskPayload;
import com.alfresco.activiti.runtime.model.CompleteTaskPayload;
import com.alfresco.activiti.runtime.model.EntryResponseContentCloudTask;
import com.alfresco.activiti.runtime.model.ListResponseContentCloudTask;
import com.alfresco.activiti.runtime.model.UpdateTaskPayload;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "TaskAdminControllerImpl")
public interface TaskAdminControllerImplApi {

    @ApiOperation(value = "assign", nickname = "assignUsingPOST", notes = "", response = EntryResponseContentCloudTask.class, tags={ "task-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudTask.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/tasks/{taskId}/assign",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentCloudTask> assignUsingPOST(@ApiParam(value = "assignTaskPayload" ,required=true )  @Valid @RequestBody AssignTaskPayload assignTaskPayload,@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "completeTask", nickname = "completeTaskUsingPOST", notes = "", response = EntryResponseContentCloudTask.class, tags={ "task-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudTask.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/tasks/{taskId}/complete",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<EntryResponseContentCloudTask> completeTaskUsingPOST(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId,@ApiParam(value = "completeTaskPayload"  )  @Valid @RequestBody CompleteTaskPayload completeTaskPayload);


    @ApiOperation(value = "deleteTask", nickname = "deleteTaskUsingDELETE", notes = "", response = EntryResponseContentCloudTask.class, tags={ "task-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudTask.class),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/admin/v1/tasks/{taskId}",
        produces = "application/json", 
        method = RequestMethod.DELETE)
    ResponseEntity<EntryResponseContentCloudTask> deleteTaskUsingDELETE(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "getTaskById", nickname = "getTaskByIdUsingGET", notes = "", response = EntryResponseContentCloudTask.class, tags={ "task-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudTask.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/tasks/{taskId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<EntryResponseContentCloudTask> getTaskByIdUsingGET(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "getTasks", nickname = "getTasksUsingGET1", notes = "", response = ListResponseContentCloudTask.class, tags={ "task-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentCloudTask.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/tasks",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ListResponseContentCloudTask> getTasksUsingGET1(@ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems,@ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount,@ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "updateTask", nickname = "updateTaskUsingPUT", notes = "", response = EntryResponseContentCloudTask.class, tags={ "task-admin-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentCloudTask.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/tasks/{taskId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<EntryResponseContentCloudTask> updateTaskUsingPUT(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId,@ApiParam(value = "updateTaskPayload" ,required=true )  @Valid @RequestBody UpdateTaskPayload updateTaskPayload);

}
