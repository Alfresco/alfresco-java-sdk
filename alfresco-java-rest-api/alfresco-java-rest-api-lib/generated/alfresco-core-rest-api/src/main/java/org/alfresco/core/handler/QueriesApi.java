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
package org.alfresco.core.handler;

import org.alfresco.core.model.Error;
import org.alfresco.core.model.NodePaging;
import org.alfresco.core.model.PersonPaging;
import org.alfresco.core.model.SitePaging;
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

@Api(value = "Queries")
public interface QueriesApi {

    @ApiOperation(value = "Find nodes", nickname = "findNodes", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of nodes that match the given search criteria.  The search term is used to look for nodes that match against name, title, description, full text content or tags.  The search term: - must contain a minimum of 3 alphanumeric characters - allows \"quoted term\" - can optionally use '*' for wildcard matching  By default, file and folder types will be searched unless a specific type is provided as a query parameter.  By default, the search will be across the repository unless a specific root node id is provided to start the search from.  You can sort the result list using the **orderBy** parameter. You can specify one or more of the following fields in the **orderBy** parameter: * name * modifiedAt * createdAt ", response = NodePaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = NodePaging.class),
        @ApiResponse(code = 400, message = "Invalid parameter: value of **maxItems** or **skipCount** is invalid, or search **term** too short, or **nodeType** unknown, or **orderBy** invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**rootNodeId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/queries/nodes",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<NodePaging
> findNodes(@NotNull 

@ApiParam(value = "The term to search for.", required = true) @Valid @RequestParam(value = "term", required = true) String
 term




,

@ApiParam(value = "The id of the node to start the search from.  Supports the aliases -my-, -root- and -shared-. ") @Valid @RequestParam(value = "rootNodeId", required = false) String
 rootNodeId




,@Min(0)

@ApiParam(value = "The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. ", defaultValue = "0") @Valid @RequestParam(value = "skipCount", required = false, defaultValue="0") Integer
 skipCount




,@Min(1)

@ApiParam(value = "The maximum number of items to return in the list.  If not supplied then the default value is 100. ", defaultValue = "100") @Valid @RequestParam(value = "maxItems", required = false, defaultValue="100") Integer
 maxItems




,

@ApiParam(value = "Restrict the returned results to only those of the given node type and its sub-types ") @Valid @RequestParam(value = "nodeType", required = false) String
 nodeType




,

@ApiParam(value = "Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * isLink * isFavorite * isLocked * path * properties ") @Valid @RequestParam(value = "include", required = false) List<String>
 include




,

@ApiParam(value = "A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. ") @Valid @RequestParam(value = "orderBy", required = false) List<String>
 orderBy




,

@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String>
 fields




);


    @ApiOperation(value = "Find people", nickname = "findPeople", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of people that match the given search criteria.  The search term is used to look for matches against person id, firstname and lastname.  The search term: - must contain a minimum of 2 alphanumeric characters - can optionally use '*' for wildcard matching within the term  You can sort the result list using the **orderBy** parameter. You can specify one or more of the following fields in the **orderBy** parameter: * id * firstName * lastName        ", response = PersonPaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = PersonPaging.class),
        @ApiResponse(code = 400, message = "Invalid parameter: value of **maxItems** or **skipCount** is invalid, or search **term** too short, or **orderBy** invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/queries/people",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<PersonPaging
> findPeople(@NotNull 

@ApiParam(value = "The term to search for. ", required = true) @Valid @RequestParam(value = "term", required = true) String
 term




,@Min(0)

@ApiParam(value = "The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. ", defaultValue = "0") @Valid @RequestParam(value = "skipCount", required = false, defaultValue="0") Integer
 skipCount




,@Min(1)

@ApiParam(value = "The maximum number of items to return in the list.  If not supplied then the default value is 100. ", defaultValue = "100") @Valid @RequestParam(value = "maxItems", required = false, defaultValue="100") Integer
 maxItems




,

@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String>
 fields




,

@ApiParam(value = "A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. ") @Valid @RequestParam(value = "orderBy", required = false) List<String>
 orderBy




);


    @ApiOperation(value = "Find sites", nickname = "findSites", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of sites that match the given search criteria.  The search term is used to look for sites that match against site id, title or description.  The search term: - must contain a minimum of 2 alphanumeric characters - can optionally use '*' for wildcard matching within the term  The default sort order for the returned list is for sites to be sorted by ascending id.  You can override the default by using the **orderBy** parameter. You can specify one or more of the following fields in the **orderBy** parameter: * id * title * description ", response = SitePaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SitePaging.class),
        @ApiResponse(code = 400, message = "Invalid parameter: value of **maxItems** or **skipCount** is invalid, or search **term** too short, or **orderBy** invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/queries/sites",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<SitePaging
> findSites(@NotNull 

@ApiParam(value = "The term to search for.", required = true) @Valid @RequestParam(value = "term", required = true) String
 term




,@Min(0)

@ApiParam(value = "The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. ", defaultValue = "0") @Valid @RequestParam(value = "skipCount", required = false, defaultValue="0") Integer
 skipCount




,@Min(1)

@ApiParam(value = "The maximum number of items to return in the list.  If not supplied then the default value is 100. ", defaultValue = "100") @Valid @RequestParam(value = "maxItems", required = false, defaultValue="100") Integer
 maxItems




,

@ApiParam(value = "A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. ") @Valid @RequestParam(value = "orderBy", required = false) List<String>
 orderBy




,

@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String>
 fields




);

}
