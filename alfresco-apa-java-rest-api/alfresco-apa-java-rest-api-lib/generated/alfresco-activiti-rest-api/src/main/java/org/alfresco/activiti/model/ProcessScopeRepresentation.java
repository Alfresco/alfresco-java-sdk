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
package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.alfresco.activiti.model.EntityVariableScopeRepresentation;
import org.alfresco.activiti.model.FormScopeRepresentation;
import org.alfresco.activiti.model.VariableMappingRepresentation;
import org.alfresco.activiti.model.VariableScopeRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessScopeRepresentation
 */
@Validated


public class ProcessScopeRepresentation   {
  @JsonProperty("activityIds")
  @Valid
  private List<String> activityIds = null;

  @JsonProperty("activityIdsByCollapsedSubProcessIdMap")
  @Valid
  private Map<String, List<String>> activityIdsByCollapsedSubProcessIdMap = null;

  @JsonProperty("activityIdsByDecisionTableIdMap")
  @Valid
  private Map<String, List<String>> activityIdsByDecisionTableIdMap = null;

  @JsonProperty("activityIdsByFormIdMap")
  @Valid
  private Map<String, List<String>> activityIdsByFormIdMap = null;

  @JsonProperty("activityIdsWithExcludedSubProcess")
  @Valid
  private List<String> activityIdsWithExcludedSubProcess = null;

  @JsonProperty("activitySidsByActivityIdMap")
  @Valid
  private Map<String, String> activitySidsByActivityIdMap = null;

  @JsonProperty("customStencilVariables")
  @Valid
  private Map<String, List<VariableScopeRepresentation>> customStencilVariables = null;

  @JsonProperty("entityVariables")
  @Valid
  private Map<String, List<EntityVariableScopeRepresentation>> entityVariables = null;

  @JsonProperty("executionVariables")
  @Valid
  private Map<String, List<VariableScopeRepresentation>> executionVariables = null;

  @JsonProperty("fieldToVariableMappings")
  @Valid
  private Map<String, List<VariableScopeRepresentation>> fieldToVariableMappings = null;

  @JsonProperty("forms")
  @Valid
  private Map<String, List<FormScopeRepresentation>> forms = null;

  @JsonProperty("metadataVariables")
  @Valid
  private Map<String, List<VariableScopeRepresentation>> metadataVariables = null;

  @JsonProperty("modelId")
  private Long modelId = null;

  @JsonProperty("processModelType")
  private Integer processModelType = null;

  @JsonProperty("responseVariables")
  @Valid
  private Map<String, List<VariableScopeRepresentation>> responseVariables = null;

  @JsonProperty("reusableFieldMapping")
  @Valid
  private Map<String, List<VariableMappingRepresentation>> reusableFieldMapping = null;

  public ProcessScopeRepresentation activityIds(List<String> activityIds) {
    this.activityIds = activityIds;
    return this;
  }

  public ProcessScopeRepresentation addActivityIdsItem(String activityIdsItem) {
    if (this.activityIds == null) {
      this.activityIds = new ArrayList<>();
    }
    this.activityIds.add(activityIdsItem);
    return this;
  }

  /**
   * Get activityIds
   * @return activityIds
   **/
  @ApiModelProperty(value = "")
  
    public List<String> getActivityIds() {
    return activityIds;
  }

  public void setActivityIds(List<String> activityIds) {
    this.activityIds = activityIds;
  }

  public ProcessScopeRepresentation activityIdsByCollapsedSubProcessIdMap(Map<String, List<String>> activityIdsByCollapsedSubProcessIdMap) {
    this.activityIdsByCollapsedSubProcessIdMap = activityIdsByCollapsedSubProcessIdMap;
    return this;
  }

  public ProcessScopeRepresentation putActivityIdsByCollapsedSubProcessIdMapItem(String key, List<String> activityIdsByCollapsedSubProcessIdMapItem) {
    if (this.activityIdsByCollapsedSubProcessIdMap == null) {
      this.activityIdsByCollapsedSubProcessIdMap = new HashMap<>();
    }
    this.activityIdsByCollapsedSubProcessIdMap.put(key, activityIdsByCollapsedSubProcessIdMapItem);
    return this;
  }

  /**
   * Get activityIdsByCollapsedSubProcessIdMap
   * @return activityIdsByCollapsedSubProcessIdMap
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<String>> getActivityIdsByCollapsedSubProcessIdMap() {
    return activityIdsByCollapsedSubProcessIdMap;
  }

  public void setActivityIdsByCollapsedSubProcessIdMap(Map<String, List<String>> activityIdsByCollapsedSubProcessIdMap) {
    this.activityIdsByCollapsedSubProcessIdMap = activityIdsByCollapsedSubProcessIdMap;
  }

  public ProcessScopeRepresentation activityIdsByDecisionTableIdMap(Map<String, List<String>> activityIdsByDecisionTableIdMap) {
    this.activityIdsByDecisionTableIdMap = activityIdsByDecisionTableIdMap;
    return this;
  }

  public ProcessScopeRepresentation putActivityIdsByDecisionTableIdMapItem(String key, List<String> activityIdsByDecisionTableIdMapItem) {
    if (this.activityIdsByDecisionTableIdMap == null) {
      this.activityIdsByDecisionTableIdMap = new HashMap<>();
    }
    this.activityIdsByDecisionTableIdMap.put(key, activityIdsByDecisionTableIdMapItem);
    return this;
  }

  /**
   * Get activityIdsByDecisionTableIdMap
   * @return activityIdsByDecisionTableIdMap
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<String>> getActivityIdsByDecisionTableIdMap() {
    return activityIdsByDecisionTableIdMap;
  }

  public void setActivityIdsByDecisionTableIdMap(Map<String, List<String>> activityIdsByDecisionTableIdMap) {
    this.activityIdsByDecisionTableIdMap = activityIdsByDecisionTableIdMap;
  }

  public ProcessScopeRepresentation activityIdsByFormIdMap(Map<String, List<String>> activityIdsByFormIdMap) {
    this.activityIdsByFormIdMap = activityIdsByFormIdMap;
    return this;
  }

  public ProcessScopeRepresentation putActivityIdsByFormIdMapItem(String key, List<String> activityIdsByFormIdMapItem) {
    if (this.activityIdsByFormIdMap == null) {
      this.activityIdsByFormIdMap = new HashMap<>();
    }
    this.activityIdsByFormIdMap.put(key, activityIdsByFormIdMapItem);
    return this;
  }

  /**
   * Get activityIdsByFormIdMap
   * @return activityIdsByFormIdMap
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<String>> getActivityIdsByFormIdMap() {
    return activityIdsByFormIdMap;
  }

  public void setActivityIdsByFormIdMap(Map<String, List<String>> activityIdsByFormIdMap) {
    this.activityIdsByFormIdMap = activityIdsByFormIdMap;
  }

  public ProcessScopeRepresentation activityIdsWithExcludedSubProcess(List<String> activityIdsWithExcludedSubProcess) {
    this.activityIdsWithExcludedSubProcess = activityIdsWithExcludedSubProcess;
    return this;
  }

  public ProcessScopeRepresentation addActivityIdsWithExcludedSubProcessItem(String activityIdsWithExcludedSubProcessItem) {
    if (this.activityIdsWithExcludedSubProcess == null) {
      this.activityIdsWithExcludedSubProcess = new ArrayList<>();
    }
    this.activityIdsWithExcludedSubProcess.add(activityIdsWithExcludedSubProcessItem);
    return this;
  }

  /**
   * Get activityIdsWithExcludedSubProcess
   * @return activityIdsWithExcludedSubProcess
   **/
  @ApiModelProperty(value = "")
  
    public List<String> getActivityIdsWithExcludedSubProcess() {
    return activityIdsWithExcludedSubProcess;
  }

  public void setActivityIdsWithExcludedSubProcess(List<String> activityIdsWithExcludedSubProcess) {
    this.activityIdsWithExcludedSubProcess = activityIdsWithExcludedSubProcess;
  }

  public ProcessScopeRepresentation activitySidsByActivityIdMap(Map<String, String> activitySidsByActivityIdMap) {
    this.activitySidsByActivityIdMap = activitySidsByActivityIdMap;
    return this;
  }

  public ProcessScopeRepresentation putActivitySidsByActivityIdMapItem(String key, String activitySidsByActivityIdMapItem) {
    if (this.activitySidsByActivityIdMap == null) {
      this.activitySidsByActivityIdMap = new HashMap<>();
    }
    this.activitySidsByActivityIdMap.put(key, activitySidsByActivityIdMapItem);
    return this;
  }

  /**
   * Get activitySidsByActivityIdMap
   * @return activitySidsByActivityIdMap
   **/
  @ApiModelProperty(value = "")
  
    public Map<String, String> getActivitySidsByActivityIdMap() {
    return activitySidsByActivityIdMap;
  }

  public void setActivitySidsByActivityIdMap(Map<String, String> activitySidsByActivityIdMap) {
    this.activitySidsByActivityIdMap = activitySidsByActivityIdMap;
  }

  public ProcessScopeRepresentation customStencilVariables(Map<String, List<VariableScopeRepresentation>> customStencilVariables) {
    this.customStencilVariables = customStencilVariables;
    return this;
  }

  public ProcessScopeRepresentation putCustomStencilVariablesItem(String key, List<VariableScopeRepresentation> customStencilVariablesItem) {
    if (this.customStencilVariables == null) {
      this.customStencilVariables = new HashMap<>();
    }
    this.customStencilVariables.put(key, customStencilVariablesItem);
    return this;
  }

  /**
   * Get customStencilVariables
   * @return customStencilVariables
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<VariableScopeRepresentation>> getCustomStencilVariables() {
    return customStencilVariables;
  }

  public void setCustomStencilVariables(Map<String, List<VariableScopeRepresentation>> customStencilVariables) {
    this.customStencilVariables = customStencilVariables;
  }

  public ProcessScopeRepresentation entityVariables(Map<String, List<EntityVariableScopeRepresentation>> entityVariables) {
    this.entityVariables = entityVariables;
    return this;
  }

  public ProcessScopeRepresentation putEntityVariablesItem(String key, List<EntityVariableScopeRepresentation> entityVariablesItem) {
    if (this.entityVariables == null) {
      this.entityVariables = new HashMap<>();
    }
    this.entityVariables.put(key, entityVariablesItem);
    return this;
  }

  /**
   * Get entityVariables
   * @return entityVariables
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<EntityVariableScopeRepresentation>> getEntityVariables() {
    return entityVariables;
  }

  public void setEntityVariables(Map<String, List<EntityVariableScopeRepresentation>> entityVariables) {
    this.entityVariables = entityVariables;
  }

  public ProcessScopeRepresentation executionVariables(Map<String, List<VariableScopeRepresentation>> executionVariables) {
    this.executionVariables = executionVariables;
    return this;
  }

  public ProcessScopeRepresentation putExecutionVariablesItem(String key, List<VariableScopeRepresentation> executionVariablesItem) {
    if (this.executionVariables == null) {
      this.executionVariables = new HashMap<>();
    }
    this.executionVariables.put(key, executionVariablesItem);
    return this;
  }

  /**
   * Get executionVariables
   * @return executionVariables
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<VariableScopeRepresentation>> getExecutionVariables() {
    return executionVariables;
  }

  public void setExecutionVariables(Map<String, List<VariableScopeRepresentation>> executionVariables) {
    this.executionVariables = executionVariables;
  }

  public ProcessScopeRepresentation fieldToVariableMappings(Map<String, List<VariableScopeRepresentation>> fieldToVariableMappings) {
    this.fieldToVariableMappings = fieldToVariableMappings;
    return this;
  }

  public ProcessScopeRepresentation putFieldToVariableMappingsItem(String key, List<VariableScopeRepresentation> fieldToVariableMappingsItem) {
    if (this.fieldToVariableMappings == null) {
      this.fieldToVariableMappings = new HashMap<>();
    }
    this.fieldToVariableMappings.put(key, fieldToVariableMappingsItem);
    return this;
  }

  /**
   * Get fieldToVariableMappings
   * @return fieldToVariableMappings
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<VariableScopeRepresentation>> getFieldToVariableMappings() {
    return fieldToVariableMappings;
  }

  public void setFieldToVariableMappings(Map<String, List<VariableScopeRepresentation>> fieldToVariableMappings) {
    this.fieldToVariableMappings = fieldToVariableMappings;
  }

  public ProcessScopeRepresentation forms(Map<String, List<FormScopeRepresentation>> forms) {
    this.forms = forms;
    return this;
  }

  public ProcessScopeRepresentation putFormsItem(String key, List<FormScopeRepresentation> formsItem) {
    if (this.forms == null) {
      this.forms = new HashMap<>();
    }
    this.forms.put(key, formsItem);
    return this;
  }

  /**
   * Get forms
   * @return forms
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<FormScopeRepresentation>> getForms() {
    return forms;
  }

  public void setForms(Map<String, List<FormScopeRepresentation>> forms) {
    this.forms = forms;
  }

  public ProcessScopeRepresentation metadataVariables(Map<String, List<VariableScopeRepresentation>> metadataVariables) {
    this.metadataVariables = metadataVariables;
    return this;
  }

  public ProcessScopeRepresentation putMetadataVariablesItem(String key, List<VariableScopeRepresentation> metadataVariablesItem) {
    if (this.metadataVariables == null) {
      this.metadataVariables = new HashMap<>();
    }
    this.metadataVariables.put(key, metadataVariablesItem);
    return this;
  }

  /**
   * Get metadataVariables
   * @return metadataVariables
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<VariableScopeRepresentation>> getMetadataVariables() {
    return metadataVariables;
  }

  public void setMetadataVariables(Map<String, List<VariableScopeRepresentation>> metadataVariables) {
    this.metadataVariables = metadataVariables;
  }

  public ProcessScopeRepresentation modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Get modelId
   * @return modelId
   **/
  @ApiModelProperty(value = "")
  
    public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  public ProcessScopeRepresentation processModelType(Integer processModelType) {
    this.processModelType = processModelType;
    return this;
  }

  /**
   * Get processModelType
   * @return processModelType
   **/
  @ApiModelProperty(value = "")
  
    public Integer getProcessModelType() {
    return processModelType;
  }

  public void setProcessModelType(Integer processModelType) {
    this.processModelType = processModelType;
  }

  public ProcessScopeRepresentation responseVariables(Map<String, List<VariableScopeRepresentation>> responseVariables) {
    this.responseVariables = responseVariables;
    return this;
  }

  public ProcessScopeRepresentation putResponseVariablesItem(String key, List<VariableScopeRepresentation> responseVariablesItem) {
    if (this.responseVariables == null) {
      this.responseVariables = new HashMap<>();
    }
    this.responseVariables.put(key, responseVariablesItem);
    return this;
  }

  /**
   * Get responseVariables
   * @return responseVariables
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<VariableScopeRepresentation>> getResponseVariables() {
    return responseVariables;
  }

  public void setResponseVariables(Map<String, List<VariableScopeRepresentation>> responseVariables) {
    this.responseVariables = responseVariables;
  }

  public ProcessScopeRepresentation reusableFieldMapping(Map<String, List<VariableMappingRepresentation>> reusableFieldMapping) {
    this.reusableFieldMapping = reusableFieldMapping;
    return this;
  }

  public ProcessScopeRepresentation putReusableFieldMappingItem(String key, List<VariableMappingRepresentation> reusableFieldMappingItem) {
    if (this.reusableFieldMapping == null) {
      this.reusableFieldMapping = new HashMap<>();
    }
    this.reusableFieldMapping.put(key, reusableFieldMappingItem);
    return this;
  }

  /**
   * Get reusableFieldMapping
   * @return reusableFieldMapping
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<VariableMappingRepresentation>> getReusableFieldMapping() {
    return reusableFieldMapping;
  }

  public void setReusableFieldMapping(Map<String, List<VariableMappingRepresentation>> reusableFieldMapping) {
    this.reusableFieldMapping = reusableFieldMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessScopeRepresentation processScopeRepresentation = (ProcessScopeRepresentation) o;
    return Objects.equals(this.activityIds, processScopeRepresentation.activityIds) &&
        Objects.equals(this.activityIdsByCollapsedSubProcessIdMap, processScopeRepresentation.activityIdsByCollapsedSubProcessIdMap) &&
        Objects.equals(this.activityIdsByDecisionTableIdMap, processScopeRepresentation.activityIdsByDecisionTableIdMap) &&
        Objects.equals(this.activityIdsByFormIdMap, processScopeRepresentation.activityIdsByFormIdMap) &&
        Objects.equals(this.activityIdsWithExcludedSubProcess, processScopeRepresentation.activityIdsWithExcludedSubProcess) &&
        Objects.equals(this.activitySidsByActivityIdMap, processScopeRepresentation.activitySidsByActivityIdMap) &&
        Objects.equals(this.customStencilVariables, processScopeRepresentation.customStencilVariables) &&
        Objects.equals(this.entityVariables, processScopeRepresentation.entityVariables) &&
        Objects.equals(this.executionVariables, processScopeRepresentation.executionVariables) &&
        Objects.equals(this.fieldToVariableMappings, processScopeRepresentation.fieldToVariableMappings) &&
        Objects.equals(this.forms, processScopeRepresentation.forms) &&
        Objects.equals(this.metadataVariables, processScopeRepresentation.metadataVariables) &&
        Objects.equals(this.modelId, processScopeRepresentation.modelId) &&
        Objects.equals(this.processModelType, processScopeRepresentation.processModelType) &&
        Objects.equals(this.responseVariables, processScopeRepresentation.responseVariables) &&
        Objects.equals(this.reusableFieldMapping, processScopeRepresentation.reusableFieldMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityIds, activityIdsByCollapsedSubProcessIdMap, activityIdsByDecisionTableIdMap, activityIdsByFormIdMap, activityIdsWithExcludedSubProcess, activitySidsByActivityIdMap, customStencilVariables, entityVariables, executionVariables, fieldToVariableMappings, forms, metadataVariables, modelId, processModelType, responseVariables, reusableFieldMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessScopeRepresentation {\n");
    
    sb.append("    activityIds: ").append(toIndentedString(activityIds)).append("\n");
    sb.append("    activityIdsByCollapsedSubProcessIdMap: ").append(toIndentedString(activityIdsByCollapsedSubProcessIdMap)).append("\n");
    sb.append("    activityIdsByDecisionTableIdMap: ").append(toIndentedString(activityIdsByDecisionTableIdMap)).append("\n");
    sb.append("    activityIdsByFormIdMap: ").append(toIndentedString(activityIdsByFormIdMap)).append("\n");
    sb.append("    activityIdsWithExcludedSubProcess: ").append(toIndentedString(activityIdsWithExcludedSubProcess)).append("\n");
    sb.append("    activitySidsByActivityIdMap: ").append(toIndentedString(activitySidsByActivityIdMap)).append("\n");
    sb.append("    customStencilVariables: ").append(toIndentedString(customStencilVariables)).append("\n");
    sb.append("    entityVariables: ").append(toIndentedString(entityVariables)).append("\n");
    sb.append("    executionVariables: ").append(toIndentedString(executionVariables)).append("\n");
    sb.append("    fieldToVariableMappings: ").append(toIndentedString(fieldToVariableMappings)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    metadataVariables: ").append(toIndentedString(metadataVariables)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    processModelType: ").append(toIndentedString(processModelType)).append("\n");
    sb.append("    responseVariables: ").append(toIndentedString(responseVariables)).append("\n");
    sb.append("    reusableFieldMapping: ").append(toIndentedString(reusableFieldMapping)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
