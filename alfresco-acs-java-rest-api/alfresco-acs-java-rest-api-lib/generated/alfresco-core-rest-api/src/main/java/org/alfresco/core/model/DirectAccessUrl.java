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
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DirectAccessUrl
 */
@Validated

public class DirectAccessUrl   {
  @JsonProperty("contentUrl")
  private String contentUrl = null;

  @JsonProperty("attachment")
  private Boolean attachment = null;

  @JsonProperty("expiresAt")
  private OffsetDateTime expiresAt = null;

  public DirectAccessUrl contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }

  /**
   * The direct access URL of a binary content
   * @return contentUrl
  **/
  @ApiModelProperty(required = true, value = "The direct access URL of a binary content")
  @NotNull


  public String getContentUrl() {
    return contentUrl;
  }

  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }

  public DirectAccessUrl attachment(Boolean attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Flag to control the download method, **true** for attachment URL, **false** for embedded URL
   * @return attachment
  **/
  @ApiModelProperty(value = "Flag to control the download method, **true** for attachment URL, **false** for embedded URL")


  public Boolean isAttachment() {
    return attachment;
  }

  public void setAttachment(Boolean attachment) {
    this.attachment = attachment;
  }

  public DirectAccessUrl expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The direct access URL would become invalid when the expiry date is reached
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The direct access URL would become invalid when the expiry date is reached")

  @Valid

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectAccessUrl directAccessUrl = (DirectAccessUrl) o;
    return Objects.equals(this.contentUrl, directAccessUrl.contentUrl) &&
        Objects.equals(this.attachment, directAccessUrl.attachment) &&
        Objects.equals(this.expiresAt, directAccessUrl.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentUrl, attachment, expiresAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectAccessUrl {\n");
    
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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

