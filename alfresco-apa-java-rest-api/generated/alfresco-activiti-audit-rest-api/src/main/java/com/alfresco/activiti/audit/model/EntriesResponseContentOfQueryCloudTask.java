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
import com.alfresco.activiti.audit.model.EntryResponseContentOfQueryCloudTask;
import com.alfresco.activiti.audit.model.PaginationMetadata;
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
 * EntriesResponseContentOfQueryCloudTask
 */
@Validated


public class EntriesResponseContentOfQueryCloudTask   {
  @JsonProperty("entries")
  @Valid
  private List<EntryResponseContentOfQueryCloudTask> entries = null;

  @JsonProperty("pagination")
  private PaginationMetadata pagination = null;

  public EntriesResponseContentOfQueryCloudTask entries(List<EntryResponseContentOfQueryCloudTask> entries) {
    this.entries = entries;
    return this;
  }

  public EntriesResponseContentOfQueryCloudTask addEntriesItem(EntryResponseContentOfQueryCloudTask entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Get entries
   * @return entries
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<EntryResponseContentOfQueryCloudTask> getEntries() {
    return entries;
  }

  public void setEntries(List<EntryResponseContentOfQueryCloudTask> entries) {
    this.entries = entries;
  }

  public EntriesResponseContentOfQueryCloudTask pagination(PaginationMetadata pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PaginationMetadata getPagination() {
    return pagination;
  }

  public void setPagination(PaginationMetadata pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntriesResponseContentOfQueryCloudTask entriesResponseContentOfQueryCloudTask = (EntriesResponseContentOfQueryCloudTask) o;
    return Objects.equals(this.entries, entriesResponseContentOfQueryCloudTask.entries) &&
        Objects.equals(this.pagination, entriesResponseContentOfQueryCloudTask.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntriesResponseContentOfQueryCloudTask {\n");
    
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
