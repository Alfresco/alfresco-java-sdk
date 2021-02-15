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
package org.alfresco.core.model;

import java.util.Objects;
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
 * SharedLinkBodyEmail
 */
@Validated


public class SharedLinkBodyEmail   {
  @JsonProperty("client")
  private String client = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("recipientEmails")
  @Valid
  private List<String> recipientEmails = null;

  public SharedLinkBodyEmail client(String client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(value = "")



  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public SharedLinkBodyEmail message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")



  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SharedLinkBodyEmail locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(value = "")



  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public SharedLinkBodyEmail recipientEmails(List<String> recipientEmails) {
    this.recipientEmails = recipientEmails;
    return this;
  }

  public SharedLinkBodyEmail addRecipientEmailsItem(String recipientEmailsItem) {
    if (this.recipientEmails == null) {
      this.recipientEmails = new ArrayList<>();
    }
    this.recipientEmails.add(recipientEmailsItem);
    return this;
  }

  /**
   * Get recipientEmails
   * @return recipientEmails
  **/
  @ApiModelProperty(value = "")



  public List<String> getRecipientEmails() {
    return recipientEmails;
  }

  public void setRecipientEmails(List<String> recipientEmails) {
    this.recipientEmails = recipientEmails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedLinkBodyEmail sharedLinkBodyEmail = (SharedLinkBodyEmail) o;
    return Objects.equals(this.client, sharedLinkBodyEmail.client) &&
        Objects.equals(this.message, sharedLinkBodyEmail.message) &&
        Objects.equals(this.locale, sharedLinkBodyEmail.locale) &&
        Objects.equals(this.recipientEmails, sharedLinkBodyEmail.recipientEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client, message, locale, recipientEmails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedLinkBodyEmail {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    recipientEmails: ").append(toIndentedString(recipientEmails)).append("\n");
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

