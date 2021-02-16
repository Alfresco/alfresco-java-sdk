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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VariableMappingRepresentation
 */
@Validated

public class VariableMappingRepresentation   {
  @JsonProperty("inProcessVariable")
  private String inProcessVariable = null;

  @JsonProperty("inVariableType")
  private String inVariableType = null;

  @JsonProperty("mappedVariable")
  private String mappedVariable = null;

  @JsonProperty("outProcessVariable")
  private String outProcessVariable = null;

  @JsonProperty("outVariableType")
  private String outVariableType = null;

  @JsonProperty("typeOfMapping")
  private String typeOfMapping = null;

  public VariableMappingRepresentation inProcessVariable(String inProcessVariable) {
    this.inProcessVariable = inProcessVariable;
    return this;
  }

  /**
   * Get inProcessVariable
   * @return inProcessVariable
  **/
  @ApiModelProperty(value = "")


  public String getInProcessVariable() {
    return inProcessVariable;
  }

  public void setInProcessVariable(String inProcessVariable) {
    this.inProcessVariable = inProcessVariable;
  }

  public VariableMappingRepresentation inVariableType(String inVariableType) {
    this.inVariableType = inVariableType;
    return this;
  }

  /**
   * Get inVariableType
   * @return inVariableType
  **/
  @ApiModelProperty(value = "")


  public String getInVariableType() {
    return inVariableType;
  }

  public void setInVariableType(String inVariableType) {
    this.inVariableType = inVariableType;
  }

  public VariableMappingRepresentation mappedVariable(String mappedVariable) {
    this.mappedVariable = mappedVariable;
    return this;
  }

  /**
   * Get mappedVariable
   * @return mappedVariable
  **/
  @ApiModelProperty(value = "")


  public String getMappedVariable() {
    return mappedVariable;
  }

  public void setMappedVariable(String mappedVariable) {
    this.mappedVariable = mappedVariable;
  }

  public VariableMappingRepresentation outProcessVariable(String outProcessVariable) {
    this.outProcessVariable = outProcessVariable;
    return this;
  }

  /**
   * Get outProcessVariable
   * @return outProcessVariable
  **/
  @ApiModelProperty(value = "")


  public String getOutProcessVariable() {
    return outProcessVariable;
  }

  public void setOutProcessVariable(String outProcessVariable) {
    this.outProcessVariable = outProcessVariable;
  }

  public VariableMappingRepresentation outVariableType(String outVariableType) {
    this.outVariableType = outVariableType;
    return this;
  }

  /**
   * Get outVariableType
   * @return outVariableType
  **/
  @ApiModelProperty(value = "")


  public String getOutVariableType() {
    return outVariableType;
  }

  public void setOutVariableType(String outVariableType) {
    this.outVariableType = outVariableType;
  }

  public VariableMappingRepresentation typeOfMapping(String typeOfMapping) {
    this.typeOfMapping = typeOfMapping;
    return this;
  }

  /**
   * Get typeOfMapping
   * @return typeOfMapping
  **/
  @ApiModelProperty(value = "")


  public String getTypeOfMapping() {
    return typeOfMapping;
  }

  public void setTypeOfMapping(String typeOfMapping) {
    this.typeOfMapping = typeOfMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableMappingRepresentation variableMappingRepresentation = (VariableMappingRepresentation) o;
    return Objects.equals(this.inProcessVariable, variableMappingRepresentation.inProcessVariable) &&
        Objects.equals(this.inVariableType, variableMappingRepresentation.inVariableType) &&
        Objects.equals(this.mappedVariable, variableMappingRepresentation.mappedVariable) &&
        Objects.equals(this.outProcessVariable, variableMappingRepresentation.outProcessVariable) &&
        Objects.equals(this.outVariableType, variableMappingRepresentation.outVariableType) &&
        Objects.equals(this.typeOfMapping, variableMappingRepresentation.typeOfMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inProcessVariable, inVariableType, mappedVariable, outProcessVariable, outVariableType, typeOfMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableMappingRepresentation {\n");
    
    sb.append("    inProcessVariable: ").append(toIndentedString(inProcessVariable)).append("\n");
    sb.append("    inVariableType: ").append(toIndentedString(inVariableType)).append("\n");
    sb.append("    mappedVariable: ").append(toIndentedString(mappedVariable)).append("\n");
    sb.append("    outProcessVariable: ").append(toIndentedString(outProcessVariable)).append("\n");
    sb.append("    outVariableType: ").append(toIndentedString(outVariableType)).append("\n");
    sb.append("    typeOfMapping: ").append(toIndentedString(typeOfMapping)).append("\n");
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

