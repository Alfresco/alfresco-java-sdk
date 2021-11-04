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

import com.alfresco.activiti.model.CompleteFormRepresentation;
import com.alfresco.activiti.model.FormDefinitionRepresentation;
import com.alfresco.activiti.model.FormValueRepresentation;
import com.alfresco.activiti.model.ProcessInstanceVariableRepresentation;
import com.alfresco.activiti.model.SaveFormRepresentation;

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
import org.springframework.cloud.openfeign.CollectionFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Api(value = "TaskForms", description = "the TaskForms API")
public interface TaskFormsApi {

    @ApiOperation(value = "Complete a task form", nickname = "completeTaskFormUsingPOST", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "task-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/task-forms/{taskId}",
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> completeTaskFormUsingPOST(@ApiParam(value = "taskId", required=true) @PathVariable("taskId") String taskId, @ApiParam(value = "" ) @Valid @RequestBody CompleteFormRepresentation body);


    @ApiOperation(value = "Get task variables", nickname = "getProcessInstanceVariablesUsingGET1", notes = "", response = ProcessInstanceVariableRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "task-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProcessInstanceVariableRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/task-forms/{taskId}/variables",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<ProcessInstanceVariableRepresentation>> getProcessInstanceVariablesUsingGET1(@ApiParam(value = "taskId", required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "Retrieve column field values", nickname = "getRestFieldValuesUsingGET1", notes = "Specific case to retrieve information on a specific column", response = FormValueRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "task-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormValueRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/task-forms/{taskId}/form-values/{field}/{column}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<FormValueRepresentation>> getRestFieldValuesUsingGET1(@ApiParam(value = "taskId", required=true) @PathVariable("taskId") String taskId, @ApiParam(value = "field", required=true) @PathVariable("field") String field, @ApiParam(value = "column", required=true) @PathVariable("column") String column);


    @ApiOperation(value = "Retrieve populated field values", nickname = "getRestFieldValuesUsingGET2", notes = "Form field values that are populated through a REST backend, can be retrieved via this service", response = FormValueRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "task-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormValueRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/task-forms/{taskId}/form-values/{field}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<FormValueRepresentation>> getRestFieldValuesUsingGET2(@ApiParam(value = "taskId", required=true) @PathVariable("taskId") String taskId, @ApiParam(value = "field", required=true) @PathVariable("field") String field);


    @ApiOperation(value = "Get a task form", nickname = "getTaskFormUsingGET", notes = "", response = FormDefinitionRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "task-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormDefinitionRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/task-forms/{taskId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<FormDefinitionRepresentation> getTaskFormUsingGET(@ApiParam(value = "taskId", required=true) @PathVariable("taskId") String taskId);


    @ApiOperation(value = "Save a task form", nickname = "saveTaskFormUsingPOST", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "task-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/task-forms/{taskId}/save-form",
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> saveTaskFormUsingPOST(@ApiParam(value = "taskId", required=true) @PathVariable("taskId") String taskId, @ApiParam(value = "" ) @Valid @RequestBody SaveFormRepresentation body);

}
