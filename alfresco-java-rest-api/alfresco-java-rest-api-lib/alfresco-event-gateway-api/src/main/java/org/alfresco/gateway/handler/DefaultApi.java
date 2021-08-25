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
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.gateway.handler;

import org.alfresco.gateway.model.JsonNode;
import org.alfresco.gateway.model.Subscription;
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
@Api(value = "Default")
public interface DefaultApi {

    @ApiOperation(value = "", nickname = "createSubscription", notes = "Create a Subscription", response = Subscription.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "default response", response = Subscription.class) })
    @RequestMapping(value = "/subscriptions",
        produces = "application/json",
        consumes = "*/*",
        method = RequestMethod.POST)
    ResponseEntity<Subscription> createSubscription(@ApiParam(value = "The subscription object to be created"  )  @Valid @RequestBody Subscription body);


    @ApiOperation(value = "", nickname = "getSubscription", notes = "Get a Subscription by its id", response = Subscription.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "default response", response = Subscription.class) })
    @RequestMapping(value = "/subscriptions/{id}",
        produces = "application/json",
        method = RequestMethod.GET)
    ResponseEntity<Subscription> getSubscription(@ApiParam(value = "The subscription id",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "", nickname = "partiallyUpdateSubscription", notes = "Update the status of a Subscription", response = Subscription.class, tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "default response", response = Subscription.class) })
    @RequestMapping(value = "/subscriptions/{id}",
        produces = "application/json",
        consumes = "*/*",
        method = RequestMethod.PATCH)
    ResponseEntity<Subscription> partiallyUpdateSubscription(@ApiParam(value = "The subscription id",required=true) @PathVariable("id") String id, @ApiParam(value = "The JSON snippet holding the new status of the subscription"  )  @Valid @RequestBody JsonNode body);

}
