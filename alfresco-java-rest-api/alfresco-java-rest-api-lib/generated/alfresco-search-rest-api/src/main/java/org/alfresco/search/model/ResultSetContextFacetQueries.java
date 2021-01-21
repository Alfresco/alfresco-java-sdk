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
 * ResultSetContextFacetQueries
 */
@Validated


public class ResultSetContextFacetQueries   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("filterQuery")
  private String filterQuery = null;

  @JsonProperty("count")
  private Integer count = null;

  public ResultSetContextFacetQueries label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")



  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ResultSetContextFacetQueries filterQuery(String filterQuery) {
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

  public ResultSetContextFacetQueries count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(value = "")



  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultSetContextFacetQueries resultSetContextFacetQueries = (ResultSetContextFacetQueries) o;
    return Objects.equals(this.label, resultSetContextFacetQueries.label) &&
        Objects.equals(this.filterQuery, resultSetContextFacetQueries.filterQuery) &&
        Objects.equals(this.count, resultSetContextFacetQueries.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, filterQuery, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultSetContextFacetQueries {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    filterQuery: ").append(toIndentedString(filterQuery)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

