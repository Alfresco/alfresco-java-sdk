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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessDefinitionVariable
 */
@Validated


public class ProcessDefinitionVariable   {
  @JsonProperty("variableName")
  private String variableName = null;

  @JsonProperty("variableType")
  private String variableType = null;

  public ProcessDefinitionVariable variableName(String variableName) {
    this.variableName = variableName;
    return this;
  }

  /**
   * Get variableName
   * @return variableName
   **/
  @ApiModelProperty(value = "")
  
    public String getVariableName() {
    return variableName;
  }

  public void setVariableName(String variableName) {
    this.variableName = variableName;
  }

  public ProcessDefinitionVariable variableType(String variableType) {
    this.variableType = variableType;
    return this;
  }

  /**
   * Get variableType
   * @return variableType
   **/
  @ApiModelProperty(value = "")
  
    public String getVariableType() {
    return variableType;
  }

  public void setVariableType(String variableType) {
    this.variableType = variableType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionVariable processDefinitionVariable = (ProcessDefinitionVariable) o;
    return Objects.equals(this.variableName, processDefinitionVariable.variableName) &&
        Objects.equals(this.variableType, processDefinitionVariable.variableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variableName, variableType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionVariable {\n");
    
    sb.append("    variableName: ").append(toIndentedString(variableName)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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
