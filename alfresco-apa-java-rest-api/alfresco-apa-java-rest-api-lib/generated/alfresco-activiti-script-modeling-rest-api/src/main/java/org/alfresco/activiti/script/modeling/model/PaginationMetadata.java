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
package org.alfresco.activiti.script.modeling.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaginationMetadata
 */
@Validated


public class PaginationMetadata   {
  @JsonProperty("count")
  private Long count = null;

  @JsonProperty("hasMoreItems")
  private Boolean hasMoreItems = null;

  @JsonProperty("maxItems")
  private Long maxItems = null;

  @JsonProperty("skipCount")
  private Long skipCount = null;

  @JsonProperty("totalItems")
  private Long totalItems = null;

  public PaginationMetadata count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
   **/
  @ApiModelProperty(value = "")
  
    public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public PaginationMetadata hasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
    return this;
  }

  /**
   * Get hasMoreItems
   * @return hasMoreItems
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isHasMoreItems() {
    return hasMoreItems;
  }

  public void setHasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
  }

  public PaginationMetadata maxItems(Long maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * Get maxItems
   * @return maxItems
   **/
  @ApiModelProperty(value = "")
  
    public Long getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Long maxItems) {
    this.maxItems = maxItems;
  }

  public PaginationMetadata skipCount(Long skipCount) {
    this.skipCount = skipCount;
    return this;
  }

  /**
   * Get skipCount
   * @return skipCount
   **/
  @ApiModelProperty(value = "")
  
    public Long getSkipCount() {
    return skipCount;
  }

  public void setSkipCount(Long skipCount) {
    this.skipCount = skipCount;
  }

  public PaginationMetadata totalItems(Long totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * Get totalItems
   * @return totalItems
   **/
  @ApiModelProperty(value = "")
  
    public Long getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Long totalItems) {
    this.totalItems = totalItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationMetadata paginationMetadata = (PaginationMetadata) o;
    return Objects.equals(this.count, paginationMetadata.count) &&
        Objects.equals(this.hasMoreItems, paginationMetadata.hasMoreItems) &&
        Objects.equals(this.maxItems, paginationMetadata.maxItems) &&
        Objects.equals(this.skipCount, paginationMetadata.skipCount) &&
        Objects.equals(this.totalItems, paginationMetadata.totalItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, hasMoreItems, maxItems, skipCount, totalItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationMetadata {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    hasMoreItems: ").append(toIndentedString(hasMoreItems)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    skipCount: ").append(toIndentedString(skipCount)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
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
