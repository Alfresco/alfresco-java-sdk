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
import com.alfresco.activiti.form.model.JavaType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TypeBindings
 */
@Validated


public class TypeBindings   {
  @JsonProperty("empty")
  private Boolean empty = null;

  @JsonProperty("typeParameters")
  @Valid
  private List<JavaType> typeParameters = null;

  public TypeBindings empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public TypeBindings typeParameters(List<JavaType> typeParameters) {
    this.typeParameters = typeParameters;
    return this;
  }

  public TypeBindings addTypeParametersItem(JavaType typeParametersItem) {
    if (this.typeParameters == null) {
      this.typeParameters = new ArrayList<>();
    }
    this.typeParameters.add(typeParametersItem);
    return this;
  }

  /**
   * Get typeParameters
   * @return typeParameters
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<JavaType> getTypeParameters() {
    return typeParameters;
  }

  public void setTypeParameters(List<JavaType> typeParameters) {
    this.typeParameters = typeParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeBindings typeBindings = (TypeBindings) o;
    return Objects.equals(this.empty, typeBindings.empty) &&
        Objects.equals(this.typeParameters, typeBindings.typeParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, typeParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeBindings {\n");
    
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    typeParameters: ").append(toIndentedString(typeParameters)).append("\n");
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
