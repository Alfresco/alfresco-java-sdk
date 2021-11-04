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

import com.alfresco.activiti.model.ResultListDataRepresentationSubmittedFormRepresentation;
import com.alfresco.activiti.model.SubmittedFormRepresentation;

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

@Api(value = "SubmittedForms", description = "the SubmittedForms API")
public interface SubmittedFormsApi {

    @ApiOperation(value = "List submissions for a form", nickname = "getFormSubmittedFromsUsingGET", notes = "", response = ResultListDataRepresentationSubmittedFormRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "submitted-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationSubmittedFormRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/form-submitted-forms/{formId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationSubmittedFormRepresentation> getFormSubmittedFromsUsingGET(@ApiParam(value = "formId", required=true) @PathVariable("formId") Long formId, @ApiParam(value = "submittedBy") @Valid @RequestParam(value = "submittedBy", required = false) Long submittedBy, @ApiParam(value = "start") @Valid @RequestParam(value = "start", required = false) Integer start, @ApiParam(value = "size") @Valid @RequestParam(value = "size", required = false) Integer size);


    @ApiOperation(value = "List submissions for a process instance", nickname = "getProcessSubmittedFromsUsingGET", notes = "", response = ResultListDataRepresentationSubmittedFormRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "submitted-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationSubmittedFormRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/process-submitted-forms/{processId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationSubmittedFormRepresentation> getProcessSubmittedFromsUsingGET(@ApiParam(value = "processId", required=true) @PathVariable("processId") String processId);


    @ApiOperation(value = "Get a form submission", nickname = "getSubmittedFromUsingGET", notes = "", response = SubmittedFormRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "submitted-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SubmittedFormRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/submitted-forms/{submittedFormId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<SubmittedFormRepresentation> getSubmittedFromUsingGET(@ApiParam(value = "submittedFormId", required=true) @PathVariable("submittedFormId") Long submittedFormId);


    @ApiOperation(value = "Get the submitted form for a task", nickname = "getTaskSubmittedFromsUsingGET", notes = "", response = SubmittedFormRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "submitted-forms", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SubmittedFormRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/task-submitted-form/{taskId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<SubmittedFormRepresentation> getTaskSubmittedFromsUsingGET(@ApiParam(value = "taskId", required=true) @PathVariable("taskId") String taskId);

}
