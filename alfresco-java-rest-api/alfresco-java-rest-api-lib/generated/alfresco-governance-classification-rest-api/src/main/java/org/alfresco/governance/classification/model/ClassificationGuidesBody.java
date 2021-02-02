package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClassificationGuidesBody
 */
@Validated

public class ClassificationGuidesBody   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("originatingOrganization")
  private String originatingOrganization = null;

  @JsonProperty("publishedOn")
  private LocalDate publishedOn = null;

  @JsonProperty("enabled")
  private Boolean enabled = false;

  @JsonProperty("hasTopics")
  private Boolean hasTopics = null;

  public ClassificationGuidesBody name(String name) {
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

  public ClassificationGuidesBody originatingOrganization(String originatingOrganization) {
    this.originatingOrganization = originatingOrganization;
    return this;
  }

  /**
   * Get originatingOrganization
   * @return originatingOrganization
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOriginatingOrganization() {
    return originatingOrganization;
  }

  public void setOriginatingOrganization(String originatingOrganization) {
    this.originatingOrganization = originatingOrganization;
  }

  public ClassificationGuidesBody publishedOn(LocalDate publishedOn) {
    this.publishedOn = publishedOn;
    return this;
  }

  /**
   * Get publishedOn
   * @return publishedOn
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getPublishedOn() {
    return publishedOn;
  }

  public void setPublishedOn(LocalDate publishedOn) {
    this.publishedOn = publishedOn;
  }

  public ClassificationGuidesBody enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ClassificationGuidesBody hasTopics(Boolean hasTopics) {
    this.hasTopics = hasTopics;
    return this;
  }

  /**
   * Get hasTopics
   * @return hasTopics
  **/
  @ApiModelProperty(value = "")


  public Boolean isHasTopics() {
    return hasTopics;
  }

  public void setHasTopics(Boolean hasTopics) {
    this.hasTopics = hasTopics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationGuidesBody classificationGuidesBody = (ClassificationGuidesBody) o;
    return Objects.equals(this.name, classificationGuidesBody.name) &&
        Objects.equals(this.originatingOrganization, classificationGuidesBody.originatingOrganization) &&
        Objects.equals(this.publishedOn, classificationGuidesBody.publishedOn) &&
        Objects.equals(this.enabled, classificationGuidesBody.enabled) &&
        Objects.equals(this.hasTopics, classificationGuidesBody.hasTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, originatingOrganization, publishedOn, enabled, hasTopics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationGuidesBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originatingOrganization: ").append(toIndentedString(originatingOrganization)).append("\n");
    sb.append("    publishedOn: ").append(toIndentedString(publishedOn)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hasTopics: ").append(toIndentedString(hasTopics)).append("\n");
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

