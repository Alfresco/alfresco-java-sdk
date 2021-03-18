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
package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditApp
 */
@Validated

public class AuditApp   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = true;

  @JsonProperty("maxEntryId")
  private Integer maxEntryId = null;

  @JsonProperty("minEntryId")
  private Integer minEntryId = null;

  public AuditApp id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditApp name(String name) {
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

  public AuditApp isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Get isEnabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AuditApp maxEntryId(Integer maxEntryId) {
    this.maxEntryId = maxEntryId;
    return this;
  }

  /**
   * Get maxEntryId
   * @return maxEntryId
  **/
  @ApiModelProperty(value = "")


  public Integer getMaxEntryId() {
    return maxEntryId;
  }

  public void setMaxEntryId(Integer maxEntryId) {
    this.maxEntryId = maxEntryId;
  }

  public AuditApp minEntryId(Integer minEntryId) {
    this.minEntryId = minEntryId;
    return this;
  }

  /**
   * Get minEntryId
   * @return minEntryId
  **/
  @ApiModelProperty(value = "")


  public Integer getMinEntryId() {
    return minEntryId;
  }

  public void setMinEntryId(Integer minEntryId) {
    this.minEntryId = minEntryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditApp auditApp = (AuditApp) o;
    return Objects.equals(this.id, auditApp.id) &&
        Objects.equals(this.name, auditApp.name) &&
        Objects.equals(this.isEnabled, auditApp.isEnabled) &&
        Objects.equals(this.maxEntryId, auditApp.maxEntryId) &&
        Objects.equals(this.minEntryId, auditApp.minEntryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isEnabled, maxEntryId, minEntryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditApp {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    maxEntryId: ").append(toIndentedString(maxEntryId)).append("\n");
    sb.append("    minEntryId: ").append(toIndentedString(minEntryId)).append("\n");
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

