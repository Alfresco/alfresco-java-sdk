package org.alfresco.activiti.model;

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
 * ChecklistOrderRepresentation
 */
@Validated

public class ChecklistOrderRepresentation   {
  @JsonProperty("order")
  @Valid
  private List<String> order = null;

  public ChecklistOrderRepresentation order(List<String> order) {
    this.order = order;
    return this;
  }

  public ChecklistOrderRepresentation addOrderItem(String orderItem) {
    if (this.order == null) {
      this.order = new ArrayList<>();
    }
    this.order.add(orderItem);
    return this;
  }

  /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(value = "")


  public List<String> getOrder() {
    return order;
  }

  public void setOrder(List<String> order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChecklistOrderRepresentation checklistOrderRepresentation = (ChecklistOrderRepresentation) o;
    return Objects.equals(this.order, checklistOrderRepresentation.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChecklistOrderRepresentation {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

