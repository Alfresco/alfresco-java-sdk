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
package com.alfresco.activiti.query.handler;

import com.alfresco.activiti.query.model.EntryResponseContentOfQueryCloudTask;
import com.alfresco.activiti.query.model.ListResponseContentOfQueryCloudTask;
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

@Api(value = "TaskAdminController")
public interface TaskAdminControllerApi {

    @ApiOperation(value = "findAll", nickname = "findAllUsingGET9", notes = "", response = ListResponseContentOfQueryCloudTask.class, tags={ "task-admin-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentOfQueryCloudTask.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/tasks",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ListResponseContentOfQueryCloudTask> findAllUsingGET9(@ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems,@ApiParam(value = "rootTasksOnly", defaultValue = "false") @Valid @RequestParam(value = "rootTasksOnly", required = false, defaultValue="false") Boolean rootTasksOnly,@ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount,@ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort,@ApiParam(value = "standalone", defaultValue = "false") @Valid @RequestParam(value = "standalone", required = false, defaultValue="false") Boolean standalone,@ApiParam(value = "") @Valid @RequestParam(value = "variables.name", required = false) String variablesName,@ApiParam(value = "") @Valid @RequestParam(value = "variables.type", required = false) String variablesType,@ApiParam(value = "") @Valid @RequestParam(value = "variables.value", required = false) String variablesValue);


    @ApiOperation(value = "findById", nickname = "findByIdUsingGET5", notes = "", response = EntryResponseContentOfQueryCloudTask.class, tags={ "task-admin-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfQueryCloudTask.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/tasks/{taskId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<EntryResponseContentOfQueryCloudTask> findByIdUsingGET5(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "getTaskCandidateGroups", nickname = "getTaskCandidateGroupsUsingGET", notes = "", response = String.class, responseContainer = "List", tags={ "task-admin-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/tasks/{taskId}/candidate-groups",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> getTaskCandidateGroupsUsingGET(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "getTaskCandidateUsers", nickname = "getTaskCandidateUsersUsingGET", notes = "", response = String.class, responseContainer = "List", tags={ "task-admin-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/tasks/{taskId}/candidate-users",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> getTaskCandidateUsersUsingGET(@ApiParam(value = "taskId",required=true) @PathVariable("taskId") String taskId);

}
