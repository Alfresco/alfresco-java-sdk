package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.activiti.model.TaskFilterRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskFilterRequestRepresentation
 */
@Validated


public class TaskFilterRequestRepresentation   {
  @JsonProperty("appDefinitionId")
  private Long appDefinitionId = null;

  @JsonProperty("filter")
  private TaskFilterRepresentation filter = null;

  @JsonProperty("filterId")
  private Long filterId = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("size")
  private Integer size = null;

  public TaskFilterRequestRepresentation appDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
    return this;
  }

  /**
   * Get appDefinitionId
   * @return appDefinitionId
  **/
  @ApiModelProperty(value = "")



  public Long getAppDefinitionId() {
    return appDefinitionId;
  }

  public void setAppDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
  }

  public TaskFilterRequestRepresentation filter(TaskFilterRepresentation filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid


  public TaskFilterRepresentation getFilter() {
    return filter;
  }

  public void setFilter(TaskFilterRepresentation filter) {
    this.filter = filter;
  }

  public TaskFilterRequestRepresentation filterId(Long filterId) {
    this.filterId = filterId;
    return this;
  }

  /**
   * Get filterId
   * @return filterId
  **/
  @ApiModelProperty(value = "")



  public Long getFilterId() {
    return filterId;
  }

  public void setFilterId(Long filterId) {
    this.filterId = filterId;
  }

  public TaskFilterRequestRepresentation page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")



  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public TaskFilterRequestRepresentation size(Integer size) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskFilterRequestRepresentation taskFilterRequestRepresentation = (TaskFilterRequestRepresentation) o;
    return Objects.equals(this.appDefinitionId, taskFilterRequestRepresentation.appDefinitionId) &&
        Objects.equals(this.filter, taskFilterRequestRepresentation.filter) &&
        Objects.equals(this.filterId, taskFilterRequestRepresentation.filterId) &&
        Objects.equals(this.page, taskFilterRequestRepresentation.page) &&
        Objects.equals(this.size, taskFilterRequestRepresentation.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinitionId, filter, filterId, page, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskFilterRequestRepresentation {\n");
    
    sb.append("    appDefinitionId: ").append(toIndentedString(appDefinitionId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    filterId: ").append(toIndentedString(filterId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

