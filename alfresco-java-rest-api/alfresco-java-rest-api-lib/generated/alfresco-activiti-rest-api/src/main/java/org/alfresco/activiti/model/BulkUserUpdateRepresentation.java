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
 * BulkUserUpdateRepresentation
 */
@Validated


public class BulkUserUpdateRepresentation   {
  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("primaryGroupId")
  private Long primaryGroupId = null;

  @JsonProperty("sendNotifications")
  private Boolean sendNotifications = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tenantId")
  private Long tenantId = null;

  @JsonProperty("users")
  @Valid
  private List<Long> users = null;

  public BulkUserUpdateRepresentation accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")



  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public BulkUserUpdateRepresentation password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")



  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public BulkUserUpdateRepresentation primaryGroupId(Long primaryGroupId) {
    this.primaryGroupId = primaryGroupId;
    return this;
  }

  /**
   * Get primaryGroupId
   * @return primaryGroupId
  **/
  @ApiModelProperty(value = "")



  public Long getPrimaryGroupId() {
    return primaryGroupId;
  }

  public void setPrimaryGroupId(Long primaryGroupId) {
    this.primaryGroupId = primaryGroupId;
  }

  public BulkUserUpdateRepresentation sendNotifications(Boolean sendNotifications) {
    this.sendNotifications = sendNotifications;
    return this;
  }

  /**
   * Get sendNotifications
   * @return sendNotifications
  **/
  @ApiModelProperty(value = "")



  public Boolean isSendNotifications() {
    return sendNotifications;
  }

  public void setSendNotifications(Boolean sendNotifications) {
    this.sendNotifications = sendNotifications;
  }

  public BulkUserUpdateRepresentation status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")



  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BulkUserUpdateRepresentation tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")



  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }

  public BulkUserUpdateRepresentation users(List<Long> users) {
    this.users = users;
    return this;
  }

  public BulkUserUpdateRepresentation addUsersItem(Long usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")



  public List<Long> getUsers() {
    return users;
  }

  public void setUsers(List<Long> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkUserUpdateRepresentation bulkUserUpdateRepresentation = (BulkUserUpdateRepresentation) o;
    return Objects.equals(this.accountType, bulkUserUpdateRepresentation.accountType) &&
        Objects.equals(this.password, bulkUserUpdateRepresentation.password) &&
        Objects.equals(this.primaryGroupId, bulkUserUpdateRepresentation.primaryGroupId) &&
        Objects.equals(this.sendNotifications, bulkUserUpdateRepresentation.sendNotifications) &&
        Objects.equals(this.status, bulkUserUpdateRepresentation.status) &&
        Objects.equals(this.tenantId, bulkUserUpdateRepresentation.tenantId) &&
        Objects.equals(this.users, bulkUserUpdateRepresentation.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, password, primaryGroupId, sendNotifications, status, tenantId, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUserUpdateRepresentation {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    primaryGroupId: ").append(toIndentedString(primaryGroupId)).append("\n");
    sb.append("    sendNotifications: ").append(toIndentedString(sendNotifications)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

