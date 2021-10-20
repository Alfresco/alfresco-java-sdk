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
package com.alfresco.activiti.runtime.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessDefinitionUserTask
 */
@Validated


public class ProcessDefinitionUserTask   {
  @JsonProperty("taskDocumentation")
  private String taskDocumentation = null;

  @JsonProperty("taskName")
  private String taskName = null;

  public ProcessDefinitionUserTask taskDocumentation(String taskDocumentation) {
    this.taskDocumentation = taskDocumentation;
    return this;
  }

  /**
   * Get taskDocumentation
   * @return taskDocumentation
   **/
  @ApiModelProperty(value = "")
  
    public String getTaskDocumentation() {
    return taskDocumentation;
  }

  public void setTaskDocumentation(String taskDocumentation) {
    this.taskDocumentation = taskDocumentation;
  }

  public ProcessDefinitionUserTask taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

  /**
   * Get taskName
   * @return taskName
   **/
  @ApiModelProperty(value = "")
  
    public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionUserTask processDefinitionUserTask = (ProcessDefinitionUserTask) o;
    return Objects.equals(this.taskDocumentation, processDefinitionUserTask.taskDocumentation) &&
        Objects.equals(this.taskName, processDefinitionUserTask.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskDocumentation, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionUserTask {\n");
    
    sb.append("    taskDocumentation: ").append(toIndentedString(taskDocumentation)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
