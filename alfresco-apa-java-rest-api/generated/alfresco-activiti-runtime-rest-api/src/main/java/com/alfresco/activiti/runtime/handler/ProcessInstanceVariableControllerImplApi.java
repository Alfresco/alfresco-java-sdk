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

import com.alfresco.activiti.runtime.model.ListResponseContentCloudVariableInstance;
import com.alfresco.activiti.runtime.model.SetProcessVariablesPayload;
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

@Api(value = "ProcessInstanceVariableControllerImpl")
public interface ProcessInstanceVariableControllerImplApi {

    @ApiOperation(value = "getVariables", nickname = "getVariablesUsingGET", notes = "", response = ListResponseContentCloudVariableInstance.class, tags={ "process-instance-variable-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentCloudVariableInstance.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/variables",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ListResponseContentCloudVariableInstance> getVariablesUsingGET(@ApiParam(value = "processInstanceId",required=true) @PathVariable("processInstanceId") String processInstanceId);


    @ApiOperation(value = "setVariables", nickname = "setVariablesUsingPOST", notes = "", tags={ "process-instance-variable-controller-impl", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/process-instances/{processInstanceId}/variables",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> setVariablesUsingPOST(@ApiParam(value = "processInstanceId",required=true) @PathVariable("processInstanceId") String processInstanceId,@ApiParam(value = "setProcessVariablesPayload" ,required=true )  @Valid @RequestBody SetProcessVariablesPayload setProcessVariablesPayload);

}
