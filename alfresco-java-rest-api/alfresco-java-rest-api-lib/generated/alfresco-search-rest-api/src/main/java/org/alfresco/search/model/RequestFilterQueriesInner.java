package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestFilterQueriesInner
 */
@Validated

public class RequestFilterQueriesInner   {
  @JsonProperty("query")
  private String query = null;

  @JsonProperty("tags")
  @Valid
  private List<String> tags = null;

  public RequestFilterQueriesInner query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The filter query expression. For multi-select facets selected facets must be order together 
   * @return query
  **/
  @ApiModelProperty(value = "The filter query expression. For multi-select facets selected facets must be order together ")


  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public RequestFilterQueriesInner tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public RequestFilterQueriesInner addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags used exclude the filters from facet evaluation for multi-select facet support
   * @return tags
  **/
  @ApiModelProperty(value = "Tags used exclude the filters from facet evaluation for multi-select facet support")


  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestFilterQueriesInner requestFilterQueriesInner = (RequestFilterQueriesInner) o;
    return Objects.equals(this.query, requestFilterQueriesInner.query) &&
        Objects.equals(this.tags, requestFilterQueriesInner.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFilterQueriesInner {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

