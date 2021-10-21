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
 * RuntimeDecisionTableRepresentation
 */
@Validated


public class RuntimeDecisionTableRepresentation   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("deploymentId")
  private Long deploymentId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resourceName")
  private String resourceName = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("version")
  private Integer version = null;

  public RuntimeDecisionTableRepresentation category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  @ApiModelProperty(value = "")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public RuntimeDecisionTableRepresentation deploymentId(Long deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Get deploymentId
   * @return deploymentId
   **/
  @ApiModelProperty(value = "")
  
    public Long getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(Long deploymentId) {
    this.deploymentId = deploymentId;
  }

  public RuntimeDecisionTableRepresentation description(String description) {
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

  public RuntimeDecisionTableRepresentation id(Long id) {
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

  public RuntimeDecisionTableRepresentation key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   **/
  @ApiModelProperty(value = "")
  
    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public RuntimeDecisionTableRepresentation name(String name) {
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

  public RuntimeDecisionTableRepresentation resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   * @return resourceName
   **/
  @ApiModelProperty(value = "")
  
    public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public RuntimeDecisionTableRepresentation tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   **/
  @ApiModelProperty(value = "")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public RuntimeDecisionTableRepresentation version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @ApiModelProperty(value = "")
  
    public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuntimeDecisionTableRepresentation runtimeDecisionTableRepresentation = (RuntimeDecisionTableRepresentation) o;
    return Objects.equals(this.category, runtimeDecisionTableRepresentation.category) &&
        Objects.equals(this.deploymentId, runtimeDecisionTableRepresentation.deploymentId) &&
        Objects.equals(this.description, runtimeDecisionTableRepresentation.description) &&
        Objects.equals(this.id, runtimeDecisionTableRepresentation.id) &&
        Objects.equals(this.key, runtimeDecisionTableRepresentation.key) &&
        Objects.equals(this.name, runtimeDecisionTableRepresentation.name) &&
        Objects.equals(this.resourceName, runtimeDecisionTableRepresentation.resourceName) &&
        Objects.equals(this.tenantId, runtimeDecisionTableRepresentation.tenantId) &&
        Objects.equals(this.version, runtimeDecisionTableRepresentation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, deploymentId, description, id, key, name, resourceName, tenantId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuntimeDecisionTableRepresentation {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
