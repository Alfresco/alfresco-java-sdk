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
package org.alfresco.activiti.runtime.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.runtime.model.JavaType;
import org.alfresco.activiti.runtime.model.TypeBindings;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JavaType
 */
@Validated


public class JavaType   {
  @JsonProperty("abstract")
  private Boolean _abstract = null;

  @JsonProperty("arrayType")
  private Boolean arrayType = null;

  @JsonProperty("bindings")
  private TypeBindings bindings = null;

  @JsonProperty("collectionLikeType")
  private Boolean collectionLikeType = null;

  @JsonProperty("concrete")
  private Boolean concrete = null;

  @JsonProperty("containerType")
  private Boolean containerType = null;

  @JsonProperty("contentType")
  private JavaType contentType = null;

  @JsonProperty("contentTypeHandler")
  private Object contentTypeHandler = null;

  @JsonProperty("contentValueHandler")
  private Object contentValueHandler = null;

  @JsonProperty("enumImplType")
  private Boolean enumImplType = null;

  @JsonProperty("enumType")
  private Boolean enumType = null;

  @JsonProperty("erasedSignature")
  private String erasedSignature = null;

  @JsonProperty("final")
  private Boolean _final = null;

  @JsonProperty("genericSignature")
  private String genericSignature = null;

  @JsonProperty("interface")
  private Boolean _interface = null;

  @JsonProperty("interfaces")
  @Valid
  private List<JavaType> interfaces = null;

  @JsonProperty("javaLangObject")
  private Boolean javaLangObject = null;

  @JsonProperty("keyType")
  private JavaType keyType = null;

  @JsonProperty("mapLikeType")
  private Boolean mapLikeType = null;

  @JsonProperty("primitive")
  private Boolean primitive = null;

  @JsonProperty("recordType")
  private Boolean recordType = null;

  @JsonProperty("referenceType")
  private Boolean referenceType = null;

  @JsonProperty("referencedType")
  private JavaType referencedType = null;

  @JsonProperty("superClass")
  private JavaType superClass = null;

  @JsonProperty("throwable")
  private Boolean throwable = null;

  @JsonProperty("typeHandler")
  private Object typeHandler = null;

  @JsonProperty("typeName")
  private String typeName = null;

  @JsonProperty("valueHandler")
  private Object valueHandler = null;

  public JavaType _abstract(Boolean _abstract) {
    this._abstract = _abstract;
    return this;
  }

  /**
   * Get _abstract
   * @return _abstract
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isAbstract() {
    return _abstract;
  }

  public void setAbstract(Boolean _abstract) {
    this._abstract = _abstract;
  }

  public JavaType arrayType(Boolean arrayType) {
    this.arrayType = arrayType;
    return this;
  }

  /**
   * Get arrayType
   * @return arrayType
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isArrayType() {
    return arrayType;
  }

  public void setArrayType(Boolean arrayType) {
    this.arrayType = arrayType;
  }

  public JavaType bindings(TypeBindings bindings) {
    this.bindings = bindings;
    return this;
  }

  /**
   * Get bindings
   * @return bindings
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TypeBindings getBindings() {
    return bindings;
  }

  public void setBindings(TypeBindings bindings) {
    this.bindings = bindings;
  }

  public JavaType collectionLikeType(Boolean collectionLikeType) {
    this.collectionLikeType = collectionLikeType;
    return this;
  }

  /**
   * Get collectionLikeType
   * @return collectionLikeType
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isCollectionLikeType() {
    return collectionLikeType;
  }

  public void setCollectionLikeType(Boolean collectionLikeType) {
    this.collectionLikeType = collectionLikeType;
  }

  public JavaType concrete(Boolean concrete) {
    this.concrete = concrete;
    return this;
  }

  /**
   * Get concrete
   * @return concrete
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isConcrete() {
    return concrete;
  }

  public void setConcrete(Boolean concrete) {
    this.concrete = concrete;
  }

  public JavaType containerType(Boolean containerType) {
    this.containerType = containerType;
    return this;
  }

  /**
   * Get containerType
   * @return containerType
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isContainerType() {
    return containerType;
  }

  public void setContainerType(Boolean containerType) {
    this.containerType = containerType;
  }

  public JavaType contentType(JavaType contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JavaType getContentType() {
    return contentType;
  }

  public void setContentType(JavaType contentType) {
    this.contentType = contentType;
  }

  public JavaType contentTypeHandler(Object contentTypeHandler) {
    this.contentTypeHandler = contentTypeHandler;
    return this;
  }

  /**
   * Get contentTypeHandler
   * @return contentTypeHandler
   **/
  @ApiModelProperty(value = "")
  
    public Object getContentTypeHandler() {
    return contentTypeHandler;
  }

  public void setContentTypeHandler(Object contentTypeHandler) {
    this.contentTypeHandler = contentTypeHandler;
  }

  public JavaType contentValueHandler(Object contentValueHandler) {
    this.contentValueHandler = contentValueHandler;
    return this;
  }

  /**
   * Get contentValueHandler
   * @return contentValueHandler
   **/
  @ApiModelProperty(value = "")
  
    public Object getContentValueHandler() {
    return contentValueHandler;
  }

  public void setContentValueHandler(Object contentValueHandler) {
    this.contentValueHandler = contentValueHandler;
  }

  public JavaType enumImplType(Boolean enumImplType) {
    this.enumImplType = enumImplType;
    return this;
  }

  /**
   * Get enumImplType
   * @return enumImplType
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isEnumImplType() {
    return enumImplType;
  }

  public void setEnumImplType(Boolean enumImplType) {
    this.enumImplType = enumImplType;
  }

  public JavaType enumType(Boolean enumType) {
    this.enumType = enumType;
    return this;
  }

  /**
   * Get enumType
   * @return enumType
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isEnumType() {
    return enumType;
  }

  public void setEnumType(Boolean enumType) {
    this.enumType = enumType;
  }

  public JavaType erasedSignature(String erasedSignature) {
    this.erasedSignature = erasedSignature;
    return this;
  }

  /**
   * Get erasedSignature
   * @return erasedSignature
   **/
  @ApiModelProperty(value = "")
  
    public String getErasedSignature() {
    return erasedSignature;
  }

  public void setErasedSignature(String erasedSignature) {
    this.erasedSignature = erasedSignature;
  }

  public JavaType _final(Boolean _final) {
    this._final = _final;
    return this;
  }

  /**
   * Get _final
   * @return _final
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isFinal() {
    return _final;
  }

  public void setFinal(Boolean _final) {
    this._final = _final;
  }

  public JavaType genericSignature(String genericSignature) {
    this.genericSignature = genericSignature;
    return this;
  }

  /**
   * Get genericSignature
   * @return genericSignature
   **/
  @ApiModelProperty(value = "")
  
    public String getGenericSignature() {
    return genericSignature;
  }

  public void setGenericSignature(String genericSignature) {
    this.genericSignature = genericSignature;
  }

  public JavaType _interface(Boolean _interface) {
    this._interface = _interface;
    return this;
  }

  /**
   * Get _interface
   * @return _interface
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isInterface() {
    return _interface;
  }

  public void setInterface(Boolean _interface) {
    this._interface = _interface;
  }

  public JavaType interfaces(List<JavaType> interfaces) {
    this.interfaces = interfaces;
    return this;
  }

  public JavaType addInterfacesItem(JavaType interfacesItem) {
    if (this.interfaces == null) {
      this.interfaces = new ArrayList<>();
    }
    this.interfaces.add(interfacesItem);
    return this;
  }

  /**
   * Get interfaces
   * @return interfaces
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<JavaType> getInterfaces() {
    return interfaces;
  }

  public void setInterfaces(List<JavaType> interfaces) {
    this.interfaces = interfaces;
  }

  public JavaType javaLangObject(Boolean javaLangObject) {
    this.javaLangObject = javaLangObject;
    return this;
  }

  /**
   * Get javaLangObject
   * @return javaLangObject
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isJavaLangObject() {
    return javaLangObject;
  }

  public void setJavaLangObject(Boolean javaLangObject) {
    this.javaLangObject = javaLangObject;
  }

  public JavaType keyType(JavaType keyType) {
    this.keyType = keyType;
    return this;
  }

  /**
   * Get keyType
   * @return keyType
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JavaType getKeyType() {
    return keyType;
  }

  public void setKeyType(JavaType keyType) {
    this.keyType = keyType;
  }

  public JavaType mapLikeType(Boolean mapLikeType) {
    this.mapLikeType = mapLikeType;
    return this;
  }

  /**
   * Get mapLikeType
   * @return mapLikeType
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isMapLikeType() {
    return mapLikeType;
  }

  public void setMapLikeType(Boolean mapLikeType) {
    this.mapLikeType = mapLikeType;
  }

  public JavaType primitive(Boolean primitive) {
    this.primitive = primitive;
    return this;
  }

  /**
   * Get primitive
   * @return primitive
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isPrimitive() {
    return primitive;
  }

  public void setPrimitive(Boolean primitive) {
    this.primitive = primitive;
  }

  public JavaType recordType(Boolean recordType) {
    this.recordType = recordType;
    return this;
  }

  /**
   * Get recordType
   * @return recordType
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isRecordType() {
    return recordType;
  }

  public void setRecordType(Boolean recordType) {
    this.recordType = recordType;
  }

  public JavaType referenceType(Boolean referenceType) {
    this.referenceType = referenceType;
    return this;
  }

  /**
   * Get referenceType
   * @return referenceType
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isReferenceType() {
    return referenceType;
  }

  public void setReferenceType(Boolean referenceType) {
    this.referenceType = referenceType;
  }

  public JavaType referencedType(JavaType referencedType) {
    this.referencedType = referencedType;
    return this;
  }

  /**
   * Get referencedType
   * @return referencedType
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JavaType getReferencedType() {
    return referencedType;
  }

  public void setReferencedType(JavaType referencedType) {
    this.referencedType = referencedType;
  }

  public JavaType superClass(JavaType superClass) {
    this.superClass = superClass;
    return this;
  }

  /**
   * Get superClass
   * @return superClass
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JavaType getSuperClass() {
    return superClass;
  }

  public void setSuperClass(JavaType superClass) {
    this.superClass = superClass;
  }

  public JavaType throwable(Boolean throwable) {
    this.throwable = throwable;
    return this;
  }

  /**
   * Get throwable
   * @return throwable
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isThrowable() {
    return throwable;
  }

  public void setThrowable(Boolean throwable) {
    this.throwable = throwable;
  }

  public JavaType typeHandler(Object typeHandler) {
    this.typeHandler = typeHandler;
    return this;
  }

  /**
   * Get typeHandler
   * @return typeHandler
   **/
  @ApiModelProperty(value = "")
  
    public Object getTypeHandler() {
    return typeHandler;
  }

  public void setTypeHandler(Object typeHandler) {
    this.typeHandler = typeHandler;
  }

  public JavaType typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

  /**
   * Get typeName
   * @return typeName
   **/
  @ApiModelProperty(value = "")
  
    public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public JavaType valueHandler(Object valueHandler) {
    this.valueHandler = valueHandler;
    return this;
  }

  /**
   * Get valueHandler
   * @return valueHandler
   **/
  @ApiModelProperty(value = "")
  
    public Object getValueHandler() {
    return valueHandler;
  }

  public void setValueHandler(Object valueHandler) {
    this.valueHandler = valueHandler;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JavaType javaType = (JavaType) o;
    return Objects.equals(this._abstract, javaType._abstract) &&
        Objects.equals(this.arrayType, javaType.arrayType) &&
        Objects.equals(this.bindings, javaType.bindings) &&
        Objects.equals(this.collectionLikeType, javaType.collectionLikeType) &&
        Objects.equals(this.concrete, javaType.concrete) &&
        Objects.equals(this.containerType, javaType.containerType) &&
        Objects.equals(this.contentType, javaType.contentType) &&
        Objects.equals(this.contentTypeHandler, javaType.contentTypeHandler) &&
        Objects.equals(this.contentValueHandler, javaType.contentValueHandler) &&
        Objects.equals(this.enumImplType, javaType.enumImplType) &&
        Objects.equals(this.enumType, javaType.enumType) &&
        Objects.equals(this.erasedSignature, javaType.erasedSignature) &&
        Objects.equals(this._final, javaType._final) &&
        Objects.equals(this.genericSignature, javaType.genericSignature) &&
        Objects.equals(this._interface, javaType._interface) &&
        Objects.equals(this.interfaces, javaType.interfaces) &&
        Objects.equals(this.javaLangObject, javaType.javaLangObject) &&
        Objects.equals(this.keyType, javaType.keyType) &&
        Objects.equals(this.mapLikeType, javaType.mapLikeType) &&
        Objects.equals(this.primitive, javaType.primitive) &&
        Objects.equals(this.recordType, javaType.recordType) &&
        Objects.equals(this.referenceType, javaType.referenceType) &&
        Objects.equals(this.referencedType, javaType.referencedType) &&
        Objects.equals(this.superClass, javaType.superClass) &&
        Objects.equals(this.throwable, javaType.throwable) &&
        Objects.equals(this.typeHandler, javaType.typeHandler) &&
        Objects.equals(this.typeName, javaType.typeName) &&
        Objects.equals(this.valueHandler, javaType.valueHandler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_abstract, arrayType, bindings, collectionLikeType, concrete, containerType, contentType, contentTypeHandler, contentValueHandler, enumImplType, enumType, erasedSignature, _final, genericSignature, _interface, interfaces, javaLangObject, keyType, mapLikeType, primitive, recordType, referenceType, referencedType, superClass, throwable, typeHandler, typeName, valueHandler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JavaType {\n");
    
    sb.append("    _abstract: ").append(toIndentedString(_abstract)).append("\n");
    sb.append("    arrayType: ").append(toIndentedString(arrayType)).append("\n");
    sb.append("    bindings: ").append(toIndentedString(bindings)).append("\n");
    sb.append("    collectionLikeType: ").append(toIndentedString(collectionLikeType)).append("\n");
    sb.append("    concrete: ").append(toIndentedString(concrete)).append("\n");
    sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentTypeHandler: ").append(toIndentedString(contentTypeHandler)).append("\n");
    sb.append("    contentValueHandler: ").append(toIndentedString(contentValueHandler)).append("\n");
    sb.append("    enumImplType: ").append(toIndentedString(enumImplType)).append("\n");
    sb.append("    enumType: ").append(toIndentedString(enumType)).append("\n");
    sb.append("    erasedSignature: ").append(toIndentedString(erasedSignature)).append("\n");
    sb.append("    _final: ").append(toIndentedString(_final)).append("\n");
    sb.append("    genericSignature: ").append(toIndentedString(genericSignature)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
    sb.append("    javaLangObject: ").append(toIndentedString(javaLangObject)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    mapLikeType: ").append(toIndentedString(mapLikeType)).append("\n");
    sb.append("    primitive: ").append(toIndentedString(primitive)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referencedType: ").append(toIndentedString(referencedType)).append("\n");
    sb.append("    superClass: ").append(toIndentedString(superClass)).append("\n");
    sb.append("    throwable: ").append(toIndentedString(throwable)).append("\n");
    sb.append("    typeHandler: ").append(toIndentedString(typeHandler)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    valueHandler: ").append(toIndentedString(valueHandler)).append("\n");
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
