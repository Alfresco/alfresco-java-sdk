package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Scope
 */
@ApiModel(description = "Scope")
@Validated

public class RequestScope   {
  /**
   * The locations to include in the query
   */
  public enum LocationsEnum {
    NODES("nodes"),

    VERSIONS("versions"),

    DELETED_NODES("deleted-nodes");

    private String value;

    LocationsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LocationsEnum fromValue(String text) {
      for (LocationsEnum b : LocationsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("locations")
  private LocationsEnum locations = null;

  public RequestScope locations(LocationsEnum locations) {
    this.locations = locations;
    return this;
  }

  /**
   * The locations to include in the query
   * @return locations
  **/
  @ApiModelProperty(value = "The locations to include in the query ")


  public LocationsEnum getLocations() {
    return locations;
  }

  public void setLocations(LocationsEnum locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestScope requestScope = (RequestScope) o;
    return Objects.equals(this.locations, requestScope.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestScope {\n");

    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

