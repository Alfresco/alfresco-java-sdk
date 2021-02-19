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
 * RequestFacetQueriesInner
 */
@Validated

public class RequestFacetQueriesInner   {
  @JsonProperty("query")
  private String query = null;

  @JsonProperty("label")
  private String label = null;

  public RequestFacetQueriesInner query(String query) {
    this.query = query;
    return this;
  }

  /**
   * A facet query
   * @return query
  **/
  @ApiModelProperty(value = "A facet query")


  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public RequestFacetQueriesInner label(String label) {
    this.label = label;
    return this;
  }

  /**
   * A label to include in place of the facet query
   * @return label
  **/
  @ApiModelProperty(value = "A label to include in place of the facet query")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestFacetQueriesInner requestFacetQueriesInner = (RequestFacetQueriesInner) o;
    return Objects.equals(this.query, requestFacetQueriesInner.query) &&
        Objects.equals(this.label, requestFacetQueriesInner.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFacetQueriesInner {\n");

    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

