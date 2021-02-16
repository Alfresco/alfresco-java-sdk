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
package org.alfresco.activiti.model;

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
 * QueryVariable
 */
@Validated

public class QueryVariable   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("operation")
  private String operation = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private Object value = null;

  /**
   * Gets or Sets variableOperation
   */
  public enum VariableOperationEnum {
    EQUALS("EQUALS"),
    
    NOT_EQUALS("NOT_EQUALS"),
    
    EQUALS_IGNORE_CASE("EQUALS_IGNORE_CASE"),
    
    NOT_EQUALS_IGNORE_CASE("NOT_EQUALS_IGNORE_CASE"),
    
    LIKE("LIKE"),
    
    LIKE_IGNORE_CASE("LIKE_IGNORE_CASE"),
    
    GREATER_THAN("GREATER_THAN"),
    
    GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
    
    LESS_THAN("LESS_THAN"),
    
    LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS");

    private String value;

    VariableOperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VariableOperationEnum fromValue(String text) {
      for (VariableOperationEnum b : VariableOperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("variableOperation")
  private VariableOperationEnum variableOperation = null;

  public QueryVariable name(String name) {
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

  public QueryVariable operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")


  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public QueryVariable type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QueryVariable value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public QueryVariable variableOperation(VariableOperationEnum variableOperation) {
    this.variableOperation = variableOperation;
    return this;
  }

  /**
   * Get variableOperation
   * @return variableOperation
  **/
  @ApiModelProperty(value = "")


  public VariableOperationEnum getVariableOperation() {
    return variableOperation;
  }

  public void setVariableOperation(VariableOperationEnum variableOperation) {
    this.variableOperation = variableOperation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryVariable queryVariable = (QueryVariable) o;
    return Objects.equals(this.name, queryVariable.name) &&
        Objects.equals(this.operation, queryVariable.operation) &&
        Objects.equals(this.type, queryVariable.type) &&
        Objects.equals(this.value, queryVariable.value) &&
        Objects.equals(this.variableOperation, queryVariable.variableOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operation, type, value, variableOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryVariable {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    variableOperation: ").append(toIndentedString(variableOperation)).append("\n");
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

