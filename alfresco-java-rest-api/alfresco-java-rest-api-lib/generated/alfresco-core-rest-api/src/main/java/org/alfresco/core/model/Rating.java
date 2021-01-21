package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.alfresco.core.model.RatingAggregate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A person can rate an item of content by liking it. They can also remove their like of an item of content. API methods exist to get a list of ratings and to add a new rating. 
 */
@ApiModel(description = "A person can rate an item of content by liking it. They can also remove their like of an item of content. API methods exist to get a list of ratings and to add a new rating. ")
@Validated


public class Rating   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("aggregate")
  private RatingAggregate aggregate = null;

  @JsonProperty("ratedAt")
  private OffsetDateTime ratedAt = null;

  @JsonProperty("myRating")
  private String myRating = null;

  public Rating id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Rating aggregate(RatingAggregate aggregate) {
    this.aggregate = aggregate;
    return this;
  }

  /**
   * Get aggregate
   * @return aggregate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid


  public RatingAggregate getAggregate() {
    return aggregate;
  }

  public void setAggregate(RatingAggregate aggregate) {
    this.aggregate = aggregate;
  }

  public Rating ratedAt(OffsetDateTime ratedAt) {
    this.ratedAt = ratedAt;
    return this;
  }

  /**
   * Get ratedAt
   * @return ratedAt
  **/
  @ApiModelProperty(value = "")

  @Valid


  public OffsetDateTime getRatedAt() {
    return ratedAt;
  }

  public void setRatedAt(OffsetDateTime ratedAt) {
    this.ratedAt = ratedAt;
  }

  public Rating myRating(String myRating) {
    this.myRating = myRating;
    return this;
  }

  /**
   * The rating. The type is specific to the rating scheme, boolean for the likes and an integer for the fiveStar.
   * @return myRating
  **/
  @ApiModelProperty(value = "The rating. The type is specific to the rating scheme, boolean for the likes and an integer for the fiveStar.")



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
    Rating rating = (Rating) o;
    return Objects.equals(this.id, rating.id) &&
        Objects.equals(this.aggregate, rating.aggregate) &&
        Objects.equals(this.ratedAt, rating.ratedAt) &&
        Objects.equals(this.myRating, rating.myRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, aggregate, ratedAt, myRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
    sb.append("    ratedAt: ").append(toIndentedString(ratedAt)).append("\n");
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

