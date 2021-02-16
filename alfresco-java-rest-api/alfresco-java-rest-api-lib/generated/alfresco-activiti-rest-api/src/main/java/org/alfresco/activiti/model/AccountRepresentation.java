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
 * AccountRepresentation
 */
@Validated

public class AccountRepresentation   {
  @JsonProperty("authorizationUrl")
  private String authorizationUrl = null;

  @JsonProperty("authorized")
  private Boolean authorized = null;

  @JsonProperty("metaDataAllowed")
  private Boolean metaDataAllowed = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  public AccountRepresentation authorizationUrl(String authorizationUrl) {
    this.authorizationUrl = authorizationUrl;
    return this;
  }

  /**
   * Get authorizationUrl
   * @return authorizationUrl
  **/
  @ApiModelProperty(value = "")


  public String getAuthorizationUrl() {
    return authorizationUrl;
  }

  public void setAuthorizationUrl(String authorizationUrl) {
    this.authorizationUrl = authorizationUrl;
  }

  public AccountRepresentation authorized(Boolean authorized) {
    this.authorized = authorized;
    return this;
  }

  /**
   * Get authorized
   * @return authorized
  **/
  @ApiModelProperty(value = "")


  public Boolean isAuthorized() {
    return authorized;
  }

  public void setAuthorized(Boolean authorized) {
    this.authorized = authorized;
  }

  public AccountRepresentation metaDataAllowed(Boolean metaDataAllowed) {
    this.metaDataAllowed = metaDataAllowed;
    return this;
  }

  /**
   * Get metaDataAllowed
   * @return metaDataAllowed
  **/
  @ApiModelProperty(value = "")


  public Boolean isMetaDataAllowed() {
    return metaDataAllowed;
  }

  public void setMetaDataAllowed(Boolean metaDataAllowed) {
    this.metaDataAllowed = metaDataAllowed;
  }

  public AccountRepresentation name(String name) {
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

  public AccountRepresentation serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  **/
  @ApiModelProperty(value = "")


  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRepresentation accountRepresentation = (AccountRepresentation) o;
    return Objects.equals(this.authorizationUrl, accountRepresentation.authorizationUrl) &&
        Objects.equals(this.authorized, accountRepresentation.authorized) &&
        Objects.equals(this.metaDataAllowed, accountRepresentation.metaDataAllowed) &&
        Objects.equals(this.name, accountRepresentation.name) &&
        Objects.equals(this.serviceId, accountRepresentation.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationUrl, authorized, metaDataAllowed, name, serviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRepresentation {\n");
    
    sb.append("    authorizationUrl: ").append(toIndentedString(authorizationUrl)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    metaDataAllowed: ").append(toIndentedString(metaDataAllowed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

