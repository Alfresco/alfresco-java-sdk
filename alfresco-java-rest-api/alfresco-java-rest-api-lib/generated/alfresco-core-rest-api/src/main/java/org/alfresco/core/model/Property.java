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
package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.core.model.Constraint;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Property
 */
@Validated

public class Property   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("defaultValue")
  private String defaultValue = null;

  @JsonProperty("dataType")
  private String dataType = null;

  @JsonProperty("isMultiValued")
  private Boolean isMultiValued = null;

  @JsonProperty("isMandatory")
  private Boolean isMandatory = null;

  @JsonProperty("isMandatoryEnforced")
  private Boolean isMandatoryEnforced = null;

  @JsonProperty("isProtected")
  private Boolean isProtected = null;

  @JsonProperty("constraints")
  @Valid
  private List<Constraint> constraints = null;

  public Property id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Property title(String title) {
    this.title = title;
    return this;
  }

  /**
   * the human-readable title
   * @return title
  **/
  @ApiModelProperty(value = "the human-readable title")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Property description(String description) {
    this.description = description;
    return this;
  }

  /**
   * the human-readable description
   * @return description
  **/
  @ApiModelProperty(value = "the human-readable description")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Property defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * the default value
   * @return defaultValue
  **/
  @ApiModelProperty(value = "the default value")


  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public Property dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * the name of the property type (e.g. d:text)
   * @return dataType
  **/
  @ApiModelProperty(value = "the name of the property type (e.g. d:text)")


  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public Property isMultiValued(Boolean isMultiValued) {
    this.isMultiValued = isMultiValued;
    return this;
  }

  /**
   * define if the property is multi-valued
   * @return isMultiValued
  **/
  @ApiModelProperty(value = "define if the property is multi-valued")


  public Boolean isIsMultiValued() {
    return isMultiValued;
  }

  public void setIsMultiValued(Boolean isMultiValued) {
    this.isMultiValued = isMultiValued;
  }

  public Property isMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
    return this;
  }

  /**
   * define if the property is mandatory
   * @return isMandatory
  **/
  @ApiModelProperty(value = "define if the property is mandatory")


  public Boolean isIsMandatory() {
    return isMandatory;
  }

  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }

  public Property isMandatoryEnforced(Boolean isMandatoryEnforced) {
    this.isMandatoryEnforced = isMandatoryEnforced;
    return this;
  }

  /**
   * define if the presence of mandatory properties is enforced
   * @return isMandatoryEnforced
  **/
  @ApiModelProperty(value = "define if the presence of mandatory properties is enforced")


  public Boolean isIsMandatoryEnforced() {
    return isMandatoryEnforced;
  }

  public void setIsMandatoryEnforced(Boolean isMandatoryEnforced) {
    this.isMandatoryEnforced = isMandatoryEnforced;
  }

  public Property isProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }

  /**
   * define if the property is system maintained
   * @return isProtected
  **/
  @ApiModelProperty(value = "define if the property is system maintained")


  public Boolean isIsProtected() {
    return isProtected;
  }

  public void setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
  }

  public Property constraints(List<Constraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  public Property addConstraintsItem(Constraint constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

  /**
   * list of constraints defined for the property
   * @return constraints
  **/
  @ApiModelProperty(value = "list of constraints defined for the property")

  @Valid

  public List<Constraint> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<Constraint> constraints) {
    this.constraints = constraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Property property = (Property) o;
    return Objects.equals(this.id, property.id) &&
        Objects.equals(this.title, property.title) &&
        Objects.equals(this.description, property.description) &&
        Objects.equals(this.defaultValue, property.defaultValue) &&
        Objects.equals(this.dataType, property.dataType) &&
        Objects.equals(this.isMultiValued, property.isMultiValued) &&
        Objects.equals(this.isMandatory, property.isMandatory) &&
        Objects.equals(this.isMandatoryEnforced, property.isMandatoryEnforced) &&
        Objects.equals(this.isProtected, property.isProtected) &&
        Objects.equals(this.constraints, property.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, defaultValue, dataType, isMultiValued, isMandatory, isMandatoryEnforced, isProtected, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    isMultiValued: ").append(toIndentedString(isMultiValued)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    isMandatoryEnforced: ").append(toIndentedString(isMandatoryEnforced)).append("\n");
    sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

