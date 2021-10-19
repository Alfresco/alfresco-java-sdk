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
import com.alfresco.activiti.deployment.model.ServiceRepresentation;
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
 * InfrastructurePutRepresentation
 */
@Validated

public class InfrastructurePutRepresentation   {
  @JsonProperty("bridges")
  @Valid
  private Map<String, ServiceRepresentation> bridges = null;

  @JsonProperty("connectors")
  @Valid
  private Map<String, ServiceRepresentation> connectors = null;

  @JsonProperty("runtime-version")
  private String runtimeVersion = null;

  public InfrastructurePutRepresentation bridges(Map<String, ServiceRepresentation> bridges) {
    this.bridges = bridges;
    return this;
  }

  public InfrastructurePutRepresentation putBridgesItem(String key, ServiceRepresentation bridgesItem) {
    if (this.bridges == null) {
      this.bridges = new HashMap<>();
    }
    this.bridges.put(key, bridgesItem);
    return this;
  }

  /**
   * Get bridges
   * @return bridges
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, ServiceRepresentation> getBridges() {
    return bridges;
  }

  public void setBridges(Map<String, ServiceRepresentation> bridges) {
    this.bridges = bridges;
  }

  public InfrastructurePutRepresentation connectors(Map<String, ServiceRepresentation> connectors) {
    this.connectors = connectors;
    return this;
  }

  public InfrastructurePutRepresentation putConnectorsItem(String key, ServiceRepresentation connectorsItem) {
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

  public Map<String, ServiceRepresentation> getConnectors() {
    return connectors;
  }

  public void setConnectors(Map<String, ServiceRepresentation> connectors) {
    this.connectors = connectors;
  }

  public InfrastructurePutRepresentation runtimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
    return this;
  }

  /**
   * Get runtimeVersion
   * @return runtimeVersion
  **/
  @ApiModelProperty(value = "")


  public String getRuntimeVersion() {
    return runtimeVersion;
  }

  public void setRuntimeVersion(String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfrastructurePutRepresentation infrastructurePutRepresentation = (InfrastructurePutRepresentation) o;
    return Objects.equals(this.bridges, infrastructurePutRepresentation.bridges) &&
        Objects.equals(this.connectors, infrastructurePutRepresentation.connectors) &&
        Objects.equals(this.runtimeVersion, infrastructurePutRepresentation.runtimeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridges, connectors, runtimeVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfrastructurePutRepresentation {\n");
    
    sb.append("    bridges: ").append(toIndentedString(bridges)).append("\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
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

