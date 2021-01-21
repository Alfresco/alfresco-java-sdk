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
 * FormIdentifierRepresentation
 */
@Validated


public class FormIdentifierRepresentation   {
  @JsonProperty("formId")
  private Long formId = null;

  public FormIdentifierRepresentation formId(Long formId) {
    this.formId = formId;
    return this;
  }

  /**
   * Get formId
   * @return formId
  **/
  @ApiModelProperty(value = "")



  public Long getFormId() {
    return formId;
  }

  public void setFormId(Long formId) {
    this.formId = formId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormIdentifierRepresentation formIdentifierRepresentation = (FormIdentifierRepresentation) o;
    return Objects.equals(this.formId, formIdentifierRepresentation.formId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormIdentifierRepresentation {\n");
    
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
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

