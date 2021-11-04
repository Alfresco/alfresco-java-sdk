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

import com.alfresco.activiti.model.CreateEndpointBasicAuthRepresentation;
import com.alfresco.activiti.model.EndpointBasicAuthRepresentation;
import com.alfresco.activiti.model.EndpointConfigurationRepresentation;

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

@Api(value = "AdminEndpoints", description = "the AdminEndpoints API")
public interface AdminEndpointsApi {

    @ApiOperation(value = "Add an endpoint authorization", nickname = "createBasicAuthConfigurationUsingPOST", notes = "", response = EndpointBasicAuthRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EndpointBasicAuthRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/basic-auths",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EndpointBasicAuthRepresentation> createBasicAuthConfigurationUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody CreateEndpointBasicAuthRepresentation body);


    @ApiOperation(value = "Create an endpoint", nickname = "createEndpointConfigurationUsingPOST", notes = "", response = EndpointConfigurationRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EndpointConfigurationRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/endpoints",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EndpointConfigurationRepresentation> createEndpointConfigurationUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody EndpointConfigurationRepresentation body);


    @ApiOperation(value = "Get an endpoint authorization", nickname = "getBasicAuthConfigurationUsingGET", notes = "", response = EndpointBasicAuthRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EndpointBasicAuthRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/basic-auths/{basicAuthId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EndpointBasicAuthRepresentation> getBasicAuthConfigurationUsingGET(@ApiParam(value = "basicAuthId", required=true) @PathVariable("basicAuthId") Long basicAuthId, @NotNull @ApiParam(value = "tenantId", required = true) @Valid @RequestParam(value = "tenantId", required = true) Long tenantId);


    @ApiOperation(value = "List endpoint authorizations", nickname = "getBasicAuthConfigurationsUsingGET", notes = "", response = EndpointBasicAuthRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EndpointBasicAuthRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/basic-auths",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<EndpointBasicAuthRepresentation>> getBasicAuthConfigurationsUsingGET(@NotNull @ApiParam(value = "tenantId", required = true) @Valid @RequestParam(value = "tenantId", required = true) Long tenantId);


    @ApiOperation(value = "Get an endpoint", nickname = "getEndpointConfigurationUsingGET1", notes = "", response = EndpointConfigurationRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EndpointConfigurationRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/endpoints/{endpointConfigurationId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EndpointConfigurationRepresentation> getEndpointConfigurationUsingGET1(@ApiParam(value = "endpointConfigurationId", required=true) @PathVariable("endpointConfigurationId") Long endpointConfigurationId, @NotNull @ApiParam(value = "tenantId", required = true) @Valid @RequestParam(value = "tenantId", required = true) Long tenantId);


    @ApiOperation(value = "List endpoints", nickname = "getEndpointConfigurationsUsingGET1", notes = "", response = EndpointConfigurationRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EndpointConfigurationRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/endpoints",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<EndpointConfigurationRepresentation>> getEndpointConfigurationsUsingGET1(@NotNull @ApiParam(value = "tenantId", required = true) @Valid @RequestParam(value = "tenantId", required = true) Long tenantId);


    @ApiOperation(value = "Delete an endpoint authorization", nickname = "removeBasicAuthonfigurationUsingDELETE", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/basic-auths/{basicAuthId}",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> removeBasicAuthonfigurationUsingDELETE(@ApiParam(value = "basicAuthId", required=true) @PathVariable("basicAuthId") Long basicAuthId, @NotNull @ApiParam(value = "tenantId", required = true) @Valid @RequestParam(value = "tenantId", required = true) Long tenantId);


    @ApiOperation(value = "Delete an endpoint", nickname = "removeEndpointConfigurationUsingDELETE", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/endpoints/{endpointConfigurationId}",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> removeEndpointConfigurationUsingDELETE(@ApiParam(value = "endpointConfigurationId", required=true) @PathVariable("endpointConfigurationId") Long endpointConfigurationId, @NotNull @ApiParam(value = "tenantId", required = true) @Valid @RequestParam(value = "tenantId", required = true) Long tenantId);


    @ApiOperation(value = "Update an endpoint authorization", nickname = "updateBasicAuthConfigurationUsingPUT", notes = "", response = EndpointBasicAuthRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EndpointBasicAuthRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/basic-auths/{basicAuthId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EndpointBasicAuthRepresentation> updateBasicAuthConfigurationUsingPUT(@ApiParam(value = "basicAuthId", required=true) @PathVariable("basicAuthId") Long basicAuthId, @ApiParam(value = "" ) @Valid @RequestBody CreateEndpointBasicAuthRepresentation body);


    @ApiOperation(value = "Update an endpoint", nickname = "updateEndpointConfigurationUsingPUT", notes = "", response = EndpointConfigurationRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "admin-endpoints", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EndpointConfigurationRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/endpoints/{endpointConfigurationId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EndpointConfigurationRepresentation> updateEndpointConfigurationUsingPUT(@ApiParam(value = "endpointConfigurationId", required=true) @PathVariable("endpointConfigurationId") Long endpointConfigurationId, @ApiParam(value = "" ) @Valid @RequestBody EndpointConfigurationRepresentation body);

}
