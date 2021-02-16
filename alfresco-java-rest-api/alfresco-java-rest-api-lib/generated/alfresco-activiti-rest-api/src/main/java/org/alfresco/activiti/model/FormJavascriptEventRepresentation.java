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
 * FormJavascriptEventRepresentation
 */
@Validated

public class FormJavascriptEventRepresentation   {
  @JsonProperty("event")
  private String event = null;

  @JsonProperty("javascriptLogic")
  private String javascriptLogic = null;

  public FormJavascriptEventRepresentation event(String event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(value = "")


  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public FormJavascriptEventRepresentation javascriptLogic(String javascriptLogic) {
    this.javascriptLogic = javascriptLogic;
    return this;
  }

  /**
   * Get javascriptLogic
   * @return javascriptLogic
  **/
  @ApiModelProperty(value = "")


  public String getJavascriptLogic() {
    return javascriptLogic;
  }

  public void setJavascriptLogic(String javascriptLogic) {
    this.javascriptLogic = javascriptLogic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormJavascriptEventRepresentation formJavascriptEventRepresentation = (FormJavascriptEventRepresentation) o;
    return Objects.equals(this.event, formJavascriptEventRepresentation.event) &&
        Objects.equals(this.javascriptLogic, formJavascriptEventRepresentation.javascriptLogic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, javascriptLogic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormJavascriptEventRepresentation {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    javascriptLogic: ").append(toIndentedString(javascriptLogic)).append("\n");
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

