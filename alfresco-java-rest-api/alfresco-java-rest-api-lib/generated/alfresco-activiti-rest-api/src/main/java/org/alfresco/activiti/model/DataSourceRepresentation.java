package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.alfresco.activiti.model.DataSourceConfigRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DataSourceRepresentation
 */
@Validated

public class DataSourceRepresentation   {
  @JsonProperty("config")
  private DataSourceConfigRepresentation config = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tenantId")
  private Long tenantId = null;

  public DataSourceRepresentation config(DataSourceConfigRepresentation config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DataSourceConfigRepresentation getConfig() {
    return config;
  }

  public void setConfig(DataSourceConfigRepresentation config) {
    this.config = config;
  }

  public DataSourceRepresentation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DataSourceRepresentation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataSourceRepresentation tenantId(Long tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")


  public Long getTenantId() {
    return tenantId;
  }

  public void setTenantId(Long tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSourceRepresentation dataSourceRepresentation = (DataSourceRepresentation) o;
    return Objects.equals(this.config, dataSourceRepresentation.config) &&
        Objects.equals(this.id, dataSourceRepresentation.id) &&
        Objects.equals(this.name, dataSourceRepresentation.name) &&
        Objects.equals(this.tenantId, dataSourceRepresentation.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, id, name, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSourceRepresentation {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

