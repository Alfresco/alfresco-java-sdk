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
package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityGroupModel
 */
@Validated

public class SecurityGroupModel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("groupType")
  private String groupType = null;

  @JsonProperty("inUse")
  private Boolean inUse = null;

  public SecurityGroupModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityGroupModel groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(value = "")


  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public SecurityGroupModel groupType(String groupType) {
    this.groupType = groupType;
    return this;
  }

  /**
   * Can be one of the following: HIERARCHICAL, USER_REQUIRES_ALL, USER_REQUIRES_ANY
   * @return groupType
  **/
  @ApiModelProperty(value = "Can be one of the following: HIERARCHICAL, USER_REQUIRES_ALL, USER_REQUIRES_ANY")


  public String getGroupType() {
    return groupType;
  }

  public void setGroupType(String groupType) {
    this.groupType = groupType;
  }

  public SecurityGroupModel inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

  /**
   * Returns whether the group is in use or not.
   * @return inUse
  **/
  @ApiModelProperty(value = "Returns whether the group is in use or not.")


  public Boolean isInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupModel securityGroupModel = (SecurityGroupModel) o;
    return Objects.equals(this.id, securityGroupModel.id) &&
        Objects.equals(this.groupName, securityGroupModel.groupName) &&
        Objects.equals(this.groupType, securityGroupModel.groupType) &&
        Objects.equals(this.inUse, securityGroupModel.inUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupName, groupType, inUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
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

