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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SaveFormRepresentation
 */
@Validated

public class SaveFormRepresentation   {
  @JsonProperty("metadata")
  private Object metadata = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("values")
  private Object values = null;

  public SaveFormRepresentation metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")


  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public SaveFormRepresentation processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Get processDefinitionKey
   * @return processDefinitionKey
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public SaveFormRepresentation processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Get processInstanceId
   * @return processInstanceId
  **/
  @ApiModelProperty(value = "")


  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public SaveFormRepresentation taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")


  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public SaveFormRepresentation values(Object values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")


  public Object getValues() {
    return values;
  }

  public void setValues(Object values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveFormRepresentation saveFormRepresentation = (SaveFormRepresentation) o;
    return Objects.equals(this.metadata, saveFormRepresentation.metadata) &&
        Objects.equals(this.processDefinitionKey, saveFormRepresentation.processDefinitionKey) &&
        Objects.equals(this.processInstanceId, saveFormRepresentation.processInstanceId) &&
        Objects.equals(this.taskId, saveFormRepresentation.taskId) &&
        Objects.equals(this.values, saveFormRepresentation.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, processDefinitionKey, processInstanceId, taskId, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveFormRepresentation {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

