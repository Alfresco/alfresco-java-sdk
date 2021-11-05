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
package org.alfresco.activiti.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CloudServiceTask
 */
@Validated


public class CloudServiceTask   {
  @JsonProperty("activityName")
  private String activityName = null;

  @JsonProperty("activityType")
  private String activityType = null;

  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("appVersion")
  private String appVersion = null;

  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("cancelledDate")
  private OffsetDateTime cancelledDate = null;

  @JsonProperty("completedDate")
  private OffsetDateTime completedDate = null;

  @JsonProperty("elementId")
  private String elementId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

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

  @JsonProperty("startedDate")
  private OffsetDateTime startedDate = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CANCELLED("CANCELLED"),
    
    COMPLETED("COMPLETED"),
    
    ERROR("ERROR"),
    
    STARTED("STARTED");

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

  public CloudServiceTask activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

  /**
   * Get activityName
   * @return activityName
   **/
  @ApiModelProperty(value = "")
  
    public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public CloudServiceTask activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * Get activityType
   * @return activityType
   **/
  @ApiModelProperty(value = "")
  
    public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public CloudServiceTask appName(String appName) {
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

  public CloudServiceTask appVersion(String appVersion) {
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

  public CloudServiceTask businessKey(String businessKey) {
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

  public CloudServiceTask cancelledDate(OffsetDateTime cancelledDate) {
    this.cancelledDate = cancelledDate;
    return this;
  }

  /**
   * Get cancelledDate
   * @return cancelledDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getCancelledDate() {
    return cancelledDate;
  }

  public void setCancelledDate(OffsetDateTime cancelledDate) {
    this.cancelledDate = cancelledDate;
  }

  public CloudServiceTask completedDate(OffsetDateTime completedDate) {
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

  public CloudServiceTask elementId(String elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * Get elementId
   * @return elementId
   **/
  @ApiModelProperty(value = "")
  
    public String getElementId() {
    return elementId;
  }

  public void setElementId(String elementId) {
    this.elementId = elementId;
  }

  public CloudServiceTask executionId(String executionId) {
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

  public CloudServiceTask id(String id) {
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

  public CloudServiceTask processDefinitionId(String processDefinitionId) {
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

  public CloudServiceTask processDefinitionKey(String processDefinitionKey) {
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

  public CloudServiceTask processDefinitionVersion(Integer processDefinitionVersion) {
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

  public CloudServiceTask processInstanceId(String processInstanceId) {
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

  public CloudServiceTask serviceFullName(String serviceFullName) {
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

  public CloudServiceTask serviceName(String serviceName) {
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

  public CloudServiceTask serviceType(String serviceType) {
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

  public CloudServiceTask serviceVersion(String serviceVersion) {
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

  public CloudServiceTask startedDate(OffsetDateTime startedDate) {
    this.startedDate = startedDate;
    return this;
  }

  /**
   * Get startedDate
   * @return startedDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStartedDate() {
    return startedDate;
  }

  public void setStartedDate(OffsetDateTime startedDate) {
    this.startedDate = startedDate;
  }

  public CloudServiceTask status(StatusEnum status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudServiceTask cloudServiceTask = (CloudServiceTask) o;
    return Objects.equals(this.activityName, cloudServiceTask.activityName) &&
        Objects.equals(this.activityType, cloudServiceTask.activityType) &&
        Objects.equals(this.appName, cloudServiceTask.appName) &&
        Objects.equals(this.appVersion, cloudServiceTask.appVersion) &&
        Objects.equals(this.businessKey, cloudServiceTask.businessKey) &&
        Objects.equals(this.cancelledDate, cloudServiceTask.cancelledDate) &&
        Objects.equals(this.completedDate, cloudServiceTask.completedDate) &&
        Objects.equals(this.elementId, cloudServiceTask.elementId) &&
        Objects.equals(this.executionId, cloudServiceTask.executionId) &&
        Objects.equals(this.id, cloudServiceTask.id) &&
        Objects.equals(this.processDefinitionId, cloudServiceTask.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, cloudServiceTask.processDefinitionKey) &&
        Objects.equals(this.processDefinitionVersion, cloudServiceTask.processDefinitionVersion) &&
        Objects.equals(this.processInstanceId, cloudServiceTask.processInstanceId) &&
        Objects.equals(this.serviceFullName, cloudServiceTask.serviceFullName) &&
        Objects.equals(this.serviceName, cloudServiceTask.serviceName) &&
        Objects.equals(this.serviceType, cloudServiceTask.serviceType) &&
        Objects.equals(this.serviceVersion, cloudServiceTask.serviceVersion) &&
        Objects.equals(this.startedDate, cloudServiceTask.startedDate) &&
        Objects.equals(this.status, cloudServiceTask.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityName, activityType, appName, appVersion, businessKey, cancelledDate, completedDate, elementId, executionId, id, processDefinitionId, processDefinitionKey, processDefinitionVersion, processInstanceId, serviceFullName, serviceName, serviceType, serviceVersion, startedDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudServiceTask {\n");
    
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    cancelledDate: ").append(toIndentedString(cancelledDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    serviceFullName: ").append(toIndentedString(serviceFullName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
