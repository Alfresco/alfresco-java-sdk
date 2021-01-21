package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LayoutRepresentation
 */
@Validated


public class LayoutRepresentation   {
  @JsonProperty("colspan")
  private Integer colspan = null;

  @JsonProperty("column")
  private Integer column = null;

  @JsonProperty("row")
  private Integer row = null;

  public LayoutRepresentation colspan(Integer colspan) {
    this.colspan = colspan;
    return this;
  }

  /**
   * Get colspan
   * @return colspan
  **/
  @ApiModelProperty(value = "")



  public Integer getColspan() {
    return colspan;
  }

  public void setColspan(Integer colspan) {
    this.colspan = colspan;
  }

  public LayoutRepresentation column(Integer column) {
    this.column = column;
    return this;
  }

  /**
   * Get column
   * @return column
  **/
  @ApiModelProperty(value = "")



  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public LayoutRepresentation row(Integer row) {
    this.row = row;
    return this;
  }

  /**
   * Get row
   * @return row
  **/
  @ApiModelProperty(value = "")



  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayoutRepresentation layoutRepresentation = (LayoutRepresentation) o;
    return Objects.equals(this.colspan, layoutRepresentation.colspan) &&
        Objects.equals(this.column, layoutRepresentation.column) &&
        Objects.equals(this.row, layoutRepresentation.row);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colspan, column, row);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayoutRepresentation {\n");
    
    sb.append("    colspan: ").append(toIndentedString(colspan)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

