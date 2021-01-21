/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.governance.classification.handler;

import org.alfresco.governance.classification.model.Error;
import org.alfresco.governance.classification.model.SecurityControlSettingBody;
import org.alfresco.governance.classification.model.SecurityControlSettingEntry;
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

@Api(value = "SecurityControlSettings")
public interface SecurityControlSettingsApi {

    @ApiOperation(value = "Get security control setting value", nickname = "getSecurityControlSetting", notes = "Gets the value for a selected **securityControlSettingKey**.", response = SecurityControlSettingEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "security-control-settings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SecurityControlSettingEntry.class),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to retrieve the value for **securityControlSettingKey**"),
        @ApiResponse(code = 404, message = "**securityControlSettingKey** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/security-control-settings/{securityControlSettingKey}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<SecurityControlSettingEntry
> getSecurityControlSetting(


@ApiParam(value = "The key for the security control setting. You can use one of the following settings: * -declassificationTimeFrame- for the declassification time frame value set in alfresco-global.properties file ",required=true) @PathVariable("securityControlSettingKey") String
 securityControlSettingKey



);


    @ApiOperation(value = "Update security control setting value", nickname = "updateSecurityControlSetting", notes = "Updates the value of a selected **securityControlSettingKey**.", response = SecurityControlSettingEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "security-control-settings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SecurityControlSettingEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **securityControlSettingValue** is not in a valid format or the **securityControlSettingKey** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to update the value for the setting with key **securityControlSettingKey**"),
        @ApiResponse(code = 404, message = "**securityControlSettingKey** does not exists"),
        @ApiResponse(code = 422, message = "There is a problem with the internal state that prevents the value from being updated, for example the declassification date recalculation process is currently running and so the declassification time frame cannot be changed. "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/security-control-settings/{securityControlSettingKey}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<SecurityControlSettingEntry
> updateSecurityControlSetting(


@ApiParam(value = "The key for the security control setting. You can use one of the following settings: * -declassificationTimeFrame- for the declassification time frame value set in alfresco-global.properties file ",required=true) @PathVariable("securityControlSettingKey") String
 securityControlSettingKey



,


@ApiParam(value = "The new value for the security control setting. This can be a string or number, depending on the setting key." ,required=true )  @Valid @RequestBody SecurityControlSettingBody securityControlSettingValue

);

}
