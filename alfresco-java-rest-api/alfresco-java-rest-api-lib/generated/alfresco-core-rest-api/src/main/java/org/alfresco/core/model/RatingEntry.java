package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.core.model.Rating;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RatingEntry
 */
@Validated

public class RatingEntry   {
  @JsonProperty("entry")
  private Rating entry = null;

  public RatingEntry entry(Rating entry) {
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

  public Rating getEntry() {
    return entry;
  }

  public void setEntry(Rating entry) {
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
    RatingEntry ratingEntry = (RatingEntry) o;
    return Objects.equals(this.entry, ratingEntry.entry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingEntry {\n");
    
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

