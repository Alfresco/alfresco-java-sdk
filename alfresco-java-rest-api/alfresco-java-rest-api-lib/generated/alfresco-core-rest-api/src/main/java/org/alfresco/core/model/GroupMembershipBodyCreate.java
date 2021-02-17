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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GroupMembershipBodyCreate
 */
@Validated

public class GroupMembershipBodyCreate   {
  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets memberType
   */
  public enum MemberTypeEnum {
    GROUP("GROUP"),
    
    PERSON("PERSON");

    private String value;

    MemberTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MemberTypeEnum fromValue(String text) {
      for (MemberTypeEnum b : MemberTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("memberType")
  private MemberTypeEnum memberType = null;

  public GroupMembershipBodyCreate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GroupMembershipBodyCreate memberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
    return this;
  }

  /**
   * Get memberType
   * @return memberType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public MemberTypeEnum getMemberType() {
    return memberType;
  }

  public void setMemberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMembershipBodyCreate groupMembershipBodyCreate = (GroupMembershipBodyCreate) o;
    return Objects.equals(this.id, groupMembershipBodyCreate.id) &&
        Objects.equals(this.memberType, groupMembershipBodyCreate.memberType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, memberType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMembershipBodyCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
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

