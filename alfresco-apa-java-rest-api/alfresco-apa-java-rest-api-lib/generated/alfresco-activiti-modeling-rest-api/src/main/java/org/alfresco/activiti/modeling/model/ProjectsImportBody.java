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
package org.alfresco.activiti.modeling.model;

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
 * ProjectsImportBody
 */
@Validated


public class ProjectsImportBody   {
  @JsonProperty("file")
  private Resource file = null;

  @JsonProperty("name")
  private String name = null;

  public ProjectsImportBody file(Resource file) {
    this.file = file;
    return this;
  }

  /**
   * The file containing the zipped project
   * @return file
   **/
  @ApiModelProperty(required = true, value = "The file containing the zipped project")
      @NotNull

    @Valid
    public Resource getFile() {
    return file;
  }

  public void setFile(Resource file) {
    this.file = file;
  }

  public ProjectsImportBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project that will override the current name of the project in the zip file
   * @return name
   **/
  @ApiModelProperty(value = "The name of the project that will override the current name of the project in the zip file")
  
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
    ProjectsImportBody projectsImportBody = (ProjectsImportBody) o;
    return Objects.equals(this.file, projectsImportBody.file) &&
        Objects.equals(this.name, projectsImportBody.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsImportBody {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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
