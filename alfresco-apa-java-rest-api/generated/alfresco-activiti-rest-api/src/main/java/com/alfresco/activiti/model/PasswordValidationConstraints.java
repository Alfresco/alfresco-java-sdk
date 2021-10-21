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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PasswordValidationConstraints
 */
@Validated


public class PasswordValidationConstraints   {
  @JsonProperty("minLength")
  private Integer minLength = null;

  @JsonProperty("passwordCriteriaMessage")
  private String passwordCriteriaMessage = null;

  @JsonProperty("regularExpression")
  private String regularExpression = null;

  public PasswordValidationConstraints minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Get minLength
   * @return minLength
   **/
  @ApiModelProperty(value = "")
  
    public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public PasswordValidationConstraints passwordCriteriaMessage(String passwordCriteriaMessage) {
    this.passwordCriteriaMessage = passwordCriteriaMessage;
    return this;
  }

  /**
   * Get passwordCriteriaMessage
   * @return passwordCriteriaMessage
   **/
  @ApiModelProperty(value = "")
  
    public String getPasswordCriteriaMessage() {
    return passwordCriteriaMessage;
  }

  public void setPasswordCriteriaMessage(String passwordCriteriaMessage) {
    this.passwordCriteriaMessage = passwordCriteriaMessage;
  }

  public PasswordValidationConstraints regularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
    return this;
  }

  /**
   * Get regularExpression
   * @return regularExpression
   **/
  @ApiModelProperty(value = "")
  
    public String getRegularExpression() {
    return regularExpression;
  }

  public void setRegularExpression(String regularExpression) {
    this.regularExpression = regularExpression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordValidationConstraints passwordValidationConstraints = (PasswordValidationConstraints) o;
    return Objects.equals(this.minLength, passwordValidationConstraints.minLength) &&
        Objects.equals(this.passwordCriteriaMessage, passwordValidationConstraints.passwordCriteriaMessage) &&
        Objects.equals(this.regularExpression, passwordValidationConstraints.regularExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minLength, passwordCriteriaMessage, regularExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordValidationConstraints {\n");
    
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    passwordCriteriaMessage: ").append(toIndentedString(passwordCriteriaMessage)).append("\n");
    sb.append("    regularExpression: ").append(toIndentedString(regularExpression)).append("\n");
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
