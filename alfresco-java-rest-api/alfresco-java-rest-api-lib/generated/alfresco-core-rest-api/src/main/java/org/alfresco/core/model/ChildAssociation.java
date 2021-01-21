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
 * ChildAssociation
 */
@Validated


public class ChildAssociation   {
  @JsonProperty("childId")
  private String childId = null;

  @JsonProperty("assocType")
  private String assocType = null;

  public ChildAssociation childId(String childId) {
    this.childId = childId;
    return this;
  }

  /**
   * Get childId
   * @return childId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getChildId() {
    return childId;
  }

  public void setChildId(String childId) {
    this.childId = childId;
  }

  public ChildAssociation assocType(String assocType) {
    this.assocType = assocType;
    return this;
  }

  /**
   * Get assocType
   * @return assocType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



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
    ChildAssociation childAssociation = (ChildAssociation) o;
    return Objects.equals(this.childId, childAssociation.childId) &&
        Objects.equals(this.assocType, childAssociation.assocType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childId, assocType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildAssociation {\n");
    
    sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
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

