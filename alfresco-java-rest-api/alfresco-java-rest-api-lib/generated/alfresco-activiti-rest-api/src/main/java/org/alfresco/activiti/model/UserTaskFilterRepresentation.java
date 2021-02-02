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
 * UserTaskFilterRepresentation
 */
@Validated

public class UserTaskFilterRepresentation   {
  @JsonProperty("appId")
  private Long appId = null;

  @JsonProperty("filter")
  private TaskFilterRepresentation filter = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recent")
  private Boolean recent = null;

  public UserTaskFilterRepresentation appId(Long appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(value = "")


  public Long getAppId() {
    return appId;
  }

  public void setAppId(Long appId) {
    this.appId = appId;
  }

  public UserTaskFilterRepresentation filter(TaskFilterRepresentation filter) {
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

  public UserTaskFilterRepresentation icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public UserTaskFilterRepresentation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserTaskFilterRepresentation index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")


  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public UserTaskFilterRepresentation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserTaskFilterRepresentation recent(Boolean recent) {
    this.recent = recent;
    return this;
  }

  /**
   * Get recent
   * @return recent
  **/
  @ApiModelProperty(value = "")


  public Boolean isRecent() {
    return recent;
  }

  public void setRecent(Boolean recent) {
    this.recent = recent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTaskFilterRepresentation userTaskFilterRepresentation = (UserTaskFilterRepresentation) o;
    return Objects.equals(this.appId, userTaskFilterRepresentation.appId) &&
        Objects.equals(this.filter, userTaskFilterRepresentation.filter) &&
        Objects.equals(this.icon, userTaskFilterRepresentation.icon) &&
        Objects.equals(this.id, userTaskFilterRepresentation.id) &&
        Objects.equals(this.index, userTaskFilterRepresentation.index) &&
        Objects.equals(this.name, userTaskFilterRepresentation.name) &&
        Objects.equals(this.recent, userTaskFilterRepresentation.recent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, filter, icon, id, index, name, recent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTaskFilterRepresentation {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recent: ").append(toIndentedString(recent)).append("\n");
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

