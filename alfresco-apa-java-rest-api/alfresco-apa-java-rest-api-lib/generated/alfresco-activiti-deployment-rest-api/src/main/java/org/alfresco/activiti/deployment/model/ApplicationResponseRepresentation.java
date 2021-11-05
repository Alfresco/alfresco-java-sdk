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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.activiti.deployment.model.ApplicationRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicationResponseRepresentation
 */
@Validated


public class ApplicationResponseRepresentation   {
  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("descriptor")
  private ApplicationRepresentation descriptor = null;

  @JsonProperty("lastModifiedAt")
  private String lastModifiedAt = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    CREATEAPP("CreateApp"),
    
    CREATEDESCRIPTOR("CreateDescriptor"),
    
    DEPLOYSTARTED("DeployStarted"),
    
    DEPLOYSTARTEDFAILED("DeployStartedFailed"),
    
    DESCRIPTORCREATED("DescriptorCreated"),
    
    IMAGEBUILD("ImageBuild"),
    
    IMAGEBUILDFAILED("ImageBuildFailed"),
    
    IMAGEPUSH("ImagePush"),
    
    IMAGEPUSHFAILED("ImagePushFailed"),
    
    NOTDEPLOYED("NotDeployed"),
    
    PENDING("Pending"),
    
    RUNNING("Running"),
    
    UNKNOWN("Unknown"),
    
    UPDATEAPP("UpdateApp"),
    
    WAITINGFORDESCRIPTOR("WaitingForDescriptor");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("version")
  private Integer version = null;

  public ApplicationResponseRepresentation createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @ApiModelProperty(example = "yyyy-MM-dd[['T']HH:mm:ss[.SSS'Z']]", value = "")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ApplicationResponseRepresentation descriptor(ApplicationRepresentation descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ApplicationRepresentation getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(ApplicationRepresentation descriptor) {
    this.descriptor = descriptor;
  }

  public ApplicationResponseRepresentation lastModifiedAt(String lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * Get lastModifiedAt
   * @return lastModifiedAt
   **/
  @ApiModelProperty(example = "yyyy-MM-dd[['T']HH:mm:ss[.SSS'Z']]", value = "")
  
    public String getLastModifiedAt() {
    return lastModifiedAt;
  }

  public void setLastModifiedAt(String lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }

  public ApplicationResponseRepresentation name(String name) {
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

  public ApplicationResponseRepresentation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @ApiModelProperty(value = "")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ApplicationResponseRepresentation version(Integer version) {
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
    ApplicationResponseRepresentation applicationResponseRepresentation = (ApplicationResponseRepresentation) o;
    return Objects.equals(this.createdAt, applicationResponseRepresentation.createdAt) &&
        Objects.equals(this.descriptor, applicationResponseRepresentation.descriptor) &&
        Objects.equals(this.lastModifiedAt, applicationResponseRepresentation.lastModifiedAt) &&
        Objects.equals(this.name, applicationResponseRepresentation.name) &&
        Objects.equals(this.status, applicationResponseRepresentation.status) &&
        Objects.equals(this.version, applicationResponseRepresentation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, descriptor, lastModifiedAt, name, status, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationResponseRepresentation {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
