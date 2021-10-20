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
import com.alfresco.activiti.model.DecisionTableRepresentation;
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
 * DecisionTableSaveRepresentation
 */
@Validated


public class DecisionTableSaveRepresentation   {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("decisionTableImageBase64")
  private String decisionTableImageBase64 = null;

  @JsonProperty("decisionTableRepresentation")
  private DecisionTableRepresentation decisionTableRepresentation = null;

  @JsonProperty("newVersion")
  private Boolean newVersion = null;

  @JsonProperty("processScopeIdentifiers")
  @Valid
  private List<ProcessScopeIdentifierRepresentation> processScopeIdentifiers = null;

  @JsonProperty("reusable")
  private Boolean reusable = null;

  public DecisionTableSaveRepresentation comment(String comment) {
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

  public DecisionTableSaveRepresentation decisionTableImageBase64(String decisionTableImageBase64) {
    this.decisionTableImageBase64 = decisionTableImageBase64;
    return this;
  }

  /**
   * Get decisionTableImageBase64
   * @return decisionTableImageBase64
   **/
  @ApiModelProperty(value = "")
  
    public String getDecisionTableImageBase64() {
    return decisionTableImageBase64;
  }

  public void setDecisionTableImageBase64(String decisionTableImageBase64) {
    this.decisionTableImageBase64 = decisionTableImageBase64;
  }

  public DecisionTableSaveRepresentation decisionTableRepresentation(DecisionTableRepresentation decisionTableRepresentation) {
    this.decisionTableRepresentation = decisionTableRepresentation;
    return this;
  }

  /**
   * Get decisionTableRepresentation
   * @return decisionTableRepresentation
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DecisionTableRepresentation getDecisionTableRepresentation() {
    return decisionTableRepresentation;
  }

  public void setDecisionTableRepresentation(DecisionTableRepresentation decisionTableRepresentation) {
    this.decisionTableRepresentation = decisionTableRepresentation;
  }

  public DecisionTableSaveRepresentation newVersion(Boolean newVersion) {
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

  public DecisionTableSaveRepresentation processScopeIdentifiers(List<ProcessScopeIdentifierRepresentation> processScopeIdentifiers) {
    this.processScopeIdentifiers = processScopeIdentifiers;
    return this;
  }

  public DecisionTableSaveRepresentation addProcessScopeIdentifiersItem(ProcessScopeIdentifierRepresentation processScopeIdentifiersItem) {
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

  public DecisionTableSaveRepresentation reusable(Boolean reusable) {
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
    DecisionTableSaveRepresentation decisionTableSaveRepresentation = (DecisionTableSaveRepresentation) o;
    return Objects.equals(this.comment, decisionTableSaveRepresentation.comment) &&
        Objects.equals(this.decisionTableImageBase64, decisionTableSaveRepresentation.decisionTableImageBase64) &&
        Objects.equals(this.decisionTableRepresentation, decisionTableSaveRepresentation.decisionTableRepresentation) &&
        Objects.equals(this.newVersion, decisionTableSaveRepresentation.newVersion) &&
        Objects.equals(this.processScopeIdentifiers, decisionTableSaveRepresentation.processScopeIdentifiers) &&
        Objects.equals(this.reusable, decisionTableSaveRepresentation.reusable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, decisionTableImageBase64, decisionTableRepresentation, newVersion, processScopeIdentifiers, reusable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableSaveRepresentation {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    decisionTableImageBase64: ").append(toIndentedString(decisionTableImageBase64)).append("\n");
    sb.append("    decisionTableRepresentation: ").append(toIndentedString(decisionTableRepresentation)).append("\n");
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
