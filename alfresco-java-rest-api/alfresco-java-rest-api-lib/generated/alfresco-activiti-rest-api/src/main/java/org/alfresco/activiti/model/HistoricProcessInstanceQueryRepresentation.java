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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.QueryVariable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HistoricProcessInstanceQueryRepresentation
 */
@Validated

public class HistoricProcessInstanceQueryRepresentation   {
  @JsonProperty("excludeSubprocesses")
  private Boolean excludeSubprocesses = null;

  @JsonProperty("finished")
  private Boolean finished = null;

  @JsonProperty("finishedAfter")
  private OffsetDateTime finishedAfter = null;

  @JsonProperty("finishedBefore")
  private OffsetDateTime finishedBefore = null;

  @JsonProperty("includeProcessVariables")
  private Boolean includeProcessVariables = null;

  @JsonProperty("involvedUser")
  private String involvedUser = null;

  @JsonProperty("order")
  private String order = null;

  @JsonProperty("processBusinessKey")
  private String processBusinessKey = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceIds")
  @Valid
  private List<String> processInstanceIds = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("sort")
  private String sort = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("startedAfter")
  private OffsetDateTime startedAfter = null;

  @JsonProperty("startedBefore")
  private OffsetDateTime startedBefore = null;

  @JsonProperty("startedBy")
  private String startedBy = null;

  @JsonProperty("superProcessInstanceId")
  private String superProcessInstanceId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("tenantIdLike")
  private String tenantIdLike = null;

  @JsonProperty("variables")
  @Valid
  private List<QueryVariable> variables = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  public HistoricProcessInstanceQueryRepresentation excludeSubprocesses(Boolean excludeSubprocesses) {
    this.excludeSubprocesses = excludeSubprocesses;
    return this;
  }

  /**
   * Get excludeSubprocesses
   * @return excludeSubprocesses
  **/
  @ApiModelProperty(value = "")


  public Boolean isExcludeSubprocesses() {
    return excludeSubprocesses;
  }

  public void setExcludeSubprocesses(Boolean excludeSubprocesses) {
    this.excludeSubprocesses = excludeSubprocesses;
  }

  public HistoricProcessInstanceQueryRepresentation finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Get finished
   * @return finished
  **/
  @ApiModelProperty(value = "")


  public Boolean isFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }

  public HistoricProcessInstanceQueryRepresentation finishedAfter(OffsetDateTime finishedAfter) {
    this.finishedAfter = finishedAfter;
    return this;
  }

  /**
   * Get finishedAfter
   * @return finishedAfter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getFinishedAfter() {
    return finishedAfter;
  }

  public void setFinishedAfter(OffsetDateTime finishedAfter) {
    this.finishedAfter = finishedAfter;
  }

  public HistoricProcessInstanceQueryRepresentation finishedBefore(OffsetDateTime finishedBefore) {
    this.finishedBefore = finishedBefore;
    return this;
  }

  /**
   * Get finishedBefore
   * @return finishedBefore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getFinishedBefore() {
    return finishedBefore;
  }

  public void setFinishedBefore(OffsetDateTime finishedBefore) {
    this.finishedBefore = finishedBefore;
  }

  public HistoricProcessInstanceQueryRepresentation includeProcessVariables(Boolean includeProcessVariables) {
    this.includeProcessVariables = includeProcessVariables;
    return this;
  }

  /**
   * Get includeProcessVariables
   * @return includeProcessVariables
  **/
  @ApiModelProperty(value = "")


  public Boolean isIncludeProcessVariables() {
    return includeProcessVariables;
  }

  public void setIncludeProcessVariables(Boolean includeProcessVariables) {
    this.includeProcessVariables = includeProcessVariables;
  }

  public HistoricProcessInstanceQueryRepresentation involvedUser(String involvedUser) {
    this.involvedUser = involvedUser;
    return this;
  }

  /**
   * Get involvedUser
   * @return involvedUser
  **/
  @ApiModelProperty(value = "")


  public String getInvolvedUser() {
    return involvedUser;
  }

  public void setInvolvedUser(String involvedUser) {
    this.involvedUser = involvedUser;
  }

  public HistoricProcessInstanceQueryRepresentation order(String order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")


  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public HistoricProcessInstanceQueryRepresentation processBusinessKey(String processBusinessKey) {
    this.processBusinessKey = processBusinessKey;
    return this;
  }

  /**
   * Get processBusinessKey
   * @return processBusinessKey
  **/
  @ApiModelProperty(value = "")


  public String getProcessBusinessKey() {
    return processBusinessKey;
  }

  public void setProcessBusinessKey(String processBusinessKey) {
    this.processBusinessKey = processBusinessKey;
  }

  public HistoricProcessInstanceQueryRepresentation processDefinitionId(String processDefinitionId) {
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

  public HistoricProcessInstanceQueryRepresentation processDefinitionKey(String processDefinitionKey) {
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

  public HistoricProcessInstanceQueryRepresentation processInstanceId(String processInstanceId) {
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

  public HistoricProcessInstanceQueryRepresentation processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public HistoricProcessInstanceQueryRepresentation addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * Get processInstanceIds
   * @return processInstanceIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public HistoricProcessInstanceQueryRepresentation size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public HistoricProcessInstanceQueryRepresentation sort(String sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")


  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public HistoricProcessInstanceQueryRepresentation start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")


  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public HistoricProcessInstanceQueryRepresentation startedAfter(OffsetDateTime startedAfter) {
    this.startedAfter = startedAfter;
    return this;
  }

  /**
   * Get startedAfter
   * @return startedAfter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartedAfter() {
    return startedAfter;
  }

  public void setStartedAfter(OffsetDateTime startedAfter) {
    this.startedAfter = startedAfter;
  }

  public HistoricProcessInstanceQueryRepresentation startedBefore(OffsetDateTime startedBefore) {
    this.startedBefore = startedBefore;
    return this;
  }

  /**
   * Get startedBefore
   * @return startedBefore
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartedBefore() {
    return startedBefore;
  }

  public void setStartedBefore(OffsetDateTime startedBefore) {
    this.startedBefore = startedBefore;
  }

  public HistoricProcessInstanceQueryRepresentation startedBy(String startedBy) {
    this.startedBy = startedBy;
    return this;
  }

  /**
   * Get startedBy
   * @return startedBy
  **/
  @ApiModelProperty(value = "")


  public String getStartedBy() {
    return startedBy;
  }

  public void setStartedBy(String startedBy) {
    this.startedBy = startedBy;
  }

  public HistoricProcessInstanceQueryRepresentation superProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
    return this;
  }

  /**
   * Get superProcessInstanceId
   * @return superProcessInstanceId
  **/
  @ApiModelProperty(value = "")


  public String getSuperProcessInstanceId() {
    return superProcessInstanceId;
  }

  public void setSuperProcessInstanceId(String superProcessInstanceId) {
    this.superProcessInstanceId = superProcessInstanceId;
  }

  public HistoricProcessInstanceQueryRepresentation tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")


  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricProcessInstanceQueryRepresentation tenantIdLike(String tenantIdLike) {
    this.tenantIdLike = tenantIdLike;
    return this;
  }

  /**
   * Get tenantIdLike
   * @return tenantIdLike
  **/
  @ApiModelProperty(value = "")


  public String getTenantIdLike() {
    return tenantIdLike;
  }

  public void setTenantIdLike(String tenantIdLike) {
    this.tenantIdLike = tenantIdLike;
  }

  public HistoricProcessInstanceQueryRepresentation variables(List<QueryVariable> variables) {
    this.variables = variables;
    return this;
  }

  public HistoricProcessInstanceQueryRepresentation addVariablesItem(QueryVariable variablesItem) {
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

  public List<QueryVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<QueryVariable> variables) {
    this.variables = variables;
  }

  public HistoricProcessInstanceQueryRepresentation withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Get withoutTenantId
   * @return withoutTenantId
  **/
  @ApiModelProperty(value = "")


  public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricProcessInstanceQueryRepresentation historicProcessInstanceQueryRepresentation = (HistoricProcessInstanceQueryRepresentation) o;
    return Objects.equals(this.excludeSubprocesses, historicProcessInstanceQueryRepresentation.excludeSubprocesses) &&
        Objects.equals(this.finished, historicProcessInstanceQueryRepresentation.finished) &&
        Objects.equals(this.finishedAfter, historicProcessInstanceQueryRepresentation.finishedAfter) &&
        Objects.equals(this.finishedBefore, historicProcessInstanceQueryRepresentation.finishedBefore) &&
        Objects.equals(this.includeProcessVariables, historicProcessInstanceQueryRepresentation.includeProcessVariables) &&
        Objects.equals(this.involvedUser, historicProcessInstanceQueryRepresentation.involvedUser) &&
        Objects.equals(this.order, historicProcessInstanceQueryRepresentation.order) &&
        Objects.equals(this.processBusinessKey, historicProcessInstanceQueryRepresentation.processBusinessKey) &&
        Objects.equals(this.processDefinitionId, historicProcessInstanceQueryRepresentation.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicProcessInstanceQueryRepresentation.processDefinitionKey) &&
        Objects.equals(this.processInstanceId, historicProcessInstanceQueryRepresentation.processInstanceId) &&
        Objects.equals(this.processInstanceIds, historicProcessInstanceQueryRepresentation.processInstanceIds) &&
        Objects.equals(this.size, historicProcessInstanceQueryRepresentation.size) &&
        Objects.equals(this.sort, historicProcessInstanceQueryRepresentation.sort) &&
        Objects.equals(this.start, historicProcessInstanceQueryRepresentation.start) &&
        Objects.equals(this.startedAfter, historicProcessInstanceQueryRepresentation.startedAfter) &&
        Objects.equals(this.startedBefore, historicProcessInstanceQueryRepresentation.startedBefore) &&
        Objects.equals(this.startedBy, historicProcessInstanceQueryRepresentation.startedBy) &&
        Objects.equals(this.superProcessInstanceId, historicProcessInstanceQueryRepresentation.superProcessInstanceId) &&
        Objects.equals(this.tenantId, historicProcessInstanceQueryRepresentation.tenantId) &&
        Objects.equals(this.tenantIdLike, historicProcessInstanceQueryRepresentation.tenantIdLike) &&
        Objects.equals(this.variables, historicProcessInstanceQueryRepresentation.variables) &&
        Objects.equals(this.withoutTenantId, historicProcessInstanceQueryRepresentation.withoutTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeSubprocesses, finished, finishedAfter, finishedBefore, includeProcessVariables, involvedUser, order, processBusinessKey, processDefinitionId, processDefinitionKey, processInstanceId, processInstanceIds, size, sort, start, startedAfter, startedBefore, startedBy, superProcessInstanceId, tenantId, tenantIdLike, variables, withoutTenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricProcessInstanceQueryRepresentation {\n");
    
    sb.append("    excludeSubprocesses: ").append(toIndentedString(excludeSubprocesses)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    finishedAfter: ").append(toIndentedString(finishedAfter)).append("\n");
    sb.append("    finishedBefore: ").append(toIndentedString(finishedBefore)).append("\n");
    sb.append("    includeProcessVariables: ").append(toIndentedString(includeProcessVariables)).append("\n");
    sb.append("    involvedUser: ").append(toIndentedString(involvedUser)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    processBusinessKey: ").append(toIndentedString(processBusinessKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    startedAfter: ").append(toIndentedString(startedAfter)).append("\n");
    sb.append("    startedBefore: ").append(toIndentedString(startedBefore)).append("\n");
    sb.append("    startedBy: ").append(toIndentedString(startedBy)).append("\n");
    sb.append("    superProcessInstanceId: ").append(toIndentedString(superProcessInstanceId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantIdLike: ").append(toIndentedString(tenantIdLike)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
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

