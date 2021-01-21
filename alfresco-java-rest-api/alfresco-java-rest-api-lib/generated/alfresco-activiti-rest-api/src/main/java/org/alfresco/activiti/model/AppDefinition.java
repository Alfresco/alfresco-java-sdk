package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.activiti.model.AppModelDefinition;
import org.alfresco.activiti.model.PublishIdentityInfoRepresentation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AppDefinition
 */
@Validated


public class AppDefinition   {
  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("models")
  @Valid
  private List<AppModelDefinition> models = null;

  @JsonProperty("publishIdentityInfo")
  @Valid
  private List<PublishIdentityInfoRepresentation> publishIdentityInfo = null;

  @JsonProperty("theme")
  private String theme = null;

  public AppDefinition icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")



  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public AppDefinition models(List<AppModelDefinition> models) {
    this.models = models;
    return this;
  }

  public AppDefinition addModelsItem(AppModelDefinition modelsItem) {
    if (this.models == null) {
      this.models = new ArrayList<>();
    }
    this.models.add(modelsItem);
    return this;
  }

  /**
   * Get models
   * @return models
  **/
  @ApiModelProperty(value = "")

  @Valid


  public List<AppModelDefinition> getModels() {
    return models;
  }

  public void setModels(List<AppModelDefinition> models) {
    this.models = models;
  }

  public AppDefinition publishIdentityInfo(List<PublishIdentityInfoRepresentation> publishIdentityInfo) {
    this.publishIdentityInfo = publishIdentityInfo;
    return this;
  }

  public AppDefinition addPublishIdentityInfoItem(PublishIdentityInfoRepresentation publishIdentityInfoItem) {
    if (this.publishIdentityInfo == null) {
      this.publishIdentityInfo = new ArrayList<>();
    }
    this.publishIdentityInfo.add(publishIdentityInfoItem);
    return this;
  }

  /**
   * Get publishIdentityInfo
   * @return publishIdentityInfo
  **/
  @ApiModelProperty(value = "")

  @Valid


  public List<PublishIdentityInfoRepresentation> getPublishIdentityInfo() {
    return publishIdentityInfo;
  }

  public void setPublishIdentityInfo(List<PublishIdentityInfoRepresentation> publishIdentityInfo) {
    this.publishIdentityInfo = publishIdentityInfo;
  }

  public AppDefinition theme(String theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Get theme
   * @return theme
  **/
  @ApiModelProperty(value = "")



  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppDefinition appDefinition = (AppDefinition) o;
    return Objects.equals(this.icon, appDefinition.icon) &&
        Objects.equals(this.models, appDefinition.models) &&
        Objects.equals(this.publishIdentityInfo, appDefinition.publishIdentityInfo) &&
        Objects.equals(this.theme, appDefinition.theme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, models, publishIdentityInfo, theme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppDefinition {\n");
    
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
    sb.append("    publishIdentityInfo: ").append(toIndentedString(publishIdentityInfo)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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

