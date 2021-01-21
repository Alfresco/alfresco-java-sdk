package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.alfresco.governance.classification.model.ClassificationGuideInTopic;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A classification guide.
 */
@ApiModel(description = "A classification guide.")
@Validated


public class ClassificationGuide   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("originatingOrganization")
  private String originatingOrganization = null;

  @JsonProperty("publishedOn")
  private LocalDate publishedOn = null;

  @JsonProperty("enabled")
  private Boolean enabled = false;

  public ClassificationGuide id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ClassificationGuide createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")

  @Valid


  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ClassificationGuide name(String name) {
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

  public ClassificationGuide originatingOrganization(String originatingOrganization) {
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

  public ClassificationGuide publishedOn(LocalDate publishedOn) {
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

  public ClassificationGuide enabled(Boolean enabled) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationGuide classificationGuide = (ClassificationGuide) o;
    return Objects.equals(this.id, classificationGuide.id) &&
        Objects.equals(this.createdAt, classificationGuide.createdAt) &&
        Objects.equals(this.name, classificationGuide.name) &&
        Objects.equals(this.originatingOrganization, classificationGuide.originatingOrganization) &&
        Objects.equals(this.publishedOn, classificationGuide.publishedOn) &&
        Objects.equals(this.enabled, classificationGuide.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, name, originatingOrganization, publishedOn, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationGuide {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originatingOrganization: ").append(toIndentedString(originatingOrganization)).append("\n");
    sb.append("    publishedOn: ").append(toIndentedString(publishedOn)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

