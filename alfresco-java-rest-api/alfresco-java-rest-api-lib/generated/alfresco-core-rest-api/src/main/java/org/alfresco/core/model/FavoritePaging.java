package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.core.model.FavoritePagingList;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FavoritePaging
 */
@Validated

public class FavoritePaging   {
  @JsonProperty("list")
  private FavoritePagingList list = null;

  public FavoritePaging list(FavoritePagingList list) {
    this.list = list;
    return this;
  }

  /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public FavoritePagingList getList() {
    return list;
  }

  public void setList(FavoritePagingList list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FavoritePaging favoritePaging = (FavoritePaging) o;
    return Objects.equals(this.list, favoritePaging.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FavoritePaging {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

