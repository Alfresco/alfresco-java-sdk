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
 * A list of stats request.
 */
@ApiModel(description = "A list of stats request.")
@Validated

public class RequestStats   {
  @JsonProperty("field")
  private String field = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("min")
  private Boolean min = true;

  @JsonProperty("max")
  private Boolean max = true;

  @JsonProperty("sum")
  private Boolean sum = true;

  @JsonProperty("countValues")
  private Boolean countValues = true;

  @JsonProperty("missing")
  private Boolean missing = true;

  @JsonProperty("mean")
  private Boolean mean = true;

  @JsonProperty("stddev")
  private Boolean stddev = true;

  @JsonProperty("sumOfSquares")
  private Boolean sumOfSquares = true;

  @JsonProperty("distinctValues")
  private Boolean distinctValues = false;

  @JsonProperty("countDistinct")
  private Boolean countDistinct = false;

  @JsonProperty("cardinality")
  private Boolean cardinality = false;

  @JsonProperty("cardinalityAccuracy")
  private Float cardinalityAccuracy = 0.3f;

  @JsonProperty("excludeFilters")
  @Valid
  private List<String> excludeFilters = null;

  @JsonProperty("percentiles")
  @Valid
  private List<Float> percentiles = null;

  public RequestStats field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The stats field
   * @return field
  **/
  @ApiModelProperty(value = "The stats field")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public RequestStats label(String label) {
    this.label = label;
    return this;
  }

  /**
   * A label to include for reference the stats field
   * @return label
  **/
  @ApiModelProperty(value = "A label to include for reference the stats field")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public RequestStats min(Boolean min) {
    this.min = min;
    return this;
  }

  /**
   * The minimum value of the field
   * @return min
  **/
  @ApiModelProperty(value = "The minimum value of the field")


  public Boolean isMin() {
    return min;
  }

  public void setMin(Boolean min) {
    this.min = min;
  }

  public RequestStats max(Boolean max) {
    this.max = max;
    return this;
  }

  /**
   * The maximum value of the field
   * @return max
  **/
  @ApiModelProperty(value = "The maximum value of the field")


  public Boolean isMax() {
    return max;
  }

  public void setMax(Boolean max) {
    this.max = max;
  }

  public RequestStats sum(Boolean sum) {
    this.sum = sum;
    return this;
  }

  /**
   * The sum of all values of the field
   * @return sum
  **/
  @ApiModelProperty(value = "The sum of all values of the field")


  public Boolean isSum() {
    return sum;
  }

  public void setSum(Boolean sum) {
    this.sum = sum;
  }

  public RequestStats countValues(Boolean countValues) {
    this.countValues = countValues;
    return this;
  }

  /**
   * The number which have a value for this field
   * @return countValues
  **/
  @ApiModelProperty(value = "The number which have a value for this field")


  public Boolean isCountValues() {
    return countValues;
  }

  public void setCountValues(Boolean countValues) {
    this.countValues = countValues;
  }

  public RequestStats missing(Boolean missing) {
    this.missing = missing;
    return this;
  }

  /**
   * The number which do not have a value for this field
   * @return missing
  **/
  @ApiModelProperty(value = "The number which do not have a value for this field")


  public Boolean isMissing() {
    return missing;
  }

  public void setMissing(Boolean missing) {
    this.missing = missing;
  }

  public RequestStats mean(Boolean mean) {
    this.mean = mean;
    return this;
  }

  /**
   * The average
   * @return mean
  **/
  @ApiModelProperty(value = "The average")


  public Boolean isMean() {
    return mean;
  }

  public void setMean(Boolean mean) {
    this.mean = mean;
  }

  public RequestStats stddev(Boolean stddev) {
    this.stddev = stddev;
    return this;
  }

  /**
   * Standard deviation
   * @return stddev
  **/
  @ApiModelProperty(value = "Standard deviation")


  public Boolean isStddev() {
    return stddev;
  }

  public void setStddev(Boolean stddev) {
    this.stddev = stddev;
  }

  public RequestStats sumOfSquares(Boolean sumOfSquares) {
    this.sumOfSquares = sumOfSquares;
    return this;
  }

  /**
   * Sum of all values squared
   * @return sumOfSquares
  **/
  @ApiModelProperty(value = "Sum of all values squared")


  public Boolean isSumOfSquares() {
    return sumOfSquares;
  }

  public void setSumOfSquares(Boolean sumOfSquares) {
    this.sumOfSquares = sumOfSquares;
  }

  public RequestStats distinctValues(Boolean distinctValues) {
    this.distinctValues = distinctValues;
    return this;
  }

  /**
   * The set of all distinct values for the field (This can be very expensive to calculate)
   * @return distinctValues
  **/
  @ApiModelProperty(value = "The set of all distinct values for the field (This can be very expensive to calculate)")


  public Boolean isDistinctValues() {
    return distinctValues;
  }

  public void setDistinctValues(Boolean distinctValues) {
    this.distinctValues = distinctValues;
  }

  public RequestStats countDistinct(Boolean countDistinct) {
    this.countDistinct = countDistinct;
    return this;
  }

  /**
   * The number of distinct values  (This can be very expensive to calculate)
   * @return countDistinct
  **/
  @ApiModelProperty(value = "The number of distinct values  (This can be very expensive to calculate)")


  public Boolean isCountDistinct() {
    return countDistinct;
  }

  public void setCountDistinct(Boolean countDistinct) {
    this.countDistinct = countDistinct;
  }

  public RequestStats cardinality(Boolean cardinality) {
    this.cardinality = cardinality;
    return this;
  }

  /**
   * A statistical approximation of the number of distinct values
   * @return cardinality
  **/
  @ApiModelProperty(value = "A statistical approximation of the number of distinct values")


  public Boolean isCardinality() {
    return cardinality;
  }

  public void setCardinality(Boolean cardinality) {
    this.cardinality = cardinality;
  }

  public RequestStats cardinalityAccuracy(Float cardinalityAccuracy) {
    this.cardinalityAccuracy = cardinalityAccuracy;
    return this;
  }

  /**
   * Number between 0.0 and 1.0 indicating how aggressively the algorithm should try to be accurate. Used with boolean cardinality flag.
   * @return cardinalityAccuracy
  **/
  @ApiModelProperty(value = "Number between 0.0 and 1.0 indicating how aggressively the algorithm should try to be accurate. Used with boolean cardinality flag.")


  public Float getCardinalityAccuracy() {
    return cardinalityAccuracy;
  }

  public void setCardinalityAccuracy(Float cardinalityAccuracy) {
    this.cardinalityAccuracy = cardinalityAccuracy;
  }

  public RequestStats excludeFilters(List<String> excludeFilters) {
    this.excludeFilters = excludeFilters;
    return this;
  }

  public RequestStats addExcludeFiltersItem(String excludeFiltersItem) {
    if (this.excludeFilters == null) {
      this.excludeFilters = new ArrayList<>();
    }
    this.excludeFilters.add(excludeFiltersItem);
    return this;
  }

  /**
   * A list of filters to exclude
   * @return excludeFilters
  **/
  @ApiModelProperty(value = "A list of filters to exclude")


  public List<String> getExcludeFilters() {
    return excludeFilters;
  }

  public void setExcludeFilters(List<String> excludeFilters) {
    this.excludeFilters = excludeFilters;
  }

  public RequestStats percentiles(List<Float> percentiles) {
    this.percentiles = percentiles;
    return this;
  }

  public RequestStats addPercentilesItem(Float percentilesItem) {
    if (this.percentiles == null) {
      this.percentiles = new ArrayList<>();
    }
    this.percentiles.add(percentilesItem);
    return this;
  }

  /**
   * A list of percentile values, e.g. \"1,99,99.9\"
   * @return percentiles
  **/
  @ApiModelProperty(value = "A list of percentile values, e.g. \"1,99,99.9\"")


  public List<Float> getPercentiles() {
    return percentiles;
  }

  public void setPercentiles(List<Float> percentiles) {
    this.percentiles = percentiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestStats requestStats = (RequestStats) o;
    return Objects.equals(this.field, requestStats.field) &&
        Objects.equals(this.label, requestStats.label) &&
        Objects.equals(this.min, requestStats.min) &&
        Objects.equals(this.max, requestStats.max) &&
        Objects.equals(this.sum, requestStats.sum) &&
        Objects.equals(this.countValues, requestStats.countValues) &&
        Objects.equals(this.missing, requestStats.missing) &&
        Objects.equals(this.mean, requestStats.mean) &&
        Objects.equals(this.stddev, requestStats.stddev) &&
        Objects.equals(this.sumOfSquares, requestStats.sumOfSquares) &&
        Objects.equals(this.distinctValues, requestStats.distinctValues) &&
        Objects.equals(this.countDistinct, requestStats.countDistinct) &&
        Objects.equals(this.cardinality, requestStats.cardinality) &&
        Objects.equals(this.cardinalityAccuracy, requestStats.cardinalityAccuracy) &&
        Objects.equals(this.excludeFilters, requestStats.excludeFilters) &&
        Objects.equals(this.percentiles, requestStats.percentiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, label, min, max, sum, countValues, missing, mean, stddev, sumOfSquares, distinctValues, countDistinct, cardinality, cardinalityAccuracy, excludeFilters, percentiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestStats {\n");

    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    countValues: ").append(toIndentedString(countValues)).append("\n");
    sb.append("    missing: ").append(toIndentedString(missing)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    stddev: ").append(toIndentedString(stddev)).append("\n");
    sb.append("    sumOfSquares: ").append(toIndentedString(sumOfSquares)).append("\n");
    sb.append("    distinctValues: ").append(toIndentedString(distinctValues)).append("\n");
    sb.append("    countDistinct: ").append(toIndentedString(countDistinct)).append("\n");
    sb.append("    cardinality: ").append(toIndentedString(cardinality)).append("\n");
    sb.append("    cardinalityAccuracy: ").append(toIndentedString(cardinalityAccuracy)).append("\n");
    sb.append("    excludeFilters: ").append(toIndentedString(excludeFilters)).append("\n");
    sb.append("    percentiles: ").append(toIndentedString(percentiles)).append("\n");
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

