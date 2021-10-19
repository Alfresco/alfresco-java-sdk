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
 * Additional information of nested facet
 */
@ApiModel(description = "Additional information of nested facet")
@Validated

public class GenericBucketBucketInfo   {
  @JsonProperty("start")
  private String start = null;

  @JsonProperty("startInclusive")
  private Boolean startInclusive = null;

  @JsonProperty("end")
  private String end = null;

  @JsonProperty("endInclusive")
  private Boolean endInclusive = null;

  public GenericBucketBucketInfo start(String start) {
    this.start = start;
    return this;
  }

  /**
   * The start of range
   * @return start
  **/
  @ApiModelProperty(value = "The start of range")


  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public GenericBucketBucketInfo startInclusive(Boolean startInclusive) {
    this.startInclusive = startInclusive;
    return this;
  }

  /**
   * Includes values greater or equal to \"start\"
   * @return startInclusive
  **/
  @ApiModelProperty(value = "Includes values greater or equal to \"start\"")


  public Boolean isStartInclusive() {
    return startInclusive;
  }

  public void setStartInclusive(Boolean startInclusive) {
    this.startInclusive = startInclusive;
  }

  public GenericBucketBucketInfo end(String end) {
    this.end = end;
    return this;
  }

  /**
   * The end of range
   * @return end
  **/
  @ApiModelProperty(value = "The end of range")


  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public GenericBucketBucketInfo endInclusive(Boolean endInclusive) {
    this.endInclusive = endInclusive;
    return this;
  }

  /**
   * Includes values less than or equal to \"end\"
   * @return endInclusive
  **/
  @ApiModelProperty(value = "Includes values less than or equal to \"end\"")


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
    GenericBucketBucketInfo genericBucketBucketInfo = (GenericBucketBucketInfo) o;
    return Objects.equals(this.start, genericBucketBucketInfo.start) &&
        Objects.equals(this.startInclusive, genericBucketBucketInfo.startInclusive) &&
        Objects.equals(this.end, genericBucketBucketInfo.end) &&
        Objects.equals(this.endInclusive, genericBucketBucketInfo.endInclusive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, startInclusive, end, endInclusive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericBucketBucketInfo {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    startInclusive: ").append(toIndentedString(startInclusive)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

