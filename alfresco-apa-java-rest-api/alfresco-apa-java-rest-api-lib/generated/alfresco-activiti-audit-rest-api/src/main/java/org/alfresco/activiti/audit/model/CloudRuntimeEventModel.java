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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CloudRuntimeEventModel
 */
@Validated


public class CloudRuntimeEventModel   {
  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("appVersion")
  private String appVersion = null;

  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("entity")
  private Object entity = null;

  @JsonProperty("entityId")
  private String entityId = null;

  /**
   * Gets or Sets eventType
   */
  public enum EventTypeEnum {
    ACTIVITY_CANCELLED("ACTIVITY_CANCELLED"),
    
    ACTIVITY_COMPLETED("ACTIVITY_COMPLETED"),
    
    ACTIVITY_STARTED("ACTIVITY_STARTED"),
    
    APPLICATION_DEPLOYED("APPLICATION_DEPLOYED"),
    
    ERROR_RECEIVED("ERROR_RECEIVED"),
    
    INTEGRATION_ERROR_RECEIVED("INTEGRATION_ERROR_RECEIVED"),
    
    INTEGRATION_REQUESTED("INTEGRATION_REQUESTED"),
    
    INTEGRATION_RESULT_RECEIVED("INTEGRATION_RESULT_RECEIVED"),
    
    MESSAGE_RECEIVED("MESSAGE_RECEIVED"),
    
    MESSAGE_SENT("MESSAGE_SENT"),
    
    MESSAGE_WAITING("MESSAGE_WAITING"),
    
    PROCESS_CANCELLED("PROCESS_CANCELLED"),
    
    PROCESS_COMPLETED("PROCESS_COMPLETED"),
    
    PROCESS_CREATED("PROCESS_CREATED"),
    
    PROCESS_DEPLOYED("PROCESS_DEPLOYED"),
    
    PROCESS_RESUMED("PROCESS_RESUMED"),
    
    PROCESS_STARTED("PROCESS_STARTED"),
    
    PROCESS_SUSPENDED("PROCESS_SUSPENDED"),
    
    PROCESS_UPDATED("PROCESS_UPDATED"),
    
    SEQUENCE_FLOW_TAKEN("SEQUENCE_FLOW_TAKEN"),
    
    SIGNAL_RECEIVED("SIGNAL_RECEIVED"),
    
    TASK_ACTIVATED("TASK_ACTIVATED"),
    
    TASK_ASSIGNED("TASK_ASSIGNED"),
    
    TASK_CANCELLED("TASK_CANCELLED"),
    
    TASK_CANDIDATE_GROUP_ADDED("TASK_CANDIDATE_GROUP_ADDED"),
    
    TASK_CANDIDATE_GROUP_REMOVED("TASK_CANDIDATE_GROUP_REMOVED"),
    
    TASK_CANDIDATE_USER_ADDED("TASK_CANDIDATE_USER_ADDED"),
    
    TASK_CANDIDATE_USER_REMOVED("TASK_CANDIDATE_USER_REMOVED"),
    
    TASK_COMPLETED("TASK_COMPLETED"),
    
    TASK_CREATED("TASK_CREATED"),
    
    TASK_SUSPENDED("TASK_SUSPENDED"),
    
    TASK_UPDATED("TASK_UPDATED"),
    
    TIMER_CANCELLED("TIMER_CANCELLED"),
    
    TIMER_EXECUTED("TIMER_EXECUTED"),
    
    TIMER_FAILED("TIMER_FAILED"),
    
    TIMER_FIRED("TIMER_FIRED"),
    
    TIMER_RETRIES_DECREMENTED("TIMER_RETRIES_DECREMENTED"),
    
    TIMER_SCHEDULED("TIMER_SCHEDULED"),
    
    VARIABLE_CREATED("VARIABLE_CREATED"),
    
    VARIABLE_DELETED("VARIABLE_DELETED"),
    
    VARIABLE_UPDATED("VARIABLE_UPDATED");

    private String value;

    EventTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventTypeEnum fromValue(String text) {
      for (EventTypeEnum b : EventTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("eventType")
  private EventTypeEnum eventType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("messageId")
  private String messageId = null;

  @JsonProperty("parentProcessInstanceId")
  private String parentProcessInstanceId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionVersion")
  private Integer processDefinitionVersion = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("sequenceNumber")
  private Integer sequenceNumber = null;

  @JsonProperty("serviceFullName")
  private String serviceFullName = null;

  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("serviceVersion")
  private String serviceVersion = null;

  @JsonProperty("timestamp")
  private Long timestamp = null;

  public CloudRuntimeEventModel appName(String appName) {
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

  public CloudRuntimeEventModel appVersion(String appVersion) {
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

  public CloudRuntimeEventModel businessKey(String businessKey) {
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

  public CloudRuntimeEventModel entity(Object entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   * @return entity
   **/
  @ApiModelProperty(value = "")
  
    public Object getEntity() {
    return entity;
  }

  public void setEntity(Object entity) {
    this.entity = entity;
  }

  public CloudRuntimeEventModel entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
   **/
  @ApiModelProperty(value = "")
  
    public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public CloudRuntimeEventModel eventType(EventTypeEnum eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType
   * @return eventType
   **/
  @ApiModelProperty(value = "")
  
    public EventTypeEnum getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeEnum eventType) {
    this.eventType = eventType;
  }

  public CloudRuntimeEventModel id(String id) {
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

  public CloudRuntimeEventModel messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Get messageId
   * @return messageId
   **/
  @ApiModelProperty(value = "")
  
    public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public CloudRuntimeEventModel parentProcessInstanceId(String parentProcessInstanceId) {
    this.parentProcessInstanceId = parentProcessInstanceId;
    return this;
  }

  /**
   * Get parentProcessInstanceId
   * @return parentProcessInstanceId
   **/
  @ApiModelProperty(value = "")
  
    public String getParentProcessInstanceId() {
    return parentProcessInstanceId;
  }

  public void setParentProcessInstanceId(String parentProcessInstanceId) {
    this.parentProcessInstanceId = parentProcessInstanceId;
  }

  public CloudRuntimeEventModel processDefinitionId(String processDefinitionId) {
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

  public CloudRuntimeEventModel processDefinitionKey(String processDefinitionKey) {
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

  public CloudRuntimeEventModel processDefinitionVersion(Integer processDefinitionVersion) {
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

  public CloudRuntimeEventModel processInstanceId(String processInstanceId) {
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

  public CloudRuntimeEventModel sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * Get sequenceNumber
   * @return sequenceNumber
   **/
  @ApiModelProperty(value = "")
  
    public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public CloudRuntimeEventModel serviceFullName(String serviceFullName) {
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

  public CloudRuntimeEventModel serviceName(String serviceName) {
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

  public CloudRuntimeEventModel serviceType(String serviceType) {
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

  public CloudRuntimeEventModel serviceVersion(String serviceVersion) {
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

  public CloudRuntimeEventModel timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   **/
  @ApiModelProperty(value = "")
  
    public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudRuntimeEventModel cloudRuntimeEventModel = (CloudRuntimeEventModel) o;
    return Objects.equals(this.appName, cloudRuntimeEventModel.appName) &&
        Objects.equals(this.appVersion, cloudRuntimeEventModel.appVersion) &&
        Objects.equals(this.businessKey, cloudRuntimeEventModel.businessKey) &&
        Objects.equals(this.entity, cloudRuntimeEventModel.entity) &&
        Objects.equals(this.entityId, cloudRuntimeEventModel.entityId) &&
        Objects.equals(this.eventType, cloudRuntimeEventModel.eventType) &&
        Objects.equals(this.id, cloudRuntimeEventModel.id) &&
        Objects.equals(this.messageId, cloudRuntimeEventModel.messageId) &&
        Objects.equals(this.parentProcessInstanceId, cloudRuntimeEventModel.parentProcessInstanceId) &&
        Objects.equals(this.processDefinitionId, cloudRuntimeEventModel.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, cloudRuntimeEventModel.processDefinitionKey) &&
        Objects.equals(this.processDefinitionVersion, cloudRuntimeEventModel.processDefinitionVersion) &&
        Objects.equals(this.processInstanceId, cloudRuntimeEventModel.processInstanceId) &&
        Objects.equals(this.sequenceNumber, cloudRuntimeEventModel.sequenceNumber) &&
        Objects.equals(this.serviceFullName, cloudRuntimeEventModel.serviceFullName) &&
        Objects.equals(this.serviceName, cloudRuntimeEventModel.serviceName) &&
        Objects.equals(this.serviceType, cloudRuntimeEventModel.serviceType) &&
        Objects.equals(this.serviceVersion, cloudRuntimeEventModel.serviceVersion) &&
        Objects.equals(this.timestamp, cloudRuntimeEventModel.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appVersion, businessKey, entity, entityId, eventType, id, messageId, parentProcessInstanceId, processDefinitionId, processDefinitionKey, processDefinitionVersion, processInstanceId, sequenceNumber, serviceFullName, serviceName, serviceType, serviceVersion, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRuntimeEventModel {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    parentProcessInstanceId: ").append(toIndentedString(parentProcessInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    serviceFullName: ").append(toIndentedString(serviceFullName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
