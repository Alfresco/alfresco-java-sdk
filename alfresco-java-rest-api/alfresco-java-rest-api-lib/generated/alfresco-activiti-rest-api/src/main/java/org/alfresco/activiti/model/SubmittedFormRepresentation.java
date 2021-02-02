package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.alfresco.activiti.model.FormDefinitionRepresentation;
import org.alfresco.activiti.model.LightUserRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubmittedFormRepresentation
 */
@Validated

public class SubmittedFormRepresentation   {
  @JsonProperty("form")
  private FormDefinitionRepresentation form = null;

  @JsonProperty("formId")
  private Long formId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("processId")
  private String processId = null;

  @JsonProperty("submitted")
  private OffsetDateTime submitted = null;

  @JsonProperty("submittedBy")
  private LightUserRepresentation submittedBy = null;

  @JsonProperty("taskId")
  private String taskId = null;

  public SubmittedFormRepresentation form(FormDefinitionRepresentation form) {
    this.form = form;
    return this;
  }

  /**
   * Get form
   * @return form
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FormDefinitionRepresentation getForm() {
    return form;
  }

  public void setForm(FormDefinitionRepresentation form) {
    this.form = form;
  }

  public SubmittedFormRepresentation formId(Long formId) {
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

  public SubmittedFormRepresentation id(Long id) {
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

  public SubmittedFormRepresentation name(String name) {
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

  public SubmittedFormRepresentation processId(String processId) {
    this.processId = processId;
    return this;
  }

  /**
   * Get processId
   * @return processId
  **/
  @ApiModelProperty(value = "")


  public String getProcessId() {
    return processId;
  }

  public void setProcessId(String processId) {
    this.processId = processId;
  }

  public SubmittedFormRepresentation submitted(OffsetDateTime submitted) {
    this.submitted = submitted;
    return this;
  }

  /**
   * Get submitted
   * @return submitted
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getSubmitted() {
    return submitted;
  }

  public void setSubmitted(OffsetDateTime submitted) {
    this.submitted = submitted;
  }

  public SubmittedFormRepresentation submittedBy(LightUserRepresentation submittedBy) {
    this.submittedBy = submittedBy;
    return this;
  }

  /**
   * Get submittedBy
   * @return submittedBy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LightUserRepresentation getSubmittedBy() {
    return submittedBy;
  }

  public void setSubmittedBy(LightUserRepresentation submittedBy) {
    this.submittedBy = submittedBy;
  }

  public SubmittedFormRepresentation taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")


  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmittedFormRepresentation submittedFormRepresentation = (SubmittedFormRepresentation) o;
    return Objects.equals(this.form, submittedFormRepresentation.form) &&
        Objects.equals(this.formId, submittedFormRepresentation.formId) &&
        Objects.equals(this.id, submittedFormRepresentation.id) &&
        Objects.equals(this.name, submittedFormRepresentation.name) &&
        Objects.equals(this.processId, submittedFormRepresentation.processId) &&
        Objects.equals(this.submitted, submittedFormRepresentation.submitted) &&
        Objects.equals(this.submittedBy, submittedFormRepresentation.submittedBy) &&
        Objects.equals(this.taskId, submittedFormRepresentation.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(form, formId, id, name, processId, submitted, submittedBy, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmittedFormRepresentation {\n");
    
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

