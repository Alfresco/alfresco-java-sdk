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
 * ChangePasswordRepresentation
 */
@Validated

public class ChangePasswordRepresentation   {
  @JsonProperty("newPassword")
  private String newPassword = null;

  @JsonProperty("oldPassword")
  private String oldPassword = null;

  public ChangePasswordRepresentation newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * Get newPassword
   * @return newPassword
  **/
  @ApiModelProperty(value = "")


  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  public ChangePasswordRepresentation oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  /**
   * Get oldPassword
   * @return oldPassword
  **/
  @ApiModelProperty(value = "")


  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePasswordRepresentation changePasswordRepresentation = (ChangePasswordRepresentation) o;
    return Objects.equals(this.newPassword, changePasswordRepresentation.newPassword) &&
        Objects.equals(this.oldPassword, changePasswordRepresentation.oldPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPassword, oldPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePasswordRepresentation {\n");
    
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
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

