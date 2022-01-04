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
package org.alfresco.activiti.handler;

import org.alfresco.activiti.model.CreateTenantRepresentation;
import org.alfresco.activiti.model.ImageUploadRepresentation;
import org.alfresco.activiti.model.LightTenantRepresentation;
import org.alfresco.activiti.model.TenantEvent;
import org.alfresco.activiti.model.TenantRepresentation;

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

@Api(value = "AdminTenants", description = "the AdminTenants API")
public interface AdminTenantsApi {

    @ApiOperation(value = "Create a tenant", nickname = "createTenantUsingPOST", notes = "Only a tenant manager may access this endpoint", response = LightTenantRepresentation.class, tags={ "admin-tenants", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LightTenantRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/tenants",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<LightTenantRepresentation> createTenantUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody CreateTenantRepresentation body);


    @ApiOperation(value = "Delete a tenant", nickname = "deleteTenantUsingDELETE", notes = "", tags={ "admin-tenants", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/tenants/{tenantId}",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deleteTenantUsingDELETE(@ApiParam(value = "tenantId", required=true) @PathVariable("tenantId") Long tenantId);


    @ApiOperation(value = "Get tenant events", nickname = "getTenantEventsUsingGET", notes = "", response = TenantEvent.class, responseContainer = "List", tags={ "admin-tenants", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TenantEvent.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/tenants/{tenantId}/events",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<TenantEvent>> getTenantEventsUsingGET(@ApiParam(value = "tenantId", required=true) @PathVariable("tenantId") Long tenantId);


    @ApiOperation(value = "Get a tenant's logo", nickname = "getTenantLogoUsingGET", notes = "", tags={ "admin-tenants", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/tenants/{tenantId}/logo",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> getTenantLogoUsingGET(@ApiParam(value = "tenantId", required=true) @PathVariable("tenantId") Long tenantId);


    @ApiOperation(value = "Get a tenant", nickname = "getTenantUsingGET", notes = "", response = TenantRepresentation.class, tags={ "admin-tenants", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TenantRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/tenants/{tenantId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TenantRepresentation> getTenantUsingGET(@ApiParam(value = "tenantId", required=true) @PathVariable("tenantId") Long tenantId);


    @ApiOperation(value = "List tenants", nickname = "getTenantsUsingGET", notes = "Only a tenant manager may access this endpoint", response = LightTenantRepresentation.class, responseContainer = "List", tags={ "admin-tenants", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LightTenantRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/tenants",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<LightTenantRepresentation>> getTenantsUsingGET();


    @ApiOperation(value = "Update a tenant", nickname = "updateUsingPUT", notes = "", response = TenantRepresentation.class, tags={ "admin-tenants", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TenantRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/tenants/{tenantId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TenantRepresentation> updateUsingPUT(@ApiParam(value = "tenantId", required=true) @PathVariable("tenantId") Long tenantId, @ApiParam(value = "" ) @Valid @RequestBody CreateTenantRepresentation body);


    @ApiOperation(value = "Update a tenant's logo", nickname = "uploadTenantLogoUsingPOST", notes = "", response = ImageUploadRepresentation.class, tags={ "admin-tenants", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ImageUploadRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/admin/tenants/{tenantId}/logo",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ImageUploadRepresentation> uploadTenantLogoUsingPOST(@ApiParam(value = "tenantId", required=true) @PathVariable("tenantId") Long tenantId, @ApiParam(value = "" ) @Valid @RequestBody Object body);

}