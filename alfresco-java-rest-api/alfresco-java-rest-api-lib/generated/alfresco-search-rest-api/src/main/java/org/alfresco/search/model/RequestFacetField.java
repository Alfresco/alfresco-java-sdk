package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A simple facet field
 */
@ApiModel(description = "A simple facet field")
@Validated


public class RequestFacetField   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("prefix")
  private String prefix = null;

  /**
   * Gets or Sets sort
   */
  public enum SortEnum {
    COUNT("COUNT"),
    
    INDEX("INDEX");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortEnum fromValue(String text) {
      for (SortEnum b : SortEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sort")
  private SortEnum sort = null;

  /**
   * Gets or Sets method
   */
  public enum MethodEnum {
    ENUM("ENUM"),
    
    FC("FC");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("method")
  private MethodEnum method = null;

  @JsonProperty("missing")
  private Boolean missing = false;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("offset")
  private Integer offset = null;

  @JsonProperty("mincount")
  private Integer mincount = null;

  @JsonProperty("facetEnumCacheMinDf")
  private Integer facetEnumCacheMinDf = null;

  @JsonProperty("excludeFilters")
  @Valid
  private List<String> excludeFilters = null;

  public RequestFacetField field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The facet field
   * @return field
  **/
  @ApiModelProperty(value = "The facet field")



  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public RequestFacetField label(String label) {
    this.label = label;
    return this;
  }

  /**
   * A label to include in place of the facet field
   * @return label
  **/
  @ApiModelProperty(value = "A label to include in place of the facet field")



  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public RequestFacetField prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Restricts the possible constraints to only indexed values with a specified prefix.
   * @return prefix
  **/
  @ApiModelProperty(value = "Restricts the possible constraints to only indexed values with a specified prefix.")



  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public RequestFacetField sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")



  public SortEnum getSort() {
    return sort;
  }

  public void setSort(SortEnum sort) {
    this.sort = sort;
  }

  public RequestFacetField method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")



  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public RequestFacetField missing(Boolean missing) {
    this.missing = missing;
    return this;
  }

  /**
   * When true, count results that match the query but which have no facet value for the field (in addition to the Term-based constraints).
   * @return missing
  **/
  @ApiModelProperty(value = "When true, count results that match the query but which have no facet value for the field (in addition to the Term-based constraints).")



  public Boolean isMissing() {
    return missing;
  }

  public void setMissing(Boolean missing) {
    this.missing = missing;
  }

  public RequestFacetField limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")



  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public RequestFacetField offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(value = "")



  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public RequestFacetField mincount(Integer mincount) {
    this.mincount = mincount;
    return this;
  }

  /**
   * The minimum count required for a facet field to be included in the response.
   * @return mincount
  **/
  @ApiModelProperty(value = "The minimum count required for a facet field to be included in the response.")



  public Integer getMincount() {
    return mincount;
  }

  public void setMincount(Integer mincount) {
    this.mincount = mincount;
  }

  public RequestFacetField facetEnumCacheMinDf(Integer facetEnumCacheMinDf) {
    this.facetEnumCacheMinDf = facetEnumCacheMinDf;
    return this;
  }

  /**
   * Get facetEnumCacheMinDf
   * @return facetEnumCacheMinDf
  **/
  @ApiModelProperty(value = "")



  public Integer getFacetEnumCacheMinDf() {
    return facetEnumCacheMinDf;
  }

  public void setFacetEnumCacheMinDf(Integer facetEnumCacheMinDf) {
    this.facetEnumCacheMinDf = facetEnumCacheMinDf;
  }

  public RequestFacetField excludeFilters(List<String> excludeFilters) {
    this.excludeFilters = excludeFilters;
    return this;
  }

  public RequestFacetField addExcludeFiltersItem(String excludeFiltersItem) {
    if (this.excludeFilters == null) {
      this.excludeFilters = new ArrayList<>();
    }
    this.excludeFilters.add(excludeFiltersItem);
    return this;
  }

  /**
   * Filter Queries with tags listed here will not be included in facet counts. This is used for multi-select facetting. 
   * @return excludeFilters
  **/
  @ApiModelProperty(value = "Filter Queries with tags listed here will not be included in facet counts. This is used for multi-select facetting. ")



  public List<String> getExcludeFilters() {
    return excludeFilters;
  }

  public void setExcludeFilters(List<String> excludeFilters) {
    this.excludeFilters = excludeFilters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestFacetField requestFacetField = (RequestFacetField) o;
    return Objects.equals(this.field, requestFacetField.field) &&
        Objects.equals(this.label, requestFacetField.label) &&
        Objects.equals(this.prefix, requestFacetField.prefix) &&
        Objects.equals(this.sort, requestFacetField.sort) &&
        Objects.equals(this.method, requestFacetField.method) &&
        Objects.equals(this.missing, requestFacetField.missing) &&
        Objects.equals(this.limit, requestFacetField.limit) &&
        Objects.equals(this.offset, requestFacetField.offset) &&
        Objects.equals(this.mincount, requestFacetField.mincount) &&
        Objects.equals(this.facetEnumCacheMinDf, requestFacetField.facetEnumCacheMinDf) &&
        Objects.equals(this.excludeFilters, requestFacetField.excludeFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, label, prefix, sort, method, missing, limit, offset, mincount, facetEnumCacheMinDf, excludeFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFacetField {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    mincount: ").append(toIndentedString(mincount)).append("\n");
    sb.append("    facetEnumCacheMinDf: ").append(toIndentedString(facetEnumCacheMinDf)).append("\n");
    sb.append("    excludeFilters: ").append(toIndentedString(excludeFilters)).append("\n");
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

