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
 * ServiceRepresentation
 */
@Validated


public class ServiceRepresentation   {
  @JsonProperty("configurationChanged")
  private Boolean configurationChanged = null;

  @JsonProperty("image")
  private String image = null;

  public ServiceRepresentation configurationChanged(Boolean configurationChanged) {
    this.configurationChanged = configurationChanged;
    return this;
  }

  /**
   * Get configurationChanged
   * @return configurationChanged
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isConfigurationChanged() {
    return configurationChanged;
  }

  public void setConfigurationChanged(Boolean configurationChanged) {
    this.configurationChanged = configurationChanged;
  }

  public ServiceRepresentation image(String image) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRepresentation serviceRepresentation = (ServiceRepresentation) o;
    return Objects.equals(this.configurationChanged, serviceRepresentation.configurationChanged) &&
        Objects.equals(this.image, serviceRepresentation.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationChanged, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRepresentation {\n");
    
    sb.append("    configurationChanged: ").append(toIndentedString(configurationChanged)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
