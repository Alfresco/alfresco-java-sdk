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
 * RequestPagination
 */
@Validated

public class RequestPagination   {
  @JsonProperty("maxItems")
  private Integer maxItems = null;

  @JsonProperty("skipCount")
  private Integer skipCount = null;

  public RequestPagination maxItems(Integer maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * The maximum number of items to return in the query results
   * minimum: 1
   * @return maxItems
  **/
  @ApiModelProperty(value = "The maximum number of items to return in the query results")

@Min(1)
  public Integer getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Integer maxItems) {
    this.maxItems = maxItems;
  }

  public RequestPagination skipCount(Integer skipCount) {
    this.skipCount = skipCount;
    return this;
  }

  /**
   * The number of items to skip from the start of the query set
   * minimum: 0
   * @return skipCount
  **/
  @ApiModelProperty(value = "The number of items to skip from the start of the query set")

@Min(0)
  public Integer getSkipCount() {
    return skipCount;
  }

  public void setSkipCount(Integer skipCount) {
    this.skipCount = skipCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPagination requestPagination = (RequestPagination) o;
    return Objects.equals(this.maxItems, requestPagination.maxItems) &&
        Objects.equals(this.skipCount, requestPagination.skipCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxItems, skipCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPagination {\n");
    
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    skipCount: ").append(toIndentedString(skipCount)).append("\n");
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

