package org.alfresco.activiti.model;

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
 * AddGroupCapabilitiesRepresentation
 */
@Validated

public class AddGroupCapabilitiesRepresentation   {
  @JsonProperty("capabilities")
  @Valid
  private List<String> capabilities = null;

  public AddGroupCapabilitiesRepresentation capabilities(List<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public AddGroupCapabilitiesRepresentation addCapabilitiesItem(String capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
  **/
  @ApiModelProperty(value = "")


  public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddGroupCapabilitiesRepresentation addGroupCapabilitiesRepresentation = (AddGroupCapabilitiesRepresentation) o;
    return Objects.equals(this.capabilities, addGroupCapabilitiesRepresentation.capabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddGroupCapabilitiesRepresentation {\n");
    
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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

