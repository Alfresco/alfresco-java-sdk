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
import org.alfresco.activiti.model.LightGroupRepresentation;
import org.alfresco.activiti.model.LightUserRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PublishIdentityInfoRepresentation
 */
@Validated

public class PublishIdentityInfoRepresentation   {
  @JsonProperty("group")
  private LightGroupRepresentation group = null;

  @JsonProperty("person")
  private LightUserRepresentation person = null;

  @JsonProperty("type")
  private String type = null;

  public PublishIdentityInfoRepresentation group(LightGroupRepresentation group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LightGroupRepresentation getGroup() {
    return group;
  }

  public void setGroup(LightGroupRepresentation group) {
    this.group = group;
  }

  public PublishIdentityInfoRepresentation person(LightUserRepresentation person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LightUserRepresentation getPerson() {
    return person;
  }

  public void setPerson(LightUserRepresentation person) {
    this.person = person;
  }

  public PublishIdentityInfoRepresentation type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishIdentityInfoRepresentation publishIdentityInfoRepresentation = (PublishIdentityInfoRepresentation) o;
    return Objects.equals(this.group, publishIdentityInfoRepresentation.group) &&
        Objects.equals(this.person, publishIdentityInfoRepresentation.person) &&
        Objects.equals(this.type, publishIdentityInfoRepresentation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, person, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishIdentityInfoRepresentation {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

