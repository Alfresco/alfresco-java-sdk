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
 * AuditDecisionExpressionInfoRepresentation
 */
@Validated

public class AuditDecisionExpressionInfoRepresentation   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("variable")
  private String variable = null;

  public AuditDecisionExpressionInfoRepresentation type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AuditDecisionExpressionInfoRepresentation value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public AuditDecisionExpressionInfoRepresentation variable(String variable) {
    this.variable = variable;
    return this;
  }

  /**
   * Get variable
   * @return variable
  **/
  @ApiModelProperty(value = "")


  public String getVariable() {
    return variable;
  }

  public void setVariable(String variable) {
    this.variable = variable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditDecisionExpressionInfoRepresentation auditDecisionExpressionInfoRepresentation = (AuditDecisionExpressionInfoRepresentation) o;
    return Objects.equals(this.type, auditDecisionExpressionInfoRepresentation.type) &&
        Objects.equals(this.value, auditDecisionExpressionInfoRepresentation.value) &&
        Objects.equals(this.variable, auditDecisionExpressionInfoRepresentation.variable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, variable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditDecisionExpressionInfoRepresentation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
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

