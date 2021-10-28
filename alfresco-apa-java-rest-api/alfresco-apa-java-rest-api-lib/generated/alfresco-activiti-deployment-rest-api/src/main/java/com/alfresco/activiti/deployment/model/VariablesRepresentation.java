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
import com.alfresco.activiti.deployment.model.ContentVariablesRepresentation;
import com.alfresco.activiti.deployment.model.IdentityVariablesRepresentation;
import com.alfresco.activiti.deployment.model.MessagingVariablesRepresentation;
import com.alfresco.activiti.deployment.model.PostgresqlVariablesRepresentation;
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
 * VariablesRepresentation
 */
@Validated


public class VariablesRepresentation   {
  @JsonProperty("bridges")
  @Valid
  private Map<String, Object> bridges = null;

  @JsonProperty("connectors")
  @Valid
  private Map<String, Object> connectors = null;

  @JsonProperty("content-service")
  private ContentVariablesRepresentation contentService = null;

  @JsonProperty("identity-service")
  private IdentityVariablesRepresentation identityService = null;

  @JsonProperty("messaging-service")
  private MessagingVariablesRepresentation messagingService = null;

  @JsonProperty("postgresql-service")
  private PostgresqlVariablesRepresentation postgresqlService = null;

  @JsonProperty("process-runtime-service")
  @Valid
  private Map<String, String> processRuntimeService = null;

  @JsonProperty("process-storage-service")
  @Valid
  private Map<String, String> processStorageService = null;

  @JsonProperty("query-service")
  @Valid
  private Map<String, String> queryService = null;

  @JsonProperty("uis")
  @Valid
  private Map<String, Object> uis = null;

  public VariablesRepresentation bridges(Map<String, Object> bridges) {
    this.bridges = bridges;
    return this;
  }

  public VariablesRepresentation putBridgesItem(String key, Object bridgesItem) {
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
  
    public Map<String, Object> getBridges() {
    return bridges;
  }

  public void setBridges(Map<String, Object> bridges) {
    this.bridges = bridges;
  }

  public VariablesRepresentation connectors(Map<String, Object> connectors) {
    this.connectors = connectors;
    return this;
  }

  public VariablesRepresentation putConnectorsItem(String key, Object connectorsItem) {
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
  
    public Map<String, Object> getConnectors() {
    return connectors;
  }

  public void setConnectors(Map<String, Object> connectors) {
    this.connectors = connectors;
  }

  public VariablesRepresentation contentService(ContentVariablesRepresentation contentService) {
    this.contentService = contentService;
    return this;
  }

  /**
   * Get contentService
   * @return contentService
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ContentVariablesRepresentation getContentService() {
    return contentService;
  }

  public void setContentService(ContentVariablesRepresentation contentService) {
    this.contentService = contentService;
  }

  public VariablesRepresentation identityService(IdentityVariablesRepresentation identityService) {
    this.identityService = identityService;
    return this;
  }

  /**
   * Get identityService
   * @return identityService
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public IdentityVariablesRepresentation getIdentityService() {
    return identityService;
  }

  public void setIdentityService(IdentityVariablesRepresentation identityService) {
    this.identityService = identityService;
  }

  public VariablesRepresentation messagingService(MessagingVariablesRepresentation messagingService) {
    this.messagingService = messagingService;
    return this;
  }

  /**
   * Get messagingService
   * @return messagingService
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MessagingVariablesRepresentation getMessagingService() {
    return messagingService;
  }

  public void setMessagingService(MessagingVariablesRepresentation messagingService) {
    this.messagingService = messagingService;
  }

  public VariablesRepresentation postgresqlService(PostgresqlVariablesRepresentation postgresqlService) {
    this.postgresqlService = postgresqlService;
    return this;
  }

  /**
   * Get postgresqlService
   * @return postgresqlService
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PostgresqlVariablesRepresentation getPostgresqlService() {
    return postgresqlService;
  }

  public void setPostgresqlService(PostgresqlVariablesRepresentation postgresqlService) {
    this.postgresqlService = postgresqlService;
  }

  public VariablesRepresentation processRuntimeService(Map<String, String> processRuntimeService) {
    this.processRuntimeService = processRuntimeService;
    return this;
  }

  public VariablesRepresentation putProcessRuntimeServiceItem(String key, String processRuntimeServiceItem) {
    if (this.processRuntimeService == null) {
      this.processRuntimeService = new HashMap<>();
    }
    this.processRuntimeService.put(key, processRuntimeServiceItem);
    return this;
  }

  /**
   * Get processRuntimeService
   * @return processRuntimeService
   **/
  @ApiModelProperty(value = "")
  
    public Map<String, String> getProcessRuntimeService() {
    return processRuntimeService;
  }

  public void setProcessRuntimeService(Map<String, String> processRuntimeService) {
    this.processRuntimeService = processRuntimeService;
  }

  public VariablesRepresentation processStorageService(Map<String, String> processStorageService) {
    this.processStorageService = processStorageService;
    return this;
  }

  public VariablesRepresentation putProcessStorageServiceItem(String key, String processStorageServiceItem) {
    if (this.processStorageService == null) {
      this.processStorageService = new HashMap<>();
    }
    this.processStorageService.put(key, processStorageServiceItem);
    return this;
  }

  /**
   * Get processStorageService
   * @return processStorageService
   **/
  @ApiModelProperty(value = "")
  
    public Map<String, String> getProcessStorageService() {
    return processStorageService;
  }

  public void setProcessStorageService(Map<String, String> processStorageService) {
    this.processStorageService = processStorageService;
  }

  public VariablesRepresentation queryService(Map<String, String> queryService) {
    this.queryService = queryService;
    return this;
  }

  public VariablesRepresentation putQueryServiceItem(String key, String queryServiceItem) {
    if (this.queryService == null) {
      this.queryService = new HashMap<>();
    }
    this.queryService.put(key, queryServiceItem);
    return this;
  }

  /**
   * Get queryService
   * @return queryService
   **/
  @ApiModelProperty(value = "")
  
    public Map<String, String> getQueryService() {
    return queryService;
  }

  public void setQueryService(Map<String, String> queryService) {
    this.queryService = queryService;
  }

  public VariablesRepresentation uis(Map<String, Object> uis) {
    this.uis = uis;
    return this;
  }

  public VariablesRepresentation putUisItem(String key, Object uisItem) {
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
  
    public Map<String, Object> getUis() {
    return uis;
  }

  public void setUis(Map<String, Object> uis) {
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
    VariablesRepresentation variablesRepresentation = (VariablesRepresentation) o;
    return Objects.equals(this.bridges, variablesRepresentation.bridges) &&
        Objects.equals(this.connectors, variablesRepresentation.connectors) &&
        Objects.equals(this.contentService, variablesRepresentation.contentService) &&
        Objects.equals(this.identityService, variablesRepresentation.identityService) &&
        Objects.equals(this.messagingService, variablesRepresentation.messagingService) &&
        Objects.equals(this.postgresqlService, variablesRepresentation.postgresqlService) &&
        Objects.equals(this.processRuntimeService, variablesRepresentation.processRuntimeService) &&
        Objects.equals(this.processStorageService, variablesRepresentation.processStorageService) &&
        Objects.equals(this.queryService, variablesRepresentation.queryService) &&
        Objects.equals(this.uis, variablesRepresentation.uis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridges, connectors, contentService, identityService, messagingService, postgresqlService, processRuntimeService, processStorageService, queryService, uis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariablesRepresentation {\n");
    
    sb.append("    bridges: ").append(toIndentedString(bridges)).append("\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
    sb.append("    contentService: ").append(toIndentedString(contentService)).append("\n");
    sb.append("    identityService: ").append(toIndentedString(identityService)).append("\n");
    sb.append("    messagingService: ").append(toIndentedString(messagingService)).append("\n");
    sb.append("    postgresqlService: ").append(toIndentedString(postgresqlService)).append("\n");
    sb.append("    processRuntimeService: ").append(toIndentedString(processRuntimeService)).append("\n");
    sb.append("    processStorageService: ").append(toIndentedString(processStorageService)).append("\n");
    sb.append("    queryService: ").append(toIndentedString(queryService)).append("\n");
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
