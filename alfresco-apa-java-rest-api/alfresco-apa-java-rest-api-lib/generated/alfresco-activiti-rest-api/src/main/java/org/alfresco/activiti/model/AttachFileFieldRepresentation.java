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
import org.alfresco.activiti.model.MetaPropertyRepresentation;
import org.alfresco.activiti.model.OptionRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AttachFileFieldRepresentation
 */
@Validated


public class AttachFileFieldRepresentation extends FormFieldRepresentation  {
  @JsonProperty("className")
  private String attachFileFieldRepresentationClassName = null;

  @JsonProperty("col")
  private Integer attachFileFieldRepresentationCol = null;

  @JsonProperty("colspan")
  private Integer attachFileFieldRepresentationColspan = null;

  @JsonProperty("dateDisplayFormat")
  private String attachFileFieldRepresentationDateDisplayFormat = null;

  @JsonProperty("hasEmptyValue")
  private Boolean attachFileFieldRepresentationHasEmptyValue = null;

  @JsonProperty("id")
  private String attachFileFieldRepresentationId = null;

  @JsonProperty("layout")
  private LayoutRepresentation attachFileFieldRepresentationLayout = null;

  @JsonProperty("maxLength")
  private Integer attachFileFieldRepresentationMaxLength = null;

  @JsonProperty("maxValue")
  private String attachFileFieldRepresentationMaxValue = null;

  @JsonProperty("metaDataColumnDefinitions")
  @Valid
  private List<MetaPropertyRepresentation> metaDataColumnDefinitions = null;

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

  public AttachFileFieldRepresentation attachFileFieldRepresentationClassName(String attachFileFieldRepresentationClassName) {
    this.attachFileFieldRepresentationClassName = attachFileFieldRepresentationClassName;
    return this;
  }

  /**
   * Get attachFileFieldRepresentationClassName
   * @return attachFileFieldRepresentationClassName
   **/
  @ApiModelProperty(value = "")
  
    public String getAttachFileFieldRepresentationClassName() {
    return attachFileFieldRepresentationClassName;
  }

  public void setAttachFileFieldRepresentationClassName(String attachFileFieldRepresentationClassName) {
    this.attachFileFieldRepresentationClassName = attachFileFieldRepresentationClassName;
  }

  public AttachFileFieldRepresentation attachFileFieldRepresentationCol(Integer attachFileFieldRepresentationCol) {
    this.attachFileFieldRepresentationCol = attachFileFieldRepresentationCol;
    return this;
  }

  /**
   * Get attachFileFieldRepresentationCol
   * @return attachFileFieldRepresentationCol
   **/
  @ApiModelProperty(value = "")
  
    public Integer getAttachFileFieldRepresentationCol() {
    return attachFileFieldRepresentationCol;
  }

  public void setAttachFileFieldRepresentationCol(Integer attachFileFieldRepresentationCol) {
    this.attachFileFieldRepresentationCol = attachFileFieldRepresentationCol;
  }

  public AttachFileFieldRepresentation attachFileFieldRepresentationColspan(Integer attachFileFieldRepresentationColspan) {
    this.attachFileFieldRepresentationColspan = attachFileFieldRepresentationColspan;
    return this;
  }

  /**
   * Get attachFileFieldRepresentationColspan
   * @return attachFileFieldRepresentationColspan
   **/
  @ApiModelProperty(value = "")
  
    public Integer getAttachFileFieldRepresentationColspan() {
    return attachFileFieldRepresentationColspan;
  }

  public void setAttachFileFieldRepresentationColspan(Integer attachFileFieldRepresentationColspan) {
    this.attachFileFieldRepresentationColspan = attachFileFieldRepresentationColspan;
  }

  public AttachFileFieldRepresentation attachFileFieldRepresentationDateDisplayFormat(String attachFileFieldRepresentationDateDisplayFormat) {
    this.attachFileFieldRepresentationDateDisplayFormat = attachFileFieldRepresentationDateDisplayFormat;
    return this;
  }

  /**
   * Get attachFileFieldRepresentationDateDisplayFormat
   * @return attachFileFieldRepresentationDateDisplayFormat
   **/
  @ApiModelProperty(value = "")
  
    public String getAttachFileFieldRepresentationDateDisplayFormat() {
    return attachFileFieldRepresentationDateDisplayFormat;
  }

  public void setAttachFileFieldRepresentationDateDisplayFormat(String attachFileFieldRepresentationDateDisplayFormat) {
    this.attachFileFieldRepresentationDateDisplayFormat = attachFileFieldRepresentationDateDisplayFormat;
  }

  public AttachFileFieldRepresentation attachFileFieldRepresentationHasEmptyValue(Boolean attachFileFieldRepresentationHasEmptyValue) {
    this.attachFileFieldRepresentationHasEmptyValue = attachFileFieldRepresentationHasEmptyValue;
    return this;
  }

  /**
   * Get attachFileFieldRepresentationHasEmptyValue
   * @return attachFileFieldRepresentationHasEmptyValue
   **/
  @ApiModelProperty(value = "")
  
    public Boolean getAttachFileFieldRepresentationHasEmptyValue() {
    return attachFileFieldRepresentationHasEmptyValue;
  }

  public void setAttachFileFieldRepresentationHasEmptyValue(Boolean attachFileFieldRepresentationHasEmptyValue) {
    this.attachFileFieldRepresentationHasEmptyValue = attachFileFieldRepresentationHasEmptyValue;
  }

  public AttachFileFieldRepresentation attachFileFieldRepresentationId(String attachFileFieldRepresentationId) {
    this.attachFileFieldRepresentationId = attachFileFieldRepresentationId;
    return this;
  }

  /**
   * Get attachFileFieldRepresentationId
   * @return attachFileFieldRepresentationId
   **/
  @ApiModelProperty(value = "")
  
    public String getAttachFileFieldRepresentationId() {
    return attachFileFieldRepresentationId;
  }

  public void setAttachFileFieldRepresentationId(String attachFileFieldRepresentationId) {
    this.attachFileFieldRepresentationId = attachFileFieldRepresentationId;
  }

  public AttachFileFieldRepresentation attachFileFieldRepresentationLayout(LayoutRepresentation attachFileFieldRepresentationLayout) {
    this.attachFileFieldRepresentationLayout = attachFileFieldRepresentationLayout;
    return this;
  }

  /**
   * Get attachFileFieldRepresentationLayout
   * @return attachFileFieldRepresentationLayout
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LayoutRepresentation getAttachFileFieldRepresentationLayout() {
    return attachFileFieldRepresentationLayout;
  }

  public void setAttachFileFieldRepresentationLayout(LayoutRepresentation attachFileFieldRepresentationLayout) {
    this.attachFileFieldRepresentationLayout = attachFileFieldRepresentationLayout;
  }

  public AttachFileFieldRepresentation attachFileFieldRepresentationMaxLength(Integer attachFileFieldRepresentationMaxLength) {
    this.attachFileFieldRepresentationMaxLength = attachFileFieldRepresentationMaxLength;
    return this;
  }

  /**
   * Get attachFileFieldRepresentationMaxLength
   * @return attachFileFieldRepresentationMaxLength
   **/
  @ApiModelProperty(value = "")
  
    public Integer getAttachFileFieldRepresentationMaxLength() {
    return attachFileFieldRepresentationMaxLength;
  }

  public void setAttachFileFieldRepresentationMaxLength(Integer attachFileFieldRepresentationMaxLength) {
    this.attachFileFieldRepresentationMaxLength = attachFileFieldRepresentationMaxLength;
  }

  public AttachFileFieldRepresentation attachFileFieldRepresentationMaxValue(String attachFileFieldRepresentationMaxValue) {
    this.attachFileFieldRepresentationMaxValue = attachFileFieldRepresentationMaxValue;
    return this;
  }

  /**
   * Get attachFileFieldRepresentationMaxValue
   * @return attachFileFieldRepresentationMaxValue
   **/
  @ApiModelProperty(value = "")
  
    public String getAttachFileFieldRepresentationMaxValue() {
    return attachFileFieldRepresentationMaxValue;
  }

  public void setAttachFileFieldRepresentationMaxValue(String attachFileFieldRepresentationMaxValue) {
    this.attachFileFieldRepresentationMaxValue = attachFileFieldRepresentationMaxValue;
  }

  public AttachFileFieldRepresentation metaDataColumnDefinitions(List<MetaPropertyRepresentation> metaDataColumnDefinitions) {
    this.metaDataColumnDefinitions = metaDataColumnDefinitions;
    return this;
  }

  public AttachFileFieldRepresentation addMetaDataColumnDefinitionsItem(MetaPropertyRepresentation metaDataColumnDefinitionsItem) {
    if (this.metaDataColumnDefinitions == null) {
      this.metaDataColumnDefinitions = new ArrayList<>();
    }
    this.metaDataColumnDefinitions.add(metaDataColumnDefinitionsItem);
    return this;
  }

  /**
   * Get metaDataColumnDefinitions
   * @return metaDataColumnDefinitions
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<MetaPropertyRepresentation> getMetaDataColumnDefinitions() {
    return metaDataColumnDefinitions;
  }

  public void setMetaDataColumnDefinitions(List<MetaPropertyRepresentation> metaDataColumnDefinitions) {
    this.metaDataColumnDefinitions = metaDataColumnDefinitions;
  }

  public AttachFileFieldRepresentation minLength(Integer minLength) {
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

  public AttachFileFieldRepresentation minValue(String minValue) {
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

  public AttachFileFieldRepresentation name(String name) {
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

  public AttachFileFieldRepresentation optionType(String optionType) {
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

  public AttachFileFieldRepresentation options(List<OptionRepresentation> options) {
    this.options = options;
    return this;
  }

  public AttachFileFieldRepresentation addOptionsItem(OptionRepresentation optionsItem) {
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

  public AttachFileFieldRepresentation overrideId(Boolean overrideId) {
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

  public AttachFileFieldRepresentation params(Object params) {
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

  public AttachFileFieldRepresentation placeholder(String placeholder) {
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

  public AttachFileFieldRepresentation readOnly(Boolean readOnly) {
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

  public AttachFileFieldRepresentation regexPattern(String regexPattern) {
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

  public AttachFileFieldRepresentation required(Boolean required) {
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

  public AttachFileFieldRepresentation restIdProperty(String restIdProperty) {
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

  public AttachFileFieldRepresentation restLabelProperty(String restLabelProperty) {
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

  public AttachFileFieldRepresentation restResponsePath(String restResponsePath) {
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

  public AttachFileFieldRepresentation restUrl(String restUrl) {
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

  public AttachFileFieldRepresentation row(Integer row) {
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

  public AttachFileFieldRepresentation sizeX(Integer sizeX) {
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

  public AttachFileFieldRepresentation sizeY(Integer sizeY) {
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

  public AttachFileFieldRepresentation tab(String tab) {
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

  public AttachFileFieldRepresentation type(String type) {
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

  public AttachFileFieldRepresentation value(Object value) {
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

  public AttachFileFieldRepresentation visibilityCondition(ConditionRepresentation visibilityCondition) {
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
    AttachFileFieldRepresentation attachFileFieldRepresentation = (AttachFileFieldRepresentation) o;
    return Objects.equals(this.attachFileFieldRepresentationClassName, attachFileFieldRepresentation.attachFileFieldRepresentationClassName) &&
        Objects.equals(this.attachFileFieldRepresentationCol, attachFileFieldRepresentation.attachFileFieldRepresentationCol) &&
        Objects.equals(this.attachFileFieldRepresentationColspan, attachFileFieldRepresentation.attachFileFieldRepresentationColspan) &&
        Objects.equals(this.attachFileFieldRepresentationDateDisplayFormat, attachFileFieldRepresentation.attachFileFieldRepresentationDateDisplayFormat) &&
        Objects.equals(this.attachFileFieldRepresentationHasEmptyValue, attachFileFieldRepresentation.attachFileFieldRepresentationHasEmptyValue) &&
        Objects.equals(this.attachFileFieldRepresentationId, attachFileFieldRepresentation.attachFileFieldRepresentationId) &&
        Objects.equals(this.attachFileFieldRepresentationLayout, attachFileFieldRepresentation.attachFileFieldRepresentationLayout) &&
        Objects.equals(this.attachFileFieldRepresentationMaxLength, attachFileFieldRepresentation.attachFileFieldRepresentationMaxLength) &&
        Objects.equals(this.attachFileFieldRepresentationMaxValue, attachFileFieldRepresentation.attachFileFieldRepresentationMaxValue) &&
        Objects.equals(this.metaDataColumnDefinitions, attachFileFieldRepresentation.metaDataColumnDefinitions) &&
        Objects.equals(this.minLength, attachFileFieldRepresentation.minLength) &&
        Objects.equals(this.minValue, attachFileFieldRepresentation.minValue) &&
        Objects.equals(this.name, attachFileFieldRepresentation.name) &&
        Objects.equals(this.optionType, attachFileFieldRepresentation.optionType) &&
        Objects.equals(this.options, attachFileFieldRepresentation.options) &&
        Objects.equals(this.overrideId, attachFileFieldRepresentation.overrideId) &&
        Objects.equals(this.params, attachFileFieldRepresentation.params) &&
        Objects.equals(this.placeholder, attachFileFieldRepresentation.placeholder) &&
        Objects.equals(this.readOnly, attachFileFieldRepresentation.readOnly) &&
        Objects.equals(this.regexPattern, attachFileFieldRepresentation.regexPattern) &&
        Objects.equals(this.required, attachFileFieldRepresentation.required) &&
        Objects.equals(this.restIdProperty, attachFileFieldRepresentation.restIdProperty) &&
        Objects.equals(this.restLabelProperty, attachFileFieldRepresentation.restLabelProperty) &&
        Objects.equals(this.restResponsePath, attachFileFieldRepresentation.restResponsePath) &&
        Objects.equals(this.restUrl, attachFileFieldRepresentation.restUrl) &&
        Objects.equals(this.row, attachFileFieldRepresentation.row) &&
        Objects.equals(this.sizeX, attachFileFieldRepresentation.sizeX) &&
        Objects.equals(this.sizeY, attachFileFieldRepresentation.sizeY) &&
        Objects.equals(this.tab, attachFileFieldRepresentation.tab) &&
        Objects.equals(this.type, attachFileFieldRepresentation.type) &&
        Objects.equals(this.value, attachFileFieldRepresentation.value) &&
        Objects.equals(this.visibilityCondition, attachFileFieldRepresentation.visibilityCondition) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachFileFieldRepresentationClassName, attachFileFieldRepresentationCol, attachFileFieldRepresentationColspan, attachFileFieldRepresentationDateDisplayFormat, attachFileFieldRepresentationHasEmptyValue, attachFileFieldRepresentationId, attachFileFieldRepresentationLayout, attachFileFieldRepresentationMaxLength, attachFileFieldRepresentationMaxValue, metaDataColumnDefinitions, minLength, minValue, name, optionType, options, overrideId, params, placeholder, readOnly, regexPattern, required, restIdProperty, restLabelProperty, restResponsePath, restUrl, row, sizeX, sizeY, tab, type, value, visibilityCondition, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachFileFieldRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attachFileFieldRepresentationClassName: ").append(toIndentedString(attachFileFieldRepresentationClassName)).append("\n");
    sb.append("    attachFileFieldRepresentationCol: ").append(toIndentedString(attachFileFieldRepresentationCol)).append("\n");
    sb.append("    attachFileFieldRepresentationColspan: ").append(toIndentedString(attachFileFieldRepresentationColspan)).append("\n");
    sb.append("    attachFileFieldRepresentationDateDisplayFormat: ").append(toIndentedString(attachFileFieldRepresentationDateDisplayFormat)).append("\n");
    sb.append("    attachFileFieldRepresentationHasEmptyValue: ").append(toIndentedString(attachFileFieldRepresentationHasEmptyValue)).append("\n");
    sb.append("    attachFileFieldRepresentationId: ").append(toIndentedString(attachFileFieldRepresentationId)).append("\n");
    sb.append("    attachFileFieldRepresentationLayout: ").append(toIndentedString(attachFileFieldRepresentationLayout)).append("\n");
    sb.append("    attachFileFieldRepresentationMaxLength: ").append(toIndentedString(attachFileFieldRepresentationMaxLength)).append("\n");
    sb.append("    attachFileFieldRepresentationMaxValue: ").append(toIndentedString(attachFileFieldRepresentationMaxValue)).append("\n");
    sb.append("    metaDataColumnDefinitions: ").append(toIndentedString(metaDataColumnDefinitions)).append("\n");
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
