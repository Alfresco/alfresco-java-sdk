package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.DecisionTableExpressionRepresentation;
import org.alfresco.activiti.model.Mapstringobject;
import org.alfresco.activiti.model.VariableScopeRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DecisionTableDefinitionRepresentation
 */
@Validated

public class DecisionTableDefinitionRepresentation   {
  @JsonProperty("completenessIndicator")
  private String completenessIndicator = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("executionVariables")
  @Valid
  private List<VariableScopeRepresentation> executionVariables = null;

  @JsonProperty("hitIndicator")
  private String hitIndicator = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("inputExpressions")
  @Valid
  private List<DecisionTableExpressionRepresentation> inputExpressions = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("outputExpressions")
  @Valid
  private List<DecisionTableExpressionRepresentation> outputExpressions = null;

  @JsonProperty("rules")
  @Valid
  private List<Mapstringobject> rules = null;

  public DecisionTableDefinitionRepresentation completenessIndicator(String completenessIndicator) {
    this.completenessIndicator = completenessIndicator;
    return this;
  }

  /**
   * Get completenessIndicator
   * @return completenessIndicator
  **/
  @ApiModelProperty(value = "")


  public String getCompletenessIndicator() {
    return completenessIndicator;
  }

  public void setCompletenessIndicator(String completenessIndicator) {
    this.completenessIndicator = completenessIndicator;
  }

  public DecisionTableDefinitionRepresentation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DecisionTableDefinitionRepresentation executionVariables(List<VariableScopeRepresentation> executionVariables) {
    this.executionVariables = executionVariables;
    return this;
  }

  public DecisionTableDefinitionRepresentation addExecutionVariablesItem(VariableScopeRepresentation executionVariablesItem) {
    if (this.executionVariables == null) {
      this.executionVariables = new ArrayList<>();
    }
    this.executionVariables.add(executionVariablesItem);
    return this;
  }

  /**
   * Get executionVariables
   * @return executionVariables
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<VariableScopeRepresentation> getExecutionVariables() {
    return executionVariables;
  }

  public void setExecutionVariables(List<VariableScopeRepresentation> executionVariables) {
    this.executionVariables = executionVariables;
  }

  public DecisionTableDefinitionRepresentation hitIndicator(String hitIndicator) {
    this.hitIndicator = hitIndicator;
    return this;
  }

  /**
   * Get hitIndicator
   * @return hitIndicator
  **/
  @ApiModelProperty(value = "")


  public String getHitIndicator() {
    return hitIndicator;
  }

  public void setHitIndicator(String hitIndicator) {
    this.hitIndicator = hitIndicator;
  }

  public DecisionTableDefinitionRepresentation id(Long id) {
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

  public DecisionTableDefinitionRepresentation inputExpressions(List<DecisionTableExpressionRepresentation> inputExpressions) {
    this.inputExpressions = inputExpressions;
    return this;
  }

  public DecisionTableDefinitionRepresentation addInputExpressionsItem(DecisionTableExpressionRepresentation inputExpressionsItem) {
    if (this.inputExpressions == null) {
      this.inputExpressions = new ArrayList<>();
    }
    this.inputExpressions.add(inputExpressionsItem);
    return this;
  }

  /**
   * Get inputExpressions
   * @return inputExpressions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DecisionTableExpressionRepresentation> getInputExpressions() {
    return inputExpressions;
  }

  public void setInputExpressions(List<DecisionTableExpressionRepresentation> inputExpressions) {
    this.inputExpressions = inputExpressions;
  }

  public DecisionTableDefinitionRepresentation key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DecisionTableDefinitionRepresentation name(String name) {
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

  public DecisionTableDefinitionRepresentation outputExpressions(List<DecisionTableExpressionRepresentation> outputExpressions) {
    this.outputExpressions = outputExpressions;
    return this;
  }

  public DecisionTableDefinitionRepresentation addOutputExpressionsItem(DecisionTableExpressionRepresentation outputExpressionsItem) {
    if (this.outputExpressions == null) {
      this.outputExpressions = new ArrayList<>();
    }
    this.outputExpressions.add(outputExpressionsItem);
    return this;
  }

  /**
   * Get outputExpressions
   * @return outputExpressions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DecisionTableExpressionRepresentation> getOutputExpressions() {
    return outputExpressions;
  }

  public void setOutputExpressions(List<DecisionTableExpressionRepresentation> outputExpressions) {
    this.outputExpressions = outputExpressions;
  }

  public DecisionTableDefinitionRepresentation rules(List<Mapstringobject> rules) {
    this.rules = rules;
    return this;
  }

  public DecisionTableDefinitionRepresentation addRulesItem(Mapstringobject rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Mapstringobject> getRules() {
    return rules;
  }

  public void setRules(List<Mapstringobject> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionTableDefinitionRepresentation decisionTableDefinitionRepresentation = (DecisionTableDefinitionRepresentation) o;
    return Objects.equals(this.completenessIndicator, decisionTableDefinitionRepresentation.completenessIndicator) &&
        Objects.equals(this.description, decisionTableDefinitionRepresentation.description) &&
        Objects.equals(this.executionVariables, decisionTableDefinitionRepresentation.executionVariables) &&
        Objects.equals(this.hitIndicator, decisionTableDefinitionRepresentation.hitIndicator) &&
        Objects.equals(this.id, decisionTableDefinitionRepresentation.id) &&
        Objects.equals(this.inputExpressions, decisionTableDefinitionRepresentation.inputExpressions) &&
        Objects.equals(this.key, decisionTableDefinitionRepresentation.key) &&
        Objects.equals(this.name, decisionTableDefinitionRepresentation.name) &&
        Objects.equals(this.outputExpressions, decisionTableDefinitionRepresentation.outputExpressions) &&
        Objects.equals(this.rules, decisionTableDefinitionRepresentation.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completenessIndicator, description, executionVariables, hitIndicator, id, inputExpressions, key, name, outputExpressions, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableDefinitionRepresentation {\n");
    
    sb.append("    completenessIndicator: ").append(toIndentedString(completenessIndicator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    executionVariables: ").append(toIndentedString(executionVariables)).append("\n");
    sb.append("    hitIndicator: ").append(toIndentedString(hitIndicator)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputExpressions: ").append(toIndentedString(inputExpressions)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputExpressions: ").append(toIndentedString(outputExpressions)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

