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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VariableScopeRepresentation
 */
@Validated


public class VariableScopeRepresentation   {
  @JsonProperty("mapVariable")
  private String mapVariable = null;

  @JsonProperty("mappedColumn")
  private String mappedColumn = null;

  @JsonProperty("mappedDataModel")
  private Long mappedDataModel = null;

  @JsonProperty("mappedEntity")
  private String mappedEntity = null;

  @JsonProperty("mappedVariableName")
  private String mappedVariableName = null;

  @JsonProperty("processVariableName")
  private String processVariableName = null;

  @JsonProperty("processVariableType")
  private String processVariableType = null;

  public VariableScopeRepresentation mapVariable(String mapVariable) {
    this.mapVariable = mapVariable;
    return this;
  }

  /**
   * Get mapVariable
   * @return mapVariable
   **/
  @ApiModelProperty(value = "")
  
    public String getMapVariable() {
    return mapVariable;
  }

  public void setMapVariable(String mapVariable) {
    this.mapVariable = mapVariable;
  }

  public VariableScopeRepresentation mappedColumn(String mappedColumn) {
    this.mappedColumn = mappedColumn;
    return this;
  }

  /**
   * Get mappedColumn
   * @return mappedColumn
   **/
  @ApiModelProperty(value = "")
  
    public String getMappedColumn() {
    return mappedColumn;
  }

  public void setMappedColumn(String mappedColumn) {
    this.mappedColumn = mappedColumn;
  }

  public VariableScopeRepresentation mappedDataModel(Long mappedDataModel) {
    this.mappedDataModel = mappedDataModel;
    return this;
  }

  /**
   * Get mappedDataModel
   * @return mappedDataModel
   **/
  @ApiModelProperty(value = "")
  
    public Long getMappedDataModel() {
    return mappedDataModel;
  }

  public void setMappedDataModel(Long mappedDataModel) {
    this.mappedDataModel = mappedDataModel;
  }

  public VariableScopeRepresentation mappedEntity(String mappedEntity) {
    this.mappedEntity = mappedEntity;
    return this;
  }

  /**
   * Get mappedEntity
   * @return mappedEntity
   **/
  @ApiModelProperty(value = "")
  
    public String getMappedEntity() {
    return mappedEntity;
  }

  public void setMappedEntity(String mappedEntity) {
    this.mappedEntity = mappedEntity;
  }

  public VariableScopeRepresentation mappedVariableName(String mappedVariableName) {
    this.mappedVariableName = mappedVariableName;
    return this;
  }

  /**
   * Get mappedVariableName
   * @return mappedVariableName
   **/
  @ApiModelProperty(value = "")
  
    public String getMappedVariableName() {
    return mappedVariableName;
  }

  public void setMappedVariableName(String mappedVariableName) {
    this.mappedVariableName = mappedVariableName;
  }

  public VariableScopeRepresentation processVariableName(String processVariableName) {
    this.processVariableName = processVariableName;
    return this;
  }

  /**
   * Get processVariableName
   * @return processVariableName
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessVariableName() {
    return processVariableName;
  }

  public void setProcessVariableName(String processVariableName) {
    this.processVariableName = processVariableName;
  }

  public VariableScopeRepresentation processVariableType(String processVariableType) {
    this.processVariableType = processVariableType;
    return this;
  }

  /**
   * Get processVariableType
   * @return processVariableType
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessVariableType() {
    return processVariableType;
  }

  public void setProcessVariableType(String processVariableType) {
    this.processVariableType = processVariableType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableScopeRepresentation variableScopeRepresentation = (VariableScopeRepresentation) o;
    return Objects.equals(this.mapVariable, variableScopeRepresentation.mapVariable) &&
        Objects.equals(this.mappedColumn, variableScopeRepresentation.mappedColumn) &&
        Objects.equals(this.mappedDataModel, variableScopeRepresentation.mappedDataModel) &&
        Objects.equals(this.mappedEntity, variableScopeRepresentation.mappedEntity) &&
        Objects.equals(this.mappedVariableName, variableScopeRepresentation.mappedVariableName) &&
        Objects.equals(this.processVariableName, variableScopeRepresentation.processVariableName) &&
        Objects.equals(this.processVariableType, variableScopeRepresentation.processVariableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapVariable, mappedColumn, mappedDataModel, mappedEntity, mappedVariableName, processVariableName, processVariableType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableScopeRepresentation {\n");
    
    sb.append("    mapVariable: ").append(toIndentedString(mapVariable)).append("\n");
    sb.append("    mappedColumn: ").append(toIndentedString(mappedColumn)).append("\n");
    sb.append("    mappedDataModel: ").append(toIndentedString(mappedDataModel)).append("\n");
    sb.append("    mappedEntity: ").append(toIndentedString(mappedEntity)).append("\n");
    sb.append("    mappedVariableName: ").append(toIndentedString(mappedVariableName)).append("\n");
    sb.append("    processVariableName: ").append(toIndentedString(processVariableName)).append("\n");
    sb.append("    processVariableType: ").append(toIndentedString(processVariableType)).append("\n");
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
