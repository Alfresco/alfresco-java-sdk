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
 * RequestBodyFile
 */
@Validated


public class RequestBodyFile   {
  @JsonProperty("targetParentId")
  private String targetParentId = null;

  public RequestBodyFile targetParentId(String targetParentId) {
    this.targetParentId = targetParentId;
    return this;
  }

  /**
   * Get targetParentId
   * @return targetParentId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getTargetParentId() {
    return targetParentId;
  }

  public void setTargetParentId(String targetParentId) {
    this.targetParentId = targetParentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBodyFile requestBodyFile = (RequestBodyFile) o;
    return Objects.equals(this.targetParentId, requestBodyFile.targetParentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetParentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBodyFile {\n");
    
    sb.append("    targetParentId: ").append(toIndentedString(targetParentId)).append("\n");
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

