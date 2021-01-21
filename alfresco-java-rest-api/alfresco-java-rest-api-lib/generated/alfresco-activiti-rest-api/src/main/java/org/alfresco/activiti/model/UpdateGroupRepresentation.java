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
 * UpdateGroupRepresentation
 */
@Validated


public class UpdateGroupRepresentation   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentGroupId")
  private Long parentGroupId = null;

  public UpdateGroupRepresentation name(String name) {
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

  public UpdateGroupRepresentation parentGroupId(Long parentGroupId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupRepresentation updateGroupRepresentation = (UpdateGroupRepresentation) o;
    return Objects.equals(this.name, updateGroupRepresentation.name) &&
        Objects.equals(this.parentGroupId, updateGroupRepresentation.parentGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parentGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupRepresentation {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
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

