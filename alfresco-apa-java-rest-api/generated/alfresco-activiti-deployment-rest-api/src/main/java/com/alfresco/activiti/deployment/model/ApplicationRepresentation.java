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
package com.alfresco.activiti.deployment.model;

import java.util.Objects;
import com.alfresco.activiti.deployment.model.InfrastructureRepresentation;
import com.alfresco.activiti.deployment.model.SecurityRepresentation;
import com.alfresco.activiti.deployment.model.VariablesRepresentation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicationRepresentation
 */
@Validated

public class ApplicationRepresentation   {
  @JsonProperty("infrastructure")
  private InfrastructureRepresentation infrastructure = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("projectId")
  private String projectId = null;

  @JsonProperty("projectName")
  private String projectName = null;

  @JsonProperty("releaseId")
  private String releaseId = null;

  @JsonProperty("releaseVersion")
  private String releaseVersion = null;

  @JsonProperty("security")
  @Valid
  private List<SecurityRepresentation> security = null;

  @JsonProperty("variables")
  private VariablesRepresentation variables = null;

  public ApplicationRepresentation infrastructure(InfrastructureRepresentation infrastructure) {
    this.infrastructure = infrastructure;
    return this;
  }

  /**
   * Get infrastructure
   * @return infrastructure
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfrastructureRepresentation getInfrastructure() {
    return infrastructure;
  }

  public void setInfrastructure(InfrastructureRepresentation infrastructure) {
    this.infrastructure = infrastructure;
  }

  public ApplicationRepresentation name(String name) {
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

  public ApplicationRepresentation projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(value = "")


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ApplicationRepresentation projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
  **/
  @ApiModelProperty(value = "")


  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public ApplicationRepresentation releaseId(String releaseId) {
    this.releaseId = releaseId;
    return this;
  }

  /**
   * Get releaseId
   * @return releaseId
  **/
  @ApiModelProperty(value = "")


  public String getReleaseId() {
    return releaseId;
  }

  public void setReleaseId(String releaseId) {
    this.releaseId = releaseId;
  }

  public ApplicationRepresentation releaseVersion(String releaseVersion) {
    this.releaseVersion = releaseVersion;
    return this;
  }

  /**
   * Get releaseVersion
   * @return releaseVersion
  **/
  @ApiModelProperty(value = "")


  public String getReleaseVersion() {
    return releaseVersion;
  }

  public void setReleaseVersion(String releaseVersion) {
    this.releaseVersion = releaseVersion;
  }

  public ApplicationRepresentation security(List<SecurityRepresentation> security) {
    this.security = security;
    return this;
  }

  public ApplicationRepresentation addSecurityItem(SecurityRepresentation securityItem) {
    if (this.security == null) {
      this.security = new ArrayList<>();
    }
    this.security.add(securityItem);
    return this;
  }

  /**
   * Get security
   * @return security
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SecurityRepresentation> getSecurity() {
    return security;
  }

  public void setSecurity(List<SecurityRepresentation> security) {
    this.security = security;
  }

  public ApplicationRepresentation variables(VariablesRepresentation variables) {
    this.variables = variables;
    return this;
  }

  /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public VariablesRepresentation getVariables() {
    return variables;
  }

  public void setVariables(VariablesRepresentation variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationRepresentation applicationRepresentation = (ApplicationRepresentation) o;
    return Objects.equals(this.infrastructure, applicationRepresentation.infrastructure) &&
        Objects.equals(this.name, applicationRepresentation.name) &&
        Objects.equals(this.projectId, applicationRepresentation.projectId) &&
        Objects.equals(this.projectName, applicationRepresentation.projectName) &&
        Objects.equals(this.releaseId, applicationRepresentation.releaseId) &&
        Objects.equals(this.releaseVersion, applicationRepresentation.releaseVersion) &&
        Objects.equals(this.security, applicationRepresentation.security) &&
        Objects.equals(this.variables, applicationRepresentation.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infrastructure, name, projectId, projectName, releaseId, releaseVersion, security, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationRepresentation {\n");
    
    sb.append("    infrastructure: ").append(toIndentedString(infrastructure)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
    sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

