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
package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Capabilities
 */
@Validated

public class Capabilities   {
  @JsonProperty("isAdmin")
  private Boolean isAdmin = null;

  @JsonProperty("isGuest")
  private Boolean isGuest = null;

  @JsonProperty("isMutable")
  private Boolean isMutable = null;

  public Capabilities isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Get isAdmin
   * @return isAdmin
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public Capabilities isGuest(Boolean isGuest) {
    this.isGuest = isGuest;
    return this;
  }

  /**
   * Get isGuest
   * @return isGuest
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsGuest() {
    return isGuest;
  }

  public void setIsGuest(Boolean isGuest) {
    this.isGuest = isGuest;
  }

  public Capabilities isMutable(Boolean isMutable) {
    this.isMutable = isMutable;
    return this;
  }

  /**
   * Get isMutable
   * @return isMutable
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsMutable() {
    return isMutable;
  }

  public void setIsMutable(Boolean isMutable) {
    this.isMutable = isMutable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capabilities capabilities = (Capabilities) o;
    return Objects.equals(this.isAdmin, capabilities.isAdmin) &&
        Objects.equals(this.isGuest, capabilities.isGuest) &&
        Objects.equals(this.isMutable, capabilities.isMutable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAdmin, isGuest, isMutable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capabilities {\n");
    
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isGuest: ").append(toIndentedString(isGuest)).append("\n");
    sb.append("    isMutable: ").append(toIndentedString(isMutable)).append("\n");
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

