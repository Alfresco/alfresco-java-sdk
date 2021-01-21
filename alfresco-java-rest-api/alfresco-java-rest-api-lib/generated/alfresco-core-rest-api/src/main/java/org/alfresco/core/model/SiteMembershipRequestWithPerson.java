package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.alfresco.core.model.Person;
import org.alfresco.core.model.Site;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SiteMembershipRequestWithPerson
 */
@Validated


public class SiteMembershipRequestWithPerson   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("site")
  private Site site = null;

  @JsonProperty("person")
  private Person person = null;

  @JsonProperty("message")
  private String message = null;

  public SiteMembershipRequestWithPerson id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SiteMembershipRequestWithPerson createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid


  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SiteMembershipRequestWithPerson site(Site site) {
    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid


  public Site getSite() {
    return site;
  }

  public void setSite(Site site) {
    this.site = site;
  }

  public SiteMembershipRequestWithPerson person(Person person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid


  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public SiteMembershipRequestWithPerson message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")



  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteMembershipRequestWithPerson siteMembershipRequestWithPerson = (SiteMembershipRequestWithPerson) o;
    return Objects.equals(this.id, siteMembershipRequestWithPerson.id) &&
        Objects.equals(this.createdAt, siteMembershipRequestWithPerson.createdAt) &&
        Objects.equals(this.site, siteMembershipRequestWithPerson.site) &&
        Objects.equals(this.person, siteMembershipRequestWithPerson.person) &&
        Objects.equals(this.message, siteMembershipRequestWithPerson.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, site, person, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteMembershipRequestWithPerson {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

