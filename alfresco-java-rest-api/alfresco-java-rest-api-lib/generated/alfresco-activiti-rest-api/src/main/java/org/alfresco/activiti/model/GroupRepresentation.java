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
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.GroupCapabilityRepresentation;
import org.alfresco.activiti.model.GroupRepresentation;
import org.alfresco.activiti.model.UserRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupRepresentation
 */
@Validated

public class GroupRepresentation   {
  @JsonProperty("capabilities")
  @Valid
  private List<GroupCapabilityRepresentation> capabilities = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("groups")
  @Valid
  private List<GroupRepresentation> groups = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastSyncTimeStamp")
  private OffsetDateTime lastSyncTimeStamp = null;

  @JsonProperty("manager")
  private UserRepresentation manager = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentGroupId")
  private Long parentGroupId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tenantId")
  private Long tenantId = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("userCount")
  private Long userCount = null;

  @JsonProperty("users")
  @Valid
  private List<UserRepresentation> users = null;

  public GroupRepresentation capabilities(List<GroupCapabilityRepresentation> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public GroupRepresentation addCapabilitiesItem(GroupCapabilityRepresentation capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GroupCapabilityRepresentation> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<GroupCapabilityRepresentation> capabilities) {
    this.capabilities = capabilities;
  }

  public GroupRepresentation externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")


  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public GroupRepresentation groups(List<GroupRepresentation> groups) {
    this.groups = groups;
    return this;
  }

  public GroupRepresentation addGroupsItem(GroupRepresentation groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<GroupRepresentation> getGroups() {
    return groups;
  }

  public void setGroups(List<GroupRepresentation> groups) {
    this.groups = groups;
  }

  public GroupRepresentation id(Long id) {
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

  public GroupRepresentation lastSyncTimeStamp(OffsetDateTime lastSyncTimeStamp) {
    this.lastSyncTimeStamp = lastSyncTimeStamp;
    return this;
  }

  /**
   * Get lastSyncTimeStamp
   * @return lastSyncTimeStamp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastSyncTimeStamp() {
    return lastSyncTimeStamp;
  }

  public void setLastSyncTimeStamp(OffsetDateTime lastSyncTimeStamp) {
    this.lastSyncTimeStamp = lastSyncTimeStamp;
  }

  public GroupRepresentation manager(UserRepresentation manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserRepresentation getManager() {
    return manager;
  }

  public void setManager(UserRepresentation manager) {
    this.manager = manager;
  }

  public GroupRepresentation name(String name) {
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

  public GroupRepresentation parentGroupId(Long parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

  /**
   * Get parentGroupId
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "")


  public Long getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(Long parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public GroupRepresentation status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GroupRepresentation tenantId(Long tenantId) {
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

  public GroupRepresentation type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public GroupRepresentation userCount(Long userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * Get userCount
   * @return userCount
  **/
  @ApiModelProperty(value = "")


  public Long getUserCount() {
    return userCount;
  }

  public void setUserCount(Long userCount) {
    this.userCount = userCount;
  }

  public GroupRepresentation users(List<UserRepresentation> users) {
    this.users = users;
    return this;
  }

  public GroupRepresentation addUsersItem(UserRepresentation usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<UserRepresentation> getUsers() {
    return users;
  }

  public void setUsers(List<UserRepresentation> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupRepresentation groupRepresentation = (GroupRepresentation) o;
    return Objects.equals(this.capabilities, groupRepresentation.capabilities) &&
        Objects.equals(this.externalId, groupRepresentation.externalId) &&
        Objects.equals(this.groups, groupRepresentation.groups) &&
        Objects.equals(this.id, groupRepresentation.id) &&
        Objects.equals(this.lastSyncTimeStamp, groupRepresentation.lastSyncTimeStamp) &&
        Objects.equals(this.manager, groupRepresentation.manager) &&
        Objects.equals(this.name, groupRepresentation.name) &&
        Objects.equals(this.parentGroupId, groupRepresentation.parentGroupId) &&
        Objects.equals(this.status, groupRepresentation.status) &&
        Objects.equals(this.tenantId, groupRepresentation.tenantId) &&
        Objects.equals(this.type, groupRepresentation.type) &&
        Objects.equals(this.userCount, groupRepresentation.userCount) &&
        Objects.equals(this.users, groupRepresentation.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, externalId, groups, id, lastSyncTimeStamp, manager, name, parentGroupId, status, tenantId, type, userCount, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupRepresentation {\n");
    
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastSyncTimeStamp: ").append(toIndentedString(lastSyncTimeStamp)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

