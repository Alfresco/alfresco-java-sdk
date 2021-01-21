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
 * PermissionsBody
 */
@Validated


public class PermissionsBody   {
  @JsonProperty("isInheritanceEnabled")
  private Boolean isInheritanceEnabled = null;

  @JsonProperty("locallySet")
  @Valid
  private List<PermissionElement> locallySet = null;

  public PermissionsBody isInheritanceEnabled(Boolean isInheritanceEnabled) {
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

  public PermissionsBody locallySet(List<PermissionElement> locallySet) {
    this.locallySet = locallySet;
    return this;
  }

  public PermissionsBody addLocallySetItem(PermissionElement locallySetItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsBody permissionsBody = (PermissionsBody) o;
    return Objects.equals(this.isInheritanceEnabled, permissionsBody.isInheritanceEnabled) &&
        Objects.equals(this.locallySet, permissionsBody.locallySet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isInheritanceEnabled, locallySet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsBody {\n");
    
    sb.append("    isInheritanceEnabled: ").append(toIndentedString(isInheritanceEnabled)).append("\n");
    sb.append("    locallySet: ").append(toIndentedString(locallySet)).append("\n");
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

