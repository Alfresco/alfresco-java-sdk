package org.alfresco.governance.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.core.model.ContentInfo;
import org.alfresco.governance.core.model.PathInfo;
import org.alfresco.governance.core.model.UserInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Record
 */
@Validated

public class Record   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nodeType")
  private String nodeType = null;

  @JsonProperty("isCompleted")
  private Boolean isCompleted = false;

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

  @JsonProperty("content")
  private ContentInfo content = null;

  @JsonProperty("path")
  private PathInfo path = null;

  public Record id(String id) {
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

  public Record parentId(String parentId) {
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

  public Record name(String name) {
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

  public Record nodeType(String nodeType) {
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

  public Record isCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
    return this;
  }

  /**
   * Present only for record nodes. Indicates if the record is completed
   * @return isCompleted
  **/
  @ApiModelProperty(value = "Present only for record nodes. Indicates if the record is completed")


  public Boolean isIsCompleted() {
    return isCompleted;
  }

  public void setIsCompleted(Boolean isCompleted) {
    this.isCompleted = isCompleted;
  }

  public Record modifiedAt(OffsetDateTime modifiedAt) {
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

  public Record modifiedByUser(UserInfo modifiedByUser) {
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

  public Record createdAt(OffsetDateTime createdAt) {
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

  public Record createdByUser(UserInfo createdByUser) {
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

  public Record aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public Record addAspectNamesItem(String aspectNamesItem) {
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

  public Record properties(Object properties) {
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

  public Record allowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
    return this;
  }

  public Record addAllowableOperationsItem(String allowableOperationsItem) {
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

  public Record content(ContentInfo content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ContentInfo getContent() {
    return content;
  }

  public void setContent(ContentInfo content) {
    this.content = content;
  }

  public Record path(PathInfo path) {
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
    Record record = (Record) o;
    return Objects.equals(this.id, record.id) &&
        Objects.equals(this.parentId, record.parentId) &&
        Objects.equals(this.name, record.name) &&
        Objects.equals(this.nodeType, record.nodeType) &&
        Objects.equals(this.isCompleted, record.isCompleted) &&
        Objects.equals(this.modifiedAt, record.modifiedAt) &&
        Objects.equals(this.modifiedByUser, record.modifiedByUser) &&
        Objects.equals(this.createdAt, record.createdAt) &&
        Objects.equals(this.createdByUser, record.createdByUser) &&
        Objects.equals(this.aspectNames, record.aspectNames) &&
        Objects.equals(this.properties, record.properties) &&
        Objects.equals(this.allowableOperations, record.allowableOperations) &&
        Objects.equals(this.content, record.content) &&
        Objects.equals(this.path, record.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, name, nodeType, isCompleted, modifiedAt, modifiedByUser, createdAt, createdByUser, aspectNames, properties, allowableOperations, content, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Record {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    isCompleted: ").append(toIndentedString(isCompleted)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedByUser: ").append(toIndentedString(modifiedByUser)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    allowableOperations: ").append(toIndentedString(allowableOperations)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

