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
 * Pagination
 */
@Validated

public class Pagination   {
  @JsonProperty("count")
  private Long count = null;

  @JsonProperty("hasMoreItems")
  private Boolean hasMoreItems = null;

  @JsonProperty("totalItems")
  private Long totalItems = null;

  @JsonProperty("skipCount")
  private Long skipCount = null;

  @JsonProperty("maxItems")
  private Long maxItems = null;

  public Pagination count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * The number of objects in the entries array.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "The number of objects in the entries array. ")
  @NotNull


  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public Pagination hasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
    return this;
  }

  /**
   * A boolean value which is **true** if there are more entities in the collection beyond those in this response. A true value means a request with a larger value for the **skipCount** or the **maxItems** parameter will return more entities.
   * @return hasMoreItems
  **/
  @ApiModelProperty(required = true, value = "A boolean value which is **true** if there are more entities in the collection beyond those in this response. A true value means a request with a larger value for the **skipCount** or the **maxItems** parameter will return more entities. ")
  @NotNull


  public Boolean isHasMoreItems() {
    return hasMoreItems;
  }

  public void setHasMoreItems(Boolean hasMoreItems) {
    this.hasMoreItems = hasMoreItems;
  }

  public Pagination totalItems(Long totalItems) {
    this.totalItems = totalItems;
    return this;
  }

  /**
   * An integer describing the total number of entities in the collection. The API might not be able to determine this value, in which case this property will not be present.
   * @return totalItems
  **/
  @ApiModelProperty(value = "An integer describing the total number of entities in the collection. The API might not be able to determine this value, in which case this property will not be present. ")


  public Long getTotalItems() {
    return totalItems;
  }

  public void setTotalItems(Long totalItems) {
    this.totalItems = totalItems;
  }

  public Pagination skipCount(Long skipCount) {
    this.skipCount = skipCount;
    return this;
  }

  /**
   * An integer describing how many entities exist in the collection before those included in this list.
   * @return skipCount
  **/
  @ApiModelProperty(required = true, value = "An integer describing how many entities exist in the collection before those included in this list. ")
  @NotNull


  public Long getSkipCount() {
    return skipCount;
  }

  public void setSkipCount(Long skipCount) {
    this.skipCount = skipCount;
  }

  public Pagination maxItems(Long maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * The value of the **maxItems** parameter used to generate this list, or if there was no **maxItems** parameter the default value is 100
   * @return maxItems
  **/
  @ApiModelProperty(required = true, value = "The value of the **maxItems** parameter used to generate this list, or if there was no **maxItems** parameter the default value is 100 ")
  @NotNull


  public Long getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Long maxItems) {
    this.maxItems = maxItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.count, pagination.count) &&
        Objects.equals(this.hasMoreItems, pagination.hasMoreItems) &&
        Objects.equals(this.totalItems, pagination.totalItems) &&
        Objects.equals(this.skipCount, pagination.skipCount) &&
        Objects.equals(this.maxItems, pagination.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, hasMoreItems, totalItems, skipCount, maxItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");

    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    hasMoreItems: ").append(toIndentedString(hasMoreItems)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    skipCount: ").append(toIndentedString(skipCount)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
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

