package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskQueryRepresentation
 */
@Validated


public class TaskQueryRepresentation   {
  @JsonProperty("appDefinitionId")
  private Long appDefinitionId = null;

  @JsonProperty("assignment")
  private String assignment = null;

  @JsonProperty("dueAfter")
  private OffsetDateTime dueAfter = null;

  @JsonProperty("dueBefore")
  private OffsetDateTime dueBefore = null;

  @JsonProperty("includeProcessInstance")
  private Boolean includeProcessInstance = null;

  @JsonProperty("includeProcessVariables")
  private Boolean includeProcessVariables = null;

  @JsonProperty("includeTaskLocalVariables")
  private Boolean includeTaskLocalVariables = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("size")
  private Integer size = null;

  /**
   * Gets or Sets sort
   */
  public enum SortEnum {
    CREATED_DESC("created-desc"),
    
    CREATED_ASC("created-asc"),
    
    DUE_DESC("due-desc"),
    
    DUE_ASC("due-asc");

    private String value;

    SortEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortEnum fromValue(String text) {
      for (SortEnum b : SortEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sort")
  private SortEnum sort = null;

  @JsonProperty("start")
  private Integer start = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    ACTIVE("active"),
    
    COMPLETED("completed"),
    
    ALL("all");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("text")
  private String text = null;

  public TaskQueryRepresentation appDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
    return this;
  }

  /**
   * Get appDefinitionId
   * @return appDefinitionId
  **/
  @ApiModelProperty(value = "")



  public Long getAppDefinitionId() {
    return appDefinitionId;
  }

  public void setAppDefinitionId(Long appDefinitionId) {
    this.appDefinitionId = appDefinitionId;
  }

  public TaskQueryRepresentation assignment(String assignment) {
    this.assignment = assignment;
    return this;
  }

  /**
   * Get assignment
   * @return assignment
  **/
  @ApiModelProperty(value = "")



  public String getAssignment() {
    return assignment;
  }

  public void setAssignment(String assignment) {
    this.assignment = assignment;
  }

  public TaskQueryRepresentation dueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
    return this;
  }

  /**
   * Get dueAfter
   * @return dueAfter
  **/
  @ApiModelProperty(value = "")

  @Valid


  public OffsetDateTime getDueAfter() {
    return dueAfter;
  }

  public void setDueAfter(OffsetDateTime dueAfter) {
    this.dueAfter = dueAfter;
  }

  public TaskQueryRepresentation dueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
    return this;
  }

  /**
   * Get dueBefore
   * @return dueBefore
  **/
  @ApiModelProperty(value = "")

  @Valid


  public OffsetDateTime getDueBefore() {
    return dueBefore;
  }

  public void setDueBefore(OffsetDateTime dueBefore) {
    this.dueBefore = dueBefore;
  }

  public TaskQueryRepresentation includeProcessInstance(Boolean includeProcessInstance) {
    this.includeProcessInstance = includeProcessInstance;
    return this;
  }

  /**
   * Get includeProcessInstance
   * @return includeProcessInstance
  **/
  @ApiModelProperty(value = "")



  public Boolean isIncludeProcessInstance() {
    return includeProcessInstance;
  }

  public void setIncludeProcessInstance(Boolean includeProcessInstance) {
    this.includeProcessInstance = includeProcessInstance;
  }

  public TaskQueryRepresentation includeProcessVariables(Boolean includeProcessVariables) {
    this.includeProcessVariables = includeProcessVariables;
    return this;
  }

  /**
   * Get includeProcessVariables
   * @return includeProcessVariables
  **/
  @ApiModelProperty(value = "")



  public Boolean isIncludeProcessVariables() {
    return includeProcessVariables;
  }

  public void setIncludeProcessVariables(Boolean includeProcessVariables) {
    this.includeProcessVariables = includeProcessVariables;
  }

  public TaskQueryRepresentation includeTaskLocalVariables(Boolean includeTaskLocalVariables) {
    this.includeTaskLocalVariables = includeTaskLocalVariables;
    return this;
  }

  /**
   * Get includeTaskLocalVariables
   * @return includeTaskLocalVariables
  **/
  @ApiModelProperty(value = "")



  public Boolean isIncludeTaskLocalVariables() {
    return includeTaskLocalVariables;
  }

  public void setIncludeTaskLocalVariables(Boolean includeTaskLocalVariables) {
    this.includeTaskLocalVariables = includeTaskLocalVariables;
  }

  public TaskQueryRepresentation page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")



  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public TaskQueryRepresentation processDefinitionId(String processDefinitionId) {
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

  public TaskQueryRepresentation processInstanceId(String processInstanceId) {
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

  public TaskQueryRepresentation size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")



  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public TaskQueryRepresentation sort(SortEnum sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")



  public SortEnum getSort() {
    return sort;
  }

  public void setSort(SortEnum sort) {
    this.sort = sort;
  }

  public TaskQueryRepresentation start(Integer start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")



  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public TaskQueryRepresentation state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")



  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public TaskQueryRepresentation taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")



  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public TaskQueryRepresentation text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")



  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskQueryRepresentation taskQueryRepresentation = (TaskQueryRepresentation) o;
    return Objects.equals(this.appDefinitionId, taskQueryRepresentation.appDefinitionId) &&
        Objects.equals(this.assignment, taskQueryRepresentation.assignment) &&
        Objects.equals(this.dueAfter, taskQueryRepresentation.dueAfter) &&
        Objects.equals(this.dueBefore, taskQueryRepresentation.dueBefore) &&
        Objects.equals(this.includeProcessInstance, taskQueryRepresentation.includeProcessInstance) &&
        Objects.equals(this.includeProcessVariables, taskQueryRepresentation.includeProcessVariables) &&
        Objects.equals(this.includeTaskLocalVariables, taskQueryRepresentation.includeTaskLocalVariables) &&
        Objects.equals(this.page, taskQueryRepresentation.page) &&
        Objects.equals(this.processDefinitionId, taskQueryRepresentation.processDefinitionId) &&
        Objects.equals(this.processInstanceId, taskQueryRepresentation.processInstanceId) &&
        Objects.equals(this.size, taskQueryRepresentation.size) &&
        Objects.equals(this.sort, taskQueryRepresentation.sort) &&
        Objects.equals(this.start, taskQueryRepresentation.start) &&
        Objects.equals(this.state, taskQueryRepresentation.state) &&
        Objects.equals(this.taskId, taskQueryRepresentation.taskId) &&
        Objects.equals(this.text, taskQueryRepresentation.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinitionId, assignment, dueAfter, dueBefore, includeProcessInstance, includeProcessVariables, includeTaskLocalVariables, page, processDefinitionId, processInstanceId, size, sort, start, state, taskId, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskQueryRepresentation {\n");
    
    sb.append("    appDefinitionId: ").append(toIndentedString(appDefinitionId)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    dueAfter: ").append(toIndentedString(dueAfter)).append("\n");
    sb.append("    dueBefore: ").append(toIndentedString(dueBefore)).append("\n");
    sb.append("    includeProcessInstance: ").append(toIndentedString(includeProcessInstance)).append("\n");
    sb.append("    includeProcessVariables: ").append(toIndentedString(includeProcessVariables)).append("\n");
    sb.append("    includeTaskLocalVariables: ").append(toIndentedString(includeTaskLocalVariables)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

