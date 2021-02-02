package org.alfresco.governance.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.core.model.Pagination;
import org.alfresco.governance.core.model.Transfer;
import org.alfresco.governance.core.model.TransferChildAssociationEntry;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransferAssociationPagingList
 */
@Validated

public class TransferAssociationPagingList   {
  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("entries")
  @Valid
  private List<TransferChildAssociationEntry> entries = null;

  @JsonProperty("source")
  private Transfer source = null;

  public TransferAssociationPagingList pagination(Pagination pagination) {
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

  public TransferAssociationPagingList entries(List<TransferChildAssociationEntry> entries) {
    this.entries = entries;
    return this;
  }

  public TransferAssociationPagingList addEntriesItem(TransferChildAssociationEntry entriesItem) {
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

  public List<TransferChildAssociationEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<TransferChildAssociationEntry> entries) {
    this.entries = entries;
  }

  public TransferAssociationPagingList source(Transfer source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Transfer getSource() {
    return source;
  }

  public void setSource(Transfer source) {
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
    TransferAssociationPagingList transferAssociationPagingList = (TransferAssociationPagingList) o;
    return Objects.equals(this.pagination, transferAssociationPagingList.pagination) &&
        Objects.equals(this.entries, transferAssociationPagingList.entries) &&
        Objects.equals(this.source, transferAssociationPagingList.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, entries, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferAssociationPagingList {\n");
    
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

