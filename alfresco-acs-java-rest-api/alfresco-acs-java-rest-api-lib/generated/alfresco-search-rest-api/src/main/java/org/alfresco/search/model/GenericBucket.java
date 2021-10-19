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
import org.alfresco.search.model.GenericBucketBucketInfo;
import org.alfresco.search.model.GenericMetric;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bucket of facet results
 */
@ApiModel(description = "A bucket of facet results")
@Validated

public class GenericBucket   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("filterQuery")
  private String filterQuery = null;

  @JsonProperty("display")
  private Object display = null;

  @JsonProperty("metrics")
  @Valid
  private List<GenericMetric> metrics = null;

  @JsonProperty("facets")
  @Valid
  private List<Object> facets = null;

  @JsonProperty("bucketInfo")
  private GenericBucketBucketInfo bucketInfo = null;

  public GenericBucket label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The bucket label
   * @return label
  **/
  @ApiModelProperty(value = "The bucket label")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public GenericBucket filterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
    return this;
  }

  /**
   * The filter query you can use to apply this facet
   * @return filterQuery
  **/
  @ApiModelProperty(value = "The filter query you can use to apply this facet")


  public String getFilterQuery() {
    return filterQuery;
  }

  public void setFilterQuery(String filterQuery) {
    this.filterQuery = filterQuery;
  }

  public GenericBucket display(Object display) {
    this.display = display;
    return this;
  }

  /**
   * An optional field for additional display information
   * @return display
  **/
  @ApiModelProperty(value = "An optional field for additional display information")


  public Object getDisplay() {
    return display;
  }

  public void setDisplay(Object display) {
    this.display = display;
  }

  public GenericBucket metrics(List<GenericMetric> metrics) {
    this.metrics = metrics;
    return this;
  }

  public GenericBucket addMetricsItem(GenericMetric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * An array of buckets and values
   * @return metrics
  **/
  @ApiModelProperty(value = "An array of buckets and values")

  @Valid

  public List<GenericMetric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<GenericMetric> metrics) {
    this.metrics = metrics;
  }

  public GenericBucket facets(List<Object> facets) {
    this.facets = facets;
    return this;
  }

  public GenericBucket addFacetsItem(Object facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<>();
    }
    this.facets.add(facetsItem);
    return this;
  }

  /**
   * Additional list of nested facets
   * @return facets
  **/
  @ApiModelProperty(value = "Additional list of nested facets")


  public List<Object> getFacets() {
    return facets;
  }

  public void setFacets(List<Object> facets) {
    this.facets = facets;
  }

  public GenericBucket bucketInfo(GenericBucketBucketInfo bucketInfo) {
    this.bucketInfo = bucketInfo;
    return this;
  }

  /**
   * Get bucketInfo
   * @return bucketInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GenericBucketBucketInfo getBucketInfo() {
    return bucketInfo;
  }

  public void setBucketInfo(GenericBucketBucketInfo bucketInfo) {
    this.bucketInfo = bucketInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericBucket genericBucket = (GenericBucket) o;
    return Objects.equals(this.label, genericBucket.label) &&
        Objects.equals(this.filterQuery, genericBucket.filterQuery) &&
        Objects.equals(this.display, genericBucket.display) &&
        Objects.equals(this.metrics, genericBucket.metrics) &&
        Objects.equals(this.facets, genericBucket.facets) &&
        Objects.equals(this.bucketInfo, genericBucket.bucketInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, filterQuery, display, metrics, facets, bucketInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericBucket {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    filterQuery: ").append(toIndentedString(filterQuery)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    bucketInfo: ").append(toIndentedString(bucketInfo)).append("\n");
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

