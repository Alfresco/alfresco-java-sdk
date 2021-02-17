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
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LightUserRepresentation
 */
@Validated

public class LightUserRepresentation   {
  @JsonProperty("company")
  private String company = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("pictureId")
  private Long pictureId = null;

  public LightUserRepresentation company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public LightUserRepresentation email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LightUserRepresentation externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")


  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public LightUserRepresentation firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public LightUserRepresentation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LightUserRepresentation lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LightUserRepresentation pictureId(Long pictureId) {
    this.pictureId = pictureId;
    return this;
  }

  /**
   * Get pictureId
   * @return pictureId
  **/
  @ApiModelProperty(value = "")


  public Long getPictureId() {
    return pictureId;
  }

  public void setPictureId(Long pictureId) {
    this.pictureId = pictureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LightUserRepresentation lightUserRepresentation = (LightUserRepresentation) o;
    return Objects.equals(this.company, lightUserRepresentation.company) &&
        Objects.equals(this.email, lightUserRepresentation.email) &&
        Objects.equals(this.externalId, lightUserRepresentation.externalId) &&
        Objects.equals(this.firstName, lightUserRepresentation.firstName) &&
        Objects.equals(this.id, lightUserRepresentation.id) &&
        Objects.equals(this.lastName, lightUserRepresentation.lastName) &&
        Objects.equals(this.pictureId, lightUserRepresentation.pictureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, email, externalId, firstName, id, lastName, pictureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LightUserRepresentation {\n");
    
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
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

