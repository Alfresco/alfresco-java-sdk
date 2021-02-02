package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.governance.classification.model.InstructionBody;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TopicBody
 */
@Validated

public class TopicBody   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("instruction")
  private InstructionBody instruction = null;

  public TopicBody name(String name) {
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

  public TopicBody description(String description) {
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

  public TopicBody instruction(InstructionBody instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Get instruction
   * @return instruction
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InstructionBody getInstruction() {
    return instruction;
  }

  public void setInstruction(InstructionBody instruction) {
    this.instruction = instruction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopicBody topicBody = (TopicBody) o;
    return Objects.equals(this.name, topicBody.name) &&
        Objects.equals(this.description, topicBody.description) &&
        Objects.equals(this.instruction, topicBody.instruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, instruction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopicBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
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

