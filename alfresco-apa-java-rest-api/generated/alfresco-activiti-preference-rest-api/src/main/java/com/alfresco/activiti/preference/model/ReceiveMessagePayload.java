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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReceiveMessagePayload
 */
@Validated

public class ReceiveMessagePayload   {
  @JsonProperty("correlationKey")
  private String correlationKey = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("variables")
  private Object variables = null;

  public ReceiveMessagePayload correlationKey(String correlationKey) {
    this.correlationKey = correlationKey;
    return this;
  }

  /**
   * Get correlationKey
   * @return correlationKey
  **/
  @ApiModelProperty(value = "")


  public String getCorrelationKey() {
    return correlationKey;
  }

  public void setCorrelationKey(String correlationKey) {
    this.correlationKey = correlationKey;
  }

  public ReceiveMessagePayload id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReceiveMessagePayload name(String name) {
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

  public ReceiveMessagePayload variables(Object variables) {
    this.variables = variables;
    return this;
  }

  /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")


  public Object getVariables() {
    return variables;
  }

  public void setVariables(Object variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiveMessagePayload receiveMessagePayload = (ReceiveMessagePayload) o;
    return Objects.equals(this.correlationKey, receiveMessagePayload.correlationKey) &&
        Objects.equals(this.id, receiveMessagePayload.id) &&
        Objects.equals(this.name, receiveMessagePayload.name) &&
        Objects.equals(this.variables, receiveMessagePayload.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correlationKey, id, name, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiveMessagePayload {\n");
    
    sb.append("    correlationKey: ").append(toIndentedString(correlationKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

