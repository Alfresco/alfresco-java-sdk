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

import com.alfresco.activiti.model.ResultListDataRepresentationGoogleDriveContent;

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

@Api(value = "IntegrationDrive", description = "the IntegrationDrive API")
public interface IntegrationDriveApi {

    @ApiOperation(value = "Drive Authorization", nickname = "confirmAuthorisationUsingGET1", notes = "Returns Drive OAuth HTML Page", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "integration-drive", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/google-drive/confirm-auth-request",
        method = RequestMethod.GET)
    ResponseEntity<Void> confirmAuthorisationUsingGET1();


    @ApiOperation(value = "List files and folders", nickname = "getFilesUsingGET1", notes = "", response = ResultListDataRepresentationGoogleDriveContent.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "integration-drive", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationGoogleDriveContent.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/google-drive/files",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationGoogleDriveContent> getFilesUsingGET1(@ApiParam(value = "filter") @Valid @RequestParam(value = "filter", required = false) String filter, @ApiParam(value = "parent") @Valid @RequestParam(value = "parent", required = false) String parent, @ApiParam(value = "currentFolderOnly") @Valid @RequestParam(value = "currentFolderOnly", required = false) Boolean currentFolderOnly);

}
