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
import com.alfresco.activiti.model.AppDefinitionRepresentation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppDefinitionUpdateResultRepresentation
 */
@Validated


public class AppDefinitionUpdateResultRepresentation   {
  @JsonProperty("appDefinition")
  private AppDefinitionRepresentation appDefinition = null;

  @JsonProperty("customData")
  private Object customData = null;

  @JsonProperty("error")
  private Boolean error = null;

  @JsonProperty("errorDescription")
  private String errorDescription = null;

  @JsonProperty("errorType")
  private Integer errorType = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("messageKey")
  private String messageKey = null;

  public AppDefinitionUpdateResultRepresentation appDefinition(AppDefinitionRepresentation appDefinition) {
    this.appDefinition = appDefinition;
    return this;
  }

  /**
   * Get appDefinition
   * @return appDefinition
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AppDefinitionRepresentation getAppDefinition() {
    return appDefinition;
  }

  public void setAppDefinition(AppDefinitionRepresentation appDefinition) {
    this.appDefinition = appDefinition;
  }

  public AppDefinitionUpdateResultRepresentation customData(Object customData) {
    this.customData = customData;
    return this;
  }

  /**
   * Get customData
   * @return customData
   **/
  @ApiModelProperty(value = "")
  
    public Object getCustomData() {
    return customData;
  }

  public void setCustomData(Object customData) {
    this.customData = customData;
  }

  public AppDefinitionUpdateResultRepresentation error(Boolean error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public AppDefinitionUpdateResultRepresentation errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Get errorDescription
   * @return errorDescription
   **/
  @ApiModelProperty(value = "")
  
    public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public AppDefinitionUpdateResultRepresentation errorType(Integer errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Get errorType
   * @return errorType
   **/
  @ApiModelProperty(value = "")
  
    public Integer getErrorType() {
    return errorType;
  }

  public void setErrorType(Integer errorType) {
    this.errorType = errorType;
  }

  public AppDefinitionUpdateResultRepresentation message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @ApiModelProperty(value = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AppDefinitionUpdateResultRepresentation messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  /**
   * Get messageKey
   * @return messageKey
   **/
  @ApiModelProperty(value = "")
  
    public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDefinitionUpdateResultRepresentation appDefinitionUpdateResultRepresentation = (AppDefinitionUpdateResultRepresentation) o;
    return Objects.equals(this.appDefinition, appDefinitionUpdateResultRepresentation.appDefinition) &&
        Objects.equals(this.customData, appDefinitionUpdateResultRepresentation.customData) &&
        Objects.equals(this.error, appDefinitionUpdateResultRepresentation.error) &&
        Objects.equals(this.errorDescription, appDefinitionUpdateResultRepresentation.errorDescription) &&
        Objects.equals(this.errorType, appDefinitionUpdateResultRepresentation.errorType) &&
        Objects.equals(this.message, appDefinitionUpdateResultRepresentation.message) &&
        Objects.equals(this.messageKey, appDefinitionUpdateResultRepresentation.messageKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinition, customData, error, errorDescription, errorType, message, messageKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDefinitionUpdateResultRepresentation {\n");
    
    sb.append("    appDefinition: ").append(toIndentedString(appDefinition)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
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
