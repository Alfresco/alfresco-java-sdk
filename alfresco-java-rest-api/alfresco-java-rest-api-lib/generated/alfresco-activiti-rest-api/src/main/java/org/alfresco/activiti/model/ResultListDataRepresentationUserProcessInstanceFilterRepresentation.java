package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.UserProcessInstanceFilterRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultListDataRepresentationUserProcessInstanceFilterRepresentation
 */
@Validated


public class ResultListDataRepresentationUserProcessInstanceFilterRepresentation   {
  @JsonProperty("data")
  @Valid
  private List<UserProcessInstanceFilterRepresentation> data = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("start")
  private Integer start = null;

  @JsonProperty("total")
  private Integer total = null;

  public ResultListDataRepresentationUserProcessInstanceFilterRepresentation data(List<UserProcessInstanceFilterRepresentation> data) {
    this.data = data;
    return this;
  }

  public ResultListDataRepresentationUserProcessInstanceFilterRepresentation addDataItem(UserProcessInstanceFilterRepresentation dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid


  public List<UserProcessInstanceFilterRepresentation> getData() {
    return data;
  }

  public void setData(List<UserProcessInstanceFilterRepresentation> data) {
    this.data = data;
  }

  public ResultListDataRepresentationUserProcessInstanceFilterRepresentation size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")



  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ResultListDataRepresentationUserProcessInstanceFilterRepresentation start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")



  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public ResultListDataRepresentationUserProcessInstanceFilterRepresentation total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")



  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultListDataRepresentationUserProcessInstanceFilterRepresentation resultListDataRepresentationUserProcessInstanceFilterRepresentation = (ResultListDataRepresentationUserProcessInstanceFilterRepresentation) o;
    return Objects.equals(this.data, resultListDataRepresentationUserProcessInstanceFilterRepresentation.data) &&
        Objects.equals(this.size, resultListDataRepresentationUserProcessInstanceFilterRepresentation.size) &&
        Objects.equals(this.start, resultListDataRepresentationUserProcessInstanceFilterRepresentation.start) &&
        Objects.equals(this.total, resultListDataRepresentationUserProcessInstanceFilterRepresentation.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, size, start, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultListDataRepresentationUserProcessInstanceFilterRepresentation {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

