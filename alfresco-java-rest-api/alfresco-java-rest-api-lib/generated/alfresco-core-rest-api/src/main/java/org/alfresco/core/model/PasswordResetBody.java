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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PasswordResetBody
 */
@Validated


public class PasswordResetBody   {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("key")
  private String key = null;

  public PasswordResetBody password(String password) {
    this.password = password;
    return this;
  }

  /**
   * the new password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "the new password")
  @NotNull



  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PasswordResetBody id(String id) {
    this.id = id;
    return this;
  }

  /**
   * the workflow id provided in the reset password email
   * @return id
  **/
  @ApiModelProperty(required = true, value = "the workflow id provided in the reset password email")
  @NotNull



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PasswordResetBody key(String key) {
    this.key = key;
    return this;
  }

  /**
   * the workflow key provided in the reset password email
   * @return key
  **/
  @ApiModelProperty(required = true, value = "the workflow key provided in the reset password email")
  @NotNull



  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordResetBody passwordResetBody = (PasswordResetBody) o;
    return Objects.equals(this.password, passwordResetBody.password) &&
        Objects.equals(this.id, passwordResetBody.id) &&
        Objects.equals(this.key, passwordResetBody.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, id, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordResetBody {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

