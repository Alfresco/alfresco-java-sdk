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
import org.alfresco.activiti.model.ProcessScopeIdentifierRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessScopesRequestRepresentation
 */
@Validated

public class ProcessScopesRequestRepresentation   {
  @JsonProperty("identifiers")
  @Valid
  private List<ProcessScopeIdentifierRepresentation> identifiers = null;

  @JsonProperty("overriddenModel")
  private String overriddenModel = null;

  public ProcessScopesRequestRepresentation identifiers(List<ProcessScopeIdentifierRepresentation> identifiers) {
    this.identifiers = identifiers;
    return this;
  }

  public ProcessScopesRequestRepresentation addIdentifiersItem(ProcessScopeIdentifierRepresentation identifiersItem) {
    if (this.identifiers == null) {
      this.identifiers = new ArrayList<>();
    }
    this.identifiers.add(identifiersItem);
    return this;
  }

  /**
   * Get identifiers
   * @return identifiers
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProcessScopeIdentifierRepresentation> getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(List<ProcessScopeIdentifierRepresentation> identifiers) {
    this.identifiers = identifiers;
  }

  public ProcessScopesRequestRepresentation overriddenModel(String overriddenModel) {
    this.overriddenModel = overriddenModel;
    return this;
  }

  /**
   * Get overriddenModel
   * @return overriddenModel
  **/
  @ApiModelProperty(value = "")


  public String getOverriddenModel() {
    return overriddenModel;
  }

  public void setOverriddenModel(String overriddenModel) {
    this.overriddenModel = overriddenModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessScopesRequestRepresentation processScopesRequestRepresentation = (ProcessScopesRequestRepresentation) o;
    return Objects.equals(this.identifiers, processScopesRequestRepresentation.identifiers) &&
        Objects.equals(this.overriddenModel, processScopesRequestRepresentation.overriddenModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiers, overriddenModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessScopesRequestRepresentation {\n");
    
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    overriddenModel: ").append(toIndentedString(overriddenModel)).append("\n");
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

