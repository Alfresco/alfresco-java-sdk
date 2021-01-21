package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.ResultBucketsBuckets;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultBuckets
 */
@Validated


public class ResultBuckets   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("buckets")
  @Valid
  private List<ResultBucketsBuckets> buckets = null;

  public ResultBuckets label(String label) {
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

  public ResultBuckets buckets(List<ResultBucketsBuckets> buckets) {
    this.buckets = buckets;
    return this;
  }

  public ResultBuckets addBucketsItem(ResultBucketsBuckets bucketsItem) {
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


  public List<ResultBucketsBuckets> getBuckets() {
    return buckets;
  }

  public void setBuckets(List<ResultBucketsBuckets> buckets) {
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
    ResultBuckets resultBuckets = (ResultBuckets) o;
    return Objects.equals(this.label, resultBuckets.label) &&
        Objects.equals(this.buckets, resultBuckets.buckets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, buckets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultBuckets {\n");
    
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

