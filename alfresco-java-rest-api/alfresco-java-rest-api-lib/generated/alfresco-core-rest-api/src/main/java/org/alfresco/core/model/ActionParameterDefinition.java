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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActionParameterDefinition
 */
@Validated


public class ActionParameterDefinition   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("multiValued")
  private Boolean multiValued = null;

  @JsonProperty("mandatory")
  private Boolean mandatory = null;

  @JsonProperty("displayLabel")
  private String displayLabel = null;

  public ActionParameterDefinition name(String name) {
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

  public ActionParameterDefinition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")



  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ActionParameterDefinition multiValued(Boolean multiValued) {
    this.multiValued = multiValued;
    return this;
  }

  /**
   * Get multiValued
   * @return multiValued
  **/
  @ApiModelProperty(value = "")



  public Boolean isMultiValued() {
    return multiValued;
  }

  public void setMultiValued(Boolean multiValued) {
    this.multiValued = multiValued;
  }

  public ActionParameterDefinition mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

  /**
   * Get mandatory
   * @return mandatory
  **/
  @ApiModelProperty(value = "")



  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public ActionParameterDefinition displayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

  /**
   * Get displayLabel
   * @return displayLabel
  **/
  @ApiModelProperty(value = "")



  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionParameterDefinition actionParameterDefinition = (ActionParameterDefinition) o;
    return Objects.equals(this.name, actionParameterDefinition.name) &&
        Objects.equals(this.type, actionParameterDefinition.type) &&
        Objects.equals(this.multiValued, actionParameterDefinition.multiValued) &&
        Objects.equals(this.mandatory, actionParameterDefinition.mandatory) &&
        Objects.equals(this.displayLabel, actionParameterDefinition.displayLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, multiValued, mandatory, displayLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionParameterDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    multiValued: ").append(toIndentedString(multiValued)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
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

