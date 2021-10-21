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
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelsImportBody
 */
@Validated


public class ModelsImportBody   {
  @JsonProperty("file")
  private Resource file = null;

  @JsonProperty("type")
  private String type = null;

  public ModelsImportBody file(Resource file) {
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

  public ModelsImportBody type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @ApiModelProperty(value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsImportBody modelsImportBody = (ModelsImportBody) o;
    return Objects.equals(this.file, modelsImportBody.file) &&
        Objects.equals(this.type, modelsImportBody.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsImportBody {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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