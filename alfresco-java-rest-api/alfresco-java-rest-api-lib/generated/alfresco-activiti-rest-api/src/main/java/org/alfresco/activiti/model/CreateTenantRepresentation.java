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
 * CreateTenantRepresentation
 */
@Validated

public class CreateTenantRepresentation   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("configuration")
  private String _configuration = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("maxUsers")
  private Integer maxUsers = null;

  @JsonProperty("name")
  private String name = null;

  public CreateTenantRepresentation active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")


  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CreateTenantRepresentation _configuration(String _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(value = "")


  public String getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(String _configuration) {
    this._configuration = _configuration;
  }

  public CreateTenantRepresentation domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(value = "")


  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public CreateTenantRepresentation maxUsers(Integer maxUsers) {
    this.maxUsers = maxUsers;
    return this;
  }

  /**
   * Get maxUsers
   * @return maxUsers
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxUsers() {
    return maxUsers;
  }

  public void setMaxUsers(Integer maxUsers) {
    this.maxUsers = maxUsers;
  }

  public CreateTenantRepresentation name(String name) {
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
    CreateTenantRepresentation createTenantRepresentation = (CreateTenantRepresentation) o;
    return Objects.equals(this.active, createTenantRepresentation.active) &&
        Objects.equals(this._configuration, createTenantRepresentation._configuration) &&
        Objects.equals(this.domain, createTenantRepresentation.domain) &&
        Objects.equals(this.maxUsers, createTenantRepresentation.maxUsers) &&
        Objects.equals(this.name, createTenantRepresentation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, _configuration, domain, maxUsers, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTenantRepresentation {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    maxUsers: ").append(toIndentedString(maxUsers)).append("\n");
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

