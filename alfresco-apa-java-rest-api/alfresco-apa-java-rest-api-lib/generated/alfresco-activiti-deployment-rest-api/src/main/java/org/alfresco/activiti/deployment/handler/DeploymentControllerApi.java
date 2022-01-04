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

import org.alfresco.activiti.deployment.model.ApplicationLog;
import org.alfresco.activiti.deployment.model.ApplicationPutRequestRepresentation;
import org.alfresco.activiti.deployment.model.ApplicationRepresentation;
import org.alfresco.activiti.deployment.model.ApplicationResponseRepresentation;
import org.alfresco.activiti.deployment.model.ListResponseContentOfApplicationResponseRepresentation;
import java.time.LocalDate;
import org.alfresco.activiti.deployment.model.RuntimeVersionRepresentation;

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

@Api(value = "DeploymentController", description = "the DeploymentController API")
public interface DeploymentControllerApi {

    @ApiOperation(value = "createApplication", nickname = "createApplicationUsingPOST", notes = "Add a new application.", tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications",
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> createApplicationUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody ApplicationRepresentation body);


    @ApiOperation(value = "deleteApplication", nickname = "deleteApplicationUsingDELETE", notes = "Delete an existing application by id.", tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/v1/applications/{id}",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deleteApplicationUsingDELETE(@ApiParam(value = "ID of application to delete", required=true) @PathVariable("id") String id);


    @ApiOperation(value = "getApplicationRuntimeVersion", nickname = "getApplicationRuntimeVersionUsingGET", notes = "Retrieve the application runtime version by id.", response = RuntimeVersionRepresentation.class, tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RuntimeVersionRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications/{id}/runtime-version",
        produces = "*/*", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<RuntimeVersionRepresentation> getApplicationRuntimeVersionUsingGET(@ApiParam(value = "ID of application which runtime version is queried", required=true) @PathVariable("id") String id);


    @ApiOperation(value = "getApplication", nickname = "getApplicationUsingGET", notes = "Find application by id.", response = ApplicationResponseRepresentation.class, tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ApplicationResponseRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications/{id}",
        produces = "*/*", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ApplicationResponseRepresentation> getApplicationUsingGET(@ApiParam(value = "ID of application to return", required=true) @PathVariable("id") String id);


    @ApiOperation(value = "getApplications", nickname = "getApplicationsUsingGET", notes = "Find applications. It allows filtering. This service will return all applications if the user has ACTIVITI_DEVOPS role otherwise it returns only applications belonging to the user.", response = ListResponseContentOfApplicationResponseRepresentation.class, tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentOfApplicationResponseRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ListResponseContentOfApplicationResponseRepresentation> getApplicationsUsingGET(@ApiParam(value = "Authorization" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization, @ApiParam(value = "") @Valid @RequestParam(value = "createdDateFrom", required = false) LocalDate createdDateFrom, @ApiParam(value = "") @Valid @RequestParam(value = "createdDateTo", required = false) LocalDate createdDateTo, @ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "") @Valid @RequestParam(value = "roles", required = false) List<String> roles, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort, @ApiParam(value = "", allowableValues="CREATE_APP, CREATE_DESCRIPTOR, DEPLOY_STARTED, DEPLOY_STARTED_FAILED, DESCRIPTOR_CREATED, IMAGE_BUILD, IMAGE_BUILD_FAILED, IMAGE_PUSH, IMAGE_PUSH_FAILED, NOT_DEPLOYED, PENDING, RUNNING, UNKNOWN, UPDATE_APP, WAITING_FOR_DESCRIPTOR"
) @Valid @RequestParam(value = "status", required = false) String status);


    @ApiOperation(value = "getGroups", nickname = "getGroupsUsingGET", notes = "Fetch all groups belonging to an application.", response = String.class, responseContainer = "List", tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications/{id}/groups",
        produces = "*/*", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<String>> getGroupsUsingGET(@ApiParam(value = "ID of application", required=true) @PathVariable("id") String id, @ApiParam(value = "Filter on group name, showing all groups that contains the search key") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Roles that user must have on the application.") @Valid @RequestParam(value = "roles", required = false) String roles);


    @ApiOperation(value = "getLatestRuntimeVersion", nickname = "getLatestRuntimeVersionUsingGET", notes = "Retrieve the latest runtime version available in the deployment service.", response = RuntimeVersionRepresentation.class, tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RuntimeVersionRepresentation.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications/runtime-versions/latest",
        produces = "*/*", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<RuntimeVersionRepresentation> getLatestRuntimeVersionUsingGET();


    @ApiOperation(value = "getRuntimeVersions", nickname = "getRuntimeVersionsUsingGET", notes = "Retrieve a list of runtime versions available in the deployment service.", response = RuntimeVersionRepresentation.class, responseContainer = "List", tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RuntimeVersionRepresentation.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications/runtime-versions",
        produces = "*/*", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<RuntimeVersionRepresentation>> getRuntimeVersionsUsingGET(@ApiParam(value = "versionEqualOrLater") @Valid @RequestParam(value = "versionEqualOrLater", required = false) String versionEqualOrLater);


    @ApiOperation(value = "getUsers", nickname = "getUsersUsingGET", notes = "Fetch all users belonging to an application.", response = String.class, responseContainer = "List", tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications/{id}/users",
        produces = "*/*", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<String>> getUsersUsingGET(@ApiParam(value = "ID of application", required=true) @PathVariable("id") String id, @ApiParam(value = "Filter on username, showing all users that contains the search key") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "If the value is 'true' the service will return users belonging to the application, directly or via groups. Otherwise only users directly belonging to the application will be returned.") @Valid @RequestParam(value = "group", required = false) Boolean group, @ApiParam(value = "Roles that user must have on the application.") @Valid @RequestParam(value = "roles", required = false) String roles, @ApiParam(value = "If the value is 'true' the service will return only users belonging to the application. Otherwise user and service clients belonging to the application will be returned.") @Valid @RequestParam(value = "excludeServiceClients", required = false) Boolean excludeServiceClients);


    @ApiOperation(value = "retrieveServiceLogs", nickname = "retrieveServiceLogsUsingGET", notes = "", response = ApplicationLog.class, tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ApplicationLog.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications/{id}/logs/{serviceName}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ApplicationLog> retrieveServiceLogsUsingGET(@ApiParam(value = "ID of application to get logs from", required=true) @PathVariable("id") String id, @ApiParam(value = "Name of the service to get logs from", required=true) @PathVariable("serviceName") String serviceName);


    @ApiOperation(value = "updateApplicationRuntimeVersion", nickname = "updateApplicationRuntimeVersionUsingPOST", notes = "Updates the application runtime version to the selected one.", response = ApplicationResponseRepresentation.class, tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ApplicationResponseRepresentation.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications/{id}/update",
        produces = "*/*", 
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ApplicationResponseRepresentation> updateApplicationRuntimeVersionUsingPOST(@ApiParam(value = "ID of application which runtime version is updated", required=true) @PathVariable("id") String id, @ApiParam(value = "runtimeVersion") @Valid @RequestParam(value = "runtimeVersion", required = false) String runtimeVersion);


    @ApiOperation(value = "upgradeApplication", nickname = "upgradeApplicationUsingPUT", notes = "Update an existing application by id.", tags={ "deployment-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/applications/{id}",
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> upgradeApplicationUsingPUT(@ApiParam(value = "ID of application to update", required=true) @PathVariable("id") String id, @ApiParam(value = "" ) @Valid @RequestBody ApplicationPutRequestRepresentation body);

}