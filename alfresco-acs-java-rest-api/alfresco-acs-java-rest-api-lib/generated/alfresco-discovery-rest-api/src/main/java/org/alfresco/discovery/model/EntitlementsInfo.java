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
package org.alfresco.discovery.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EntitlementsInfo
 */
@Validated

public class EntitlementsInfo   {
  @JsonProperty("maxUsers")
  private Long maxUsers = null;

  @JsonProperty("maxDocs")
  private Long maxDocs = null;

  @JsonProperty("isClusterEnabled")
  private Boolean isClusterEnabled = false;

  @JsonProperty("isCryptodocEnabled")
  private Boolean isCryptodocEnabled = false;

  public EntitlementsInfo maxUsers(Long maxUsers) {
    this.maxUsers = maxUsers;
    return this;
  }

  /**
   * Get maxUsers
   * @return maxUsers
  **/
  @ApiModelProperty(value = "")


  public Long getMaxUsers() {
    return maxUsers;
  }

  public void setMaxUsers(Long maxUsers) {
    this.maxUsers = maxUsers;
  }

  public EntitlementsInfo maxDocs(Long maxDocs) {
    this.maxDocs = maxDocs;
    return this;
  }

  /**
   * Get maxDocs
   * @return maxDocs
  **/
  @ApiModelProperty(value = "")


  public Long getMaxDocs() {
    return maxDocs;
  }

  public void setMaxDocs(Long maxDocs) {
    this.maxDocs = maxDocs;
  }

  public EntitlementsInfo isClusterEnabled(Boolean isClusterEnabled) {
    this.isClusterEnabled = isClusterEnabled;
    return this;
  }

  /**
   * Get isClusterEnabled
   * @return isClusterEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsClusterEnabled() {
    return isClusterEnabled;
  }

  public void setIsClusterEnabled(Boolean isClusterEnabled) {
    this.isClusterEnabled = isClusterEnabled;
  }

  public EntitlementsInfo isCryptodocEnabled(Boolean isCryptodocEnabled) {
    this.isCryptodocEnabled = isCryptodocEnabled;
    return this;
  }

  /**
   * Get isCryptodocEnabled
   * @return isCryptodocEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsCryptodocEnabled() {
    return isCryptodocEnabled;
  }

  public void setIsCryptodocEnabled(Boolean isCryptodocEnabled) {
    this.isCryptodocEnabled = isCryptodocEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementsInfo entitlementsInfo = (EntitlementsInfo) o;
    return Objects.equals(this.maxUsers, entitlementsInfo.maxUsers) &&
        Objects.equals(this.maxDocs, entitlementsInfo.maxDocs) &&
        Objects.equals(this.isClusterEnabled, entitlementsInfo.isClusterEnabled) &&
        Objects.equals(this.isCryptodocEnabled, entitlementsInfo.isCryptodocEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUsers, maxDocs, isClusterEnabled, isCryptodocEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementsInfo {\n");
    
    sb.append("    maxUsers: ").append(toIndentedString(maxUsers)).append("\n");
    sb.append("    maxDocs: ").append(toIndentedString(maxDocs)).append("\n");
    sb.append("    isClusterEnabled: ").append(toIndentedString(isClusterEnabled)).append("\n");
    sb.append("    isCryptodocEnabled: ").append(toIndentedString(isCryptodocEnabled)).append("\n");
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

