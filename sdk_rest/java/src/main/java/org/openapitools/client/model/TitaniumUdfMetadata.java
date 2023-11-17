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
import java.util.ArrayList;
import java.util.List;

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
 * TitaniumUdfMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:03:09.195161Z[UTC]")
public class TitaniumUdfMetadata {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_COLUMN_TYPES = "columnTypes";
  @SerializedName(SERIALIZED_NAME_COLUMN_TYPES)
  private List<String> columnTypes = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

  public TitaniumUdfMetadata() { 
  }

  public TitaniumUdfMetadata args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public TitaniumUdfMetadata addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public TitaniumUdfMetadata columnTypes(List<String> columnTypes) {
    
    this.columnTypes = columnTypes;
    return this;
  }

  public TitaniumUdfMetadata addColumnTypesItem(String columnTypesItem) {
    if (this.columnTypes == null) {
      this.columnTypes = new ArrayList<>();
    }
    this.columnTypes.add(columnTypesItem);
    return this;
  }

   /**
   * Get columnTypes
   * @return columnTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getColumnTypes() {
    return columnTypes;
  }


  public void setColumnTypes(List<String> columnTypes) {
    this.columnTypes = columnTypes;
  }


  public TitaniumUdfMetadata name(String name) {
    
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


  public TitaniumUdfMetadata output(String output) {
    
    this.output = output;
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutput() {
    return output;
  }


  public void setOutput(String output) {
    this.output = output;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumUdfMetadata titaniumUdfMetadata = (TitaniumUdfMetadata) o;
    return Objects.equals(this.args, titaniumUdfMetadata.args) &&
        Objects.equals(this.columnTypes, titaniumUdfMetadata.columnTypes) &&
        Objects.equals(this.name, titaniumUdfMetadata.name) &&
        Objects.equals(this.output, titaniumUdfMetadata.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, columnTypes, name, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumUdfMetadata {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    columnTypes: ").append(toIndentedString(columnTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
    openapiFields.add("args");
    openapiFields.add("columnTypes");
    openapiFields.add("name");
    openapiFields.add("output");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumUdfMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumUdfMetadata.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumUdfMetadata is not found in the empty JSON string", TitaniumUdfMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumUdfMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumUdfMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("args") != null && !jsonObj.get("args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `args` to be an array in the JSON string but got `%s`", jsonObj.get("args").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("columnTypes") != null && !jsonObj.get("columnTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnTypes` to be an array in the JSON string but got `%s`", jsonObj.get("columnTypes").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("output") != null && !jsonObj.get("output").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `output` to be a primitive type in the JSON string but got `%s`", jsonObj.get("output").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumUdfMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumUdfMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumUdfMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumUdfMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumUdfMetadata>() {
           @Override
           public void write(JsonWriter out, TitaniumUdfMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumUdfMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumUdfMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumUdfMetadata
  * @throws IOException if the JSON string is invalid with respect to TitaniumUdfMetadata
  */
  public static TitaniumUdfMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumUdfMetadata.class);
  }

 /**
  * Convert an instance of TitaniumUdfMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

