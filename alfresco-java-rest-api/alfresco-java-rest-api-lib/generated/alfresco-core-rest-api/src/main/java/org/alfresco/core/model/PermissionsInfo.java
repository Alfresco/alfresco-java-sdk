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
import org.alfresco.core.model.PermissionElement;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PermissionsInfo
 */
@Validated

public class PermissionsInfo   {
  @JsonProperty("isInheritanceEnabled")
  private Boolean isInheritanceEnabled = null;

  @JsonProperty("inherited")
  @Valid
  private List<PermissionElement> inherited = null;

  @JsonProperty("locallySet")
  @Valid
  private List<PermissionElement> locallySet = null;

  @JsonProperty("settable")
  @Valid
  private List<String> settable = null;

  public PermissionsInfo isInheritanceEnabled(Boolean isInheritanceEnabled) {
    this.isInheritanceEnabled = isInheritanceEnabled;
    return this;
  }

  /**
   * Get isInheritanceEnabled
   * @return isInheritanceEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsInheritanceEnabled() {
    return isInheritanceEnabled;
  }

  public void setIsInheritanceEnabled(Boolean isInheritanceEnabled) {
    this.isInheritanceEnabled = isInheritanceEnabled;
  }

  public PermissionsInfo inherited(List<PermissionElement> inherited) {
    this.inherited = inherited;
    return this;
  }

  public PermissionsInfo addInheritedItem(PermissionElement inheritedItem) {
    if (this.inherited == null) {
      this.inherited = new ArrayList<>();
    }
    this.inherited.add(inheritedItem);
    return this;
  }

  /**
   * Get inherited
   * @return inherited
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PermissionElement> getInherited() {
    return inherited;
  }

  public void setInherited(List<PermissionElement> inherited) {
    this.inherited = inherited;
  }

  public PermissionsInfo locallySet(List<PermissionElement> locallySet) {
    this.locallySet = locallySet;
    return this;
  }

  public PermissionsInfo addLocallySetItem(PermissionElement locallySetItem) {
    if (this.locallySet == null) {
      this.locallySet = new ArrayList<>();
    }
    this.locallySet.add(locallySetItem);
    return this;
  }

  /**
   * Get locallySet
   * @return locallySet
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PermissionElement> getLocallySet() {
    return locallySet;
  }

  public void setLocallySet(List<PermissionElement> locallySet) {
    this.locallySet = locallySet;
  }

  public PermissionsInfo settable(List<String> settable) {
    this.settable = settable;
    return this;
  }

  public PermissionsInfo addSettableItem(String settableItem) {
    if (this.settable == null) {
      this.settable = new ArrayList<>();
    }
    this.settable.add(settableItem);
    return this;
  }

  /**
   * Get settable
   * @return settable
  **/
  @ApiModelProperty(value = "")


  public List<String> getSettable() {
    return settable;
  }

  public void setSettable(List<String> settable) {
    this.settable = settable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsInfo permissionsInfo = (PermissionsInfo) o;
    return Objects.equals(this.isInheritanceEnabled, permissionsInfo.isInheritanceEnabled) &&
        Objects.equals(this.inherited, permissionsInfo.inherited) &&
        Objects.equals(this.locallySet, permissionsInfo.locallySet) &&
        Objects.equals(this.settable, permissionsInfo.settable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isInheritanceEnabled, inherited, locallySet, settable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsInfo {\n");
    
    sb.append("    isInheritanceEnabled: ").append(toIndentedString(isInheritanceEnabled)).append("\n");
    sb.append("    inherited: ").append(toIndentedString(inherited)).append("\n");
    sb.append("    locallySet: ").append(toIndentedString(locallySet)).append("\n");
    sb.append("    settable: ").append(toIndentedString(settable)).append("\n");
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

