package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeletedNodeBodyRestore
 */
@Validated

public class DeletedNodeBodyRestore   {
  @JsonProperty("targetParentId")
  private String targetParentId = null;

  @JsonProperty("assocType")
  private String assocType = null;

  public DeletedNodeBodyRestore targetParentId(String targetParentId) {
    this.targetParentId = targetParentId;
    return this;
  }

  /**
   * Get targetParentId
   * @return targetParentId
  **/
  @ApiModelProperty(value = "")


  public String getTargetParentId() {
    return targetParentId;
  }

  public void setTargetParentId(String targetParentId) {
    this.targetParentId = targetParentId;
  }

  public DeletedNodeBodyRestore assocType(String assocType) {
    this.assocType = assocType;
    return this;
  }

  /**
   * Get assocType
   * @return assocType
  **/
  @ApiModelProperty(value = "")


  public String getAssocType() {
    return assocType;
  }

  public void setAssocType(String assocType) {
    this.assocType = assocType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedNodeBodyRestore deletedNodeBodyRestore = (DeletedNodeBodyRestore) o;
    return Objects.equals(this.targetParentId, deletedNodeBodyRestore.targetParentId) &&
        Objects.equals(this.assocType, deletedNodeBodyRestore.assocType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetParentId, assocType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedNodeBodyRestore {\n");
    
    sb.append("    targetParentId: ").append(toIndentedString(targetParentId)).append("\n");
    sb.append("    assocType: ").append(toIndentedString(assocType)).append("\n");
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

