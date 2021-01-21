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
 * AbstractGroupRepresentation
 */
@Validated


public class AbstractGroupRepresentation   {
  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentGroupId")
  private Long parentGroupId = null;

  @JsonProperty("status")
  private String status = null;

  public AbstractGroupRepresentation externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")



  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public AbstractGroupRepresentation id(Long id) {
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

  public AbstractGroupRepresentation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AbstractGroupRepresentation parentGroupId(Long parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

  /**
   * Get parentGroupId
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "")



  public Long getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(Long parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public AbstractGroupRepresentation status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")



  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractGroupRepresentation abstractGroupRepresentation = (AbstractGroupRepresentation) o;
    return Objects.equals(this.externalId, abstractGroupRepresentation.externalId) &&
        Objects.equals(this.id, abstractGroupRepresentation.id) &&
        Objects.equals(this.name, abstractGroupRepresentation.name) &&
        Objects.equals(this.parentGroupId, abstractGroupRepresentation.parentGroupId) &&
        Objects.equals(this.status, abstractGroupRepresentation.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, id, name, parentGroupId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractGroupRepresentation {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

