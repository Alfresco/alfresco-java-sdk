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
package com.alfresco.activiti.deployment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UiInfrastructureRepresentation
 */
@Validated


public class UiInfrastructureRepresentation   {
  @JsonProperty("adf-template")
  private String adfTemplate = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("name")
  private String name = null;

  public UiInfrastructureRepresentation adfTemplate(String adfTemplate) {
    this.adfTemplate = adfTemplate;
    return this;
  }

  /**
   * Get adfTemplate
   * @return adfTemplate
   **/
  @ApiModelProperty(value = "")
  
    public String getAdfTemplate() {
    return adfTemplate;
  }

  public void setAdfTemplate(String adfTemplate) {
    this.adfTemplate = adfTemplate;
  }

  public UiInfrastructureRepresentation image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   **/
  @ApiModelProperty(value = "")
  
    public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public UiInfrastructureRepresentation name(String name) {
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
    UiInfrastructureRepresentation uiInfrastructureRepresentation = (UiInfrastructureRepresentation) o;
    return Objects.equals(this.adfTemplate, uiInfrastructureRepresentation.adfTemplate) &&
        Objects.equals(this.image, uiInfrastructureRepresentation.image) &&
        Objects.equals(this.name, uiInfrastructureRepresentation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adfTemplate, image, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UiInfrastructureRepresentation {\n");
    
    sb.append("    adfTemplate: ").append(toIndentedString(adfTemplate)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
