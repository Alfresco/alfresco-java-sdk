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
 * JsonNode
 */
@Validated

public class JsonNode   {
  @JsonProperty("array")
  private Boolean array = null;

  @JsonProperty("bigDecimal")
  private Boolean bigDecimal = null;

  @JsonProperty("bigInteger")
  private Boolean bigInteger = null;

  @JsonProperty("binary")
  private Boolean binary = null;

  @JsonProperty("boolean")
  private Boolean _boolean = null;

  @JsonProperty("containerNode")
  private Boolean containerNode = null;

  @JsonProperty("double")
  private Boolean _double = null;

  @JsonProperty("empty")
  private Boolean empty = null;

  @JsonProperty("float")
  private Boolean _float = null;

  @JsonProperty("floatingPointNumber")
  private Boolean floatingPointNumber = null;

  @JsonProperty("int")
  private Boolean _int = null;

  @JsonProperty("integralNumber")
  private Boolean integralNumber = null;

  @JsonProperty("long")
  private Boolean _long = null;

  @JsonProperty("missingNode")
  private Boolean missingNode = null;

  /**
   * Gets or Sets nodeType
   */
  public enum NodeTypeEnum {
    ARRAY("ARRAY"),
    
    BINARY("BINARY"),
    
    BOOLEAN("BOOLEAN"),
    
    MISSING("MISSING"),
    
    NULL("NULL"),
    
    NUMBER("NUMBER"),
    
    OBJECT("OBJECT"),
    
    POJO("POJO"),
    
    STRING("STRING");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NodeTypeEnum fromValue(String text) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nodeType")
  private NodeTypeEnum nodeType = null;

  @JsonProperty("null")
  private Boolean _null = null;

  @JsonProperty("number")
  private Boolean number = null;

  @JsonProperty("object")
  private Boolean object = null;

  @JsonProperty("pojo")
  private Boolean pojo = null;

  @JsonProperty("short")
  private Boolean _short = null;

  @JsonProperty("textual")
  private Boolean textual = null;

  @JsonProperty("valueNode")
  private Boolean valueNode = null;

  public JsonNode array(Boolean array) {
    this.array = array;
    return this;
  }

  /**
   * Get array
   * @return array
  **/
  @ApiModelProperty(value = "")


  public Boolean isArray() {
    return array;
  }

  public void setArray(Boolean array) {
    this.array = array;
  }

  public JsonNode bigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
    return this;
  }

  /**
   * Get bigDecimal
   * @return bigDecimal
  **/
  @ApiModelProperty(value = "")


  public Boolean isBigDecimal() {
    return bigDecimal;
  }

  public void setBigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
  }

  public JsonNode bigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
    return this;
  }

  /**
   * Get bigInteger
   * @return bigInteger
  **/
  @ApiModelProperty(value = "")


  public Boolean isBigInteger() {
    return bigInteger;
  }

  public void setBigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
  }

  public JsonNode binary(Boolean binary) {
    this.binary = binary;
    return this;
  }

  /**
   * Get binary
   * @return binary
  **/
  @ApiModelProperty(value = "")


  public Boolean isBinary() {
    return binary;
  }

  public void setBinary(Boolean binary) {
    this.binary = binary;
  }

  public JsonNode _boolean(Boolean _boolean) {
    this._boolean = _boolean;
    return this;
  }

  /**
   * Get _boolean
   * @return _boolean
  **/
  @ApiModelProperty(value = "")


  public Boolean isBoolean() {
    return _boolean;
  }

  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }

  public JsonNode containerNode(Boolean containerNode) {
    this.containerNode = containerNode;
    return this;
  }

  /**
   * Get containerNode
   * @return containerNode
  **/
  @ApiModelProperty(value = "")


  public Boolean isContainerNode() {
    return containerNode;
  }

  public void setContainerNode(Boolean containerNode) {
    this.containerNode = containerNode;
  }

  public JsonNode _double(Boolean _double) {
    this._double = _double;
    return this;
  }

  /**
   * Get _double
   * @return _double
  **/
  @ApiModelProperty(value = "")


  public Boolean isDouble() {
    return _double;
  }

  public void setDouble(Boolean _double) {
    this._double = _double;
  }

  public JsonNode empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
  **/
  @ApiModelProperty(value = "")


  public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public JsonNode _float(Boolean _float) {
    this._float = _float;
    return this;
  }

  /**
   * Get _float
   * @return _float
  **/
  @ApiModelProperty(value = "")


  public Boolean isFloat() {
    return _float;
  }

  public void setFloat(Boolean _float) {
    this._float = _float;
  }

  public JsonNode floatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
    return this;
  }

  /**
   * Get floatingPointNumber
   * @return floatingPointNumber
  **/
  @ApiModelProperty(value = "")


  public Boolean isFloatingPointNumber() {
    return floatingPointNumber;
  }

  public void setFloatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
  }

  public JsonNode _int(Boolean _int) {
    this._int = _int;
    return this;
  }

  /**
   * Get _int
   * @return _int
  **/
  @ApiModelProperty(value = "")


  public Boolean isInt() {
    return _int;
  }

  public void setInt(Boolean _int) {
    this._int = _int;
  }

  public JsonNode integralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
    return this;
  }

  /**
   * Get integralNumber
   * @return integralNumber
  **/
  @ApiModelProperty(value = "")


  public Boolean isIntegralNumber() {
    return integralNumber;
  }

  public void setIntegralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
  }

  public JsonNode _long(Boolean _long) {
    this._long = _long;
    return this;
  }

  /**
   * Get _long
   * @return _long
  **/
  @ApiModelProperty(value = "")


  public Boolean isLong() {
    return _long;
  }

  public void setLong(Boolean _long) {
    this._long = _long;
  }

  public JsonNode missingNode(Boolean missingNode) {
    this.missingNode = missingNode;
    return this;
  }

  /**
   * Get missingNode
   * @return missingNode
  **/
  @ApiModelProperty(value = "")


  public Boolean isMissingNode() {
    return missingNode;
  }

  public void setMissingNode(Boolean missingNode) {
    this.missingNode = missingNode;
  }

  public JsonNode nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(value = "")


  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }

  public JsonNode _null(Boolean _null) {
    this._null = _null;
    return this;
  }

  /**
   * Get _null
   * @return _null
  **/
  @ApiModelProperty(value = "")


  public Boolean isNull() {
    return _null;
  }

  public void setNull(Boolean _null) {
    this._null = _null;
  }

  public JsonNode number(Boolean number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")


  public Boolean isNumber() {
    return number;
  }

  public void setNumber(Boolean number) {
    this.number = number;
  }

  public JsonNode object(Boolean object) {
    this.object = object;
    return this;
  }

  /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(value = "")


  public Boolean isObject() {
    return object;
  }

  public void setObject(Boolean object) {
    this.object = object;
  }

  public JsonNode pojo(Boolean pojo) {
    this.pojo = pojo;
    return this;
  }

  /**
   * Get pojo
   * @return pojo
  **/
  @ApiModelProperty(value = "")


  public Boolean isPojo() {
    return pojo;
  }

  public void setPojo(Boolean pojo) {
    this.pojo = pojo;
  }

  public JsonNode _short(Boolean _short) {
    this._short = _short;
    return this;
  }

  /**
   * Get _short
   * @return _short
  **/
  @ApiModelProperty(value = "")


  public Boolean isShort() {
    return _short;
  }

  public void setShort(Boolean _short) {
    this._short = _short;
  }

  public JsonNode textual(Boolean textual) {
    this.textual = textual;
    return this;
  }

  /**
   * Get textual
   * @return textual
  **/
  @ApiModelProperty(value = "")


  public Boolean isTextual() {
    return textual;
  }

  public void setTextual(Boolean textual) {
    this.textual = textual;
  }

  public JsonNode valueNode(Boolean valueNode) {
    this.valueNode = valueNode;
    return this;
  }

  /**
   * Get valueNode
   * @return valueNode
  **/
  @ApiModelProperty(value = "")


  public Boolean isValueNode() {
    return valueNode;
  }

  public void setValueNode(Boolean valueNode) {
    this.valueNode = valueNode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonNode jsonNode = (JsonNode) o;
    return Objects.equals(this.array, jsonNode.array) &&
        Objects.equals(this.bigDecimal, jsonNode.bigDecimal) &&
        Objects.equals(this.bigInteger, jsonNode.bigInteger) &&
        Objects.equals(this.binary, jsonNode.binary) &&
        Objects.equals(this._boolean, jsonNode._boolean) &&
        Objects.equals(this.containerNode, jsonNode.containerNode) &&
        Objects.equals(this._double, jsonNode._double) &&
        Objects.equals(this.empty, jsonNode.empty) &&
        Objects.equals(this._float, jsonNode._float) &&
        Objects.equals(this.floatingPointNumber, jsonNode.floatingPointNumber) &&
        Objects.equals(this._int, jsonNode._int) &&
        Objects.equals(this.integralNumber, jsonNode.integralNumber) &&
        Objects.equals(this._long, jsonNode._long) &&
        Objects.equals(this.missingNode, jsonNode.missingNode) &&
        Objects.equals(this.nodeType, jsonNode.nodeType) &&
        Objects.equals(this._null, jsonNode._null) &&
        Objects.equals(this.number, jsonNode.number) &&
        Objects.equals(this.object, jsonNode.object) &&
        Objects.equals(this.pojo, jsonNode.pojo) &&
        Objects.equals(this._short, jsonNode._short) &&
        Objects.equals(this.textual, jsonNode.textual) &&
        Objects.equals(this.valueNode, jsonNode.valueNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(array, bigDecimal, bigInteger, binary, _boolean, containerNode, _double, empty, _float, floatingPointNumber, _int, integralNumber, _long, missingNode, nodeType, _null, number, object, pojo, _short, textual, valueNode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonNode {\n");
    
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    bigDecimal: ").append(toIndentedString(bigDecimal)).append("\n");
    sb.append("    bigInteger: ").append(toIndentedString(bigInteger)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    containerNode: ").append(toIndentedString(containerNode)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    floatingPointNumber: ").append(toIndentedString(floatingPointNumber)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    integralNumber: ").append(toIndentedString(integralNumber)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    missingNode: ").append(toIndentedString(missingNode)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    pojo: ").append(toIndentedString(pojo)).append("\n");
    sb.append("    _short: ").append(toIndentedString(_short)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    valueNode: ").append(toIndentedString(valueNode)).append("\n");
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

