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
import java.time.OffsetDateTime;
import org.alfresco.governance.classification.model.ClassificationGuideInTopic;
import org.alfresco.governance.classification.model.Instruction;
import org.alfresco.governance.classification.model.Path;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Topic
 */
@Validated

public class Topic   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("hasInstruction")
  private Boolean hasInstruction = null;

  @JsonProperty("instruction")
  private Instruction instruction = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("hasSubtopics")
  private Boolean hasSubtopics = false;

  @JsonProperty("path")
  private Path path = null;

  @JsonProperty("classificationGuide")
  private ClassificationGuideInTopic classificationGuide = null;

  public Topic id(String id) {
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

  public Topic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Topic description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Topic hasInstruction(Boolean hasInstruction) {
    this.hasInstruction = hasInstruction;
    return this;
  }

  /**
   * Flag indicating whether the topic has an instruction or not.
   * @return hasInstruction
  **/
  @ApiModelProperty(required = true, value = "Flag indicating whether the topic has an instruction or not.")
  @NotNull


  public Boolean isHasInstruction() {
    return hasInstruction;
  }

  public void setHasInstruction(Boolean hasInstruction) {
    this.hasInstruction = hasInstruction;
  }

  public Topic instruction(Instruction instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Get instruction
   * @return instruction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instruction getInstruction() {
    return instruction;
  }

  public void setInstruction(Instruction instruction) {
    this.instruction = instruction;
  }

  public Topic createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Topic hasSubtopics(Boolean hasSubtopics) {
    this.hasSubtopics = hasSubtopics;
    return this;
  }

  /**
   * Flag indicating whether the topic has subtopics. This field is only included when requested.
   * @return hasSubtopics
  **/
  @ApiModelProperty(value = "Flag indicating whether the topic has subtopics. This field is only included when requested.")


  public Boolean isHasSubtopics() {
    return hasSubtopics;
  }

  public void setHasSubtopics(Boolean hasSubtopics) {
    this.hasSubtopics = hasSubtopics;
  }

  public Topic path(Path path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Path getPath() {
    return path;
  }

  public void setPath(Path path) {
    this.path = path;
  }

  public Topic classificationGuide(ClassificationGuideInTopic classificationGuide) {
    this.classificationGuide = classificationGuide;
    return this;
  }

  /**
   * Get classificationGuide
   * @return classificationGuide
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ClassificationGuideInTopic getClassificationGuide() {
    return classificationGuide;
  }

  public void setClassificationGuide(ClassificationGuideInTopic classificationGuide) {
    this.classificationGuide = classificationGuide;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Topic topic = (Topic) o;
    return Objects.equals(this.id, topic.id) &&
        Objects.equals(this.name, topic.name) &&
        Objects.equals(this.description, topic.description) &&
        Objects.equals(this.hasInstruction, topic.hasInstruction) &&
        Objects.equals(this.instruction, topic.instruction) &&
        Objects.equals(this.createdAt, topic.createdAt) &&
        Objects.equals(this.hasSubtopics, topic.hasSubtopics) &&
        Objects.equals(this.path, topic.path) &&
        Objects.equals(this.classificationGuide, topic.classificationGuide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, hasInstruction, instruction, createdAt, hasSubtopics, path, classificationGuide);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Topic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasInstruction: ").append(toIndentedString(hasInstruction)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hasSubtopics: ").append(toIndentedString(hasSubtopics)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    classificationGuide: ").append(toIndentedString(classificationGuide)).append("\n");
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

