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
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RemoveProcessVariablesPayload
 */
@Validated

public class RemoveProcessVariablesPayload   {
  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets payloadType
   */
  public enum PayloadTypeEnum {
    REMOVEPROCESSVARIABLESPAYLOAD("RemoveProcessVariablesPayload");

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

  @JsonProperty("variableNames")
  @Valid
  private List<String> variableNames = null;

  public RemoveProcessVariablesPayload id(String id) {
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

  public RemoveProcessVariablesPayload payloadType(PayloadTypeEnum payloadType) {
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

  public RemoveProcessVariablesPayload processInstanceId(String processInstanceId) {
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

  public RemoveProcessVariablesPayload variableNames(List<String> variableNames) {
    this.variableNames = variableNames;
    return this;
  }

  public RemoveProcessVariablesPayload addVariableNamesItem(String variableNamesItem) {
    if (this.variableNames == null) {
      this.variableNames = new ArrayList<>();
    }
    this.variableNames.add(variableNamesItem);
    return this;
  }

  /**
   * Get variableNames
   * @return variableNames
  **/
  @ApiModelProperty(value = "")


  public List<String> getVariableNames() {
    return variableNames;
  }

  public void setVariableNames(List<String> variableNames) {
    this.variableNames = variableNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveProcessVariablesPayload removeProcessVariablesPayload = (RemoveProcessVariablesPayload) o;
    return Objects.equals(this.id, removeProcessVariablesPayload.id) &&
        Objects.equals(this.payloadType, removeProcessVariablesPayload.payloadType) &&
        Objects.equals(this.processInstanceId, removeProcessVariablesPayload.processInstanceId) &&
        Objects.equals(this.variableNames, removeProcessVariablesPayload.variableNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, payloadType, processInstanceId, variableNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveProcessVariablesPayload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    variableNames: ").append(toIndentedString(variableNames)).append("\n");
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

