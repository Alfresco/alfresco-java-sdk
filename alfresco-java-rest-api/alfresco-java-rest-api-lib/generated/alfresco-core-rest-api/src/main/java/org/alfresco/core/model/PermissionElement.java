package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PermissionElement
 */
@Validated

public class PermissionElement   {
  @JsonProperty("authorityId")
  private String authorityId = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets accessStatus
   */
  public enum AccessStatusEnum {
    ALLOWED("ALLOWED"),
    
    DENIED("DENIED");

    private String value;

    AccessStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccessStatusEnum fromValue(String text) {
      for (AccessStatusEnum b : AccessStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("accessStatus")
  private AccessStatusEnum accessStatus = AccessStatusEnum.ALLOWED;

  public PermissionElement authorityId(String authorityId) {
    this.authorityId = authorityId;
    return this;
  }

  /**
   * Get authorityId
   * @return authorityId
  **/
  @ApiModelProperty(value = "")


  public String getAuthorityId() {
    return authorityId;
  }

  public void setAuthorityId(String authorityId) {
    this.authorityId = authorityId;
  }

  public PermissionElement name(String name) {
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

  public PermissionElement accessStatus(AccessStatusEnum accessStatus) {
    this.accessStatus = accessStatus;
    return this;
  }

  /**
   * Get accessStatus
   * @return accessStatus
  **/
  @ApiModelProperty(value = "")


  public AccessStatusEnum getAccessStatus() {
    return accessStatus;
  }

  public void setAccessStatus(AccessStatusEnum accessStatus) {
    this.accessStatus = accessStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionElement permissionElement = (PermissionElement) o;
    return Objects.equals(this.authorityId, permissionElement.authorityId) &&
        Objects.equals(this.name, permissionElement.name) &&
        Objects.equals(this.accessStatus, permissionElement.accessStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorityId, name, accessStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionElement {\n");
    
    sb.append("    authorityId: ").append(toIndentedString(authorityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
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

