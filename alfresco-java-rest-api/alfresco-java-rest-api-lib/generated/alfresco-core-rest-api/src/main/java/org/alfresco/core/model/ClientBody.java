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
 * ClientBody
 */
@Validated

public class ClientBody   {
  @JsonProperty("client")
  private String client = null;

  public ClientBody client(String client) {
    this.client = client;
    return this;
  }

  /**
   * the client name
   * @return client
  **/
  @ApiModelProperty(required = true, value = "the client name")
  @NotNull


  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientBody clientBody = (ClientBody) o;
    return Objects.equals(this.client, clientBody.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(client);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientBody {\n");
    
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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

