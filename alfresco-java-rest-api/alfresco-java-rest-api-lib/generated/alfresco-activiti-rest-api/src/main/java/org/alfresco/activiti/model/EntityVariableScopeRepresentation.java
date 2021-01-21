package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.EntityAttributeScopeRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EntityVariableScopeRepresentation
 */
@Validated


public class EntityVariableScopeRepresentation   {
  @JsonProperty("attributes")
  @Valid
  private List<EntityAttributeScopeRepresentation> attributes = null;

  @JsonProperty("entityName")
  private String entityName = null;

  @JsonProperty("mappedDataModel")
  private Long mappedDataModel = null;

  @JsonProperty("mappedVariableName")
  private String mappedVariableName = null;

  public EntityVariableScopeRepresentation attributes(List<EntityAttributeScopeRepresentation> attributes) {
    this.attributes = attributes;
    return this;
  }

  public EntityVariableScopeRepresentation addAttributesItem(EntityAttributeScopeRepresentation attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")

  @Valid


  public List<EntityAttributeScopeRepresentation> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<EntityAttributeScopeRepresentation> attributes) {
    this.attributes = attributes;
  }

  public EntityVariableScopeRepresentation entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Get entityName
   * @return entityName
  **/
  @ApiModelProperty(value = "")



  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public EntityVariableScopeRepresentation mappedDataModel(Long mappedDataModel) {
    this.mappedDataModel = mappedDataModel;
    return this;
  }

  /**
   * Get mappedDataModel
   * @return mappedDataModel
  **/
  @ApiModelProperty(value = "")



  public Long getMappedDataModel() {
    return mappedDataModel;
  }

  public void setMappedDataModel(Long mappedDataModel) {
    this.mappedDataModel = mappedDataModel;
  }

  public EntityVariableScopeRepresentation mappedVariableName(String mappedVariableName) {
    this.mappedVariableName = mappedVariableName;
    return this;
  }

  /**
   * Get mappedVariableName
   * @return mappedVariableName
  **/
  @ApiModelProperty(value = "")



  public String getMappedVariableName() {
    return mappedVariableName;
  }

  public void setMappedVariableName(String mappedVariableName) {
    this.mappedVariableName = mappedVariableName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityVariableScopeRepresentation entityVariableScopeRepresentation = (EntityVariableScopeRepresentation) o;
    return Objects.equals(this.attributes, entityVariableScopeRepresentation.attributes) &&
        Objects.equals(this.entityName, entityVariableScopeRepresentation.entityName) &&
        Objects.equals(this.mappedDataModel, entityVariableScopeRepresentation.mappedDataModel) &&
        Objects.equals(this.mappedVariableName, entityVariableScopeRepresentation.mappedVariableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, entityName, mappedDataModel, mappedVariableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityVariableScopeRepresentation {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    mappedDataModel: ").append(toIndentedString(mappedDataModel)).append("\n");
    sb.append("    mappedVariableName: ").append(toIndentedString(mappedVariableName)).append("\n");
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

