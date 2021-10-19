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

import com.alfresco.activiti.runtime.model.NamedEventBody;

import com.alfresco.activiti.runtime.model.SubmitFormRepresentation;
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

@Api(value = "UserActions")
public interface UserActionsApi {

    @ApiOperation(value = "Send a named event", nickname = "sendNamedEventUsingPOST", notes = "", response = ResponseEntity.class, tags={ "USER_ACTIONS", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/user-action/event/{uiName}/{eventName}/send",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ResponseEntity> sendNamedEventUsingPOST(@ApiParam(value = "The name of the event to send",required=true) @PathVariable("eventName") String eventName,@ApiParam(value = "The name of the UI producing the event",required=true) @PathVariable("uiName") String uiName,@ApiParam(value = "The object containing the nodes associated to the event"  )  @Valid @RequestBody NamedEventBody nodes);


    @ApiOperation(value = "Submit forms latest version", nickname = "submitFormUsingPOST2", notes = "", response = ResponseEntity.class, tags={ "USER_ACTIONS", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/user-action/form/{formId}/submit",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ResponseEntity> submitFormUsingPOST2(@ApiParam(value = "The id of the form to be submitted",required=true) @PathVariable("formId") String formId,@ApiParam(value = "submitFormRepresentation" ,required=true )  @Valid @RequestBody SubmitFormRepresentation submitFormRepresentation);

}
