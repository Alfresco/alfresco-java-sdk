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
import com.alfresco.activiti.query.model.EntriesResponseContentOfCloudApplication;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ListResponseContentOfCloudApplication
 */
@Validated


public class ListResponseContentOfCloudApplication   {
  @JsonProperty("list")
  private EntriesResponseContentOfCloudApplication list = null;

  public ListResponseContentOfCloudApplication list(EntriesResponseContentOfCloudApplication list) {
    this.list = list;
    return this;
  }

  /**
   * Get list
   * @return list
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EntriesResponseContentOfCloudApplication getList() {
    return list;
  }

  public void setList(EntriesResponseContentOfCloudApplication list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResponseContentOfCloudApplication listResponseContentOfCloudApplication = (ListResponseContentOfCloudApplication) o;
    return Objects.equals(this.list, listResponseContentOfCloudApplication.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResponseContentOfCloudApplication {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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