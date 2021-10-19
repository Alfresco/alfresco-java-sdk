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
package org.alfresco.search.model;

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
 * Localization settings
 */
@ApiModel(description = "Localization settings")
@Validated

public class RequestLocalization   {
  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("locales")
  @Valid
  private List<String> locales = null;

  public RequestLocalization timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * A valid timezone id supported by @see java.time.ZoneId
   * @return timezone
  **/
  @ApiModelProperty(value = "A valid timezone id supported by @see java.time.ZoneId")


  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public RequestLocalization locales(List<String> locales) {
    this.locales = locales;
    return this;
  }

  public RequestLocalization addLocalesItem(String localesItem) {
    if (this.locales == null) {
      this.locales = new ArrayList<>();
    }
    this.locales.add(localesItem);
    return this;
  }

  /**
   * A list of Locales definied by IETF BCP 47.  The ordering is significant.  The first locale (leftmost) is used for sort and query localization, whereas the remaining locales are used for query only.
   * @return locales
  **/
  @ApiModelProperty(value = "A list of Locales definied by IETF BCP 47.  The ordering is significant.  The first locale (leftmost) is used for sort and query localization, whereas the remaining locales are used for query only.")


  public List<String> getLocales() {
    return locales;
  }

  public void setLocales(List<String> locales) {
    this.locales = locales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestLocalization requestLocalization = (RequestLocalization) o;
    return Objects.equals(this.timezone, requestLocalization.timezone) &&
        Objects.equals(this.locales, requestLocalization.locales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone, locales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestLocalization {\n");
    
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
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

