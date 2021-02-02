package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.alfresco.activiti.model.LightUserRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommentRepresentation
 */
@Validated

public class CommentRepresentation   {
  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("createdBy")
  private LightUserRepresentation createdBy = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("message")
  private String message = null;

  public CommentRepresentation created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public CommentRepresentation createdBy(LightUserRepresentation createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LightUserRepresentation getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(LightUserRepresentation createdBy) {
    this.createdBy = createdBy;
  }

  public CommentRepresentation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CommentRepresentation message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentRepresentation commentRepresentation = (CommentRepresentation) o;
    return Objects.equals(this.created, commentRepresentation.created) &&
        Objects.equals(this.createdBy, commentRepresentation.createdBy) &&
        Objects.equals(this.id, commentRepresentation.id) &&
        Objects.equals(this.message, commentRepresentation.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, createdBy, id, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentRepresentation {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

