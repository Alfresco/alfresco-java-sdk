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
package org.alfresco.governance.classification.handler;

import org.alfresco.governance.classification.model.DeclassificationExemptionBody;
import org.alfresco.governance.classification.model.DeclassificationExemptionEntry;
import org.alfresco.governance.classification.model.DeclassificationExemptionsPaging;
import org.alfresco.governance.classification.model.Error;
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

@Api(value = "DeclassificationExemptions")
public interface DeclassificationExemptionsApi {

    @ApiOperation(value = "Create a declassification exemption", nickname = "createDeclassificationExemption", notes = "Creates a new declassification exemption.  **Note:** You can create more than one exemption by specifying a list of exemptions in the JSON body. For example, the following JSON body creates two declassification exemptions: ```JSON [   {     \"code\":\"My Code1\",     \"description\":\"My Description1\"   },   {     \"code\":\"My Code2\",     \"description\":\"My Description2\"   } ] ``` If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  ```JSON {   \"list\": {     \"pagination\": {       \"count\": 2,       \"hasMoreItems\": false,       \"totalItems\": 2,       \"skipCount\": 0,       \"maxItems\": 100     },     \"entries\": [       {         \"entry\": {           ...         }       },       {         \"entry\": {           ...         }       }     ]   } } ``` ", response = DeclassificationExemptionEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "declassification-exemptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful response", response = DeclassificationExemptionEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: The **declassificationExemption** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user doesn't have permission to create declassification exemptions"),
        @ApiResponse(code = 409, message = "Exemption code clashes with an existing declassification exemption"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/declassification-exemptions",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DeclassificationExemptionEntry> createDeclassificationExemption(@ApiParam(value = "Declassification exemption" ,required=true )  @Valid @RequestBody DeclassificationExemptionBody declassificationExemption);


    @ApiOperation(value = "Delete a declassification exemption", nickname = "deleteDeclassificationExemption", notes = "Deletes the declassification exemption with id **declassificationExemptionId**. You can't delete a classification exemption that is being used to classify content.", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "declassification-exemptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response"),
        @ApiResponse(code = 400, message = "Invalid parameter: **declassificationExemptionId** is not in a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to delete **declassificationExemptionId** "),
        @ApiResponse(code = 404, message = "**declassificationExemptionId** does not exist"),
        @ApiResponse(code = 422, message = "Model integrity exception: **classificationExemptionId** is in use or is the last exemption on the system. "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/declassification-exemptions/{declassificationExemptionId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDeclassificationExemption(@ApiParam(value = "The identifier for the declassification exemption",required=true) @PathVariable("declassificationExemptionId") String declassificationExemptionId);


    @ApiOperation(value = "List all declassification exemptions", nickname = "listDeclassificationExemptions", notes = "Gets all declassification exemptions.", response = DeclassificationExemptionsPaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "declassification-exemptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A paged array of declassification exemptions", response = DeclassificationExemptionsPaging.class),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/declassification-exemptions",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<DeclassificationExemptionsPaging> listDeclassificationExemptions(@Min(0)@ApiParam(value = "The number of entities that exist in the collection before those included in this list.") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount,@Min(1)@ApiParam(value = "The maximum number of items to return in the list.") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems);


    @ApiOperation(value = "Get declassification exemption information", nickname = "showDeclassificationExemptionById", notes = "Gets the declassification exemption with id **declassificationExemptionId**.", response = DeclassificationExemptionEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "declassification-exemptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DeclassificationExemptionEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **declassificationExemptionId** is not in valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**declassificationExemptionId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/declassification-exemptions/{declassificationExemptionId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<DeclassificationExemptionEntry> showDeclassificationExemptionById(@ApiParam(value = "The identifier for the declassification exemption",required=true) @PathVariable("declassificationExemptionId") String declassificationExemptionId);


    @ApiOperation(value = "Update a declassification exemption", nickname = "updateDeclassificationExemption", notes = "Updates the declassification exemption with id **declassificationExemptionId**. For example, you can rename a declassification exemption.", response = DeclassificationExemptionEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "declassification-exemptions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DeclassificationExemptionEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **declassificationExemptionId** is not in a valid format or the **declassificationExemption** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to update the guide with id **declassificationExemptionId**"),
        @ApiResponse(code = 404, message = "**declassificationExemptionId** does not exist"),
        @ApiResponse(code = 409, message = "Exemption code clashes with an existing declassification exemption"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/declassification-exemptions/{declassificationExemptionId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<DeclassificationExemptionEntry> updateDeclassificationExemption(@ApiParam(value = "The identifier for the declassification exemption",required=true) @PathVariable("declassificationExemptionId") String declassificationExemptionId,@ApiParam(value = "Declassification exemption" ,required=true )  @Valid @RequestBody DeclassificationExemptionBody declassificationExemption);

}
