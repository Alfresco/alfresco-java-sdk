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
import org.alfresco.activiti.model.NamedObject;
import org.alfresco.activiti.model.RelatedContentRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessContentRepresentation
 */
@Validated


public class ProcessContentRepresentation   {
  @JsonProperty("content")
  @Valid
  private List<RelatedContentRepresentation> content = null;

  @JsonProperty("field")
  private NamedObject field = null;

  public ProcessContentRepresentation content(List<RelatedContentRepresentation> content) {
    this.content = content;
    return this;
  }

  public ProcessContentRepresentation addContentItem(RelatedContentRepresentation contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<RelatedContentRepresentation> getContent() {
    return content;
  }

  public void setContent(List<RelatedContentRepresentation> content) {
    this.content = content;
  }

  public ProcessContentRepresentation field(NamedObject field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NamedObject getField() {
    return field;
  }

  public void setField(NamedObject field) {
    this.field = field;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessContentRepresentation processContentRepresentation = (ProcessContentRepresentation) o;
    return Objects.equals(this.content, processContentRepresentation.content) &&
        Objects.equals(this.field, processContentRepresentation.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessContentRepresentation {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
