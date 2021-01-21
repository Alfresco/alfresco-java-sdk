package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeclassificationDateRecalculationProcessBody
 */
@Validated


public class DeclassificationDateRecalculationProcessBody   {
  @JsonProperty("id")
  private String id = null;

  public DeclassificationDateRecalculationProcessBody id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the process. The only supported process id is \"-declassificationDateRecalculationProcess-\".
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the process. The only supported process id is \"-declassificationDateRecalculationProcess-\".")
  @NotNull



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeclassificationDateRecalculationProcessBody declassificationDateRecalculationProcessBody = (DeclassificationDateRecalculationProcessBody) o;
    return Objects.equals(this.id, declassificationDateRecalculationProcessBody.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclassificationDateRecalculationProcessBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

