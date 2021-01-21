package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.governance.classification.model.DeclassificationDateRecalculationProcessPagingList;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeclassificationDateRecalculationProcessPaging
 */
@Validated


public class DeclassificationDateRecalculationProcessPaging   {
  @JsonProperty("list")
  private DeclassificationDateRecalculationProcessPagingList list = null;

  public DeclassificationDateRecalculationProcessPaging list(DeclassificationDateRecalculationProcessPagingList list) {
    this.list = list;
    return this;
  }

  /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")

  @Valid


  public DeclassificationDateRecalculationProcessPagingList getList() {
    return list;
  }

  public void setList(DeclassificationDateRecalculationProcessPagingList list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeclassificationDateRecalculationProcessPaging declassificationDateRecalculationProcessPaging = (DeclassificationDateRecalculationProcessPaging) o;
    return Objects.equals(this.list, declassificationDateRecalculationProcessPaging.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclassificationDateRecalculationProcessPaging {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

