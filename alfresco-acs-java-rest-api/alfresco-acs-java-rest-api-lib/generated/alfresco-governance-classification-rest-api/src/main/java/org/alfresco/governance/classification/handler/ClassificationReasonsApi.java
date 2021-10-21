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

import org.alfresco.governance.classification.model.ClassificationReasonBody;
import org.alfresco.governance.classification.model.ClassificationReasonEntry;
import org.alfresco.governance.classification.model.ClassificationReasonsPaging;
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

@Api(value = "ClassificationReasons")
public interface ClassificationReasonsApi {

    @ApiOperation(value = "Create a classification reason", nickname = "createClassificationReason", notes = "Creates a new classification reason.  **Note:** You can create more than one reason by specifying a list of reasons in the JSON body. For example, the following JSON body creates two classification reasons: ```JSON [   {     \"code\":\"My Code1\",     \"description\":\"My Description1\"   },   {     \"code\":\"My Code2\",     \"description\":\"My Description2\"   } ] ``` If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  ```JSON {   \"list\": {     \"pagination\": {       \"count\": 2,       \"hasMoreItems\": false,       \"totalItems\": 2,       \"skipCount\": 0,       \"maxItems\": 100     },     \"entries\": [       {         \"entry\": {           ...         }       },       {         \"entry\": {           ...         }       }     ]   } } ``` ", response = ClassificationReasonEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-reasons", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful response", response = ClassificationReasonEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: The **classificationReason** is is not in a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user doesn't have permission to create classification reasons **classificationReason**"),
        @ApiResponse(code = 409, message = "Reason code clashes with an existing classification reason"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-reasons",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ClassificationReasonEntry> createClassificationReason(@ApiParam(value = "Classification reason" ,required=true )  @Valid @RequestBody ClassificationReasonBody classificationReason);


    @ApiOperation(value = "Delete a classification reason", nickname = "deleteClassificationReason", notes = "Deletes the classification reason  **classificationReasonId**. You can't delete a classification reason that is being used to classify content. There must be at least one classification reason.", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-reasons", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response"),
        @ApiResponse(code = 400, message = "Invalid parameter: **classificationReasonId** is not in a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to delete **classificationReasonId** "),
        @ApiResponse(code = 404, message = "**classificationReasonId** does not exist"),
        @ApiResponse(code = 422, message = "Model integrity exception: **classificationReasonId** is in use or is the last reason on the system. "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-reasons/{classificationReasonId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteClassificationReason(@ApiParam(value = "The identifier for the classification reason",required=true) @PathVariable("classificationReasonId") String classificationReasonId);


    @ApiOperation(value = "List all classification reasons", nickname = "listClassificationReasons", notes = "Gets all classification reasons.", response = ClassificationReasonsPaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-reasons", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A paged array of classification reasons", response = ClassificationReasonsPaging.class),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-reasons",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ClassificationReasonsPaging> listClassificationReasons(@Min(0)@ApiParam(value = "The number of entities that exist in the collection before those included in this list.") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount,@Min(1)@ApiParam(value = "The maximum number of items to return in the list.") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);


    @ApiOperation(value = "Get classification reason information", nickname = "showClassificationReasonById", notes = "Gets the classification reason  **classificationReasonId**.", response = ClassificationReasonEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-reasons", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ClassificationReasonEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **classificationReasonId** is not in valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**classificationReasonId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-reasons/{classificationReasonId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ClassificationReasonEntry> showClassificationReasonById(@ApiParam(value = "The identifier for the classification reason",required=true) @PathVariable("classificationReasonId") String classificationReasonId);


    @ApiOperation(value = "Update a classification reason", nickname = "updateClassificationReason", notes = "Updates the classification reason with id **classificationReasonId**. For example, you can change a classification reason code or description.", response = ClassificationReasonEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-reasons", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ClassificationReasonEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **classificationReasonId** is not in a valid format or the **classificationReason** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to update **classificationReasonId**"),
        @ApiResponse(code = 404, message = "**classificationReasonId** does not exist"),
        @ApiResponse(code = 409, message = "Reason code clashes with an existing classification reason"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-reasons/{classificationReasonId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ClassificationReasonEntry> updateClassificationReason(@ApiParam(value = "The identifier for the classification reason",required=true) @PathVariable("classificationReasonId") String classificationReasonId,@ApiParam(value = "Classification reason" ,required=true )  @Valid @RequestBody ClassificationReasonBody classificationReason);

}