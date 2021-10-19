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
 * DirectAccessUrlBodyCreate
 */
@Validated

public class DirectAccessUrlBodyCreate   {
  @JsonProperty("expiresAt")
  private OffsetDateTime expiresAt = null;

  @JsonProperty("validFor")
  private Integer validFor = null;

  public DirectAccessUrlBodyCreate expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public DirectAccessUrlBodyCreate validFor(Integer validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The length of time in seconds that the url is valid for. 
   * minimum: 1
   * @return validFor
  **/
  @ApiModelProperty(value = "The length of time in seconds that the url is valid for. ")

@Min(1)
  public Integer getValidFor() {
    return validFor;
  }

  public void setValidFor(Integer validFor) {
    this.validFor = validFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectAccessUrlBodyCreate directAccessUrlBodyCreate = (DirectAccessUrlBodyCreate) o;
    return Objects.equals(this.expiresAt, directAccessUrlBodyCreate.expiresAt) &&
        Objects.equals(this.validFor, directAccessUrlBodyCreate.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, validFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectAccessUrlBodyCreate {\n");
    
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

