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
import com.alfresco.activiti.model.EndpointConfigurationRepresentation;
import com.alfresco.activiti.model.OptionRepresentation;
import com.alfresco.activiti.model.RequestHeaderRepresentation;
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
 * ColumnDefinitionRepresentation
 */
@Validated


public class ColumnDefinitionRepresentation   {
  @JsonProperty("amountCurrency")
  private String amountCurrency = null;

  @JsonProperty("amountEnableFractions")
  private Boolean amountEnableFractions = null;

  @JsonProperty("editable")
  private Boolean editable = null;

  @JsonProperty("endpoint")
  private EndpointConfigurationRepresentation endpoint = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("optionType")
  private String optionType = null;

  @JsonProperty("options")
  @Valid
  private List<OptionRepresentation> options = null;

  @JsonProperty("requestHeaders")
  @Valid
  private List<RequestHeaderRepresentation> requestHeaders = null;

  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("restIdProperty")
  private String restIdProperty = null;

  @JsonProperty("restLabelProperty")
  private String restLabelProperty = null;

  @JsonProperty("restResponsePath")
  private String restResponsePath = null;

  @JsonProperty("restUrl")
  private String restUrl = null;

  @JsonProperty("sortable")
  private Boolean sortable = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("visible")
  private Boolean visible = null;

  public ColumnDefinitionRepresentation amountCurrency(String amountCurrency) {
    this.amountCurrency = amountCurrency;
    return this;
  }

  /**
   * Get amountCurrency
   * @return amountCurrency
   **/
  @ApiModelProperty(value = "")
  
    public String getAmountCurrency() {
    return amountCurrency;
  }

  public void setAmountCurrency(String amountCurrency) {
    this.amountCurrency = amountCurrency;
  }

  public ColumnDefinitionRepresentation amountEnableFractions(Boolean amountEnableFractions) {
    this.amountEnableFractions = amountEnableFractions;
    return this;
  }

  /**
   * Get amountEnableFractions
   * @return amountEnableFractions
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isAmountEnableFractions() {
    return amountEnableFractions;
  }

  public void setAmountEnableFractions(Boolean amountEnableFractions) {
    this.amountEnableFractions = amountEnableFractions;
  }

  public ColumnDefinitionRepresentation editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * Get editable
   * @return editable
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isEditable() {
    return editable;
  }

  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  public ColumnDefinitionRepresentation endpoint(EndpointConfigurationRepresentation endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EndpointConfigurationRepresentation getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(EndpointConfigurationRepresentation endpoint) {
    this.endpoint = endpoint;
  }

  public ColumnDefinitionRepresentation id(String id) {
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

  public ColumnDefinitionRepresentation name(String name) {
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

  public ColumnDefinitionRepresentation optionType(String optionType) {
    this.optionType = optionType;
    return this;
  }

  /**
   * Get optionType
   * @return optionType
   **/
  @ApiModelProperty(value = "")
  
    public String getOptionType() {
    return optionType;
  }

  public void setOptionType(String optionType) {
    this.optionType = optionType;
  }

  public ColumnDefinitionRepresentation options(List<OptionRepresentation> options) {
    this.options = options;
    return this;
  }

  public ColumnDefinitionRepresentation addOptionsItem(OptionRepresentation optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<OptionRepresentation> getOptions() {
    return options;
  }

  public void setOptions(List<OptionRepresentation> options) {
    this.options = options;
  }

  public ColumnDefinitionRepresentation requestHeaders(List<RequestHeaderRepresentation> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public ColumnDefinitionRepresentation addRequestHeadersItem(RequestHeaderRepresentation requestHeadersItem) {
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
    public List<RequestHeaderRepresentation> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(List<RequestHeaderRepresentation> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public ColumnDefinitionRepresentation required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Get required
   * @return required
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public ColumnDefinitionRepresentation restIdProperty(String restIdProperty) {
    this.restIdProperty = restIdProperty;
    return this;
  }

  /**
   * Get restIdProperty
   * @return restIdProperty
   **/
  @ApiModelProperty(value = "")
  
    public String getRestIdProperty() {
    return restIdProperty;
  }

  public void setRestIdProperty(String restIdProperty) {
    this.restIdProperty = restIdProperty;
  }

  public ColumnDefinitionRepresentation restLabelProperty(String restLabelProperty) {
    this.restLabelProperty = restLabelProperty;
    return this;
  }

  /**
   * Get restLabelProperty
   * @return restLabelProperty
   **/
  @ApiModelProperty(value = "")
  
    public String getRestLabelProperty() {
    return restLabelProperty;
  }

  public void setRestLabelProperty(String restLabelProperty) {
    this.restLabelProperty = restLabelProperty;
  }

  public ColumnDefinitionRepresentation restResponsePath(String restResponsePath) {
    this.restResponsePath = restResponsePath;
    return this;
  }

  /**
   * Get restResponsePath
   * @return restResponsePath
   **/
  @ApiModelProperty(value = "")
  
    public String getRestResponsePath() {
    return restResponsePath;
  }

  public void setRestResponsePath(String restResponsePath) {
    this.restResponsePath = restResponsePath;
  }

  public ColumnDefinitionRepresentation restUrl(String restUrl) {
    this.restUrl = restUrl;
    return this;
  }

  /**
   * Get restUrl
   * @return restUrl
   **/
  @ApiModelProperty(value = "")
  
    public String getRestUrl() {
    return restUrl;
  }

  public void setRestUrl(String restUrl) {
    this.restUrl = restUrl;
  }

  public ColumnDefinitionRepresentation sortable(Boolean sortable) {
    this.sortable = sortable;
    return this;
  }

  /**
   * Get sortable
   * @return sortable
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isSortable() {
    return sortable;
  }

  public void setSortable(Boolean sortable) {
    this.sortable = sortable;
  }

  public ColumnDefinitionRepresentation type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @ApiModelProperty(value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ColumnDefinitionRepresentation value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @ApiModelProperty(value = "")
  
    public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public ColumnDefinitionRepresentation visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Get visible
   * @return visible
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnDefinitionRepresentation columnDefinitionRepresentation = (ColumnDefinitionRepresentation) o;
    return Objects.equals(this.amountCurrency, columnDefinitionRepresentation.amountCurrency) &&
        Objects.equals(this.amountEnableFractions, columnDefinitionRepresentation.amountEnableFractions) &&
        Objects.equals(this.editable, columnDefinitionRepresentation.editable) &&
        Objects.equals(this.endpoint, columnDefinitionRepresentation.endpoint) &&
        Objects.equals(this.id, columnDefinitionRepresentation.id) &&
        Objects.equals(this.name, columnDefinitionRepresentation.name) &&
        Objects.equals(this.optionType, columnDefinitionRepresentation.optionType) &&
        Objects.equals(this.options, columnDefinitionRepresentation.options) &&
        Objects.equals(this.requestHeaders, columnDefinitionRepresentation.requestHeaders) &&
        Objects.equals(this.required, columnDefinitionRepresentation.required) &&
        Objects.equals(this.restIdProperty, columnDefinitionRepresentation.restIdProperty) &&
        Objects.equals(this.restLabelProperty, columnDefinitionRepresentation.restLabelProperty) &&
        Objects.equals(this.restResponsePath, columnDefinitionRepresentation.restResponsePath) &&
        Objects.equals(this.restUrl, columnDefinitionRepresentation.restUrl) &&
        Objects.equals(this.sortable, columnDefinitionRepresentation.sortable) &&
        Objects.equals(this.type, columnDefinitionRepresentation.type) &&
        Objects.equals(this.value, columnDefinitionRepresentation.value) &&
        Objects.equals(this.visible, columnDefinitionRepresentation.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountCurrency, amountEnableFractions, editable, endpoint, id, name, optionType, options, requestHeaders, required, restIdProperty, restLabelProperty, restResponsePath, restUrl, sortable, type, value, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnDefinitionRepresentation {\n");
    
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    amountEnableFractions: ").append(toIndentedString(amountEnableFractions)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    restIdProperty: ").append(toIndentedString(restIdProperty)).append("\n");
    sb.append("    restLabelProperty: ").append(toIndentedString(restLabelProperty)).append("\n");
    sb.append("    restResponsePath: ").append(toIndentedString(restResponsePath)).append("\n");
    sb.append("    restUrl: ").append(toIndentedString(restUrl)).append("\n");
    sb.append("    sortable: ").append(toIndentedString(sortable)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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
