package org.alfresco.search.model;

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
 * Query.
 */
@ApiModel(description = "Query.")
@Validated

public class RequestQuery   {
  /**
   * The query language in which the query is written.
   */
  public enum LanguageEnum {
    AFTS("afts"),
    
    LUCENE("lucene"),
    
    CMIS("cmis");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("language")
  private LanguageEnum language = LanguageEnum.AFTS;

  @JsonProperty("userQuery")
  private String userQuery = null;

  @JsonProperty("query")
  private String query = null;

  public RequestQuery language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  /**
   * The query language in which the query is written.
   * @return language
  **/
  @ApiModelProperty(value = "The query language in which the query is written.")


  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public RequestQuery userQuery(String userQuery) {
    this.userQuery = userQuery;
    return this;
  }

  /**
   * The exact search request typed in by the user
   * @return userQuery
  **/
  @ApiModelProperty(value = "The exact search request typed in by the user")


  public String getUserQuery() {
    return userQuery;
  }

  public void setUserQuery(String userQuery) {
    this.userQuery = userQuery;
  }

  public RequestQuery query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query which may have been generated in some way from the userQuery
   * @return query
  **/
  @ApiModelProperty(required = true, value = "The query which may have been generated in some way from the userQuery")
  @NotNull


  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestQuery requestQuery = (RequestQuery) o;
    return Objects.equals(this.language, requestQuery.language) &&
        Objects.equals(this.userQuery, requestQuery.userQuery) &&
        Objects.equals(this.query, requestQuery.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, userQuery, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestQuery {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    userQuery: ").append(toIndentedString(userQuery)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

