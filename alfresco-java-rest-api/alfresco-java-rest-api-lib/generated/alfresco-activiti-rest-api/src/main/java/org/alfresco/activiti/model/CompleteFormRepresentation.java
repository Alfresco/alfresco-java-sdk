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
 * CompleteFormRepresentation
 */
@Validated


public class CompleteFormRepresentation   {
  @JsonProperty("outcome")
  private String outcome = null;

  @JsonProperty("values")
  private Object values = null;

  public CompleteFormRepresentation outcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * Get outcome
   * @return outcome
  **/
  @ApiModelProperty(value = "")



  public String getOutcome() {
    return outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = outcome;
  }

  public CompleteFormRepresentation values(Object values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")



  public Object getValues() {
    return values;
  }

  public void setValues(Object values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteFormRepresentation completeFormRepresentation = (CompleteFormRepresentation) o;
    return Objects.equals(this.outcome, completeFormRepresentation.outcome) &&
        Objects.equals(this.values, completeFormRepresentation.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteFormRepresentation {\n");
    
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

