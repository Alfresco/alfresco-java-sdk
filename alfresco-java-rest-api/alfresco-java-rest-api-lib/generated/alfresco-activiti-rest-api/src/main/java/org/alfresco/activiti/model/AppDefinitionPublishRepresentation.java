package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppDefinitionPublishRepresentation
 */
@Validated

public class AppDefinitionPublishRepresentation   {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("force")
  private Boolean force = null;

  public AppDefinitionPublishRepresentation comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public AppDefinitionPublishRepresentation force(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * Get force
   * @return force
  **/
  @ApiModelProperty(value = "")


  public Boolean isForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDefinitionPublishRepresentation appDefinitionPublishRepresentation = (AppDefinitionPublishRepresentation) o;
    return Objects.equals(this.comment, appDefinitionPublishRepresentation.comment) &&
        Objects.equals(this.force, appDefinitionPublishRepresentation.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDefinitionPublishRepresentation {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

