package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeclassificationDateRecalculationProcessEntry
 */
@Validated

public class DeclassificationDateRecalculationProcessEntry   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("startedAt")
  private OffsetDateTime startedAt = null;

  @JsonProperty("endedAt")
  private OffsetDateTime endedAt = null;

  @JsonProperty("lastDeclassificationTimeFrame")
  private Integer lastDeclassificationTimeFrame = null;

  public DeclassificationDateRecalculationProcessEntry id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeclassificationDateRecalculationProcessEntry startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public DeclassificationDateRecalculationProcessEntry endedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
    return this;
  }

  /**
   * Get endedAt
   * @return endedAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
  }

  public DeclassificationDateRecalculationProcessEntry lastDeclassificationTimeFrame(Integer lastDeclassificationTimeFrame) {
    this.lastDeclassificationTimeFrame = lastDeclassificationTimeFrame;
    return this;
  }

  /**
   * The declassification time frame when the process last ran (in years).
   * @return lastDeclassificationTimeFrame
  **/
  @ApiModelProperty(value = "The declassification time frame when the process last ran (in years).")


  public Integer getLastDeclassificationTimeFrame() {
    return lastDeclassificationTimeFrame;
  }

  public void setLastDeclassificationTimeFrame(Integer lastDeclassificationTimeFrame) {
    this.lastDeclassificationTimeFrame = lastDeclassificationTimeFrame;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeclassificationDateRecalculationProcessEntry declassificationDateRecalculationProcessEntry = (DeclassificationDateRecalculationProcessEntry) o;
    return Objects.equals(this.id, declassificationDateRecalculationProcessEntry.id) &&
        Objects.equals(this.startedAt, declassificationDateRecalculationProcessEntry.startedAt) &&
        Objects.equals(this.endedAt, declassificationDateRecalculationProcessEntry.endedAt) &&
        Objects.equals(this.lastDeclassificationTimeFrame, declassificationDateRecalculationProcessEntry.lastDeclassificationTimeFrame);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startedAt, endedAt, lastDeclassificationTimeFrame);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclassificationDateRecalculationProcessEntry {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    lastDeclassificationTimeFrame: ").append(toIndentedString(lastDeclassificationTimeFrame)).append("\n");
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

