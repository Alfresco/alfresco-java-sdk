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
package com.alfresco.activiti.query.model;

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
 * JobExecution
 */
@Validated


public class JobExecution   {
  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  @JsonProperty("exitDescription")
  private String exitDescription = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("jobId")
  private Long jobId = null;

  @JsonProperty("jobName")
  private String jobName = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ABANDONED("ABANDONED"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED"),
    
    STARTED("STARTED"),
    
    STARTING("STARTING"),
    
    STOPPED("STOPPED"),
    
    STOPPING("STOPPING"),
    
    UNKNOWN("UNKNOWN");

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

  public JobExecution endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public JobExecution exitDescription(String exitDescription) {
    this.exitDescription = exitDescription;
    return this;
  }

  /**
   * Get exitDescription
   * @return exitDescription
   **/
  @ApiModelProperty(value = "")
  
    public String getExitDescription() {
    return exitDescription;
  }

  public void setExitDescription(String exitDescription) {
    this.exitDescription = exitDescription;
  }

  public JobExecution id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @ApiModelProperty(value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public JobExecution jobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
   **/
  @ApiModelProperty(value = "")
  
    public Long getJobId() {
    return jobId;
  }

  public void setJobId(Long jobId) {
    this.jobId = jobId;
  }

  public JobExecution jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * Get jobName
   * @return jobName
   **/
  @ApiModelProperty(value = "")
  
    public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public JobExecution startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public JobExecution status(StatusEnum status) {
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
    JobExecution jobExecution = (JobExecution) o;
    return Objects.equals(this.endTime, jobExecution.endTime) &&
        Objects.equals(this.exitDescription, jobExecution.exitDescription) &&
        Objects.equals(this.id, jobExecution.id) &&
        Objects.equals(this.jobId, jobExecution.jobId) &&
        Objects.equals(this.jobName, jobExecution.jobName) &&
        Objects.equals(this.startTime, jobExecution.startTime) &&
        Objects.equals(this.status, jobExecution.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, exitDescription, id, jobId, jobName, startTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobExecution {\n");
    
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    exitDescription: ").append(toIndentedString(exitDescription)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
