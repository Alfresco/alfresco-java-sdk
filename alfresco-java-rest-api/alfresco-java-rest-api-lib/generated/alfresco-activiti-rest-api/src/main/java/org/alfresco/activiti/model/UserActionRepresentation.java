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
 * UserActionRepresentation
 */
@Validated


public class UserActionRepresentation   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("newPassword")
  private String newPassword = null;

  @JsonProperty("oldPassword")
  private String oldPassword = null;

  public UserActionRepresentation action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")



  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public UserActionRepresentation newPassword(String newPassword) {
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

  public UserActionRepresentation oldPassword(String oldPassword) {
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
    UserActionRepresentation userActionRepresentation = (UserActionRepresentation) o;
    return Objects.equals(this.action, userActionRepresentation.action) &&
        Objects.equals(this.newPassword, userActionRepresentation.newPassword) &&
        Objects.equals(this.oldPassword, userActionRepresentation.oldPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, newPassword, oldPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActionRepresentation {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

