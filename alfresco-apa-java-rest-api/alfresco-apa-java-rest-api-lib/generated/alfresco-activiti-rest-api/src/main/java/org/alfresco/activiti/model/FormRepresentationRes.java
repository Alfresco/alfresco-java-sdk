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
import java.time.OffsetDateTime;
import org.alfresco.activiti.model.FormDefinitionRepresentationRes;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormRepresentationRes
 */
@Validated


public class FormRepresentationRes   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("formDefinition")
  private FormDefinitionRepresentationRes formDefinition = null;

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

  public FormRepresentationRes description(String description) {
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

  public FormRepresentationRes formDefinition(FormDefinitionRepresentationRes formDefinition) {
    this.formDefinition = formDefinition;
    return this;
  }

  /**
   * Get formDefinition
   * @return formDefinition
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public FormDefinitionRepresentationRes getFormDefinition() {
    return formDefinition;
  }

  public void setFormDefinition(FormDefinitionRepresentationRes formDefinition) {
    this.formDefinition = formDefinition;
  }

  public FormRepresentationRes id(Long id) {
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

  public FormRepresentationRes lastUpdated(OffsetDateTime lastUpdated) {
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

  public FormRepresentationRes lastUpdatedBy(Long lastUpdatedBy) {
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

  public FormRepresentationRes lastUpdatedByFullName(String lastUpdatedByFullName) {
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

  public FormRepresentationRes name(String name) {
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

  public FormRepresentationRes referenceId(Long referenceId) {
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

  public FormRepresentationRes stencilSetId(Long stencilSetId) {
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

  public FormRepresentationRes version(Integer version) {
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
    FormRepresentationRes formRepresentationRes = (FormRepresentationRes) o;
    return Objects.equals(this.description, formRepresentationRes.description) &&
        Objects.equals(this.formDefinition, formRepresentationRes.formDefinition) &&
        Objects.equals(this.id, formRepresentationRes.id) &&
        Objects.equals(this.lastUpdated, formRepresentationRes.lastUpdated) &&
        Objects.equals(this.lastUpdatedBy, formRepresentationRes.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedByFullName, formRepresentationRes.lastUpdatedByFullName) &&
        Objects.equals(this.name, formRepresentationRes.name) &&
        Objects.equals(this.referenceId, formRepresentationRes.referenceId) &&
        Objects.equals(this.stencilSetId, formRepresentationRes.stencilSetId) &&
        Objects.equals(this.version, formRepresentationRes.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, formDefinition, id, lastUpdated, lastUpdatedBy, lastUpdatedByFullName, name, referenceId, stencilSetId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormRepresentationRes {\n");
    
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