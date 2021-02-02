package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.core.model.Company;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PersonBodyUpdate
 */
@Validated

public class PersonBodyUpdate   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("skypeId")
  private String skypeId = null;

  @JsonProperty("googleId")
  private String googleId = null;

  @JsonProperty("instantMessageId")
  private String instantMessageId = null;

  @JsonProperty("jobTitle")
  private String jobTitle = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("company")
  private Company company = null;

  @JsonProperty("mobile")
  private String mobile = null;

  @JsonProperty("telephone")
  private String telephone = null;

  @JsonProperty("userStatus")
  private String userStatus = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("emailNotificationsEnabled")
  private Boolean emailNotificationsEnabled = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("oldPassword")
  private String oldPassword = null;

  @JsonProperty("aspectNames")
  @Valid
  private List<String> aspectNames = null;

  @JsonProperty("properties")
  private Object properties = null;

  public PersonBodyUpdate firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonBodyUpdate lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PersonBodyUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PersonBodyUpdate email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PersonBodyUpdate skypeId(String skypeId) {
    this.skypeId = skypeId;
    return this;
  }

  /**
   * Get skypeId
   * @return skypeId
  **/
  @ApiModelProperty(value = "")


  public String getSkypeId() {
    return skypeId;
  }

  public void setSkypeId(String skypeId) {
    this.skypeId = skypeId;
  }

  public PersonBodyUpdate googleId(String googleId) {
    this.googleId = googleId;
    return this;
  }

  /**
   * Get googleId
   * @return googleId
  **/
  @ApiModelProperty(value = "")


  public String getGoogleId() {
    return googleId;
  }

  public void setGoogleId(String googleId) {
    this.googleId = googleId;
  }

  public PersonBodyUpdate instantMessageId(String instantMessageId) {
    this.instantMessageId = instantMessageId;
    return this;
  }

  /**
   * Get instantMessageId
   * @return instantMessageId
  **/
  @ApiModelProperty(value = "")


  public String getInstantMessageId() {
    return instantMessageId;
  }

  public void setInstantMessageId(String instantMessageId) {
    this.instantMessageId = instantMessageId;
  }

  public PersonBodyUpdate jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")


  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public PersonBodyUpdate location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public PersonBodyUpdate company(Company company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public PersonBodyUpdate mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(value = "")


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public PersonBodyUpdate telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public PersonBodyUpdate userStatus(String userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * Get userStatus
   * @return userStatus
  **/
  @ApiModelProperty(value = "")


  public String getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(String userStatus) {
    this.userStatus = userStatus;
  }

  public PersonBodyUpdate enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public PersonBodyUpdate emailNotificationsEnabled(Boolean emailNotificationsEnabled) {
    this.emailNotificationsEnabled = emailNotificationsEnabled;
    return this;
  }

  /**
   * Get emailNotificationsEnabled
   * @return emailNotificationsEnabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isEmailNotificationsEnabled() {
    return emailNotificationsEnabled;
  }

  public void setEmailNotificationsEnabled(Boolean emailNotificationsEnabled) {
    this.emailNotificationsEnabled = emailNotificationsEnabled;
  }

  public PersonBodyUpdate password(String password) {
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

  public PersonBodyUpdate oldPassword(String oldPassword) {
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

  public PersonBodyUpdate aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public PersonBodyUpdate addAspectNamesItem(String aspectNamesItem) {
    if (this.aspectNames == null) {
      this.aspectNames = new ArrayList<>();
    }
    this.aspectNames.add(aspectNamesItem);
    return this;
  }

  /**
   * Get aspectNames
   * @return aspectNames
  **/
  @ApiModelProperty(value = "")


  public List<String> getAspectNames() {
    return aspectNames;
  }

  public void setAspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
  }

  public PersonBodyUpdate properties(Object properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")


  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonBodyUpdate personBodyUpdate = (PersonBodyUpdate) o;
    return Objects.equals(this.firstName, personBodyUpdate.firstName) &&
        Objects.equals(this.lastName, personBodyUpdate.lastName) &&
        Objects.equals(this.description, personBodyUpdate.description) &&
        Objects.equals(this.email, personBodyUpdate.email) &&
        Objects.equals(this.skypeId, personBodyUpdate.skypeId) &&
        Objects.equals(this.googleId, personBodyUpdate.googleId) &&
        Objects.equals(this.instantMessageId, personBodyUpdate.instantMessageId) &&
        Objects.equals(this.jobTitle, personBodyUpdate.jobTitle) &&
        Objects.equals(this.location, personBodyUpdate.location) &&
        Objects.equals(this.company, personBodyUpdate.company) &&
        Objects.equals(this.mobile, personBodyUpdate.mobile) &&
        Objects.equals(this.telephone, personBodyUpdate.telephone) &&
        Objects.equals(this.userStatus, personBodyUpdate.userStatus) &&
        Objects.equals(this.enabled, personBodyUpdate.enabled) &&
        Objects.equals(this.emailNotificationsEnabled, personBodyUpdate.emailNotificationsEnabled) &&
        Objects.equals(this.password, personBodyUpdate.password) &&
        Objects.equals(this.oldPassword, personBodyUpdate.oldPassword) &&
        Objects.equals(this.aspectNames, personBodyUpdate.aspectNames) &&
        Objects.equals(this.properties, personBodyUpdate.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, description, email, skypeId, googleId, instantMessageId, jobTitle, location, company, mobile, telephone, userStatus, enabled, emailNotificationsEnabled, password, oldPassword, aspectNames, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonBodyUpdate {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    skypeId: ").append(toIndentedString(skypeId)).append("\n");
    sb.append("    googleId: ").append(toIndentedString(googleId)).append("\n");
    sb.append("    instantMessageId: ").append(toIndentedString(instantMessageId)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    emailNotificationsEnabled: ").append(toIndentedString(emailNotificationsEnabled)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

