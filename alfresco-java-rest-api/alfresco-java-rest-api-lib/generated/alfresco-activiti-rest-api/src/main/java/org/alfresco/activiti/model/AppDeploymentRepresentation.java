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
import org.alfresco.activiti.model.AppDefinitionRepresentation;
import org.alfresco.activiti.model.LightUserRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppDeploymentRepresentation
 */
@Validated

public class AppDeploymentRepresentation   {
  @JsonProperty("appDefinition")
  private AppDefinitionRepresentation appDefinition = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("createdBy")
  private LightUserRepresentation createdBy = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("dmnDeploymentId")
  private Long dmnDeploymentId = null;

  @JsonProperty("id")
  private Long id = null;

  public AppDeploymentRepresentation appDefinition(AppDefinitionRepresentation appDefinition) {
    this.appDefinition = appDefinition;
    return this;
  }

  /**
   * Get appDefinition
   * @return appDefinition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AppDefinitionRepresentation getAppDefinition() {
    return appDefinition;
  }

  public void setAppDefinition(AppDefinitionRepresentation appDefinition) {
    this.appDefinition = appDefinition;
  }

  public AppDeploymentRepresentation created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public AppDeploymentRepresentation createdBy(LightUserRepresentation createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LightUserRepresentation getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(LightUserRepresentation createdBy) {
    this.createdBy = createdBy;
  }

  public AppDeploymentRepresentation deploymentId(String deploymentId) {
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

  public AppDeploymentRepresentation dmnDeploymentId(Long dmnDeploymentId) {
    this.dmnDeploymentId = dmnDeploymentId;
    return this;
  }

  /**
   * Get dmnDeploymentId
   * @return dmnDeploymentId
  **/
  @ApiModelProperty(value = "")


  public Long getDmnDeploymentId() {
    return dmnDeploymentId;
  }

  public void setDmnDeploymentId(Long dmnDeploymentId) {
    this.dmnDeploymentId = dmnDeploymentId;
  }

  public AppDeploymentRepresentation id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDeploymentRepresentation appDeploymentRepresentation = (AppDeploymentRepresentation) o;
    return Objects.equals(this.appDefinition, appDeploymentRepresentation.appDefinition) &&
        Objects.equals(this.created, appDeploymentRepresentation.created) &&
        Objects.equals(this.createdBy, appDeploymentRepresentation.createdBy) &&
        Objects.equals(this.deploymentId, appDeploymentRepresentation.deploymentId) &&
        Objects.equals(this.dmnDeploymentId, appDeploymentRepresentation.dmnDeploymentId) &&
        Objects.equals(this.id, appDeploymentRepresentation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinition, created, createdBy, deploymentId, dmnDeploymentId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDeploymentRepresentation {\n");
    
    sb.append("    appDefinition: ").append(toIndentedString(appDefinition)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    dmnDeploymentId: ").append(toIndentedString(dmnDeploymentId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

