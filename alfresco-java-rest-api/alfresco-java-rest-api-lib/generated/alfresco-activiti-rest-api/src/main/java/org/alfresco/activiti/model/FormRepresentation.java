package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.alfresco.activiti.model.FormDefinitionRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormRepresentation
 */
@Validated

public class FormRepresentation   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("formDefinition")
  private FormDefinitionRepresentation formDefinition = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @JsonProperty("lastUpdatedBy")
  private Long lastUpdatedBy = null;

  @JsonProperty("lastUpdatedByFullName")
  private String lastUpdatedByFullName = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("referenceId")
  private Long referenceId = null;

  @JsonProperty("stencilSetId")
  private Long stencilSetId = null;

  @JsonProperty("version")
  private Integer version = null;

  public FormRepresentation description(String description) {
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

  public FormRepresentation formDefinition(FormDefinitionRepresentation formDefinition) {
    this.formDefinition = formDefinition;
    return this;
  }

  /**
   * Get formDefinition
   * @return formDefinition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FormDefinitionRepresentation getFormDefinition() {
    return formDefinition;
  }

  public void setFormDefinition(FormDefinitionRepresentation formDefinition) {
    this.formDefinition = formDefinition;
  }

  public FormRepresentation id(Long id) {
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

  public FormRepresentation lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public FormRepresentation lastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @ApiModelProperty(value = "")


  public Long getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public FormRepresentation lastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
    return this;
  }

  /**
   * Get lastUpdatedByFullName
   * @return lastUpdatedByFullName
  **/
  @ApiModelProperty(value = "")


  public String getLastUpdatedByFullName() {
    return lastUpdatedByFullName;
  }

  public void setLastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
  }

  public FormRepresentation name(String name) {
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

  public FormRepresentation referenceId(Long referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  **/
  @ApiModelProperty(value = "")


  public Long getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }

  public FormRepresentation stencilSetId(Long stencilSetId) {
    this.stencilSetId = stencilSetId;
    return this;
  }

  /**
   * Get stencilSetId
   * @return stencilSetId
  **/
  @ApiModelProperty(value = "")


  public Long getStencilSetId() {
    return stencilSetId;
  }

  public void setStencilSetId(Long stencilSetId) {
    this.stencilSetId = stencilSetId;
  }

  public FormRepresentation version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormRepresentation formRepresentation = (FormRepresentation) o;
    return Objects.equals(this.description, formRepresentation.description) &&
        Objects.equals(this.formDefinition, formRepresentation.formDefinition) &&
        Objects.equals(this.id, formRepresentation.id) &&
        Objects.equals(this.lastUpdated, formRepresentation.lastUpdated) &&
        Objects.equals(this.lastUpdatedBy, formRepresentation.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedByFullName, formRepresentation.lastUpdatedByFullName) &&
        Objects.equals(this.name, formRepresentation.name) &&
        Objects.equals(this.referenceId, formRepresentation.referenceId) &&
        Objects.equals(this.stencilSetId, formRepresentation.stencilSetId) &&
        Objects.equals(this.version, formRepresentation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, formDefinition, id, lastUpdated, lastUpdatedBy, lastUpdatedByFullName, name, referenceId, stencilSetId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormRepresentation {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    formDefinition: ").append(toIndentedString(formDefinition)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdatedByFullName: ").append(toIndentedString(lastUpdatedByFullName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    stencilSetId: ").append(toIndentedString(stencilSetId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

