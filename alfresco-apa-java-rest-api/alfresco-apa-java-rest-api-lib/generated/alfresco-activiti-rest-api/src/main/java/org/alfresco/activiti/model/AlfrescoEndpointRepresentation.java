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
 * AlfrescoEndpointRepresentation
 */
@Validated


public class AlfrescoEndpointRepresentation   {
  @JsonProperty("accountUsername")
  private String accountUsername = null;

  @JsonProperty("alfrescoTenantId")
  private String alfrescoTenantId = null;

  @JsonProperty("authenticationType")
  private String authenticationType = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("repositoryUrl")
  private String repositoryUrl = null;

  @JsonProperty("secret")
  private String secret = null;

  @JsonProperty("shareUrl")
  private String shareUrl = null;

  @JsonProperty("sitesFolder")
  private String sitesFolder = null;

  @JsonProperty("tenantId")
  private Long tenantId = null;

  @JsonProperty("version")
  private String version = null;

  public AlfrescoEndpointRepresentation accountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
    return this;
  }

  /**
   * Get accountUsername
   * @return accountUsername
   **/
  @ApiModelProperty(value = "")
  
    public String getAccountUsername() {
    return accountUsername;
  }

  public void setAccountUsername(String accountUsername) {
    this.accountUsername = accountUsername;
  }

  public AlfrescoEndpointRepresentation alfrescoTenantId(String alfrescoTenantId) {
    this.alfrescoTenantId = alfrescoTenantId;
    return this;
  }

  /**
   * Get alfrescoTenantId
   * @return alfrescoTenantId
   **/
  @ApiModelProperty(value = "")
  
    public String getAlfrescoTenantId() {
    return alfrescoTenantId;
  }

  public void setAlfrescoTenantId(String alfrescoTenantId) {
    this.alfrescoTenantId = alfrescoTenantId;
  }

  public AlfrescoEndpointRepresentation authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  /**
   * Get authenticationType
   * @return authenticationType
   **/
  @ApiModelProperty(value = "")
  
    public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  public AlfrescoEndpointRepresentation created(OffsetDateTime created) {
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

  public AlfrescoEndpointRepresentation id(Long id) {
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

  public AlfrescoEndpointRepresentation lastUpdated(OffsetDateTime lastUpdated) {
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

  public AlfrescoEndpointRepresentation name(String name) {
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

  public AlfrescoEndpointRepresentation repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

  /**
   * Get repositoryUrl
   * @return repositoryUrl
   **/
  @ApiModelProperty(value = "")
  
    public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  public AlfrescoEndpointRepresentation secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Get secret
   * @return secret
   **/
  @ApiModelProperty(value = "")
  
    public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public AlfrescoEndpointRepresentation shareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
    return this;
  }

  /**
   * Get shareUrl
   * @return shareUrl
   **/
  @ApiModelProperty(value = "")
  
    public String getShareUrl() {
    return shareUrl;
  }

  public void setShareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
  }

  public AlfrescoEndpointRepresentation sitesFolder(String sitesFolder) {
    this.sitesFolder = sitesFolder;
    return this;
  }

  /**
   * Get sitesFolder
   * @return sitesFolder
   **/
  @ApiModelProperty(value = "")
  
    public String getSitesFolder() {
    return sitesFolder;
  }

  public void setSitesFolder(String sitesFolder) {
    this.sitesFolder = sitesFolder;
  }

  public AlfrescoEndpointRepresentation tenantId(Long tenantId) {
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

  public AlfrescoEndpointRepresentation version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @ApiModelProperty(value = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
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
    AlfrescoEndpointRepresentation alfrescoEndpointRepresentation = (AlfrescoEndpointRepresentation) o;
    return Objects.equals(this.accountUsername, alfrescoEndpointRepresentation.accountUsername) &&
        Objects.equals(this.alfrescoTenantId, alfrescoEndpointRepresentation.alfrescoTenantId) &&
        Objects.equals(this.authenticationType, alfrescoEndpointRepresentation.authenticationType) &&
        Objects.equals(this.created, alfrescoEndpointRepresentation.created) &&
        Objects.equals(this.id, alfrescoEndpointRepresentation.id) &&
        Objects.equals(this.lastUpdated, alfrescoEndpointRepresentation.lastUpdated) &&
        Objects.equals(this.name, alfrescoEndpointRepresentation.name) &&
        Objects.equals(this.repositoryUrl, alfrescoEndpointRepresentation.repositoryUrl) &&
        Objects.equals(this.secret, alfrescoEndpointRepresentation.secret) &&
        Objects.equals(this.shareUrl, alfrescoEndpointRepresentation.shareUrl) &&
        Objects.equals(this.sitesFolder, alfrescoEndpointRepresentation.sitesFolder) &&
        Objects.equals(this.tenantId, alfrescoEndpointRepresentation.tenantId) &&
        Objects.equals(this.version, alfrescoEndpointRepresentation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountUsername, alfrescoTenantId, authenticationType, created, id, lastUpdated, name, repositoryUrl, secret, shareUrl, sitesFolder, tenantId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlfrescoEndpointRepresentation {\n");
    
    sb.append("    accountUsername: ").append(toIndentedString(accountUsername)).append("\n");
    sb.append("    alfrescoTenantId: ").append(toIndentedString(alfrescoTenantId)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    shareUrl: ").append(toIndentedString(shareUrl)).append("\n");
    sb.append("    sitesFolder: ").append(toIndentedString(sitesFolder)).append("\n");
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
