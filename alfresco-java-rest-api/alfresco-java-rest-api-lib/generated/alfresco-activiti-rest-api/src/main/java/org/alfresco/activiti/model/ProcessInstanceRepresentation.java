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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.LightUserRepresentation;
import org.alfresco.activiti.model.RestVariable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessInstanceRepresentation
 */
@Validated

public class ProcessInstanceRepresentation   {
  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("ended")
  private OffsetDateTime ended = null;

  @JsonProperty("graphicalNotationDefined")
  private Boolean graphicalNotationDefined = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("processDefinitionCategory")
  private String processDefinitionCategory = null;

  @JsonProperty("processDefinitionDeploymentId")
  private String processDefinitionDeploymentId = null;

  @JsonProperty("processDefinitionDescription")
  private String processDefinitionDescription = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionName")
  private String processDefinitionName = null;

  @JsonProperty("processDefinitionVersion")
  private Integer processDefinitionVersion = null;

  @JsonProperty("startFormDefined")
  private Boolean startFormDefined = null;

  @JsonProperty("started")
  private OffsetDateTime started = null;

  @JsonProperty("startedBy")
  private LightUserRepresentation startedBy = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("variables")
  @Valid
  private List<RestVariable> variables = null;

  public ProcessInstanceRepresentation businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * Get businessKey
   * @return businessKey
  **/
  @ApiModelProperty(value = "")


  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public ProcessInstanceRepresentation ended(OffsetDateTime ended) {
    this.ended = ended;
    return this;
  }

  /**
   * Get ended
   * @return ended
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEnded() {
    return ended;
  }

  public void setEnded(OffsetDateTime ended) {
    this.ended = ended;
  }

  public ProcessInstanceRepresentation graphicalNotationDefined(Boolean graphicalNotationDefined) {
    this.graphicalNotationDefined = graphicalNotationDefined;
    return this;
  }

  /**
   * Get graphicalNotationDefined
   * @return graphicalNotationDefined
  **/
  @ApiModelProperty(value = "")


  public Boolean isGraphicalNotationDefined() {
    return graphicalNotationDefined;
  }

  public void setGraphicalNotationDefined(Boolean graphicalNotationDefined) {
    this.graphicalNotationDefined = graphicalNotationDefined;
  }

  public ProcessInstanceRepresentation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessInstanceRepresentation name(String name) {
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

  public ProcessInstanceRepresentation processDefinitionCategory(String processDefinitionCategory) {
    this.processDefinitionCategory = processDefinitionCategory;
    return this;
  }

  /**
   * Get processDefinitionCategory
   * @return processDefinitionCategory
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionCategory() {
    return processDefinitionCategory;
  }

  public void setProcessDefinitionCategory(String processDefinitionCategory) {
    this.processDefinitionCategory = processDefinitionCategory;
  }

  public ProcessInstanceRepresentation processDefinitionDeploymentId(String processDefinitionDeploymentId) {
    this.processDefinitionDeploymentId = processDefinitionDeploymentId;
    return this;
  }

  /**
   * Get processDefinitionDeploymentId
   * @return processDefinitionDeploymentId
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionDeploymentId() {
    return processDefinitionDeploymentId;
  }

  public void setProcessDefinitionDeploymentId(String processDefinitionDeploymentId) {
    this.processDefinitionDeploymentId = processDefinitionDeploymentId;
  }

  public ProcessInstanceRepresentation processDefinitionDescription(String processDefinitionDescription) {
    this.processDefinitionDescription = processDefinitionDescription;
    return this;
  }

  /**
   * Get processDefinitionDescription
   * @return processDefinitionDescription
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionDescription() {
    return processDefinitionDescription;
  }

  public void setProcessDefinitionDescription(String processDefinitionDescription) {
    this.processDefinitionDescription = processDefinitionDescription;
  }

  public ProcessInstanceRepresentation processDefinitionId(String processDefinitionId) {
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

  public ProcessInstanceRepresentation processDefinitionKey(String processDefinitionKey) {
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

  public ProcessInstanceRepresentation processDefinitionName(String processDefinitionName) {
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

  public ProcessInstanceRepresentation processDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
    return this;
  }

  /**
   * Get processDefinitionVersion
   * @return processDefinitionVersion
  **/
  @ApiModelProperty(value = "")


  public Integer getProcessDefinitionVersion() {
    return processDefinitionVersion;
  }

  public void setProcessDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
  }

  public ProcessInstanceRepresentation startFormDefined(Boolean startFormDefined) {
    this.startFormDefined = startFormDefined;
    return this;
  }

  /**
   * Get startFormDefined
   * @return startFormDefined
  **/
  @ApiModelProperty(value = "")


  public Boolean isStartFormDefined() {
    return startFormDefined;
  }

  public void setStartFormDefined(Boolean startFormDefined) {
    this.startFormDefined = startFormDefined;
  }

  public ProcessInstanceRepresentation started(OffsetDateTime started) {
    this.started = started;
    return this;
  }

  /**
   * Get started
   * @return started
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) {
    this.started = started;
  }

  public ProcessInstanceRepresentation startedBy(LightUserRepresentation startedBy) {
    this.startedBy = startedBy;
    return this;
  }

  /**
   * Get startedBy
   * @return startedBy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LightUserRepresentation getStartedBy() {
    return startedBy;
  }

  public void setStartedBy(LightUserRepresentation startedBy) {
    this.startedBy = startedBy;
  }

  public ProcessInstanceRepresentation suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Get suspended
   * @return suspended
  **/
  @ApiModelProperty(value = "")


  public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ProcessInstanceRepresentation tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")


  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ProcessInstanceRepresentation variables(List<RestVariable> variables) {
    this.variables = variables;
    return this;
  }

  public ProcessInstanceRepresentation addVariablesItem(RestVariable variablesItem) {
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

  public List<RestVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<RestVariable> variables) {
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
    ProcessInstanceRepresentation processInstanceRepresentation = (ProcessInstanceRepresentation) o;
    return Objects.equals(this.businessKey, processInstanceRepresentation.businessKey) &&
        Objects.equals(this.ended, processInstanceRepresentation.ended) &&
        Objects.equals(this.graphicalNotationDefined, processInstanceRepresentation.graphicalNotationDefined) &&
        Objects.equals(this.id, processInstanceRepresentation.id) &&
        Objects.equals(this.name, processInstanceRepresentation.name) &&
        Objects.equals(this.processDefinitionCategory, processInstanceRepresentation.processDefinitionCategory) &&
        Objects.equals(this.processDefinitionDeploymentId, processInstanceRepresentation.processDefinitionDeploymentId) &&
        Objects.equals(this.processDefinitionDescription, processInstanceRepresentation.processDefinitionDescription) &&
        Objects.equals(this.processDefinitionId, processInstanceRepresentation.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, processInstanceRepresentation.processDefinitionKey) &&
        Objects.equals(this.processDefinitionName, processInstanceRepresentation.processDefinitionName) &&
        Objects.equals(this.processDefinitionVersion, processInstanceRepresentation.processDefinitionVersion) &&
        Objects.equals(this.startFormDefined, processInstanceRepresentation.startFormDefined) &&
        Objects.equals(this.started, processInstanceRepresentation.started) &&
        Objects.equals(this.startedBy, processInstanceRepresentation.startedBy) &&
        Objects.equals(this.suspended, processInstanceRepresentation.suspended) &&
        Objects.equals(this.tenantId, processInstanceRepresentation.tenantId) &&
        Objects.equals(this.variables, processInstanceRepresentation.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessKey, ended, graphicalNotationDefined, id, name, processDefinitionCategory, processDefinitionDeploymentId, processDefinitionDescription, processDefinitionId, processDefinitionKey, processDefinitionName, processDefinitionVersion, startFormDefined, started, startedBy, suspended, tenantId, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceRepresentation {\n");
    
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    graphicalNotationDefined: ").append(toIndentedString(graphicalNotationDefined)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processDefinitionCategory: ").append(toIndentedString(processDefinitionCategory)).append("\n");
    sb.append("    processDefinitionDeploymentId: ").append(toIndentedString(processDefinitionDeploymentId)).append("\n");
    sb.append("    processDefinitionDescription: ").append(toIndentedString(processDefinitionDescription)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    startFormDefined: ").append(toIndentedString(startFormDefined)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    startedBy: ").append(toIndentedString(startedBy)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

