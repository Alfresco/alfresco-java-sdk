package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.Pagination;
import org.alfresco.search.model.ResultSetContext;
import org.alfresco.search.model.ResultSetRowEntry;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultSetPagingList
 */
@Validated

public class ResultSetPagingList   {
  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("context")
  private ResultSetContext context = null;

  @JsonProperty("entries")
  @Valid
  private List<ResultSetRowEntry> entries = null;

  public ResultSetPagingList pagination(Pagination pagination) {
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

  public ResultSetPagingList context(ResultSetContext context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ResultSetContext getContext() {
    return context;
  }

  public void setContext(ResultSetContext context) {
    this.context = context;
  }

  public ResultSetPagingList entries(List<ResultSetRowEntry> entries) {
    this.entries = entries;
    return this;
  }

  public ResultSetPagingList addEntriesItem(ResultSetRowEntry entriesItem) {
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

  public List<ResultSetRowEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<ResultSetRowEntry> entries) {
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
    ResultSetPagingList resultSetPagingList = (ResultSetPagingList) o;
    return Objects.equals(this.pagination, resultSetPagingList.pagination) &&
        Objects.equals(this.context, resultSetPagingList.context) &&
        Objects.equals(this.entries, resultSetPagingList.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, context, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultSetPagingList {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

