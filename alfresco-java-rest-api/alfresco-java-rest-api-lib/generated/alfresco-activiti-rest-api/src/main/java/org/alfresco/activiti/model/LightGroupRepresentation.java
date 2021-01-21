package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.LightGroupRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LightGroupRepresentation
 */
@Validated


public class LightGroupRepresentation   {
  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("groups")
  @Valid
  private List<LightGroupRepresentation> groups = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentGroupId")
  private Long parentGroupId = null;

  @JsonProperty("status")
  private String status = null;

  public LightGroupRepresentation externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")



  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public LightGroupRepresentation groups(List<LightGroupRepresentation> groups) {
    this.groups = groups;
    return this;
  }

  public LightGroupRepresentation addGroupsItem(LightGroupRepresentation groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")

  @Valid


  public List<LightGroupRepresentation> getGroups() {
    return groups;
  }

  public void setGroups(List<LightGroupRepresentation> groups) {
    this.groups = groups;
  }

  public LightGroupRepresentation id(Long id) {
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

  public LightGroupRepresentation name(String name) {
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

  public LightGroupRepresentation parentGroupId(Long parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

  /**
   * Get parentGroupId
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "")



  public Long getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(Long parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public LightGroupRepresentation status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")



  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LightGroupRepresentation lightGroupRepresentation = (LightGroupRepresentation) o;
    return Objects.equals(this.externalId, lightGroupRepresentation.externalId) &&
        Objects.equals(this.groups, lightGroupRepresentation.groups) &&
        Objects.equals(this.id, lightGroupRepresentation.id) &&
        Objects.equals(this.name, lightGroupRepresentation.name) &&
        Objects.equals(this.parentGroupId, lightGroupRepresentation.parentGroupId) &&
        Objects.equals(this.status, lightGroupRepresentation.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, groups, id, name, parentGroupId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LightGroupRepresentation {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

