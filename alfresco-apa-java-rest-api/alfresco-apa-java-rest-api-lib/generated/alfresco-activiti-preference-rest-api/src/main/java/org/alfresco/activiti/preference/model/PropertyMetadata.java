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
package org.alfresco.activiti.preference.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.activiti.preference.model.MergeInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PropertyMetadata
 */
@Validated


public class PropertyMetadata   {
  /**
   * Gets or Sets contentNulls
   */
  public enum ContentNullsEnum {
    AS_EMPTY("AS_EMPTY"),
    
    DEFAULT("DEFAULT"),
    
    FAIL("FAIL"),
    
    SET("SET"),
    
    SKIP("SKIP");

    private String value;

    ContentNullsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContentNullsEnum fromValue(String text) {
      for (ContentNullsEnum b : ContentNullsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("contentNulls")
  private ContentNullsEnum contentNulls = null;

  @JsonProperty("defaultValue")
  private String defaultValue = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("mergeInfo")
  private MergeInfo mergeInfo = null;

  @JsonProperty("required")
  private Boolean required = null;

  /**
   * Gets or Sets valueNulls
   */
  public enum ValueNullsEnum {
    AS_EMPTY("AS_EMPTY"),
    
    DEFAULT("DEFAULT"),
    
    FAIL("FAIL"),
    
    SET("SET"),
    
    SKIP("SKIP");

    private String value;

    ValueNullsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValueNullsEnum fromValue(String text) {
      for (ValueNullsEnum b : ValueNullsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("valueNulls")
  private ValueNullsEnum valueNulls = null;

  public PropertyMetadata contentNulls(ContentNullsEnum contentNulls) {
    this.contentNulls = contentNulls;
    return this;
  }

  /**
   * Get contentNulls
   * @return contentNulls
   **/
  @ApiModelProperty(value = "")
  
    public ContentNullsEnum getContentNulls() {
    return contentNulls;
  }

  public void setContentNulls(ContentNullsEnum contentNulls) {
    this.contentNulls = contentNulls;
  }

  public PropertyMetadata defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Get defaultValue
   * @return defaultValue
   **/
  @ApiModelProperty(value = "")
  
    public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public PropertyMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PropertyMetadata index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
   **/
  @ApiModelProperty(value = "")
  
    public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PropertyMetadata mergeInfo(MergeInfo mergeInfo) {
    this.mergeInfo = mergeInfo;
    return this;
  }

  /**
   * Get mergeInfo
   * @return mergeInfo
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MergeInfo getMergeInfo() {
    return mergeInfo;
  }

  public void setMergeInfo(MergeInfo mergeInfo) {
    this.mergeInfo = mergeInfo;
  }

  public PropertyMetadata required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public PropertyMetadata valueNulls(ValueNullsEnum valueNulls) {
    this.valueNulls = valueNulls;
    return this;
  }

  /**
   * Get valueNulls
   * @return valueNulls
   **/
  @ApiModelProperty(value = "")
  
    public ValueNullsEnum getValueNulls() {
    return valueNulls;
  }

  public void setValueNulls(ValueNullsEnum valueNulls) {
    this.valueNulls = valueNulls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyMetadata propertyMetadata = (PropertyMetadata) o;
    return Objects.equals(this.contentNulls, propertyMetadata.contentNulls) &&
        Objects.equals(this.defaultValue, propertyMetadata.defaultValue) &&
        Objects.equals(this.description, propertyMetadata.description) &&
        Objects.equals(this.index, propertyMetadata.index) &&
        Objects.equals(this.mergeInfo, propertyMetadata.mergeInfo) &&
        Objects.equals(this.required, propertyMetadata.required) &&
        Objects.equals(this.valueNulls, propertyMetadata.valueNulls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentNulls, defaultValue, description, index, mergeInfo, required, valueNulls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyMetadata {\n");
    
    sb.append("    contentNulls: ").append(toIndentedString(contentNulls)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    mergeInfo: ").append(toIndentedString(mergeInfo)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    valueNulls: ").append(toIndentedString(valueNulls)).append("\n");
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
