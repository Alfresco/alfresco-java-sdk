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
package com.alfresco.activiti.deployment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicationLog
 */
@Validated


public class ApplicationLog   {
  @JsonProperty("applicationName")
  private String applicationName = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("serviceName")
  private String serviceName = null;

  public ApplicationLog applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

  /**
   * Get applicationName
   * @return applicationName
   **/
  @ApiModelProperty(value = "")
  
    public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public ApplicationLog content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @ApiModelProperty(value = "")
  
    public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ApplicationLog serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   **/
  @ApiModelProperty(value = "")
  
    public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationLog applicationLog = (ApplicationLog) o;
    return Objects.equals(this.applicationName, applicationLog.applicationName) &&
        Objects.equals(this.content, applicationLog.content) &&
        Objects.equals(this.serviceName, applicationLog.serviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationName, content, serviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationLog {\n");
    
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
