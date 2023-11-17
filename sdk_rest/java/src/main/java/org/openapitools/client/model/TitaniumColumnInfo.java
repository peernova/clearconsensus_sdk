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
 * TitaniumColumnInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:14:13.231702Z[UTC]")
public class TitaniumColumnInfo {
  public static final String SERIALIZED_NAME_COLUMN_NAME = "columnName";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  public static final String SERIALIZED_NAME_COLUMN_TYPE = "columnType";
  @SerializedName(SERIALIZED_NAME_COLUMN_TYPE)
  private String columnType;

  public static final String SERIALIZED_NAME_RAW_COLUMN_NAME = "rawColumnName";
  @SerializedName(SERIALIZED_NAME_RAW_COLUMN_NAME)
  private String rawColumnName;

  public TitaniumColumnInfo() { 
  }

  public TitaniumColumnInfo columnName(String columnName) {
    
    this.columnName = columnName;
    return this;
  }

   /**
   * Get columnName
   * @return columnName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnName() {
    return columnName;
  }


  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  public TitaniumColumnInfo columnType(String columnType) {
    
    this.columnType = columnType;
    return this;
  }

   /**
   * Get columnType
   * @return columnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnType() {
    return columnType;
  }


  public void setColumnType(String columnType) {
    this.columnType = columnType;
  }


  public TitaniumColumnInfo rawColumnName(String rawColumnName) {
    
    this.rawColumnName = rawColumnName;
    return this;
  }

   /**
   * Get rawColumnName
   * @return rawColumnName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRawColumnName() {
    return rawColumnName;
  }


  public void setRawColumnName(String rawColumnName) {
    this.rawColumnName = rawColumnName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumColumnInfo titaniumColumnInfo = (TitaniumColumnInfo) o;
    return Objects.equals(this.columnName, titaniumColumnInfo.columnName) &&
        Objects.equals(this.columnType, titaniumColumnInfo.columnType) &&
        Objects.equals(this.rawColumnName, titaniumColumnInfo.rawColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, columnType, rawColumnName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumColumnInfo {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    rawColumnName: ").append(toIndentedString(rawColumnName)).append("\n");
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
    openapiFields.add("columnName");
    openapiFields.add("columnType");
    openapiFields.add("rawColumnName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumColumnInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumColumnInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumColumnInfo is not found in the empty JSON string", TitaniumColumnInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumColumnInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumColumnInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("columnName") != null && !jsonObj.get("columnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnName").toString()));
      }
      if (jsonObj.get("columnType") != null && !jsonObj.get("columnType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnType").toString()));
      }
      if (jsonObj.get("rawColumnName") != null && !jsonObj.get("rawColumnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rawColumnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rawColumnName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumColumnInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumColumnInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumColumnInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumColumnInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumColumnInfo>() {
           @Override
           public void write(JsonWriter out, TitaniumColumnInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumColumnInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumColumnInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumColumnInfo
  * @throws IOException if the JSON string is invalid with respect to TitaniumColumnInfo
  */
  public static TitaniumColumnInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumColumnInfo.class);
  }

 /**
  * Convert an instance of TitaniumColumnInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

