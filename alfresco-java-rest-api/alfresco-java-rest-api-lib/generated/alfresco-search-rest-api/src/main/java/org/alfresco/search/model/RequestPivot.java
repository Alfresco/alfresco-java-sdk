package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.RequestPivot;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of pivots.
 */
@ApiModel(description = "A list of pivots.")
@Validated

public class RequestPivot   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("pivots")
  @Valid
  private List<RequestPivot> pivots = null;

  public RequestPivot key(String key) {
    this.key = key;
    return this;
  }

  /**
   * A key corresponding to a matching field facet label or stats.
   * @return key
  **/
  @ApiModelProperty(value = "A key corresponding to a matching field facet label or stats.")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public RequestPivot pivots(List<RequestPivot> pivots) {
    this.pivots = pivots;
    return this;
  }

  public RequestPivot addPivotsItem(RequestPivot pivotsItem) {
    if (this.pivots == null) {
      this.pivots = new ArrayList<>();
    }
    this.pivots.add(pivotsItem);
    return this;
  }

  /**
   * Get pivots
   * @return pivots
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RequestPivot> getPivots() {
    return pivots;
  }

  public void setPivots(List<RequestPivot> pivots) {
    this.pivots = pivots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPivot requestPivot = (RequestPivot) o;
    return Objects.equals(this.key, requestPivot.key) &&
        Objects.equals(this.pivots, requestPivot.pivots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, pivots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPivot {\n");

    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    pivots: ").append(toIndentedString(pivots)).append("\n");
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

