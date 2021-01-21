package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.activiti.model.ProcessInstanceFilterRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserProcessInstanceFilterRepresentation
 */
@Validated


public class UserProcessInstanceFilterRepresentation   {
  @JsonProperty("appId")
  private Long appId = null;

  @JsonProperty("filter")
  private ProcessInstanceFilterRepresentation filter = null;

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

  public UserProcessInstanceFilterRepresentation appId(Long appId) {
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

  public UserProcessInstanceFilterRepresentation filter(ProcessInstanceFilterRepresentation filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid


  public ProcessInstanceFilterRepresentation getFilter() {
    return filter;
  }

  public void setFilter(ProcessInstanceFilterRepresentation filter) {
    this.filter = filter;
  }

  public UserProcessInstanceFilterRepresentation icon(String icon) {
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

  public UserProcessInstanceFilterRepresentation id(Long id) {
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

  public UserProcessInstanceFilterRepresentation index(Integer index) {
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

  public UserProcessInstanceFilterRepresentation name(String name) {
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

  public UserProcessInstanceFilterRepresentation recent(Boolean recent) {
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
    UserProcessInstanceFilterRepresentation userProcessInstanceFilterRepresentation = (UserProcessInstanceFilterRepresentation) o;
    return Objects.equals(this.appId, userProcessInstanceFilterRepresentation.appId) &&
        Objects.equals(this.filter, userProcessInstanceFilterRepresentation.filter) &&
        Objects.equals(this.icon, userProcessInstanceFilterRepresentation.icon) &&
        Objects.equals(this.id, userProcessInstanceFilterRepresentation.id) &&
        Objects.equals(this.index, userProcessInstanceFilterRepresentation.index) &&
        Objects.equals(this.name, userProcessInstanceFilterRepresentation.name) &&
        Objects.equals(this.recent, userProcessInstanceFilterRepresentation.recent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, filter, icon, id, index, name, recent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProcessInstanceFilterRepresentation {\n");
    
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

