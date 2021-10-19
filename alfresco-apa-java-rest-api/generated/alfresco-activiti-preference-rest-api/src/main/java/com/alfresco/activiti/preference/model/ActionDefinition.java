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
package com.alfresco.activiti.preference.model;

import java.util.Objects;
import com.alfresco.activiti.preference.model.VariableDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActionDefinition
 */
@Validated

public class ActionDefinition   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("inputs")
  @Valid
  private List<VariableDefinition> inputs = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("outputs")
  @Valid
  private List<VariableDefinition> outputs = null;

  public ActionDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ActionDefinition id(String id) {
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

  public ActionDefinition inputs(List<VariableDefinition> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ActionDefinition addInputsItem(VariableDefinition inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<VariableDefinition> getInputs() {
    return inputs;
  }

  public void setInputs(List<VariableDefinition> inputs) {
    this.inputs = inputs;
  }

  public ActionDefinition name(String name) {
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

  public ActionDefinition outputs(List<VariableDefinition> outputs) {
    this.outputs = outputs;
    return this;
  }

  public ActionDefinition addOutputsItem(VariableDefinition outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<VariableDefinition> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<VariableDefinition> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionDefinition actionDefinition = (ActionDefinition) o;
    return Objects.equals(this.description, actionDefinition.description) &&
        Objects.equals(this.id, actionDefinition.id) &&
        Objects.equals(this.inputs, actionDefinition.inputs) &&
        Objects.equals(this.name, actionDefinition.name) &&
        Objects.equals(this.outputs, actionDefinition.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, inputs, name, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionDefinition {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

