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
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppModelDefinition
 */
@Validated

public class AppModelDefinition   {
  @JsonProperty("createdBy")
  private Long createdBy = null;

  @JsonProperty("createdByFullName")
  private String createdByFullName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @JsonProperty("lastUpdatedBy")
  private Long lastUpdatedBy = null;

  @JsonProperty("lastUpdatedByFullName")
  private String lastUpdatedByFullName = null;

  @JsonProperty("modelType")
  private Integer modelType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("stencilSetId")
  private Long stencilSetId = null;

  @JsonProperty("version")
  private Integer version = null;

  public AppModelDefinition createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")


  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public AppModelDefinition createdByFullName(String createdByFullName) {
    this.createdByFullName = createdByFullName;
    return this;
  }

  /**
   * Get createdByFullName
   * @return createdByFullName
  **/
  @ApiModelProperty(value = "")


  public String getCreatedByFullName() {
    return createdByFullName;
  }

  public void setCreatedByFullName(String createdByFullName) {
    this.createdByFullName = createdByFullName;
  }

  public AppModelDefinition description(String description) {
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

  public AppModelDefinition id(Long id) {
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

  public AppModelDefinition lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public AppModelDefinition lastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @ApiModelProperty(value = "")


  public Long getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public AppModelDefinition lastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
    return this;
  }

  /**
   * Get lastUpdatedByFullName
   * @return lastUpdatedByFullName
  **/
  @ApiModelProperty(value = "")


  public String getLastUpdatedByFullName() {
    return lastUpdatedByFullName;
  }

  public void setLastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
  }

  public AppModelDefinition modelType(Integer modelType) {
    this.modelType = modelType;
    return this;
  }

  /**
   * Get modelType
   * @return modelType
  **/
  @ApiModelProperty(value = "")


  public Integer getModelType() {
    return modelType;
  }

  public void setModelType(Integer modelType) {
    this.modelType = modelType;
  }

  public AppModelDefinition name(String name) {
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

  public AppModelDefinition stencilSetId(Long stencilSetId) {
    this.stencilSetId = stencilSetId;
    return this;
  }

  /**
   * Get stencilSetId
   * @return stencilSetId
  **/
  @ApiModelProperty(value = "")


  public Long getStencilSetId() {
    return stencilSetId;
  }

  public void setStencilSetId(Long stencilSetId) {
    this.stencilSetId = stencilSetId;
  }

  public AppModelDefinition version(Integer version) {
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
    AppModelDefinition appModelDefinition = (AppModelDefinition) o;
    return Objects.equals(this.createdBy, appModelDefinition.createdBy) &&
        Objects.equals(this.createdByFullName, appModelDefinition.createdByFullName) &&
        Objects.equals(this.description, appModelDefinition.description) &&
        Objects.equals(this.id, appModelDefinition.id) &&
        Objects.equals(this.lastUpdated, appModelDefinition.lastUpdated) &&
        Objects.equals(this.lastUpdatedBy, appModelDefinition.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedByFullName, appModelDefinition.lastUpdatedByFullName) &&
        Objects.equals(this.modelType, appModelDefinition.modelType) &&
        Objects.equals(this.name, appModelDefinition.name) &&
        Objects.equals(this.stencilSetId, appModelDefinition.stencilSetId) &&
        Objects.equals(this.version, appModelDefinition.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdByFullName, description, id, lastUpdated, lastUpdatedBy, lastUpdatedByFullName, modelType, name, stencilSetId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppModelDefinition {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByFullName: ").append(toIndentedString(createdByFullName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdatedByFullName: ").append(toIndentedString(lastUpdatedByFullName)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stencilSetId: ").append(toIndentedString(stencilSetId)).append("\n");
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

