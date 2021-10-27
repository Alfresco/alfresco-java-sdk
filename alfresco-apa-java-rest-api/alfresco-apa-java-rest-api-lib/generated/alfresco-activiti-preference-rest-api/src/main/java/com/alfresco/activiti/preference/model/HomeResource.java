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
package com.alfresco.activiti.preference.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HomeResource
 */
@Validated


public class HomeResource   {
  @JsonProperty("welcome")
  private String welcome = null;

  public HomeResource welcome(String welcome) {
    this.welcome = welcome;
    return this;
  }

  /**
   * Get welcome
   * @return welcome
   **/
  @ApiModelProperty(value = "")
  
    public String getWelcome() {
    return welcome;
  }

  public void setWelcome(String welcome) {
    this.welcome = welcome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeResource homeResource = (HomeResource) o;
    return Objects.equals(this.welcome, homeResource.welcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(welcome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeResource {\n");
    
    sb.append("    welcome: ").append(toIndentedString(welcome)).append("\n");
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
