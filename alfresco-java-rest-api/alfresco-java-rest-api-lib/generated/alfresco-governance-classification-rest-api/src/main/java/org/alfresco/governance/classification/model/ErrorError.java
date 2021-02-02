package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorError
 */
@Validated

public class ErrorError   {
  @JsonProperty("errorKey")
  private String errorKey = null;

  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("briefSummary")
  private String briefSummary = null;

  @JsonProperty("stackTrace")
  private String stackTrace = null;

  @JsonProperty("descriptionURL")
  private String descriptionURL = null;

  public ErrorError errorKey(String errorKey) {
    this.errorKey = errorKey;
    return this;
  }

  /**
   * Get errorKey
   * @return errorKey
  **/
  @ApiModelProperty(value = "")


  public String getErrorKey() {
    return errorKey;
  }

  public void setErrorKey(String errorKey) {
    this.errorKey = errorKey;
  }

  public ErrorError statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ErrorError briefSummary(String briefSummary) {
    this.briefSummary = briefSummary;
    return this;
  }

  /**
   * Get briefSummary
   * @return briefSummary
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBriefSummary() {
    return briefSummary;
  }

  public void setBriefSummary(String briefSummary) {
    this.briefSummary = briefSummary;
  }

  public ErrorError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  /**
   * Get stackTrace
   * @return stackTrace
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public ErrorError descriptionURL(String descriptionURL) {
    this.descriptionURL = descriptionURL;
    return this;
  }

  /**
   * Get descriptionURL
   * @return descriptionURL
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDescriptionURL() {
    return descriptionURL;
  }

  public void setDescriptionURL(String descriptionURL) {
    this.descriptionURL = descriptionURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorError errorError = (ErrorError) o;
    return Objects.equals(this.errorKey, errorError.errorKey) &&
        Objects.equals(this.statusCode, errorError.statusCode) &&
        Objects.equals(this.briefSummary, errorError.briefSummary) &&
        Objects.equals(this.stackTrace, errorError.stackTrace) &&
        Objects.equals(this.descriptionURL, errorError.descriptionURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorKey, statusCode, briefSummary, stackTrace, descriptionURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorError {\n");
    
    sb.append("    errorKey: ").append(toIndentedString(errorKey)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    briefSummary: ").append(toIndentedString(briefSummary)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    descriptionURL: ").append(toIndentedString(descriptionURL)).append("\n");
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

