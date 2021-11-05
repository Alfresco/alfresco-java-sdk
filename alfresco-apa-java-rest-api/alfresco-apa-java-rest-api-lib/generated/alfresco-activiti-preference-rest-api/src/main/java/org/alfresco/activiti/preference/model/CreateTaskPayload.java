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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateTaskPayload
 */
@Validated


public class CreateTaskPayload   {
  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("candidateGroups")
  @Valid
  private List<String> candidateGroups = null;

  @JsonProperty("candidateUsers")
  @Valid
  private List<String> candidateUsers = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("formKey")
  private String formKey = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentTaskId")
  private String parentTaskId = null;

  /**
   * Gets or Sets payloadType
   */
  public enum PayloadTypeEnum {
    CREATETASKPAYLOAD("CreateTaskPayload");

    private String value;

    PayloadTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PayloadTypeEnum fromValue(String text) {
      for (PayloadTypeEnum b : PayloadTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("payloadType")
  private PayloadTypeEnum payloadType = null;

  @JsonProperty("priority")
  private Integer priority = null;

  public CreateTaskPayload assignee(String assignee) {
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

  public CreateTaskPayload candidateGroups(List<String> candidateGroups) {
    this.candidateGroups = candidateGroups;
    return this;
  }

  public CreateTaskPayload addCandidateGroupsItem(String candidateGroupsItem) {
    if (this.candidateGroups == null) {
      this.candidateGroups = new ArrayList<>();
    }
    this.candidateGroups.add(candidateGroupsItem);
    return this;
  }

  /**
   * Get candidateGroups
   * @return candidateGroups
   **/
  @ApiModelProperty(value = "")
  
    public List<String> getCandidateGroups() {
    return candidateGroups;
  }

  public void setCandidateGroups(List<String> candidateGroups) {
    this.candidateGroups = candidateGroups;
  }

  public CreateTaskPayload candidateUsers(List<String> candidateUsers) {
    this.candidateUsers = candidateUsers;
    return this;
  }

  public CreateTaskPayload addCandidateUsersItem(String candidateUsersItem) {
    if (this.candidateUsers == null) {
      this.candidateUsers = new ArrayList<>();
    }
    this.candidateUsers.add(candidateUsersItem);
    return this;
  }

  /**
   * Get candidateUsers
   * @return candidateUsers
   **/
  @ApiModelProperty(value = "")
  
    public List<String> getCandidateUsers() {
    return candidateUsers;
  }

  public void setCandidateUsers(List<String> candidateUsers) {
    this.candidateUsers = candidateUsers;
  }

  public CreateTaskPayload description(String description) {
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

  public CreateTaskPayload dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public CreateTaskPayload formKey(String formKey) {
    this.formKey = formKey;
    return this;
  }

  /**
   * Get formKey
   * @return formKey
   **/
  @ApiModelProperty(value = "")
  
    public String getFormKey() {
    return formKey;
  }

  public void setFormKey(String formKey) {
    this.formKey = formKey;
  }

  public CreateTaskPayload id(String id) {
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

  public CreateTaskPayload name(String name) {
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

  public CreateTaskPayload parentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
    return this;
  }

  /**
   * Get parentTaskId
   * @return parentTaskId
   **/
  @ApiModelProperty(value = "")
  
    public String getParentTaskId() {
    return parentTaskId;
  }

  public void setParentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
  }

  public CreateTaskPayload payloadType(PayloadTypeEnum payloadType) {
    this.payloadType = payloadType;
    return this;
  }

  /**
   * Get payloadType
   * @return payloadType
   **/
  @ApiModelProperty(value = "")
  
    public PayloadTypeEnum getPayloadType() {
    return payloadType;
  }

  public void setPayloadType(PayloadTypeEnum payloadType) {
    this.payloadType = payloadType;
  }

  public CreateTaskPayload priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   **/
  @ApiModelProperty(value = "")
  
    public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTaskPayload createTaskPayload = (CreateTaskPayload) o;
    return Objects.equals(this.assignee, createTaskPayload.assignee) &&
        Objects.equals(this.candidateGroups, createTaskPayload.candidateGroups) &&
        Objects.equals(this.candidateUsers, createTaskPayload.candidateUsers) &&
        Objects.equals(this.description, createTaskPayload.description) &&
        Objects.equals(this.dueDate, createTaskPayload.dueDate) &&
        Objects.equals(this.formKey, createTaskPayload.formKey) &&
        Objects.equals(this.id, createTaskPayload.id) &&
        Objects.equals(this.name, createTaskPayload.name) &&
        Objects.equals(this.parentTaskId, createTaskPayload.parentTaskId) &&
        Objects.equals(this.payloadType, createTaskPayload.payloadType) &&
        Objects.equals(this.priority, createTaskPayload.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, candidateGroups, candidateUsers, description, dueDate, formKey, id, name, parentTaskId, payloadType, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTaskPayload {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    candidateGroups: ").append(toIndentedString(candidateGroups)).append("\n");
    sb.append("    candidateUsers: ").append(toIndentedString(candidateUsers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
