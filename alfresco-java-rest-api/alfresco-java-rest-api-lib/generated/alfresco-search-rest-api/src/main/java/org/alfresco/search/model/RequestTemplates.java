package org.alfresco.search.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.search.model.RequestTemplatesInner;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Templates usewd for query expansion. A template called \&quot;WOOF\&quot; defined as \&quot;%(cm:name cm:title)\&quot; allows WOOF:example to generate cm:name:example cm:name:example
 */
@ApiModel(description = "Templates usewd for query expansion. A template called \"WOOF\" defined as \"%(cm:name cm:title)\" allows WOOF:example to generate cm:name:example cm:name:example ")
@Validated

public class RequestTemplates extends ArrayList<RequestTemplatesInner>  {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTemplates {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

