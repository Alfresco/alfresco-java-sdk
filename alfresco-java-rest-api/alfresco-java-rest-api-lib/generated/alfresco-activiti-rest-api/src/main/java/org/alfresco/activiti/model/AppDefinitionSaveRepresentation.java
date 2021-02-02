package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.activiti.model.AppDefinitionRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppDefinitionSaveRepresentation
 */
@Validated

public class AppDefinitionSaveRepresentation   {
  @JsonProperty("appDefinition")
  private AppDefinitionRepresentation appDefinition = null;

  @JsonProperty("force")
  private Boolean force = null;

  @JsonProperty("publish")
  private Boolean publish = null;

  public AppDefinitionSaveRepresentation appDefinition(AppDefinitionRepresentation appDefinition) {
    this.appDefinition = appDefinition;
    return this;
  }

  /**
   * Get appDefinition
   * @return appDefinition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AppDefinitionRepresentation getAppDefinition() {
    return appDefinition;
  }

  public void setAppDefinition(AppDefinitionRepresentation appDefinition) {
    this.appDefinition = appDefinition;
  }

  public AppDefinitionSaveRepresentation force(Boolean force) {
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

  public AppDefinitionSaveRepresentation publish(Boolean publish) {
    this.publish = publish;
    return this;
  }

  /**
   * Get publish
   * @return publish
  **/
  @ApiModelProperty(value = "")


  public Boolean isPublish() {
    return publish;
  }

  public void setPublish(Boolean publish) {
    this.publish = publish;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDefinitionSaveRepresentation appDefinitionSaveRepresentation = (AppDefinitionSaveRepresentation) o;
    return Objects.equals(this.appDefinition, appDefinitionSaveRepresentation.appDefinition) &&
        Objects.equals(this.force, appDefinitionSaveRepresentation.force) &&
        Objects.equals(this.publish, appDefinitionSaveRepresentation.publish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinition, force, publish);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDefinitionSaveRepresentation {\n");
    
    sb.append("    appDefinition: ").append(toIndentedString(appDefinition)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
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

