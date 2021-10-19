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
 * ClassificationLevel
 */
@Validated

public class ClassificationLevel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("displayLabel")
  private String displayLabel = null;

  @JsonProperty("isUnmarkedMark")
  private Boolean isUnmarkedMark = null;

  public ClassificationLevel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ClassificationLevel displayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

  /**
   * Get displayLabel
   * @return displayLabel
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }

  public ClassificationLevel isUnmarkedMark(Boolean isUnmarkedMark) {
    this.isUnmarkedMark = isUnmarkedMark;
    return this;
  }

  /**
   * Get isUnmarkedMark
   * @return isUnmarkedMark
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsUnmarkedMark() {
    return isUnmarkedMark;
  }

  public void setIsUnmarkedMark(Boolean isUnmarkedMark) {
    this.isUnmarkedMark = isUnmarkedMark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationLevel classificationLevel = (ClassificationLevel) o;
    return Objects.equals(this.id, classificationLevel.id) &&
        Objects.equals(this.displayLabel, classificationLevel.displayLabel) &&
        Objects.equals(this.isUnmarkedMark, classificationLevel.isUnmarkedMark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayLabel, isUnmarkedMark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationLevel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    isUnmarkedMark: ").append(toIndentedString(isUnmarkedMark)).append("\n");
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

