package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.governance.classification.model.SecurityMarks;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecurityMarkInformation
 */
@Validated

public class SecurityMarkInformation   {
  @JsonProperty("add")
  private SecurityMarks add = null;

  public SecurityMarkInformation add(SecurityMarks add) {
    this.add = add;
    return this;
  }

  /**
   * Get add
   * @return add
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SecurityMarks getAdd() {
    return add;
  }

  public void setAdd(SecurityMarks add) {
    this.add = add;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMarkInformation securityMarkInformation = (SecurityMarkInformation) o;
    return Objects.equals(this.add, securityMarkInformation.add);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMarkInformation {\n");
    
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
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

