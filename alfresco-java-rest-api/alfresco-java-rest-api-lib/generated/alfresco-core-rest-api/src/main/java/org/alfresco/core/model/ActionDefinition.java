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
import org.alfresco.core.model.ActionParameterDefinition;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActionDefinition
 */
@Validated

public class ActionDefinition   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("applicableTypes")
  @Valid
  private List<String> applicableTypes = new ArrayList<>();

  @JsonProperty("trackStatus")
  private Boolean trackStatus = null;

  @JsonProperty("parameterDefinitions")
  @Valid
  private List<ActionParameterDefinition> parameterDefinitions = null;

  public ActionDefinition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the action definition — used for example when executing an action
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the action definition — used for example when executing an action")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ActionDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of the action definition, e.g. \"move\"
   * @return name
  **/
  @ApiModelProperty(value = "name of the action definition, e.g. \"move\"")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActionDefinition title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title of the action definition, e.g. \"Move\"
   * @return title
  **/
  @ApiModelProperty(value = "title of the action definition, e.g. \"Move\"")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ActionDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * describes the action definition, e.g. \"This will move the matched item to another space.\"
   * @return description
  **/
  @ApiModelProperty(value = "describes the action definition, e.g. \"This will move the matched item to another space.\"")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ActionDefinition applicableTypes(List<String> applicableTypes) {
    this.applicableTypes = applicableTypes;
    return this;
  }

  public ActionDefinition addApplicableTypesItem(String applicableTypesItem) {
    this.applicableTypes.add(applicableTypesItem);
    return this;
  }

  /**
   * QNames of the types this action applies to
   * @return applicableTypes
  **/
  @ApiModelProperty(required = true, value = "QNames of the types this action applies to")
  @NotNull


  public List<String> getApplicableTypes() {
    return applicableTypes;
  }

  public void setApplicableTypes(List<String> applicableTypes) {
    this.applicableTypes = applicableTypes;
  }

  public ActionDefinition trackStatus(Boolean trackStatus) {
    this.trackStatus = trackStatus;
    return this;
  }

  /**
   * whether the basic action definition supports action tracking or not
   * @return trackStatus
  **/
  @ApiModelProperty(required = true, value = "whether the basic action definition supports action tracking or not")
  @NotNull


  public Boolean isTrackStatus() {
    return trackStatus;
  }

  public void setTrackStatus(Boolean trackStatus) {
    this.trackStatus = trackStatus;
  }

  public ActionDefinition parameterDefinitions(List<ActionParameterDefinition> parameterDefinitions) {
    this.parameterDefinitions = parameterDefinitions;
    return this;
  }

  public ActionDefinition addParameterDefinitionsItem(ActionParameterDefinition parameterDefinitionsItem) {
    if (this.parameterDefinitions == null) {
      this.parameterDefinitions = new ArrayList<>();
    }
    this.parameterDefinitions.add(parameterDefinitionsItem);
    return this;
  }

  /**
   * Get parameterDefinitions
   * @return parameterDefinitions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ActionParameterDefinition> getParameterDefinitions() {
    return parameterDefinitions;
  }

  public void setParameterDefinitions(List<ActionParameterDefinition> parameterDefinitions) {
    this.parameterDefinitions = parameterDefinitions;
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
    return Objects.equals(this.id, actionDefinition.id) &&
        Objects.equals(this.name, actionDefinition.name) &&
        Objects.equals(this.title, actionDefinition.title) &&
        Objects.equals(this.description, actionDefinition.description) &&
        Objects.equals(this.applicableTypes, actionDefinition.applicableTypes) &&
        Objects.equals(this.trackStatus, actionDefinition.trackStatus) &&
        Objects.equals(this.parameterDefinitions, actionDefinition.parameterDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, title, description, applicableTypes, trackStatus, parameterDefinitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    applicableTypes: ").append(toIndentedString(applicableTypes)).append("\n");
    sb.append("    trackStatus: ").append(toIndentedString(trackStatus)).append("\n");
    sb.append("    parameterDefinitions: ").append(toIndentedString(parameterDefinitions)).append("\n");
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

