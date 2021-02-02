package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.core.model.AuditApp;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditAppEntry
 */
@Validated

public class AuditAppEntry   {
  @JsonProperty("entry")
  private AuditApp entry = null;

  public AuditAppEntry entry(AuditApp entry) {
    this.entry = entry;
    return this;
  }

  /**
   * Get entry
   * @return entry
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AuditApp getEntry() {
    return entry;
  }

  public void setEntry(AuditApp entry) {
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
    AuditAppEntry auditAppEntry = (AuditAppEntry) o;
    return Objects.equals(this.entry, auditAppEntry.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditAppEntry {\n");
    
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

