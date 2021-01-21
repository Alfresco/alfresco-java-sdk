package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NodeBodyMove
 */
@Validated


public class NodeBodyMove   {
  @JsonProperty("targetParentId")
  private String targetParentId = null;

  @JsonProperty("name")
  private String name = null;

  public NodeBodyMove targetParentId(String targetParentId) {
    this.targetParentId = targetParentId;
    return this;
  }

  /**
   * Get targetParentId
   * @return targetParentId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull



  public String getTargetParentId() {
    return targetParentId;
  }

  public void setTargetParentId(String targetParentId) {
    this.targetParentId = targetParentId;
  }

  public NodeBodyMove name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. 
   * @return name
  **/
  @ApiModelProperty(value = "The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. ")

@Pattern(regexp="^(?!(.*[\\\"\\*\\\\\\>\\<\\?/\\:\\|]+.*)|(.*[\\.]?.*[\\.]+$)|(.*[ ]+$))") 

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeBodyMove nodeBodyMove = (NodeBodyMove) o;
    return Objects.equals(this.targetParentId, nodeBodyMove.targetParentId) &&
        Objects.equals(this.name, nodeBodyMove.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetParentId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeBodyMove {\n");
    
    sb.append("    targetParentId: ").append(toIndentedString(targetParentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

