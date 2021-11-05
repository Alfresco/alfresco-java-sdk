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
import org.alfresco.activiti.model.FieldValueInfo;
import org.alfresco.activiti.model.FormFieldRepresentation;
import org.alfresco.activiti.model.FormJavascriptEventRepresentation;
import org.alfresco.activiti.model.FormOutcomeRepresentation;
import org.alfresco.activiti.model.FormTabRepresentation;
import org.alfresco.activiti.model.FormVariableRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormDefinitionRepresentation
 */
@Validated


public class FormDefinitionRepresentation   {
  @JsonProperty("className")
  private String className = null;

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

  public FormDefinitionRepresentation className(String className) {
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

  public FormDefinitionRepresentation customFieldTemplates(Map<String, String> customFieldTemplates) {
    this.customFieldTemplates = customFieldTemplates;
    return this;
  }

  public FormDefinitionRepresentation putCustomFieldTemplatesItem(String key, String customFieldTemplatesItem) {
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

  public FormDefinitionRepresentation customFieldsValueInfo(Map<String, FieldValueInfo> customFieldsValueInfo) {
    this.customFieldsValueInfo = customFieldsValueInfo;
    return this;
  }

  public FormDefinitionRepresentation putCustomFieldsValueInfoItem(String key, FieldValueInfo customFieldsValueInfoItem) {
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

  public FormDefinitionRepresentation fields(List<FormFieldRepresentation> fields) {
    this.fields = fields;
    return this;
  }

  public FormDefinitionRepresentation addFieldsItem(FormFieldRepresentation fieldsItem) {
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

  public FormDefinitionRepresentation globalDateFormat(String globalDateFormat) {
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

  public FormDefinitionRepresentation gridsterForm(Boolean gridsterForm) {
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

  public FormDefinitionRepresentation id(Long id) {
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

  public FormDefinitionRepresentation javascriptEvents(List<FormJavascriptEventRepresentation> javascriptEvents) {
    this.javascriptEvents = javascriptEvents;
    return this;
  }

  public FormDefinitionRepresentation addJavascriptEventsItem(FormJavascriptEventRepresentation javascriptEventsItem) {
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

  public FormDefinitionRepresentation metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public FormDefinitionRepresentation putMetadataItem(String key, String metadataItem) {
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

  public FormDefinitionRepresentation name(String name) {
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

  public FormDefinitionRepresentation outcomeTarget(String outcomeTarget) {
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

  public FormDefinitionRepresentation outcomes(List<FormOutcomeRepresentation> outcomes) {
    this.outcomes = outcomes;
    return this;
  }

  public FormDefinitionRepresentation addOutcomesItem(FormOutcomeRepresentation outcomesItem) {
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

  public FormDefinitionRepresentation processDefinitionId(String processDefinitionId) {
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

  public FormDefinitionRepresentation processDefinitionKey(String processDefinitionKey) {
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

  public FormDefinitionRepresentation processDefinitionName(String processDefinitionName) {
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

  public FormDefinitionRepresentation selectedOutcome(String selectedOutcome) {
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

  public FormDefinitionRepresentation style(String style) {
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

  public FormDefinitionRepresentation tabs(List<FormTabRepresentation> tabs) {
    this.tabs = tabs;
    return this;
  }

  public FormDefinitionRepresentation addTabsItem(FormTabRepresentation tabsItem) {
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

  public FormDefinitionRepresentation taskDefinitionKey(String taskDefinitionKey) {
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

  public FormDefinitionRepresentation taskId(String taskId) {
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

  public FormDefinitionRepresentation taskName(String taskName) {
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

  public FormDefinitionRepresentation variables(List<FormVariableRepresentation> variables) {
    this.variables = variables;
    return this;
  }

  public FormDefinitionRepresentation addVariablesItem(FormVariableRepresentation variablesItem) {
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
    FormDefinitionRepresentation formDefinitionRepresentation = (FormDefinitionRepresentation) o;
    return Objects.equals(this.className, formDefinitionRepresentation.className) &&
        Objects.equals(this.customFieldTemplates, formDefinitionRepresentation.customFieldTemplates) &&
        Objects.equals(this.customFieldsValueInfo, formDefinitionRepresentation.customFieldsValueInfo) &&
        Objects.equals(this.fields, formDefinitionRepresentation.fields) &&
        Objects.equals(this.globalDateFormat, formDefinitionRepresentation.globalDateFormat) &&
        Objects.equals(this.gridsterForm, formDefinitionRepresentation.gridsterForm) &&
        Objects.equals(this.id, formDefinitionRepresentation.id) &&
        Objects.equals(this.javascriptEvents, formDefinitionRepresentation.javascriptEvents) &&
        Objects.equals(this.metadata, formDefinitionRepresentation.metadata) &&
        Objects.equals(this.name, formDefinitionRepresentation.name) &&
        Objects.equals(this.outcomeTarget, formDefinitionRepresentation.outcomeTarget) &&
        Objects.equals(this.outcomes, formDefinitionRepresentation.outcomes) &&
        Objects.equals(this.processDefinitionId, formDefinitionRepresentation.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, formDefinitionRepresentation.processDefinitionKey) &&
        Objects.equals(this.processDefinitionName, formDefinitionRepresentation.processDefinitionName) &&
        Objects.equals(this.selectedOutcome, formDefinitionRepresentation.selectedOutcome) &&
        Objects.equals(this.style, formDefinitionRepresentation.style) &&
        Objects.equals(this.tabs, formDefinitionRepresentation.tabs) &&
        Objects.equals(this.taskDefinitionKey, formDefinitionRepresentation.taskDefinitionKey) &&
        Objects.equals(this.taskId, formDefinitionRepresentation.taskId) &&
        Objects.equals(this.taskName, formDefinitionRepresentation.taskName) &&
        Objects.equals(this.variables, formDefinitionRepresentation.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, customFieldTemplates, customFieldsValueInfo, fields, globalDateFormat, gridsterForm, id, javascriptEvents, metadata, name, outcomeTarget, outcomes, processDefinitionId, processDefinitionKey, processDefinitionName, selectedOutcome, style, tabs, taskDefinitionKey, taskId, taskName, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDefinitionRepresentation {\n");
    
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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
