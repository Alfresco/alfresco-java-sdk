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
package com.alfresco.activiti.handler;

import com.alfresco.activiti.model.DecisionTableRepresentation;
import com.alfresco.activiti.model.DecisionTableSaveRepresentation;
import com.alfresco.activiti.model.ModelRepresentation;
import com.alfresco.activiti.model.ResultListDataRepresentationDecisionTableRepresentation;
import com.alfresco.activiti.model.ValidationErrorRepresentation;

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

@Api(value = "DecisionTableModels", description = "the DecisionTableModels API")
public interface DecisionTableModelsApi {

    @ApiOperation(value = "Export decision table model.", nickname = "exportDecisionTableUsingGET", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId}/export",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> exportDecisionTableUsingGET(@ApiParam(value = "Decision table id.", required=true) @PathVariable("decisionTableId") Long decisionTableId);


    @ApiOperation(value = "Export specific version for decision table model.", nickname = "exportHistoricDecisionTableUsingGET", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models/history/{historyModelId}/export",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> exportHistoricDecisionTableUsingGET(@ApiParam(value = "Id of another version of same decision table model.", required=true) @PathVariable("historyModelId") Long historyModelId);


    @ApiOperation(value = "Get a decision table model by id.", nickname = "getDecisionTableUsingGET1", notes = "", response = DecisionTableRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DecisionTableRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<DecisionTableRepresentation> getDecisionTableUsingGET1(@ApiParam(value = "Decision table id.", required=true) @PathVariable("decisionTableId") Long decisionTableId);


    @ApiOperation(value = "Get a list of decision table models (without decision table definition).", nickname = "getDecisionTablesUsingGET1", notes = "", response = ResultListDataRepresentationDecisionTableRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationDecisionTableRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationDecisionTableRepresentation> getDecisionTablesUsingGET1(@ApiParam(value = "A reference to another model (ie. a process) associated with one or more decision table models.") @Valid @RequestParam(value = "referenceId", required = false) Long referenceId, @ApiParam(value = "Filter (search for a specified pattern) the decision tables associated with another model (i.e. a process) by name or description.") @Valid @RequestParam(value = "filter", required = false) String filter);


    @ApiOperation(value = "Get a specific list of decision table models (with decision table definition) by their ids.", nickname = "getDecisionTablesUsingGET2", notes = "", response = DecisionTableRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DecisionTableRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models/values",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<DecisionTableRepresentation>> getDecisionTablesUsingGET2(@NotNull @ApiParam(value = "The id of the decision table. This id can be specified multiple times in the request for each decision table model id wanted to be returned.", required = true) @Valid @RequestParam(value = "decisionTableId", required = true) String decisionTableId);


    @ApiOperation(value = "Get specific version of a decision table model by id.", nickname = "getHistoricDecisionTableUsingGET", notes = "", response = DecisionTableRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DecisionTableRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models/history/{historyModelId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<DecisionTableRepresentation> getHistoricDecisionTableUsingGET(@ApiParam(value = "Id of another version of same decision table model.", required=true) @PathVariable("historyModelId") Long historyModelId);


    @ApiOperation(value = "Import decision table. This method return the decision table representation response as plain text.", nickname = "importDecisionTableTextUsingPOST", notes = "", response = String.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models/import-decision-table-text",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<String> importDecisionTableTextUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody Object body);


    @ApiOperation(value = "Import decision table model.", nickname = "importDecisionTableUsingPOST", notes = "", response = ModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models/import-decision-table",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ModelRepresentation> importDecisionTableUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody Object body);


    @ApiOperation(value = "Update decision table model.", nickname = "saveDecisionTableUsingPUT", notes = "", response = DecisionTableRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DecisionTableRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<DecisionTableRepresentation> saveDecisionTableUsingPUT(@ApiParam(value = "Decision table id.", required=true) @PathVariable("decisionTableId") Long decisionTableId, @ApiParam(value = "" ) @Valid @RequestBody DecisionTableSaveRepresentation body);


    @ApiOperation(value = "Validate decision table model.", nickname = "validateModelUsingPUT", notes = "", response = ValidationErrorRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "decision-table-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ValidationErrorRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/decision-table-models/{decisionTableId}/validate",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<List<ValidationErrorRepresentation>> validateModelUsingPUT(@ApiParam(value = "Decision table id.", required=true) @PathVariable("decisionTableId") Long decisionTableId, @ApiParam(value = "" ) @Valid @RequestBody DecisionTableSaveRepresentation body);

}
