package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A metric used in faceting
 */
@ApiModel(description = "A metric used in faceting")
@Validated

public class GenericMetric   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private Object value = null;

  public GenericMetric type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of metric, e.g. count
   * @return type
  **/
  @ApiModelProperty(value = "The type of metric, e.g. count")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GenericMetric value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * The metric value, e.g. {\"count\": 34} 
   * @return value
  **/
  @ApiModelProperty(value = "The metric value, e.g. {\"count\": 34} ")


  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
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
    GenericMetric genericMetric = (GenericMetric) o;
    return Objects.equals(this.type, genericMetric.type) &&
        Objects.equals(this.value, genericMetric.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericMetric {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

