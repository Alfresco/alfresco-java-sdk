/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.core.handler;

import org.alfresco.core.model.ActivityPaging;
import org.alfresco.core.model.Error;
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

@Api(value = "Activities")
public interface ActivitiesApi {

    @ApiOperation(value = "List activities", nickname = "listActivitiesForPerson", notes = "Gets a list of activities for person **personId**.  You can use the `-me-` string in place of `<personId>` to specify the currently authenticated user. ", response = ActivityPaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "activities", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ActivityPaging.class),
        @ApiResponse(code = 400, message = "Invalid parameter: value of **maxItems**, **skipCount**, or **who** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have access to the activities for **personId**"),
        @ApiResponse(code = 404, message = "**personId** or **siteId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/people/{personId}/activities",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ActivityPaging
> listActivitiesForPerson(


@ApiParam(value = "The identifier of a person.",required=true) @PathVariable("personId") String
 personId



,@Min(0)

@ApiParam(value = "The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. ", defaultValue = "0") @Valid @RequestParam(value = "skipCount", required = false, defaultValue="0") Integer
 skipCount




,@Min(1)

@ApiParam(value = "The maximum number of items to return in the list.  If not supplied then the default value is 100. ", defaultValue = "100") @Valid @RequestParam(value = "maxItems", required = false, defaultValue="100") Integer
 maxItems




,

@ApiParam(value = "A filter to include the user's activities only `me`, other user's activities only `others`' ") @Valid @RequestParam(value = "who", required = false) String
 who




,

@ApiParam(value = "Include only activity feed entries relating to this site.") @Valid @RequestParam(value = "siteId", required = false) String
 siteId




,

@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String>
 fields




);

}
