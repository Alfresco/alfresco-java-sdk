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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeployDescriptorVariablesRepresentation
 */
@Validated


public class DeployDescriptorVariablesRepresentation   {
  @JsonProperty("connectors")
  @Valid
  private Map<String, Map<String, String>> connectors = null;

  public DeployDescriptorVariablesRepresentation connectors(Map<String, Map<String, String>> connectors) {
    this.connectors = connectors;
    return this;
  }

  public DeployDescriptorVariablesRepresentation putConnectorsItem(String key, Map<String, String> connectorsItem) {
    if (this.connectors == null) {
      this.connectors = new HashMap<>();
    }
    this.connectors.put(key, connectorsItem);
    return this;
  }

  /**
   * Get connectors
   * @return connectors
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, Map<String, String>> getConnectors() {
    return connectors;
  }

  public void setConnectors(Map<String, Map<String, String>> connectors) {
    this.connectors = connectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployDescriptorVariablesRepresentation deployDescriptorVariablesRepresentation = (DeployDescriptorVariablesRepresentation) o;
    return Objects.equals(this.connectors, deployDescriptorVariablesRepresentation.connectors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployDescriptorVariablesRepresentation {\n");
    
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
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
