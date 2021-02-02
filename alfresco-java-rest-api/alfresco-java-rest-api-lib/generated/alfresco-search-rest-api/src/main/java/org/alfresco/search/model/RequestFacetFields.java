package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.RequestFacetField;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Simple facet fields to include The Properties reflect the global properties related to field facts in SOLR. They are descripbed in detail by the SOLR documentation 
 */
@ApiModel(description = "Simple facet fields to include The Properties reflect the global properties related to field facts in SOLR. They are descripbed in detail by the SOLR documentation ")
@Validated

public class RequestFacetFields   {
  @JsonProperty("facets")
  @Valid
  private List<RequestFacetField> facets = null;

  public RequestFacetFields facets(List<RequestFacetField> facets) {
    this.facets = facets;
    return this;
  }

  public RequestFacetFields addFacetsItem(RequestFacetField facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<>();
    }
    this.facets.add(facetsItem);
    return this;
  }

  /**
   * Define specifc fields on which to facet (adds SOLR facet.field and f.<field>.facet.* options) 
   * @return facets
  **/
  @ApiModelProperty(value = "Define specifc fields on which to facet (adds SOLR facet.field and f.<field>.facet.* options) ")

  @Valid

  public List<RequestFacetField> getFacets() {
    return facets;
  }

  public void setFacets(List<RequestFacetField> facets) {
    this.facets = facets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestFacetFields requestFacetFields = (RequestFacetFields) o;
    return Objects.equals(this.facets, requestFacetFields.facets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFacetFields {\n");
    
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
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

