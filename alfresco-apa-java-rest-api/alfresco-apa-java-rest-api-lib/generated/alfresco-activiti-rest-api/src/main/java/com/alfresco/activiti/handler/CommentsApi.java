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
package com.alfresco.activiti.handler;

import com.alfresco.activiti.model.CommentRepresentation;
import com.alfresco.activiti.model.ResultListDataRepresentationCommentRepresentation;

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

@Api(value = "Comments", description = "the Comments API")
public interface CommentsApi {

    @ApiOperation(value = "Add a comment to a process instance", nickname = "addProcessInstanceCommentUsingPOST", notes = "", response = CommentRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/process-instances/{processInstanceId}/comments",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CommentRepresentation> addProcessInstanceCommentUsingPOST(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId, @ApiParam(value = "" ) @Valid @RequestBody CommentRepresentation body);


    @ApiOperation(value = "Add a comment to a task", nickname = "addTaskCommentUsingPOST", notes = "", response = CommentRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CommentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/tasks/{taskId}/comments",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<CommentRepresentation> addTaskCommentUsingPOST(@ApiParam(value = "taskId", required=true) @PathVariable("taskId") String taskId, @ApiParam(value = "" ) @Valid @RequestBody CommentRepresentation body);


    @ApiOperation(value = "Get comments for a process", nickname = "getProcessInstanceCommentsUsingGET", notes = "", response = ResultListDataRepresentationCommentRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationCommentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/process-instances/{processInstanceId}/comments",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationCommentRepresentation> getProcessInstanceCommentsUsingGET(@ApiParam(value = "processInstanceId", required=true) @PathVariable("processInstanceId") String processInstanceId, @ApiParam(value = "latestFirst") @Valid @RequestParam(value = "latestFirst", required = false) Boolean latestFirst);


    @ApiOperation(value = "Get comments for a task", nickname = "getTaskCommentsUsingGET", notes = "", response = ResultListDataRepresentationCommentRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationCommentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/tasks/{taskId}/comments",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationCommentRepresentation> getTaskCommentsUsingGET(@ApiParam(value = "taskId", required=true) @PathVariable("taskId") String taskId, @ApiParam(value = "latestFirst") @Valid @RequestParam(value = "latestFirst", required = false) Boolean latestFirst);

}