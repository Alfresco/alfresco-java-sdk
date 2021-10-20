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
package com.alfresco.activiti.query.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JobConfig
 */
@Validated


public class JobConfig   {
  @JsonProperty("async")
  private Boolean async = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("properties")
  private Object properties = null;

  public JobConfig async(Boolean async) {
    this.async = async;
    return this;
  }

  /**
   * Get async
   * @return async
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isAsync() {
    return async;
  }

  public void setAsync(Boolean async) {
    this.async = async;
  }

  public JobConfig name(String name) {
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

  public JobConfig properties(Object properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   **/
  @ApiModelProperty(value = "")
  
    public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobConfig jobConfig = (JobConfig) o;
    return Objects.equals(this.async, jobConfig.async) &&
        Objects.equals(this.name, jobConfig.name) &&
        Objects.equals(this.properties, jobConfig.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(async, name, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConfig {\n");
    
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
