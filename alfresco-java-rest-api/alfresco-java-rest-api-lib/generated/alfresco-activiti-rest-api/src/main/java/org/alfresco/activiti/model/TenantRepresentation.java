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
 * TenantRepresentation
 */
@Validated

public class TenantRepresentation   {
  @JsonProperty("active")
  private Boolean active = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("logoId")
  private Long logoId = null;

  @JsonProperty("maxUsers")
  private Integer maxUsers = null;

  @JsonProperty("name")
  private String name = null;

  public TenantRepresentation active(Boolean active) {
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

  public TenantRepresentation created(OffsetDateTime created) {
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

  public TenantRepresentation domain(String domain) {
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

  public TenantRepresentation id(Long id) {
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

  public TenantRepresentation lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public TenantRepresentation logoId(Long logoId) {
    this.logoId = logoId;
    return this;
  }

  /**
   * Get logoId
   * @return logoId
  **/
  @ApiModelProperty(value = "")


  public Long getLogoId() {
    return logoId;
  }

  public void setLogoId(Long logoId) {
    this.logoId = logoId;
  }

  public TenantRepresentation maxUsers(Integer maxUsers) {
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

  public TenantRepresentation name(String name) {
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
    TenantRepresentation tenantRepresentation = (TenantRepresentation) o;
    return Objects.equals(this.active, tenantRepresentation.active) &&
        Objects.equals(this.created, tenantRepresentation.created) &&
        Objects.equals(this.domain, tenantRepresentation.domain) &&
        Objects.equals(this.id, tenantRepresentation.id) &&
        Objects.equals(this.lastUpdate, tenantRepresentation.lastUpdate) &&
        Objects.equals(this.logoId, tenantRepresentation.logoId) &&
        Objects.equals(this.maxUsers, tenantRepresentation.maxUsers) &&
        Objects.equals(this.name, tenantRepresentation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, created, domain, id, lastUpdate, logoId, maxUsers, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantRepresentation {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    logoId: ").append(toIndentedString(logoId)).append("\n");
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

