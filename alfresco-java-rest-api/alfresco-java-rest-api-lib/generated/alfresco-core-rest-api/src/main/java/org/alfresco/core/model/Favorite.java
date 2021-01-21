package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A favorite describes an Alfresco entity that a person has marked as a favorite. The target can be a site, file or folder. 
 */
@ApiModel(description = "A favorite describes an Alfresco entity that a person has marked as a favorite. The target can be a site, file or folder. ")
@Validated


public class Favorite   {
  @JsonProperty("targetGuid")
  private String targetGuid = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("target")
  private Object target = null;

  @JsonProperty("properties")
  private Object properties = null;

  public Favorite targetGuid(String targetGuid) {
    this.targetGuid = targetGuid;
    return this;
  }

  /**
   * The guid of the object that is a favorite.
   * @return targetGuid
  **/
  @ApiModelProperty(required = true, value = "The guid of the object that is a favorite.")
  @NotNull



  public String getTargetGuid() {
    return targetGuid;
  }

  public void setTargetGuid(String targetGuid) {
    this.targetGuid = targetGuid;
  }

  public Favorite createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time the object was made a favorite.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time the object was made a favorite.")

  @Valid


  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Favorite target(Object target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public Object getTarget() {
    return target;
  }

  public void setTarget(Object target) {
    this.target = target;
  }

  public Favorite properties(Object properties) {
    this.properties = properties;
    return this;
  }

  /**
   * A subset of the target favorite properties, system properties and properties already available in the target are excluded.
   * @return properties
  **/
  @ApiModelProperty(value = "A subset of the target favorite properties, system properties and properties already available in the target are excluded.")



  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Favorite favorite = (Favorite) o;
    return Objects.equals(this.targetGuid, favorite.targetGuid) &&
        Objects.equals(this.createdAt, favorite.createdAt) &&
        Objects.equals(this.target, favorite.target) &&
        Objects.equals(this.properties, favorite.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetGuid, createdAt, target, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Favorite {\n");
    
    sb.append("    targetGuid: ").append(toIndentedString(targetGuid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

