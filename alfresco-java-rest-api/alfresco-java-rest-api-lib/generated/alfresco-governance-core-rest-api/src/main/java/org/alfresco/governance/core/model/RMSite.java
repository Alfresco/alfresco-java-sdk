package org.alfresco.governance.core.model;

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
 * RMSite
 */
@Validated

public class RMSite   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("guid")
  private String guid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  /**
   * Gets or Sets visibility
   */
  public enum VisibilityEnum {
    PRIVATE("PRIVATE"),
    
    MODERATED("MODERATED"),
    
    PUBLIC("PUBLIC");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VisibilityEnum fromValue(String text) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("visibility")
  private VisibilityEnum visibility = null;

  /**
   * Gets or Sets compliance
   */
  public enum ComplianceEnum {
    STANDARD("STANDARD"),
    
    DOD5015("DOD5015");

    private String value;

    ComplianceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ComplianceEnum fromValue(String text) {
      for (ComplianceEnum b : ComplianceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("compliance")
  private ComplianceEnum compliance = null;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    SITECONSUMER("SiteConsumer"),
    
    SITECOLLABORATOR("SiteCollaborator"),
    
    SITECONTRIBUTOR("SiteContributor"),
    
    SITEMANAGER("SiteManager");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("role")
  private RoleEnum role = null;

  public RMSite id(String id) {
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

  public RMSite guid(String guid) {
    this.guid = guid;
    return this;
  }

  /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public RMSite title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public RMSite description(String description) {
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

  public RMSite visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public RMSite compliance(ComplianceEnum compliance) {
    this.compliance = compliance;
    return this;
  }

  /**
   * Get compliance
   * @return compliance
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public ComplianceEnum getCompliance() {
    return compliance;
  }

  public void setCompliance(ComplianceEnum compliance) {
    this.compliance = compliance;
  }

  public RMSite role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")


  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RMSite rmSite = (RMSite) o;
    return Objects.equals(this.id, rmSite.id) &&
        Objects.equals(this.guid, rmSite.guid) &&
        Objects.equals(this.title, rmSite.title) &&
        Objects.equals(this.description, rmSite.description) &&
        Objects.equals(this.visibility, rmSite.visibility) &&
        Objects.equals(this.compliance, rmSite.compliance) &&
        Objects.equals(this.role, rmSite.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, guid, title, description, visibility, compliance, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RMSite {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

