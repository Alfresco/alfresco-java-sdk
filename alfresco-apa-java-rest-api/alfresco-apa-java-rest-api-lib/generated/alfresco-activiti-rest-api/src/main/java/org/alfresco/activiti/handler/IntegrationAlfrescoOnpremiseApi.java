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

import org.alfresco.activiti.model.AlfrescoEndpointRepresentation;
import org.alfresco.activiti.model.ResultListDataRepresentationAlfrescoContentRepresentation;
import org.alfresco.activiti.model.ResultListDataRepresentationAlfrescoEndpointRepresentation;
import org.alfresco.activiti.model.ResultListDataRepresentationAlfrescoSiteRepresenation;

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

@Api(value = "IntegrationAlfrescoOnpremise", description = "the IntegrationAlfrescoOnpremise API")
public interface IntegrationAlfrescoOnpremiseApi {

    @ApiOperation(value = "Create Alfresco repository", nickname = "createRepositoryUsingPOST", notes = "", response = AlfrescoEndpointRepresentation.class, tags={ "integration-alfresco-onpremise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AlfrescoEndpointRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/alfresco",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<AlfrescoEndpointRepresentation> createRepositoryUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody AlfrescoEndpointRepresentation body);


    @ApiOperation(value = "Delete Alfresco repository", nickname = "deleteRepositoryUsingDELETE", notes = "", tags={ "integration-alfresco-onpremise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/alfresco/{repositoryId}",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deleteRepositoryUsingDELETE(@ApiParam(value = "repositoryId", required=true) @PathVariable("repositoryId") Long repositoryId);


    @ApiOperation(value = "List Alfresco sites", nickname = "getAllSitesUsingGET", notes = "Returns ALL Sites", response = ResultListDataRepresentationAlfrescoSiteRepresenation.class, tags={ "integration-alfresco-onpremise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationAlfrescoSiteRepresenation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/alfresco/{repositoryId}/sites",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationAlfrescoSiteRepresenation> getAllSitesUsingGET(@ApiParam(value = "repositoryId", required=true) @PathVariable("repositoryId") String repositoryId);


    @ApiOperation(value = "List files and folders inside a specific folder identified by folder path", nickname = "getContentInFolderPathUsingGET", notes = "", response = ResultListDataRepresentationAlfrescoContentRepresentation.class, tags={ "integration-alfresco-onpremise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationAlfrescoContentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/rest/integration/alfresco/{repositoryId}/sites/{siteId}/folderpath/{folderPath}/content",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationAlfrescoContentRepresentation> getContentInFolderPathUsingGET(@ApiParam(value = "repositoryId", required=true) @PathVariable("repositoryId") String repositoryId, @ApiParam(value = "siteId", required=true) @PathVariable("siteId") String siteId, @ApiParam(value = "folderPath", required=true) @PathVariable("folderPath") String folderPath);


    @ApiOperation(value = "List files and folders inside a specific folder", nickname = "getContentInFolderUsingGET", notes = "", response = ResultListDataRepresentationAlfrescoContentRepresentation.class, tags={ "integration-alfresco-onpremise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationAlfrescoContentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/alfresco/{repositoryId}/folders/{folderId}/content",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationAlfrescoContentRepresentation> getContentInFolderUsingGET(@ApiParam(value = "repositoryId", required=true) @PathVariable("repositoryId") String repositoryId, @ApiParam(value = "folderId", required=true) @PathVariable("folderId") String folderId);


    @ApiOperation(value = "List files and folders inside a specific site", nickname = "getContentInSiteUsingGET", notes = "", response = ResultListDataRepresentationAlfrescoContentRepresentation.class, tags={ "integration-alfresco-onpremise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationAlfrescoContentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/alfresco/{repositoryId}/sites/{siteId}/content",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationAlfrescoContentRepresentation> getContentInSiteUsingGET(@ApiParam(value = "repositoryId", required=true) @PathVariable("repositoryId") String repositoryId, @ApiParam(value = "siteId", required=true) @PathVariable("siteId") String siteId);


    @ApiOperation(value = "List Alfresco repositories", nickname = "getRepositoriesUsingGET", notes = "A tenant administrator can configure one or more Alfresco repositories to use when working with content.", response = ResultListDataRepresentationAlfrescoEndpointRepresentation.class, tags={ "integration-alfresco-onpremise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationAlfrescoEndpointRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/profile/accounts/alfresco",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationAlfrescoEndpointRepresentation> getRepositoriesUsingGET(@ApiParam(value = "tenantId") @Valid @RequestParam(value = "tenantId", required = false) Long tenantId, @ApiParam(value = "includeAccounts") @Valid @RequestParam(value = "includeAccounts", required = false) Boolean includeAccounts);


    @ApiOperation(value = "Update Alfresco repository", nickname = "updateRepositoryUsingPUT", notes = "", response = AlfrescoEndpointRepresentation.class, tags={ "integration-alfresco-onpremise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AlfrescoEndpointRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/alfresco/{repositoryId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<AlfrescoEndpointRepresentation> updateRepositoryUsingPUT(@ApiParam(value = "repositoryId", required=true) @PathVariable("repositoryId") Long repositoryId, @ApiParam(value = "" ) @Valid @RequestBody AlfrescoEndpointRepresentation body);

}
