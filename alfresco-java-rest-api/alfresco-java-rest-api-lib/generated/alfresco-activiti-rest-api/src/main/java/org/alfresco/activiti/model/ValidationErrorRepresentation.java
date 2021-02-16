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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValidationErrorRepresentation
 */
@Validated

public class ValidationErrorRepresentation   {
  @JsonProperty("defaultDescription")
  private String defaultDescription = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("problem")
  private String problem = null;

  @JsonProperty("problemReference")
  private String problemReference = null;

  @JsonProperty("validatorSetName")
  private String validatorSetName = null;

  @JsonProperty("warning")
  private Boolean warning = null;

  public ValidationErrorRepresentation defaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
    return this;
  }

  /**
   * Get defaultDescription
   * @return defaultDescription
  **/
  @ApiModelProperty(value = "")


  public String getDefaultDescription() {
    return defaultDescription;
  }

  public void setDefaultDescription(String defaultDescription) {
    this.defaultDescription = defaultDescription;
  }

  public ValidationErrorRepresentation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ValidationErrorRepresentation name(String name) {
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

  public ValidationErrorRepresentation problem(String problem) {
    this.problem = problem;
    return this;
  }

  /**
   * Get problem
   * @return problem
  **/
  @ApiModelProperty(value = "")


  public String getProblem() {
    return problem;
  }

  public void setProblem(String problem) {
    this.problem = problem;
  }

  public ValidationErrorRepresentation problemReference(String problemReference) {
    this.problemReference = problemReference;
    return this;
  }

  /**
   * Get problemReference
   * @return problemReference
  **/
  @ApiModelProperty(value = "")


  public String getProblemReference() {
    return problemReference;
  }

  public void setProblemReference(String problemReference) {
    this.problemReference = problemReference;
  }

  public ValidationErrorRepresentation validatorSetName(String validatorSetName) {
    this.validatorSetName = validatorSetName;
    return this;
  }

  /**
   * Get validatorSetName
   * @return validatorSetName
  **/
  @ApiModelProperty(value = "")


  public String getValidatorSetName() {
    return validatorSetName;
  }

  public void setValidatorSetName(String validatorSetName) {
    this.validatorSetName = validatorSetName;
  }

  public ValidationErrorRepresentation warning(Boolean warning) {
    this.warning = warning;
    return this;
  }

  /**
   * Get warning
   * @return warning
  **/
  @ApiModelProperty(value = "")


  public Boolean isWarning() {
    return warning;
  }

  public void setWarning(Boolean warning) {
    this.warning = warning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorRepresentation validationErrorRepresentation = (ValidationErrorRepresentation) o;
    return Objects.equals(this.defaultDescription, validationErrorRepresentation.defaultDescription) &&
        Objects.equals(this.id, validationErrorRepresentation.id) &&
        Objects.equals(this.name, validationErrorRepresentation.name) &&
        Objects.equals(this.problem, validationErrorRepresentation.problem) &&
        Objects.equals(this.problemReference, validationErrorRepresentation.problemReference) &&
        Objects.equals(this.validatorSetName, validationErrorRepresentation.validatorSetName) &&
        Objects.equals(this.warning, validationErrorRepresentation.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultDescription, id, name, problem, problemReference, validatorSetName, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorRepresentation {\n");
    
    sb.append("    defaultDescription: ").append(toIndentedString(defaultDescription)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    problemReference: ").append(toIndentedString(problemReference)).append("\n");
    sb.append("    validatorSetName: ").append(toIndentedString(validatorSetName)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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

