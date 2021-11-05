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
package org.alfresco.activiti.script.modeling.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DMNTable
 */
@Validated


public class DMNTable   {
  @JsonProperty("inputs")
  private Object inputs = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("xml")
  private String xml = null;

  public DMNTable inputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

  /**
   * Get inputs
   * @return inputs
   **/
  @ApiModelProperty(value = "")
  
    public Object getInputs() {
    return inputs;
  }

  public void setInputs(Object inputs) {
    this.inputs = inputs;
  }

  public DMNTable name(String name) {
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

  public DMNTable xml(String xml) {
    this.xml = xml;
    return this;
  }

  /**
   * Get xml
   * @return xml
   **/
  @ApiModelProperty(value = "")
  
    public String getXml() {
    return xml;
  }

  public void setXml(String xml) {
    this.xml = xml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DMNTable dmNTable = (DMNTable) o;
    return Objects.equals(this.inputs, dmNTable.inputs) &&
        Objects.equals(this.name, dmNTable.name) &&
        Objects.equals(this.xml, dmNTable.xml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, name, xml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DMNTable {\n");
    
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
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
