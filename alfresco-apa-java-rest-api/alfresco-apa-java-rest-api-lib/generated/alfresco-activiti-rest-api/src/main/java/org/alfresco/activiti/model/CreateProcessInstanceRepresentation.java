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
import java.util.List;
import org.alfresco.activiti.model.RestVariable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateProcessInstanceRepresentation
 */
@Validated


public class CreateProcessInstanceRepresentation   {
  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("outcome")
  private String outcome = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("values")
  private Object values = null;

  @JsonProperty("variables")
  @Valid
  private List<RestVariable> variables = null;

  public CreateProcessInstanceRepresentation businessKey(String businessKey) {
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

  public CreateProcessInstanceRepresentation name(String name) {
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

  public CreateProcessInstanceRepresentation outcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * Get outcome
   * @return outcome
   **/
  @ApiModelProperty(value = "")
  
    public String getOutcome() {
    return outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }

  public CreateProcessInstanceRepresentation processDefinitionId(String processDefinitionId) {
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

  public CreateProcessInstanceRepresentation processDefinitionKey(String processDefinitionKey) {
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

  public CreateProcessInstanceRepresentation values(Object values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @ApiModelProperty(value = "")
  
    public Object getValues() {
    return values;
  }

  public void setValues(Object values) {
    this.values = values;
  }

  public CreateProcessInstanceRepresentation variables(List<RestVariable> variables) {
    this.variables = variables;
    return this;
  }

  public CreateProcessInstanceRepresentation addVariablesItem(RestVariable variablesItem) {
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
    CreateProcessInstanceRepresentation createProcessInstanceRepresentation = (CreateProcessInstanceRepresentation) o;
    return Objects.equals(this.businessKey, createProcessInstanceRepresentation.businessKey) &&
        Objects.equals(this.name, createProcessInstanceRepresentation.name) &&
        Objects.equals(this.outcome, createProcessInstanceRepresentation.outcome) &&
        Objects.equals(this.processDefinitionId, createProcessInstanceRepresentation.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, createProcessInstanceRepresentation.processDefinitionKey) &&
        Objects.equals(this.values, createProcessInstanceRepresentation.values) &&
        Objects.equals(this.variables, createProcessInstanceRepresentation.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessKey, name, outcome, processDefinitionId, processDefinitionKey, values, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProcessInstanceRepresentation {\n");
    
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
