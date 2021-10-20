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
import com.alfresco.activiti.model.FormRepresentationReq;
import com.alfresco.activiti.model.ProcessScopeIdentifierRepresentation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormSaveRepresentation
 */
@Validated


public class FormSaveRepresentation   {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("formImageBase64")
  private String formImageBase64 = null;

  @JsonProperty("formRepresentation")
  private FormRepresentationReq formRepresentation = null;

  @JsonProperty("newVersion")
  private Boolean newVersion = null;

  @JsonProperty("processScopeIdentifiers")
  @Valid
  private List<ProcessScopeIdentifierRepresentation> processScopeIdentifiers = null;

  @JsonProperty("reusable")
  private Boolean reusable = null;

  public FormSaveRepresentation comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
   **/
  @ApiModelProperty(value = "")
  
    public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public FormSaveRepresentation formImageBase64(String formImageBase64) {
    this.formImageBase64 = formImageBase64;
    return this;
  }

  /**
   * Get formImageBase64
   * @return formImageBase64
   **/
  @ApiModelProperty(value = "")
  
    public String getFormImageBase64() {
    return formImageBase64;
  }

  public void setFormImageBase64(String formImageBase64) {
    this.formImageBase64 = formImageBase64;
  }

  public FormSaveRepresentation formRepresentation(FormRepresentationReq formRepresentation) {
    this.formRepresentation = formRepresentation;
    return this;
  }

  /**
   * Get formRepresentation
   * @return formRepresentation
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public FormRepresentationReq getFormRepresentation() {
    return formRepresentation;
  }

  public void setFormRepresentation(FormRepresentationReq formRepresentation) {
    this.formRepresentation = formRepresentation;
  }

  public FormSaveRepresentation newVersion(Boolean newVersion) {
    this.newVersion = newVersion;
    return this;
  }

  /**
   * Get newVersion
   * @return newVersion
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isNewVersion() {
    return newVersion;
  }

  public void setNewVersion(Boolean newVersion) {
    this.newVersion = newVersion;
  }

  public FormSaveRepresentation processScopeIdentifiers(List<ProcessScopeIdentifierRepresentation> processScopeIdentifiers) {
    this.processScopeIdentifiers = processScopeIdentifiers;
    return this;
  }

  public FormSaveRepresentation addProcessScopeIdentifiersItem(ProcessScopeIdentifierRepresentation processScopeIdentifiersItem) {
    if (this.processScopeIdentifiers == null) {
      this.processScopeIdentifiers = new ArrayList<>();
    }
    this.processScopeIdentifiers.add(processScopeIdentifiersItem);
    return this;
  }

  /**
   * Get processScopeIdentifiers
   * @return processScopeIdentifiers
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ProcessScopeIdentifierRepresentation> getProcessScopeIdentifiers() {
    return processScopeIdentifiers;
  }

  public void setProcessScopeIdentifiers(List<ProcessScopeIdentifierRepresentation> processScopeIdentifiers) {
    this.processScopeIdentifiers = processScopeIdentifiers;
  }

  public FormSaveRepresentation reusable(Boolean reusable) {
    this.reusable = reusable;
    return this;
  }

  /**
   * Get reusable
   * @return reusable
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isReusable() {
    return reusable;
  }

  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormSaveRepresentation formSaveRepresentation = (FormSaveRepresentation) o;
    return Objects.equals(this.comment, formSaveRepresentation.comment) &&
        Objects.equals(this.formImageBase64, formSaveRepresentation.formImageBase64) &&
        Objects.equals(this.formRepresentation, formSaveRepresentation.formRepresentation) &&
        Objects.equals(this.newVersion, formSaveRepresentation.newVersion) &&
        Objects.equals(this.processScopeIdentifiers, formSaveRepresentation.processScopeIdentifiers) &&
        Objects.equals(this.reusable, formSaveRepresentation.reusable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, formImageBase64, formRepresentation, newVersion, processScopeIdentifiers, reusable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormSaveRepresentation {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    formImageBase64: ").append(toIndentedString(formImageBase64)).append("\n");
    sb.append("    formRepresentation: ").append(toIndentedString(formRepresentation)).append("\n");
    sb.append("    newVersion: ").append(toIndentedString(newVersion)).append("\n");
    sb.append("    processScopeIdentifiers: ").append(toIndentedString(processScopeIdentifiers)).append("\n");
    sb.append("    reusable: ").append(toIndentedString(reusable)).append("\n");
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
