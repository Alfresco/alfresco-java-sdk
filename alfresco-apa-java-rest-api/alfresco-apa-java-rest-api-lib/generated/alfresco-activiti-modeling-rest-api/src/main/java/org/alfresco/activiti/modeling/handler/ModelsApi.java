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
package org.alfresco.activiti.modeling.handler;

import org.alfresco.activiti.modeling.model.EntryResponseContentOfModel;
import org.alfresco.activiti.modeling.model.ListResponseContentOfModel;
import org.alfresco.activiti.modeling.model.ListResponseContentOfModelType;
import org.alfresco.activiti.modeling.model.ModelReq;
import org.springframework.core.io.Resource;

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
import org.springframework.cloud.openfeign.CollectionFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Api(value = "Models", description = "the Models API")
public interface ModelsApi {

    @ApiOperation(value = "Create new model belonging to an project", nickname = "createModelUsingPOST", notes = "Create a new model related to an existing project", response = EntryResponseContentOfModel.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = EntryResponseContentOfModel.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/projects/{projectId}/models",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EntryResponseContentOfModel> createModelUsingPOST(@ApiParam(value = "The id of the project to associate the new model with", required=true) @PathVariable("projectId") String projectId, @ApiParam(value = "" ) @Valid @RequestBody ModelReq body);


    @ApiOperation(value = "Create new model that does note belong to a project", nickname = "createModelWithoutProjectUsingPOST", notes = "Create a new model with no relationship to other projects", response = EntryResponseContentOfModel.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = EntryResponseContentOfModel.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/models",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EntryResponseContentOfModel> createModelWithoutProjectUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody ModelReq body);


    @ApiOperation(value = "Delete model", nickname = "deleteModelUsingDELETE", notes = "", tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/v1/models/{modelId}",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deleteModelUsingDELETE(@ApiParam(value = "The id of the model to delete", required=true) @PathVariable("modelId") String modelId);


    @ApiOperation(value = "Delete the relationship between an existing model, and the project", nickname = "deleteProjectModelRelationshipUsingDELETE", notes = "Get the model associated with the project updated. Minimal information for the model is returned.", response = EntryResponseContentOfModel.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfModel.class),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden") })
    @RequestMapping(value = "/v1/projects/{projectId}/models/{modelId}",
        produces = "application/json", 
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EntryResponseContentOfModel> deleteProjectModelRelationshipUsingDELETE(@ApiParam(value = "The id of the project of the relationship to delete", required=true) @PathVariable("projectId") String projectId, @ApiParam(value = "The id of the model of the relationship to delete", required=true) @PathVariable("modelId") String modelId);


    @ApiOperation(value = "Export a model definition as file", nickname = "exportModelUsingGET", notes = "Allows to download a file containing a model metadata along with the model content.", tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/models/{modelId}/export",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    byte[] exportModelUsingGET(@ApiParam(value = "The id of the model to export", required=true) @PathVariable("modelId") String modelId, @ApiParam(value = "<b>true</b> value enables a web browser to download the file as an attachment.<br> <b>false</b> means that a web browser may preview the file in a new tab or window, but not download the file.") @Valid @RequestParam(value = "attachment", required = false) Boolean attachment);


    @ApiOperation(value = "List all the models that are not coupled to a project", nickname = "getGlobalModelsUsingGET", notes = "Get the models that has GLOBAL as scope. Minimal information for each model is returned.", response = ListResponseContentOfModel.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentOfModel.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/models",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ListResponseContentOfModel> getGlobalModelsUsingGET(@NotNull @ApiParam(value = "The type of the model to filter", required = true) @Valid @RequestParam(value = "type", required = true) String type, @ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort, @ApiParam(value = "If true, then models with no relationship to any project are retrieved regardless of their scope") @Valid @RequestParam(value = "includeOrphans", required = false) Boolean includeOrphans);


    @ApiOperation(value = "Get the model content", nickname = "getModelContentUsingGET", notes = "Retrieve the content of the model for the identifier <b>modelId</b> with the content type corresponding to the model type (xml for process models and json for the others).<br>For <b>Accept: image/svg+xml</b> request header, the svg image corresponding to the model content will be retrieved.", tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/models/{modelId}/content",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    byte[] getModelContentUsingGET(@ApiParam(value = "The id of the model to get the content", required=true) @PathVariable("modelId") String modelId);


    @ApiOperation(value = "List model types", nickname = "getModelTypesUsingGET", notes = "Get the list of available model types.", response = ListResponseContentOfModelType.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentOfModelType.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/model-types",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ListResponseContentOfModelType> getModelTypesUsingGET(@ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "Get metadata information for a model", nickname = "getModelUsingGET", notes = "", response = EntryResponseContentOfModel.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfModel.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/models/{modelId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EntryResponseContentOfModel> getModelUsingGET(@ApiParam(value = "The id of the model to retrieve", required=true) @PathVariable("modelId") String modelId);


    @ApiOperation(value = "List models for an project", nickname = "getModelsUsingGET", notes = "Get the models associated with an project. Minimal information for each model is returned.", response = ListResponseContentOfModel.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ListResponseContentOfModel.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/projects/{projectId}/models",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ListResponseContentOfModel> getModelsUsingGET(@ApiParam(value = "The id of the project to get the models for", required=true) @PathVariable("projectId") String projectId, @NotNull @ApiParam(value = "The type of the model to filter", required = true) @Valid @RequestParam(value = "type", required = true) String type, @ApiParam(value = "") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount, @ApiParam(value = "") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "Get validation schema for model type", nickname = "getSchemaUsingGET", notes = "Get the content of the schema used to validate the given model type.", response = String.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/schemas/{modelType}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    byte[] getSchemaUsingGET(@ApiParam(value = "modelType", required=true) @PathVariable("modelType") String modelType);


    @ApiOperation(value = "Import a model from file", nickname = "importModelUsingPOST", notes = "Allows a file to be uploaded containing a model definition.", response = EntryResponseContentOfModel.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = EntryResponseContentOfModel.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/projects/{projectId}/models/import",
        produces = "application/json", 
        consumes = "multipart/form-data",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EntryResponseContentOfModel> importModelUsingPOST(@ApiParam(value = "The id of the project to associate the new model with", required=true) @PathVariable("projectId") String projectId, @ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file, @ApiParam(value = "") @RequestParam(value="type", required=false)  String type);


    @ApiOperation(value = "Add or update the relationship between an existing model, and the project", nickname = "putProjectModelRelationshipUsingPUT", notes = "Get the model associated with the project updated. Minimal information for the model is returned.", response = EntryResponseContentOfModel.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfModel.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/projects/{projectId}/models/{modelId}",
        produces = "application/json", 
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EntryResponseContentOfModel> putProjectModelRelationshipUsingPUT(@ApiParam(value = "The id of the project to associate the model with", required=true) @PathVariable("projectId") String projectId, @ApiParam(value = "The id of the model to associate the project with", required=true) @PathVariable("modelId") String modelId, @ApiParam(value = "Scope to update the model if needed (optional)") @Valid @RequestParam(value = "scope", required = false) String scope, @ApiParam(value = "If the scope of the model has restrictions on the number of projects that a model can belong to, remove the other relationships of the model with other projects") @Valid @RequestParam(value = "force", required = false) Boolean force);


    @ApiOperation(value = "Update model content", nickname = "updateModelContentUsingPUT", notes = "Update the content of the model from file.", tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/models/{modelId}/content",
        consumes = "multipart/form-data",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> updateModelContentUsingPUT(@ApiParam(value = "The id of the model to update", required=true) @PathVariable("modelId") String modelId, @ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file);


    @ApiOperation(value = "Update model metadata", nickname = "updateModelUsingPUT", notes = "Update the details of a model.", response = EntryResponseContentOfModel.class, tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfModel.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/models/{modelId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EntryResponseContentOfModel> updateModelUsingPUT(@ApiParam(value = "The id of the model to update", required=true) @PathVariable("modelId") String modelId, @ApiParam(value = "" ) @Valid @RequestBody ModelReq body);


    @ApiOperation(value = "Validate model extensions", nickname = "validateModelExtensionsUsingPOST", notes = "Allows to validate the model extensions without save them.", tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/models/{modelId}/validate/extensions",
        consumes = "multipart/form-data",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> validateModelExtensionsUsingPOST(@ApiParam(value = "The id of the model to validate the content for", required=true) @PathVariable("modelId") String modelId, @ApiParam(value = "The id of the project in whose context the model is going to be validated") @Valid @RequestParam(value = "projectId", required = false) String projectId, @ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile file);


    @ApiOperation(value = "Validate a model content", nickname = "validateModelUsingPOST", notes = "Allows to validate the model content without save it.", tags={ "models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/v1/models/{modelId}/validate",
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> validateModelUsingPOST(@ApiParam(value = "The id of the model to validate the content for", required=true) @PathVariable("modelId") String modelId, @ApiParam(value = "The id of the project in whose context the model is going to be validated") @Valid @RequestParam(value = "projectId", required = false) String projectId, @ApiParam(value = "The model is going to be validated and checked used in other model") @Valid @RequestParam(value = "validateUsage", required = false) Boolean validateUsage, @ApiParam(value = "" ) @Valid @RequestBody Object body);

}
