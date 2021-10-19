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
package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Common query defaults
 */
@ApiModel(description = "Common query defaults")
@Validated

public class RequestDefaults   {
  @JsonProperty("textAttributes")
  @Valid
  private List<String> textAttributes = null;

  /**
   * The default way to combine query parts when AND or OR is not explicitly stated - includes ! - + one two three (one two three) 
   */
  public enum DefaultFTSOperatorEnum {
    AND("AND"),
    
    OR("OR");

    private String value;

    DefaultFTSOperatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DefaultFTSOperatorEnum fromValue(String text) {
      for (DefaultFTSOperatorEnum b : DefaultFTSOperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("defaultFTSOperator")
  private DefaultFTSOperatorEnum defaultFTSOperator = DefaultFTSOperatorEnum.AND;

  /**
   * The default way to combine query parts in field query groups when AND or OR is not explicitly stated - includes ! - + FIELD:(one two three) 
   */
  public enum DefaultFTSFieldOperatorEnum {
    AND("AND"),
    
    OR("OR");

    private String value;

    DefaultFTSFieldOperatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DefaultFTSFieldOperatorEnum fromValue(String text) {
      for (DefaultFTSFieldOperatorEnum b : DefaultFTSFieldOperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("defaultFTSFieldOperator")
  private DefaultFTSFieldOperatorEnum defaultFTSFieldOperator = DefaultFTSFieldOperatorEnum.AND;

  @JsonProperty("namespace")
  private String namespace = "cm";

  @JsonProperty("defaultFieldName")
  private String defaultFieldName = "TEXT";

  public RequestDefaults textAttributes(List<String> textAttributes) {
    this.textAttributes = textAttributes;
    return this;
  }

  public RequestDefaults addTextAttributesItem(String textAttributesItem) {
    if (this.textAttributes == null) {
      this.textAttributes = new ArrayList<>();
    }
    this.textAttributes.add(textAttributesItem);
    return this;
  }

  /**
   * A list of query fields/properties used to expand TEXT: queries. The default is cm:content. You could include all content properties using d:content or list all individual content properties or types. As more terms are included the query size, complexity, memory impact and query time will increase. 
   * @return textAttributes
  **/
  @ApiModelProperty(value = "A list of query fields/properties used to expand TEXT: queries. The default is cm:content. You could include all content properties using d:content or list all individual content properties or types. As more terms are included the query size, complexity, memory impact and query time will increase. ")


  public List<String> getTextAttributes() {
    return textAttributes;
  }

  public void setTextAttributes(List<String> textAttributes) {
    this.textAttributes = textAttributes;
  }

  public RequestDefaults defaultFTSOperator(DefaultFTSOperatorEnum defaultFTSOperator) {
    this.defaultFTSOperator = defaultFTSOperator;
    return this;
  }

  /**
   * The default way to combine query parts when AND or OR is not explicitly stated - includes ! - + one two three (one two three) 
   * @return defaultFTSOperator
  **/
  @ApiModelProperty(value = "The default way to combine query parts when AND or OR is not explicitly stated - includes ! - + one two three (one two three) ")


  public DefaultFTSOperatorEnum getDefaultFTSOperator() {
    return defaultFTSOperator;
  }

  public void setDefaultFTSOperator(DefaultFTSOperatorEnum defaultFTSOperator) {
    this.defaultFTSOperator = defaultFTSOperator;
  }

  public RequestDefaults defaultFTSFieldOperator(DefaultFTSFieldOperatorEnum defaultFTSFieldOperator) {
    this.defaultFTSFieldOperator = defaultFTSFieldOperator;
    return this;
  }

  /**
   * The default way to combine query parts in field query groups when AND or OR is not explicitly stated - includes ! - + FIELD:(one two three) 
   * @return defaultFTSFieldOperator
  **/
  @ApiModelProperty(value = "The default way to combine query parts in field query groups when AND or OR is not explicitly stated - includes ! - + FIELD:(one two three) ")


  public DefaultFTSFieldOperatorEnum getDefaultFTSFieldOperator() {
    return defaultFTSFieldOperator;
  }

  public void setDefaultFTSFieldOperator(DefaultFTSFieldOperatorEnum defaultFTSFieldOperator) {
    this.defaultFTSFieldOperator = defaultFTSFieldOperator;
  }

  public RequestDefaults namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The default name space to use if one is not provided
   * @return namespace
  **/
  @ApiModelProperty(value = "The default name space to use if one is not provided")


  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public RequestDefaults defaultFieldName(String defaultFieldName) {
    this.defaultFieldName = defaultFieldName;
    return this;
  }

  /**
   * Get defaultFieldName
   * @return defaultFieldName
  **/
  @ApiModelProperty(value = "")


  public String getDefaultFieldName() {
    return defaultFieldName;
  }

  public void setDefaultFieldName(String defaultFieldName) {
    this.defaultFieldName = defaultFieldName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDefaults requestDefaults = (RequestDefaults) o;
    return Objects.equals(this.textAttributes, requestDefaults.textAttributes) &&
        Objects.equals(this.defaultFTSOperator, requestDefaults.defaultFTSOperator) &&
        Objects.equals(this.defaultFTSFieldOperator, requestDefaults.defaultFTSFieldOperator) &&
        Objects.equals(this.namespace, requestDefaults.namespace) &&
        Objects.equals(this.defaultFieldName, requestDefaults.defaultFieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textAttributes, defaultFTSOperator, defaultFTSFieldOperator, namespace, defaultFieldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDefaults {\n");
    
    sb.append("    textAttributes: ").append(toIndentedString(textAttributes)).append("\n");
    sb.append("    defaultFTSOperator: ").append(toIndentedString(defaultFTSOperator)).append("\n");
    sb.append("    defaultFTSFieldOperator: ").append(toIndentedString(defaultFTSFieldOperator)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    defaultFieldName: ").append(toIndentedString(defaultFieldName)).append("\n");
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

