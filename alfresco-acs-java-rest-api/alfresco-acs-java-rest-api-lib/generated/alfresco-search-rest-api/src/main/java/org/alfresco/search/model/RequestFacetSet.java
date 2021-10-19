/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
 * The interval to Set
 */
@ApiModel(description = "The interval to Set")
@Validated

public class RequestFacetSet   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("start")
  private String start = null;

  @JsonProperty("end")
  private String end = null;

  @JsonProperty("startInclusive")
  private Boolean startInclusive = true;

  @JsonProperty("endInclusive")
  private Boolean endInclusive = true;

  public RequestFacetSet label(String label) {
    this.label = label;
    return this;
  }

  /**
   * A label to use to identify the set
   * @return label
  **/
  @ApiModelProperty(value = "A label to use to identify the set")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public RequestFacetSet start(String start) {
    this.start = start;
    return this;
  }

  /**
   * The start of the range
   * @return start
  **/
  @ApiModelProperty(value = "The start of the range")


  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public RequestFacetSet end(String end) {
    this.end = end;
    return this;
  }

  /**
   * The end of the range
   * @return end
  **/
  @ApiModelProperty(value = "The end of the range")


  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public RequestFacetSet startInclusive(Boolean startInclusive) {
    this.startInclusive = startInclusive;
    return this;
  }

  /**
   * When true, the set will include values greater or equal to \"start\"
   * @return startInclusive
  **/
  @ApiModelProperty(value = "When true, the set will include values greater or equal to \"start\"")


  public Boolean isStartInclusive() {
    return startInclusive;
  }

  public void setStartInclusive(Boolean startInclusive) {
    this.startInclusive = startInclusive;
  }

  public RequestFacetSet endInclusive(Boolean endInclusive) {
    this.endInclusive = endInclusive;
    return this;
  }

  /**
   * When true, the set will include values less than or equal to \"end\"
   * @return endInclusive
  **/
  @ApiModelProperty(value = "When true, the set will include values less than or equal to \"end\"")


  public Boolean isEndInclusive() {
    return endInclusive;
  }

  public void setEndInclusive(Boolean endInclusive) {
    this.endInclusive = endInclusive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestFacetSet requestFacetSet = (RequestFacetSet) o;
    return Objects.equals(this.label, requestFacetSet.label) &&
        Objects.equals(this.start, requestFacetSet.start) &&
        Objects.equals(this.end, requestFacetSet.end) &&
        Objects.equals(this.startInclusive, requestFacetSet.startInclusive) &&
        Objects.equals(this.endInclusive, requestFacetSet.endInclusive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, start, end, startInclusive, endInclusive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestFacetSet {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    startInclusive: ").append(toIndentedString(startInclusive)).append("\n");
    sb.append("    endInclusive: ").append(toIndentedString(endInclusive)).append("\n");
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

