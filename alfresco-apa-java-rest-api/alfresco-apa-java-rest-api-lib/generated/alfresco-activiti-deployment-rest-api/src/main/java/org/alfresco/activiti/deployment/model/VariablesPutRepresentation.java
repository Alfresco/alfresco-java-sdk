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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VariablesPutRepresentation
 */
@Validated


public class VariablesPutRepresentation   {
  @JsonProperty("bridges")
  @Valid
  private Map<String, Object> bridges = null;

  @JsonProperty("connectors")
  @Valid
  private Map<String, Object> connectors = null;

  @JsonProperty("form-runtime-service")
  @Valid
  private Map<String, String> formRuntimeService = null;

  @JsonProperty("process-runtime-service")
  @Valid
  private Map<String, String> processRuntimeService = null;

  public VariablesPutRepresentation bridges(Map<String, Object> bridges) {
    this.bridges = bridges;
    return this;
  }

  public VariablesPutRepresentation putBridgesItem(String key, Object bridgesItem) {
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

  public VariablesPutRepresentation connectors(Map<String, Object> connectors) {
    this.connectors = connectors;
    return this;
  }

  public VariablesPutRepresentation putConnectorsItem(String key, Object connectorsItem) {
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

  public VariablesPutRepresentation formRuntimeService(Map<String, String> formRuntimeService) {
    this.formRuntimeService = formRuntimeService;
    return this;
  }

  public VariablesPutRepresentation putFormRuntimeServiceItem(String key, String formRuntimeServiceItem) {
    if (this.formRuntimeService == null) {
      this.formRuntimeService = new HashMap<>();
    }
    this.formRuntimeService.put(key, formRuntimeServiceItem);
    return this;
  }

  /**
   * Get formRuntimeService
   * @return formRuntimeService
   **/
  @ApiModelProperty(value = "")
  
    public Map<String, String> getFormRuntimeService() {
    return formRuntimeService;
  }

  public void setFormRuntimeService(Map<String, String> formRuntimeService) {
    this.formRuntimeService = formRuntimeService;
  }

  public VariablesPutRepresentation processRuntimeService(Map<String, String> processRuntimeService) {
    this.processRuntimeService = processRuntimeService;
    return this;
  }

  public VariablesPutRepresentation putProcessRuntimeServiceItem(String key, String processRuntimeServiceItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariablesPutRepresentation variablesPutRepresentation = (VariablesPutRepresentation) o;
    return Objects.equals(this.bridges, variablesPutRepresentation.bridges) &&
        Objects.equals(this.connectors, variablesPutRepresentation.connectors) &&
        Objects.equals(this.formRuntimeService, variablesPutRepresentation.formRuntimeService) &&
        Objects.equals(this.processRuntimeService, variablesPutRepresentation.processRuntimeService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bridges, connectors, formRuntimeService, processRuntimeService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariablesPutRepresentation {\n");
    
    sb.append("    bridges: ").append(toIndentedString(bridges)).append("\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
    sb.append("    formRuntimeService: ").append(toIndentedString(formRuntimeService)).append("\n");
    sb.append("    processRuntimeService: ").append(toIndentedString(processRuntimeService)).append("\n");
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
