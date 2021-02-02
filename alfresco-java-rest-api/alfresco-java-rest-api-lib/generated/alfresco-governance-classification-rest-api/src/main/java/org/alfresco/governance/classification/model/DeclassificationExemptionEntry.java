package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.governance.classification.model.DeclassificationExemption;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeclassificationExemptionEntry
 */
@Validated

public class DeclassificationExemptionEntry   {
  @JsonProperty("entry")
  private DeclassificationExemption entry = null;

  public DeclassificationExemptionEntry entry(DeclassificationExemption entry) {
    this.entry = entry;
    return this;
  }

  /**
   * Get entry
   * @return entry
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DeclassificationExemption getEntry() {
    return entry;
  }

  public void setEntry(DeclassificationExemption entry) {
    this.entry = entry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeclassificationExemptionEntry declassificationExemptionEntry = (DeclassificationExemptionEntry) o;
    return Objects.equals(this.entry, declassificationExemptionEntry.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclassificationExemptionEntry {\n");
    
    sb.append("    entry: ").append(toIndentedString(entry)).append("\n");
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

