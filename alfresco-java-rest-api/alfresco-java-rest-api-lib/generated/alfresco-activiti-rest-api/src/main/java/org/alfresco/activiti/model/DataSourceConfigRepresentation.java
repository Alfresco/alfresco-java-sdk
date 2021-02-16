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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataSourceConfigRepresentation
 */
@Validated

public class DataSourceConfigRepresentation   {
  @JsonProperty("driverClass")
  private String driverClass = null;

  @JsonProperty("jdbcUrl")
  private String jdbcUrl = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("username")
  private String username = null;

  public DataSourceConfigRepresentation driverClass(String driverClass) {
    this.driverClass = driverClass;
    return this;
  }

  /**
   * Get driverClass
   * @return driverClass
  **/
  @ApiModelProperty(value = "")


  public String getDriverClass() {
    return driverClass;
  }

  public void setDriverClass(String driverClass) {
    this.driverClass = driverClass;
  }

  public DataSourceConfigRepresentation jdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
    return this;
  }

  /**
   * Get jdbcUrl
   * @return jdbcUrl
  **/
  @ApiModelProperty(value = "")


  public String getJdbcUrl() {
    return jdbcUrl;
  }

  public void setJdbcUrl(String jdbcUrl) {
    this.jdbcUrl = jdbcUrl;
  }

  public DataSourceConfigRepresentation password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DataSourceConfigRepresentation username(String username) {
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
    DataSourceConfigRepresentation dataSourceConfigRepresentation = (DataSourceConfigRepresentation) o;
    return Objects.equals(this.driverClass, dataSourceConfigRepresentation.driverClass) &&
        Objects.equals(this.jdbcUrl, dataSourceConfigRepresentation.jdbcUrl) &&
        Objects.equals(this.password, dataSourceConfigRepresentation.password) &&
        Objects.equals(this.username, dataSourceConfigRepresentation.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverClass, jdbcUrl, password, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSourceConfigRepresentation {\n");
    
    sb.append("    driverClass: ").append(toIndentedString(driverClass)).append("\n");
    sb.append("    jdbcUrl: ").append(toIndentedString(jdbcUrl)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

