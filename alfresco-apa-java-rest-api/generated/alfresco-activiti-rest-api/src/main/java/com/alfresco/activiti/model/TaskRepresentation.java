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
package com.alfresco.activiti.model;

import java.util.Objects;
import com.alfresco.activiti.model.LightGroupRepresentation;
import com.alfresco.activiti.model.LightUserRepresentation;
import com.alfresco.activiti.model.RestVariable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskRepresentation
 */
@Validated


public class TaskRepresentation   {
  @JsonProperty("adhocTaskCanBeReassigned")
  private Boolean adhocTaskCanBeReassigned = null;

  @JsonProperty("assignee")
  private LightUserRepresentation assignee = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("duration")
  private Long duration = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("formKey")
  private String formKey = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("initiatorCanCompleteTask")
  private Boolean initiatorCanCompleteTask = null;

  @JsonProperty("involvedGroups")
  @Valid
  private List<LightGroupRepresentation> involvedGroups = null;

  @JsonProperty("involvedPeople")
  @Valid
  private List<LightUserRepresentation> involvedPeople = null;

  @JsonProperty("managerOfCandidateGroup")
  private Boolean managerOfCandidateGroup = null;

  @JsonProperty("memberOfCandidateGroup")
  private Boolean memberOfCandidateGroup = null;

  @JsonProperty("memberOfCandidateUsers")
  private Boolean memberOfCandidateUsers = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentTaskId")
  private String parentTaskId = null;

  @JsonProperty("parentTaskName")
  private String parentTaskName = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("processDefinitionCategory")
  private String processDefinitionCategory = null;

  @JsonProperty("processDefinitionDeploymentId")
  private String processDefinitionDeploymentId = null;

  @JsonProperty("processDefinitionDescription")
  private String processDefinitionDescription = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionName")
  private String processDefinitionName = null;

  @JsonProperty("processDefinitionVersion")
  private Integer processDefinitionVersion = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceName")
  private String processInstanceName = null;

  @JsonProperty("processInstanceStartUserId")
  private String processInstanceStartUserId = null;

  @JsonProperty("taskDefinitionKey")
  private String taskDefinitionKey = null;

  @JsonProperty("variables")
  @Valid
  private List<RestVariable> variables = null;

  public TaskRepresentation adhocTaskCanBeReassigned(Boolean adhocTaskCanBeReassigned) {
    this.adhocTaskCanBeReassigned = adhocTaskCanBeReassigned;
    return this;
  }

  /**
   * Get adhocTaskCanBeReassigned
   * @return adhocTaskCanBeReassigned
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isAdhocTaskCanBeReassigned() {
    return adhocTaskCanBeReassigned;
  }

  public void setAdhocTaskCanBeReassigned(Boolean adhocTaskCanBeReassigned) {
    this.adhocTaskCanBeReassigned = adhocTaskCanBeReassigned;
  }

  public TaskRepresentation assignee(LightUserRepresentation assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LightUserRepresentation getAssignee() {
    return assignee;
  }

  public void setAssignee(LightUserRepresentation assignee) {
    this.assignee = assignee;
  }

  public TaskRepresentation category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  @ApiModelProperty(value = "")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TaskRepresentation created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public TaskRepresentation description(String description) {
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

  public TaskRepresentation dueDate(OffsetDateTime dueDate) {
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

  public TaskRepresentation duration(Long duration) {
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

  public TaskRepresentation endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public TaskRepresentation executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Get executionId
   * @return executionId
   **/
  @ApiModelProperty(value = "")
  
    public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public TaskRepresentation formKey(String formKey) {
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

  public TaskRepresentation id(String id) {
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

  public TaskRepresentation initiatorCanCompleteTask(Boolean initiatorCanCompleteTask) {
    this.initiatorCanCompleteTask = initiatorCanCompleteTask;
    return this;
  }

  /**
   * Get initiatorCanCompleteTask
   * @return initiatorCanCompleteTask
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isInitiatorCanCompleteTask() {
    return initiatorCanCompleteTask;
  }

  public void setInitiatorCanCompleteTask(Boolean initiatorCanCompleteTask) {
    this.initiatorCanCompleteTask = initiatorCanCompleteTask;
  }

  public TaskRepresentation involvedGroups(List<LightGroupRepresentation> involvedGroups) {
    this.involvedGroups = involvedGroups;
    return this;
  }

  public TaskRepresentation addInvolvedGroupsItem(LightGroupRepresentation involvedGroupsItem) {
    if (this.involvedGroups == null) {
      this.involvedGroups = new ArrayList<>();
    }
    this.involvedGroups.add(involvedGroupsItem);
    return this;
  }

  /**
   * Get involvedGroups
   * @return involvedGroups
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<LightGroupRepresentation> getInvolvedGroups() {
    return involvedGroups;
  }

  public void setInvolvedGroups(List<LightGroupRepresentation> involvedGroups) {
    this.involvedGroups = involvedGroups;
  }

  public TaskRepresentation involvedPeople(List<LightUserRepresentation> involvedPeople) {
    this.involvedPeople = involvedPeople;
    return this;
  }

  public TaskRepresentation addInvolvedPeopleItem(LightUserRepresentation involvedPeopleItem) {
    if (this.involvedPeople == null) {
      this.involvedPeople = new ArrayList<>();
    }
    this.involvedPeople.add(involvedPeopleItem);
    return this;
  }

  /**
   * Get involvedPeople
   * @return involvedPeople
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<LightUserRepresentation> getInvolvedPeople() {
    return involvedPeople;
  }

  public void setInvolvedPeople(List<LightUserRepresentation> involvedPeople) {
    this.involvedPeople = involvedPeople;
  }

  public TaskRepresentation managerOfCandidateGroup(Boolean managerOfCandidateGroup) {
    this.managerOfCandidateGroup = managerOfCandidateGroup;
    return this;
  }

  /**
   * Get managerOfCandidateGroup
   * @return managerOfCandidateGroup
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isManagerOfCandidateGroup() {
    return managerOfCandidateGroup;
  }

  public void setManagerOfCandidateGroup(Boolean managerOfCandidateGroup) {
    this.managerOfCandidateGroup = managerOfCandidateGroup;
  }

  public TaskRepresentation memberOfCandidateGroup(Boolean memberOfCandidateGroup) {
    this.memberOfCandidateGroup = memberOfCandidateGroup;
    return this;
  }

  /**
   * Get memberOfCandidateGroup
   * @return memberOfCandidateGroup
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isMemberOfCandidateGroup() {
    return memberOfCandidateGroup;
  }

  public void setMemberOfCandidateGroup(Boolean memberOfCandidateGroup) {
    this.memberOfCandidateGroup = memberOfCandidateGroup;
  }

  public TaskRepresentation memberOfCandidateUsers(Boolean memberOfCandidateUsers) {
    this.memberOfCandidateUsers = memberOfCandidateUsers;
    return this;
  }

  /**
   * Get memberOfCandidateUsers
   * @return memberOfCandidateUsers
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isMemberOfCandidateUsers() {
    return memberOfCandidateUsers;
  }

  public void setMemberOfCandidateUsers(Boolean memberOfCandidateUsers) {
    this.memberOfCandidateUsers = memberOfCandidateUsers;
  }

  public TaskRepresentation name(String name) {
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

  public TaskRepresentation parentTaskId(String parentTaskId) {
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

  public TaskRepresentation parentTaskName(String parentTaskName) {
    this.parentTaskName = parentTaskName;
    return this;
  }

  /**
   * Get parentTaskName
   * @return parentTaskName
   **/
  @ApiModelProperty(value = "")
  
    public String getParentTaskName() {
    return parentTaskName;
  }

  public void setParentTaskName(String parentTaskName) {
    this.parentTaskName = parentTaskName;
  }

  public TaskRepresentation priority(Integer priority) {
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

  public TaskRepresentation processDefinitionCategory(String processDefinitionCategory) {
    this.processDefinitionCategory = processDefinitionCategory;
    return this;
  }

  /**
   * Get processDefinitionCategory
   * @return processDefinitionCategory
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessDefinitionCategory() {
    return processDefinitionCategory;
  }

  public void setProcessDefinitionCategory(String processDefinitionCategory) {
    this.processDefinitionCategory = processDefinitionCategory;
  }

  public TaskRepresentation processDefinitionDeploymentId(String processDefinitionDeploymentId) {
    this.processDefinitionDeploymentId = processDefinitionDeploymentId;
    return this;
  }

  /**
   * Get processDefinitionDeploymentId
   * @return processDefinitionDeploymentId
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessDefinitionDeploymentId() {
    return processDefinitionDeploymentId;
  }

  public void setProcessDefinitionDeploymentId(String processDefinitionDeploymentId) {
    this.processDefinitionDeploymentId = processDefinitionDeploymentId;
  }

  public TaskRepresentation processDefinitionDescription(String processDefinitionDescription) {
    this.processDefinitionDescription = processDefinitionDescription;
    return this;
  }

  /**
   * Get processDefinitionDescription
   * @return processDefinitionDescription
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessDefinitionDescription() {
    return processDefinitionDescription;
  }

  public void setProcessDefinitionDescription(String processDefinitionDescription) {
    this.processDefinitionDescription = processDefinitionDescription;
  }

  public TaskRepresentation processDefinitionId(String processDefinitionId) {
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

  public TaskRepresentation processDefinitionKey(String processDefinitionKey) {
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

  public TaskRepresentation processDefinitionName(String processDefinitionName) {
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

  public TaskRepresentation processDefinitionVersion(Integer processDefinitionVersion) {
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

  public TaskRepresentation processInstanceId(String processInstanceId) {
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

  public TaskRepresentation processInstanceName(String processInstanceName) {
    this.processInstanceName = processInstanceName;
    return this;
  }

  /**
   * Get processInstanceName
   * @return processInstanceName
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessInstanceName() {
    return processInstanceName;
  }

  public void setProcessInstanceName(String processInstanceName) {
    this.processInstanceName = processInstanceName;
  }

  public TaskRepresentation processInstanceStartUserId(String processInstanceStartUserId) {
    this.processInstanceStartUserId = processInstanceStartUserId;
    return this;
  }

  /**
   * Get processInstanceStartUserId
   * @return processInstanceStartUserId
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessInstanceStartUserId() {
    return processInstanceStartUserId;
  }

  public void setProcessInstanceStartUserId(String processInstanceStartUserId) {
    this.processInstanceStartUserId = processInstanceStartUserId;
  }

  public TaskRepresentation taskDefinitionKey(String taskDefinitionKey) {
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

  public TaskRepresentation variables(List<RestVariable> variables) {
    this.variables = variables;
    return this;
  }

  public TaskRepresentation addVariablesItem(RestVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  /**
   * Get variables
   * @return variables
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<RestVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<RestVariable> variables) {
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
    TaskRepresentation taskRepresentation = (TaskRepresentation) o;
    return Objects.equals(this.adhocTaskCanBeReassigned, taskRepresentation.adhocTaskCanBeReassigned) &&
        Objects.equals(this.assignee, taskRepresentation.assignee) &&
        Objects.equals(this.category, taskRepresentation.category) &&
        Objects.equals(this.created, taskRepresentation.created) &&
        Objects.equals(this.description, taskRepresentation.description) &&
        Objects.equals(this.dueDate, taskRepresentation.dueDate) &&
        Objects.equals(this.duration, taskRepresentation.duration) &&
        Objects.equals(this.endDate, taskRepresentation.endDate) &&
        Objects.equals(this.executionId, taskRepresentation.executionId) &&
        Objects.equals(this.formKey, taskRepresentation.formKey) &&
        Objects.equals(this.id, taskRepresentation.id) &&
        Objects.equals(this.initiatorCanCompleteTask, taskRepresentation.initiatorCanCompleteTask) &&
        Objects.equals(this.involvedGroups, taskRepresentation.involvedGroups) &&
        Objects.equals(this.involvedPeople, taskRepresentation.involvedPeople) &&
        Objects.equals(this.managerOfCandidateGroup, taskRepresentation.managerOfCandidateGroup) &&
        Objects.equals(this.memberOfCandidateGroup, taskRepresentation.memberOfCandidateGroup) &&
        Objects.equals(this.memberOfCandidateUsers, taskRepresentation.memberOfCandidateUsers) &&
        Objects.equals(this.name, taskRepresentation.name) &&
        Objects.equals(this.parentTaskId, taskRepresentation.parentTaskId) &&
        Objects.equals(this.parentTaskName, taskRepresentation.parentTaskName) &&
        Objects.equals(this.priority, taskRepresentation.priority) &&
        Objects.equals(this.processDefinitionCategory, taskRepresentation.processDefinitionCategory) &&
        Objects.equals(this.processDefinitionDeploymentId, taskRepresentation.processDefinitionDeploymentId) &&
        Objects.equals(this.processDefinitionDescription, taskRepresentation.processDefinitionDescription) &&
        Objects.equals(this.processDefinitionId, taskRepresentation.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, taskRepresentation.processDefinitionKey) &&
        Objects.equals(this.processDefinitionName, taskRepresentation.processDefinitionName) &&
        Objects.equals(this.processDefinitionVersion, taskRepresentation.processDefinitionVersion) &&
        Objects.equals(this.processInstanceId, taskRepresentation.processInstanceId) &&
        Objects.equals(this.processInstanceName, taskRepresentation.processInstanceName) &&
        Objects.equals(this.processInstanceStartUserId, taskRepresentation.processInstanceStartUserId) &&
        Objects.equals(this.taskDefinitionKey, taskRepresentation.taskDefinitionKey) &&
        Objects.equals(this.variables, taskRepresentation.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adhocTaskCanBeReassigned, assignee, category, created, description, dueDate, duration, endDate, executionId, formKey, id, initiatorCanCompleteTask, involvedGroups, involvedPeople, managerOfCandidateGroup, memberOfCandidateGroup, memberOfCandidateUsers, name, parentTaskId, parentTaskName, priority, processDefinitionCategory, processDefinitionDeploymentId, processDefinitionDescription, processDefinitionId, processDefinitionKey, processDefinitionName, processDefinitionVersion, processInstanceId, processInstanceName, processInstanceStartUserId, taskDefinitionKey, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskRepresentation {\n");
    
    sb.append("    adhocTaskCanBeReassigned: ").append(toIndentedString(adhocTaskCanBeReassigned)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initiatorCanCompleteTask: ").append(toIndentedString(initiatorCanCompleteTask)).append("\n");
    sb.append("    involvedGroups: ").append(toIndentedString(involvedGroups)).append("\n");
    sb.append("    involvedPeople: ").append(toIndentedString(involvedPeople)).append("\n");
    sb.append("    managerOfCandidateGroup: ").append(toIndentedString(managerOfCandidateGroup)).append("\n");
    sb.append("    memberOfCandidateGroup: ").append(toIndentedString(memberOfCandidateGroup)).append("\n");
    sb.append("    memberOfCandidateUsers: ").append(toIndentedString(memberOfCandidateUsers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    parentTaskName: ").append(toIndentedString(parentTaskName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    processDefinitionCategory: ").append(toIndentedString(processDefinitionCategory)).append("\n");
    sb.append("    processDefinitionDeploymentId: ").append(toIndentedString(processDefinitionDeploymentId)).append("\n");
    sb.append("    processDefinitionDescription: ").append(toIndentedString(processDefinitionDescription)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionName: ").append(toIndentedString(processDefinitionName)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceName: ").append(toIndentedString(processInstanceName)).append("\n");
    sb.append("    processInstanceStartUserId: ").append(toIndentedString(processInstanceStartUserId)).append("\n");
    sb.append("    taskDefinitionKey: ").append(toIndentedString(taskDefinitionKey)).append("\n");
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
