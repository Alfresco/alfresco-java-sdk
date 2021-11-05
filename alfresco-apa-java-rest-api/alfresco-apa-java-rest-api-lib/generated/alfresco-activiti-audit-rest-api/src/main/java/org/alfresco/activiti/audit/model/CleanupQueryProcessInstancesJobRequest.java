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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CleanupQueryProcessInstancesJobRequest
 */
@Validated


public class CleanupQueryProcessInstancesJobRequest   {
  @JsonProperty("async")
  private Boolean async = null;

  @JsonProperty("historicRetentionDays")
  private Integer historicRetentionDays = null;

  @JsonProperty("limitSize")
  private Integer limitSize = null;

  @JsonProperty("processDefinitionKeys")
  @Valid
  private List<String> processDefinitionKeys = null;

  public CleanupQueryProcessInstancesJobRequest async(Boolean async) {
    this.async = async;
    return this;
  }

  /**
   * Get async
   * @return async
   **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Boolean isAsync() {
    return async;
  }

  public void setAsync(Boolean async) {
    this.async = async;
  }

  public CleanupQueryProcessInstancesJobRequest historicRetentionDays(Integer historicRetentionDays) {
    this.historicRetentionDays = historicRetentionDays;
    return this;
  }

  /**
   * Get historicRetentionDays
   * @return historicRetentionDays
   **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getHistoricRetentionDays() {
    return historicRetentionDays;
  }

  public void setHistoricRetentionDays(Integer historicRetentionDays) {
    this.historicRetentionDays = historicRetentionDays;
  }

  public CleanupQueryProcessInstancesJobRequest limitSize(Integer limitSize) {
    this.limitSize = limitSize;
    return this;
  }

  /**
   * Get limitSize
   * @return limitSize
   **/
  @ApiModelProperty(value = "")
  
    public Integer getLimitSize() {
    return limitSize;
  }

  public void setLimitSize(Integer limitSize) {
    this.limitSize = limitSize;
  }

  public CleanupQueryProcessInstancesJobRequest processDefinitionKeys(List<String> processDefinitionKeys) {
    this.processDefinitionKeys = processDefinitionKeys;
    return this;
  }

  public CleanupQueryProcessInstancesJobRequest addProcessDefinitionKeysItem(String processDefinitionKeysItem) {
    if (this.processDefinitionKeys == null) {
      this.processDefinitionKeys = new ArrayList<>();
    }
    this.processDefinitionKeys.add(processDefinitionKeysItem);
    return this;
  }

  /**
   * Get processDefinitionKeys
   * @return processDefinitionKeys
   **/
  @ApiModelProperty(value = "")
  
    public List<String> getProcessDefinitionKeys() {
    return processDefinitionKeys;
  }

  public void setProcessDefinitionKeys(List<String> processDefinitionKeys) {
    this.processDefinitionKeys = processDefinitionKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanupQueryProcessInstancesJobRequest cleanupQueryProcessInstancesJobRequest = (CleanupQueryProcessInstancesJobRequest) o;
    return Objects.equals(this.async, cleanupQueryProcessInstancesJobRequest.async) &&
        Objects.equals(this.historicRetentionDays, cleanupQueryProcessInstancesJobRequest.historicRetentionDays) &&
        Objects.equals(this.limitSize, cleanupQueryProcessInstancesJobRequest.limitSize) &&
        Objects.equals(this.processDefinitionKeys, cleanupQueryProcessInstancesJobRequest.processDefinitionKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(async, historicRetentionDays, limitSize, processDefinitionKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanupQueryProcessInstancesJobRequest {\n");
    
    sb.append("    async: ").append(toIndentedString(async)).append("\n");
    sb.append("    historicRetentionDays: ").append(toIndentedString(historicRetentionDays)).append("\n");
    sb.append("    limitSize: ").append(toIndentedString(limitSize)).append("\n");
    sb.append("    processDefinitionKeys: ").append(toIndentedString(processDefinitionKeys)).append("\n");
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
