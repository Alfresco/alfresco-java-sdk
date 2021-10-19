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
import com.alfresco.activiti.preference.model.TypeIdResolver;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TypeDeserializer
 */
@Validated

public class TypeDeserializer   {
  @JsonProperty("propertyName")
  private String propertyName = null;

  @JsonProperty("typeIdResolver")
  private TypeIdResolver typeIdResolver = null;

  /**
   * Gets or Sets typeInclusion
   */
  public enum TypeInclusionEnum {
    EXISTING_PROPERTY("EXISTING_PROPERTY"),
    
    EXTERNAL_PROPERTY("EXTERNAL_PROPERTY"),
    
    PROPERTY("PROPERTY"),
    
    WRAPPER_ARRAY("WRAPPER_ARRAY"),
    
    WRAPPER_OBJECT("WRAPPER_OBJECT");

    private String value;

    TypeInclusionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeInclusionEnum fromValue(String text) {
      for (TypeInclusionEnum b : TypeInclusionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeInclusion")
  private TypeInclusionEnum typeInclusion = null;

  public TypeDeserializer propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Get propertyName
   * @return propertyName
  **/
  @ApiModelProperty(value = "")


  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public TypeDeserializer typeIdResolver(TypeIdResolver typeIdResolver) {
    this.typeIdResolver = typeIdResolver;
    return this;
  }

  /**
   * Get typeIdResolver
   * @return typeIdResolver
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TypeIdResolver getTypeIdResolver() {
    return typeIdResolver;
  }

  public void setTypeIdResolver(TypeIdResolver typeIdResolver) {
    this.typeIdResolver = typeIdResolver;
  }

  public TypeDeserializer typeInclusion(TypeInclusionEnum typeInclusion) {
    this.typeInclusion = typeInclusion;
    return this;
  }

  /**
   * Get typeInclusion
   * @return typeInclusion
  **/
  @ApiModelProperty(value = "")


  public TypeInclusionEnum getTypeInclusion() {
    return typeInclusion;
  }

  public void setTypeInclusion(TypeInclusionEnum typeInclusion) {
    this.typeInclusion = typeInclusion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeDeserializer typeDeserializer = (TypeDeserializer) o;
    return Objects.equals(this.propertyName, typeDeserializer.propertyName) &&
        Objects.equals(this.typeIdResolver, typeDeserializer.typeIdResolver) &&
        Objects.equals(this.typeInclusion, typeDeserializer.typeInclusion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, typeIdResolver, typeInclusion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDeserializer {\n");
    
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    typeIdResolver: ").append(toIndentedString(typeIdResolver)).append("\n");
    sb.append("    typeInclusion: ").append(toIndentedString(typeInclusion)).append("\n");
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

