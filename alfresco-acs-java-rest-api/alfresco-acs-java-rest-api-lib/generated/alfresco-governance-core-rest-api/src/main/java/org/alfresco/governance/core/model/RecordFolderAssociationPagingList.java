/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.governance.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.core.model.Pagination;
import org.alfresco.governance.core.model.RecordFolder;
import org.alfresco.governance.core.model.RecordFolderChildAssociationEntry;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecordFolderAssociationPagingList
 */
@Validated

public class RecordFolderAssociationPagingList   {
  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("entries")
  @Valid
  private List<RecordFolderChildAssociationEntry> entries = null;

  @JsonProperty("source")
  private RecordFolder source = null;

  public RecordFolderAssociationPagingList pagination(Pagination pagination) {
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

  public RecordFolderAssociationPagingList entries(List<RecordFolderChildAssociationEntry> entries) {
    this.entries = entries;
    return this;
  }

  public RecordFolderAssociationPagingList addEntriesItem(RecordFolderChildAssociationEntry entriesItem) {
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

  public List<RecordFolderChildAssociationEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<RecordFolderChildAssociationEntry> entries) {
    this.entries = entries;
  }

  public RecordFolderAssociationPagingList source(RecordFolder source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecordFolder getSource() {
    return source;
  }

  public void setSource(RecordFolder source) {
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
    RecordFolderAssociationPagingList recordFolderAssociationPagingList = (RecordFolderAssociationPagingList) o;
    return Objects.equals(this.pagination, recordFolderAssociationPagingList.pagination) &&
        Objects.equals(this.entries, recordFolderAssociationPagingList.entries) &&
        Objects.equals(this.source, recordFolderAssociationPagingList.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, entries, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordFolderAssociationPagingList {\n");
    
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

