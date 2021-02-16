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
 * RuntimeFormRepresentation
 */
@Validated

public class RuntimeFormRepresentation   {
  @JsonProperty("appDefinitionId")
  private Long appDefinitionId = null;

  @JsonProperty("appDeploymentId")
  private Long appDeploymentId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("modelId")
  private Long modelId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenantId")
  private Long tenantId = null;

  public RuntimeFormRepresentation appDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
    return this;
  }

  /**
   * Get appDefinitionId
   * @return appDefinitionId
  **/
  @ApiModelProperty(value = "")


  public Long getAppDefinitionId() {
    return appDefinitionId;
  }

  public void setAppDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
  }

  public RuntimeFormRepresentation appDeploymentId(Long appDeploymentId) {
    this.appDeploymentId = appDeploymentId;
    return this;
  }

  /**
   * Get appDeploymentId
   * @return appDeploymentId
  **/
  @ApiModelProperty(value = "")


  public Long getAppDeploymentId() {
    return appDeploymentId;
  }

  public void setAppDeploymentId(Long appDeploymentId) {
    this.appDeploymentId = appDeploymentId;
  }

  public RuntimeFormRepresentation description(String description) {
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

  public RuntimeFormRepresentation id(Long id) {
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

  public RuntimeFormRepresentation modelId(Long modelId) {
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

  public RuntimeFormRepresentation name(String name) {
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

  public RuntimeFormRepresentation tenantId(Long tenantId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeFormRepresentation runtimeFormRepresentation = (RuntimeFormRepresentation) o;
    return Objects.equals(this.appDefinitionId, runtimeFormRepresentation.appDefinitionId) &&
        Objects.equals(this.appDeploymentId, runtimeFormRepresentation.appDeploymentId) &&
        Objects.equals(this.description, runtimeFormRepresentation.description) &&
        Objects.equals(this.id, runtimeFormRepresentation.id) &&
        Objects.equals(this.modelId, runtimeFormRepresentation.modelId) &&
        Objects.equals(this.name, runtimeFormRepresentation.name) &&
        Objects.equals(this.tenantId, runtimeFormRepresentation.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinitionId, appDeploymentId, description, id, modelId, name, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeFormRepresentation {\n");
    
    sb.append("    appDefinitionId: ").append(toIndentedString(appDefinitionId)).append("\n");
    sb.append("    appDeploymentId: ").append(toIndentedString(appDeploymentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

