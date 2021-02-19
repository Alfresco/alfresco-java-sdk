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
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.RequestHighlightFields;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request that highlight fragments to be added to result set rows The properties reflect SOLR highlighting parameters. 
 */
@ApiModel(description = "Request that highlight fragments to be added to result set rows The properties reflect SOLR highlighting parameters. ")
@Validated

public class RequestHighlight   {
  @JsonProperty("prefix")
  private String prefix = null;

  @JsonProperty("postfix")
  private String postfix = null;

  @JsonProperty("snippetCount")
  private Integer snippetCount = null;

  @JsonProperty("fragmentSize")
  private Integer fragmentSize = null;

  @JsonProperty("maxAnalyzedChars")
  private Integer maxAnalyzedChars = null;

  @JsonProperty("mergeContiguous")
  private Boolean mergeContiguous = null;

  @JsonProperty("usePhraseHighlighter")
  private Boolean usePhraseHighlighter = null;

  @JsonProperty("fields")
  @Valid
  private List<RequestHighlightFields> fields = null;

  public RequestHighlight prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * The string used to mark the start of a highlight in a fragment.
   * @return prefix
  **/
  @ApiModelProperty(value = "The string used to mark the start of a highlight in a fragment.")


  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public RequestHighlight postfix(String postfix) {
    this.postfix = postfix;
    return this;
  }

  /**
   * The string used to mark the end of a highlight in a fragment.
   * @return postfix
  **/
  @ApiModelProperty(value = "The string used to mark the end of a highlight in a fragment.")


  public String getPostfix() {
    return postfix;
  }

  public void setPostfix(String postfix) {
    this.postfix = postfix;
  }

  public RequestHighlight snippetCount(Integer snippetCount) {
    this.snippetCount = snippetCount;
    return this;
  }

  /**
   * The maximum number of distinct highlight snippets to return for each highlight field.
   * @return snippetCount
  **/
  @ApiModelProperty(value = "The maximum number of distinct highlight snippets to return for each highlight field.")


  public Integer getSnippetCount() {
    return snippetCount;
  }

  public void setSnippetCount(Integer snippetCount) {
    this.snippetCount = snippetCount;
  }

  public RequestHighlight fragmentSize(Integer fragmentSize) {
    this.fragmentSize = fragmentSize;
    return this;
  }

  /**
   * The character length of each snippet.
   * @return fragmentSize
  **/
  @ApiModelProperty(value = "The character length of each snippet.")


  public Integer getFragmentSize() {
    return fragmentSize;
  }

  public void setFragmentSize(Integer fragmentSize) {
    this.fragmentSize = fragmentSize;
  }

  public RequestHighlight maxAnalyzedChars(Integer maxAnalyzedChars) {
    this.maxAnalyzedChars = maxAnalyzedChars;
    return this;
  }

  /**
   * The number of characters to be considered for highlighting. Matches after this count will not be shown.
   * @return maxAnalyzedChars
  **/
  @ApiModelProperty(value = "The number of characters to be considered for highlighting. Matches after this count will not be shown.")


  public Integer getMaxAnalyzedChars() {
    return maxAnalyzedChars;
  }

  public void setMaxAnalyzedChars(Integer maxAnalyzedChars) {
    this.maxAnalyzedChars = maxAnalyzedChars;
  }

  public RequestHighlight mergeContiguous(Boolean mergeContiguous) {
    this.mergeContiguous = mergeContiguous;
    return this;
  }

  /**
   * If fragments over lap they can be  merged into one larger fragment
   * @return mergeContiguous
  **/
  @ApiModelProperty(value = "If fragments over lap they can be  merged into one larger fragment")


  public Boolean isMergeContiguous() {
    return mergeContiguous;
  }

  public void setMergeContiguous(Boolean mergeContiguous) {
    this.mergeContiguous = mergeContiguous;
  }

  public RequestHighlight usePhraseHighlighter(Boolean usePhraseHighlighter) {
    this.usePhraseHighlighter = usePhraseHighlighter;
    return this;
  }

  /**
   * Should phrases be identified.
   * @return usePhraseHighlighter
  **/
  @ApiModelProperty(value = "Should phrases be identified.")


  public Boolean isUsePhraseHighlighter() {
    return usePhraseHighlighter;
  }

  public void setUsePhraseHighlighter(Boolean usePhraseHighlighter) {
    this.usePhraseHighlighter = usePhraseHighlighter;
  }

  public RequestHighlight fields(List<RequestHighlightFields> fields) {
    this.fields = fields;
    return this;
  }

  public RequestHighlight addFieldsItem(RequestHighlightFields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * The fields to highlight and field specific configuration properties for each field
   * @return fields
  **/
  @ApiModelProperty(value = "The fields to highlight and field specific configuration properties for each field")

  @Valid

  public List<RequestHighlightFields> getFields() {
    return fields;
  }

  public void setFields(List<RequestHighlightFields> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHighlight requestHighlight = (RequestHighlight) o;
    return Objects.equals(this.prefix, requestHighlight.prefix) &&
        Objects.equals(this.postfix, requestHighlight.postfix) &&
        Objects.equals(this.snippetCount, requestHighlight.snippetCount) &&
        Objects.equals(this.fragmentSize, requestHighlight.fragmentSize) &&
        Objects.equals(this.maxAnalyzedChars, requestHighlight.maxAnalyzedChars) &&
        Objects.equals(this.mergeContiguous, requestHighlight.mergeContiguous) &&
        Objects.equals(this.usePhraseHighlighter, requestHighlight.usePhraseHighlighter) &&
        Objects.equals(this.fields, requestHighlight.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, postfix, snippetCount, fragmentSize, maxAnalyzedChars, mergeContiguous, usePhraseHighlighter, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHighlight {\n");
    
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    postfix: ").append(toIndentedString(postfix)).append("\n");
    sb.append("    snippetCount: ").append(toIndentedString(snippetCount)).append("\n");
    sb.append("    fragmentSize: ").append(toIndentedString(fragmentSize)).append("\n");
    sb.append("    maxAnalyzedChars: ").append(toIndentedString(maxAnalyzedChars)).append("\n");
    sb.append("    mergeContiguous: ").append(toIndentedString(mergeContiguous)).append("\n");
    sb.append("    usePhraseHighlighter: ").append(toIndentedString(usePhraseHighlighter)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

