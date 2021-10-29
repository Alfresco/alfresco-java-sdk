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
package com.alfresco.activiti.runtime.model;

import java.util.Objects;
import com.alfresco.activiti.runtime.model.JavaType;
import com.alfresco.activiti.runtime.model.JsonDeserializerOfobject;
import com.alfresco.activiti.runtime.model.ObjectIdGeneratorOfobject;
import com.alfresco.activiti.runtime.model.ObjectIdResolver;
import com.alfresco.activiti.runtime.model.PropertyName;
import com.alfresco.activiti.runtime.model.SettableBeanProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ObjectIdReader
 */
@Validated


public class ObjectIdReader   {
  @JsonProperty("deserializer")
  private JsonDeserializerOfobject deserializer = null;

  @JsonProperty("generator")
  private ObjectIdGeneratorOfobject generator = null;

  @JsonProperty("idProperty")
  private SettableBeanProperty idProperty = null;

  @JsonProperty("idType")
  private JavaType idType = null;

  @JsonProperty("propertyName")
  private PropertyName propertyName = null;

  @JsonProperty("resolver")
  private ObjectIdResolver resolver = null;

  public ObjectIdReader deserializer(JsonDeserializerOfobject deserializer) {
    this.deserializer = deserializer;
    return this;
  }

  /**
   * Get deserializer
   * @return deserializer
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JsonDeserializerOfobject getDeserializer() {
    return deserializer;
  }

  public void setDeserializer(JsonDeserializerOfobject deserializer) {
    this.deserializer = deserializer;
  }

  public ObjectIdReader generator(ObjectIdGeneratorOfobject generator) {
    this.generator = generator;
    return this;
  }

  /**
   * Get generator
   * @return generator
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ObjectIdGeneratorOfobject getGenerator() {
    return generator;
  }

  public void setGenerator(ObjectIdGeneratorOfobject generator) {
    this.generator = generator;
  }

  public ObjectIdReader idProperty(SettableBeanProperty idProperty) {
    this.idProperty = idProperty;
    return this;
  }

  /**
   * Get idProperty
   * @return idProperty
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SettableBeanProperty getIdProperty() {
    return idProperty;
  }

  public void setIdProperty(SettableBeanProperty idProperty) {
    this.idProperty = idProperty;
  }

  public ObjectIdReader idType(JavaType idType) {
    this.idType = idType;
    return this;
  }

  /**
   * Get idType
   * @return idType
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public JavaType getIdType() {
    return idType;
  }

  public void setIdType(JavaType idType) {
    this.idType = idType;
  }

  public ObjectIdReader propertyName(PropertyName propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Get propertyName
   * @return propertyName
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public PropertyName getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(PropertyName propertyName) {
    this.propertyName = propertyName;
  }

  public ObjectIdReader resolver(ObjectIdResolver resolver) {
    this.resolver = resolver;
    return this;
  }

  /**
   * Get resolver
   * @return resolver
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ObjectIdResolver getResolver() {
    return resolver;
  }

  public void setResolver(ObjectIdResolver resolver) {
    this.resolver = resolver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectIdReader objectIdReader = (ObjectIdReader) o;
    return Objects.equals(this.deserializer, objectIdReader.deserializer) &&
        Objects.equals(this.generator, objectIdReader.generator) &&
        Objects.equals(this.idProperty, objectIdReader.idProperty) &&
        Objects.equals(this.idType, objectIdReader.idType) &&
        Objects.equals(this.propertyName, objectIdReader.propertyName) &&
        Objects.equals(this.resolver, objectIdReader.resolver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deserializer, generator, idProperty, idType, propertyName, resolver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectIdReader {\n");
    
    sb.append("    deserializer: ").append(toIndentedString(deserializer)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    idProperty: ").append(toIndentedString(idProperty)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    resolver: ").append(toIndentedString(resolver)).append("\n");
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
