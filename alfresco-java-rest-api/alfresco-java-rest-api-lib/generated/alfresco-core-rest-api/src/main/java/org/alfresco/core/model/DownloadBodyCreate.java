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
package org.alfresco.core.model;

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
 * DownloadBodyCreate
 */
@Validated


public class DownloadBodyCreate   {
  @JsonProperty("nodeIds")
  @Valid
  private List<String> nodeIds = new ArrayList<>();

  public DownloadBodyCreate nodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
    return this;
  }

  public DownloadBodyCreate addNodeIdsItem(String nodeIdsItem) {
    this.nodeIds.add(nodeIdsItem);
    return this;
  }

  /**
   * Get nodeIds
   * @return nodeIds
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public List<String> getNodeIds() {
    return nodeIds;
  }

  public void setNodeIds(List<String> nodeIds) {
    this.nodeIds = nodeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadBodyCreate downloadBodyCreate = (DownloadBodyCreate) o;
    return Objects.equals(this.nodeIds, downloadBodyCreate.nodeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadBodyCreate {\n");
    
    sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
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

