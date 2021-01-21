package org.alfresco.activiti.model;

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
 * ModelRepresentation
 */
@Validated


public class ModelRepresentation   {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("createdBy")
  private Long createdBy = null;

  @JsonProperty("createdByFullName")
  private String createdByFullName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("favorite")
  private Boolean favorite = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @JsonProperty("lastUpdatedBy")
  private Long lastUpdatedBy = null;

  @JsonProperty("lastUpdatedByFullName")
  private String lastUpdatedByFullName = null;

  @JsonProperty("latestVersion")
  private Boolean latestVersion = null;

  @JsonProperty("modelType")
  private Integer modelType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("permission")
  private String permission = null;

  @JsonProperty("referenceId")
  private Long referenceId = null;

  @JsonProperty("stencilSet")
  private Long stencilSet = null;

  @JsonProperty("tenantId")
  private Long tenantId = null;

  @JsonProperty("version")
  private Integer version = null;

  public ModelRepresentation comment(String comment) {
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

  public ModelRepresentation createdBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")



  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public ModelRepresentation createdByFullName(String createdByFullName) {
    this.createdByFullName = createdByFullName;
    return this;
  }

  /**
   * Get createdByFullName
   * @return createdByFullName
  **/
  @ApiModelProperty(value = "")



  public String getCreatedByFullName() {
    return createdByFullName;
  }

  public void setCreatedByFullName(String createdByFullName) {
    this.createdByFullName = createdByFullName;
  }

  public ModelRepresentation description(String description) {
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

  public ModelRepresentation favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

  /**
   * Get favorite
   * @return favorite
  **/
  @ApiModelProperty(value = "")



  public Boolean isFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public ModelRepresentation id(Long id) {
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

  public ModelRepresentation lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "")

  @Valid


  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ModelRepresentation lastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @ApiModelProperty(value = "")



  public Long getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public ModelRepresentation lastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
    return this;
  }

  /**
   * Get lastUpdatedByFullName
   * @return lastUpdatedByFullName
  **/
  @ApiModelProperty(value = "")



  public String getLastUpdatedByFullName() {
    return lastUpdatedByFullName;
  }

  public void setLastUpdatedByFullName(String lastUpdatedByFullName) {
    this.lastUpdatedByFullName = lastUpdatedByFullName;
  }

  public ModelRepresentation latestVersion(Boolean latestVersion) {
    this.latestVersion = latestVersion;
    return this;
  }

  /**
   * Get latestVersion
   * @return latestVersion
  **/
  @ApiModelProperty(value = "")



  public Boolean isLatestVersion() {
    return latestVersion;
  }

  public void setLatestVersion(Boolean latestVersion) {
    this.latestVersion = latestVersion;
  }

  public ModelRepresentation modelType(Integer modelType) {
    this.modelType = modelType;
    return this;
  }

  /**
   * Get modelType
   * @return modelType
  **/
  @ApiModelProperty(value = "")



  public Integer getModelType() {
    return modelType;
  }

  public void setModelType(Integer modelType) {
    this.modelType = modelType;
  }

  public ModelRepresentation name(String name) {
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

  public ModelRepresentation permission(String permission) {
    this.permission = permission;
    return this;
  }

  /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(value = "")



  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public ModelRepresentation referenceId(Long referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  **/
  @ApiModelProperty(value = "")



  public Long getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(Long referenceId) {
    this.referenceId = referenceId;
  }

  public ModelRepresentation stencilSet(Long stencilSet) {
    this.stencilSet = stencilSet;
    return this;
  }

  /**
   * Get stencilSet
   * @return stencilSet
  **/
  @ApiModelProperty(value = "")



  public Long getStencilSet() {
    return stencilSet;
  }

  public void setStencilSet(Long stencilSet) {
    this.stencilSet = stencilSet;
  }

  public ModelRepresentation tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")



  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public ModelRepresentation version(Integer version) {
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
    ModelRepresentation modelRepresentation = (ModelRepresentation) o;
    return Objects.equals(this.comment, modelRepresentation.comment) &&
        Objects.equals(this.createdBy, modelRepresentation.createdBy) &&
        Objects.equals(this.createdByFullName, modelRepresentation.createdByFullName) &&
        Objects.equals(this.description, modelRepresentation.description) &&
        Objects.equals(this.favorite, modelRepresentation.favorite) &&
        Objects.equals(this.id, modelRepresentation.id) &&
        Objects.equals(this.lastUpdated, modelRepresentation.lastUpdated) &&
        Objects.equals(this.lastUpdatedBy, modelRepresentation.lastUpdatedBy) &&
        Objects.equals(this.lastUpdatedByFullName, modelRepresentation.lastUpdatedByFullName) &&
        Objects.equals(this.latestVersion, modelRepresentation.latestVersion) &&
        Objects.equals(this.modelType, modelRepresentation.modelType) &&
        Objects.equals(this.name, modelRepresentation.name) &&
        Objects.equals(this.permission, modelRepresentation.permission) &&
        Objects.equals(this.referenceId, modelRepresentation.referenceId) &&
        Objects.equals(this.stencilSet, modelRepresentation.stencilSet) &&
        Objects.equals(this.tenantId, modelRepresentation.tenantId) &&
        Objects.equals(this.version, modelRepresentation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, createdBy, createdByFullName, description, favorite, id, lastUpdated, lastUpdatedBy, lastUpdatedByFullName, latestVersion, modelType, name, permission, referenceId, stencilSet, tenantId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRepresentation {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdByFullName: ").append(toIndentedString(createdByFullName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    lastUpdatedByFullName: ").append(toIndentedString(lastUpdatedByFullName)).append("\n");
    sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
    sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    stencilSet: ").append(toIndentedString(stencilSet)).append("\n");
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

