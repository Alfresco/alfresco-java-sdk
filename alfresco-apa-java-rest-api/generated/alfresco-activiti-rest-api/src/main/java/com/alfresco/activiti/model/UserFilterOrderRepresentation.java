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
 * UserFilterOrderRepresentation
 */
@Validated


public class UserFilterOrderRepresentation   {
  @JsonProperty("appId")
  private Long appId = null;

  @JsonProperty("order")
  @Valid
  private List<Long> order = null;

  public UserFilterOrderRepresentation appId(Long appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   * @return appId
   **/
  @ApiModelProperty(value = "")
  
    public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }

  public UserFilterOrderRepresentation order(List<Long> order) {
    this.order = order;
    return this;
  }

  public UserFilterOrderRepresentation addOrderItem(Long orderItem) {
    if (this.order == null) {
      this.order = new ArrayList<>();
    }
    this.order.add(orderItem);
    return this;
  }

  /**
   * Get order
   * @return order
   **/
  @ApiModelProperty(value = "")
  
    public List<Long> getOrder() {
    return order;
  }

  public void setOrder(List<Long> order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFilterOrderRepresentation userFilterOrderRepresentation = (UserFilterOrderRepresentation) o;
    return Objects.equals(this.appId, userFilterOrderRepresentation.appId) &&
        Objects.equals(this.order, userFilterOrderRepresentation.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFilterOrderRepresentation {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
