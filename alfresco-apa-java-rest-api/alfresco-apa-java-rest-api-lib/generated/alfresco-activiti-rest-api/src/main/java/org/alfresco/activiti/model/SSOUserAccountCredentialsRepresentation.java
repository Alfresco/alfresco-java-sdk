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
 * SSOUserAccountCredentialsRepresentation
 */
@Validated


public class SSOUserAccountCredentialsRepresentation   {
  @JsonProperty("authenticationURL")
  private String authenticationURL = null;

  @JsonProperty("expireDate")
  private OffsetDateTime expireDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ownerEmail")
  private String ownerEmail = null;

  @JsonProperty("repositoryId")
  private Long repositoryId = null;

  public SSOUserAccountCredentialsRepresentation authenticationURL(String authenticationURL) {
    this.authenticationURL = authenticationURL;
    return this;
  }

  /**
   * Get authenticationURL
   * @return authenticationURL
   **/
  @ApiModelProperty(value = "")
  
    public String getAuthenticationURL() {
    return authenticationURL;
  }

  public void setAuthenticationURL(String authenticationURL) {
    this.authenticationURL = authenticationURL;
  }

  public SSOUserAccountCredentialsRepresentation expireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
    return this;
  }

  /**
   * Get expireDate
   * @return expireDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(OffsetDateTime expireDate) {
    this.expireDate = expireDate;
  }

  public SSOUserAccountCredentialsRepresentation name(String name) {
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

  public SSOUserAccountCredentialsRepresentation ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

  /**
   * Get ownerEmail
   * @return ownerEmail
   **/
  @ApiModelProperty(value = "")
  
    public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public SSOUserAccountCredentialsRepresentation repositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * Get repositoryId
   * @return repositoryId
   **/
  @ApiModelProperty(value = "")
  
    public Long getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SSOUserAccountCredentialsRepresentation ssOUserAccountCredentialsRepresentation = (SSOUserAccountCredentialsRepresentation) o;
    return Objects.equals(this.authenticationURL, ssOUserAccountCredentialsRepresentation.authenticationURL) &&
        Objects.equals(this.expireDate, ssOUserAccountCredentialsRepresentation.expireDate) &&
        Objects.equals(this.name, ssOUserAccountCredentialsRepresentation.name) &&
        Objects.equals(this.ownerEmail, ssOUserAccountCredentialsRepresentation.ownerEmail) &&
        Objects.equals(this.repositoryId, ssOUserAccountCredentialsRepresentation.repositoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationURL, expireDate, name, ownerEmail, repositoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSOUserAccountCredentialsRepresentation {\n");
    
    sb.append("    authenticationURL: ").append(toIndentedString(authenticationURL)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
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