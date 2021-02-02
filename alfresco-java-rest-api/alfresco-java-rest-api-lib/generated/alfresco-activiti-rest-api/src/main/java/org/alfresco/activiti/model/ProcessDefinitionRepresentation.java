package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.ProcessDefinitionMetaDataRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessDefinitionRepresentation
 */
@Validated

public class ProcessDefinitionRepresentation   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("hasStartForm")
  private Boolean hasStartForm = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("metaDataValues")
  @Valid
  private List<ProcessDefinitionMetaDataRepresentation> metaDataValues = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("version")
  private Integer version = null;

  public ProcessDefinitionRepresentation category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ProcessDefinitionRepresentation deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Get deploymentId
   * @return deploymentId
  **/
  @ApiModelProperty(value = "")


  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public ProcessDefinitionRepresentation description(String description) {
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

  public ProcessDefinitionRepresentation hasStartForm(Boolean hasStartForm) {
    this.hasStartForm = hasStartForm;
    return this;
  }

  /**
   * Get hasStartForm
   * @return hasStartForm
  **/
  @ApiModelProperty(value = "")


  public Boolean isHasStartForm() {
    return hasStartForm;
  }

  public void setHasStartForm(Boolean hasStartForm) {
    this.hasStartForm = hasStartForm;
  }

  public ProcessDefinitionRepresentation id(String id) {
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

  public ProcessDefinitionRepresentation key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ProcessDefinitionRepresentation metaDataValues(List<ProcessDefinitionMetaDataRepresentation> metaDataValues) {
    this.metaDataValues = metaDataValues;
    return this;
  }

  public ProcessDefinitionRepresentation addMetaDataValuesItem(ProcessDefinitionMetaDataRepresentation metaDataValuesItem) {
    if (this.metaDataValues == null) {
      this.metaDataValues = new ArrayList<>();
    }
    this.metaDataValues.add(metaDataValuesItem);
    return this;
  }

  /**
   * Get metaDataValues
   * @return metaDataValues
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProcessDefinitionMetaDataRepresentation> getMetaDataValues() {
    return metaDataValues;
  }

  public void setMetaDataValues(List<ProcessDefinitionMetaDataRepresentation> metaDataValues) {
    this.metaDataValues = metaDataValues;
  }

  public ProcessDefinitionRepresentation name(String name) {
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

  public ProcessDefinitionRepresentation tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")


  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ProcessDefinitionRepresentation version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")


  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionRepresentation processDefinitionRepresentation = (ProcessDefinitionRepresentation) o;
    return Objects.equals(this.category, processDefinitionRepresentation.category) &&
        Objects.equals(this.deploymentId, processDefinitionRepresentation.deploymentId) &&
        Objects.equals(this.description, processDefinitionRepresentation.description) &&
        Objects.equals(this.hasStartForm, processDefinitionRepresentation.hasStartForm) &&
        Objects.equals(this.id, processDefinitionRepresentation.id) &&
        Objects.equals(this.key, processDefinitionRepresentation.key) &&
        Objects.equals(this.metaDataValues, processDefinitionRepresentation.metaDataValues) &&
        Objects.equals(this.name, processDefinitionRepresentation.name) &&
        Objects.equals(this.tenantId, processDefinitionRepresentation.tenantId) &&
        Objects.equals(this.version, processDefinitionRepresentation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, deploymentId, description, hasStartForm, id, key, metaDataValues, name, tenantId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionRepresentation {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hasStartForm: ").append(toIndentedString(hasStartForm)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    metaDataValues: ").append(toIndentedString(metaDataValues)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

