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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.AuditLogFormDataRepresentation;
import org.alfresco.activiti.model.CommentAuditInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskAuditInfoRepresentation
 */
@Validated

public class TaskAuditInfoRepresentation   {
  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("comments")
  @Valid
  private List<CommentAuditInfo> comments = null;

  @JsonProperty("endTime")
  private String endTime = null;

  @JsonProperty("formData")
  @Valid
  private List<AuditLogFormDataRepresentation> formData = null;

  @JsonProperty("processDefinitionName")
  private String processDefinitionName = null;

  @JsonProperty("processDefinitionVersion")
  private Integer processDefinitionVersion = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("selectedOutcome")
  private String selectedOutcome = null;

  @JsonProperty("startTime")
  private String startTime = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("taskName")
  private String taskName = null;

  public TaskAuditInfoRepresentation assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")


  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public TaskAuditInfoRepresentation comments(List<CommentAuditInfo> comments) {
    this.comments = comments;
    return this;
  }

  public TaskAuditInfoRepresentation addCommentsItem(CommentAuditInfo commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CommentAuditInfo> getComments() {
    return comments;
  }

  public void setComments(List<CommentAuditInfo> comments) {
    this.comments = comments;
  }

  public TaskAuditInfoRepresentation endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public TaskAuditInfoRepresentation formData(List<AuditLogFormDataRepresentation> formData) {
    this.formData = formData;
    return this;
  }

  public TaskAuditInfoRepresentation addFormDataItem(AuditLogFormDataRepresentation formDataItem) {
    if (this.formData == null) {
      this.formData = new ArrayList<>();
    }
    this.formData.add(formDataItem);
    return this;
  }

  /**
   * Get formData
   * @return formData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AuditLogFormDataRepresentation> getFormData() {
    return formData;
  }

  public void setFormData(List<AuditLogFormDataRepresentation> formData) {
    this.formData = formData;
  }

  public TaskAuditInfoRepresentation processDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
    return this;
  }

  /**
   * Get processDefinitionName
   * @return processDefinitionName
  **/
  @ApiModelProperty(value = "")


  public String getProcessDefinitionName() {
    return processDefinitionName;
  }

  public void setProcessDefinitionName(String processDefinitionName) {
    this.processDefinitionName = processDefinitionName;
  }

  public TaskAuditInfoRepresentation processDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
    return this;
  }

  /**
   * Get processDefinitionVersion
   * @return processDefinitionVersion
  **/
  @ApiModelProperty(value = "")


  public Integer getProcessDefinitionVersion() {
    return processDefinitionVersion;
  }

  public void setProcessDefinitionVersion(Integer processDefinitionVersion) {
    this.processDefinitionVersion = processDefinitionVersion;
  }

  public TaskAuditInfoRepresentation processInstanceId(String processInstanceId) {
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

  public TaskAuditInfoRepresentation selectedOutcome(String selectedOutcome) {
    this.selectedOutcome = selectedOutcome;
    return this;
  }

  /**
   * Get selectedOutcome
   * @return selectedOutcome
  **/
  @ApiModelProperty(value = "")


  public String getSelectedOutcome() {
    return selectedOutcome;
  }

  public void setSelectedOutcome(String selectedOutcome) {
    this.selectedOutcome = selectedOutcome;
  }

  public TaskAuditInfoRepresentation startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public TaskAuditInfoRepresentation taskId(String taskId) {
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

  public TaskAuditInfoRepresentation taskName(String taskName) {
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
    TaskAuditInfoRepresentation taskAuditInfoRepresentation = (TaskAuditInfoRepresentation) o;
    return Objects.equals(this.assignee, taskAuditInfoRepresentation.assignee) &&
        Objects.equals(this.comments, taskAuditInfoRepresentation.comments) &&
        Objects.equals(this.endTime, taskAuditInfoRepresentation.endTime) &&
        Objects.equals(this.formData, taskAuditInfoRepresentation.formData) &&
        Objects.equals(this.processDefinitionName, taskAuditInfoRepresentation.processDefinitionName) &&
        Objects.equals(this.processDefinitionVersion, taskAuditInfoRepresentation.processDefinitionVersion) &&
        Objects.equals(this.processInstanceId, taskAuditInfoRepresentation.processInstanceId) &&
        Objects.equals(this.selectedOutcome, taskAuditInfoRepresentation.selectedOutcome) &&
        Objects.equals(this.startTime, taskAuditInfoRepresentation.startTime) &&
        Objects.equals(this.taskId, taskAuditInfoRepresentation.taskId) &&
        Objects.equals(this.taskName, taskAuditInfoRepresentation.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, comments, endTime, formData, processDefinitionName, processDefinitionVersion, processInstanceId, selectedOutcome, startTime, taskId, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskAuditInfoRepresentation {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    selectedOutcome: ").append(toIndentedString(selectedOutcome)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

