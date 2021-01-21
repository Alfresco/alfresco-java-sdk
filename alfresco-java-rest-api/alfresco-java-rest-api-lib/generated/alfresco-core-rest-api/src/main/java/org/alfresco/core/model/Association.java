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
 * Association
 */
@Validated


public class Association   {
  @JsonProperty("targetId")
  private String targetId = null;

  @JsonProperty("assocType")
  private String assocType = null;

  public Association targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public Association assocType(String assocType) {
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
    Association association = (Association) o;
    return Objects.equals(this.targetId, association.targetId) &&
        Objects.equals(this.assocType, association.assocType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, assocType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Association {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

