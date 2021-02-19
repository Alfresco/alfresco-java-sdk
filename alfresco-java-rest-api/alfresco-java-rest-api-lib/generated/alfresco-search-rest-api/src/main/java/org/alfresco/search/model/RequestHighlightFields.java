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
package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestHighlightFields
 */
@Validated

public class RequestHighlightFields   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("snippetCount")
  private Integer snippetCount = null;

  @JsonProperty("fragmentSize")
  private Integer fragmentSize = null;

  @JsonProperty("mergeContiguous")
  private Boolean mergeContiguous = null;

  @JsonProperty("prefix")
  private String prefix = null;

  @JsonProperty("postfix")
  private String postfix = null;

  public RequestHighlightFields field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The name of the field to highlight.
   * @return field
  **/
  @ApiModelProperty(value = "The name of the field to highlight.")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public RequestHighlightFields snippetCount(Integer snippetCount) {
    this.snippetCount = snippetCount;
    return this;
  }

  /**
   * Get snippetCount
   * @return snippetCount
  **/
  @ApiModelProperty(value = "")


  public Integer getSnippetCount() {
    return snippetCount;
  }

  public void setSnippetCount(Integer snippetCount) {
    this.snippetCount = snippetCount;
  }

  public RequestHighlightFields fragmentSize(Integer fragmentSize) {
    this.fragmentSize = fragmentSize;
    return this;
  }

  /**
   * Get fragmentSize
   * @return fragmentSize
  **/
  @ApiModelProperty(value = "")


  public Integer getFragmentSize() {
    return fragmentSize;
  }

  public void setFragmentSize(Integer fragmentSize) {
    this.fragmentSize = fragmentSize;
  }

  public RequestHighlightFields mergeContiguous(Boolean mergeContiguous) {
    this.mergeContiguous = mergeContiguous;
    return this;
  }

  /**
   * Get mergeContiguous
   * @return mergeContiguous
  **/
  @ApiModelProperty(value = "")


  public Boolean isMergeContiguous() {
    return mergeContiguous;
  }

  public void setMergeContiguous(Boolean mergeContiguous) {
    this.mergeContiguous = mergeContiguous;
  }

  public RequestHighlightFields prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
  **/
  @ApiModelProperty(value = "")


  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public RequestHighlightFields postfix(String postfix) {
    this.postfix = postfix;
    return this;
  }

  /**
   * Get postfix
   * @return postfix
  **/
  @ApiModelProperty(value = "")


  public String getPostfix() {
    return postfix;
  }

  public void setPostfix(String postfix) {
    this.postfix = postfix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHighlightFields requestHighlightFields = (RequestHighlightFields) o;
    return Objects.equals(this.field, requestHighlightFields.field) &&
        Objects.equals(this.snippetCount, requestHighlightFields.snippetCount) &&
        Objects.equals(this.fragmentSize, requestHighlightFields.fragmentSize) &&
        Objects.equals(this.mergeContiguous, requestHighlightFields.mergeContiguous) &&
        Objects.equals(this.prefix, requestHighlightFields.prefix) &&
        Objects.equals(this.postfix, requestHighlightFields.postfix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, snippetCount, fragmentSize, mergeContiguous, prefix, postfix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHighlightFields {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    snippetCount: ").append(toIndentedString(snippetCount)).append("\n");
    sb.append("    fragmentSize: ").append(toIndentedString(fragmentSize)).append("\n");
    sb.append("    mergeContiguous: ").append(toIndentedString(mergeContiguous)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    postfix: ").append(toIndentedString(postfix)).append("\n");
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

