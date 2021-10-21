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
package com.alfresco.activiti.preference.model;

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
 * TypeIdResolver
 */
@Validated


public class TypeIdResolver   {
  @JsonProperty("descForKnownTypeIds")
  private String descForKnownTypeIds = null;

  /**
   * Gets or Sets mechanism
   */
  public enum MechanismEnum {
    CLASS("CLASS"),
    
    CUSTOM("CUSTOM"),
    
    DEDUCTION("DEDUCTION"),
    
    MINIMAL_CLASS("MINIMAL_CLASS"),
    
    NAME("NAME"),
    
    NONE("NONE");

    private String value;

    MechanismEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MechanismEnum fromValue(String text) {
      for (MechanismEnum b : MechanismEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("mechanism")
  private MechanismEnum mechanism = null;

  public TypeIdResolver descForKnownTypeIds(String descForKnownTypeIds) {
    this.descForKnownTypeIds = descForKnownTypeIds;
    return this;
  }

  /**
   * Get descForKnownTypeIds
   * @return descForKnownTypeIds
   **/
  @ApiModelProperty(value = "")
  
    public String getDescForKnownTypeIds() {
    return descForKnownTypeIds;
  }

  public void setDescForKnownTypeIds(String descForKnownTypeIds) {
    this.descForKnownTypeIds = descForKnownTypeIds;
  }

  public TypeIdResolver mechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
    return this;
  }

  /**
   * Get mechanism
   * @return mechanism
   **/
  @ApiModelProperty(value = "")
  
    public MechanismEnum getMechanism() {
    return mechanism;
  }

  public void setMechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeIdResolver typeIdResolver = (TypeIdResolver) o;
    return Objects.equals(this.descForKnownTypeIds, typeIdResolver.descForKnownTypeIds) &&
        Objects.equals(this.mechanism, typeIdResolver.mechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descForKnownTypeIds, mechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeIdResolver {\n");
    
    sb.append("    descForKnownTypeIds: ").append(toIndentedString(descForKnownTypeIds)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
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
