package org.alfresco.discovery.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.discovery.model.LicenseInfo;
import org.alfresco.discovery.model.ModuleInfo;
import org.alfresco.discovery.model.StatusInfo;
import org.alfresco.discovery.model.VersionInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RepositoryInfo
 */
@Validated


public class RepositoryInfo   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("edition")
  private String edition = null;

  @JsonProperty("version")
  private VersionInfo version = null;

  @JsonProperty("status")
  private StatusInfo status = null;

  @JsonProperty("license")
  private LicenseInfo license = null;

  @JsonProperty("modules")
  @Valid
  private List<ModuleInfo> modules = null;

  public RepositoryInfo id(String id) {
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

  public RepositoryInfo edition(String edition) {
    this.edition = edition;
    return this;
  }

  /**
   * Get edition
   * @return edition
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public RepositoryInfo version(VersionInfo version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid


  public VersionInfo getVersion() {
    return version;
  }

  public void setVersion(VersionInfo version) {
    this.version = version;
  }

  public RepositoryInfo status(StatusInfo status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid


  public StatusInfo getStatus() {
    return status;
  }

  public void setStatus(StatusInfo status) {
    this.status = status;
  }

  public RepositoryInfo license(LicenseInfo license) {
    this.license = license;
    return this;
  }

  /**
   * Get license
   * @return license
  **/
  @ApiModelProperty(value = "")

  @Valid


  public LicenseInfo getLicense() {
    return license;
  }

  public void setLicense(LicenseInfo license) {
    this.license = license;
  }

  public RepositoryInfo modules(List<ModuleInfo> modules) {
    this.modules = modules;
    return this;
  }

  public RepositoryInfo addModulesItem(ModuleInfo modulesItem) {
    if (this.modules == null) {
      this.modules = new ArrayList<>();
    }
    this.modules.add(modulesItem);
    return this;
  }

  /**
   * Get modules
   * @return modules
  **/
  @ApiModelProperty(value = "")

  @Valid


  public List<ModuleInfo> getModules() {
    return modules;
  }

  public void setModules(List<ModuleInfo> modules) {
    this.modules = modules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepositoryInfo repositoryInfo = (RepositoryInfo) o;
    return Objects.equals(this.id, repositoryInfo.id) &&
        Objects.equals(this.edition, repositoryInfo.edition) &&
        Objects.equals(this.version, repositoryInfo.version) &&
        Objects.equals(this.status, repositoryInfo.status) &&
        Objects.equals(this.license, repositoryInfo.license) &&
        Objects.equals(this.modules, repositoryInfo.modules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, edition, version, status, license, modules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepositoryInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
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

