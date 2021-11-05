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
package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.alfresco.activiti.model.ConditionRepresentation;
import org.alfresco.activiti.model.FormFieldRepresentation;
import org.alfresco.activiti.model.LayoutRepresentation;
import org.alfresco.activiti.model.OptionRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContainerRepresentation
 */
@Validated


public class ContainerRepresentation extends FormFieldRepresentation  {
  @JsonProperty("className")
  private String containerRepresentationClassName = null;

  @JsonProperty("col")
  private Integer containerRepresentationCol = null;

  @JsonProperty("colspan")
  private Integer containerRepresentationColspan = null;

  @JsonProperty("dateDisplayFormat")
  private String containerRepresentationDateDisplayFormat = null;

  @JsonProperty("fields")
  @Valid
  private Map<String, List<FormFieldRepresentation>> fields = null;

  @JsonProperty("hasEmptyValue")
  private Boolean hasEmptyValue = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("layout")
  private LayoutRepresentation layout = null;

  @JsonProperty("maxLength")
  private Integer maxLength = null;

  @JsonProperty("maxValue")
  private String maxValue = null;

  @JsonProperty("minLength")
  private Integer minLength = null;

  @JsonProperty("minValue")
  private String minValue = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("numberOfColumns")
  private Integer numberOfColumns = null;

  @JsonProperty("optionType")
  private String optionType = null;

  @JsonProperty("options")
  @Valid
  private List<OptionRepresentation> options = null;

  @JsonProperty("overrideId")
  private Boolean overrideId = null;

  @JsonProperty("params")
  private Object params = null;

  @JsonProperty("placeholder")
  private String placeholder = null;

  @JsonProperty("readOnly")
  private Boolean readOnly = null;

  @JsonProperty("regexPattern")
  private String regexPattern = null;

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

  @JsonProperty("row")
  private Integer row = null;

  @JsonProperty("sizeX")
  private Integer sizeX = null;

  @JsonProperty("sizeY")
  private Integer sizeY = null;

  @JsonProperty("tab")
  private String tab = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private Object value = null;

  @JsonProperty("visibilityCondition")
  private ConditionRepresentation visibilityCondition = null;

  public ContainerRepresentation containerRepresentationClassName(String containerRepresentationClassName) {
    this.containerRepresentationClassName = containerRepresentationClassName;
    return this;
  }

  /**
   * Get containerRepresentationClassName
   * @return containerRepresentationClassName
   **/
  @ApiModelProperty(value = "")
  
    public String getContainerRepresentationClassName() {
    return containerRepresentationClassName;
  }

  public void setContainerRepresentationClassName(String containerRepresentationClassName) {
    this.containerRepresentationClassName = containerRepresentationClassName;
  }

  public ContainerRepresentation containerRepresentationCol(Integer containerRepresentationCol) {
    this.containerRepresentationCol = containerRepresentationCol;
    return this;
  }

  /**
   * Get containerRepresentationCol
   * @return containerRepresentationCol
   **/
  @ApiModelProperty(value = "")
  
    public Integer getContainerRepresentationCol() {
    return containerRepresentationCol;
  }

  public void setContainerRepresentationCol(Integer containerRepresentationCol) {
    this.containerRepresentationCol = containerRepresentationCol;
  }

  public ContainerRepresentation containerRepresentationColspan(Integer containerRepresentationColspan) {
    this.containerRepresentationColspan = containerRepresentationColspan;
    return this;
  }

  /**
   * Get containerRepresentationColspan
   * @return containerRepresentationColspan
   **/
  @ApiModelProperty(value = "")
  
    public Integer getContainerRepresentationColspan() {
    return containerRepresentationColspan;
  }

  public void setContainerRepresentationColspan(Integer containerRepresentationColspan) {
    this.containerRepresentationColspan = containerRepresentationColspan;
  }

  public ContainerRepresentation containerRepresentationDateDisplayFormat(String containerRepresentationDateDisplayFormat) {
    this.containerRepresentationDateDisplayFormat = containerRepresentationDateDisplayFormat;
    return this;
  }

  /**
   * Get containerRepresentationDateDisplayFormat
   * @return containerRepresentationDateDisplayFormat
   **/
  @ApiModelProperty(value = "")
  
    public String getContainerRepresentationDateDisplayFormat() {
    return containerRepresentationDateDisplayFormat;
  }

  public void setContainerRepresentationDateDisplayFormat(String containerRepresentationDateDisplayFormat) {
    this.containerRepresentationDateDisplayFormat = containerRepresentationDateDisplayFormat;
  }

  public ContainerRepresentation fields(Map<String, List<FormFieldRepresentation>> fields) {
    this.fields = fields;
    return this;
  }

  public ContainerRepresentation putFieldsItem(String key, List<FormFieldRepresentation> fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
   **/
  @ApiModelProperty(value = "")
      @Valid
    public Map<String, List<FormFieldRepresentation>> getFields() {
    return fields;
  }

  public void setFields(Map<String, List<FormFieldRepresentation>> fields) {
    this.fields = fields;
  }

  public ContainerRepresentation hasEmptyValue(Boolean hasEmptyValue) {
    this.hasEmptyValue = hasEmptyValue;
    return this;
  }

  /**
   * Get hasEmptyValue
   * @return hasEmptyValue
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isHasEmptyValue() {
    return hasEmptyValue;
  }

  public void setHasEmptyValue(Boolean hasEmptyValue) {
    this.hasEmptyValue = hasEmptyValue;
  }

  public ContainerRepresentation id(String id) {
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

  public ContainerRepresentation layout(LayoutRepresentation layout) {
    this.layout = layout;
    return this;
  }

  /**
   * Get layout
   * @return layout
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LayoutRepresentation getLayout() {
    return layout;
  }

  public void setLayout(LayoutRepresentation layout) {
    this.layout = layout;
  }

  public ContainerRepresentation maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * Get maxLength
   * @return maxLength
   **/
  @ApiModelProperty(value = "")
  
    public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public ContainerRepresentation maxValue(String maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Get maxValue
   * @return maxValue
   **/
  @ApiModelProperty(value = "")
  
    public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }

  public ContainerRepresentation minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * Get minLength
   * @return minLength
   **/
  @ApiModelProperty(value = "")
  
    public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public ContainerRepresentation minValue(String minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Get minValue
   * @return minValue
   **/
  @ApiModelProperty(value = "")
  
    public String getMinValue() {
    return minValue;
  }

  public void setMinValue(String minValue) {
    this.minValue = minValue;
  }

  public ContainerRepresentation name(String name) {
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

  public ContainerRepresentation numberOfColumns(Integer numberOfColumns) {
    this.numberOfColumns = numberOfColumns;
    return this;
  }

  /**
   * Get numberOfColumns
   * @return numberOfColumns
   **/
  @ApiModelProperty(value = "")
  
    public Integer getNumberOfColumns() {
    return numberOfColumns;
  }

  public void setNumberOfColumns(Integer numberOfColumns) {
    this.numberOfColumns = numberOfColumns;
  }

  public ContainerRepresentation optionType(String optionType) {
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

  public ContainerRepresentation options(List<OptionRepresentation> options) {
    this.options = options;
    return this;
  }

  public ContainerRepresentation addOptionsItem(OptionRepresentation optionsItem) {
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

  public ContainerRepresentation overrideId(Boolean overrideId) {
    this.overrideId = overrideId;
    return this;
  }

  /**
   * Get overrideId
   * @return overrideId
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isOverrideId() {
    return overrideId;
  }

  public void setOverrideId(Boolean overrideId) {
    this.overrideId = overrideId;
  }

  public ContainerRepresentation params(Object params) {
    this.params = params;
    return this;
  }

  /**
   * Get params
   * @return params
   **/
  @ApiModelProperty(value = "")
  
    public Object getParams() {
    return params;
  }

  public void setParams(Object params) {
    this.params = params;
  }

  public ContainerRepresentation placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * Get placeholder
   * @return placeholder
   **/
  @ApiModelProperty(value = "")
  
    public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public ContainerRepresentation readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Get readOnly
   * @return readOnly
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public ContainerRepresentation regexPattern(String regexPattern) {
    this.regexPattern = regexPattern;
    return this;
  }

  /**
   * Get regexPattern
   * @return regexPattern
   **/
  @ApiModelProperty(value = "")
  
    public String getRegexPattern() {
    return regexPattern;
  }

  public void setRegexPattern(String regexPattern) {
    this.regexPattern = regexPattern;
  }

  public ContainerRepresentation required(Boolean required) {
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

  public ContainerRepresentation restIdProperty(String restIdProperty) {
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

  public ContainerRepresentation restLabelProperty(String restLabelProperty) {
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

  public ContainerRepresentation restResponsePath(String restResponsePath) {
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

  public ContainerRepresentation restUrl(String restUrl) {
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

  public ContainerRepresentation row(Integer row) {
    this.row = row;
    return this;
  }

  /**
   * Get row
   * @return row
   **/
  @ApiModelProperty(value = "")
  
    public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public ContainerRepresentation sizeX(Integer sizeX) {
    this.sizeX = sizeX;
    return this;
  }

  /**
   * Get sizeX
   * @return sizeX
   **/
  @ApiModelProperty(value = "")
  
    public Integer getSizeX() {
    return sizeX;
  }

  public void setSizeX(Integer sizeX) {
    this.sizeX = sizeX;
  }

  public ContainerRepresentation sizeY(Integer sizeY) {
    this.sizeY = sizeY;
    return this;
  }

  /**
   * Get sizeY
   * @return sizeY
   **/
  @ApiModelProperty(value = "")
  
    public Integer getSizeY() {
    return sizeY;
  }

  public void setSizeY(Integer sizeY) {
    this.sizeY = sizeY;
  }

  public ContainerRepresentation tab(String tab) {
    this.tab = tab;
    return this;
  }

  /**
   * Get tab
   * @return tab
   **/
  @ApiModelProperty(value = "")
  
    public String getTab() {
    return tab;
  }

  public void setTab(String tab) {
    this.tab = tab;
  }

  public ContainerRepresentation type(String type) {
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

  public ContainerRepresentation value(Object value) {
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

  public ContainerRepresentation visibilityCondition(ConditionRepresentation visibilityCondition) {
    this.visibilityCondition = visibilityCondition;
    return this;
  }

  /**
   * Get visibilityCondition
   * @return visibilityCondition
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConditionRepresentation getVisibilityCondition() {
    return visibilityCondition;
  }

  public void setVisibilityCondition(ConditionRepresentation visibilityCondition) {
    this.visibilityCondition = visibilityCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerRepresentation containerRepresentation = (ContainerRepresentation) o;
    return Objects.equals(this.containerRepresentationClassName, containerRepresentation.containerRepresentationClassName) &&
        Objects.equals(this.containerRepresentationCol, containerRepresentation.containerRepresentationCol) &&
        Objects.equals(this.containerRepresentationColspan, containerRepresentation.containerRepresentationColspan) &&
        Objects.equals(this.containerRepresentationDateDisplayFormat, containerRepresentation.containerRepresentationDateDisplayFormat) &&
        Objects.equals(this.fields, containerRepresentation.fields) &&
        Objects.equals(this.hasEmptyValue, containerRepresentation.hasEmptyValue) &&
        Objects.equals(this.id, containerRepresentation.id) &&
        Objects.equals(this.layout, containerRepresentation.layout) &&
        Objects.equals(this.maxLength, containerRepresentation.maxLength) &&
        Objects.equals(this.maxValue, containerRepresentation.maxValue) &&
        Objects.equals(this.minLength, containerRepresentation.minLength) &&
        Objects.equals(this.minValue, containerRepresentation.minValue) &&
        Objects.equals(this.name, containerRepresentation.name) &&
        Objects.equals(this.numberOfColumns, containerRepresentation.numberOfColumns) &&
        Objects.equals(this.optionType, containerRepresentation.optionType) &&
        Objects.equals(this.options, containerRepresentation.options) &&
        Objects.equals(this.overrideId, containerRepresentation.overrideId) &&
        Objects.equals(this.params, containerRepresentation.params) &&
        Objects.equals(this.placeholder, containerRepresentation.placeholder) &&
        Objects.equals(this.readOnly, containerRepresentation.readOnly) &&
        Objects.equals(this.regexPattern, containerRepresentation.regexPattern) &&
        Objects.equals(this.required, containerRepresentation.required) &&
        Objects.equals(this.restIdProperty, containerRepresentation.restIdProperty) &&
        Objects.equals(this.restLabelProperty, containerRepresentation.restLabelProperty) &&
        Objects.equals(this.restResponsePath, containerRepresentation.restResponsePath) &&
        Objects.equals(this.restUrl, containerRepresentation.restUrl) &&
        Objects.equals(this.row, containerRepresentation.row) &&
        Objects.equals(this.sizeX, containerRepresentation.sizeX) &&
        Objects.equals(this.sizeY, containerRepresentation.sizeY) &&
        Objects.equals(this.tab, containerRepresentation.tab) &&
        Objects.equals(this.type, containerRepresentation.type) &&
        Objects.equals(this.value, containerRepresentation.value) &&
        Objects.equals(this.visibilityCondition, containerRepresentation.visibilityCondition) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerRepresentationClassName, containerRepresentationCol, containerRepresentationColspan, containerRepresentationDateDisplayFormat, fields, hasEmptyValue, id, layout, maxLength, maxValue, minLength, minValue, name, numberOfColumns, optionType, options, overrideId, params, placeholder, readOnly, regexPattern, required, restIdProperty, restLabelProperty, restResponsePath, restUrl, row, sizeX, sizeY, tab, type, value, visibilityCondition, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    containerRepresentationClassName: ").append(toIndentedString(containerRepresentationClassName)).append("\n");
    sb.append("    containerRepresentationCol: ").append(toIndentedString(containerRepresentationCol)).append("\n");
    sb.append("    containerRepresentationColspan: ").append(toIndentedString(containerRepresentationColspan)).append("\n");
    sb.append("    containerRepresentationDateDisplayFormat: ").append(toIndentedString(containerRepresentationDateDisplayFormat)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    hasEmptyValue: ").append(toIndentedString(hasEmptyValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfColumns: ").append(toIndentedString(numberOfColumns)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    overrideId: ").append(toIndentedString(overrideId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    regexPattern: ").append(toIndentedString(regexPattern)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    restIdProperty: ").append(toIndentedString(restIdProperty)).append("\n");
    sb.append("    restLabelProperty: ").append(toIndentedString(restLabelProperty)).append("\n");
    sb.append("    restResponsePath: ").append(toIndentedString(restResponsePath)).append("\n");
    sb.append("    restUrl: ").append(toIndentedString(restUrl)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    sizeX: ").append(toIndentedString(sizeX)).append("\n");
    sb.append("    sizeY: ").append(toIndentedString(sizeY)).append("\n");
    sb.append("    tab: ").append(toIndentedString(tab)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    visibilityCondition: ").append(toIndentedString(visibilityCondition)).append("\n");
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
