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
package com.alfresco.activiti.preference.model;

import java.util.Objects;
import com.alfresco.activiti.preference.model.AnnotatedElement;
import com.alfresco.activiti.preference.model.AnnotationMap;
import com.alfresco.activiti.preference.model.JavaType;
import com.alfresco.activiti.preference.model.Member;
import com.alfresco.activiti.preference.model.TypeResolutionContext;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnnotatedMember
 */
@Validated

public class AnnotatedMember   {
  @JsonProperty("allAnnotations")
  private AnnotationMap allAnnotations = null;

  @JsonProperty("annotated")
  private AnnotatedElement annotated = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("member")
  private Member member = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("public")
  private Boolean _public = null;

  @JsonProperty("type")
  private JavaType type = null;

  @JsonProperty("typeContext")
  private TypeResolutionContext typeContext = null;

  public AnnotatedMember allAnnotations(AnnotationMap allAnnotations) {
    this.allAnnotations = allAnnotations;
    return this;
  }

  /**
   * Get allAnnotations
   * @return allAnnotations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnotationMap getAllAnnotations() {
    return allAnnotations;
  }

  public void setAllAnnotations(AnnotationMap allAnnotations) {
    this.allAnnotations = allAnnotations;
  }

  public AnnotatedMember annotated(AnnotatedElement annotated) {
    this.annotated = annotated;
    return this;
  }

  /**
   * Get annotated
   * @return annotated
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AnnotatedElement getAnnotated() {
    return annotated;
  }

  public void setAnnotated(AnnotatedElement annotated) {
    this.annotated = annotated;
  }

  public AnnotatedMember fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public AnnotatedMember member(Member member) {
    this.member = member;
    return this;
  }

  /**
   * Get member
   * @return member
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public AnnotatedMember name(String name) {
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

  public AnnotatedMember _public(Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * Get _public
   * @return _public
  **/
  @ApiModelProperty(value = "")


  public Boolean isPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public AnnotatedMember type(JavaType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

  public JavaType getType() {
    return type;
  }

  public void setType(JavaType type) {
    this.type = type;
  }

  public AnnotatedMember typeContext(TypeResolutionContext typeContext) {
    this.typeContext = typeContext;
    return this;
  }

  /**
   * Get typeContext
   * @return typeContext
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TypeResolutionContext getTypeContext() {
    return typeContext;
  }

  public void setTypeContext(TypeResolutionContext typeContext) {
    this.typeContext = typeContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedMember annotatedMember = (AnnotatedMember) o;
    return Objects.equals(this.allAnnotations, annotatedMember.allAnnotations) &&
        Objects.equals(this.annotated, annotatedMember.annotated) &&
        Objects.equals(this.fullName, annotatedMember.fullName) &&
        Objects.equals(this.member, annotatedMember.member) &&
        Objects.equals(this.name, annotatedMember.name) &&
        Objects.equals(this._public, annotatedMember._public) &&
        Objects.equals(this.type, annotatedMember.type) &&
        Objects.equals(this.typeContext, annotatedMember.typeContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allAnnotations, annotated, fullName, member, name, _public, type, typeContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedMember {\n");
    
    sb.append("    allAnnotations: ").append(toIndentedString(allAnnotations)).append("\n");
    sb.append("    annotated: ").append(toIndentedString(annotated)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeContext: ").append(toIndentedString(typeContext)).append("\n");
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

