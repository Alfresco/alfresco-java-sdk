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
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.AuditCalculatedValueRepresentation;
import org.alfresco.activiti.model.AuditDecisionRuleInfoRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditDecisionInfoRepresentation
 */
@Validated


public class AuditDecisionInfoRepresentation   {
  @JsonProperty("appliedRules")
  @Valid
  private List<AuditDecisionRuleInfoRepresentation> appliedRules = null;

  @JsonProperty("calculatedValues")
  @Valid
  private List<AuditCalculatedValueRepresentation> calculatedValues = null;

  public AuditDecisionInfoRepresentation appliedRules(List<AuditDecisionRuleInfoRepresentation> appliedRules) {
    this.appliedRules = appliedRules;
    return this;
  }

  public AuditDecisionInfoRepresentation addAppliedRulesItem(AuditDecisionRuleInfoRepresentation appliedRulesItem) {
    if (this.appliedRules == null) {
      this.appliedRules = new ArrayList<>();
    }
    this.appliedRules.add(appliedRulesItem);
    return this;
  }

  /**
   * Get appliedRules
   * @return appliedRules
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<AuditDecisionRuleInfoRepresentation> getAppliedRules() {
    return appliedRules;
  }

  public void setAppliedRules(List<AuditDecisionRuleInfoRepresentation> appliedRules) {
    this.appliedRules = appliedRules;
  }

  public AuditDecisionInfoRepresentation calculatedValues(List<AuditCalculatedValueRepresentation> calculatedValues) {
    this.calculatedValues = calculatedValues;
    return this;
  }

  public AuditDecisionInfoRepresentation addCalculatedValuesItem(AuditCalculatedValueRepresentation calculatedValuesItem) {
    if (this.calculatedValues == null) {
      this.calculatedValues = new ArrayList<>();
    }
    this.calculatedValues.add(calculatedValuesItem);
    return this;
  }

  /**
   * Get calculatedValues
   * @return calculatedValues
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<AuditCalculatedValueRepresentation> getCalculatedValues() {
    return calculatedValues;
  }

  public void setCalculatedValues(List<AuditCalculatedValueRepresentation> calculatedValues) {
    this.calculatedValues = calculatedValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditDecisionInfoRepresentation auditDecisionInfoRepresentation = (AuditDecisionInfoRepresentation) o;
    return Objects.equals(this.appliedRules, auditDecisionInfoRepresentation.appliedRules) &&
        Objects.equals(this.calculatedValues, auditDecisionInfoRepresentation.calculatedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedRules, calculatedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditDecisionInfoRepresentation {\n");
    
    sb.append("    appliedRules: ").append(toIndentedString(appliedRules)).append("\n");
    sb.append("    calculatedValues: ").append(toIndentedString(calculatedValues)).append("\n");
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
