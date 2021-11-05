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
 * IdentityLinkRepresentation
 */
@Validated


public class IdentityLinkRepresentation   {
  @JsonProperty("group")
  private String group = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("user")
  private String user = null;

  public IdentityLinkRepresentation group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   **/
  @ApiModelProperty(value = "")
  
    public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public IdentityLinkRepresentation type(String type) {
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

  public IdentityLinkRepresentation user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  @ApiModelProperty(value = "")
  
    public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityLinkRepresentation identityLinkRepresentation = (IdentityLinkRepresentation) o;
    return Objects.equals(this.group, identityLinkRepresentation.group) &&
        Objects.equals(this.type, identityLinkRepresentation.type) &&
        Objects.equals(this.user, identityLinkRepresentation.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, type, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityLinkRepresentation {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
