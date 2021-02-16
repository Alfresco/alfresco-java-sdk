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
package org.alfresco.activiti.handler;

import java.util.List;
import org.alfresco.activiti.model.RestVariable;
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

@Api(value = "ProcessInstanceVariables")
public interface ProcessInstanceVariablesApi {

    @ApiOperation(value = "Create or update variables", nickname = "createOrUpdateProcessInstanceVariablesUsingPUT", notes = "", response = RestVariable.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-instance-variables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestVariable.class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/process-instances/{processInstanceId}/variables",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<List<RestVariable>> createOrUpdateProcessInstanceVariablesUsingPUT(@ApiParam(value = "Process instance ID",required=true) @PathVariable("processInstanceId") String processInstanceId,@ApiParam(value = "restVariables" ,required=true )  @Valid @RequestBody List<RestVariable> restVariables);


    @ApiOperation(value = "Create variables", nickname = "createProcessInstanceVariablesUsingPOST", notes = "", response = RestVariable.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-instance-variables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestVariable.class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/process-instances/{processInstanceId}/variables",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<List<RestVariable>> createProcessInstanceVariablesUsingPOST(@ApiParam(value = "Process instance ID",required=true) @PathVariable("processInstanceId") String processInstanceId,@ApiParam(value = "restVariables" ,required=true )  @Valid @RequestBody List<RestVariable> restVariables);


    @ApiOperation(value = "Delete a variable", nickname = "deleteProcessInstanceVariableUsingDELETE", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-instance-variables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content") })
    @RequestMapping(value = "/enterprise/process-instances/{processInstanceId}/variables/{variableName}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProcessInstanceVariableUsingDELETE(@ApiParam(value = "processInstanceId",required=true) @PathVariable("processInstanceId") String processInstanceId,@ApiParam(value = "variableName",required=true) @PathVariable("variableName") String variableName);


    @ApiOperation(value = "Get a variable", nickname = "getProcessInstanceVariableUsingGET", notes = "", response = RestVariable.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-instance-variables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestVariable.class) })
    @RequestMapping(value = "/enterprise/process-instances/{processInstanceId}/variables/{variableName}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<RestVariable> getProcessInstanceVariableUsingGET(@ApiParam(value = "processInstanceId",required=true) @PathVariable("processInstanceId") String processInstanceId,@ApiParam(value = "variableName",required=true) @PathVariable("variableName") String variableName);


    @ApiOperation(value = "List variables", nickname = "getProcessInstanceVariablesUsingGET", notes = "", response = RestVariable.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-instance-variables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestVariable.class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/process-instances/{processInstanceId}/variables",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<List<RestVariable>> getProcessInstanceVariablesUsingGET(@ApiParam(value = "Process instance ID",required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "Update a variable", nickname = "updateProcessInstanceVariableUsingPUT", notes = "", response = RestVariable.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-instance-variables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RestVariable.class) })
    @RequestMapping(value = "/enterprise/process-instances/{processInstanceId}/variables/{variableName}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<RestVariable> updateProcessInstanceVariableUsingPUT(@ApiParam(value = "processInstanceId",required=true) @PathVariable("processInstanceId") String processInstanceId,@ApiParam(value = "variableName",required=true) @PathVariable("variableName") String variableName,@ApiParam(value = "restVariable" ,required=true )  @Valid @RequestBody RestVariable restVariable);

}
