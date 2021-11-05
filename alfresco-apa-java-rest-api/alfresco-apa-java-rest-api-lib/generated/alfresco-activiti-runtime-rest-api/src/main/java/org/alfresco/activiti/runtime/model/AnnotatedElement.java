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
package org.alfresco.activiti.runtime.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.runtime.model.Annotation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnnotatedElement
 */
@Validated


public class AnnotatedElement   {
  @JsonProperty("annotations")
  @Valid
  private List<Annotation> annotations = null;

  @JsonProperty("declaredAnnotations")
  @Valid
  private List<Annotation> declaredAnnotations = null;

  public AnnotatedElement annotations(List<Annotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public AnnotatedElement addAnnotationsItem(Annotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

  /**
   * Get annotations
   * @return annotations
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Annotation> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }

  public AnnotatedElement declaredAnnotations(List<Annotation> declaredAnnotations) {
    this.declaredAnnotations = declaredAnnotations;
    return this;
  }

  public AnnotatedElement addDeclaredAnnotationsItem(Annotation declaredAnnotationsItem) {
    if (this.declaredAnnotations == null) {
      this.declaredAnnotations = new ArrayList<>();
    }
    this.declaredAnnotations.add(declaredAnnotationsItem);
    return this;
  }

  /**
   * Get declaredAnnotations
   * @return declaredAnnotations
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Annotation> getDeclaredAnnotations() {
    return declaredAnnotations;
  }

  public void setDeclaredAnnotations(List<Annotation> declaredAnnotations) {
    this.declaredAnnotations = declaredAnnotations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedElement annotatedElement = (AnnotatedElement) o;
    return Objects.equals(this.annotations, annotatedElement.annotations) &&
        Objects.equals(this.declaredAnnotations, annotatedElement.declaredAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, declaredAnnotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedElement {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    declaredAnnotations: ").append(toIndentedString(declaredAnnotations)).append("\n");
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
