package org.alfresco.governance.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.core.model.Pagination;
import org.alfresco.governance.core.model.RecordCategory;
import org.alfresco.governance.core.model.RecordCategoryChildEntry;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecordCategoryChildPagingList
 */
@Validated

public class RecordCategoryChildPagingList   {
  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("entries")
  @Valid
  private List<RecordCategoryChildEntry> entries = null;

  @JsonProperty("source")
  private RecordCategory source = null;

  public RecordCategoryChildPagingList pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public RecordCategoryChildPagingList entries(List<RecordCategoryChildEntry> entries) {
    this.entries = entries;
    return this;
  }

  public RecordCategoryChildPagingList addEntriesItem(RecordCategoryChildEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RecordCategoryChildEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<RecordCategoryChildEntry> entries) {
    this.entries = entries;
  }

  public RecordCategoryChildPagingList source(RecordCategory source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecordCategory getSource() {
    return source;
  }

  public void setSource(RecordCategory source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordCategoryChildPagingList recordCategoryChildPagingList = (RecordCategoryChildPagingList) o;
    return Objects.equals(this.pagination, recordCategoryChildPagingList.pagination) &&
        Objects.equals(this.entries, recordCategoryChildPagingList.entries) &&
        Objects.equals(this.source, recordCategoryChildPagingList.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, entries, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordCategoryChildPagingList {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

