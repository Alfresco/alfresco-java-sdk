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
 * The consistency state of the index used to execute the query
 */
@ApiModel(description = "The consistency state of the index used to execute the query")
@Validated

public class ResponseConsistency   {
  @JsonProperty("lastTxId")
  private Integer lastTxId = null;

  public ResponseConsistency lastTxId(Integer lastTxId) {
    this.lastTxId = lastTxId;
    return this;
  }

  /**
   * The id of the last indexed transaction
   * @return lastTxId
  **/
  @ApiModelProperty(value = "The id of the last indexed transaction")


  public Integer getLastTxId() {
    return lastTxId;
  }

  public void setLastTxId(Integer lastTxId) {
    this.lastTxId = lastTxId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseConsistency responseConsistency = (ResponseConsistency) o;
    return Objects.equals(this.lastTxId, responseConsistency.lastTxId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTxId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseConsistency {\n");

    sb.append("    lastTxId: ").append(toIndentedString(lastTxId)).append("\n");
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

