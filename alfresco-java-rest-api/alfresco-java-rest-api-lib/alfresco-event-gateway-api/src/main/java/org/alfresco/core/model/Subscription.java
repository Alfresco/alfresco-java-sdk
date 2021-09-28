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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.alfresco.core.model.Filter;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Subscription
 */
@Validated
public class Subscription   {
  @JsonProperty("createdDate")  private Long createdDate = null;

  @JsonProperty("modifiedDate")  private Long modifiedDate = null;

  @JsonProperty("id")  private String id = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

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
  @JsonProperty("status")  private StatusEnum status = null;

  @JsonProperty("type")  private String type = null;

  @JsonProperty("user")  private String user = null;

  @JsonProperty("config")  @Valid
  private Map<String, String> config = null;

  @JsonProperty("filters")  @Valid
  private List<Filter> filters = null;

  public Subscription createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")

  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public Subscription modifiedDate(Long modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "")

  public Long getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(Long modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public Subscription id(String id) {
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

  public Subscription status(StatusEnum status) {
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

  public Subscription type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Subscription user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Subscription config(Map<String, String> config) {
    this.config = config;
    return this;
  }

  public Subscription putConfigItem(String key, String configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }
    this.config.put(key, configItem);
    return this;
  }

  /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(value = "")

  public Map<String, String> getConfig() {
    return config;
  }

  public void setConfig(Map<String, String> config) {
    this.config = config;
  }

  public Subscription filters(List<Filter> filters) {
    this.filters = filters;
    return this;
  }

  public Subscription addFiltersItem(Filter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Get filters
   * @return filters
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<Filter> getFilters() {
    return filters;
  }

  public void setFilters(List<Filter> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.createdDate, subscription.createdDate) &&
        Objects.equals(this.modifiedDate, subscription.modifiedDate) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.status, subscription.status) &&
        Objects.equals(this.type, subscription.type) &&
        Objects.equals(this.user, subscription.user) &&
        Objects.equals(this.config, subscription.config) &&
        Objects.equals(this.filters, subscription.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, modifiedDate, id, status, type, user, config, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
