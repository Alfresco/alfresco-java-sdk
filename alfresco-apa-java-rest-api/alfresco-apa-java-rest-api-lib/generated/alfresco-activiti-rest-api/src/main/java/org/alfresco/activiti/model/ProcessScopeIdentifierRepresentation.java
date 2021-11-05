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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessScopeIdentifierRepresentation
 */
@Validated


public class ProcessScopeIdentifierRepresentation   {
  @JsonProperty("processActivityId")
  private String processActivityId = null;

  @JsonProperty("processModelId")
  private Long processModelId = null;

  public ProcessScopeIdentifierRepresentation processActivityId(String processActivityId) {
    this.processActivityId = processActivityId;
    return this;
  }

  /**
   * Get processActivityId
   * @return processActivityId
   **/
  @ApiModelProperty(value = "")
  
    public String getProcessActivityId() {
    return processActivityId;
  }

  public void setProcessActivityId(String processActivityId) {
    this.processActivityId = processActivityId;
  }

  public ProcessScopeIdentifierRepresentation processModelId(Long processModelId) {
    this.processModelId = processModelId;
    return this;
  }

  /**
   * Get processModelId
   * @return processModelId
   **/
  @ApiModelProperty(value = "")
  
    public Long getProcessModelId() {
    return processModelId;
  }

  public void setProcessModelId(Long processModelId) {
    this.processModelId = processModelId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessScopeIdentifierRepresentation processScopeIdentifierRepresentation = (ProcessScopeIdentifierRepresentation) o;
    return Objects.equals(this.processActivityId, processScopeIdentifierRepresentation.processActivityId) &&
        Objects.equals(this.processModelId, processScopeIdentifierRepresentation.processModelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processActivityId, processModelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessScopeIdentifierRepresentation {\n");
    
    sb.append("    processActivityId: ").append(toIndentedString(processActivityId)).append("\n");
    sb.append("    processModelId: ").append(toIndentedString(processModelId)).append("\n");
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
