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
 * Limit the time and resources used for query execution
 */
@ApiModel(description = "Limit the time and resources used for query execution")
@Validated

public class RequestLimits   {
  @JsonProperty("permissionEvaluationTime")
  private Integer permissionEvaluationTime = null;

  @JsonProperty("permissionEvaluationCount")
  private Integer permissionEvaluationCount = null;

  public RequestLimits permissionEvaluationTime(Integer permissionEvaluationTime) {
    this.permissionEvaluationTime = permissionEvaluationTime;
    return this;
  }

  /**
   * Maximum time for post query permission evaluation
   * @return permissionEvaluationTime
  **/
  @ApiModelProperty(value = "Maximum time for post query permission evaluation")


  public Integer getPermissionEvaluationTime() {
    return permissionEvaluationTime;
  }

  public void setPermissionEvaluationTime(Integer permissionEvaluationTime) {
    this.permissionEvaluationTime = permissionEvaluationTime;
  }

  public RequestLimits permissionEvaluationCount(Integer permissionEvaluationCount) {
    this.permissionEvaluationCount = permissionEvaluationCount;
    return this;
  }

  /**
   * Maximum count of post query permission evaluations
   * @return permissionEvaluationCount
  **/
  @ApiModelProperty(value = "Maximum count of post query permission evaluations")


  public Integer getPermissionEvaluationCount() {
    return permissionEvaluationCount;
  }

  public void setPermissionEvaluationCount(Integer permissionEvaluationCount) {
    this.permissionEvaluationCount = permissionEvaluationCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestLimits requestLimits = (RequestLimits) o;
    return Objects.equals(this.permissionEvaluationTime, requestLimits.permissionEvaluationTime) &&
        Objects.equals(this.permissionEvaluationCount, requestLimits.permissionEvaluationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionEvaluationTime, permissionEvaluationCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestLimits {\n");

    sb.append("    permissionEvaluationTime: ").append(toIndentedString(permissionEvaluationTime)).append("\n");
    sb.append("    permissionEvaluationCount: ").append(toIndentedString(permissionEvaluationCount)).append("\n");
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

