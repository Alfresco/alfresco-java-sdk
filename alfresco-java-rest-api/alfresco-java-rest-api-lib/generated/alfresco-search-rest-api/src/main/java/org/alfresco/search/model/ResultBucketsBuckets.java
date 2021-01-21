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
 * ResultBucketsBuckets
 */
@Validated


public class ResultBucketsBuckets   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("filterQuery")
  private String filterQuery = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("display")
  private Object display = null;

  public ResultBucketsBuckets label(String label) {
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

  public ResultBucketsBuckets filterQuery(String filterQuery) {
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

  public ResultBucketsBuckets count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The count for the bucket
   * @return count
  **/
  @ApiModelProperty(value = "The count for the bucket")



  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ResultBucketsBuckets display(Object display) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultBucketsBuckets resultBucketsBuckets = (ResultBucketsBuckets) o;
    return Objects.equals(this.label, resultBucketsBuckets.label) &&
        Objects.equals(this.filterQuery, resultBucketsBuckets.filterQuery) &&
        Objects.equals(this.count, resultBucketsBuckets.count) &&
        Objects.equals(this.display, resultBucketsBuckets.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, filterQuery, count, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultBucketsBuckets {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    filterQuery: ").append(toIndentedString(filterQuery)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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

