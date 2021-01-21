package org.alfresco.discovery.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModuleInfo
 */
@Validated


public class ModuleInfo   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("installDate")
  private OffsetDateTime installDate = null;

  @JsonProperty("installState")
  private String installState = null;

  @JsonProperty("versionMin")
  private String versionMin = null;

  @JsonProperty("versionMax")
  private String versionMax = null;

  public ModuleInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ModuleInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")



  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ModuleInfo description(String description) {
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

  public ModuleInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")



  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ModuleInfo installDate(OffsetDateTime installDate) {
    this.installDate = installDate;
    return this;
  }

  /**
   * Get installDate
   * @return installDate
  **/
  @ApiModelProperty(value = "")

  @Valid


  public OffsetDateTime getInstallDate() {
    return installDate;
  }

  public void setInstallDate(OffsetDateTime installDate) {
    this.installDate = installDate;
  }

  public ModuleInfo installState(String installState) {
    this.installState = installState;
    return this;
  }

  /**
   * Get installState
   * @return installState
  **/
  @ApiModelProperty(value = "")



  public String getInstallState() {
    return installState;
  }

  public void setInstallState(String installState) {
    this.installState = installState;
  }

  public ModuleInfo versionMin(String versionMin) {
    this.versionMin = versionMin;
    return this;
  }

  /**
   * Get versionMin
   * @return versionMin
  **/
  @ApiModelProperty(value = "")



  public String getVersionMin() {
    return versionMin;
  }

  public void setVersionMin(String versionMin) {
    this.versionMin = versionMin;
  }

  public ModuleInfo versionMax(String versionMax) {
    this.versionMax = versionMax;
    return this;
  }

  /**
   * Get versionMax
   * @return versionMax
  **/
  @ApiModelProperty(value = "")



  public String getVersionMax() {
    return versionMax;
  }

  public void setVersionMax(String versionMax) {
    this.versionMax = versionMax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModuleInfo moduleInfo = (ModuleInfo) o;
    return Objects.equals(this.id, moduleInfo.id) &&
        Objects.equals(this.title, moduleInfo.title) &&
        Objects.equals(this.description, moduleInfo.description) &&
        Objects.equals(this.version, moduleInfo.version) &&
        Objects.equals(this.installDate, moduleInfo.installDate) &&
        Objects.equals(this.installState, moduleInfo.installState) &&
        Objects.equals(this.versionMin, moduleInfo.versionMin) &&
        Objects.equals(this.versionMax, moduleInfo.versionMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, version, installDate, installState, versionMin, versionMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModuleInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    installDate: ").append(toIndentedString(installDate)).append("\n");
    sb.append("    installState: ").append(toIndentedString(installState)).append("\n");
    sb.append("    versionMin: ").append(toIndentedString(versionMin)).append("\n");
    sb.append("    versionMax: ").append(toIndentedString(versionMax)).append("\n");
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

