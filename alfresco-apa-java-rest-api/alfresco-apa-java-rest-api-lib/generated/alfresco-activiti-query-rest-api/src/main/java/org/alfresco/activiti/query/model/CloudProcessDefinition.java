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
package org.alfresco.activiti.query.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CloudProcessDefinition
 */
@Validated


public class CloudProcessDefinition   {
  @JsonProperty("appName")
  private String appName = null;

  @JsonProperty("appVersion")
  private String appVersion = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("formKey")
  private String formKey = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("serviceFullName")
  private String serviceFullName = null;

  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("serviceVersion")
  private String serviceVersion = null;

  @JsonProperty("version")
  private Integer version = null;

  public CloudProcessDefinition appName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Get appName
   * @return appName
   **/
  @ApiModelProperty(value = "")
  
    public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public CloudProcessDefinition appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * Get appVersion
   * @return appVersion
   **/
  @ApiModelProperty(value = "")
  
    public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public CloudProcessDefinition description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CloudProcessDefinition formKey(String formKey) {
    this.formKey = formKey;
    return this;
  }

  /**
   * Get formKey
   * @return formKey
   **/
  @ApiModelProperty(value = "")
  
    public String getFormKey() {
    return formKey;
  }

  public void setFormKey(String formKey) {
    this.formKey = formKey;
  }

  public CloudProcessDefinition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudProcessDefinition key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   **/
  @ApiModelProperty(value = "")
  
    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CloudProcessDefinition name(String name) {
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

  public CloudProcessDefinition serviceFullName(String serviceFullName) {
    this.serviceFullName = serviceFullName;
    return this;
  }

  /**
   * Get serviceFullName
   * @return serviceFullName
   **/
  @ApiModelProperty(value = "")
  
    public String getServiceFullName() {
    return serviceFullName;
  }

  public void setServiceFullName(String serviceFullName) {
    this.serviceFullName = serviceFullName;
  }

  public CloudProcessDefinition serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   **/
  @ApiModelProperty(value = "")
  
    public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public CloudProcessDefinition serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
   **/
  @ApiModelProperty(value = "")
  
    public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public CloudProcessDefinition serviceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
    return this;
  }

  /**
   * Get serviceVersion
   * @return serviceVersion
   **/
  @ApiModelProperty(value = "")
  
    public String getServiceVersion() {
    return serviceVersion;
  }

  public void setServiceVersion(String serviceVersion) {
    this.serviceVersion = serviceVersion;
  }

  public CloudProcessDefinition version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @ApiModelProperty(value = "")
  
    public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudProcessDefinition cloudProcessDefinition = (CloudProcessDefinition) o;
    return Objects.equals(this.appName, cloudProcessDefinition.appName) &&
        Objects.equals(this.appVersion, cloudProcessDefinition.appVersion) &&
        Objects.equals(this.description, cloudProcessDefinition.description) &&
        Objects.equals(this.formKey, cloudProcessDefinition.formKey) &&
        Objects.equals(this.id, cloudProcessDefinition.id) &&
        Objects.equals(this.key, cloudProcessDefinition.key) &&
        Objects.equals(this.name, cloudProcessDefinition.name) &&
        Objects.equals(this.serviceFullName, cloudProcessDefinition.serviceFullName) &&
        Objects.equals(this.serviceName, cloudProcessDefinition.serviceName) &&
        Objects.equals(this.serviceType, cloudProcessDefinition.serviceType) &&
        Objects.equals(this.serviceVersion, cloudProcessDefinition.serviceVersion) &&
        Objects.equals(this.version, cloudProcessDefinition.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appVersion, description, formKey, id, key, name, serviceFullName, serviceName, serviceType, serviceVersion, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudProcessDefinition {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceFullName: ").append(toIndentedString(serviceFullName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceVersion: ").append(toIndentedString(serviceVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
