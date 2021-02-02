package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.activiti.model.AuthConfigurationRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemPropertiesRepresentation
 */
@Validated

public class SystemPropertiesRepresentation   {
  @JsonProperty("alfrescoContentSsoEnabled")
  private Boolean alfrescoContentSsoEnabled = null;

  @JsonProperty("allowInvolveByEmail")
  private Boolean allowInvolveByEmail = null;

  @JsonProperty("authConfiguration")
  private AuthConfigurationRepresentation authConfiguration = null;

  @JsonProperty("disableJavaScriptEventsInFormEditor")
  private Boolean disableJavaScriptEventsInFormEditor = null;

  @JsonProperty("logoutDisabled")
  private Boolean logoutDisabled = null;

  public SystemPropertiesRepresentation alfrescoContentSsoEnabled(Boolean alfrescoContentSsoEnabled) {
    this.alfrescoContentSsoEnabled = alfrescoContentSsoEnabled;
    return this;
  }

  /**
   * Get alfrescoContentSsoEnabled
   * @return alfrescoContentSsoEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isAlfrescoContentSsoEnabled() {
    return alfrescoContentSsoEnabled;
  }

  public void setAlfrescoContentSsoEnabled(Boolean alfrescoContentSsoEnabled) {
    this.alfrescoContentSsoEnabled = alfrescoContentSsoEnabled;
  }

  public SystemPropertiesRepresentation allowInvolveByEmail(Boolean allowInvolveByEmail) {
    this.allowInvolveByEmail = allowInvolveByEmail;
    return this;
  }

  /**
   * Get allowInvolveByEmail
   * @return allowInvolveByEmail
  **/
  @ApiModelProperty(value = "")


  public Boolean isAllowInvolveByEmail() {
    return allowInvolveByEmail;
  }

  public void setAllowInvolveByEmail(Boolean allowInvolveByEmail) {
    this.allowInvolveByEmail = allowInvolveByEmail;
  }

  public SystemPropertiesRepresentation authConfiguration(AuthConfigurationRepresentation authConfiguration) {
    this.authConfiguration = authConfiguration;
    return this;
  }

  /**
   * Get authConfiguration
   * @return authConfiguration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AuthConfigurationRepresentation getAuthConfiguration() {
    return authConfiguration;
  }

  public void setAuthConfiguration(AuthConfigurationRepresentation authConfiguration) {
    this.authConfiguration = authConfiguration;
  }

  public SystemPropertiesRepresentation disableJavaScriptEventsInFormEditor(Boolean disableJavaScriptEventsInFormEditor) {
    this.disableJavaScriptEventsInFormEditor = disableJavaScriptEventsInFormEditor;
    return this;
  }

  /**
   * Get disableJavaScriptEventsInFormEditor
   * @return disableJavaScriptEventsInFormEditor
  **/
  @ApiModelProperty(value = "")


  public Boolean isDisableJavaScriptEventsInFormEditor() {
    return disableJavaScriptEventsInFormEditor;
  }

  public void setDisableJavaScriptEventsInFormEditor(Boolean disableJavaScriptEventsInFormEditor) {
    this.disableJavaScriptEventsInFormEditor = disableJavaScriptEventsInFormEditor;
  }

  public SystemPropertiesRepresentation logoutDisabled(Boolean logoutDisabled) {
    this.logoutDisabled = logoutDisabled;
    return this;
  }

  /**
   * Get logoutDisabled
   * @return logoutDisabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isLogoutDisabled() {
    return logoutDisabled;
  }

  public void setLogoutDisabled(Boolean logoutDisabled) {
    this.logoutDisabled = logoutDisabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemPropertiesRepresentation systemPropertiesRepresentation = (SystemPropertiesRepresentation) o;
    return Objects.equals(this.alfrescoContentSsoEnabled, systemPropertiesRepresentation.alfrescoContentSsoEnabled) &&
        Objects.equals(this.allowInvolveByEmail, systemPropertiesRepresentation.allowInvolveByEmail) &&
        Objects.equals(this.authConfiguration, systemPropertiesRepresentation.authConfiguration) &&
        Objects.equals(this.disableJavaScriptEventsInFormEditor, systemPropertiesRepresentation.disableJavaScriptEventsInFormEditor) &&
        Objects.equals(this.logoutDisabled, systemPropertiesRepresentation.logoutDisabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alfrescoContentSsoEnabled, allowInvolveByEmail, authConfiguration, disableJavaScriptEventsInFormEditor, logoutDisabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemPropertiesRepresentation {\n");
    
    sb.append("    alfrescoContentSsoEnabled: ").append(toIndentedString(alfrescoContentSsoEnabled)).append("\n");
    sb.append("    allowInvolveByEmail: ").append(toIndentedString(allowInvolveByEmail)).append("\n");
    sb.append("    authConfiguration: ").append(toIndentedString(authConfiguration)).append("\n");
    sb.append("    disableJavaScriptEventsInFormEditor: ").append(toIndentedString(disableJavaScriptEventsInFormEditor)).append("\n");
    sb.append("    logoutDisabled: ").append(toIndentedString(logoutDisabled)).append("\n");
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

