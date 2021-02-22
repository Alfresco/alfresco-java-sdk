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
package org.alfresco.governance.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.core.model.UserInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransferContainerChild
 */
@Validated

public class TransferContainerChild   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("parentId")
  private String parentId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nodeType")
  private String nodeType = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("createdByUser")
  private UserInfo createdByUser = null;

  @JsonProperty("transferPDFIndicator")
  private Boolean transferPDFIndicator = false;

  @JsonProperty("transferLocation")
  private String transferLocation = null;

  @JsonProperty("transferAccessionIndicator")
  private Boolean transferAccessionIndicator = false;

  @JsonProperty("aspectNames")
  @Valid
  private List<String> aspectNames = null;

  @JsonProperty("properties")
  private Object properties = null;

  @JsonProperty("allowableOperations")
  @Valid
  private List<String> allowableOperations = null;

  public TransferContainerChild id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransferContainerChild parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public TransferContainerChild name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. 
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. ")
  @NotNull

@Pattern(regexp="^(?!(.*[\\\"\\*\\\\\\>\\<\\?/\\:\\|]+.*)|(.*[\\.]?.*[\\.]+$)|(.*[ ]+$))") 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TransferContainerChild nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public TransferContainerChild createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public TransferContainerChild createdByUser(UserInfo createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

  /**
   * Get createdByUser
   * @return createdByUser
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public UserInfo getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(UserInfo createdByUser) {
    this.createdByUser = createdByUser;
  }

  public TransferContainerChild transferPDFIndicator(Boolean transferPDFIndicator) {
    this.transferPDFIndicator = transferPDFIndicator;
    return this;
  }

  /**
   * Present only for transfer nodes.
   * @return transferPDFIndicator
  **/
  @ApiModelProperty(value = "Present only for transfer nodes.")


  public Boolean isTransferPDFIndicator() {
    return transferPDFIndicator;
  }

  public void setTransferPDFIndicator(Boolean transferPDFIndicator) {
    this.transferPDFIndicator = transferPDFIndicator;
  }

  public TransferContainerChild transferLocation(String transferLocation) {
    this.transferLocation = transferLocation;
    return this;
  }

  /**
   * Present only for transfer nodes.
   * @return transferLocation
  **/
  @ApiModelProperty(value = "Present only for transfer nodes.")


  public String getTransferLocation() {
    return transferLocation;
  }

  public void setTransferLocation(String transferLocation) {
    this.transferLocation = transferLocation;
  }

  public TransferContainerChild transferAccessionIndicator(Boolean transferAccessionIndicator) {
    this.transferAccessionIndicator = transferAccessionIndicator;
    return this;
  }

  /**
   * Present only for transfer nodes.
   * @return transferAccessionIndicator
  **/
  @ApiModelProperty(value = "Present only for transfer nodes.")


  public Boolean isTransferAccessionIndicator() {
    return transferAccessionIndicator;
  }

  public void setTransferAccessionIndicator(Boolean transferAccessionIndicator) {
    this.transferAccessionIndicator = transferAccessionIndicator;
  }

  public TransferContainerChild aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public TransferContainerChild addAspectNamesItem(String aspectNamesItem) {
    if (this.aspectNames == null) {
      this.aspectNames = new ArrayList<>();
    }
    this.aspectNames.add(aspectNamesItem);
    return this;
  }

  /**
   * Get aspectNames
   * @return aspectNames
  **/
  @ApiModelProperty(value = "")


  public List<String> getAspectNames() {
    return aspectNames;
  }

  public void setAspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
  }

  public TransferContainerChild properties(Object properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")


  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  public TransferContainerChild allowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
    return this;
  }

  public TransferContainerChild addAllowableOperationsItem(String allowableOperationsItem) {
    if (this.allowableOperations == null) {
      this.allowableOperations = new ArrayList<>();
    }
    this.allowableOperations.add(allowableOperationsItem);
    return this;
  }

  /**
   * Get allowableOperations
   * @return allowableOperations
  **/
  @ApiModelProperty(value = "")


  public List<String> getAllowableOperations() {
    return allowableOperations;
  }

  public void setAllowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferContainerChild transferContainerChild = (TransferContainerChild) o;
    return Objects.equals(this.id, transferContainerChild.id) &&
        Objects.equals(this.parentId, transferContainerChild.parentId) &&
        Objects.equals(this.name, transferContainerChild.name) &&
        Objects.equals(this.nodeType, transferContainerChild.nodeType) &&
        Objects.equals(this.createdAt, transferContainerChild.createdAt) &&
        Objects.equals(this.createdByUser, transferContainerChild.createdByUser) &&
        Objects.equals(this.transferPDFIndicator, transferContainerChild.transferPDFIndicator) &&
        Objects.equals(this.transferLocation, transferContainerChild.transferLocation) &&
        Objects.equals(this.transferAccessionIndicator, transferContainerChild.transferAccessionIndicator) &&
        Objects.equals(this.aspectNames, transferContainerChild.aspectNames) &&
        Objects.equals(this.properties, transferContainerChild.properties) &&
        Objects.equals(this.allowableOperations, transferContainerChild.allowableOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, name, nodeType, createdAt, createdByUser, transferPDFIndicator, transferLocation, transferAccessionIndicator, aspectNames, properties, allowableOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferContainerChild {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    transferPDFIndicator: ").append(toIndentedString(transferPDFIndicator)).append("\n");
    sb.append("    transferLocation: ").append(toIndentedString(transferLocation)).append("\n");
    sb.append("    transferAccessionIndicator: ").append(toIndentedString(transferAccessionIndicator)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    allowableOperations: ").append(toIndentedString(allowableOperations)).append("\n");
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

