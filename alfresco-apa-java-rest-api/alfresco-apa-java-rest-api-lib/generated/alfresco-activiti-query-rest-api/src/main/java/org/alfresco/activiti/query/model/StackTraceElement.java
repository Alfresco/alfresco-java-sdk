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
 * StackTraceElement
 */
@Validated


public class StackTraceElement   {
  @JsonProperty("classLoaderName")
  private String classLoaderName = null;

  @JsonProperty("className")
  private String className = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("lineNumber")
  private Integer lineNumber = null;

  @JsonProperty("methodName")
  private String methodName = null;

  @JsonProperty("moduleName")
  private String moduleName = null;

  @JsonProperty("moduleVersion")
  private String moduleVersion = null;

  @JsonProperty("nativeMethod")
  private Boolean nativeMethod = null;

  public StackTraceElement classLoaderName(String classLoaderName) {
    this.classLoaderName = classLoaderName;
    return this;
  }

  /**
   * Get classLoaderName
   * @return classLoaderName
   **/
  @ApiModelProperty(value = "")
  
    public String getClassLoaderName() {
    return classLoaderName;
  }

  public void setClassLoaderName(String classLoaderName) {
    this.classLoaderName = classLoaderName;
  }

  public StackTraceElement className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
   **/
  @ApiModelProperty(value = "")
  
    public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public StackTraceElement fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   **/
  @ApiModelProperty(value = "")
  
    public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public StackTraceElement lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Get lineNumber
   * @return lineNumber
   **/
  @ApiModelProperty(value = "")
  
    public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public StackTraceElement methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

  /**
   * Get methodName
   * @return methodName
   **/
  @ApiModelProperty(value = "")
  
    public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public StackTraceElement moduleName(String moduleName) {
    this.moduleName = moduleName;
    return this;
  }

  /**
   * Get moduleName
   * @return moduleName
   **/
  @ApiModelProperty(value = "")
  
    public String getModuleName() {
    return moduleName;
  }

  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }

  public StackTraceElement moduleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
    return this;
  }

  /**
   * Get moduleVersion
   * @return moduleVersion
   **/
  @ApiModelProperty(value = "")
  
    public String getModuleVersion() {
    return moduleVersion;
  }

  public void setModuleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
  }

  public StackTraceElement nativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
    return this;
  }

  /**
   * Get nativeMethod
   * @return nativeMethod
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isNativeMethod() {
    return nativeMethod;
  }

  public void setNativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackTraceElement stackTraceElement = (StackTraceElement) o;
    return Objects.equals(this.classLoaderName, stackTraceElement.classLoaderName) &&
        Objects.equals(this.className, stackTraceElement.className) &&
        Objects.equals(this.fileName, stackTraceElement.fileName) &&
        Objects.equals(this.lineNumber, stackTraceElement.lineNumber) &&
        Objects.equals(this.methodName, stackTraceElement.methodName) &&
        Objects.equals(this.moduleName, stackTraceElement.moduleName) &&
        Objects.equals(this.moduleVersion, stackTraceElement.moduleVersion) &&
        Objects.equals(this.nativeMethod, stackTraceElement.nativeMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classLoaderName, className, fileName, lineNumber, methodName, moduleName, moduleVersion, nativeMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackTraceElement {\n");
    
    sb.append("    classLoaderName: ").append(toIndentedString(classLoaderName)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
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
