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
package com.alfresco.activiti.form.model;

import java.util.Objects;
import com.alfresco.activiti.form.model.ActionDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConnectorDefinition
 */
@Validated


public class ConnectorDefinition   {
  @JsonProperty("actions")
  @Valid
  private Map<String, ActionDefinition> actions = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public ConnectorDefinition actions(Map<String, ActionDefinition> actions) {
    this.actions = actions;
    return this;
  }

  public ConnectorDefinition putActionsItem(String key, ActionDefinition actionsItem) {
    if (this.actions == null) {
      this.actions = new HashMap<>();
    }
    this.actions.put(key, actionsItem);
    return this;
  }

  /**
   * Get actions
   * @return actions
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, ActionDefinition> getActions() {
    return actions;
  }

  public void setActions(Map<String, ActionDefinition> actions) {
    this.actions = actions;
  }

  public ConnectorDefinition description(String description) {
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

  public ConnectorDefinition id(String id) {
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

  public ConnectorDefinition name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorDefinition connectorDefinition = (ConnectorDefinition) o;
    return Objects.equals(this.actions, connectorDefinition.actions) &&
        Objects.equals(this.description, connectorDefinition.description) &&
        Objects.equals(this.id, connectorDefinition.id) &&
        Objects.equals(this.name, connectorDefinition.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, description, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorDefinition {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
