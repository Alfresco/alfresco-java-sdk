package org.alfresco.governance.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.core.model.PathInfo;
import org.alfresco.governance.core.model.UserInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecordCategoryChild
 */
@Validated

public class RecordCategoryChild   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nodeType")
  private String nodeType = null;

  @JsonProperty("hasRetentionSchedule")
  private Boolean hasRetentionSchedule = false;

  @JsonProperty("isClosed")
  private Boolean isClosed = false;

  @JsonProperty("isRecordCategory")
  private Boolean isRecordCategory = null;

  @JsonProperty("isRecordFolder")
  private Boolean isRecordFolder = false;

  @JsonProperty("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  @JsonProperty("modifiedByUser")
  private UserInfo modifiedByUser = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("createdByUser")
  private UserInfo createdByUser = null;

  @JsonProperty("aspectNames")
  @Valid
  private List<String> aspectNames = null;

  @JsonProperty("properties")
  private Object properties = null;

  @JsonProperty("allowableOperations")
  @Valid
  private List<String> allowableOperations = null;

  @JsonProperty("path")
  private PathInfo path = null;

  public RecordCategoryChild id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RecordCategoryChild parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public RecordCategoryChild name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. ")
  @NotNull

@Pattern(regexp="^(?!(.*[\\\"\\*\\\\\\>\\<\\?/\\:\\|]+.*)|(.*[\\.]?.*[\\.]+$)|(.*[ ]+$))") 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RecordCategoryChild nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public RecordCategoryChild hasRetentionSchedule(Boolean hasRetentionSchedule) {
    this.hasRetentionSchedule = hasRetentionSchedule;
    return this;
  }

  /**
   * Indicates if the record category has a retention schedule defined
   * @return hasRetentionSchedule
  **/
  @ApiModelProperty(value = "Indicates if the record category has a retention schedule defined")


  public Boolean isHasRetentionSchedule() {
    return hasRetentionSchedule;
  }

  public void setHasRetentionSchedule(Boolean hasRetentionSchedule) {
    this.hasRetentionSchedule = hasRetentionSchedule;
  }

  public RecordCategoryChild isClosed(Boolean isClosed) {
    this.isClosed = isClosed;
    return this;
  }

  /**
   * Indicates if the record folder is closed
   * @return isClosed
  **/
  @ApiModelProperty(value = "Indicates if the record folder is closed")


  public Boolean isIsClosed() {
    return isClosed;
  }

  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }

  public RecordCategoryChild isRecordCategory(Boolean isRecordCategory) {
    this.isRecordCategory = isRecordCategory;
    return this;
  }

  /**
   * Get isRecordCategory
   * @return isRecordCategory
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsRecordCategory() {
    return isRecordCategory;
  }

  public void setIsRecordCategory(Boolean isRecordCategory) {
    this.isRecordCategory = isRecordCategory;
  }

  public RecordCategoryChild isRecordFolder(Boolean isRecordFolder) {
    this.isRecordFolder = isRecordFolder;
    return this;
  }

  /**
   * Get isRecordFolder
   * @return isRecordFolder
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsRecordFolder() {
    return isRecordFolder;
  }

  public void setIsRecordFolder(Boolean isRecordFolder) {
    this.isRecordFolder = isRecordFolder;
  }

  public RecordCategoryChild modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public RecordCategoryChild modifiedByUser(UserInfo modifiedByUser) {
    this.modifiedByUser = modifiedByUser;
    return this;
  }

  /**
   * Get modifiedByUser
   * @return modifiedByUser
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserInfo getModifiedByUser() {
    return modifiedByUser;
  }

  public void setModifiedByUser(UserInfo modifiedByUser) {
    this.modifiedByUser = modifiedByUser;
  }

  public RecordCategoryChild createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public RecordCategoryChild createdByUser(UserInfo createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

  /**
   * Get createdByUser
   * @return createdByUser
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserInfo getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(UserInfo createdByUser) {
    this.createdByUser = createdByUser;
  }

  public RecordCategoryChild aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public RecordCategoryChild addAspectNamesItem(String aspectNamesItem) {
    if (this.aspectNames == null) {
      this.aspectNames = new ArrayList<>();
    }
    this.aspectNames.add(aspectNamesItem);
    return this;
  }

  /**
   * Get aspectNames
   * @return aspectNames
  **/
  @ApiModelProperty(value = "")


  public List<String> getAspectNames() {
    return aspectNames;
  }

  public void setAspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
  }

  public RecordCategoryChild properties(Object properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")


  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  public RecordCategoryChild allowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
    return this;
  }

  public RecordCategoryChild addAllowableOperationsItem(String allowableOperationsItem) {
    if (this.allowableOperations == null) {
      this.allowableOperations = new ArrayList<>();
    }
    this.allowableOperations.add(allowableOperationsItem);
    return this;
  }

  /**
   * Get allowableOperations
   * @return allowableOperations
  **/
  @ApiModelProperty(value = "")


  public List<String> getAllowableOperations() {
    return allowableOperations;
  }

  public void setAllowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
  }

  public RecordCategoryChild path(PathInfo path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PathInfo getPath() {
    return path;
  }

  public void setPath(PathInfo path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordCategoryChild recordCategoryChild = (RecordCategoryChild) o;
    return Objects.equals(this.id, recordCategoryChild.id) &&
        Objects.equals(this.parentId, recordCategoryChild.parentId) &&
        Objects.equals(this.name, recordCategoryChild.name) &&
        Objects.equals(this.nodeType, recordCategoryChild.nodeType) &&
        Objects.equals(this.hasRetentionSchedule, recordCategoryChild.hasRetentionSchedule) &&
        Objects.equals(this.isClosed, recordCategoryChild.isClosed) &&
        Objects.equals(this.isRecordCategory, recordCategoryChild.isRecordCategory) &&
        Objects.equals(this.isRecordFolder, recordCategoryChild.isRecordFolder) &&
        Objects.equals(this.modifiedAt, recordCategoryChild.modifiedAt) &&
        Objects.equals(this.modifiedByUser, recordCategoryChild.modifiedByUser) &&
        Objects.equals(this.createdAt, recordCategoryChild.createdAt) &&
        Objects.equals(this.createdByUser, recordCategoryChild.createdByUser) &&
        Objects.equals(this.aspectNames, recordCategoryChild.aspectNames) &&
        Objects.equals(this.properties, recordCategoryChild.properties) &&
        Objects.equals(this.allowableOperations, recordCategoryChild.allowableOperations) &&
        Objects.equals(this.path, recordCategoryChild.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, name, nodeType, hasRetentionSchedule, isClosed, isRecordCategory, isRecordFolder, modifiedAt, modifiedByUser, createdAt, createdByUser, aspectNames, properties, allowableOperations, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordCategoryChild {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    hasRetentionSchedule: ").append(toIndentedString(hasRetentionSchedule)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    isRecordCategory: ").append(toIndentedString(isRecordCategory)).append("\n");
    sb.append("    isRecordFolder: ").append(toIndentedString(isRecordFolder)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedByUser: ").append(toIndentedString(modifiedByUser)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    allowableOperations: ").append(toIndentedString(allowableOperations)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

