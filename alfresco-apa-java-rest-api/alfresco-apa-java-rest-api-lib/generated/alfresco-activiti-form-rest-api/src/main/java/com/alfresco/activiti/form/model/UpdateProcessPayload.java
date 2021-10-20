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
package com.alfresco.activiti.form.model;

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
 * UpdateProcessPayload
 */
@Validated


public class UpdateProcessPayload   {
  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets payloadType
   */
  public enum PayloadTypeEnum {
    UPDATEPROCESSPAYLOAD("UpdateProcessPayload");

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

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  public UpdateProcessPayload businessKey(String businessKey) {
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

  public UpdateProcessPayload description(String description) {
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

  public UpdateProcessPayload id(String id) {
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

  public UpdateProcessPayload name(String name) {
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

  public UpdateProcessPayload payloadType(PayloadTypeEnum payloadType) {
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

  public UpdateProcessPayload processInstanceId(String processInstanceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateProcessPayload updateProcessPayload = (UpdateProcessPayload) o;
    return Objects.equals(this.businessKey, updateProcessPayload.businessKey) &&
        Objects.equals(this.description, updateProcessPayload.description) &&
        Objects.equals(this.id, updateProcessPayload.id) &&
        Objects.equals(this.name, updateProcessPayload.name) &&
        Objects.equals(this.payloadType, updateProcessPayload.payloadType) &&
        Objects.equals(this.processInstanceId, updateProcessPayload.processInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessKey, description, id, name, payloadType, processInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateProcessPayload {\n");
    
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
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
