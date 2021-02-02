package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request that spellcheck fragments to be added to result set rows The properties reflect SOLR spellcheck parameters. 
 */
@ApiModel(description = "Request that spellcheck fragments to be added to result set rows The properties reflect SOLR spellcheck parameters. ")
@Validated

public class RequestSpellcheck   {
  @JsonProperty("query")
  private String query = null;

  public RequestSpellcheck query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")


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
    RequestSpellcheck requestSpellcheck = (RequestSpellcheck) o;
    return Objects.equals(this.query, requestSpellcheck.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSpellcheck {\n");
    
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

