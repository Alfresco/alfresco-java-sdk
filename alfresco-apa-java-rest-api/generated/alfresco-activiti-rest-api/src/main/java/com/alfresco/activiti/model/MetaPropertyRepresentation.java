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
import com.alfresco.activiti.model.FormFieldRepresentation;
import com.alfresco.activiti.model.NamedObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MetaPropertyRepresentation
 */
@Validated


public class MetaPropertyRepresentation   {
  @JsonProperty("fileProperty")
  private String fileProperty = null;

  @JsonProperty("formField")
  private FormFieldRepresentation formField = null;

  @JsonProperty("processVariable")
  private NamedObject processVariable = null;

  @JsonProperty("propertyType")
  private String propertyType = null;

  @JsonProperty("propertyValueType")
  private String propertyValueType = null;

  public MetaPropertyRepresentation fileProperty(String fileProperty) {
    this.fileProperty = fileProperty;
    return this;
  }

  /**
   * Get fileProperty
   * @return fileProperty
   **/
  @ApiModelProperty(value = "")
  
    public String getFileProperty() {
    return fileProperty;
  }

  public void setFileProperty(String fileProperty) {
    this.fileProperty = fileProperty;
  }

  public MetaPropertyRepresentation formField(FormFieldRepresentation formField) {
    this.formField = formField;
    return this;
  }

  /**
   * Get formField
   * @return formField
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public FormFieldRepresentation getFormField() {
    return formField;
  }

  public void setFormField(FormFieldRepresentation formField) {
    this.formField = formField;
  }

  public MetaPropertyRepresentation processVariable(NamedObject processVariable) {
    this.processVariable = processVariable;
    return this;
  }

  /**
   * Get processVariable
   * @return processVariable
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NamedObject getProcessVariable() {
    return processVariable;
  }

  public void setProcessVariable(NamedObject processVariable) {
    this.processVariable = processVariable;
  }

  public MetaPropertyRepresentation propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
  }

  /**
   * Get propertyType
   * @return propertyType
   **/
  @ApiModelProperty(value = "")
  
    public String getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }

  public MetaPropertyRepresentation propertyValueType(String propertyValueType) {
    this.propertyValueType = propertyValueType;
    return this;
  }

  /**
   * Get propertyValueType
   * @return propertyValueType
   **/
  @ApiModelProperty(value = "")
  
    public String getPropertyValueType() {
    return propertyValueType;
  }

  public void setPropertyValueType(String propertyValueType) {
    this.propertyValueType = propertyValueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaPropertyRepresentation metaPropertyRepresentation = (MetaPropertyRepresentation) o;
    return Objects.equals(this.fileProperty, metaPropertyRepresentation.fileProperty) &&
        Objects.equals(this.formField, metaPropertyRepresentation.formField) &&
        Objects.equals(this.processVariable, metaPropertyRepresentation.processVariable) &&
        Objects.equals(this.propertyType, metaPropertyRepresentation.propertyType) &&
        Objects.equals(this.propertyValueType, metaPropertyRepresentation.propertyValueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileProperty, formField, processVariable, propertyType, propertyValueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaPropertyRepresentation {\n");
    
    sb.append("    fileProperty: ").append(toIndentedString(fileProperty)).append("\n");
    sb.append("    formField: ").append(toIndentedString(formField)).append("\n");
    sb.append("    processVariable: ").append(toIndentedString(processVariable)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    propertyValueType: ").append(toIndentedString(propertyValueType)).append("\n");
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
