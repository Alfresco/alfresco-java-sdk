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
package org.alfresco.activiti.deployment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.deployment.model.DeployDescriptorVariablesRepresentation;
import org.alfresco.activiti.deployment.model.SecurityRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeployDescriptorRequestRepresentation
 */
@Validated


public class DeployDescriptorRequestRepresentation   {
  @JsonProperty("security")
  @Valid
  private List<SecurityRepresentation> security = null;

  @JsonProperty("variables")
  private DeployDescriptorVariablesRepresentation variables = null;

  public DeployDescriptorRequestRepresentation security(List<SecurityRepresentation> security) {
    this.security = security;
    return this;
  }

  public DeployDescriptorRequestRepresentation addSecurityItem(SecurityRepresentation securityItem) {
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

  public DeployDescriptorRequestRepresentation variables(DeployDescriptorVariablesRepresentation variables) {
    this.variables = variables;
    return this;
  }

  /**
   * Get variables
   * @return variables
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DeployDescriptorVariablesRepresentation getVariables() {
    return variables;
  }

  public void setVariables(DeployDescriptorVariablesRepresentation variables) {
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
    DeployDescriptorRequestRepresentation deployDescriptorRequestRepresentation = (DeployDescriptorRequestRepresentation) o;
    return Objects.equals(this.security, deployDescriptorRequestRepresentation.security) &&
        Objects.equals(this.variables, deployDescriptorRequestRepresentation.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployDescriptorRequestRepresentation {\n");
    
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
