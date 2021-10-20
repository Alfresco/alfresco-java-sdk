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
package com.alfresco.activiti.model;

import java.util.Objects;
import com.alfresco.activiti.model.FieldValueInfo;
import com.alfresco.activiti.model.FormFieldRepresentation;
import com.alfresco.activiti.model.FormJavascriptEventRepresentation;
import com.alfresco.activiti.model.FormOutcomeRepresentation;
import com.alfresco.activiti.model.FormTabRepresentation;
import com.alfresco.activiti.model.FormVariableRepresentation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormDefinitionRepresentationReq
 */
@Validated


public class FormDefinitionRepresentationReq   {
  @JsonProperty("className")
  private String className = null;

  @JsonProperty("customFeildsValueInfo")
  @Valid
  private Map<String, FieldValueInfo> customFeildsValueInfo = null;

  @JsonProperty("customFieldTemplates")
  @Valid
  private Map<String, String> customFieldTemplates = null;

  @JsonProperty("customFieldsValueInfo")
  @Valid
  private Map<String, FieldValueInfo> customFieldsValueInfo = null;

  @JsonProperty("fields")
  @Valid
  private List<FormFieldRepresentation> fields = null;

  @JsonProperty("globalDateFormat")
  private String globalDateFormat = null;

  @JsonProperty("gridsterForm")
  private Boolean gridsterForm = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("javascriptEvents")
  @Valid
  private List<FormJavascriptEventRepresentation> javascriptEvents = null;

  @JsonProperty("metadata")
  @Valid
  private Map<String, String> metadata = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("outcomeTarget")
  private String outcomeTarget = null;

  @JsonProperty("outcomes")
  @Valid
  private List<FormOutcomeRepresentation> outcomes = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionName")
  private String processDefinitionName = null;

  @JsonProperty("selectedOutcome")
  private String selectedOutcome = null;

  @JsonProperty("style")
  private String style = null;

  @JsonProperty("tabs")
  @Valid
  private List<FormTabRepresentation> tabs = null;

  @JsonProperty("taskDefinitionKey")
  private String taskDefinitionKey = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("taskName")
  private String taskName = null;

  @JsonProperty("variables")
  @Valid
  private List<FormVariableRepresentation> variables = null;

  public FormDefinitionRepresentationReq className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
   **/
  @ApiModelProperty(value = "")
  
    public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public FormDefinitionRepresentationReq customFeildsValueInfo(Map<String, FieldValueInfo> customFeildsValueInfo) {
    this.customFeildsValueInfo = customFeildsValueInfo;
    return this;
  }

  public FormDefinitionRepresentationReq putCustomFeildsValueInfoItem(String key, FieldValueInfo customFeildsValueInfoItem) {
    if (this.customFeildsValueInfo == null) {
      this.customFeildsValueInfo = new HashMap<>();
    }
    this.customFeildsValueInfo.put(key, customFeildsValueInfoItem);
    return this;
  }

  /**
   * Get customFeildsValueInfo
   * @return customFeildsValueInfo
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, FieldValueInfo> getCustomFeildsValueInfo() {
    return customFeildsValueInfo;
  }

  public void setCustomFeildsValueInfo(Map<String, FieldValueInfo> customFeildsValueInfo) {
    this.customFeildsValueInfo = customFeildsValueInfo;
  }

  public FormDefinitionRepresentationReq customFieldTemplates(Map<String, String> customFieldTemplates) {
    this.customFieldTemplates = customFieldTemplates;
    return this;
  }

  public FormDefinitionRepresentationReq putCustomFieldTemplatesItem(String key, String customFieldTemplatesItem) {
    if (this.customFieldTemplates == null) {
      this.customFieldTemplates = new HashMap<>();
    }
    this.customFieldTemplates.put(key, customFieldTemplatesItem);
    return this;
  }

  /**
   * Get customFieldTemplates
   * @return customFieldTemplates
   **/
  @ApiModelProperty(value = "")
  
    public Map<String, String> getCustomFieldTemplates() {
    return customFieldTemplates;
  }

  public void setCustomFieldTemplates(Map<String, String> customFieldTemplates) {
    this.customFieldTemplates = customFieldTemplates;
  }

  public FormDefinitionRepresentationReq customFieldsValueInfo(Map<String, FieldValueInfo> customFieldsValueInfo) {
    this.customFieldsValueInfo = customFieldsValueInfo;
    return this;
  }

  public FormDefinitionRepresentationReq putCustomFieldsValueInfoItem(String key, FieldValueInfo customFieldsValueInfoItem) {
    if (this.customFieldsValueInfo == null) {
      this.customFieldsValueInfo = new HashMap<>();
    }
    this.customFieldsValueInfo.put(key, customFieldsValueInfoItem);
    return this;
  }

  /**
   * Get customFieldsValueInfo
   * @return customFieldsValueInfo
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, FieldValueInfo> getCustomFieldsValueInfo() {
    return customFieldsValueInfo;
  }

  public void setCustomFieldsValueInfo(Map<String, FieldValueInfo> customFieldsValueInfo) {
    this.customFieldsValueInfo = customFieldsValueInfo;
  }

  public FormDefinitionRepresentationReq fields(List<FormFieldRepresentation> fields) {
    this.fields = fields;
    return this;
  }

  public FormDefinitionRepresentationReq addFieldsItem(FormFieldRepresentation fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<FormFieldRepresentation> getFields() {
    return fields;
  }

  public void setFields(List<FormFieldRepresentation> fields) {
    this.fields = fields;
  }

  public FormDefinitionRepresentationReq globalDateFormat(String globalDateFormat) {
    this.globalDateFormat = globalDateFormat;
    return this;
  }

  /**
   * Get globalDateFormat
   * @return globalDateFormat
   **/
  @ApiModelProperty(value = "")
  
    public String getGlobalDateFormat() {
    return globalDateFormat;
  }

  public void setGlobalDateFormat(String globalDateFormat) {
    this.globalDateFormat = globalDateFormat;
  }

  public FormDefinitionRepresentationReq gridsterForm(Boolean gridsterForm) {
    this.gridsterForm = gridsterForm;
    return this;
  }

  /**
   * Get gridsterForm
   * @return gridsterForm
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isGridsterForm() {
    return gridsterForm;
  }

  public void setGridsterForm(Boolean gridsterForm) {
    this.gridsterForm = gridsterForm;
  }

  public FormDefinitionRepresentationReq id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @ApiModelProperty(value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FormDefinitionRepresentationReq javascriptEvents(List<FormJavascriptEventRepresentation> javascriptEvents) {
    this.javascriptEvents = javascriptEvents;
    return this;
  }

  public FormDefinitionRepresentationReq addJavascriptEventsItem(FormJavascriptEventRepresentation javascriptEventsItem) {
    if (this.javascriptEvents == null) {
      this.javascriptEvents = new ArrayList<>();
    }
    this.javascriptEvents.add(javascriptEventsItem);
    return this;
  }

  /**
   * Get javascriptEvents
   * @return javascriptEvents
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<FormJavascriptEventRepresentation> getJavascriptEvents() {
    return javascriptEvents;
  }

  public void setJavascriptEvents(List<FormJavascriptEventRepresentation> javascriptEvents) {
    this.javascriptEvents = javascriptEvents;
  }

  public FormDefinitionRepresentationReq metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public FormDefinitionRepresentationReq putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @ApiModelProperty(value = "")
  
    public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public FormDefinitionRepresentationReq name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormDefinitionRepresentationReq outcomeTarget(String outcomeTarget) {
    this.outcomeTarget = outcomeTarget;
    return this;
  }

  /**
   * Get outcomeTarget
   * @return outcomeTarget
   **/
  @ApiModelProperty(value = "")
  
    public String getOutcomeTarget() {
    return outcomeTarget;
  }

  public void setOutcomeTarget(String outcomeTarget) {
    this.outcomeTarget = outcomeTarget;
  }

  public FormDefinitionRepresentationReq outcomes(List<FormOutcomeRepresentation> outcomes) {
    this.outcomes = outcomes;
    return this;
  }

  public FormDefinitionRepresentationReq addOutcomesItem(FormOutcomeRepresentation outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

  /**
   * Get outcomes
   * @return outcomes
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<FormOutcomeRepresentation> getOutcomes() {
    return outcomes;
  }

  public void setOutcomes(List<FormOutcomeRepresentation> outcomes) {
    this.outcomes = outcomes;
  }

  public FormDefinitionRepresentationReq processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Get processDefinitionId
   * @return processDefinitionId
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public FormDefinitionRepresentationReq processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Get processDefinitionKey
   * @return processDefinitionKey
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public FormDefinitionRepresentationReq processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

  /**
   * Get processDefinitionName
   * @return processDefinitionName
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public FormDefinitionRepresentationReq selectedOutcome(String selectedOutcome) {
    this.selectedOutcome = selectedOutcome;
    return this;
  }

  /**
   * Get selectedOutcome
   * @return selectedOutcome
   **/
  @ApiModelProperty(value = "")
  
    public String getSelectedOutcome() {
    return selectedOutcome;
  }

  public void setSelectedOutcome(String selectedOutcome) {
    this.selectedOutcome = selectedOutcome;
  }

  public FormDefinitionRepresentationReq style(String style) {
    this.style = style;
    return this;
  }

  /**
   * Get style
   * @return style
   **/
  @ApiModelProperty(value = "")
  
    public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public FormDefinitionRepresentationReq tabs(List<FormTabRepresentation> tabs) {
    this.tabs = tabs;
    return this;
  }

  public FormDefinitionRepresentationReq addTabsItem(FormTabRepresentation tabsItem) {
    if (this.tabs == null) {
      this.tabs = new ArrayList<>();
    }
    this.tabs.add(tabsItem);
    return this;
  }

  /**
   * Get tabs
   * @return tabs
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<FormTabRepresentation> getTabs() {
    return tabs;
  }

  public void setTabs(List<FormTabRepresentation> tabs) {
    this.tabs = tabs;
  }

  public FormDefinitionRepresentationReq taskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
    return this;
  }

  /**
   * Get taskDefinitionKey
   * @return taskDefinitionKey
   **/
  @ApiModelProperty(value = "")
  
    public String getTaskDefinitionKey() {
    return taskDefinitionKey;
  }

  public void setTaskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
  }

  public FormDefinitionRepresentationReq taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   **/
  @ApiModelProperty(value = "")
  
    public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public FormDefinitionRepresentationReq taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * Get taskName
   * @return taskName
   **/
  @ApiModelProperty(value = "")
  
    public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public FormDefinitionRepresentationReq variables(List<FormVariableRepresentation> variables) {
    this.variables = variables;
    return this;
  }

  public FormDefinitionRepresentationReq addVariablesItem(FormVariableRepresentation variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<FormVariableRepresentation> getVariables() {
    return variables;
  }

  public void setVariables(List<FormVariableRepresentation> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDefinitionRepresentationReq formDefinitionRepresentationReq = (FormDefinitionRepresentationReq) o;
    return Objects.equals(this.className, formDefinitionRepresentationReq.className) &&
        Objects.equals(this.customFeildsValueInfo, formDefinitionRepresentationReq.customFeildsValueInfo) &&
        Objects.equals(this.customFieldTemplates, formDefinitionRepresentationReq.customFieldTemplates) &&
        Objects.equals(this.customFieldsValueInfo, formDefinitionRepresentationReq.customFieldsValueInfo) &&
        Objects.equals(this.fields, formDefinitionRepresentationReq.fields) &&
        Objects.equals(this.globalDateFormat, formDefinitionRepresentationReq.globalDateFormat) &&
        Objects.equals(this.gridsterForm, formDefinitionRepresentationReq.gridsterForm) &&
        Objects.equals(this.id, formDefinitionRepresentationReq.id) &&
        Objects.equals(this.javascriptEvents, formDefinitionRepresentationReq.javascriptEvents) &&
        Objects.equals(this.metadata, formDefinitionRepresentationReq.metadata) &&
        Objects.equals(this.name, formDefinitionRepresentationReq.name) &&
        Objects.equals(this.outcomeTarget, formDefinitionRepresentationReq.outcomeTarget) &&
        Objects.equals(this.outcomes, formDefinitionRepresentationReq.outcomes) &&
        Objects.equals(this.processDefinitionId, formDefinitionRepresentationReq.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, formDefinitionRepresentationReq.processDefinitionKey) &&
        Objects.equals(this.processDefinitionName, formDefinitionRepresentationReq.processDefinitionName) &&
        Objects.equals(this.selectedOutcome, formDefinitionRepresentationReq.selectedOutcome) &&
        Objects.equals(this.style, formDefinitionRepresentationReq.style) &&
        Objects.equals(this.tabs, formDefinitionRepresentationReq.tabs) &&
        Objects.equals(this.taskDefinitionKey, formDefinitionRepresentationReq.taskDefinitionKey) &&
        Objects.equals(this.taskId, formDefinitionRepresentationReq.taskId) &&
        Objects.equals(this.taskName, formDefinitionRepresentationReq.taskName) &&
        Objects.equals(this.variables, formDefinitionRepresentationReq.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, customFeildsValueInfo, customFieldTemplates, customFieldsValueInfo, fields, globalDateFormat, gridsterForm, id, javascriptEvents, metadata, name, outcomeTarget, outcomes, processDefinitionId, processDefinitionKey, processDefinitionName, selectedOutcome, style, tabs, taskDefinitionKey, taskId, taskName, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDefinitionRepresentationReq {\n");
    
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    customFeildsValueInfo: ").append(toIndentedString(customFeildsValueInfo)).append("\n");
    sb.append("    customFieldTemplates: ").append(toIndentedString(customFieldTemplates)).append("\n");
    sb.append("    customFieldsValueInfo: ").append(toIndentedString(customFieldsValueInfo)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    globalDateFormat: ").append(toIndentedString(globalDateFormat)).append("\n");
    sb.append("    gridsterForm: ").append(toIndentedString(gridsterForm)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    javascriptEvents: ").append(toIndentedString(javascriptEvents)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outcomeTarget: ").append(toIndentedString(outcomeTarget)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    selectedOutcome: ").append(toIndentedString(selectedOutcome)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
