package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.ContentInfo;
import org.alfresco.search.model.Node;
import org.alfresco.search.model.PathInfo;
import org.alfresco.search.model.SearchEntry;
import org.alfresco.search.model.UserInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultNode
 */
@Validated

public class ResultNode   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nodeType")
  private String nodeType = null;

  @JsonProperty("isFolder")
  private Boolean isFolder = null;

  @JsonProperty("isFile")
  private Boolean isFile = null;

  @JsonProperty("isLocked")
  private Boolean isLocked = false;

  @JsonProperty("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  @JsonProperty("modifiedByUser")
  private UserInfo modifiedByUser = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("createdByUser")
  private UserInfo createdByUser = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("isLink")
  private Boolean isLink = null;

  @JsonProperty("content")
  private ContentInfo content = null;

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

  @JsonProperty("search")
  private SearchEntry search = null;

  @JsonProperty("archivedByUser")
  private UserInfo archivedByUser = null;

  @JsonProperty("archivedAt")
  private OffsetDateTime archivedAt = null;

  @JsonProperty("versionLabel")
  private String versionLabel = null;

  @JsonProperty("versionComment")
  private String versionComment = null;

  public ResultNode id(String id) {
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

  public ResultNode name(String name) {
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

  public ResultNode nodeType(String nodeType) {
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

  public ResultNode isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

  /**
   * Get isFolder
   * @return isFolder
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsFolder() {
    return isFolder;
  }

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }

  public ResultNode isFile(Boolean isFile) {
    this.isFile = isFile;
    return this;
  }

  /**
   * Get isFile
   * @return isFile
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsFile() {
    return isFile;
  }

  public void setIsFile(Boolean isFile) {
    this.isFile = isFile;
  }

  public ResultNode isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

  /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public ResultNode modifiedAt(OffsetDateTime modifiedAt) {
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

  public ResultNode modifiedByUser(UserInfo modifiedByUser) {
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

  public ResultNode createdAt(OffsetDateTime createdAt) {
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

  public ResultNode createdByUser(UserInfo createdByUser) {
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

  public ResultNode parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(value = "")


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public ResultNode isLink(Boolean isLink) {
    this.isLink = isLink;
    return this;
  }

  /**
   * Get isLink
   * @return isLink
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsLink() {
    return isLink;
  }

  public void setIsLink(Boolean isLink) {
    this.isLink = isLink;
  }

  public ResultNode content(ContentInfo content) {
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

  public ResultNode aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public ResultNode addAspectNamesItem(String aspectNamesItem) {
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

  public ResultNode properties(Object properties) {
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

  public ResultNode allowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
    return this;
  }

  public ResultNode addAllowableOperationsItem(String allowableOperationsItem) {
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

  public ResultNode path(PathInfo path) {
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

  public ResultNode search(SearchEntry search) {
    this.search = search;
    return this;
  }

  /**
   * Get search
   * @return search
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SearchEntry getSearch() {
    return search;
  }

  public void setSearch(SearchEntry search) {
    this.search = search;
  }

  public ResultNode archivedByUser(UserInfo archivedByUser) {
    this.archivedByUser = archivedByUser;
    return this;
  }

  /**
   * Get archivedByUser
   * @return archivedByUser
  **/
  @ApiModelProperty(value = "")

  @Valid

  public UserInfo getArchivedByUser() {
    return archivedByUser;
  }

  public void setArchivedByUser(UserInfo archivedByUser) {
    this.archivedByUser = archivedByUser;
  }

  public ResultNode archivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

  /**
   * Get archivedAt
   * @return archivedAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
  }

  public ResultNode versionLabel(String versionLabel) {
    this.versionLabel = versionLabel;
    return this;
  }

  /**
   * Get versionLabel
   * @return versionLabel
  **/
  @ApiModelProperty(value = "")


  public String getVersionLabel() {
    return versionLabel;
  }

  public void setVersionLabel(String versionLabel) {
    this.versionLabel = versionLabel;
  }

  public ResultNode versionComment(String versionComment) {
    this.versionComment = versionComment;
    return this;
  }

  /**
   * Get versionComment
   * @return versionComment
  **/
  @ApiModelProperty(value = "")


  public String getVersionComment() {
    return versionComment;
  }

  public void setVersionComment(String versionComment) {
    this.versionComment = versionComment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultNode resultNode = (ResultNode) o;
    return Objects.equals(this.id, resultNode.id) &&
        Objects.equals(this.name, resultNode.name) &&
        Objects.equals(this.nodeType, resultNode.nodeType) &&
        Objects.equals(this.isFolder, resultNode.isFolder) &&
        Objects.equals(this.isFile, resultNode.isFile) &&
        Objects.equals(this.isLocked, resultNode.isLocked) &&
        Objects.equals(this.modifiedAt, resultNode.modifiedAt) &&
        Objects.equals(this.modifiedByUser, resultNode.modifiedByUser) &&
        Objects.equals(this.createdAt, resultNode.createdAt) &&
        Objects.equals(this.createdByUser, resultNode.createdByUser) &&
        Objects.equals(this.parentId, resultNode.parentId) &&
        Objects.equals(this.isLink, resultNode.isLink) &&
        Objects.equals(this.content, resultNode.content) &&
        Objects.equals(this.aspectNames, resultNode.aspectNames) &&
        Objects.equals(this.properties, resultNode.properties) &&
        Objects.equals(this.allowableOperations, resultNode.allowableOperations) &&
        Objects.equals(this.path, resultNode.path) &&
        Objects.equals(this.search, resultNode.search) &&
        Objects.equals(this.archivedByUser, resultNode.archivedByUser) &&
        Objects.equals(this.archivedAt, resultNode.archivedAt) &&
        Objects.equals(this.versionLabel, resultNode.versionLabel) &&
        Objects.equals(this.versionComment, resultNode.versionComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, nodeType, isFolder, isFile, isLocked, modifiedAt, modifiedByUser, createdAt, createdByUser, parentId, isLink, content, aspectNames, properties, allowableOperations, path, search, archivedByUser, archivedAt, versionLabel, versionComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    isFile: ").append(toIndentedString(isFile)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedByUser: ").append(toIndentedString(modifiedByUser)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    isLink: ").append(toIndentedString(isLink)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    allowableOperations: ").append(toIndentedString(allowableOperations)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    archivedByUser: ").append(toIndentedString(archivedByUser)).append("\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    versionLabel: ").append(toIndentedString(versionLabel)).append("\n");
    sb.append("    versionComment: ").append(toIndentedString(versionComment)).append("\n");
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

