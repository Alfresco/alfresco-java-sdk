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
package org.alfresco.activiti.form.model;

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
 * NullValueProvider
 */
@Validated


public class NullValueProvider   {
  /**
   * Gets or Sets nullAccessPattern
   */
  public enum NullAccessPatternEnum {
    ALWAYS_NULL("ALWAYS_NULL"),
    
    CONSTANT("CONSTANT"),
    
    DYNAMIC("DYNAMIC");

    private String value;

    NullAccessPatternEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NullAccessPatternEnum fromValue(String text) {
      for (NullAccessPatternEnum b : NullAccessPatternEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("nullAccessPattern")
  private NullAccessPatternEnum nullAccessPattern = null;

  public NullValueProvider nullAccessPattern(NullAccessPatternEnum nullAccessPattern) {
    this.nullAccessPattern = nullAccessPattern;
    return this;
  }

  /**
   * Get nullAccessPattern
   * @return nullAccessPattern
   **/
  @ApiModelProperty(value = "")
  
    public NullAccessPatternEnum getNullAccessPattern() {
    return nullAccessPattern;
  }

  public void setNullAccessPattern(NullAccessPatternEnum nullAccessPattern) {
    this.nullAccessPattern = nullAccessPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NullValueProvider nullValueProvider = (NullValueProvider) o;
    return Objects.equals(this.nullAccessPattern, nullValueProvider.nullAccessPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nullAccessPattern);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullValueProvider {\n");
    
    sb.append("    nullAccessPattern: ").append(toIndentedString(nullAccessPattern)).append("\n");
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
