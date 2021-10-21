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
import com.alfresco.activiti.model.GoogleDriveContent;
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
 * ResultListDataRepresentationGoogleDriveContent
 */
@Validated


public class ResultListDataRepresentationGoogleDriveContent   {
  @JsonProperty("data")
  @Valid
  private List<GoogleDriveContent> data = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("total")
  private Integer total = null;

  public ResultListDataRepresentationGoogleDriveContent data(List<GoogleDriveContent> data) {
    this.data = data;
    return this;
  }

  public ResultListDataRepresentationGoogleDriveContent addDataItem(GoogleDriveContent dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<GoogleDriveContent> getData() {
    return data;
  }

  public void setData(List<GoogleDriveContent> data) {
    this.data = data;
  }

  public ResultListDataRepresentationGoogleDriveContent size(Integer size) {
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

  public ResultListDataRepresentationGoogleDriveContent start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   **/
  @ApiModelProperty(value = "")
  
    public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public ResultListDataRepresentationGoogleDriveContent total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   **/
  @ApiModelProperty(value = "")
  
    public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultListDataRepresentationGoogleDriveContent resultListDataRepresentationGoogleDriveContent = (ResultListDataRepresentationGoogleDriveContent) o;
    return Objects.equals(this.data, resultListDataRepresentationGoogleDriveContent.data) &&
        Objects.equals(this.size, resultListDataRepresentationGoogleDriveContent.size) &&
        Objects.equals(this.start, resultListDataRepresentationGoogleDriveContent.start) &&
        Objects.equals(this.total, resultListDataRepresentationGoogleDriveContent.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, size, start, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListDataRepresentationGoogleDriveContent {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
