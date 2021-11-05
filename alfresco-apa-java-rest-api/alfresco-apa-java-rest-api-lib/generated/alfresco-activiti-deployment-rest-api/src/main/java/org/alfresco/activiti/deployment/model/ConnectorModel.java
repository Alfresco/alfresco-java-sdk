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
package org.alfresco.activiti.deployment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.deployment.model.Variable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConnectorModel
 */
@Validated


public class ConnectorModel   {
  @JsonProperty("config")
  @Valid
  private List<Variable> config = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("template")
  private String template = null;

  public ConnectorModel config(List<Variable> config) {
    this.config = config;
    return this;
  }

  public ConnectorModel addConfigItem(Variable configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

  /**
   * Get config
   * @return config
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Variable> getConfig() {
    return config;
  }

  public void setConfig(List<Variable> config) {
    this.config = config;
  }

  public ConnectorModel name(String name) {
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

  public ConnectorModel template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   **/
  @ApiModelProperty(value = "")
  
    public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorModel connectorModel = (ConnectorModel) o;
    return Objects.equals(this.config, connectorModel.config) &&
        Objects.equals(this.name, connectorModel.name) &&
        Objects.equals(this.template, connectorModel.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, name, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorModel {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
