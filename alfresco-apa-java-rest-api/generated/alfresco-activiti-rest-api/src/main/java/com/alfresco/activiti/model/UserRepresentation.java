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
import com.alfresco.activiti.model.GroupRepresentation;
import com.alfresco.activiti.model.LightAppRepresentation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserRepresentation
 */
@Validated


public class UserRepresentation   {
  @JsonProperty("apps")
  @Valid
  private List<LightAppRepresentation> apps = null;

  @JsonProperty("capabilities")
  @Valid
  private List<String> capabilities = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("fullname")
  private String fullname = null;

  @JsonProperty("groups")
  @Valid
  private List<GroupRepresentation> groups = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("latestSyncTimeStamp")
  private OffsetDateTime latestSyncTimeStamp = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("pictureId")
  private Long pictureId = null;

  @JsonProperty("primaryGroup")
  private GroupRepresentation primaryGroup = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tenantId")
  private Long tenantId = null;

  @JsonProperty("tenantName")
  private String tenantName = null;

  @JsonProperty("tenantPictureId")
  private Long tenantPictureId = null;

  @JsonProperty("type")
  private String type = null;

  public UserRepresentation apps(List<LightAppRepresentation> apps) {
    this.apps = apps;
    return this;
  }

  public UserRepresentation addAppsItem(LightAppRepresentation appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

  /**
   * Get apps
   * @return apps
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<LightAppRepresentation> getApps() {
    return apps;
  }

  public void setApps(List<LightAppRepresentation> apps) {
    this.apps = apps;
  }

  public UserRepresentation capabilities(List<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public UserRepresentation addCapabilitiesItem(String capabilitiesItem) {
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
  
    public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }

  public UserRepresentation company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
   **/
  @ApiModelProperty(value = "")
  
    public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UserRepresentation created(OffsetDateTime created) {
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

  public UserRepresentation email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @ApiModelProperty(value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserRepresentation externalId(String externalId) {
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

  public UserRepresentation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @ApiModelProperty(value = "")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserRepresentation fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  /**
   * Get fullname
   * @return fullname
   **/
  @ApiModelProperty(value = "")
  
    public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public UserRepresentation groups(List<GroupRepresentation> groups) {
    this.groups = groups;
    return this;
  }

  public UserRepresentation addGroupsItem(GroupRepresentation groupsItem) {
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

  public UserRepresentation id(Long id) {
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

  public UserRepresentation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @ApiModelProperty(value = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserRepresentation lastUpdate(OffsetDateTime lastUpdate) {
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

  public UserRepresentation latestSyncTimeStamp(OffsetDateTime latestSyncTimeStamp) {
    this.latestSyncTimeStamp = latestSyncTimeStamp;
    return this;
  }

  /**
   * Get latestSyncTimeStamp
   * @return latestSyncTimeStamp
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getLatestSyncTimeStamp() {
    return latestSyncTimeStamp;
  }

  public void setLatestSyncTimeStamp(OffsetDateTime latestSyncTimeStamp) {
    this.latestSyncTimeStamp = latestSyncTimeStamp;
  }

  public UserRepresentation password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @ApiModelProperty(value = "")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserRepresentation pictureId(Long pictureId) {
    this.pictureId = pictureId;
    return this;
  }

  /**
   * Get pictureId
   * @return pictureId
   **/
  @ApiModelProperty(value = "")
  
    public Long getPictureId() {
    return pictureId;
  }

  public void setPictureId(Long pictureId) {
    this.pictureId = pictureId;
  }

  public UserRepresentation primaryGroup(GroupRepresentation primaryGroup) {
    this.primaryGroup = primaryGroup;
    return this;
  }

  /**
   * Get primaryGroup
   * @return primaryGroup
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GroupRepresentation getPrimaryGroup() {
    return primaryGroup;
  }

  public void setPrimaryGroup(GroupRepresentation primaryGroup) {
    this.primaryGroup = primaryGroup;
  }

  public UserRepresentation status(String status) {
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

  public UserRepresentation tenantId(Long tenantId) {
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

  public UserRepresentation tenantName(String tenantName) {
    this.tenantName = tenantName;
    return this;
  }

  /**
   * Get tenantName
   * @return tenantName
   **/
  @ApiModelProperty(value = "")
  
    public String getTenantName() {
    return tenantName;
  }

  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  public UserRepresentation tenantPictureId(Long tenantPictureId) {
    this.tenantPictureId = tenantPictureId;
    return this;
  }

  /**
   * Get tenantPictureId
   * @return tenantPictureId
   **/
  @ApiModelProperty(value = "")
  
    public Long getTenantPictureId() {
    return tenantPictureId;
  }

  public void setTenantPictureId(Long tenantPictureId) {
    this.tenantPictureId = tenantPictureId;
  }

  public UserRepresentation type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @ApiModelProperty(value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRepresentation userRepresentation = (UserRepresentation) o;
    return Objects.equals(this.apps, userRepresentation.apps) &&
        Objects.equals(this.capabilities, userRepresentation.capabilities) &&
        Objects.equals(this.company, userRepresentation.company) &&
        Objects.equals(this.created, userRepresentation.created) &&
        Objects.equals(this.email, userRepresentation.email) &&
        Objects.equals(this.externalId, userRepresentation.externalId) &&
        Objects.equals(this.firstName, userRepresentation.firstName) &&
        Objects.equals(this.fullname, userRepresentation.fullname) &&
        Objects.equals(this.groups, userRepresentation.groups) &&
        Objects.equals(this.id, userRepresentation.id) &&
        Objects.equals(this.lastName, userRepresentation.lastName) &&
        Objects.equals(this.lastUpdate, userRepresentation.lastUpdate) &&
        Objects.equals(this.latestSyncTimeStamp, userRepresentation.latestSyncTimeStamp) &&
        Objects.equals(this.password, userRepresentation.password) &&
        Objects.equals(this.pictureId, userRepresentation.pictureId) &&
        Objects.equals(this.primaryGroup, userRepresentation.primaryGroup) &&
        Objects.equals(this.status, userRepresentation.status) &&
        Objects.equals(this.tenantId, userRepresentation.tenantId) &&
        Objects.equals(this.tenantName, userRepresentation.tenantName) &&
        Objects.equals(this.tenantPictureId, userRepresentation.tenantPictureId) &&
        Objects.equals(this.type, userRepresentation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, capabilities, company, created, email, externalId, firstName, fullname, groups, id, lastName, lastUpdate, latestSyncTimeStamp, password, pictureId, primaryGroup, status, tenantId, tenantName, tenantPictureId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRepresentation {\n");
    
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    latestSyncTimeStamp: ").append(toIndentedString(latestSyncTimeStamp)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
    sb.append("    primaryGroup: ").append(toIndentedString(primaryGroup)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    tenantPictureId: ").append(toIndentedString(tenantPictureId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
