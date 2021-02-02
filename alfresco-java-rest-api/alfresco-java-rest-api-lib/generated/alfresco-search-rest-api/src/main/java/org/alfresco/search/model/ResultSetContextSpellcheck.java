package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResultSetContextSpellcheck
 */
@Validated

public class ResultSetContextSpellcheck   {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    SEARCHINSTEADFOR("searchInsteadFor"),
    
    DIDYOUMEAN("didYouMean");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("suggestion")
  @Valid
  private List<String> suggestion = null;

  public ResultSetContextSpellcheck type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ResultSetContextSpellcheck suggestion(List<String> suggestion) {
    this.suggestion = suggestion;
    return this;
  }

  public ResultSetContextSpellcheck addSuggestionItem(String suggestionItem) {
    if (this.suggestion == null) {
      this.suggestion = new ArrayList<>();
    }
    this.suggestion.add(suggestionItem);
    return this;
  }

  /**
   * A suggested alternative query
   * @return suggestion
  **/
  @ApiModelProperty(value = "A suggested alternative query")


  public List<String> getSuggestion() {
    return suggestion;
  }

  public void setSuggestion(List<String> suggestion) {
    this.suggestion = suggestion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultSetContextSpellcheck resultSetContextSpellcheck = (ResultSetContextSpellcheck) o;
    return Objects.equals(this.type, resultSetContextSpellcheck.type) &&
        Objects.equals(this.suggestion, resultSetContextSpellcheck.suggestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, suggestion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultSetContextSpellcheck {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
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

