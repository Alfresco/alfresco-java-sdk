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
 * GroupBodyCreate
 */
@Validated

public class GroupBodyCreate   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("parentIds")
  @Valid
  private List<String> parentIds = null;

  public GroupBodyCreate id(String id) {
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

  public GroupBodyCreate displayName(String displayName) {
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

  public GroupBodyCreate parentIds(List<String> parentIds) {
    this.parentIds = parentIds;
    return this;
  }

  public GroupBodyCreate addParentIdsItem(String parentIdsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupBodyCreate groupBodyCreate = (GroupBodyCreate) o;
    return Objects.equals(this.id, groupBodyCreate.id) &&
        Objects.equals(this.displayName, groupBodyCreate.displayName) &&
        Objects.equals(this.parentIds, groupBodyCreate.parentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, parentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupBodyCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parentIds: ").append(toIndentedString(parentIds)).append("\n");
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

