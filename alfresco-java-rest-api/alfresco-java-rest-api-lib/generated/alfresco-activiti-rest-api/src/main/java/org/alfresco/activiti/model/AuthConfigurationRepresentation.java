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
 * AuthConfigurationRepresentation
 */
@Validated


public class AuthConfigurationRepresentation   {
  @JsonProperty("authUrl")
  private String authUrl = null;

  @JsonProperty("clientId")
  private String clientId = null;

  @JsonProperty("realm")
  private String realm = null;

  @JsonProperty("useBrowserLogout")
  private Boolean useBrowserLogout = null;

  public AuthConfigurationRepresentation authUrl(String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

  /**
   * Get authUrl
   * @return authUrl
  **/
  @ApiModelProperty(value = "")



  public String getAuthUrl() {
    return authUrl;
  }

  public void setAuthUrl(String authUrl) {
    this.authUrl = authUrl;
  }

  public AuthConfigurationRepresentation clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")



  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public AuthConfigurationRepresentation realm(String realm) {
    this.realm = realm;
    return this;
  }

  /**
   * Get realm
   * @return realm
  **/
  @ApiModelProperty(value = "")



  public String getRealm() {
    return realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public AuthConfigurationRepresentation useBrowserLogout(Boolean useBrowserLogout) {
    this.useBrowserLogout = useBrowserLogout;
    return this;
  }

  /**
   * Get useBrowserLogout
   * @return useBrowserLogout
  **/
  @ApiModelProperty(value = "")



  public Boolean isUseBrowserLogout() {
    return useBrowserLogout;
  }

  public void setUseBrowserLogout(Boolean useBrowserLogout) {
    this.useBrowserLogout = useBrowserLogout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfigurationRepresentation authConfigurationRepresentation = (AuthConfigurationRepresentation) o;
    return Objects.equals(this.authUrl, authConfigurationRepresentation.authUrl) &&
        Objects.equals(this.clientId, authConfigurationRepresentation.clientId) &&
        Objects.equals(this.realm, authConfigurationRepresentation.realm) &&
        Objects.equals(this.useBrowserLogout, authConfigurationRepresentation.useBrowserLogout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authUrl, clientId, realm, useBrowserLogout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfigurationRepresentation {\n");
    
    sb.append("    authUrl: ").append(toIndentedString(authUrl)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    useBrowserLogout: ").append(toIndentedString(useBrowserLogout)).append("\n");
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

