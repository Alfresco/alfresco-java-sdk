package org.alfresco.governance.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChildAssociationInfo
 */
@Validated


public class ChildAssociationInfo   {
  @JsonProperty("assocType")
  private String assocType = null;

  @JsonProperty("isPrimary")
  private Boolean isPrimary = null;

  public ChildAssociationInfo assocType(String assocType) {
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

  public ChildAssociationInfo isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   * Get isPrimary
   * @return isPrimary
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public Boolean isIsPrimary() {
    return isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChildAssociationInfo childAssociationInfo = (ChildAssociationInfo) o;
    return Objects.equals(this.assocType, childAssociationInfo.assocType) &&
        Objects.equals(this.isPrimary, childAssociationInfo.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assocType, isPrimary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildAssociationInfo {\n");
    
    sb.append("    assocType: ").append(toIndentedString(assocType)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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

