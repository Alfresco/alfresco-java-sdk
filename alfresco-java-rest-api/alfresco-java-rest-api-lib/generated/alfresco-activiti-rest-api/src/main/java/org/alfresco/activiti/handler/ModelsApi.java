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
package org.alfresco.activiti.handler;

import org.alfresco.activiti.model.ModelRepresentation;
import org.alfresco.activiti.model.ObjectNode;
import org.springframework.core.io.Resource;
import org.alfresco.activiti.model.ResultListDataRepresentationModelRepresentation;
import org.alfresco.activiti.model.ValidationErrorRepresentation;
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

@Api(value = "Models")
public interface ModelsApi {

    @ApiOperation(value = "Create a new model", nickname = "createModelUsingPOST", notes = "", response = ModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelRepresentation.class) })
    @RequestMapping(value = "/enterprise/models",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ModelRepresentation> createModelUsingPOST(@ApiParam(value = "modelRepresentation" ,required=true )  @Valid @RequestBody ModelRepresentation modelRepresentation);


    @ApiOperation(value = "Delete a model", nickname = "deleteModelUsingDELETE", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/enterprise/models/{modelId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteModelUsingDELETE(@ApiParam(value = "modelId",required=true) @PathVariable("modelId") Long modelId,@ApiParam(value = "cascade") @Valid @RequestParam(value = "cascade", required = false) Boolean cascade,@ApiParam(value = "deleteRuntimeApp") @Valid @RequestParam(value = "deleteRuntimeApp", required = false) Boolean deleteRuntimeApp);


    @ApiOperation(value = "Duplicate an existing model", nickname = "duplicateModelUsingPOST", notes = "", response = ModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelRepresentation.class) })
    @RequestMapping(value = "/enterprise/models/{modelId}/clone",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ModelRepresentation> duplicateModelUsingPOST(@ApiParam(value = "modelId",required=true) @PathVariable("modelId") Long modelId,@ApiParam(value = "modelRepresentation" ,required=true )  @Valid @RequestBody ModelRepresentation modelRepresentation);


    @ApiOperation(value = "Get model content", nickname = "getModelJSONUsingGET", notes = "", response = ObjectNode.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ObjectNode.class) })
    @RequestMapping(value = "/enterprise/models/{modelId}/editor/json",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ObjectNode> getModelJSONUsingGET(@ApiParam(value = "modelId",required=true) @PathVariable("modelId") Long modelId);


    @ApiOperation(value = "Get a model's thumbnail image", nickname = "getModelThumbnailUsingGET", notes = "", response = byte[].class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = byte[].class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/models/{modelId}/thumbnail",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<List<byte[]>> getModelThumbnailUsingGET(@ApiParam(value = "modelId",required=true) @PathVariable("modelId") Long modelId);


    @ApiOperation(value = "Get a model", nickname = "getModelUsingGET", notes = "Models act as containers for process, form, decision table and app definitions", response = ModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelRepresentation.class) })
    @RequestMapping(value = "/enterprise/models/{modelId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ModelRepresentation> getModelUsingGET(@ApiParam(value = "modelId",required=true) @PathVariable("modelId") Long modelId,@ApiParam(value = "includePermissions") @Valid @RequestParam(value = "includePermissions", required = false) Boolean includePermissions);


    @ApiOperation(value = "List process definition models shared with the current user", nickname = "getModelsToIncludeInAppDefinitionUsingGET", notes = "", response = ResultListDataRepresentationModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationModelRepresentation.class) })
    @RequestMapping(value = "/enterprise/models-for-app-definition",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationModelRepresentation> getModelsToIncludeInAppDefinitionUsingGET();


    @ApiOperation(value = "List models (process, form, decision rule or app)", nickname = "getModelsUsingGET", notes = "", response = ResultListDataRepresentationModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationModelRepresentation.class) })
    @RequestMapping(value = "/enterprise/models",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationModelRepresentation> getModelsUsingGET(@ApiParam(value = "filter") @Valid @RequestParam(value = "filter", required = false) String filter,@ApiParam(value = "sort") @Valid @RequestParam(value = "sort", required = false) String sort,@ApiParam(value = "modelType") @Valid @RequestParam(value = "modelType", required = false) Integer modelType,@ApiParam(value = "referenceId") @Valid @RequestParam(value = "referenceId", required = false) Long referenceId);


    @ApiOperation(value = "Create a new version of a model", nickname = "importNewVersionUsingPOST", notes = "", response = ModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelRepresentation.class) })
    @RequestMapping(value = "/enterprise/models/{modelId}/newversion",
        produces = "application/json", 
        consumes = "multipart/form-data",
        method = RequestMethod.POST)
    ResponseEntity<ModelRepresentation> importNewVersionUsingPOST(@ApiParam(value = "modelId",required=true) @PathVariable("modelId") Long modelId,@ApiParam(value = "file detail") @PathVariable("file") MultipartFile file);


    @ApiOperation(value = "Import a BPMN 2.0 XML file", nickname = "importProcessModelUsingPOST", notes = "", response = ModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelRepresentation.class) })
    @RequestMapping(value = "/enterprise/process-models/import",
        produces = "application/json", 
        consumes = "multipart/form-data",
        method = RequestMethod.POST)
    ResponseEntity<ModelRepresentation> importProcessModelUsingPOST(@ApiParam(value = "file detail") @PathVariable("file") MultipartFile file);


    @ApiOperation(value = "Update model content", nickname = "saveModelUsingPOST", notes = "", response = ModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelRepresentation.class) })
    @RequestMapping(value = "/enterprise/models/{modelId}/editor/json",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<ModelRepresentation> saveModelUsingPOST(@ApiParam(value = "modelId",required=true) @PathVariable("modelId") Long modelId,@ApiParam(value = "values" ,required=true )  @Valid @RequestBody Object values);


    @ApiOperation(value = "Update a model", nickname = "updateModelUsingPUT", notes = "This method allows you to update the metadata of a model. In order to update the content of the model you will need to call the specific endpoint for that model type.", response = ModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelRepresentation.class) })
    @RequestMapping(value = "/enterprise/models/{modelId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<ModelRepresentation> updateModelUsingPUT(@ApiParam(value = "modelId",required=true) @PathVariable("modelId") Long modelId,@ApiParam(value = "updatedModel" ,required=true )  @Valid @RequestBody ModelRepresentation updatedModel);


    @ApiOperation(value = "Validate model content", nickname = "validateModelUsingPOST", notes = "", response = ValidationErrorRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ValidationErrorRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/models/{modelId}/editor/validate",
        produces = "application/json", 
        consumes = "application/x-www-form-urlencoded",
        method = RequestMethod.POST)
    ResponseEntity<List<ValidationErrorRepresentation>> validateModelUsingPOST(@ApiParam(value = "modelId",required=true) @PathVariable("modelId") Long modelId,@ApiParam(value = "values"  )  @Valid @RequestBody Object values);

}