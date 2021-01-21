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
 * A specific preference. 
 */
@ApiModel(description = "A specific preference. ")
@Validated


public class Preference   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("value")
  private String value = null;

  public Preference id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique id of the preference
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique id of the preference")
  @NotNull



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Preference value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the preference. Note that this can be of any JSON type.
   * @return value
  **/
  @ApiModelProperty(value = "The value of the preference. Note that this can be of any JSON type.")



  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preference preference = (Preference) o;
    return Objects.equals(this.id, preference.id) &&
        Objects.equals(this.value, preference.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

