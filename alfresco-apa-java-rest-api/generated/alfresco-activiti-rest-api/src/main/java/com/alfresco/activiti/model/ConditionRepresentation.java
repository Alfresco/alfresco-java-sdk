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
import com.alfresco.activiti.model.ConditionRepresentation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConditionRepresentation
 */
@Validated


public class ConditionRepresentation   {
  @JsonProperty("leftFormFieldId")
  private String leftFormFieldId = null;

  @JsonProperty("leftRestResponseId")
  private String leftRestResponseId = null;

  @JsonProperty("nextCondition")
  private ConditionRepresentation nextCondition = null;

  @JsonProperty("nextConditionOperator")
  private String nextConditionOperator = null;

  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("rightFormFieldId")
  private String rightFormFieldId = null;

  @JsonProperty("rightRestResponseId")
  private String rightRestResponseId = null;

  @JsonProperty("rightType")
  private String rightType = null;

  @JsonProperty("rightValue")
  private Object rightValue = null;

  public ConditionRepresentation leftFormFieldId(String leftFormFieldId) {
    this.leftFormFieldId = leftFormFieldId;
    return this;
  }

  /**
   * Get leftFormFieldId
   * @return leftFormFieldId
   **/
  @ApiModelProperty(value = "")
  
    public String getLeftFormFieldId() {
    return leftFormFieldId;
  }

  public void setLeftFormFieldId(String leftFormFieldId) {
    this.leftFormFieldId = leftFormFieldId;
  }

  public ConditionRepresentation leftRestResponseId(String leftRestResponseId) {
    this.leftRestResponseId = leftRestResponseId;
    return this;
  }

  /**
   * Get leftRestResponseId
   * @return leftRestResponseId
   **/
  @ApiModelProperty(value = "")
  
    public String getLeftRestResponseId() {
    return leftRestResponseId;
  }

  public void setLeftRestResponseId(String leftRestResponseId) {
    this.leftRestResponseId = leftRestResponseId;
  }

  public ConditionRepresentation nextCondition(ConditionRepresentation nextCondition) {
    this.nextCondition = nextCondition;
    return this;
  }

  /**
   * Get nextCondition
   * @return nextCondition
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConditionRepresentation getNextCondition() {
    return nextCondition;
  }

  public void setNextCondition(ConditionRepresentation nextCondition) {
    this.nextCondition = nextCondition;
  }

  public ConditionRepresentation nextConditionOperator(String nextConditionOperator) {
    this.nextConditionOperator = nextConditionOperator;
    return this;
  }

  /**
   * Get nextConditionOperator
   * @return nextConditionOperator
   **/
  @ApiModelProperty(value = "")
  
    public String getNextConditionOperator() {
    return nextConditionOperator;
  }

  public void setNextConditionOperator(String nextConditionOperator) {
    this.nextConditionOperator = nextConditionOperator;
  }

  public ConditionRepresentation operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   **/
  @ApiModelProperty(value = "")
  
    public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public ConditionRepresentation rightFormFieldId(String rightFormFieldId) {
    this.rightFormFieldId = rightFormFieldId;
    return this;
  }

  /**
   * Get rightFormFieldId
   * @return rightFormFieldId
   **/
  @ApiModelProperty(value = "")
  
    public String getRightFormFieldId() {
    return rightFormFieldId;
  }

  public void setRightFormFieldId(String rightFormFieldId) {
    this.rightFormFieldId = rightFormFieldId;
  }

  public ConditionRepresentation rightRestResponseId(String rightRestResponseId) {
    this.rightRestResponseId = rightRestResponseId;
    return this;
  }

  /**
   * Get rightRestResponseId
   * @return rightRestResponseId
   **/
  @ApiModelProperty(value = "")
  
    public String getRightRestResponseId() {
    return rightRestResponseId;
  }

  public void setRightRestResponseId(String rightRestResponseId) {
    this.rightRestResponseId = rightRestResponseId;
  }

  public ConditionRepresentation rightType(String rightType) {
    this.rightType = rightType;
    return this;
  }

  /**
   * Get rightType
   * @return rightType
   **/
  @ApiModelProperty(value = "")
  
    public String getRightType() {
    return rightType;
  }

  public void setRightType(String rightType) {
    this.rightType = rightType;
  }

  public ConditionRepresentation rightValue(Object rightValue) {
    this.rightValue = rightValue;
    return this;
  }

  /**
   * Get rightValue
   * @return rightValue
   **/
  @ApiModelProperty(value = "")
  
    public Object getRightValue() {
    return rightValue;
  }

  public void setRightValue(Object rightValue) {
    this.rightValue = rightValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionRepresentation conditionRepresentation = (ConditionRepresentation) o;
    return Objects.equals(this.leftFormFieldId, conditionRepresentation.leftFormFieldId) &&
        Objects.equals(this.leftRestResponseId, conditionRepresentation.leftRestResponseId) &&
        Objects.equals(this.nextCondition, conditionRepresentation.nextCondition) &&
        Objects.equals(this.nextConditionOperator, conditionRepresentation.nextConditionOperator) &&
        Objects.equals(this.operator, conditionRepresentation.operator) &&
        Objects.equals(this.rightFormFieldId, conditionRepresentation.rightFormFieldId) &&
        Objects.equals(this.rightRestResponseId, conditionRepresentation.rightRestResponseId) &&
        Objects.equals(this.rightType, conditionRepresentation.rightType) &&
        Objects.equals(this.rightValue, conditionRepresentation.rightValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftFormFieldId, leftRestResponseId, nextCondition, nextConditionOperator, operator, rightFormFieldId, rightRestResponseId, rightType, rightValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionRepresentation {\n");
    
    sb.append("    leftFormFieldId: ").append(toIndentedString(leftFormFieldId)).append("\n");
    sb.append("    leftRestResponseId: ").append(toIndentedString(leftRestResponseId)).append("\n");
    sb.append("    nextCondition: ").append(toIndentedString(nextCondition)).append("\n");
    sb.append("    nextConditionOperator: ").append(toIndentedString(nextConditionOperator)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    rightFormFieldId: ").append(toIndentedString(rightFormFieldId)).append("\n");
    sb.append("    rightRestResponseId: ").append(toIndentedString(rightRestResponseId)).append("\n");
    sb.append("    rightType: ").append(toIndentedString(rightType)).append("\n");
    sb.append("    rightValue: ").append(toIndentedString(rightValue)).append("\n");
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
