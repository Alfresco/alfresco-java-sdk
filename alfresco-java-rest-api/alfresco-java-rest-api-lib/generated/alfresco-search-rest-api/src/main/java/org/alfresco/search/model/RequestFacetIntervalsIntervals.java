package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.RequestFacetSet;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestFacetIntervalsIntervals
 */
@Validated

public class RequestFacetIntervalsIntervals   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("sets")
  @Valid
  private List<RequestFacetSet> sets = null;

  public RequestFacetIntervalsIntervals field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field to facet on
   * @return field
  **/
  @ApiModelProperty(value = "The field to facet on")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public RequestFacetIntervalsIntervals label(String label) {
    this.label = label;
    return this;
  }

  /**
   * A label to use to identify the field facet
   * @return label
  **/
  @ApiModelProperty(value = "A label to use to identify the field facet")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public RequestFacetIntervalsIntervals sets(List<RequestFacetSet> sets) {
    this.sets = sets;
    return this;
  }

  public RequestFacetIntervalsIntervals addSetsItem(RequestFacetSet setsItem) {
    if (this.sets == null) {
      this.sets = new ArrayList<>();
    }
    this.sets.add(setsItem);
    return this;
  }

  /**
   * Sets the intervals for all fields.
   * @return sets
  **/
  @ApiModelProperty(value = "Sets the intervals for all fields.")

  @Valid

  public List<RequestFacetSet> getSets() {
    return sets;
  }

  public void setSets(List<RequestFacetSet> sets) {
    this.sets = sets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestFacetIntervalsIntervals requestFacetIntervalsIntervals = (RequestFacetIntervalsIntervals) o;
    return Objects.equals(this.field, requestFacetIntervalsIntervals.field) &&
        Objects.equals(this.label, requestFacetIntervalsIntervals.label) &&
        Objects.equals(this.sets, requestFacetIntervalsIntervals.sets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, label, sets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFacetIntervalsIntervals {\n");

    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    sets: ").append(toIndentedString(sets)).append("\n");
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

