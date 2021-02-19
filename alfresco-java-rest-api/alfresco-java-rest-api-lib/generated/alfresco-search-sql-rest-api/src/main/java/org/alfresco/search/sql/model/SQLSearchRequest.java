package org.alfresco.search.sql.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SQLSearchRequest
 */
@Validated

public class SQLSearchRequest   {
  @JsonProperty("stmt")
  private String stmt = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("locales")
  @Valid
  private List<String> locales = null;

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("filterQueries")
  @Valid
  private List<String> filterQueries = null;

  @JsonProperty("includeMetadata")
  private Boolean includeMetadata = null;

  public SQLSearchRequest stmt(String stmt) {
    this.stmt = stmt;
    return this;
  }

  /**
   * Get stmt
   * @return stmt
  **/
  @ApiModelProperty(value = "")


  public String getStmt() {
    return stmt;
  }

  public void setStmt(String stmt) {
    this.stmt = stmt;
  }

  public SQLSearchRequest format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public SQLSearchRequest locales(List<String> locales) {
    this.locales = locales;
    return this;
  }

  public SQLSearchRequest addLocalesItem(String localesItem) {
    if (this.locales == null) {
      this.locales = new ArrayList<>();
    }
    this.locales.add(localesItem);
    return this;
  }

  /**
   * Get locales
   * @return locales
  **/
  @ApiModelProperty(value = "")


  public List<String> getLocales() {
    return locales;
  }

  public void setLocales(List<String> locales) {
    this.locales = locales;
  }

  public SQLSearchRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")


  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public SQLSearchRequest filterQueries(List<String> filterQueries) {
    this.filterQueries = filterQueries;
    return this;
  }

  public SQLSearchRequest addFilterQueriesItem(String filterQueriesItem) {
    if (this.filterQueries == null) {
      this.filterQueries = new ArrayList<>();
    }
    this.filterQueries.add(filterQueriesItem);
    return this;
  }

  /**
   * Get filterQueries
   * @return filterQueries
  **/
  @ApiModelProperty(value = "")


  public List<String> getFilterQueries() {
    return filterQueries;
  }

  public void setFilterQueries(List<String> filterQueries) {
    this.filterQueries = filterQueries;
  }

  public SQLSearchRequest includeMetadata(Boolean includeMetadata) {
    this.includeMetadata = includeMetadata;
    return this;
  }

  /**
   * Get includeMetadata
   * @return includeMetadata
  **/
  @ApiModelProperty(value = "")


  public Boolean isIncludeMetadata() {
    return includeMetadata;
  }

  public void setIncludeMetadata(Boolean includeMetadata) {
    this.includeMetadata = includeMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SQLSearchRequest sqLSearchRequest = (SQLSearchRequest) o;
    return Objects.equals(this.stmt, sqLSearchRequest.stmt) &&
        Objects.equals(this.format, sqLSearchRequest.format) &&
        Objects.equals(this.locales, sqLSearchRequest.locales) &&
        Objects.equals(this.timezone, sqLSearchRequest.timezone) &&
        Objects.equals(this.filterQueries, sqLSearchRequest.filterQueries) &&
        Objects.equals(this.includeMetadata, sqLSearchRequest.includeMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stmt, format, locales, timezone, filterQueries, includeMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SQLSearchRequest {\n");

    sb.append("    stmt: ").append(toIndentedString(stmt)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    filterQueries: ").append(toIndentedString(filterQueries)).append("\n");
    sb.append("    includeMetadata: ").append(toIndentedString(includeMetadata)).append("\n");
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

