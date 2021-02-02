package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.core.model.SiteMembershipRequestWithPerson;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SiteMembershipRequestWithPersonEntry
 */
@Validated

public class SiteMembershipRequestWithPersonEntry   {
  @JsonProperty("entry")
  private SiteMembershipRequestWithPerson entry = null;

  public SiteMembershipRequestWithPersonEntry entry(SiteMembershipRequestWithPerson entry) {
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

  public SiteMembershipRequestWithPerson getEntry() {
    return entry;
  }

  public void setEntry(SiteMembershipRequestWithPerson entry) {
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
    SiteMembershipRequestWithPersonEntry siteMembershipRequestWithPersonEntry = (SiteMembershipRequestWithPersonEntry) o;
    return Objects.equals(this.entry, siteMembershipRequestWithPersonEntry.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteMembershipRequestWithPersonEntry {\n");
    
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

