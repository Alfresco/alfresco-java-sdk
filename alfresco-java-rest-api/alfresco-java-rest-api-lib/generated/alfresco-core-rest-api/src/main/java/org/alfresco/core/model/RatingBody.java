package org.alfresco.core.model;

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
 * RatingBody
 */
@Validated


public class RatingBody   {
  /**
   * The rating scheme type. Possible values are likes and fiveStar.
   */
  public enum IdEnum {
    LIKES("likes"),
    
    FIVESTAR("fiveStar");

    private String value;

    IdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IdEnum fromValue(String text) {
      for (IdEnum b : IdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("id")
  private IdEnum id = IdEnum.LIKES;

  @JsonProperty("myRating")
  private String myRating = null;

  public RatingBody id(IdEnum id) {
    this.id = id;
    return this;
  }

  /**
   * The rating scheme type. Possible values are likes and fiveStar.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The rating scheme type. Possible values are likes and fiveStar.")
  @NotNull



  public IdEnum getId() {
    return id;
  }

  public void setId(IdEnum id) {
    this.id = id;
  }

  public RatingBody myRating(String myRating) {
    this.myRating = myRating;
    return this;
  }

  /**
   * The rating. The type is specific to the rating scheme, boolean for the likes and an integer for the fiveStar
   * @return myRating
  **/
  @ApiModelProperty(required = true, value = "The rating. The type is specific to the rating scheme, boolean for the likes and an integer for the fiveStar")
  @NotNull



  public String getMyRating() {
    return myRating;
  }

  public void setMyRating(String myRating) {
    this.myRating = myRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingBody ratingBody = (RatingBody) o;
    return Objects.equals(this.id, ratingBody.id) &&
        Objects.equals(this.myRating, ratingBody.myRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, myRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingBody {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    myRating: ").append(toIndentedString(myRating)).append("\n");
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

