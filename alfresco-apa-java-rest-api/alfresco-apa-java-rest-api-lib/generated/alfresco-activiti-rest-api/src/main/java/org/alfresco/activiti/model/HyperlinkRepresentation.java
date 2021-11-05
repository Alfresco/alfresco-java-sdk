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
import java.util.List;
import org.alfresco.activiti.model.ConditionRepresentation;
import org.alfresco.activiti.model.FormFieldRepresentation;
import org.alfresco.activiti.model.LayoutRepresentation;
import org.alfresco.activiti.model.OptionRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HyperlinkRepresentation
 */
@Validated


public class HyperlinkRepresentation extends FormFieldRepresentation  {
  @JsonProperty("className")
  private String hyperlinkRepresentationClassName = null;

  @JsonProperty("col")
  private Integer hyperlinkRepresentationCol = null;

  @JsonProperty("colspan")
  private Integer hyperlinkRepresentationColspan = null;

  @JsonProperty("dateDisplayFormat")
  private String hyperlinkRepresentationDateDisplayFormat = null;

  @JsonProperty("displayText")
  private String displayText = null;

  @JsonProperty("hasEmptyValue")
  private Boolean hasEmptyValue = null;

  @JsonProperty("hyperlinkUrl")
  private String hyperlinkUrl = null;

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

  public HyperlinkRepresentation hyperlinkRepresentationClassName(String hyperlinkRepresentationClassName) {
    this.hyperlinkRepresentationClassName = hyperlinkRepresentationClassName;
    return this;
  }

  /**
   * Get hyperlinkRepresentationClassName
   * @return hyperlinkRepresentationClassName
   **/
  @ApiModelProperty(value = "")
  
    public String getHyperlinkRepresentationClassName() {
    return hyperlinkRepresentationClassName;
  }

  public void setHyperlinkRepresentationClassName(String hyperlinkRepresentationClassName) {
    this.hyperlinkRepresentationClassName = hyperlinkRepresentationClassName;
  }

  public HyperlinkRepresentation hyperlinkRepresentationCol(Integer hyperlinkRepresentationCol) {
    this.hyperlinkRepresentationCol = hyperlinkRepresentationCol;
    return this;
  }

  /**
   * Get hyperlinkRepresentationCol
   * @return hyperlinkRepresentationCol
   **/
  @ApiModelProperty(value = "")
  
    public Integer getHyperlinkRepresentationCol() {
    return hyperlinkRepresentationCol;
  }

  public void setHyperlinkRepresentationCol(Integer hyperlinkRepresentationCol) {
    this.hyperlinkRepresentationCol = hyperlinkRepresentationCol;
  }

  public HyperlinkRepresentation hyperlinkRepresentationColspan(Integer hyperlinkRepresentationColspan) {
    this.hyperlinkRepresentationColspan = hyperlinkRepresentationColspan;
    return this;
  }

  /**
   * Get hyperlinkRepresentationColspan
   * @return hyperlinkRepresentationColspan
   **/
  @ApiModelProperty(value = "")
  
    public Integer getHyperlinkRepresentationColspan() {
    return hyperlinkRepresentationColspan;
  }

  public void setHyperlinkRepresentationColspan(Integer hyperlinkRepresentationColspan) {
    this.hyperlinkRepresentationColspan = hyperlinkRepresentationColspan;
  }

  public HyperlinkRepresentation hyperlinkRepresentationDateDisplayFormat(String hyperlinkRepresentationDateDisplayFormat) {
    this.hyperlinkRepresentationDateDisplayFormat = hyperlinkRepresentationDateDisplayFormat;
    return this;
  }

  /**
   * Get hyperlinkRepresentationDateDisplayFormat
   * @return hyperlinkRepresentationDateDisplayFormat
   **/
  @ApiModelProperty(value = "")
  
    public String getHyperlinkRepresentationDateDisplayFormat() {
    return hyperlinkRepresentationDateDisplayFormat;
  }

  public void setHyperlinkRepresentationDateDisplayFormat(String hyperlinkRepresentationDateDisplayFormat) {
    this.hyperlinkRepresentationDateDisplayFormat = hyperlinkRepresentationDateDisplayFormat;
  }

  public HyperlinkRepresentation displayText(String displayText) {
    this.displayText = displayText;
    return this;
  }

  /**
   * Get displayText
   * @return displayText
   **/
  @ApiModelProperty(value = "")
  
    public String getDisplayText() {
    return displayText;
  }

  public void setDisplayText(String displayText) {
    this.displayText = displayText;
  }

  public HyperlinkRepresentation hasEmptyValue(Boolean hasEmptyValue) {
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

  public HyperlinkRepresentation hyperlinkUrl(String hyperlinkUrl) {
    this.hyperlinkUrl = hyperlinkUrl;
    return this;
  }

  /**
   * Get hyperlinkUrl
   * @return hyperlinkUrl
   **/
  @ApiModelProperty(value = "")
  
    public String getHyperlinkUrl() {
    return hyperlinkUrl;
  }

  public void setHyperlinkUrl(String hyperlinkUrl) {
    this.hyperlinkUrl = hyperlinkUrl;
  }

  public HyperlinkRepresentation id(String id) {
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

  public HyperlinkRepresentation layout(LayoutRepresentation layout) {
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

  public HyperlinkRepresentation maxLength(Integer maxLength) {
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

  public HyperlinkRepresentation maxValue(String maxValue) {
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

  public HyperlinkRepresentation minLength(Integer minLength) {
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

  public HyperlinkRepresentation minValue(String minValue) {
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

  public HyperlinkRepresentation name(String name) {
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

  public HyperlinkRepresentation optionType(String optionType) {
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

  public HyperlinkRepresentation options(List<OptionRepresentation> options) {
    this.options = options;
    return this;
  }

  public HyperlinkRepresentation addOptionsItem(OptionRepresentation optionsItem) {
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

  public HyperlinkRepresentation overrideId(Boolean overrideId) {
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

  public HyperlinkRepresentation params(Object params) {
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

  public HyperlinkRepresentation placeholder(String placeholder) {
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

  public HyperlinkRepresentation readOnly(Boolean readOnly) {
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

  public HyperlinkRepresentation regexPattern(String regexPattern) {
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

  public HyperlinkRepresentation required(Boolean required) {
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

  public HyperlinkRepresentation restIdProperty(String restIdProperty) {
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

  public HyperlinkRepresentation restLabelProperty(String restLabelProperty) {
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

  public HyperlinkRepresentation restResponsePath(String restResponsePath) {
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

  public HyperlinkRepresentation restUrl(String restUrl) {
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

  public HyperlinkRepresentation row(Integer row) {
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

  public HyperlinkRepresentation sizeX(Integer sizeX) {
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

  public HyperlinkRepresentation sizeY(Integer sizeY) {
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

  public HyperlinkRepresentation tab(String tab) {
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

  public HyperlinkRepresentation type(String type) {
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

  public HyperlinkRepresentation value(Object value) {
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

  public HyperlinkRepresentation visibilityCondition(ConditionRepresentation visibilityCondition) {
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
    HyperlinkRepresentation hyperlinkRepresentation = (HyperlinkRepresentation) o;
    return Objects.equals(this.hyperlinkRepresentationClassName, hyperlinkRepresentation.hyperlinkRepresentationClassName) &&
        Objects.equals(this.hyperlinkRepresentationCol, hyperlinkRepresentation.hyperlinkRepresentationCol) &&
        Objects.equals(this.hyperlinkRepresentationColspan, hyperlinkRepresentation.hyperlinkRepresentationColspan) &&
        Objects.equals(this.hyperlinkRepresentationDateDisplayFormat, hyperlinkRepresentation.hyperlinkRepresentationDateDisplayFormat) &&
        Objects.equals(this.displayText, hyperlinkRepresentation.displayText) &&
        Objects.equals(this.hasEmptyValue, hyperlinkRepresentation.hasEmptyValue) &&
        Objects.equals(this.hyperlinkUrl, hyperlinkRepresentation.hyperlinkUrl) &&
        Objects.equals(this.id, hyperlinkRepresentation.id) &&
        Objects.equals(this.layout, hyperlinkRepresentation.layout) &&
        Objects.equals(this.maxLength, hyperlinkRepresentation.maxLength) &&
        Objects.equals(this.maxValue, hyperlinkRepresentation.maxValue) &&
        Objects.equals(this.minLength, hyperlinkRepresentation.minLength) &&
        Objects.equals(this.minValue, hyperlinkRepresentation.minValue) &&
        Objects.equals(this.name, hyperlinkRepresentation.name) &&
        Objects.equals(this.optionType, hyperlinkRepresentation.optionType) &&
        Objects.equals(this.options, hyperlinkRepresentation.options) &&
        Objects.equals(this.overrideId, hyperlinkRepresentation.overrideId) &&
        Objects.equals(this.params, hyperlinkRepresentation.params) &&
        Objects.equals(this.placeholder, hyperlinkRepresentation.placeholder) &&
        Objects.equals(this.readOnly, hyperlinkRepresentation.readOnly) &&
        Objects.equals(this.regexPattern, hyperlinkRepresentation.regexPattern) &&
        Objects.equals(this.required, hyperlinkRepresentation.required) &&
        Objects.equals(this.restIdProperty, hyperlinkRepresentation.restIdProperty) &&
        Objects.equals(this.restLabelProperty, hyperlinkRepresentation.restLabelProperty) &&
        Objects.equals(this.restResponsePath, hyperlinkRepresentation.restResponsePath) &&
        Objects.equals(this.restUrl, hyperlinkRepresentation.restUrl) &&
        Objects.equals(this.row, hyperlinkRepresentation.row) &&
        Objects.equals(this.sizeX, hyperlinkRepresentation.sizeX) &&
        Objects.equals(this.sizeY, hyperlinkRepresentation.sizeY) &&
        Objects.equals(this.tab, hyperlinkRepresentation.tab) &&
        Objects.equals(this.type, hyperlinkRepresentation.type) &&
        Objects.equals(this.value, hyperlinkRepresentation.value) &&
        Objects.equals(this.visibilityCondition, hyperlinkRepresentation.visibilityCondition) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hyperlinkRepresentationClassName, hyperlinkRepresentationCol, hyperlinkRepresentationColspan, hyperlinkRepresentationDateDisplayFormat, displayText, hasEmptyValue, hyperlinkUrl, id, layout, maxLength, maxValue, minLength, minValue, name, optionType, options, overrideId, params, placeholder, readOnly, regexPattern, required, restIdProperty, restLabelProperty, restResponsePath, restUrl, row, sizeX, sizeY, tab, type, value, visibilityCondition, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HyperlinkRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hyperlinkRepresentationClassName: ").append(toIndentedString(hyperlinkRepresentationClassName)).append("\n");
    sb.append("    hyperlinkRepresentationCol: ").append(toIndentedString(hyperlinkRepresentationCol)).append("\n");
    sb.append("    hyperlinkRepresentationColspan: ").append(toIndentedString(hyperlinkRepresentationColspan)).append("\n");
    sb.append("    hyperlinkRepresentationDateDisplayFormat: ").append(toIndentedString(hyperlinkRepresentationDateDisplayFormat)).append("\n");
    sb.append("    displayText: ").append(toIndentedString(displayText)).append("\n");
    sb.append("    hasEmptyValue: ").append(toIndentedString(hasEmptyValue)).append("\n");
    sb.append("    hyperlinkUrl: ").append(toIndentedString(hyperlinkUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
