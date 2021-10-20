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
import com.alfresco.activiti.deployment.model.InfrastructurePutRepresentation;
import com.alfresco.activiti.deployment.model.SecurityRepresentation;
import com.alfresco.activiti.deployment.model.VariablesPutRepresentation;
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
 * ApplicationPutRequestRepresentation
 */
@Validated


public class ApplicationPutRequestRepresentation   {
  @JsonProperty("infrastructure")
  private InfrastructurePutRepresentation infrastructure = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("releaseId")
  private String releaseId = null;

  @JsonProperty("security")
  @Valid
  private List<SecurityRepresentation> security = null;

  @JsonProperty("variables")
  private VariablesPutRepresentation variables = null;

  public ApplicationPutRequestRepresentation infrastructure(InfrastructurePutRepresentation infrastructure) {
    this.infrastructure = infrastructure;
    return this;
  }

  /**
   * Get infrastructure
   * @return infrastructure
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InfrastructurePutRepresentation getInfrastructure() {
    return infrastructure;
  }

  public void setInfrastructure(InfrastructurePutRepresentation infrastructure) {
    this.infrastructure = infrastructure;
  }

  public ApplicationPutRequestRepresentation name(String name) {
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

  public ApplicationPutRequestRepresentation releaseId(String releaseId) {
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

  public ApplicationPutRequestRepresentation security(List<SecurityRepresentation> security) {
    this.security = security;
    return this;
  }

  public ApplicationPutRequestRepresentation addSecurityItem(SecurityRepresentation securityItem) {
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

  public ApplicationPutRequestRepresentation variables(VariablesPutRepresentation variables) {
    this.variables = variables;
    return this;
  }

  /**
   * Get variables
   * @return variables
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public VariablesPutRepresentation getVariables() {
    return variables;
  }

  public void setVariables(VariablesPutRepresentation variables) {
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
    ApplicationPutRequestRepresentation applicationPutRequestRepresentation = (ApplicationPutRequestRepresentation) o;
    return Objects.equals(this.infrastructure, applicationPutRequestRepresentation.infrastructure) &&
        Objects.equals(this.name, applicationPutRequestRepresentation.name) &&
        Objects.equals(this.releaseId, applicationPutRequestRepresentation.releaseId) &&
        Objects.equals(this.security, applicationPutRequestRepresentation.security) &&
        Objects.equals(this.variables, applicationPutRequestRepresentation.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infrastructure, name, releaseId, security, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationPutRequestRepresentation {\n");
    
    sb.append("    infrastructure: ").append(toIndentedString(infrastructure)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
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
