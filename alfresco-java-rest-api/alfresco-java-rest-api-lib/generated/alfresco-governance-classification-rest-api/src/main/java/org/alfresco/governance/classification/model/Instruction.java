package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.governance.classification.model.ClassificationInformation;
import org.alfresco.governance.classification.model.SecurityMarkInformation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about how a piece of content should be secured. This field is only included when requested.
 */
@ApiModel(description = "Information about how a piece of content should be secured. This field is only included when requested.")
@Validated

public class Instruction   {
  @JsonProperty("classificationInformation")
  private ClassificationInformation classificationInformation = null;

  @JsonProperty("securityMarkInformation")
  private SecurityMarkInformation securityMarkInformation = null;

  public Instruction classificationInformation(ClassificationInformation classificationInformation) {
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

  public Instruction securityMarkInformation(SecurityMarkInformation securityMarkInformation) {
    this.securityMarkInformation = securityMarkInformation;
    return this;
  }

  /**
   * Get securityMarkInformation
   * @return securityMarkInformation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SecurityMarkInformation getSecurityMarkInformation() {
    return securityMarkInformation;
  }

  public void setSecurityMarkInformation(SecurityMarkInformation securityMarkInformation) {
    this.securityMarkInformation = securityMarkInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instruction instruction = (Instruction) o;
    return Objects.equals(this.classificationInformation, instruction.classificationInformation) &&
        Objects.equals(this.securityMarkInformation, instruction.securityMarkInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classificationInformation, securityMarkInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instruction {\n");
    
    sb.append("    classificationInformation: ").append(toIndentedString(classificationInformation)).append("\n");
    sb.append("    securityMarkInformation: ").append(toIndentedString(securityMarkInformation)).append("\n");
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

