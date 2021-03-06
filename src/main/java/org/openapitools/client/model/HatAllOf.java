/*
 * MadHattr
 * A basic api to demonstrate CRUD operations.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * HatAllOf
 */
@JsonPropertyOrder({
  HatAllOf.JSON_PROPERTY_COLOR,
  HatAllOf.JSON_PROPERTY_TYPE,
  HatAllOf.JSON_PROPERTY_DESCRIPTION,
  HatAllOf.JSON_PROPERTY_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-21T12:10:29.716-04:00[America/New_York]")
public class HatAllOf {
  /**
   * The color of the Hat
   */
  public enum ColorEnum {
    RED("RED"),
    
    ORANGE("ORANGE"),
    
    YELLOW("YELLOW"),
    
    GREEN("GREEN"),
    
    BLUE("BLUE"),
    
    PURPLE("PURPLE"),
    
    WHITE("WHITE"),
    
    BLACK("BLACK"),
    
    GRAY("GRAY"),
    
    BROWN("BROWN");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COLOR = "color";
  private ColorEnum color;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;


  public HatAllOf color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * The color of the Hat
   * @return color
  **/
  @ApiModelProperty(required = true, value = "The color of the Hat")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ColorEnum getColor() {
    return color;
  }


  public void setColor(ColorEnum color) {
    this.color = color;
  }


  public HatAllOf type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Hat
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of Hat")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public HatAllOf description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the Hat
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the Hat")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public HatAllOf id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * An integer value assigned to the hat as it enters the database
   * @return id
  **/
  @ApiModelProperty(required = true, value = "An integer value assigned to the hat as it enters the database")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * Return true if this hat_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HatAllOf hatAllOf = (HatAllOf) o;
    return Objects.equals(this.color, hatAllOf.color) &&
        Objects.equals(this.type, hatAllOf.type) &&
        Objects.equals(this.description, hatAllOf.description) &&
        Objects.equals(this.id, hatAllOf.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, type, description, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HatAllOf {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

