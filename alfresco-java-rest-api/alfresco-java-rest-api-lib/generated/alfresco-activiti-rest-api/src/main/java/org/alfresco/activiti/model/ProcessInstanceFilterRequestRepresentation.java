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
import org.alfresco.activiti.model.ProcessInstanceFilterRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessInstanceFilterRequestRepresentation
 */
@Validated

public class ProcessInstanceFilterRequestRepresentation   {
  @JsonProperty("appDefinitionId")
  private Long appDefinitionId = null;

  @JsonProperty("filter")
  private ProcessInstanceFilterRepresentation filter = null;

  @JsonProperty("filterId")
  private Long filterId = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("size")
  private Integer size = null;

  public ProcessInstanceFilterRequestRepresentation appDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
    return this;
  }

  /**
   * Get appDefinitionId
   * @return appDefinitionId
  **/
  @ApiModelProperty(value = "")


  public Long getAppDefinitionId() {
    return appDefinitionId;
  }

  public void setAppDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
  }

  public ProcessInstanceFilterRequestRepresentation filter(ProcessInstanceFilterRepresentation filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProcessInstanceFilterRepresentation getFilter() {
    return filter;
  }

  public void setFilter(ProcessInstanceFilterRepresentation filter) {
    this.filter = filter;
  }

  public ProcessInstanceFilterRequestRepresentation filterId(Long filterId) {
    this.filterId = filterId;
    return this;
  }

  /**
   * Get filterId
   * @return filterId
  **/
  @ApiModelProperty(value = "")


  public Long getFilterId() {
    return filterId;
  }

  public void setFilterId(Long filterId) {
    this.filterId = filterId;
  }

  public ProcessInstanceFilterRequestRepresentation page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")


  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ProcessInstanceFilterRequestRepresentation size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceFilterRequestRepresentation processInstanceFilterRequestRepresentation = (ProcessInstanceFilterRequestRepresentation) o;
    return Objects.equals(this.appDefinitionId, processInstanceFilterRequestRepresentation.appDefinitionId) &&
        Objects.equals(this.filter, processInstanceFilterRequestRepresentation.filter) &&
        Objects.equals(this.filterId, processInstanceFilterRequestRepresentation.filterId) &&
        Objects.equals(this.page, processInstanceFilterRequestRepresentation.page) &&
        Objects.equals(this.size, processInstanceFilterRequestRepresentation.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinitionId, filter, filterId, page, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceFilterRequestRepresentation {\n");
    
    sb.append("    appDefinitionId: ").append(toIndentedString(appDefinitionId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

