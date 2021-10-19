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
import com.alfresco.activiti.preference.model.ProcessDefinitionServiceTask;
import com.alfresco.activiti.preference.model.ProcessDefinitionUserTask;
import com.alfresco.activiti.preference.model.ProcessDefinitionVariable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessDefinitionMeta
 */
@Validated

public class ProcessDefinitionMeta   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("groups")
  @Valid
  private List<String> groups = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("serviceTasks")
  @Valid
  private List<ProcessDefinitionServiceTask> serviceTasks = null;

  @JsonProperty("userTasks")
  @Valid
  private List<ProcessDefinitionUserTask> userTasks = null;

  @JsonProperty("users")
  @Valid
  private List<String> users = null;

  @JsonProperty("variables")
  @Valid
  private List<ProcessDefinitionVariable> variables = null;

  @JsonProperty("version")
  private Integer version = null;

  public ProcessDefinitionMeta description(String description) {
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

  public ProcessDefinitionMeta groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ProcessDefinitionMeta addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")


  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ProcessDefinitionMeta id(String id) {
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

  public ProcessDefinitionMeta name(String name) {
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

  public ProcessDefinitionMeta serviceTasks(List<ProcessDefinitionServiceTask> serviceTasks) {
    this.serviceTasks = serviceTasks;
    return this;
  }

  public ProcessDefinitionMeta addServiceTasksItem(ProcessDefinitionServiceTask serviceTasksItem) {
    if (this.serviceTasks == null) {
      this.serviceTasks = new ArrayList<>();
    }
    this.serviceTasks.add(serviceTasksItem);
    return this;
  }

  /**
   * Get serviceTasks
   * @return serviceTasks
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProcessDefinitionServiceTask> getServiceTasks() {
    return serviceTasks;
  }

  public void setServiceTasks(List<ProcessDefinitionServiceTask> serviceTasks) {
    this.serviceTasks = serviceTasks;
  }

  public ProcessDefinitionMeta userTasks(List<ProcessDefinitionUserTask> userTasks) {
    this.userTasks = userTasks;
    return this;
  }

  public ProcessDefinitionMeta addUserTasksItem(ProcessDefinitionUserTask userTasksItem) {
    if (this.userTasks == null) {
      this.userTasks = new ArrayList<>();
    }
    this.userTasks.add(userTasksItem);
    return this;
  }

  /**
   * Get userTasks
   * @return userTasks
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProcessDefinitionUserTask> getUserTasks() {
    return userTasks;
  }

  public void setUserTasks(List<ProcessDefinitionUserTask> userTasks) {
    this.userTasks = userTasks;
  }

  public ProcessDefinitionMeta users(List<String> users) {
    this.users = users;
    return this;
  }

  public ProcessDefinitionMeta addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")


  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  public ProcessDefinitionMeta variables(List<ProcessDefinitionVariable> variables) {
    this.variables = variables;
    return this;
  }

  public ProcessDefinitionMeta addVariablesItem(ProcessDefinitionVariable variablesItem) {
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

  public List<ProcessDefinitionVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<ProcessDefinitionVariable> variables) {
    this.variables = variables;
  }

  public ProcessDefinitionMeta version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionMeta processDefinitionMeta = (ProcessDefinitionMeta) o;
    return Objects.equals(this.description, processDefinitionMeta.description) &&
        Objects.equals(this.groups, processDefinitionMeta.groups) &&
        Objects.equals(this.id, processDefinitionMeta.id) &&
        Objects.equals(this.name, processDefinitionMeta.name) &&
        Objects.equals(this.serviceTasks, processDefinitionMeta.serviceTasks) &&
        Objects.equals(this.userTasks, processDefinitionMeta.userTasks) &&
        Objects.equals(this.users, processDefinitionMeta.users) &&
        Objects.equals(this.variables, processDefinitionMeta.variables) &&
        Objects.equals(this.version, processDefinitionMeta.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groups, id, name, serviceTasks, userTasks, users, variables, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionMeta {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceTasks: ").append(toIndentedString(serviceTasks)).append("\n");
    sb.append("    userTasks: ").append(toIndentedString(userTasks)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

