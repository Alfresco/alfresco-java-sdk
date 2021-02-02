package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.core.model.Pagination;
import org.alfresco.core.model.TagEntry;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TagPagingList
 */
@Validated

public class TagPagingList   {
  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("entries")
  @Valid
  private List<TagEntry> entries = new ArrayList<>();

  public TagPagingList pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public TagPagingList entries(List<TagEntry> entries) {
    this.entries = entries;
    return this;
  }

  public TagPagingList addEntriesItem(TagEntry entriesItem) {
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<TagEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<TagEntry> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagPagingList tagPagingList = (TagPagingList) o;
    return Objects.equals(this.pagination, tagPagingList.pagination) &&
        Objects.equals(this.entries, tagPagingList.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagPagingList {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

