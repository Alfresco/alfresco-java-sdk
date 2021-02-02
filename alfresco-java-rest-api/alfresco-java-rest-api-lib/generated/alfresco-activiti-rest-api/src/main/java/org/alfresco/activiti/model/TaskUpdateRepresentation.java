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
 * TaskUpdateRepresentation
 */
@Validated

public class TaskUpdateRepresentation   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("categorySet")
  private Boolean categorySet = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("descriptionSet")
  private Boolean descriptionSet = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("dueDateSet")
  private Boolean dueDateSet = null;

  @JsonProperty("formKey")
  private String formKey = null;

  @JsonProperty("formKeySet")
  private Boolean formKeySet = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameSet")
  private Boolean nameSet = null;

  @JsonProperty("parentTaskId")
  private String parentTaskId = null;

  @JsonProperty("parentTaskIdSet")
  private Boolean parentTaskIdSet = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("prioritySet")
  private Boolean prioritySet = null;

  public TaskUpdateRepresentation category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TaskUpdateRepresentation categorySet(Boolean categorySet) {
    this.categorySet = categorySet;
    return this;
  }

  /**
   * Get categorySet
   * @return categorySet
  **/
  @ApiModelProperty(value = "")


  public Boolean isCategorySet() {
    return categorySet;
  }

  public void setCategorySet(Boolean categorySet) {
    this.categorySet = categorySet;
  }

  public TaskUpdateRepresentation description(String description) {
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

  public TaskUpdateRepresentation descriptionSet(Boolean descriptionSet) {
    this.descriptionSet = descriptionSet;
    return this;
  }

  /**
   * Get descriptionSet
   * @return descriptionSet
  **/
  @ApiModelProperty(value = "")


  public Boolean isDescriptionSet() {
    return descriptionSet;
  }

  public void setDescriptionSet(Boolean descriptionSet) {
    this.descriptionSet = descriptionSet;
  }

  public TaskUpdateRepresentation dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public TaskUpdateRepresentation dueDateSet(Boolean dueDateSet) {
    this.dueDateSet = dueDateSet;
    return this;
  }

  /**
   * Get dueDateSet
   * @return dueDateSet
  **/
  @ApiModelProperty(value = "")


  public Boolean isDueDateSet() {
    return dueDateSet;
  }

  public void setDueDateSet(Boolean dueDateSet) {
    this.dueDateSet = dueDateSet;
  }

  public TaskUpdateRepresentation formKey(String formKey) {
    this.formKey = formKey;
    return this;
  }

  /**
   * Get formKey
   * @return formKey
  **/
  @ApiModelProperty(value = "")


  public String getFormKey() {
    return formKey;
  }

  public void setFormKey(String formKey) {
    this.formKey = formKey;
  }

  public TaskUpdateRepresentation formKeySet(Boolean formKeySet) {
    this.formKeySet = formKeySet;
    return this;
  }

  /**
   * Get formKeySet
   * @return formKeySet
  **/
  @ApiModelProperty(value = "")


  public Boolean isFormKeySet() {
    return formKeySet;
  }

  public void setFormKeySet(Boolean formKeySet) {
    this.formKeySet = formKeySet;
  }

  public TaskUpdateRepresentation name(String name) {
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

  public TaskUpdateRepresentation nameSet(Boolean nameSet) {
    this.nameSet = nameSet;
    return this;
  }

  /**
   * Get nameSet
   * @return nameSet
  **/
  @ApiModelProperty(value = "")


  public Boolean isNameSet() {
    return nameSet;
  }

  public void setNameSet(Boolean nameSet) {
    this.nameSet = nameSet;
  }

  public TaskUpdateRepresentation parentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
    return this;
  }

  /**
   * Get parentTaskId
   * @return parentTaskId
  **/
  @ApiModelProperty(value = "")


  public String getParentTaskId() {
    return parentTaskId;
  }

  public void setParentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
  }

  public TaskUpdateRepresentation parentTaskIdSet(Boolean parentTaskIdSet) {
    this.parentTaskIdSet = parentTaskIdSet;
    return this;
  }

  /**
   * Get parentTaskIdSet
   * @return parentTaskIdSet
  **/
  @ApiModelProperty(value = "")


  public Boolean isParentTaskIdSet() {
    return parentTaskIdSet;
  }

  public void setParentTaskIdSet(Boolean parentTaskIdSet) {
    this.parentTaskIdSet = parentTaskIdSet;
  }

  public TaskUpdateRepresentation priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TaskUpdateRepresentation prioritySet(Boolean prioritySet) {
    this.prioritySet = prioritySet;
    return this;
  }

  /**
   * Get prioritySet
   * @return prioritySet
  **/
  @ApiModelProperty(value = "")


  public Boolean isPrioritySet() {
    return prioritySet;
  }

  public void setPrioritySet(Boolean prioritySet) {
    this.prioritySet = prioritySet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskUpdateRepresentation taskUpdateRepresentation = (TaskUpdateRepresentation) o;
    return Objects.equals(this.category, taskUpdateRepresentation.category) &&
        Objects.equals(this.categorySet, taskUpdateRepresentation.categorySet) &&
        Objects.equals(this.description, taskUpdateRepresentation.description) &&
        Objects.equals(this.descriptionSet, taskUpdateRepresentation.descriptionSet) &&
        Objects.equals(this.dueDate, taskUpdateRepresentation.dueDate) &&
        Objects.equals(this.dueDateSet, taskUpdateRepresentation.dueDateSet) &&
        Objects.equals(this.formKey, taskUpdateRepresentation.formKey) &&
        Objects.equals(this.formKeySet, taskUpdateRepresentation.formKeySet) &&
        Objects.equals(this.name, taskUpdateRepresentation.name) &&
        Objects.equals(this.nameSet, taskUpdateRepresentation.nameSet) &&
        Objects.equals(this.parentTaskId, taskUpdateRepresentation.parentTaskId) &&
        Objects.equals(this.parentTaskIdSet, taskUpdateRepresentation.parentTaskIdSet) &&
        Objects.equals(this.priority, taskUpdateRepresentation.priority) &&
        Objects.equals(this.prioritySet, taskUpdateRepresentation.prioritySet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, categorySet, description, descriptionSet, dueDate, dueDateSet, formKey, formKeySet, name, nameSet, parentTaskId, parentTaskIdSet, priority, prioritySet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskUpdateRepresentation {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categorySet: ").append(toIndentedString(categorySet)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionSet: ").append(toIndentedString(descriptionSet)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueDateSet: ").append(toIndentedString(dueDateSet)).append("\n");
    sb.append("    formKey: ").append(toIndentedString(formKey)).append("\n");
    sb.append("    formKeySet: ").append(toIndentedString(formKeySet)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameSet: ").append(toIndentedString(nameSet)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    parentTaskIdSet: ").append(toIndentedString(parentTaskIdSet)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    prioritySet: ").append(toIndentedString(prioritySet)).append("\n");
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

