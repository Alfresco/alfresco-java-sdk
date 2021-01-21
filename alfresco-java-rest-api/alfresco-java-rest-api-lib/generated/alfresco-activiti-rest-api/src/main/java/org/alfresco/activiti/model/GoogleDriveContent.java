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
 * GoogleDriveContent
 */
@Validated


public class GoogleDriveContent   {
  @JsonProperty("folder")
  private Boolean folder = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("mimeType")
  private String mimeType = null;

  @JsonProperty("simpleType")
  private String simpleType = null;

  @JsonProperty("title")
  private String title = null;

  public GoogleDriveContent folder(Boolean folder) {
    this.folder = folder;
    return this;
  }

  /**
   * Get folder
   * @return folder
  **/
  @ApiModelProperty(value = "")



  public Boolean isFolder() {
    return folder;
  }

  public void setFolder(Boolean folder) {
    this.folder = folder;
  }

  public GoogleDriveContent id(String id) {
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

  public GoogleDriveContent mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Get mimeType
   * @return mimeType
  **/
  @ApiModelProperty(value = "")



  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public GoogleDriveContent simpleType(String simpleType) {
    this.simpleType = simpleType;
    return this;
  }

  /**
   * Get simpleType
   * @return simpleType
  **/
  @ApiModelProperty(value = "")



  public String getSimpleType() {
    return simpleType;
  }

  public void setSimpleType(String simpleType) {
    this.simpleType = simpleType;
  }

  public GoogleDriveContent title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")



  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleDriveContent googleDriveContent = (GoogleDriveContent) o;
    return Objects.equals(this.folder, googleDriveContent.folder) &&
        Objects.equals(this.id, googleDriveContent.id) &&
        Objects.equals(this.mimeType, googleDriveContent.mimeType) &&
        Objects.equals(this.simpleType, googleDriveContent.simpleType) &&
        Objects.equals(this.title, googleDriveContent.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folder, id, mimeType, simpleType, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleDriveContent {\n");
    
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    simpleType: ").append(toIndentedString(simpleType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

