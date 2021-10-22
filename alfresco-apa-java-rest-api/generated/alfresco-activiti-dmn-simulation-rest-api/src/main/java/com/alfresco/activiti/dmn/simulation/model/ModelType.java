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
package com.alfresco.activiti.dmn.simulation.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelType
 */
@Validated


public class ModelType   {
  @JsonProperty("allowedContentFileExtension")
  @Valid
  private List<String> allowedContentFileExtension = null;

  @JsonProperty("contentFileExtension")
  private String contentFileExtension = null;

  @JsonProperty("extensionsFileSuffix")
  private String extensionsFileSuffix = null;

  @JsonProperty("folderName")
  private String folderName = null;

  @JsonProperty("name")
  private String name = null;

  public ModelType allowedContentFileExtension(List<String> allowedContentFileExtension) {
    this.allowedContentFileExtension = allowedContentFileExtension;
    return this;
  }

  public ModelType addAllowedContentFileExtensionItem(String allowedContentFileExtensionItem) {
    if (this.allowedContentFileExtension == null) {
      this.allowedContentFileExtension = new ArrayList<>();
    }
    this.allowedContentFileExtension.add(allowedContentFileExtensionItem);
    return this;
  }

  /**
   * Get allowedContentFileExtension
   * @return allowedContentFileExtension
   **/
  @ApiModelProperty(value = "")
  
    public List<String> getAllowedContentFileExtension() {
    return allowedContentFileExtension;
  }

  public void setAllowedContentFileExtension(List<String> allowedContentFileExtension) {
    this.allowedContentFileExtension = allowedContentFileExtension;
  }

  public ModelType contentFileExtension(String contentFileExtension) {
    this.contentFileExtension = contentFileExtension;
    return this;
  }

  /**
   * Get contentFileExtension
   * @return contentFileExtension
   **/
  @ApiModelProperty(value = "")
  
    public String getContentFileExtension() {
    return contentFileExtension;
  }

  public void setContentFileExtension(String contentFileExtension) {
    this.contentFileExtension = contentFileExtension;
  }

  public ModelType extensionsFileSuffix(String extensionsFileSuffix) {
    this.extensionsFileSuffix = extensionsFileSuffix;
    return this;
  }

  /**
   * Get extensionsFileSuffix
   * @return extensionsFileSuffix
   **/
  @ApiModelProperty(value = "")
  
    public String getExtensionsFileSuffix() {
    return extensionsFileSuffix;
  }

  public void setExtensionsFileSuffix(String extensionsFileSuffix) {
    this.extensionsFileSuffix = extensionsFileSuffix;
  }

  public ModelType folderName(String folderName) {
    this.folderName = folderName;
    return this;
  }

  /**
   * Get folderName
   * @return folderName
   **/
  @ApiModelProperty(value = "")
  
    public String getFolderName() {
    return folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  public ModelType name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelType modelType = (ModelType) o;
    return Objects.equals(this.allowedContentFileExtension, modelType.allowedContentFileExtension) &&
        Objects.equals(this.contentFileExtension, modelType.contentFileExtension) &&
        Objects.equals(this.extensionsFileSuffix, modelType.extensionsFileSuffix) &&
        Objects.equals(this.folderName, modelType.folderName) &&
        Objects.equals(this.name, modelType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedContentFileExtension, contentFileExtension, extensionsFileSuffix, folderName, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelType {\n");
    
    sb.append("    allowedContentFileExtension: ").append(toIndentedString(allowedContentFileExtension)).append("\n");
    sb.append("    contentFileExtension: ").append(toIndentedString(contentFileExtension)).append("\n");
    sb.append("    extensionsFileSuffix: ").append(toIndentedString(extensionsFileSuffix)).append("\n");
    sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
