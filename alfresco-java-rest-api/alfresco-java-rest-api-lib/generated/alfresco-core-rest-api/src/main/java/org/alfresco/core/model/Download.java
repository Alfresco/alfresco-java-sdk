/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Download
 */
@Validated

public class Download   {
  @JsonProperty("filesAdded")
  private Integer filesAdded = null;

  @JsonProperty("bytesAdded")
  private Integer bytesAdded = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("totalFiles")
  private Integer totalFiles = null;

  @JsonProperty("totalBytes")
  private Integer totalBytes = null;

  /**
   * the current status of the download node creation
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    CANCELLED("CANCELLED"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DONE("DONE"),
    
    MAX_CONTENT_SIZE_EXCEEDED("MAX_CONTENT_SIZE_EXCEEDED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = StatusEnum.PENDING;

  public Download filesAdded(Integer filesAdded) {
    this.filesAdded = filesAdded;
    return this;
  }

  /**
   * number of files added so far in the zip
   * @return filesAdded
  **/
  @ApiModelProperty(value = "number of files added so far in the zip")


  public Integer getFilesAdded() {
    return filesAdded;
  }

  public void setFilesAdded(Integer filesAdded) {
    this.filesAdded = filesAdded;
  }

  public Download bytesAdded(Integer bytesAdded) {
    this.bytesAdded = bytesAdded;
    return this;
  }

  /**
   * number of bytes added so far in the zip
   * @return bytesAdded
  **/
  @ApiModelProperty(value = "number of bytes added so far in the zip")


  public Integer getBytesAdded() {
    return bytesAdded;
  }

  public void setBytesAdded(Integer bytesAdded) {
    this.bytesAdded = bytesAdded;
  }

  public Download id(String id) {
    this.id = id;
    return this;
  }

  /**
   * the id of the download node
   * @return id
  **/
  @ApiModelProperty(value = "the id of the download node")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Download totalFiles(Integer totalFiles) {
    this.totalFiles = totalFiles;
    return this;
  }

  /**
   * the total number of files to be added in the zip
   * @return totalFiles
  **/
  @ApiModelProperty(value = "the total number of files to be added in the zip")


  public Integer getTotalFiles() {
    return totalFiles;
  }

  public void setTotalFiles(Integer totalFiles) {
    this.totalFiles = totalFiles;
  }

  public Download totalBytes(Integer totalBytes) {
    this.totalBytes = totalBytes;
    return this;
  }

  /**
   * the total number of bytes to be added in the zip
   * @return totalBytes
  **/
  @ApiModelProperty(value = "the total number of bytes to be added in the zip")


  public Integer getTotalBytes() {
    return totalBytes;
  }

  public void setTotalBytes(Integer totalBytes) {
    this.totalBytes = totalBytes;
  }

  public Download status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * the current status of the download node creation
   * @return status
  **/
  @ApiModelProperty(value = "the current status of the download node creation")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    Download download = (Download) o;
    return Objects.equals(this.filesAdded, download.filesAdded) &&
        Objects.equals(this.bytesAdded, download.bytesAdded) &&
        Objects.equals(this.id, download.id) &&
        Objects.equals(this.totalFiles, download.totalFiles) &&
        Objects.equals(this.totalBytes, download.totalBytes) &&
        Objects.equals(this.status, download.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filesAdded, bytesAdded, id, totalFiles, totalBytes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Download {\n");
    
    sb.append("    filesAdded: ").append(toIndentedString(filesAdded)).append("\n");
    sb.append("    bytesAdded: ").append(toIndentedString(bytesAdded)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    totalFiles: ").append(toIndentedString(totalFiles)).append("\n");
    sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
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

