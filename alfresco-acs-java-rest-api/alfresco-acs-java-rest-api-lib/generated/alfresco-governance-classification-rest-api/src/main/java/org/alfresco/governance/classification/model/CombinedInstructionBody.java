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
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.classification.model.ClassificationInformation;
import org.alfresco.governance.classification.model.InstructionBody;
import org.alfresco.governance.classification.model.SecurityMarkInformationBody;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CombinedInstructionBody
 */
@Validated

public class CombinedInstructionBody   {
  @JsonProperty("classificationInformation")
  private ClassificationInformation classificationInformation = null;

  @JsonProperty("securityMarkInformation")
  private SecurityMarkInformationBody securityMarkInformation = null;

  @JsonProperty("topicIds")
  @Valid
  private List<String> topicIds = null;

  public CombinedInstructionBody classificationInformation(ClassificationInformation classificationInformation) {
    this.classificationInformation = classificationInformation;
    return this;
  }

  /**
   * Get classificationInformation
   * @return classificationInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ClassificationInformation getClassificationInformation() {
    return classificationInformation;
  }

  public void setClassificationInformation(ClassificationInformation classificationInformation) {
    this.classificationInformation = classificationInformation;
  }

  public CombinedInstructionBody securityMarkInformation(SecurityMarkInformationBody securityMarkInformation) {
    this.securityMarkInformation = securityMarkInformation;
    return this;
  }

  /**
   * Get securityMarkInformation
   * @return securityMarkInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SecurityMarkInformationBody getSecurityMarkInformation() {
    return securityMarkInformation;
  }

  public void setSecurityMarkInformation(SecurityMarkInformationBody securityMarkInformation) {
    this.securityMarkInformation = securityMarkInformation;
  }

  public CombinedInstructionBody topicIds(List<String> topicIds) {
    this.topicIds = topicIds;
    return this;
  }

  public CombinedInstructionBody addTopicIdsItem(String topicIdsItem) {
    if (this.topicIds == null) {
      this.topicIds = new ArrayList<>();
    }
    this.topicIds.add(topicIdsItem);
    return this;
  }

  /**
   * Get topicIds
   * @return topicIds
  **/
  @ApiModelProperty(value = "")


  public List<String> getTopicIds() {
    return topicIds;
  }

  public void setTopicIds(List<String> topicIds) {
    this.topicIds = topicIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CombinedInstructionBody combinedInstructionBody = (CombinedInstructionBody) o;
    return Objects.equals(this.classificationInformation, combinedInstructionBody.classificationInformation) &&
        Objects.equals(this.securityMarkInformation, combinedInstructionBody.securityMarkInformation) &&
        Objects.equals(this.topicIds, combinedInstructionBody.topicIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationInformation, securityMarkInformation, topicIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CombinedInstructionBody {\n");
    
    sb.append("    classificationInformation: ").append(toIndentedString(classificationInformation)).append("\n");
    sb.append("    securityMarkInformation: ").append(toIndentedString(securityMarkInformation)).append("\n");
    sb.append("    topicIds: ").append(toIndentedString(topicIds)).append("\n");
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

