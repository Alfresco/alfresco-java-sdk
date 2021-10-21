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
package com.alfresco.activiti.model;

import java.util.Objects;
import com.alfresco.activiti.model.EndpointRequestHeaderRepresentation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EndpointConfigurationRepresentation
 */
@Validated


public class EndpointConfigurationRepresentation   {
  @JsonProperty("basicAuthId")
  private Long basicAuthId = null;

  @JsonProperty("basicAuthName")
  private String basicAuthName = null;

  @JsonProperty("host")
  private String host = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("port")
  private String port = null;

  @JsonProperty("protocol")
  private String protocol = null;

  @JsonProperty("requestHeaders")
  @Valid
  private List<EndpointRequestHeaderRepresentation> requestHeaders = null;

  @JsonProperty("tenantId")
  private Long tenantId = null;

  public EndpointConfigurationRepresentation basicAuthId(Long basicAuthId) {
    this.basicAuthId = basicAuthId;
    return this;
  }

  /**
   * Get basicAuthId
   * @return basicAuthId
   **/
  @ApiModelProperty(value = "")
  
    public Long getBasicAuthId() {
    return basicAuthId;
  }

  public void setBasicAuthId(Long basicAuthId) {
    this.basicAuthId = basicAuthId;
  }

  public EndpointConfigurationRepresentation basicAuthName(String basicAuthName) {
    this.basicAuthName = basicAuthName;
    return this;
  }

  /**
   * Get basicAuthName
   * @return basicAuthName
   **/
  @ApiModelProperty(value = "")
  
    public String getBasicAuthName() {
    return basicAuthName;
  }

  public void setBasicAuthName(String basicAuthName) {
    this.basicAuthName = basicAuthName;
  }

  public EndpointConfigurationRepresentation host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
   **/
  @ApiModelProperty(value = "")
  
    public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public EndpointConfigurationRepresentation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @ApiModelProperty(value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EndpointConfigurationRepresentation name(String name) {
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

  public EndpointConfigurationRepresentation path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   **/
  @ApiModelProperty(value = "")
  
    public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public EndpointConfigurationRepresentation port(String port) {
    this.port = port;
    return this;
  }

  /**
   * Get port
   * @return port
   **/
  @ApiModelProperty(value = "")
  
    public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public EndpointConfigurationRepresentation protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
   **/
  @ApiModelProperty(value = "")
  
    public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public EndpointConfigurationRepresentation requestHeaders(List<EndpointRequestHeaderRepresentation> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public EndpointConfigurationRepresentation addRequestHeadersItem(EndpointRequestHeaderRepresentation requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new ArrayList<>();
    }
    this.requestHeaders.add(requestHeadersItem);
    return this;
  }

  /**
   * Get requestHeaders
   * @return requestHeaders
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<EndpointRequestHeaderRepresentation> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(List<EndpointRequestHeaderRepresentation> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public EndpointConfigurationRepresentation tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   **/
  @ApiModelProperty(value = "")
  
    public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointConfigurationRepresentation endpointConfigurationRepresentation = (EndpointConfigurationRepresentation) o;
    return Objects.equals(this.basicAuthId, endpointConfigurationRepresentation.basicAuthId) &&
        Objects.equals(this.basicAuthName, endpointConfigurationRepresentation.basicAuthName) &&
        Objects.equals(this.host, endpointConfigurationRepresentation.host) &&
        Objects.equals(this.id, endpointConfigurationRepresentation.id) &&
        Objects.equals(this.name, endpointConfigurationRepresentation.name) &&
        Objects.equals(this.path, endpointConfigurationRepresentation.path) &&
        Objects.equals(this.port, endpointConfigurationRepresentation.port) &&
        Objects.equals(this.protocol, endpointConfigurationRepresentation.protocol) &&
        Objects.equals(this.requestHeaders, endpointConfigurationRepresentation.requestHeaders) &&
        Objects.equals(this.tenantId, endpointConfigurationRepresentation.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuthId, basicAuthName, host, id, name, path, port, protocol, requestHeaders, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointConfigurationRepresentation {\n");
    
    sb.append("    basicAuthId: ").append(toIndentedString(basicAuthId)).append("\n");
    sb.append("    basicAuthName: ").append(toIndentedString(basicAuthName)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
