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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IdentityVariablesRepresentation
 */
@Validated

public class IdentityVariablesRepresentation   {
  @JsonProperty("realm")
  private String realm = null;

  @JsonProperty("url")
  private String url = null;

  public IdentityVariablesRepresentation realm(String realm) {
    this.realm = realm;
    return this;
  }

  /**
   * Get realm
   * @return realm
  **/
  @ApiModelProperty(value = "")


  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public IdentityVariablesRepresentation url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVariablesRepresentation identityVariablesRepresentation = (IdentityVariablesRepresentation) o;
    return Objects.equals(this.realm, identityVariablesRepresentation.realm) &&
        Objects.equals(this.url, identityVariablesRepresentation.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realm, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVariablesRepresentation {\n");
    
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

