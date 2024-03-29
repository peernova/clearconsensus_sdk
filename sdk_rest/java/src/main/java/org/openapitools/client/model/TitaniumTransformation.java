/*
 * clearconsensus-sdk
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.TitaniumDynamicLut;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * TitaniumTransformation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumTransformation {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LUT = "lut";
  @SerializedName(SERIALIZED_NAME_LUT)
  private TitaniumDynamicLut lut;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public static final String SERIALIZED_NAME_SOURCE_COLUMN = "sourceColumn";
  @SerializedName(SERIALIZED_NAME_SOURCE_COLUMN)
  private String sourceColumn;

  public static final String SERIALIZED_NAME_TARGET_COLUMN = "targetColumn";
  @SerializedName(SERIALIZED_NAME_TARGET_COLUMN)
  private String targetColumn;

  public TitaniumTransformation() { 
  }

  public TitaniumTransformation description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TitaniumTransformation lut(TitaniumDynamicLut lut) {
    
    this.lut = lut;
    return this;
  }

   /**
   * Get lut
   * @return lut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumDynamicLut getLut() {
    return lut;
  }


  public void setLut(TitaniumDynamicLut lut) {
    this.lut = lut;
  }


  public TitaniumTransformation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TitaniumTransformation rule(String rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }


  public TitaniumTransformation sourceColumn(String sourceColumn) {
    
    this.sourceColumn = sourceColumn;
    return this;
  }

   /**
   * Get sourceColumn
   * @return sourceColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSourceColumn() {
    return sourceColumn;
  }


  public void setSourceColumn(String sourceColumn) {
    this.sourceColumn = sourceColumn;
  }


  public TitaniumTransformation targetColumn(String targetColumn) {
    
    this.targetColumn = targetColumn;
    return this;
  }

   /**
   * Get targetColumn
   * @return targetColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetColumn() {
    return targetColumn;
  }


  public void setTargetColumn(String targetColumn) {
    this.targetColumn = targetColumn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumTransformation titaniumTransformation = (TitaniumTransformation) o;
    return Objects.equals(this.description, titaniumTransformation.description) &&
        Objects.equals(this.lut, titaniumTransformation.lut) &&
        Objects.equals(this.name, titaniumTransformation.name) &&
        Objects.equals(this.rule, titaniumTransformation.rule) &&
        Objects.equals(this.sourceColumn, titaniumTransformation.sourceColumn) &&
        Objects.equals(this.targetColumn, titaniumTransformation.targetColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, lut, name, rule, sourceColumn, targetColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumTransformation {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lut: ").append(toIndentedString(lut)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    sourceColumn: ").append(toIndentedString(sourceColumn)).append("\n");
    sb.append("    targetColumn: ").append(toIndentedString(targetColumn)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("lut");
    openapiFields.add("name");
    openapiFields.add("rule");
    openapiFields.add("sourceColumn");
    openapiFields.add("targetColumn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumTransformation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumTransformation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumTransformation is not found in the empty JSON string", TitaniumTransformation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumTransformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumTransformation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `lut`
      if (jsonObj.getAsJsonObject("lut") != null) {
        TitaniumDynamicLut.validateJsonObject(jsonObj.getAsJsonObject("lut"));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("rule") != null && !jsonObj.get("rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule").toString()));
      }
      if (jsonObj.get("sourceColumn") != null && !jsonObj.get("sourceColumn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceColumn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceColumn").toString()));
      }
      if (jsonObj.get("targetColumn") != null && !jsonObj.get("targetColumn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetColumn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetColumn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumTransformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumTransformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumTransformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumTransformation.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumTransformation>() {
           @Override
           public void write(JsonWriter out, TitaniumTransformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumTransformation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumTransformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumTransformation
  * @throws IOException if the JSON string is invalid with respect to TitaniumTransformation
  */
  public static TitaniumTransformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumTransformation.class);
  }

 /**
  * Convert an instance of TitaniumTransformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

