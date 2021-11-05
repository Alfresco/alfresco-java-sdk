/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessInstanceQueryRepresentation
 */
@Validated


public class ProcessInstanceQueryRepresentation   {
  @JsonProperty("appDefinitionId")
  private Long appDefinitionId = null;

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
    CREATED_ASC("created-asc"),
    
    CREATED_DESC("created-desc"),
    
    ENDED_ASC("ended-asc"),
    
    ENDED_DESC("ended-desc");

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
    ALL("all"),
    
    COMPLETED("completed"),
    
    RUNNING("running");

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

  public ProcessInstanceQueryRepresentation appDefinitionId(Long appDefinitionId) {
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

  public ProcessInstanceQueryRepresentation page(Integer page) {
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

  public ProcessInstanceQueryRepresentation processDefinitionId(String processDefinitionId) {
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

  public ProcessInstanceQueryRepresentation processInstanceId(String processInstanceId) {
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

  public ProcessInstanceQueryRepresentation size(Integer size) {
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

  public ProcessInstanceQueryRepresentation sort(SortEnum sort) {
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

  public ProcessInstanceQueryRepresentation start(Integer start) {
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

  public ProcessInstanceQueryRepresentation state(StateEnum state) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceQueryRepresentation processInstanceQueryRepresentation = (ProcessInstanceQueryRepresentation) o;
    return Objects.equals(this.appDefinitionId, processInstanceQueryRepresentation.appDefinitionId) &&
        Objects.equals(this.page, processInstanceQueryRepresentation.page) &&
        Objects.equals(this.processDefinitionId, processInstanceQueryRepresentation.processDefinitionId) &&
        Objects.equals(this.processInstanceId, processInstanceQueryRepresentation.processInstanceId) &&
        Objects.equals(this.size, processInstanceQueryRepresentation.size) &&
        Objects.equals(this.sort, processInstanceQueryRepresentation.sort) &&
        Objects.equals(this.start, processInstanceQueryRepresentation.start) &&
        Objects.equals(this.state, processInstanceQueryRepresentation.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDefinitionId, page, processDefinitionId, processInstanceId, size, sort, start, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceQueryRepresentation {\n");
    
    sb.append("    appDefinitionId: ").append(toIndentedString(appDefinitionId)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
