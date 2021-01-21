package org.alfresco.search.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.SearchEntryHighlight;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchEntry
 */
@Validated


public class SearchEntry   {
  @JsonProperty("score")
  private Float score = null;

  @JsonProperty("highlight")
  @Valid
  private List<SearchEntryHighlight> highlight = null;

  public SearchEntry score(Float score) {
    this.score = score;
    return this;
  }

  /**
   * The score for this row
   * @return score
  **/
  @ApiModelProperty(value = "The score for this row")



  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }

  public SearchEntry highlight(List<SearchEntryHighlight> highlight) {
    this.highlight = highlight;
    return this;
  }

  public SearchEntry addHighlightItem(SearchEntryHighlight highlightItem) {
    if (this.highlight == null) {
      this.highlight = new ArrayList<>();
    }
    this.highlight.add(highlightItem);
    return this;
  }

  /**
   * Highlight fragments if requested and available. A match can happen in any of the requested field. 
   * @return highlight
  **/
  @ApiModelProperty(value = "Highlight fragments if requested and available. A match can happen in any of the requested field. ")

  @Valid


  public List<SearchEntryHighlight> getHighlight() {
    return highlight;
  }

  public void setHighlight(List<SearchEntryHighlight> highlight) {
    this.highlight = highlight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchEntry searchEntry = (SearchEntry) o;
    return Objects.equals(this.score, searchEntry.score) &&
        Objects.equals(this.highlight, searchEntry.highlight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, highlight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchEntry {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
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

