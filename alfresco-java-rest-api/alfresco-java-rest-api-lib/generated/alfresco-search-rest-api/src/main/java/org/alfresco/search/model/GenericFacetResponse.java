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
import org.alfresco.search.model.GenericBucket;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GenericFacetResponse
 */
@Validated

public class GenericFacetResponse   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("buckets")
  @Valid
  private List<GenericBucket> buckets = null;

  public GenericFacetResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The facet type, eg. interval, range, pivot, stats
   * @return type
  **/
  @ApiModelProperty(value = "The facet type, eg. interval, range, pivot, stats")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GenericFacetResponse label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The field name or its explicit label, if provided on the request
   * @return label
  **/
  @ApiModelProperty(value = "The field name or its explicit label, if provided on the request")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public GenericFacetResponse buckets(List<GenericBucket> buckets) {
    this.buckets = buckets;
    return this;
  }

  public GenericFacetResponse addBucketsItem(GenericBucket bucketsItem) {
    if (this.buckets == null) {
      this.buckets = new ArrayList<>();
    }
    this.buckets.add(bucketsItem);
    return this;
  }

  /**
   * An array of buckets and values
   * @return buckets
  **/
  @ApiModelProperty(value = "An array of buckets and values")

  @Valid

  public List<GenericBucket> getBuckets() {
    return buckets;
  }

  public void setBuckets(List<GenericBucket> buckets) {
    this.buckets = buckets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericFacetResponse genericFacetResponse = (GenericFacetResponse) o;
    return Objects.equals(this.type, genericFacetResponse.type) &&
        Objects.equals(this.label, genericFacetResponse.label) &&
        Objects.equals(this.buckets, genericFacetResponse.buckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, label, buckets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericFacetResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    buckets: ").append(toIndentedString(buckets)).append("\n");
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

