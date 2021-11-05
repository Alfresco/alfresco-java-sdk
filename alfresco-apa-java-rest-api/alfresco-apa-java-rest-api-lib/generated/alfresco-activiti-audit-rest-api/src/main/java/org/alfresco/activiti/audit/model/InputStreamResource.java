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
package org.alfresco.activiti.audit.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.activiti.audit.model.InputStream;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InputStreamResource
 */
@Validated


public class InputStreamResource   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("file")
  private Resource file = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("inputStream")
  private InputStream inputStream = null;

  @JsonProperty("open")
  private Boolean open = null;

  @JsonProperty("readable")
  private Boolean readable = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("url")
  private String url = null;

  public InputStreamResource description(String description) {
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

  public InputStreamResource file(Resource file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Resource getFile() {
    return file;
  }

  public void setFile(Resource file) {
    this.file = file;
  }

  public InputStreamResource filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
   **/
  @ApiModelProperty(value = "")
  
    public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public InputStreamResource inputStream(InputStream inputStream) {
    this.inputStream = inputStream;
    return this;
  }

  /**
   * Get inputStream
   * @return inputStream
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public InputStream getInputStream() {
    return inputStream;
  }

  public void setInputStream(InputStream inputStream) {
    this.inputStream = inputStream;
  }

  public InputStreamResource open(Boolean open) {
    this.open = open;
    return this;
  }

  /**
   * Get open
   * @return open
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isOpen() {
    return open;
  }

  public void setOpen(Boolean open) {
    this.open = open;
  }

  public InputStreamResource readable(Boolean readable) {
    this.readable = readable;
    return this;
  }

  /**
   * Get readable
   * @return readable
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isReadable() {
    return readable;
  }

  public void setReadable(Boolean readable) {
    this.readable = readable;
  }

  public InputStreamResource uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Get uri
   * @return uri
   **/
  @ApiModelProperty(value = "")
  
    public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public InputStreamResource url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   **/
  @ApiModelProperty(value = "")
  
    public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStreamResource inputStreamResource = (InputStreamResource) o;
    return Objects.equals(this.description, inputStreamResource.description) &&
        Objects.equals(this.file, inputStreamResource.file) &&
        Objects.equals(this.filename, inputStreamResource.filename) &&
        Objects.equals(this.inputStream, inputStreamResource.inputStream) &&
        Objects.equals(this.open, inputStreamResource.open) &&
        Objects.equals(this.readable, inputStreamResource.readable) &&
        Objects.equals(this.uri, inputStreamResource.uri) &&
        Objects.equals(this.url, inputStreamResource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, file, filename, inputStream, open, readable, uri, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStreamResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    inputStream: ").append(toIndentedString(inputStream)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
