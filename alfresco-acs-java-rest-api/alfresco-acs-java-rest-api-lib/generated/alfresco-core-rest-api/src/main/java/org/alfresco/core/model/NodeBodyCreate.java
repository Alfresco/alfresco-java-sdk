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
package org.alfresco.core.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.core.model.AssociationBody;
import org.alfresco.core.model.ChildAssociationBody;
import org.alfresco.core.model.Definition;
import org.alfresco.core.model.NodeBodyCreateAssociation;
import org.alfresco.core.model.PermissionsBody;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NodeBodyCreate
 */
@Validated

public class NodeBodyCreate   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nodeType")
  private String nodeType = null;

  @JsonProperty("aspectNames")
  @Valid
  private List<String> aspectNames = null;

  @JsonProperty("properties")
  private Object properties = null;

  @JsonProperty("permissions")
  private PermissionsBody permissions = null;

  @JsonProperty("definition")
  private Definition definition = null;

  @JsonProperty("relativePath")
  private String relativePath = null;

  @JsonProperty("association")
  private NodeBodyCreateAssociation association = null;

  @JsonProperty("secondaryChildren")
  @Valid
  private List<ChildAssociationBody> secondaryChildren = null;

  @JsonProperty("targets")
  @Valid
  private List<AssociationBody> targets = null;

  public NodeBodyCreate name(String name) {
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

  public NodeBodyCreate nodeType(String nodeType) {
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

  public NodeBodyCreate aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public NodeBodyCreate addAspectNamesItem(String aspectNamesItem) {
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

  public NodeBodyCreate properties(Object properties) {
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

  public NodeBodyCreate permissions(PermissionsBody permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PermissionsBody getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsBody permissions) {
    this.permissions = permissions;
  }

  public NodeBodyCreate definition(Definition definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Definition getDefinition() {
    return definition;
  }

  public void setDefinition(Definition definition) {
    this.definition = definition;
  }

  public NodeBodyCreate relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

  /**
   * Get relativePath
   * @return relativePath
  **/
  @ApiModelProperty(value = "")


  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public NodeBodyCreate association(NodeBodyCreateAssociation association) {
    this.association = association;
    return this;
  }

  /**
   * Get association
   * @return association
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NodeBodyCreateAssociation getAssociation() {
    return association;
  }

  public void setAssociation(NodeBodyCreateAssociation association) {
    this.association = association;
  }

  public NodeBodyCreate secondaryChildren(List<ChildAssociationBody> secondaryChildren) {
    this.secondaryChildren = secondaryChildren;
    return this;
  }

  public NodeBodyCreate addSecondaryChildrenItem(ChildAssociationBody secondaryChildrenItem) {
    if (this.secondaryChildren == null) {
      this.secondaryChildren = new ArrayList<>();
    }
    this.secondaryChildren.add(secondaryChildrenItem);
    return this;
  }

  /**
   * Get secondaryChildren
   * @return secondaryChildren
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ChildAssociationBody> getSecondaryChildren() {
    return secondaryChildren;
  }

  public void setSecondaryChildren(List<ChildAssociationBody> secondaryChildren) {
    this.secondaryChildren = secondaryChildren;
  }

  public NodeBodyCreate targets(List<AssociationBody> targets) {
    this.targets = targets;
    return this;
  }

  public NodeBodyCreate addTargetsItem(AssociationBody targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AssociationBody> getTargets() {
    return targets;
  }

  public void setTargets(List<AssociationBody> targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeBodyCreate nodeBodyCreate = (NodeBodyCreate) o;
    return Objects.equals(this.name, nodeBodyCreate.name) &&
        Objects.equals(this.nodeType, nodeBodyCreate.nodeType) &&
        Objects.equals(this.aspectNames, nodeBodyCreate.aspectNames) &&
        Objects.equals(this.properties, nodeBodyCreate.properties) &&
        Objects.equals(this.permissions, nodeBodyCreate.permissions) &&
        Objects.equals(this.definition, nodeBodyCreate.definition) &&
        Objects.equals(this.relativePath, nodeBodyCreate.relativePath) &&
        Objects.equals(this.association, nodeBodyCreate.association) &&
        Objects.equals(this.secondaryChildren, nodeBodyCreate.secondaryChildren) &&
        Objects.equals(this.targets, nodeBodyCreate.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nodeType, aspectNames, properties, permissions, definition, relativePath, association, secondaryChildren, targets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeBodyCreate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
    sb.append("    association: ").append(toIndentedString(association)).append("\n");
    sb.append("    secondaryChildren: ").append(toIndentedString(secondaryChildren)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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

