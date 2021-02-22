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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClassificationInformation
 */
@Validated

public class ClassificationInformation   {
  @JsonProperty("level")
  private String level = null;

  @JsonProperty("classificationAgency")
  private String classificationAgency = null;

  @JsonProperty("reasonIds")
  @Valid
  private List<String> reasonIds = new ArrayList<>();

  @JsonProperty("downgradeOn")
  private LocalDate downgradeOn = null;

  @JsonProperty("downgradeEvent")
  private String downgradeEvent = null;

  @JsonProperty("downgradeInstructions")
  private String downgradeInstructions = null;

  @JsonProperty("declassifyOn")
  private LocalDate declassifyOn = null;

  @JsonProperty("declassificationEvent")
  private String declassificationEvent = null;

  @JsonProperty("exemptionIds")
  @Valid
  private List<String> exemptionIds = null;

  public ClassificationInformation level(String level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public ClassificationInformation classificationAgency(String classificationAgency) {
    this.classificationAgency = classificationAgency;
    return this;
  }

  /**
   * Get classificationAgency
   * @return classificationAgency
  **/
  @ApiModelProperty(value = "")


  public String getClassificationAgency() {
    return classificationAgency;
  }

  public void setClassificationAgency(String classificationAgency) {
    this.classificationAgency = classificationAgency;
  }

  public ClassificationInformation reasonIds(List<String> reasonIds) {
    this.reasonIds = reasonIds;
    return this;
  }

  public ClassificationInformation addReasonIdsItem(String reasonIdsItem) {
    this.reasonIds.add(reasonIdsItem);
    return this;
  }

  /**
   * Get reasonIds
   * @return reasonIds
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(min=1) 
  public List<String> getReasonIds() {
    return reasonIds;
  }

  public void setReasonIds(List<String> reasonIds) {
    this.reasonIds = reasonIds;
  }

  public ClassificationInformation downgradeOn(LocalDate downgradeOn) {
    this.downgradeOn = downgradeOn;
    return this;
  }

  /**
   * Get downgradeOn
   * @return downgradeOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDowngradeOn() {
    return downgradeOn;
  }

  public void setDowngradeOn(LocalDate downgradeOn) {
    this.downgradeOn = downgradeOn;
  }

  public ClassificationInformation downgradeEvent(String downgradeEvent) {
    this.downgradeEvent = downgradeEvent;
    return this;
  }

  /**
   * Get downgradeEvent
   * @return downgradeEvent
  **/
  @ApiModelProperty(value = "")


  public String getDowngradeEvent() {
    return downgradeEvent;
  }

  public void setDowngradeEvent(String downgradeEvent) {
    this.downgradeEvent = downgradeEvent;
  }

  public ClassificationInformation downgradeInstructions(String downgradeInstructions) {
    this.downgradeInstructions = downgradeInstructions;
    return this;
  }

  /**
   * Get downgradeInstructions
   * @return downgradeInstructions
  **/
  @ApiModelProperty(value = "")


  public String getDowngradeInstructions() {
    return downgradeInstructions;
  }

  public void setDowngradeInstructions(String downgradeInstructions) {
    this.downgradeInstructions = downgradeInstructions;
  }

  public ClassificationInformation declassifyOn(LocalDate declassifyOn) {
    this.declassifyOn = declassifyOn;
    return this;
  }

  /**
   * Get declassifyOn
   * @return declassifyOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDeclassifyOn() {
    return declassifyOn;
  }

  public void setDeclassifyOn(LocalDate declassifyOn) {
    this.declassifyOn = declassifyOn;
  }

  public ClassificationInformation declassificationEvent(String declassificationEvent) {
    this.declassificationEvent = declassificationEvent;
    return this;
  }

  /**
   * Get declassificationEvent
   * @return declassificationEvent
  **/
  @ApiModelProperty(value = "")


  public String getDeclassificationEvent() {
    return declassificationEvent;
  }

  public void setDeclassificationEvent(String declassificationEvent) {
    this.declassificationEvent = declassificationEvent;
  }

  public ClassificationInformation exemptionIds(List<String> exemptionIds) {
    this.exemptionIds = exemptionIds;
    return this;
  }

  public ClassificationInformation addExemptionIdsItem(String exemptionIdsItem) {
    if (this.exemptionIds == null) {
      this.exemptionIds = new ArrayList<>();
    }
    this.exemptionIds.add(exemptionIdsItem);
    return this;
  }

  /**
   * Get exemptionIds
   * @return exemptionIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getExemptionIds() {
    return exemptionIds;
  }

  public void setExemptionIds(List<String> exemptionIds) {
    this.exemptionIds = exemptionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationInformation classificationInformation = (ClassificationInformation) o;
    return Objects.equals(this.level, classificationInformation.level) &&
        Objects.equals(this.classificationAgency, classificationInformation.classificationAgency) &&
        Objects.equals(this.reasonIds, classificationInformation.reasonIds) &&
        Objects.equals(this.downgradeOn, classificationInformation.downgradeOn) &&
        Objects.equals(this.downgradeEvent, classificationInformation.downgradeEvent) &&
        Objects.equals(this.downgradeInstructions, classificationInformation.downgradeInstructions) &&
        Objects.equals(this.declassifyOn, classificationInformation.declassifyOn) &&
        Objects.equals(this.declassificationEvent, classificationInformation.declassificationEvent) &&
        Objects.equals(this.exemptionIds, classificationInformation.exemptionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, classificationAgency, reasonIds, downgradeOn, downgradeEvent, downgradeInstructions, declassifyOn, declassificationEvent, exemptionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationInformation {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    classificationAgency: ").append(toIndentedString(classificationAgency)).append("\n");
    sb.append("    reasonIds: ").append(toIndentedString(reasonIds)).append("\n");
    sb.append("    downgradeOn: ").append(toIndentedString(downgradeOn)).append("\n");
    sb.append("    downgradeEvent: ").append(toIndentedString(downgradeEvent)).append("\n");
    sb.append("    downgradeInstructions: ").append(toIndentedString(downgradeInstructions)).append("\n");
    sb.append("    declassifyOn: ").append(toIndentedString(declassifyOn)).append("\n");
    sb.append("    declassificationEvent: ").append(toIndentedString(declassificationEvent)).append("\n");
    sb.append("    exemptionIds: ").append(toIndentedString(exemptionIds)).append("\n");
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

