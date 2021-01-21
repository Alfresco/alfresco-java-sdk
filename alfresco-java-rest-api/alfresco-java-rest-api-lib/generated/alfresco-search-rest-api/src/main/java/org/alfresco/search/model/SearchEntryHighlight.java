package org.alfresco.search.model;

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
 * SearchEntryHighlight
 */
@Validated


public class SearchEntryHighlight   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("snippets")
  @Valid
  private List<String> snippets = null;

  public SearchEntryHighlight field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field where a match occured (one of the fields defined on the request)
   * @return field
  **/
  @ApiModelProperty(value = "The field where a match occured (one of the fields defined on the request)")



  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public SearchEntryHighlight snippets(List<String> snippets) {
    this.snippets = snippets;
    return this;
  }

  public SearchEntryHighlight addSnippetsItem(String snippetsItem) {
    if (this.snippets == null) {
      this.snippets = new ArrayList<>();
    }
    this.snippets.add(snippetsItem);
    return this;
  }

  /**
   * Any number of snippets for the specified field highlighting the matching text
   * @return snippets
  **/
  @ApiModelProperty(value = "Any number of snippets for the specified field highlighting the matching text")



  public List<String> getSnippets() {
    return snippets;
  }

  public void setSnippets(List<String> snippets) {
    this.snippets = snippets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchEntryHighlight searchEntryHighlight = (SearchEntryHighlight) o;
    return Objects.equals(this.field, searchEntryHighlight.field) &&
        Objects.equals(this.snippets, searchEntryHighlight.snippets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, snippets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEntryHighlight {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    snippets: ").append(toIndentedString(snippets)).append("\n");
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

