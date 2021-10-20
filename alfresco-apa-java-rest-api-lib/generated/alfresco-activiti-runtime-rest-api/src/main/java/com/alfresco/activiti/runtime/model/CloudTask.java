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
 * CloudTask
 */
@Validated


public class CloudTask   {
  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("appVersion")
  private String appVersion = null;

  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("candidateGroups")
  @Valid
  private List<String> candidateGroups = null;

  @JsonProperty("candidateUsers")
  @Valid
  private List<String> candidateUsers = null;

  @JsonProperty("claimedDate")
  private OffsetDateTime claimedDate = null;

  @JsonProperty("completedBy")
  private String completedBy = null;

  @JsonProperty("completedDate")
  private OffsetDateTime completedDate = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("duration")
  private Long duration = null;

  @JsonProperty("formKey")
  private String formKey = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("parentTaskId")
  private String parentTaskId = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionVersion")
  private Integer processDefinitionVersion = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("serviceFullName")
  private String serviceFullName = null;

  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("serviceVersion")
  private String serviceVersion = null;

  @JsonProperty("standalone")
  private Boolean standalone = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ASSIGNED("ASSIGNED"),
    
    CANCELLED("CANCELLED"),
    
    COMPLETED("COMPLETED"),
    
    CREATED("CREATED"),
    
    DELETED("DELETED"),
    
    SUSPENDED("SUSPENDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("taskDefinitionKey")
  private String taskDefinitionKey = null;

  public CloudTask appName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   **/
  @ApiModelProperty(value = "")
  
    public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public CloudTask appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * Get appVersion
   * @return appVersion
   **/
  @ApiModelProperty(value = "")
  
    public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public CloudTask assignee(String assignee) {
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

  public CloudTask businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * Get businessKey
   * @return businessKey
   **/
  @ApiModelProperty(value = "")
  
    public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public CloudTask candidateGroups(List<String> candidateGroups) {
    this.candidateGroups = candidateGroups;
    return this;
  }

  public CloudTask addCandidateGroupsItem(String candidateGroupsItem) {
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

  public CloudTask candidateUsers(List<String> candidateUsers) {
    this.candidateUsers = candidateUsers;
    return this;
  }

  public CloudTask addCandidateUsersItem(String candidateUsersItem) {
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

  public CloudTask claimedDate(OffsetDateTime claimedDate) {
    this.claimedDate = claimedDate;
    return this;
  }

  /**
   * Get claimedDate
   * @return claimedDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getClaimedDate() {
    return claimedDate;
  }

  public void setClaimedDate(OffsetDateTime claimedDate) {
    this.claimedDate = claimedDate;
  }

  public CloudTask completedBy(String completedBy) {
    this.completedBy = completedBy;
    return this;
  }

  /**
   * Get completedBy
   * @return completedBy
   **/
  @ApiModelProperty(value = "")
  
    public String getCompletedBy() {
    return completedBy;
  }

  public void setCompletedBy(String completedBy) {
    this.completedBy = completedBy;
  }

  public CloudTask completedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
    return this;
  }

  /**
   * Get completedDate
   * @return completedDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
  }

  public CloudTask createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public CloudTask description(String description) {
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

  public CloudTask dueDate(OffsetDateTime dueDate) {
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

  public CloudTask duration(Long duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  @ApiModelProperty(value = "")
  
    public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public CloudTask formKey(String formKey) {
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

  public CloudTask id(String id) {
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

  public CloudTask name(String name) {
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

  public CloudTask owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   **/
  @ApiModelProperty(value = "")
  
    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public CloudTask parentTaskId(String parentTaskId) {
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

  public CloudTask priority(Integer priority) {
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

  public CloudTask processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Get processDefinitionId
   * @return processDefinitionId
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public CloudTask processDefinitionVersion(Integer processDefinitionVersion) {
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

  public CloudTask processInstanceId(String processInstanceId) {
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

  public CloudTask serviceFullName(String serviceFullName) {
    this.serviceFullName = serviceFullName;
    return this;
  }

  /**
   * Get serviceFullName
   * @return serviceFullName
   **/
  @ApiModelProperty(value = "")
  
    public String getServiceFullName() {
    return serviceFullName;
  }

  public void setServiceFullName(String serviceFullName) {
    this.serviceFullName = serviceFullName;
  }

  public CloudTask serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   **/
  @ApiModelProperty(value = "")
  
    public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public CloudTask serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
   **/
  @ApiModelProperty(value = "")
  
    public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public CloudTask serviceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
    return this;
  }

  /**
   * Get serviceVersion
   * @return serviceVersion
   **/
  @ApiModelProperty(value = "")
  
    public String getServiceVersion() {
    return serviceVersion;
  }

  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

  public CloudTask standalone(Boolean standalone) {
    this.standalone = standalone;
    return this;
  }

  /**
   * Get standalone
   * @return standalone
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isStandalone() {
    return standalone;
  }

  public void setStandalone(Boolean standalone) {
    this.standalone = standalone;
  }

  public CloudTask status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @ApiModelProperty(value = "")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CloudTask taskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
    return this;
  }

  /**
   * Get taskDefinitionKey
   * @return taskDefinitionKey
   **/
  @ApiModelProperty(value = "")
  
    public String getTaskDefinitionKey() {
    return taskDefinitionKey;
  }

  public void setTaskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudTask cloudTask = (CloudTask) o;
    return Objects.equals(this.appName, cloudTask.appName) &&
        Objects.equals(this.appVersion, cloudTask.appVersion) &&
        Objects.equals(this.assignee, cloudTask.assignee) &&
        Objects.equals(this.businessKey, cloudTask.businessKey) &&
        Objects.equals(this.candidateGroups, cloudTask.candidateGroups) &&
        Objects.equals(this.candidateUsers, cloudTask.candidateUsers) &&
        Objects.equals(this.claimedDate, cloudTask.claimedDate) &&
        Objects.equals(this.completedBy, cloudTask.completedBy) &&
        Objects.equals(this.completedDate, cloudTask.completedDate) &&
        Objects.equals(this.createdDate, cloudTask.createdDate) &&
        Objects.equals(this.description, cloudTask.description) &&
        Objects.equals(this.dueDate, cloudTask.dueDate) &&
        Objects.equals(this.duration, cloudTask.duration) &&
        Objects.equals(this.formKey, cloudTask.formKey) &&
        Objects.equals(this.id, cloudTask.id) &&
        Objects.equals(this.name, cloudTask.name) &&
        Objects.equals(this.owner, cloudTask.owner) &&
        Objects.equals(this.parentTaskId, cloudTask.parentTaskId) &&
        Objects.equals(this.priority, cloudTask.priority) &&
        Objects.equals(this.processDefinitionId, cloudTask.processDefinitionId) &&
        Objects.equals(this.processDefinitionVersion, cloudTask.processDefinitionVersion) &&
        Objects.equals(this.processInstanceId, cloudTask.processInstanceId) &&
        Objects.equals(this.serviceFullName, cloudTask.serviceFullName) &&
        Objects.equals(this.serviceName, cloudTask.serviceName) &&
        Objects.equals(this.serviceType, cloudTask.serviceType) &&
        Objects.equals(this.serviceVersion, cloudTask.serviceVersion) &&
        Objects.equals(this.standalone, cloudTask.standalone) &&
        Objects.equals(this.status, cloudTask.status) &&
        Objects.equals(this.taskDefinitionKey, cloudTask.taskDefinitionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appVersion, assignee, businessKey, candidateGroups, candidateUsers, claimedDate, completedBy, completedDate, createdDate, description, dueDate, duration, formKey, id, name, owner, parentTaskId, priority, processDefinitionId, processDefinitionVersion, processInstanceId, serviceFullName, serviceName, serviceType, serviceVersion, standalone, status, taskDefinitionKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudTask {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    candidateGroups: ").append(toIndentedString(candidateGroups)).append("\n");
    sb.append("    candidateUsers: ").append(toIndentedString(candidateUsers)).append("\n");
    sb.append("    claimedDate: ").append(toIndentedString(claimedDate)).append("\n");
    sb.append("    completedBy: ").append(toIndentedString(completedBy)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    serviceFullName: ").append(toIndentedString(serviceFullName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    standalone: ").append(toIndentedString(standalone)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
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
