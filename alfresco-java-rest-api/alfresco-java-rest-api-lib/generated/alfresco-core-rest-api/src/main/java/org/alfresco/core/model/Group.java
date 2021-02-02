package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Group
 */
@Validated

public class Group   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("isRoot")
  private Boolean isRoot = true;

  @JsonProperty("parentIds")
  @Valid
  private List<String> parentIds = null;

  @JsonProperty("zones")
  @Valid
  private List<String> zones = null;

  public Group id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Group displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Group isRoot(Boolean isRoot) {
    this.isRoot = isRoot;
    return this;
  }

  /**
   * Get isRoot
   * @return isRoot
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsRoot() {
    return isRoot;
  }

  public void setIsRoot(Boolean isRoot) {
    this.isRoot = isRoot;
  }

  public Group parentIds(List<String> parentIds) {
    this.parentIds = parentIds;
    return this;
  }

  public Group addParentIdsItem(String parentIdsItem) {
    if (this.parentIds == null) {
      this.parentIds = new ArrayList<>();
    }
    this.parentIds.add(parentIdsItem);
    return this;
  }

  /**
   * Get parentIds
   * @return parentIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getParentIds() {
    return parentIds;
  }

  public void setParentIds(List<String> parentIds) {
    this.parentIds = parentIds;
  }

  public Group zones(List<String> zones) {
    this.zones = zones;
    return this;
  }

  public Group addZonesItem(String zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<>();
    }
    this.zones.add(zonesItem);
    return this;
  }

  /**
   * Get zones
   * @return zones
  **/
  @ApiModelProperty(value = "")


  public List<String> getZones() {
    return zones;
  }

  public void setZones(List<String> zones) {
    this.zones = zones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.displayName, group.displayName) &&
        Objects.equals(this.isRoot, group.isRoot) &&
        Objects.equals(this.parentIds, group.parentIds) &&
        Objects.equals(this.zones, group.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, isRoot, parentIds, zones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isRoot: ").append(toIndentedString(isRoot)).append("\n");
    sb.append("    parentIds: ").append(toIndentedString(parentIds)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

