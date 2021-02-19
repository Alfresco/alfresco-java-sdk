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
 * RequestSortDefinitionInner
 */
@Validated

public class RequestSortDefinitionInner   {
  /**
   * How to order - using a field, when position of the document in the index, score/relevence.
   */
  public enum TypeEnum {
    FIELD("FIELD"),

    DOCUMENT("DOCUMENT"),

    SCORE("SCORE");

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
  private TypeEnum type = TypeEnum.FIELD;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("ascending")
  private Boolean ascending = false;

  public RequestSortDefinitionInner type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * How to order - using a field, when position of the document in the index, score/relevence.
   * @return type
  **/
  @ApiModelProperty(value = "How to order - using a field, when position of the document in the index, score/relevence.")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RequestSortDefinitionInner field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The name of the field
   * @return field
  **/
  @ApiModelProperty(value = "The name of the field")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public RequestSortDefinitionInner ascending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }

  /**
   * The sort order. (The ordering of nulls is determined by the SOLR configuration)
   * @return ascending
  **/
  @ApiModelProperty(value = "The sort order. (The ordering of nulls is determined by the SOLR configuration)")


  public Boolean isAscending() {
    return ascending;
  }

  public void setAscending(Boolean ascending) {
    this.ascending = ascending;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSortDefinitionInner requestSortDefinitionInner = (RequestSortDefinitionInner) o;
    return Objects.equals(this.type, requestSortDefinitionInner.type) &&
        Objects.equals(this.field, requestSortDefinitionInner.field) &&
        Objects.equals(this.ascending, requestSortDefinitionInner.ascending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, field, ascending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSortDefinitionInner {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    ascending: ").append(toIndentedString(ascending)).append("\n");
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

