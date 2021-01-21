package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DecisionAuditRepresentation
 */
@Validated


public class DecisionAuditRepresentation   {
  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("activityName")
  private String activityName = null;

  @JsonProperty("auditTrailJson")
  private String auditTrailJson = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("decisionExecutionFailed")
  private Boolean decisionExecutionFailed = null;

  @JsonProperty("decisionKey")
  private String decisionKey = null;

  @JsonProperty("decisionModelJson")
  private String decisionModelJson = null;

  @JsonProperty("decisionName")
  private String decisionName = null;

  @JsonProperty("dmnDeploymentId")
  private Long dmnDeploymentId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("renderedVariables")
  private Object renderedVariables = null;

  public DecisionAuditRepresentation activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Get activityId
   * @return activityId
  **/
  @ApiModelProperty(value = "")



  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public DecisionAuditRepresentation activityName(String activityName) {
    this.activityName = activityName;
    return this;
  }

  /**
   * Get activityName
   * @return activityName
  **/
  @ApiModelProperty(value = "")



  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public DecisionAuditRepresentation auditTrailJson(String auditTrailJson) {
    this.auditTrailJson = auditTrailJson;
    return this;
  }

  /**
   * Get auditTrailJson
   * @return auditTrailJson
  **/
  @ApiModelProperty(value = "")



  public String getAuditTrailJson() {
    return auditTrailJson;
  }

  public void setAuditTrailJson(String auditTrailJson) {
    this.auditTrailJson = auditTrailJson;
  }

  public DecisionAuditRepresentation created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")

  @Valid


  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public DecisionAuditRepresentation decisionExecutionFailed(Boolean decisionExecutionFailed) {
    this.decisionExecutionFailed = decisionExecutionFailed;
    return this;
  }

  /**
   * Get decisionExecutionFailed
   * @return decisionExecutionFailed
  **/
  @ApiModelProperty(value = "")



  public Boolean isDecisionExecutionFailed() {
    return decisionExecutionFailed;
  }

  public void setDecisionExecutionFailed(Boolean decisionExecutionFailed) {
    this.decisionExecutionFailed = decisionExecutionFailed;
  }

  public DecisionAuditRepresentation decisionKey(String decisionKey) {
    this.decisionKey = decisionKey;
    return this;
  }

  /**
   * Get decisionKey
   * @return decisionKey
  **/
  @ApiModelProperty(value = "")



  public String getDecisionKey() {
    return decisionKey;
  }

  public void setDecisionKey(String decisionKey) {
    this.decisionKey = decisionKey;
  }

  public DecisionAuditRepresentation decisionModelJson(String decisionModelJson) {
    this.decisionModelJson = decisionModelJson;
    return this;
  }

  /**
   * Get decisionModelJson
   * @return decisionModelJson
  **/
  @ApiModelProperty(value = "")



  public String getDecisionModelJson() {
    return decisionModelJson;
  }

  public void setDecisionModelJson(String decisionModelJson) {
    this.decisionModelJson = decisionModelJson;
  }

  public DecisionAuditRepresentation decisionName(String decisionName) {
    this.decisionName = decisionName;
    return this;
  }

  /**
   * Get decisionName
   * @return decisionName
  **/
  @ApiModelProperty(value = "")



  public String getDecisionName() {
    return decisionName;
  }

  public void setDecisionName(String decisionName) {
    this.decisionName = decisionName;
  }

  public DecisionAuditRepresentation dmnDeploymentId(Long dmnDeploymentId) {
    this.dmnDeploymentId = dmnDeploymentId;
    return this;
  }

  /**
   * Get dmnDeploymentId
   * @return dmnDeploymentId
  **/
  @ApiModelProperty(value = "")



  public Long getDmnDeploymentId() {
    return dmnDeploymentId;
  }

  public void setDmnDeploymentId(Long dmnDeploymentId) {
    this.dmnDeploymentId = dmnDeploymentId;
  }

  public DecisionAuditRepresentation executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Get executionId
   * @return executionId
  **/
  @ApiModelProperty(value = "")



  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public DecisionAuditRepresentation id(Long id) {
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

  public DecisionAuditRepresentation processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Get processDefinitionId
   * @return processDefinitionId
  **/
  @ApiModelProperty(value = "")



  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public DecisionAuditRepresentation processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Get processInstanceId
   * @return processInstanceId
  **/
  @ApiModelProperty(value = "")



  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public DecisionAuditRepresentation renderedVariables(Object renderedVariables) {
    this.renderedVariables = renderedVariables;
    return this;
  }

  /**
   * Get renderedVariables
   * @return renderedVariables
  **/
  @ApiModelProperty(value = "")



  public Object getRenderedVariables() {
    return renderedVariables;
  }

  public void setRenderedVariables(Object renderedVariables) {
    this.renderedVariables = renderedVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionAuditRepresentation decisionAuditRepresentation = (DecisionAuditRepresentation) o;
    return Objects.equals(this.activityId, decisionAuditRepresentation.activityId) &&
        Objects.equals(this.activityName, decisionAuditRepresentation.activityName) &&
        Objects.equals(this.auditTrailJson, decisionAuditRepresentation.auditTrailJson) &&
        Objects.equals(this.created, decisionAuditRepresentation.created) &&
        Objects.equals(this.decisionExecutionFailed, decisionAuditRepresentation.decisionExecutionFailed) &&
        Objects.equals(this.decisionKey, decisionAuditRepresentation.decisionKey) &&
        Objects.equals(this.decisionModelJson, decisionAuditRepresentation.decisionModelJson) &&
        Objects.equals(this.decisionName, decisionAuditRepresentation.decisionName) &&
        Objects.equals(this.dmnDeploymentId, decisionAuditRepresentation.dmnDeploymentId) &&
        Objects.equals(this.executionId, decisionAuditRepresentation.executionId) &&
        Objects.equals(this.id, decisionAuditRepresentation.id) &&
        Objects.equals(this.processDefinitionId, decisionAuditRepresentation.processDefinitionId) &&
        Objects.equals(this.processInstanceId, decisionAuditRepresentation.processInstanceId) &&
        Objects.equals(this.renderedVariables, decisionAuditRepresentation.renderedVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityName, auditTrailJson, created, decisionExecutionFailed, decisionKey, decisionModelJson, decisionName, dmnDeploymentId, executionId, id, processDefinitionId, processInstanceId, renderedVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionAuditRepresentation {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    auditTrailJson: ").append(toIndentedString(auditTrailJson)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    decisionExecutionFailed: ").append(toIndentedString(decisionExecutionFailed)).append("\n");
    sb.append("    decisionKey: ").append(toIndentedString(decisionKey)).append("\n");
    sb.append("    decisionModelJson: ").append(toIndentedString(decisionModelJson)).append("\n");
    sb.append("    decisionName: ").append(toIndentedString(decisionName)).append("\n");
    sb.append("    dmnDeploymentId: ").append(toIndentedString(dmnDeploymentId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    renderedVariables: ").append(toIndentedString(renderedVariables)).append("\n");
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

