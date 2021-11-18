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
package org.alfresco.activiti.modeling.handler;

import org.alfresco.activiti.modeling.model.EntryResponseContentOfCollaborator;
import org.alfresco.activiti.modeling.model.ListResponseContentOfCollaborator;

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

@Api(value = "Collaboration", description = "the Collaboration API")
public interface CollaborationApi {

    @ApiOperation(value = "Add a collaborator", nickname = "addCollaboratorUsingPUT", notes = "", response = EntryResponseContentOfCollaborator.class, tags={ "Collaboration", })
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Created", response = EntryResponseContentOfCollaborator.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/projects/{projectId}/collaborators/{username}",
        produces = "*/*",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EntryResponseContentOfCollaborator> addCollaboratorUsingPUT(@ApiParam(value = "The Id of the project", required=true) @PathVariable("projectId") String projectId, @ApiParam(value = "The unique username of the collaborator", required=true) @PathVariable("username") String username);


    @ApiOperation(value = "List collaborators", nickname = "getCollaboratorsUsingGET", notes = "Get the list of collaborators on a project.", response = ListResponseContentOfCollaborator.class, tags={ "Collaboration", })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentOfCollaborator.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/projects/{projectId}/collaborators",
        produces = "application/json",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ListResponseContentOfCollaborator> getCollaboratorsUsingGET(@ApiParam(value = "The Id of the project", required=true) @PathVariable("projectId") String projectId, @ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "Remove a collaborator", nickname = "removeCollaboratorUsingDELETE", notes = "", tags={ "Collaboration", })
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/v1/projects/{projectId}/collaborators/{username}",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> removeCollaboratorUsingDELETE(@ApiParam(value = "The Id of the project", required=true) @PathVariable("projectId") String projectId, @ApiParam(value = "The unique username of the collaborator", required=true) @PathVariable("username") String username);

}
