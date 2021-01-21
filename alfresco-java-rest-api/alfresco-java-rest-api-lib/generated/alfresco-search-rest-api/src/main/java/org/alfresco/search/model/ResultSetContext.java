package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.GenericFacetResponse;
import org.alfresco.search.model.ResponseConsistency;
import org.alfresco.search.model.ResultBuckets;
import org.alfresco.search.model.ResultSetContextFacetQueries;
import org.alfresco.search.model.ResultSetContextSpellcheck;
import org.alfresco.search.model.SearchRequest;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Context that applies to the whole result set
 */
@ApiModel(description = "Context that applies to the whole result set")
@Validated


public class ResultSetContext   {
  @JsonProperty("consistency")
  private ResponseConsistency consistency = null;

  @JsonProperty("request")
  private SearchRequest request = null;

  @JsonProperty("facetQueries")
  @Valid
  private List<ResultSetContextFacetQueries> facetQueries = null;

  @JsonProperty("facetsFields")
  @Valid
  private List<ResultBuckets> facetsFields = null;

  @JsonProperty("facets")
  @Valid
  private List<GenericFacetResponse> facets = null;

  @JsonProperty("spellcheck")
  @Valid
  private List<ResultSetContextSpellcheck> spellcheck = null;

  public ResultSetContext consistency(ResponseConsistency consistency) {
    this.consistency = consistency;
    return this;
  }

  /**
   * Get consistency
   * @return consistency
  **/
  @ApiModelProperty(value = "")

  @Valid


  public ResponseConsistency getConsistency() {
    return consistency;
  }

  public void setConsistency(ResponseConsistency consistency) {
    this.consistency = consistency;
  }

  public ResultSetContext request(SearchRequest request) {
    this.request = request;
    return this;
  }

  /**
   * Get request
   * @return request
  **/
  @ApiModelProperty(value = "")

  @Valid


  public SearchRequest getRequest() {
    return request;
  }

  public void setRequest(SearchRequest request) {
    this.request = request;
  }

  public ResultSetContext facetQueries(List<ResultSetContextFacetQueries> facetQueries) {
    this.facetQueries = facetQueries;
    return this;
  }

  public ResultSetContext addFacetQueriesItem(ResultSetContextFacetQueries facetQueriesItem) {
    if (this.facetQueries == null) {
      this.facetQueries = new ArrayList<>();
    }
    this.facetQueries.add(facetQueriesItem);
    return this;
  }

  /**
   * The counts from facet queries
   * @return facetQueries
  **/
  @ApiModelProperty(value = "The counts from facet queries")

  @Valid


  public List<ResultSetContextFacetQueries> getFacetQueries() {
    return facetQueries;
  }

  public void setFacetQueries(List<ResultSetContextFacetQueries> facetQueries) {
    this.facetQueries = facetQueries;
  }

  public ResultSetContext facetsFields(List<ResultBuckets> facetsFields) {
    this.facetsFields = facetsFields;
    return this;
  }

  public ResultSetContext addFacetsFieldsItem(ResultBuckets facetsFieldsItem) {
    if (this.facetsFields == null) {
      this.facetsFields = new ArrayList<>();
    }
    this.facetsFields.add(facetsFieldsItem);
    return this;
  }

  /**
   * The counts from field facets
   * @return facetsFields
  **/
  @ApiModelProperty(value = "The counts from field facets")

  @Valid


  public List<ResultBuckets> getFacetsFields() {
    return facetsFields;
  }

  public void setFacetsFields(List<ResultBuckets> facetsFields) {
    this.facetsFields = facetsFields;
  }

  public ResultSetContext facets(List<GenericFacetResponse> facets) {
    this.facets = facets;
    return this;
  }

  public ResultSetContext addFacetsItem(GenericFacetResponse facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<>();
    }
    this.facets.add(facetsItem);
    return this;
  }

  /**
   * The faceted response
   * @return facets
  **/
  @ApiModelProperty(value = "The faceted response")

  @Valid


  public List<GenericFacetResponse> getFacets() {
    return facets;
  }

  public void setFacets(List<GenericFacetResponse> facets) {
    this.facets = facets;
  }

  public ResultSetContext spellcheck(List<ResultSetContextSpellcheck> spellcheck) {
    this.spellcheck = spellcheck;
    return this;
  }

  public ResultSetContext addSpellcheckItem(ResultSetContextSpellcheck spellcheckItem) {
    if (this.spellcheck == null) {
      this.spellcheck = new ArrayList<>();
    }
    this.spellcheck.add(spellcheckItem);
    return this;
  }

  /**
   * Suggested corrections  If zero results were found for the original query then a single entry of type \"searchInsteadFor\" will be returned. If alternatives were found that return more results than the original query they are returned as \"didYouMean\" options. The highest quality suggestion is first. 
   * @return spellcheck
  **/
  @ApiModelProperty(value = "Suggested corrections  If zero results were found for the original query then a single entry of type \"searchInsteadFor\" will be returned. If alternatives were found that return more results than the original query they are returned as \"didYouMean\" options. The highest quality suggestion is first. ")

  @Valid


  public List<ResultSetContextSpellcheck> getSpellcheck() {
    return spellcheck;
  }

  public void setSpellcheck(List<ResultSetContextSpellcheck> spellcheck) {
    this.spellcheck = spellcheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultSetContext resultSetContext = (ResultSetContext) o;
    return Objects.equals(this.consistency, resultSetContext.consistency) &&
        Objects.equals(this.request, resultSetContext.request) &&
        Objects.equals(this.facetQueries, resultSetContext.facetQueries) &&
        Objects.equals(this.facetsFields, resultSetContext.facetsFields) &&
        Objects.equals(this.facets, resultSetContext.facets) &&
        Objects.equals(this.spellcheck, resultSetContext.spellcheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consistency, request, facetQueries, facetsFields, facets, spellcheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultSetContext {\n");
    
    sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    facetQueries: ").append(toIndentedString(facetQueries)).append("\n");
    sb.append("    facetsFields: ").append(toIndentedString(facetsFields)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    spellcheck: ").append(toIndentedString(spellcheck)).append("\n");
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

