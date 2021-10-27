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
package com.alfresco.activiti.form.handler;

import com.alfresco.activiti.form.model.NamedObject;

import com.alfresco.activiti.form.model.SaveFormRepresentation;
import com.alfresco.activiti.form.model.SubmitFormRepresentation;

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

@Api(value = "Forms", description = "the Forms API")
public interface FormsApi {

    @ApiOperation(value = "Get form definition by version", nickname = "getFormDefinitionUsingGET", notes = "", response = ResponseEntity.class, tags={ "FORMS", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/forms/{formId}/versions/{version}",
        produces = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ResponseEntity> getFormDefinitionUsingGET(@ApiParam(value = "The id of the form definition", required=true) @PathVariable("formId") String formId, @ApiParam(value = "version", required=true) @PathVariable("version") Integer version);


    @ApiOperation(value = "Get form definition latest version", nickname = "getFormDefinitionUsingGET1", notes = "", response = ResponseEntity.class, tags={ "FORMS", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/forms/{formId}",
        produces = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ResponseEntity> getFormDefinitionUsingGET1(@ApiParam(value = "The id of the form definition", required=true) @PathVariable("formId") String formId);


    @ApiOperation(value = "Get form definitions summary", nickname = "getFormDefinitionsUsingGET", notes = "", response = ResponseEntity.class, tags={ "FORMS", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/forms",
        produces = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<ResponseEntity> getFormDefinitionsUsingGET();


    @ApiOperation(value = "Get form definition by version", nickname = "getFormFieldValueUsingPOST", notes = "", response = NamedObject.class, responseContainer = "List", tags={ "FORMS", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = NamedObject.class, responseContainer = "List"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/forms/{formId}/values/{formFieldId}",
        produces = "application/json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<List<NamedObject>> getFormFieldValueUsingPOST(@ApiParam(value = "The id of the form definition", required=true) @PathVariable("formId") String formId, @ApiParam(value = "The id of the form field", required=true) @PathVariable("formFieldId") String formFieldId, @ApiParam(value = "" ) @Valid @RequestBody Map<String, String> body);


    @ApiOperation(value = "Save runtime forms", nickname = "saveFormUsingPOST", notes = "", tags={ "FORMS", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/forms/{formId}/save",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<Void> saveFormUsingPOST(@ApiParam(value = "The id of the form instance to be saved", required=true) @PathVariable("formId") String formId, @ApiParam(value = "" ) @Valid @RequestBody SaveFormRepresentation body);


    @ApiOperation(value = "Submit forms specific version", nickname = "submitFormUsingPOST", notes = "", response = ResponseEntity.class, tags={ "FORMS", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/forms/{formId}/submit/versions/{version}",
        produces = "application/json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ResponseEntity> submitFormUsingPOST(@ApiParam(value = "The id of the form to be submitted", required=true) @PathVariable("formId") String formId, @ApiParam(value = "version", required=true) @PathVariable("version") Integer version, @ApiParam(value = "" ) @Valid @RequestBody SubmitFormRepresentation body);


    @ApiOperation(value = "Submit forms latest version", nickname = "submitFormUsingPOST1", notes = "", response = ResponseEntity.class, tags={ "FORMS", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/forms/{formId}/submit",
        produces = "application/json",
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ResponseEntity> submitFormUsingPOST1(@ApiParam(value = "The id of the form to be submitted", required=true) @PathVariable("formId") String formId, @ApiParam(value = "" ) @Valid @RequestBody SubmitFormRepresentation body);

}
