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
 * A new hat object to be created by post call. Id will be generated and enriched to create Hat object.
 */
@ApiModel(description = "A new hat object to be created by post call. Id will be generated and enriched to create Hat object.")
@JsonPropertyOrder({
  NewHat.JSON_PROPERTY_COLOR,
  NewHat.JSON_PROPERTY_DESCRIPTION,
  NewHat.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-21T12:10:29.716-04:00[America/New_York]")
public class NewHat {
  /**
   * The color of the new hat
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

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;


  public NewHat color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * The color of the new hat
   * @return color
  **/
  @ApiModelProperty(required = true, value = "The color of the new hat")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ColorEnum getColor() {
    return color;
  }


  public void setColor(ColorEnum color) {
    this.color = color;
  }


  public NewHat description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the new hat object.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the new hat object.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NewHat type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of new hat object.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of new hat object.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this newHat object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewHat newHat = (NewHat) o;
    return Objects.equals(this.color, newHat.color) &&
        Objects.equals(this.description, newHat.description) &&
        Objects.equals(this.type, newHat.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, description, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewHat {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
