package org.alfresco.governance.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.core.model.ChildAssociationInfo;
import org.alfresco.governance.core.model.PathInfo;
import org.alfresco.governance.core.model.UnfiledRecordFolderChild;
import org.alfresco.governance.core.model.UserInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UnfiledRecordFolderChildAssociation
 */
@Validated

public class UnfiledRecordFolderChildAssociation   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nodeType")
  private String nodeType = null;

  @JsonProperty("isUnfiledRecordFolder")
  private Boolean isUnfiledRecordFolder = null;

  @JsonProperty("isRecord")
  private Boolean isRecord = null;

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

  @JsonProperty("association")
  private ChildAssociationInfo association = null;

  public UnfiledRecordFolderChildAssociation id(String id) {
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

  public UnfiledRecordFolderChildAssociation parentId(String parentId) {
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

  public UnfiledRecordFolderChildAssociation name(String name) {
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

  public UnfiledRecordFolderChildAssociation nodeType(String nodeType) {
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

  public UnfiledRecordFolderChildAssociation isUnfiledRecordFolder(Boolean isUnfiledRecordFolder) {
    this.isUnfiledRecordFolder = isUnfiledRecordFolder;
    return this;
  }

  /**
   * Get isUnfiledRecordFolder
   * @return isUnfiledRecordFolder
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsUnfiledRecordFolder() {
    return isUnfiledRecordFolder;
  }

  public void setIsUnfiledRecordFolder(Boolean isUnfiledRecordFolder) {
    this.isUnfiledRecordFolder = isUnfiledRecordFolder;
  }

  public UnfiledRecordFolderChildAssociation isRecord(Boolean isRecord) {
    this.isRecord = isRecord;
    return this;
  }

  /**
   * Get isRecord
   * @return isRecord
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsRecord() {
    return isRecord;
  }

  public void setIsRecord(Boolean isRecord) {
    this.isRecord = isRecord;
  }

  public UnfiledRecordFolderChildAssociation modifiedAt(OffsetDateTime modifiedAt) {
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

  public UnfiledRecordFolderChildAssociation modifiedByUser(UserInfo modifiedByUser) {
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

  public UnfiledRecordFolderChildAssociation createdAt(OffsetDateTime createdAt) {
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

  public UnfiledRecordFolderChildAssociation createdByUser(UserInfo createdByUser) {
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

  public UnfiledRecordFolderChildAssociation aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public UnfiledRecordFolderChildAssociation addAspectNamesItem(String aspectNamesItem) {
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

  public UnfiledRecordFolderChildAssociation properties(Object properties) {
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

  public UnfiledRecordFolderChildAssociation allowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
    return this;
  }

  public UnfiledRecordFolderChildAssociation addAllowableOperationsItem(String allowableOperationsItem) {
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

  public UnfiledRecordFolderChildAssociation path(PathInfo path) {
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

  public UnfiledRecordFolderChildAssociation association(ChildAssociationInfo association) {
    this.association = association;
    return this;
  }

  /**
   * Get association
   * @return association
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ChildAssociationInfo getAssociation() {
    return association;
  }

  public void setAssociation(ChildAssociationInfo association) {
    this.association = association;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnfiledRecordFolderChildAssociation unfiledRecordFolderChildAssociation = (UnfiledRecordFolderChildAssociation) o;
    return Objects.equals(this.id, unfiledRecordFolderChildAssociation.id) &&
        Objects.equals(this.parentId, unfiledRecordFolderChildAssociation.parentId) &&
        Objects.equals(this.name, unfiledRecordFolderChildAssociation.name) &&
        Objects.equals(this.nodeType, unfiledRecordFolderChildAssociation.nodeType) &&
        Objects.equals(this.isUnfiledRecordFolder, unfiledRecordFolderChildAssociation.isUnfiledRecordFolder) &&
        Objects.equals(this.isRecord, unfiledRecordFolderChildAssociation.isRecord) &&
        Objects.equals(this.modifiedAt, unfiledRecordFolderChildAssociation.modifiedAt) &&
        Objects.equals(this.modifiedByUser, unfiledRecordFolderChildAssociation.modifiedByUser) &&
        Objects.equals(this.createdAt, unfiledRecordFolderChildAssociation.createdAt) &&
        Objects.equals(this.createdByUser, unfiledRecordFolderChildAssociation.createdByUser) &&
        Objects.equals(this.aspectNames, unfiledRecordFolderChildAssociation.aspectNames) &&
        Objects.equals(this.properties, unfiledRecordFolderChildAssociation.properties) &&
        Objects.equals(this.allowableOperations, unfiledRecordFolderChildAssociation.allowableOperations) &&
        Objects.equals(this.path, unfiledRecordFolderChildAssociation.path) &&
        Objects.equals(this.association, unfiledRecordFolderChildAssociation.association);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, name, nodeType, isUnfiledRecordFolder, isRecord, modifiedAt, modifiedByUser, createdAt, createdByUser, aspectNames, properties, allowableOperations, path, association);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnfiledRecordFolderChildAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    isUnfiledRecordFolder: ").append(toIndentedString(isUnfiledRecordFolder)).append("\n");
    sb.append("    isRecord: ").append(toIndentedString(isRecord)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedByUser: ").append(toIndentedString(modifiedByUser)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    allowableOperations: ").append(toIndentedString(allowableOperations)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
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

