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
package org.alfresco.activiti.preference.model;

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
 * CandidateUsersPayload
 */
@Validated


public class CandidateUsersPayload   {
  @JsonProperty("candidateUsers")
  @Valid
  private List<String> candidateUsers = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets payloadType
   */
  public enum PayloadTypeEnum {
    CANDIDATEUSERSPAYLOAD("CandidateUsersPayload");

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

  @JsonProperty("taskId")
  private String taskId = null;

  public CandidateUsersPayload candidateUsers(List<String> candidateUsers) {
    this.candidateUsers = candidateUsers;
    return this;
  }

  public CandidateUsersPayload addCandidateUsersItem(String candidateUsersItem) {
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

  public CandidateUsersPayload id(String id) {
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

  public CandidateUsersPayload payloadType(PayloadTypeEnum payloadType) {
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

  public CandidateUsersPayload taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   **/
  @ApiModelProperty(value = "")
  
    public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateUsersPayload candidateUsersPayload = (CandidateUsersPayload) o;
    return Objects.equals(this.candidateUsers, candidateUsersPayload.candidateUsers) &&
        Objects.equals(this.id, candidateUsersPayload.id) &&
        Objects.equals(this.payloadType, candidateUsersPayload.payloadType) &&
        Objects.equals(this.taskId, candidateUsersPayload.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(candidateUsers, id, payloadType, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateUsersPayload {\n");
    
    sb.append("    candidateUsers: ").append(toIndentedString(candidateUsers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
