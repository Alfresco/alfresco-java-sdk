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
import com.alfresco.activiti.preference.model.JsonDeserializerOfobject;
import com.alfresco.activiti.preference.model.ObjectIdReader;
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
 * JsonDeserializerOfobject
 */
@Validated


public class JsonDeserializerOfobject   {
  @JsonProperty("cachable")
  private Boolean cachable = null;

  @JsonProperty("delegatee")
  private JsonDeserializerOfobject delegatee = null;

  /**
   * Gets or Sets emptyAccessPattern
   */
  public enum EmptyAccessPatternEnum {
    ALWAYS_NULL("ALWAYS_NULL"),
    
    CONSTANT("CONSTANT"),
    
    DYNAMIC("DYNAMIC");

    private String value;

    EmptyAccessPatternEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EmptyAccessPatternEnum fromValue(String text) {
      for (EmptyAccessPatternEnum b : EmptyAccessPatternEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("emptyAccessPattern")
  private EmptyAccessPatternEnum emptyAccessPattern = null;

  @JsonProperty("emptyValue")
  private Object emptyValue = null;

  @JsonProperty("knownPropertyNames")
  @Valid
  private List<Object> knownPropertyNames = null;

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

  @JsonProperty("nullValue")
  private Object nullValue = null;

  @JsonProperty("objectIdReader")
  private ObjectIdReader objectIdReader = null;

  public JsonDeserializerOfobject cachable(Boolean cachable) {
    this.cachable = cachable;
    return this;
  }

  /**
   * Get cachable
   * @return cachable
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isCachable() {
    return cachable;
  }

  public void setCachable(Boolean cachable) {
    this.cachable = cachable;
  }

  public JsonDeserializerOfobject delegatee(JsonDeserializerOfobject delegatee) {
    this.delegatee = delegatee;
    return this;
  }

  /**
   * Get delegatee
   * @return delegatee
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JsonDeserializerOfobject getDelegatee() {
    return delegatee;
  }

  public void setDelegatee(JsonDeserializerOfobject delegatee) {
    this.delegatee = delegatee;
  }

  public JsonDeserializerOfobject emptyAccessPattern(EmptyAccessPatternEnum emptyAccessPattern) {
    this.emptyAccessPattern = emptyAccessPattern;
    return this;
  }

  /**
   * Get emptyAccessPattern
   * @return emptyAccessPattern
   **/
  @ApiModelProperty(value = "")
  
    public EmptyAccessPatternEnum getEmptyAccessPattern() {
    return emptyAccessPattern;
  }

  public void setEmptyAccessPattern(EmptyAccessPatternEnum emptyAccessPattern) {
    this.emptyAccessPattern = emptyAccessPattern;
  }

  public JsonDeserializerOfobject emptyValue(Object emptyValue) {
    this.emptyValue = emptyValue;
    return this;
  }

  /**
   * Get emptyValue
   * @return emptyValue
   **/
  @ApiModelProperty(value = "")
  
    public Object getEmptyValue() {
    return emptyValue;
  }

  public void setEmptyValue(Object emptyValue) {
    this.emptyValue = emptyValue;
  }

  public JsonDeserializerOfobject knownPropertyNames(List<Object> knownPropertyNames) {
    this.knownPropertyNames = knownPropertyNames;
    return this;
  }

  public JsonDeserializerOfobject addKnownPropertyNamesItem(Object knownPropertyNamesItem) {
    if (this.knownPropertyNames == null) {
      this.knownPropertyNames = new ArrayList<>();
    }
    this.knownPropertyNames.add(knownPropertyNamesItem);
    return this;
  }

  /**
   * Get knownPropertyNames
   * @return knownPropertyNames
   **/
  @ApiModelProperty(value = "")
  
    public List<Object> getKnownPropertyNames() {
    return knownPropertyNames;
  }

  public void setKnownPropertyNames(List<Object> knownPropertyNames) {
    this.knownPropertyNames = knownPropertyNames;
  }

  public JsonDeserializerOfobject nullAccessPattern(NullAccessPatternEnum nullAccessPattern) {
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

  public JsonDeserializerOfobject nullValue(Object nullValue) {
    this.nullValue = nullValue;
    return this;
  }

  /**
   * Get nullValue
   * @return nullValue
   **/
  @ApiModelProperty(value = "")
  
    public Object getNullValue() {
    return nullValue;
  }

  public void setNullValue(Object nullValue) {
    this.nullValue = nullValue;
  }

  public JsonDeserializerOfobject objectIdReader(ObjectIdReader objectIdReader) {
    this.objectIdReader = objectIdReader;
    return this;
  }

  /**
   * Get objectIdReader
   * @return objectIdReader
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ObjectIdReader getObjectIdReader() {
    return objectIdReader;
  }

  public void setObjectIdReader(ObjectIdReader objectIdReader) {
    this.objectIdReader = objectIdReader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonDeserializerOfobject jsonDeserializerOfobject = (JsonDeserializerOfobject) o;
    return Objects.equals(this.cachable, jsonDeserializerOfobject.cachable) &&
        Objects.equals(this.delegatee, jsonDeserializerOfobject.delegatee) &&
        Objects.equals(this.emptyAccessPattern, jsonDeserializerOfobject.emptyAccessPattern) &&
        Objects.equals(this.emptyValue, jsonDeserializerOfobject.emptyValue) &&
        Objects.equals(this.knownPropertyNames, jsonDeserializerOfobject.knownPropertyNames) &&
        Objects.equals(this.nullAccessPattern, jsonDeserializerOfobject.nullAccessPattern) &&
        Objects.equals(this.nullValue, jsonDeserializerOfobject.nullValue) &&
        Objects.equals(this.objectIdReader, jsonDeserializerOfobject.objectIdReader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachable, delegatee, emptyAccessPattern, emptyValue, knownPropertyNames, nullAccessPattern, nullValue, objectIdReader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonDeserializerOfobject {\n");
    
    sb.append("    cachable: ").append(toIndentedString(cachable)).append("\n");
    sb.append("    delegatee: ").append(toIndentedString(delegatee)).append("\n");
    sb.append("    emptyAccessPattern: ").append(toIndentedString(emptyAccessPattern)).append("\n");
    sb.append("    emptyValue: ").append(toIndentedString(emptyValue)).append("\n");
    sb.append("    knownPropertyNames: ").append(toIndentedString(knownPropertyNames)).append("\n");
    sb.append("    nullAccessPattern: ").append(toIndentedString(nullAccessPattern)).append("\n");
    sb.append("    nullValue: ").append(toIndentedString(nullValue)).append("\n");
    sb.append("    objectIdReader: ").append(toIndentedString(objectIdReader)).append("\n");
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
