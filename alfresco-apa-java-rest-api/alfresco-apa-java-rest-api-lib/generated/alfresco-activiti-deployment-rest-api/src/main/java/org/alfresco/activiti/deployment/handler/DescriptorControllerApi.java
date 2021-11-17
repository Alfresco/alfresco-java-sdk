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
package org.alfresco.activiti.deployment.handler;

import org.alfresco.activiti.deployment.model.ConnectorModel;
import org.alfresco.activiti.deployment.model.DeployDescriptorRequestRepresentation;
import org.alfresco.activiti.deployment.model.DescriptorResponseRepresentation;
import org.alfresco.activiti.deployment.model.ListResponseContentOfDescriptorResponseRepresentation;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.core.io.Resource;

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

@Api(value = "DescriptorController", description = "the DescriptorController API")
public interface DescriptorControllerApi {

    @ApiOperation(value = "deleteDescriptor", nickname = "deleteDescriptorUsingDELETE", notes = "Delete an existing descriptor by id.", tags={ "descriptor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/v1/descriptors/{descriptorId}",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deleteDescriptorUsingDELETE(@ApiParam(value = "ID of application to delete", required=true) @PathVariable("descriptorId") String descriptorId);


    @ApiOperation(value = "deployDescriptor", nickname = "deployDescriptorUsingPOST", notes = "Deploy an existing descriptor by id.", tags={ "descriptor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/deploy/{descriptorId}",
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deployDescriptorUsingPOST(@ApiParam(value = "ID of application to deploy", required=true) @PathVariable("descriptorId") String descriptorId, @ApiParam(value = "" ) @Valid @RequestBody DeployDescriptorRequestRepresentation body);


    @ApiOperation(value = "exportDescriptor", nickname = "exportDescriptorUsingGET", notes = "Export a descriptor by id.", tags={ "descriptor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/descriptors/{descriptorId}/export",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    byte[] exportDescriptorUsingGET(@ApiParam(value = "descriptorId", required=true) @PathVariable("descriptorId") String descriptorId, @NotNull @ApiParam(value = "type", required = true, allowableValues="JSON"
) @Valid @RequestParam(value = "type", required = true) String type, @ApiParam(value = "attachment") @Valid @RequestParam(value = "attachment", required = false) Boolean attachment);


    @ApiOperation(value = "getDescriptor", nickname = "getDescriptorUsingGET", notes = "Find descriptor by id.", response = DescriptorResponseRepresentation.class, tags={ "descriptor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DescriptorResponseRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/descriptors/{descriptorId}",
        produces = "*/*", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<DescriptorResponseRepresentation> getDescriptorUsingGET(@ApiParam(value = "ID of descriptor to return", required=true) @PathVariable("descriptorId") String descriptorId);


    @ApiOperation(value = "getDescriptors", nickname = "getDescriptorsUsingGET", notes = "Find descriptors. It allows filtering.", response = ListResponseContentOfDescriptorResponseRepresentation.class, tags={ "descriptor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentOfDescriptorResponseRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/descriptors",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ListResponseContentOfDescriptorResponseRepresentation> getDescriptorsUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "createdDateFrom", required = false) LocalDate createdDateFrom, @ApiParam(value = "") @Valid @RequestParam(value = "createdDateFromStartOfDay", required = false) OffsetDateTime createdDateFromStartOfDay, @ApiParam(value = "") @Valid @RequestParam(value = "createdDateTo", required = false) LocalDate createdDateTo, @ApiParam(value = "") @Valid @RequestParam(value = "createdDateToEndOfDay", required = false) OffsetDateTime createdDateToEndOfDay, @ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort, @ApiParam(value = "", allowableValues="CREATE_APP, CREATE_DESCRIPTOR, DEPLOY_STARTED, DEPLOY_STARTED_FAILED, DESCRIPTOR_CREATED, IMAGE_BUILD, IMAGE_BUILD_FAILED, IMAGE_PUSH, IMAGE_PUSH_FAILED, NOT_DEPLOYED, PENDING, RUNNING, UNKNOWN, UPDATE_APP, WAITING_FOR_DESCRIPTOR"
) @Valid @RequestParam(value = "status", required = false) String status);


    @ApiOperation(value = "getReleasedModelContents", nickname = "getReleasedModelContentsUsingGET", notes = "", response = ConnectorModel.class, responseContainer = "List", tags={ "descriptor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ConnectorModel.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/descriptors/{descriptorId}/models",
        produces = "*/*", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<ConnectorModel>> getReleasedModelContentsUsingGET(@ApiParam(value = "The id of the descriptor to get the models of the release", required=true) @PathVariable("descriptorId") String descriptorId, @NotNull @ApiParam(value = "The type of the models of the descriptor. Only CONNECTOR type available", required = true) @Valid @RequestParam(value = "type", required = true) String type);


    @ApiOperation(value = "importDescriptor", nickname = "importDescriptorUsingPOST", notes = "Import descriptor. Format: zip file, containing at root a descriptor.json and the released project", tags={ "descriptor-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/descriptors/import",
        consumes = "multipart/form-data",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> importDescriptorUsingPOST(@ApiParam(value = "file detail") @Valid @PathVariable("file") MultipartFile file);

}
