package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.FormFieldRepresentation;
import org.alfresco.activiti.model.FormOutcomeRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormScopeRepresentation
 */
@Validated

public class FormScopeRepresentation   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("fieldVariables")
  @Valid
  private List<FormFieldRepresentation> fieldVariables = null;

  @JsonProperty("fields")
  @Valid
  private List<FormFieldRepresentation> fields = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("outcomes")
  @Valid
  private List<FormOutcomeRepresentation> outcomes = null;

  public FormScopeRepresentation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FormScopeRepresentation fieldVariables(List<FormFieldRepresentation> fieldVariables) {
    this.fieldVariables = fieldVariables;
    return this;
  }

  public FormScopeRepresentation addFieldVariablesItem(FormFieldRepresentation fieldVariablesItem) {
    if (this.fieldVariables == null) {
      this.fieldVariables = new ArrayList<>();
    }
    this.fieldVariables.add(fieldVariablesItem);
    return this;
  }

  /**
   * Get fieldVariables
   * @return fieldVariables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FormFieldRepresentation> getFieldVariables() {
    return fieldVariables;
  }

  public void setFieldVariables(List<FormFieldRepresentation> fieldVariables) {
    this.fieldVariables = fieldVariables;
  }

  public FormScopeRepresentation fields(List<FormFieldRepresentation> fields) {
    this.fields = fields;
    return this;
  }

  public FormScopeRepresentation addFieldsItem(FormFieldRepresentation fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FormFieldRepresentation> getFields() {
    return fields;
  }

  public void setFields(List<FormFieldRepresentation> fields) {
    this.fields = fields;
  }

  public FormScopeRepresentation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public FormScopeRepresentation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormScopeRepresentation outcomes(List<FormOutcomeRepresentation> outcomes) {
    this.outcomes = outcomes;
    return this;
  }

  public FormScopeRepresentation addOutcomesItem(FormOutcomeRepresentation outcomesItem) {
    if (this.outcomes == null) {
      this.outcomes = new ArrayList<>();
    }
    this.outcomes.add(outcomesItem);
    return this;
  }

  /**
   * Get outcomes
   * @return outcomes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<FormOutcomeRepresentation> getOutcomes() {
    return outcomes;
  }

  public void setOutcomes(List<FormOutcomeRepresentation> outcomes) {
    this.outcomes = outcomes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormScopeRepresentation formScopeRepresentation = (FormScopeRepresentation) o;
    return Objects.equals(this.description, formScopeRepresentation.description) &&
        Objects.equals(this.fieldVariables, formScopeRepresentation.fieldVariables) &&
        Objects.equals(this.fields, formScopeRepresentation.fields) &&
        Objects.equals(this.id, formScopeRepresentation.id) &&
        Objects.equals(this.name, formScopeRepresentation.name) &&
        Objects.equals(this.outcomes, formScopeRepresentation.outcomes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fieldVariables, fields, id, name, outcomes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormScopeRepresentation {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fieldVariables: ").append(toIndentedString(fieldVariables)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
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

