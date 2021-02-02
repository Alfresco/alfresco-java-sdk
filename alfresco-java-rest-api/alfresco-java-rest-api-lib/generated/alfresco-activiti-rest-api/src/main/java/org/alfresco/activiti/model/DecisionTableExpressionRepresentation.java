package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.Mapstringstring;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DecisionTableExpressionRepresentation
 */
@Validated

public class DecisionTableExpressionRepresentation   {
  @JsonProperty("entries")
  @Valid
  private List<Mapstringstring> entries = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("newVariable")
  private Boolean newVariable = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("variableId")
  private String variableId = null;

  @JsonProperty("variableType")
  private String variableType = null;

  public DecisionTableExpressionRepresentation entries(List<Mapstringstring> entries) {
    this.entries = entries;
    return this;
  }

  public DecisionTableExpressionRepresentation addEntriesItem(Mapstringstring entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Mapstringstring> getEntries() {
    return entries;
  }

  public void setEntries(List<Mapstringstring> entries) {
    this.entries = entries;
  }

  public DecisionTableExpressionRepresentation id(String id) {
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

  public DecisionTableExpressionRepresentation label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DecisionTableExpressionRepresentation newVariable(Boolean newVariable) {
    this.newVariable = newVariable;
    return this;
  }

  /**
   * Get newVariable
   * @return newVariable
  **/
  @ApiModelProperty(value = "")


  public Boolean isNewVariable() {
    return newVariable;
  }

  public void setNewVariable(Boolean newVariable) {
    this.newVariable = newVariable;
  }

  public DecisionTableExpressionRepresentation type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DecisionTableExpressionRepresentation variableId(String variableId) {
    this.variableId = variableId;
    return this;
  }

  /**
   * Get variableId
   * @return variableId
  **/
  @ApiModelProperty(value = "")


  public String getVariableId() {
    return variableId;
  }

  public void setVariableId(String variableId) {
    this.variableId = variableId;
  }

  public DecisionTableExpressionRepresentation variableType(String variableType) {
    this.variableType = variableType;
    return this;
  }

  /**
   * Get variableType
   * @return variableType
  **/
  @ApiModelProperty(value = "")


  public String getVariableType() {
    return variableType;
  }

  public void setVariableType(String variableType) {
    this.variableType = variableType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableExpressionRepresentation decisionTableExpressionRepresentation = (DecisionTableExpressionRepresentation) o;
    return Objects.equals(this.entries, decisionTableExpressionRepresentation.entries) &&
        Objects.equals(this.id, decisionTableExpressionRepresentation.id) &&
        Objects.equals(this.label, decisionTableExpressionRepresentation.label) &&
        Objects.equals(this.newVariable, decisionTableExpressionRepresentation.newVariable) &&
        Objects.equals(this.type, decisionTableExpressionRepresentation.type) &&
        Objects.equals(this.variableId, decisionTableExpressionRepresentation.variableId) &&
        Objects.equals(this.variableType, decisionTableExpressionRepresentation.variableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, id, label, newVariable, type, variableId, variableType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableExpressionRepresentation {\n");
    
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    newVariable: ").append(toIndentedString(newVariable)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    variableId: ").append(toIndentedString(variableId)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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

