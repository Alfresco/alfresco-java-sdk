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
 * AppDefinitionRepresentation
 */
@Validated

public class AppDefinitionRepresentation   {
  @JsonProperty("defaultAppId")
  private String defaultAppId = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("modelId")
  private Long modelId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenantId")
  private Long tenantId = null;

  @JsonProperty("theme")
  private String theme = null;

  public AppDefinitionRepresentation defaultAppId(String defaultAppId) {
    this.defaultAppId = defaultAppId;
    return this;
  }

  /**
   * Get defaultAppId
   * @return defaultAppId
  **/
  @ApiModelProperty(value = "")


  public String getDefaultAppId() {
    return defaultAppId;
  }

  public void setDefaultAppId(String defaultAppId) {
    this.defaultAppId = defaultAppId;
  }

  public AppDefinitionRepresentation deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Get deploymentId
   * @return deploymentId
  **/
  @ApiModelProperty(value = "")


  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public AppDefinitionRepresentation description(String description) {
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

  public AppDefinitionRepresentation icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public AppDefinitionRepresentation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AppDefinitionRepresentation modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Get modelId
   * @return modelId
  **/
  @ApiModelProperty(value = "")


  public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  public AppDefinitionRepresentation name(String name) {
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

  public AppDefinitionRepresentation tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")


  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public AppDefinitionRepresentation theme(String theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Get theme
   * @return theme
  **/
  @ApiModelProperty(value = "")


  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDefinitionRepresentation appDefinitionRepresentation = (AppDefinitionRepresentation) o;
    return Objects.equals(this.defaultAppId, appDefinitionRepresentation.defaultAppId) &&
        Objects.equals(this.deploymentId, appDefinitionRepresentation.deploymentId) &&
        Objects.equals(this.description, appDefinitionRepresentation.description) &&
        Objects.equals(this.icon, appDefinitionRepresentation.icon) &&
        Objects.equals(this.id, appDefinitionRepresentation.id) &&
        Objects.equals(this.modelId, appDefinitionRepresentation.modelId) &&
        Objects.equals(this.name, appDefinitionRepresentation.name) &&
        Objects.equals(this.tenantId, appDefinitionRepresentation.tenantId) &&
        Objects.equals(this.theme, appDefinitionRepresentation.theme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAppId, deploymentId, description, icon, id, modelId, name, tenantId, theme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDefinitionRepresentation {\n");
    
    sb.append("    defaultAppId: ").append(toIndentedString(defaultAppId)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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

