package org.alfresco.discovery.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.alfresco.discovery.model.EntitlementsInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LicenseInfo
 */
@Validated


public class LicenseInfo   {
  @JsonProperty("issuedAt")
  private OffsetDateTime issuedAt = null;

  @JsonProperty("expiresAt")
  private OffsetDateTime expiresAt = null;

  @JsonProperty("remainingDays")
  private Integer remainingDays = null;

  @JsonProperty("holder")
  private String holder = null;

  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("entitlements")
  private EntitlementsInfo entitlements = null;

  public LicenseInfo issuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Get issuedAt
   * @return issuedAt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid


  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }

  public LicenseInfo expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Get expiresAt
   * @return expiresAt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid


  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public LicenseInfo remainingDays(Integer remainingDays) {
    this.remainingDays = remainingDays;
    return this;
  }

  /**
   * Get remainingDays
   * @return remainingDays
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public Integer getRemainingDays() {
    return remainingDays;
  }

  public void setRemainingDays(Integer remainingDays) {
    this.remainingDays = remainingDays;
  }

  public LicenseInfo holder(String holder) {
    this.holder = holder;
    return this;
  }

  /**
   * Get holder
   * @return holder
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public LicenseInfo mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public LicenseInfo entitlements(EntitlementsInfo entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  /**
   * Get entitlements
   * @return entitlements
  **/
  @ApiModelProperty(value = "")

  @Valid


  public EntitlementsInfo getEntitlements() {
    return entitlements;
  }

  public void setEntitlements(EntitlementsInfo entitlements) {
    this.entitlements = entitlements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseInfo licenseInfo = (LicenseInfo) o;
    return Objects.equals(this.issuedAt, licenseInfo.issuedAt) &&
        Objects.equals(this.expiresAt, licenseInfo.expiresAt) &&
        Objects.equals(this.remainingDays, licenseInfo.remainingDays) &&
        Objects.equals(this.holder, licenseInfo.holder) &&
        Objects.equals(this.mode, licenseInfo.mode) &&
        Objects.equals(this.entitlements, licenseInfo.entitlements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedAt, expiresAt, remainingDays, holder, mode, entitlements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseInfo {\n");
    
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    remainingDays: ").append(toIndentedString(remainingDays)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
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

