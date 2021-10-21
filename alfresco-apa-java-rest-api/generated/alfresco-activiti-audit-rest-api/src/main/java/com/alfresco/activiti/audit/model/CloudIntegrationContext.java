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
package com.alfresco.activiti.audit.model;

import java.util.Objects;
import com.alfresco.activiti.audit.model.StackTraceElement;
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
 * CloudIntegrationContext
 */
@Validated


public class CloudIntegrationContext   {
  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("appVersion")
  private String appVersion = null;

  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("clientName")
  private String clientName = null;

  @JsonProperty("clientType")
  private String clientType = null;

  @JsonProperty("connectorType")
  private String connectorType = null;

  @JsonProperty("errorClassName")
  private String errorClassName = null;

  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorDate")
  private OffsetDateTime errorDate = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("inBoundVariables")
  private Object inBoundVariables = null;

  @JsonProperty("outBoundVariables")
  private Object outBoundVariables = null;

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

  @JsonProperty("requestDate")
  private OffsetDateTime requestDate = null;

  @JsonProperty("resultDate")
  private OffsetDateTime resultDate = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  @JsonProperty("serviceFullName")
  private String serviceFullName = null;

  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("serviceVersion")
  private String serviceVersion = null;

  @JsonProperty("stackTraceElements")
  @Valid
  private List<StackTraceElement> stackTraceElements = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ERROR_RECEIVED("INTEGRATION_ERROR_RECEIVED"),
    
    REQUESTED("INTEGRATION_REQUESTED"),
    
    RESULT_RECEIVED("INTEGRATION_RESULT_RECEIVED");

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

  public CloudIntegrationContext appName(String appName) {
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

  public CloudIntegrationContext appVersion(String appVersion) {
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

  public CloudIntegrationContext businessKey(String businessKey) {
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

  public CloudIntegrationContext clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   **/
  @ApiModelProperty(value = "")
  
    public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public CloudIntegrationContext clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * Get clientName
   * @return clientName
   **/
  @ApiModelProperty(value = "")
  
    public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public CloudIntegrationContext clientType(String clientType) {
    this.clientType = clientType;
    return this;
  }

  /**
   * Get clientType
   * @return clientType
   **/
  @ApiModelProperty(value = "")
  
    public String getClientType() {
    return clientType;
  }

  public void setClientType(String clientType) {
    this.clientType = clientType;
  }

  public CloudIntegrationContext connectorType(String connectorType) {
    this.connectorType = connectorType;
    return this;
  }

  /**
   * Get connectorType
   * @return connectorType
   **/
  @ApiModelProperty(value = "")
  
    public String getConnectorType() {
    return connectorType;
  }

  public void setConnectorType(String connectorType) {
    this.connectorType = connectorType;
  }

  public CloudIntegrationContext errorClassName(String errorClassName) {
    this.errorClassName = errorClassName;
    return this;
  }

  /**
   * Get errorClassName
   * @return errorClassName
   **/
  @ApiModelProperty(value = "")
  
    public String getErrorClassName() {
    return errorClassName;
  }

  public void setErrorClassName(String errorClassName) {
    this.errorClassName = errorClassName;
  }

  public CloudIntegrationContext errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   **/
  @ApiModelProperty(value = "")
  
    public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public CloudIntegrationContext errorDate(OffsetDateTime errorDate) {
    this.errorDate = errorDate;
    return this;
  }

  /**
   * Get errorDate
   * @return errorDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getErrorDate() {
    return errorDate;
  }

  public void setErrorDate(OffsetDateTime errorDate) {
    this.errorDate = errorDate;
  }

  public CloudIntegrationContext errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   **/
  @ApiModelProperty(value = "")
  
    public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public CloudIntegrationContext executionId(String executionId) {
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

  public CloudIntegrationContext id(String id) {
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

  public CloudIntegrationContext inBoundVariables(Object inBoundVariables) {
    this.inBoundVariables = inBoundVariables;
    return this;
  }

  /**
   * Get inBoundVariables
   * @return inBoundVariables
   **/
  @ApiModelProperty(value = "")
  
    public Object getInBoundVariables() {
    return inBoundVariables;
  }

  public void setInBoundVariables(Object inBoundVariables) {
    this.inBoundVariables = inBoundVariables;
  }

  public CloudIntegrationContext outBoundVariables(Object outBoundVariables) {
    this.outBoundVariables = outBoundVariables;
    return this;
  }

  /**
   * Get outBoundVariables
   * @return outBoundVariables
   **/
  @ApiModelProperty(value = "")
  
    public Object getOutBoundVariables() {
    return outBoundVariables;
  }

  public void setOutBoundVariables(Object outBoundVariables) {
    this.outBoundVariables = outBoundVariables;
  }

  public CloudIntegrationContext parentProcessInstanceId(String parentProcessInstanceId) {
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

  public CloudIntegrationContext processDefinitionId(String processDefinitionId) {
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

  public CloudIntegrationContext processDefinitionKey(String processDefinitionKey) {
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

  public CloudIntegrationContext processDefinitionVersion(Integer processDefinitionVersion) {
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

  public CloudIntegrationContext processInstanceId(String processInstanceId) {
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

  public CloudIntegrationContext requestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
    return this;
  }

  /**
   * Get requestDate
   * @return requestDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getRequestDate() {
    return requestDate;
  }

  public void setRequestDate(OffsetDateTime requestDate) {
    this.requestDate = requestDate;
  }

  public CloudIntegrationContext resultDate(OffsetDateTime resultDate) {
    this.resultDate = resultDate;
    return this;
  }

  /**
   * Get resultDate
   * @return resultDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getResultDate() {
    return resultDate;
  }

  public void setResultDate(OffsetDateTime resultDate) {
    this.resultDate = resultDate;
  }

  public CloudIntegrationContext rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * Get rootProcessInstanceId
   * @return rootProcessInstanceId
   **/
  @ApiModelProperty(value = "")
  
    public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  public CloudIntegrationContext serviceFullName(String serviceFullName) {
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

  public CloudIntegrationContext serviceName(String serviceName) {
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

  public CloudIntegrationContext serviceType(String serviceType) {
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

  public CloudIntegrationContext serviceVersion(String serviceVersion) {
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

  public CloudIntegrationContext stackTraceElements(List<StackTraceElement> stackTraceElements) {
    this.stackTraceElements = stackTraceElements;
    return this;
  }

  public CloudIntegrationContext addStackTraceElementsItem(StackTraceElement stackTraceElementsItem) {
    if (this.stackTraceElements == null) {
      this.stackTraceElements = new ArrayList<>();
    }
    this.stackTraceElements.add(stackTraceElementsItem);
    return this;
  }

  /**
   * Get stackTraceElements
   * @return stackTraceElements
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<StackTraceElement> getStackTraceElements() {
    return stackTraceElements;
  }

  public void setStackTraceElements(List<StackTraceElement> stackTraceElements) {
    this.stackTraceElements = stackTraceElements;
  }

  public CloudIntegrationContext status(StatusEnum status) {
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
    CloudIntegrationContext cloudIntegrationContext = (CloudIntegrationContext) o;
    return Objects.equals(this.appName, cloudIntegrationContext.appName) &&
        Objects.equals(this.appVersion, cloudIntegrationContext.appVersion) &&
        Objects.equals(this.businessKey, cloudIntegrationContext.businessKey) &&
        Objects.equals(this.clientId, cloudIntegrationContext.clientId) &&
        Objects.equals(this.clientName, cloudIntegrationContext.clientName) &&
        Objects.equals(this.clientType, cloudIntegrationContext.clientType) &&
        Objects.equals(this.connectorType, cloudIntegrationContext.connectorType) &&
        Objects.equals(this.errorClassName, cloudIntegrationContext.errorClassName) &&
        Objects.equals(this.errorCode, cloudIntegrationContext.errorCode) &&
        Objects.equals(this.errorDate, cloudIntegrationContext.errorDate) &&
        Objects.equals(this.errorMessage, cloudIntegrationContext.errorMessage) &&
        Objects.equals(this.executionId, cloudIntegrationContext.executionId) &&
        Objects.equals(this.id, cloudIntegrationContext.id) &&
        Objects.equals(this.inBoundVariables, cloudIntegrationContext.inBoundVariables) &&
        Objects.equals(this.outBoundVariables, cloudIntegrationContext.outBoundVariables) &&
        Objects.equals(this.parentProcessInstanceId, cloudIntegrationContext.parentProcessInstanceId) &&
        Objects.equals(this.processDefinitionId, cloudIntegrationContext.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, cloudIntegrationContext.processDefinitionKey) &&
        Objects.equals(this.processDefinitionVersion, cloudIntegrationContext.processDefinitionVersion) &&
        Objects.equals(this.processInstanceId, cloudIntegrationContext.processInstanceId) &&
        Objects.equals(this.requestDate, cloudIntegrationContext.requestDate) &&
        Objects.equals(this.resultDate, cloudIntegrationContext.resultDate) &&
        Objects.equals(this.rootProcessInstanceId, cloudIntegrationContext.rootProcessInstanceId) &&
        Objects.equals(this.serviceFullName, cloudIntegrationContext.serviceFullName) &&
        Objects.equals(this.serviceName, cloudIntegrationContext.serviceName) &&
        Objects.equals(this.serviceType, cloudIntegrationContext.serviceType) &&
        Objects.equals(this.serviceVersion, cloudIntegrationContext.serviceVersion) &&
        Objects.equals(this.stackTraceElements, cloudIntegrationContext.stackTraceElements) &&
        Objects.equals(this.status, cloudIntegrationContext.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appVersion, businessKey, clientId, clientName, clientType, connectorType, errorClassName, errorCode, errorDate, errorMessage, executionId, id, inBoundVariables, outBoundVariables, parentProcessInstanceId, processDefinitionId, processDefinitionKey, processDefinitionVersion, processInstanceId, requestDate, resultDate, rootProcessInstanceId, serviceFullName, serviceName, serviceType, serviceVersion, stackTraceElements, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudIntegrationContext {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    errorClassName: ").append(toIndentedString(errorClassName)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDate: ").append(toIndentedString(errorDate)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inBoundVariables: ").append(toIndentedString(inBoundVariables)).append("\n");
    sb.append("    outBoundVariables: ").append(toIndentedString(outBoundVariables)).append("\n");
    sb.append("    parentProcessInstanceId: ").append(toIndentedString(parentProcessInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionVersion: ").append(toIndentedString(processDefinitionVersion)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    requestDate: ").append(toIndentedString(requestDate)).append("\n");
    sb.append("    resultDate: ").append(toIndentedString(resultDate)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    serviceFullName: ").append(toIndentedString(serviceFullName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    stackTraceElements: ").append(toIndentedString(stackTraceElements)).append("\n");
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
