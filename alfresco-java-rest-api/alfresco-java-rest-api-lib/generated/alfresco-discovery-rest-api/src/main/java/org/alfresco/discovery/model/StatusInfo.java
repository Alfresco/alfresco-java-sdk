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
 * StatusInfo
 */
@Validated

public class StatusInfo   {
  @JsonProperty("isReadOnly")
  private Boolean isReadOnly = false;

  @JsonProperty("isAuditEnabled")
  private Boolean isAuditEnabled = null;

  @JsonProperty("isQuickShareEnabled")
  private Boolean isQuickShareEnabled = null;

  @JsonProperty("isThumbnailGenerationEnabled")
  private Boolean isThumbnailGenerationEnabled = null;

  public StatusInfo isReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
    return this;
  }

  /**
   * Get isReadOnly
   * @return isReadOnly
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsReadOnly() {
    return isReadOnly;
  }

  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }

  public StatusInfo isAuditEnabled(Boolean isAuditEnabled) {
    this.isAuditEnabled = isAuditEnabled;
    return this;
  }

  /**
   * Get isAuditEnabled
   * @return isAuditEnabled
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsAuditEnabled() {
    return isAuditEnabled;
  }

  public void setIsAuditEnabled(Boolean isAuditEnabled) {
    this.isAuditEnabled = isAuditEnabled;
  }

  public StatusInfo isQuickShareEnabled(Boolean isQuickShareEnabled) {
    this.isQuickShareEnabled = isQuickShareEnabled;
    return this;
  }

  /**
   * Get isQuickShareEnabled
   * @return isQuickShareEnabled
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsQuickShareEnabled() {
    return isQuickShareEnabled;
  }

  public void setIsQuickShareEnabled(Boolean isQuickShareEnabled) {
    this.isQuickShareEnabled = isQuickShareEnabled;
  }

  public StatusInfo isThumbnailGenerationEnabled(Boolean isThumbnailGenerationEnabled) {
    this.isThumbnailGenerationEnabled = isThumbnailGenerationEnabled;
    return this;
  }

  /**
   * Get isThumbnailGenerationEnabled
   * @return isThumbnailGenerationEnabled
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isIsThumbnailGenerationEnabled() {
    return isThumbnailGenerationEnabled;
  }

  public void setIsThumbnailGenerationEnabled(Boolean isThumbnailGenerationEnabled) {
    this.isThumbnailGenerationEnabled = isThumbnailGenerationEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusInfo statusInfo = (StatusInfo) o;
    return Objects.equals(this.isReadOnly, statusInfo.isReadOnly) &&
        Objects.equals(this.isAuditEnabled, statusInfo.isAuditEnabled) &&
        Objects.equals(this.isQuickShareEnabled, statusInfo.isQuickShareEnabled) &&
        Objects.equals(this.isThumbnailGenerationEnabled, statusInfo.isThumbnailGenerationEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isReadOnly, isAuditEnabled, isQuickShareEnabled, isThumbnailGenerationEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusInfo {\n");
    
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    isAuditEnabled: ").append(toIndentedString(isAuditEnabled)).append("\n");
    sb.append("    isQuickShareEnabled: ").append(toIndentedString(isQuickShareEnabled)).append("\n");
    sb.append("    isThumbnailGenerationEnabled: ").append(toIndentedString(isThumbnailGenerationEnabled)).append("\n");
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

