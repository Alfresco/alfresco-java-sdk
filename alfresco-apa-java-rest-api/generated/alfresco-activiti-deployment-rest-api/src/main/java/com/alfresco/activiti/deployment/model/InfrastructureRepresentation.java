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
import com.alfresco.activiti.deployment.model.UiInfrastructureRepresentation;
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
 * InfrastructureRepresentation
 */
@Validated

public class InfrastructureRepresentation   {
  @JsonProperty("bridges")
  @Valid
  private Map<String, ServiceRepresentation> bridges = null;

  @JsonProperty("connectors")
  @Valid
  private Map<String, ServiceRepresentation> connectors = null;

  @JsonProperty("content-service")
  private ServiceRepresentation contentService = null;

  @JsonProperty("identity-service")
  private ServiceRepresentation identityService = null;

  @JsonProperty("process-runtime-service")
  private ServiceRepresentation processRuntimeService = null;

  @JsonProperty("process-storage-service")
  private ServiceRepresentation processStorageService = null;

  @JsonProperty("query-service")
  private ServiceRepresentation queryService = null;

  @JsonProperty("runtime-version")
  private String runtimeVersion = null;

  @JsonProperty("uis")
  @Valid
  private Map<String, UiInfrastructureRepresentation> uis = null;

  public InfrastructureRepresentation bridges(Map<String, ServiceRepresentation> bridges) {
    this.bridges = bridges;
    return this;
  }

  public InfrastructureRepresentation putBridgesItem(String key, ServiceRepresentation bridgesItem) {
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

  public InfrastructureRepresentation connectors(Map<String, ServiceRepresentation> connectors) {
    this.connectors = connectors;
    return this;
  }

  public InfrastructureRepresentation putConnectorsItem(String key, ServiceRepresentation connectorsItem) {
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

  public InfrastructureRepresentation contentService(ServiceRepresentation contentService) {
    this.contentService = contentService;
    return this;
  }

  /**
   * Get contentService
   * @return contentService
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceRepresentation getContentService() {
    return contentService;
  }

  public void setContentService(ServiceRepresentation contentService) {
    this.contentService = contentService;
  }

  public InfrastructureRepresentation identityService(ServiceRepresentation identityService) {
    this.identityService = identityService;
    return this;
  }

  /**
   * Get identityService
   * @return identityService
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceRepresentation getIdentityService() {
    return identityService;
  }

  public void setIdentityService(ServiceRepresentation identityService) {
    this.identityService = identityService;
  }

  public InfrastructureRepresentation processRuntimeService(ServiceRepresentation processRuntimeService) {
    this.processRuntimeService = processRuntimeService;
    return this;
  }

  /**
   * Get processRuntimeService
   * @return processRuntimeService
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceRepresentation getProcessRuntimeService() {
    return processRuntimeService;
  }

  public void setProcessRuntimeService(ServiceRepresentation processRuntimeService) {
    this.processRuntimeService = processRuntimeService;
  }

  public InfrastructureRepresentation processStorageService(ServiceRepresentation processStorageService) {
    this.processStorageService = processStorageService;
    return this;
  }

  /**
   * Get processStorageService
   * @return processStorageService
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceRepresentation getProcessStorageService() {
    return processStorageService;
  }

  public void setProcessStorageService(ServiceRepresentation processStorageService) {
    this.processStorageService = processStorageService;
  }

  public InfrastructureRepresentation queryService(ServiceRepresentation queryService) {
    this.queryService = queryService;
    return this;
  }

  /**
   * Get queryService
   * @return queryService
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServiceRepresentation getQueryService() {
    return queryService;
  }

  public void setQueryService(ServiceRepresentation queryService) {
    this.queryService = queryService;
  }

  public InfrastructureRepresentation runtimeVersion(String runtimeVersion) {
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

  public InfrastructureRepresentation uis(Map<String, UiInfrastructureRepresentation> uis) {
    this.uis = uis;
    return this;
  }

  public InfrastructureRepresentation putUisItem(String key, UiInfrastructureRepresentation uisItem) {
    if (this.uis == null) {
      this.uis = new HashMap<>();
    }
    this.uis.put(key, uisItem);
    return this;
  }

  /**
   * Get uis
   * @return uis
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, UiInfrastructureRepresentation> getUis() {
    return uis;
  }

  public void setUis(Map<String, UiInfrastructureRepresentation> uis) {
    this.uis = uis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfrastructureRepresentation infrastructureRepresentation = (InfrastructureRepresentation) o;
    return Objects.equals(this.bridges, infrastructureRepresentation.bridges) &&
        Objects.equals(this.connectors, infrastructureRepresentation.connectors) &&
        Objects.equals(this.contentService, infrastructureRepresentation.contentService) &&
        Objects.equals(this.identityService, infrastructureRepresentation.identityService) &&
        Objects.equals(this.processRuntimeService, infrastructureRepresentation.processRuntimeService) &&
        Objects.equals(this.processStorageService, infrastructureRepresentation.processStorageService) &&
        Objects.equals(this.queryService, infrastructureRepresentation.queryService) &&
        Objects.equals(this.runtimeVersion, infrastructureRepresentation.runtimeVersion) &&
        Objects.equals(this.uis, infrastructureRepresentation.uis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridges, connectors, contentService, identityService, processRuntimeService, processStorageService, queryService, runtimeVersion, uis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfrastructureRepresentation {\n");
    
    sb.append("    bridges: ").append(toIndentedString(bridges)).append("\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
    sb.append("    contentService: ").append(toIndentedString(contentService)).append("\n");
    sb.append("    identityService: ").append(toIndentedString(identityService)).append("\n");
    sb.append("    processRuntimeService: ").append(toIndentedString(processRuntimeService)).append("\n");
    sb.append("    processStorageService: ").append(toIndentedString(processStorageService)).append("\n");
    sb.append("    queryService: ").append(toIndentedString(queryService)).append("\n");
    sb.append("    runtimeVersion: ").append(toIndentedString(runtimeVersion)).append("\n");
    sb.append("    uis: ").append(toIndentedString(uis)).append("\n");
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

