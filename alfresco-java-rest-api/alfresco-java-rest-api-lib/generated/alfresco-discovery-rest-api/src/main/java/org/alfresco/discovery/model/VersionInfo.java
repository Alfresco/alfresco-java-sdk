package org.alfresco.discovery.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VersionInfo
 */
@Validated


public class VersionInfo   {
  @JsonProperty("major")
  private String major = null;

  @JsonProperty("minor")
  private String minor = null;

  @JsonProperty("patch")
  private String patch = null;

  @JsonProperty("hotfix")
  private String hotfix = null;

  @JsonProperty("schema")
  private Integer schema = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("display")
  private String display = null;

  public VersionInfo major(String major) {
    this.major = major;
    return this;
  }

  /**
   * Get major
   * @return major
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public VersionInfo minor(String minor) {
    this.minor = minor;
    return this;
  }

  /**
   * Get minor
   * @return minor
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getMinor() {
    return minor;
  }

  public void setMinor(String minor) {
    this.minor = minor;
  }

  public VersionInfo patch(String patch) {
    this.patch = patch;
    return this;
  }

  /**
   * Get patch
   * @return patch
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getPatch() {
    return patch;
  }

  public void setPatch(String patch) {
    this.patch = patch;
  }

  public VersionInfo hotfix(String hotfix) {
    this.hotfix = hotfix;
    return this;
  }

  /**
   * Get hotfix
   * @return hotfix
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getHotfix() {
    return hotfix;
  }

  public void setHotfix(String hotfix) {
    this.hotfix = hotfix;
  }

  public VersionInfo schema(Integer schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public Integer getSchema() {
    return schema;
  }

  public void setSchema(Integer schema) {
    this.schema = schema;
  }

  public VersionInfo label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public VersionInfo display(String display) {
    this.display = display;
    return this;
  }

  /**
   * Get display
   * @return display
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionInfo versionInfo = (VersionInfo) o;
    return Objects.equals(this.major, versionInfo.major) &&
        Objects.equals(this.minor, versionInfo.minor) &&
        Objects.equals(this.patch, versionInfo.patch) &&
        Objects.equals(this.hotfix, versionInfo.hotfix) &&
        Objects.equals(this.schema, versionInfo.schema) &&
        Objects.equals(this.label, versionInfo.label) &&
        Objects.equals(this.display, versionInfo.display);
  }

  @Override
  public int hashCode() {
    return Objects.hash(major, minor, patch, hotfix, schema, label, display);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionInfo {\n");
    
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    hotfix: ").append(toIndentedString(hotfix)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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

