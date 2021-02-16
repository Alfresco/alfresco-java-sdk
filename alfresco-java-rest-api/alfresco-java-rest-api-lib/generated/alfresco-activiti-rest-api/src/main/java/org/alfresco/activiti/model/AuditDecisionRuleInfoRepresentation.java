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
import org.alfresco.activiti.model.AuditDecisionExpressionInfoRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditDecisionRuleInfoRepresentation
 */
@Validated

public class AuditDecisionRuleInfoRepresentation   {
  @JsonProperty("expressions")
  @Valid
  private List<AuditDecisionExpressionInfoRepresentation> expressions = null;

  @JsonProperty("title")
  private String title = null;

  public AuditDecisionRuleInfoRepresentation expressions(List<AuditDecisionExpressionInfoRepresentation> expressions) {
    this.expressions = expressions;
    return this;
  }

  public AuditDecisionRuleInfoRepresentation addExpressionsItem(AuditDecisionExpressionInfoRepresentation expressionsItem) {
    if (this.expressions == null) {
      this.expressions = new ArrayList<>();
    }
    this.expressions.add(expressionsItem);
    return this;
  }

  /**
   * Get expressions
   * @return expressions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AuditDecisionExpressionInfoRepresentation> getExpressions() {
    return expressions;
  }

  public void setExpressions(List<AuditDecisionExpressionInfoRepresentation> expressions) {
    this.expressions = expressions;
  }

  public AuditDecisionRuleInfoRepresentation title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditDecisionRuleInfoRepresentation auditDecisionRuleInfoRepresentation = (AuditDecisionRuleInfoRepresentation) o;
    return Objects.equals(this.expressions, auditDecisionRuleInfoRepresentation.expressions) &&
        Objects.equals(this.title, auditDecisionRuleInfoRepresentation.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressions, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditDecisionRuleInfoRepresentation {\n");
    
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

