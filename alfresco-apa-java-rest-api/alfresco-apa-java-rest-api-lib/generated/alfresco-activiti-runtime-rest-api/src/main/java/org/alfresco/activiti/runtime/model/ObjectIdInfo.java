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
import org.alfresco.activiti.runtime.model.PropertyName;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ObjectIdInfo
 */
@Validated


public class ObjectIdInfo   {
  @JsonProperty("alwaysAsId")
  private Boolean alwaysAsId = null;

  @JsonProperty("propertyName")
  private PropertyName propertyName = null;

  public ObjectIdInfo alwaysAsId(Boolean alwaysAsId) {
    this.alwaysAsId = alwaysAsId;
    return this;
  }

  /**
   * Get alwaysAsId
   * @return alwaysAsId
   **/
  @ApiModelProperty(value = "")
  
    public Boolean isAlwaysAsId() {
    return alwaysAsId;
  }

  public void setAlwaysAsId(Boolean alwaysAsId) {
    this.alwaysAsId = alwaysAsId;
  }

  public ObjectIdInfo propertyName(PropertyName propertyName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectIdInfo objectIdInfo = (ObjectIdInfo) o;
    return Objects.equals(this.alwaysAsId, objectIdInfo.alwaysAsId) &&
        Objects.equals(this.propertyName, objectIdInfo.propertyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alwaysAsId, propertyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectIdInfo {\n");
    
    sb.append("    alwaysAsId: ").append(toIndentedString(alwaysAsId)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
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
