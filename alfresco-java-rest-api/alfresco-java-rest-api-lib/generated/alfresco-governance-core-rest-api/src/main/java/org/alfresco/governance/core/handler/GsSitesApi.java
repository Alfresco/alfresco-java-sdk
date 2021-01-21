/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.governance.core.handler;

import org.alfresco.governance.core.model.Error;
import org.alfresco.governance.core.model.RMSiteBodyCreate;
import org.alfresco.governance.core.model.RMSiteBodyUpdate;
import org.alfresco.governance.core.model.RMSiteEntry;
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

@Api(value = "GsSites")
public interface GsSitesApi {

    @ApiOperation(value = "Create the Records Management (RM) site", nickname = "createRMSite", notes = " Creates the RM site with the given details.  **Note:** The default site id is rm and the default site name is Records Management. The id of a site cannot be updated once the site has been created.  For example, to create an RM site named \"Records Management\" with \"Records Management Description\" as description, the following body could be used: ```JSON {   \"title\": \"Records Management\",   \"description\": \"Records Management Description\" } ```  The creator will be added as a member with Site Manager role.  When you create the RM site, the **filePlan** structure is also created including special containers, such as containers for transfers, holds and, unfiled records. ", response = RMSiteEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "gs-sites", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful response", response = RMSiteEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **title**, or **description** exceed the maximum length; or **siteBodyCreate** invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 409, message = "Site with the given identifier already exists"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/gs-sites",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<RMSiteEntry
> createRMSite(


@ApiParam(value = "The site details" ,required=true )  @Valid @RequestBody RMSiteBodyCreate siteBodyCreate

,

@ApiParam(value = "Flag to indicate whether the RM site should not be added to the user's site favorites.", defaultValue = "false") @Valid @RequestParam(value = "skipAddToFavorites", required = false, defaultValue="false") Boolean
 skipAddToFavorites




);


    @ApiOperation(value = "Delete the Records Management (RM) site", nickname = "deleteRMSite", notes = " Deletes the RM site. ", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "gs-sites", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response"),
        @ApiResponse(code = 400, message = "Invalid parameter: DELETE request is only supported for the RM site "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to delete the site that is visible to them."),
        @ApiResponse(code = 404, message = "RM site does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/gs-sites/rm",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    ResponseEntity<Void
> deleteRMSite();


    @ApiOperation(value = "Get the Records Management (RM) site", nickname = "getRMSite", notes = " Gets information for RM site. ", response = RMSiteEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "gs-sites", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RMSiteEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: GET request is only  supported for the RM site "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "RM site does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/gs-sites/rm",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<RMSiteEntry
> getRMSite(

@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String>
 fields




);


    @ApiOperation(value = "Update the Records Management (RM) site", nickname = "updateRMSite", notes = " Update the details for the RM site. Site Manager or other (site) admin can update title or description.  **Note**: the id, site visibility, or compliance of the RM site cannot be updated once the site has been created. ", response = RMSiteEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "gs-sites", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RMSiteEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: PUT request is supported only for the RM site, or **siteBodyUpdate** invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to update the RM site that is visible to them."),
        @ApiResponse(code = 404, message = "RM site does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/gs-sites/rm",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<RMSiteEntry
> updateRMSite(


@ApiParam(value = "The RM site information to update." ,required=true )  @Valid @RequestBody RMSiteBodyUpdate siteBodyUpdate

,

@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String>
 fields




);

}
