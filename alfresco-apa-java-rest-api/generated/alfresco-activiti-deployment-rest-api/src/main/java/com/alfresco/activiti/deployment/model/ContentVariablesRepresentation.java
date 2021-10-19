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
 * ContentVariablesRepresentation
 */
@Validated

public class ContentVariablesRepresentation   {
  @JsonProperty("storageTarget")
  private String storageTarget = null;

  /**
   * Gets or Sets storageType
   */
  public enum StorageTypeEnum {
    FOLDER("folder"),
    
    SITE("site");

    private String value;

    StorageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StorageTypeEnum fromValue(String text) {
      for (StorageTypeEnum b : StorageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("storageType")
  private StorageTypeEnum storageType = null;

  @JsonProperty("url")
  private String url = null;

  public ContentVariablesRepresentation storageTarget(String storageTarget) {
    this.storageTarget = storageTarget;
    return this;
  }

  /**
   * Get storageTarget
   * @return storageTarget
  **/
  @ApiModelProperty(value = "")


  public String getStorageTarget() {
    return storageTarget;
  }

  public void setStorageTarget(String storageTarget) {
    this.storageTarget = storageTarget;
  }

  public ContentVariablesRepresentation storageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
    return this;
  }

  /**
   * Get storageType
   * @return storageType
  **/
  @ApiModelProperty(value = "")


  public StorageTypeEnum getStorageType() {
    return storageType;
  }

  public void setStorageType(StorageTypeEnum storageType) {
    this.storageType = storageType;
  }

  public ContentVariablesRepresentation url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentVariablesRepresentation contentVariablesRepresentation = (ContentVariablesRepresentation) o;
    return Objects.equals(this.storageTarget, contentVariablesRepresentation.storageTarget) &&
        Objects.equals(this.storageType, contentVariablesRepresentation.storageType) &&
        Objects.equals(this.url, contentVariablesRepresentation.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageTarget, storageType, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentVariablesRepresentation {\n");
    
    sb.append("    storageTarget: ").append(toIndentedString(storageTarget)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

