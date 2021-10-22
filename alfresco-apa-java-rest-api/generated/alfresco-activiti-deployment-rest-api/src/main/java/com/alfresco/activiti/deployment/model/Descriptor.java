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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Descriptor
 */
@Validated


public class Descriptor   {
  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("deployed")
  private Boolean deployed = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastModifiedAt")
  private String lastModifiedAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("payload")
  private String payload = null;

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

  public Descriptor createdAt(String createdAt) {
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

  public Descriptor deployed(Boolean deployed) {
    this.deployed = deployed;
    return this;
  }

  /**
   * Get deployed
   * @return deployed
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isDeployed() {
    return deployed;
  }

  public void setDeployed(Boolean deployed) {
    this.deployed = deployed;
  }

  public Descriptor id(Long id) {
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

  public Descriptor lastModifiedAt(String lastModifiedAt) {
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

  public Descriptor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="[a-z0-9]([-a-z0-9]*[a-z0-9])?")   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Descriptor payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   **/
  @ApiModelProperty(value = "")
  
    public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public Descriptor status(StatusEnum status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Descriptor descriptor = (Descriptor) o;
    return Objects.equals(this.createdAt, descriptor.createdAt) &&
        Objects.equals(this.deployed, descriptor.deployed) &&
        Objects.equals(this.id, descriptor.id) &&
        Objects.equals(this.lastModifiedAt, descriptor.lastModifiedAt) &&
        Objects.equals(this.name, descriptor.name) &&
        Objects.equals(this.payload, descriptor.payload) &&
        Objects.equals(this.status, descriptor.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, deployed, id, lastModifiedAt, name, payload, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Descriptor {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deployed: ").append(toIndentedString(deployed)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
