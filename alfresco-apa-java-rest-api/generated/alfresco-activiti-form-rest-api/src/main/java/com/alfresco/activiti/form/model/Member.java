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
package com.alfresco.activiti.form.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Member
 */
@Validated

public class Member   {
  @JsonProperty("modifiers")
  private Integer modifiers = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("synthetic")
  private Boolean synthetic = null;

  public Member modifiers(Integer modifiers) {
    this.modifiers = modifiers;
    return this;
  }

  /**
   * Get modifiers
   * @return modifiers
  **/
  @ApiModelProperty(value = "")


  public Integer getModifiers() {
    return modifiers;
  }

  public void setModifiers(Integer modifiers) {
    this.modifiers = modifiers;
  }

  public Member name(String name) {
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

  public Member synthetic(Boolean synthetic) {
    this.synthetic = synthetic;
    return this;
  }

  /**
   * Get synthetic
   * @return synthetic
  **/
  @ApiModelProperty(value = "")


  public Boolean isSynthetic() {
    return synthetic;
  }

  public void setSynthetic(Boolean synthetic) {
    this.synthetic = synthetic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.modifiers, member.modifiers) &&
        Objects.equals(this.name, member.name) &&
        Objects.equals(this.synthetic, member.synthetic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiers, name, synthetic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("    modifiers: ").append(toIndentedString(modifiers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    synthetic: ").append(toIndentedString(synthetic)).append("\n");
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

