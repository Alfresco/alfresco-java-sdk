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
package org.alfresco.governance.core.handler;

import org.alfresco.governance.core.model.Error;
import org.alfresco.governance.core.model.TransferContainerAssociationPaging;
import org.alfresco.governance.core.model.TransferContainerBodyUpdate;
import org.alfresco.governance.core.model.TransferContainerEntry;
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
import org.springframework.cloud.openfeign.CollectionFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "TransferContainers")
public interface TransferContainersApi {

    @ApiOperation(value = "Get a transfer container", nickname = "getTransferContainer", notes = "Gets information for transfer container **transferContainerId**  Mandatory fields and the transfer container's aspects and properties are returned by default.  You can use the **include** parameter (include=allowableOperations) to return additional information. ", response = TransferContainerEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "transfer-containers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = TransferContainerEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **transferContainerId** is not a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to read **transferContainerId**"),
        @ApiResponse(code = 404, message = "**transferContainerId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/transfer-containers/{transferContainerId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TransferContainerEntry> getTransferContainer(@ApiParam(value = "The identifier of a transfer container. You can also use the -transfers- alias.",required=true) @PathVariable("transferContainerId") String transferContainerId,@ApiParam(value = "Returns additional information about the transfer container. Any optional field from the response model can be requested. For example: * allowableOperations * path ") @Valid @RequestParam(value = "include", required = false) List<String> include,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);


    @ApiOperation(value = "List transfer container's children", nickname = "listTransfers", notes = "Returns a list of transfers.  Minimal information for each child is returned by default.  You can use the **include** parameter (include=allowableOperations) to return additional information. ", response = TransferContainerAssociationPaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "transfer-containers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = TransferContainerAssociationPaging.class),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to read **transferContainerId**"),
        @ApiResponse(code = 404, message = "**transferContainerId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/transfer-containers/{transferContainerId}/transfers",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TransferContainerAssociationPaging> listTransfers(@ApiParam(value = "The identifier of a transfer container. You can also use the -transfers- alias.",required=true) @PathVariable("transferContainerId") String transferContainerId,@Min(0)@ApiParam(value = "The number of entities that exist in the collection before those included in this list.") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount,@Min(1)@ApiParam(value = "The maximum number of items to return in the list.") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems,@ApiParam(value = "Returns additional information about the transfer folders. Any optional field from the response model can be requested. For example: * allowableOperations * aspectNames * properties * transferPDFIndicator * transferLocation * transferAccessionIndicator ") @Valid @RequestParam(value = "include", required = false) List<String> include,@ApiParam(value = "Also include **source** (in addition to **entries**) with folder information on the specified parent **transferContainerId**.") @Valid @RequestParam(value = "includeSource", required = false) Boolean includeSource,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);


    @ApiOperation(value = "Update transfer container", nickname = "updateTransferContainer", notes = "Updates the transfer container **transferContainerId**. For example, you can rename transfer container: ```JSON {   \"name\":\"My new name\" } ``` You can also set or update description and title properties: ```JSON {   \"properties\":     {        \"cm:description\": \"New Description\",        \"cm:title\":\"New Title\"     } } ``` **Note:** Currently there is no optimistic locking for updates, so they are applied in \"last one wins\" order. ", response = TransferContainerEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "transfer-containers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = TransferContainerEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: the update request is invalid or **transferContainerId** is not a valid format or **nodeBody** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to update **transferContainerId**"),
        @ApiResponse(code = 404, message = "**transferContainerId** does not exist"),
        @ApiResponse(code = 409, message = "Updated name clashes with an existing node in the current parent folder"),
        @ApiResponse(code = 422, message = "Model integrity exception, including transfer container name with invalid characters"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/transfer-containers/{transferContainerId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TransferContainerEntry> updateTransferContainer(@ApiParam(value = "The identifier of a transfer container. You can also use the -transfers- alias.",required=true) @PathVariable("transferContainerId") String transferContainerId,@ApiParam(value = "The node information to update." ,required=true )  @Valid @RequestBody TransferContainerBodyUpdate nodeBodyUpdate,@ApiParam(value = "Returns additional information about the transfer container. Any optional field from the response model can be requested. For example: * allowableOperations * path ") @Valid @RequestParam(value = "include", required = false) List<String> include,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);

}