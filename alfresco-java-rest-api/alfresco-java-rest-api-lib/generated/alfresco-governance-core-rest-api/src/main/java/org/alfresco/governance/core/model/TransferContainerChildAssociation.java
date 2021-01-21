package org.alfresco.governance.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.core.model.ChildAssociationInfo;
import org.alfresco.governance.core.model.TransferContainerChild;
import org.alfresco.governance.core.model.UserInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransferContainerChildAssociation
 */
@Validated


public class TransferContainerChildAssociation   {
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

  @JsonProperty("association")
  private ChildAssociationInfo association = null;

  public TransferContainerChildAssociation id(String id) {
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

  public TransferContainerChildAssociation parentId(String parentId) {
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

  public TransferContainerChildAssociation name(String name) {
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

  public TransferContainerChildAssociation nodeType(String nodeType) {
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

  public TransferContainerChildAssociation createdAt(OffsetDateTime createdAt) {
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

  public TransferContainerChildAssociation createdByUser(UserInfo createdByUser) {
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

  public TransferContainerChildAssociation transferPDFIndicator(Boolean transferPDFIndicator) {
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

  public TransferContainerChildAssociation transferLocation(String transferLocation) {
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

  public TransferContainerChildAssociation transferAccessionIndicator(Boolean transferAccessionIndicator) {
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

  public TransferContainerChildAssociation aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public TransferContainerChildAssociation addAspectNamesItem(String aspectNamesItem) {
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

  public TransferContainerChildAssociation properties(Object properties) {
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

  public TransferContainerChildAssociation allowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
    return this;
  }

  public TransferContainerChildAssociation addAllowableOperationsItem(String allowableOperationsItem) {
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

  public TransferContainerChildAssociation association(ChildAssociationInfo association) {
    this.association = association;
    return this;
  }

  /**
   * Get association
   * @return association
  **/
  @ApiModelProperty(value = "")

  @Valid


  public ChildAssociationInfo getAssociation() {
    return association;
  }

  public void setAssociation(ChildAssociationInfo association) {
    this.association = association;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferContainerChildAssociation transferContainerChildAssociation = (TransferContainerChildAssociation) o;
    return Objects.equals(this.id, transferContainerChildAssociation.id) &&
        Objects.equals(this.parentId, transferContainerChildAssociation.parentId) &&
        Objects.equals(this.name, transferContainerChildAssociation.name) &&
        Objects.equals(this.nodeType, transferContainerChildAssociation.nodeType) &&
        Objects.equals(this.createdAt, transferContainerChildAssociation.createdAt) &&
        Objects.equals(this.createdByUser, transferContainerChildAssociation.createdByUser) &&
        Objects.equals(this.transferPDFIndicator, transferContainerChildAssociation.transferPDFIndicator) &&
        Objects.equals(this.transferLocation, transferContainerChildAssociation.transferLocation) &&
        Objects.equals(this.transferAccessionIndicator, transferContainerChildAssociation.transferAccessionIndicator) &&
        Objects.equals(this.aspectNames, transferContainerChildAssociation.aspectNames) &&
        Objects.equals(this.properties, transferContainerChildAssociation.properties) &&
        Objects.equals(this.allowableOperations, transferContainerChildAssociation.allowableOperations) &&
        Objects.equals(this.association, transferContainerChildAssociation.association);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, name, nodeType, createdAt, createdByUser, transferPDFIndicator, transferLocation, transferAccessionIndicator, aspectNames, properties, allowableOperations, association);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferContainerChildAssociation {\n");
    
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
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
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

