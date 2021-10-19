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
 * PostgresqlVariablesRepresentation
 */
@Validated

public class PostgresqlVariablesRepresentation   {
  @JsonProperty("jpaDatabasePlatform")
  private String jpaDatabasePlatform = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("username")
  private String username = null;

  public PostgresqlVariablesRepresentation jpaDatabasePlatform(String jpaDatabasePlatform) {
    this.jpaDatabasePlatform = jpaDatabasePlatform;
    return this;
  }

  /**
   * Get jpaDatabasePlatform
   * @return jpaDatabasePlatform
  **/
  @ApiModelProperty(value = "")


  public String getJpaDatabasePlatform() {
    return jpaDatabasePlatform;
  }

  public void setJpaDatabasePlatform(String jpaDatabasePlatform) {
    this.jpaDatabasePlatform = jpaDatabasePlatform;
  }

  public PostgresqlVariablesRepresentation url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PostgresqlVariablesRepresentation username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostgresqlVariablesRepresentation postgresqlVariablesRepresentation = (PostgresqlVariablesRepresentation) o;
    return Objects.equals(this.jpaDatabasePlatform, postgresqlVariablesRepresentation.jpaDatabasePlatform) &&
        Objects.equals(this.url, postgresqlVariablesRepresentation.url) &&
        Objects.equals(this.username, postgresqlVariablesRepresentation.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jpaDatabasePlatform, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostgresqlVariablesRepresentation {\n");
    
    sb.append("    jpaDatabasePlatform: ").append(toIndentedString(jpaDatabasePlatform)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

