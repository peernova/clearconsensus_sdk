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
 * GrpcprotoTableColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-13T18:34:39.175680Z[UTC]")
public class GrpcprotoTableColumn {
  public static final String SERIALIZED_NAME_COLUMN_DB_TYPE = "columnDbType";
  @SerializedName(SERIALIZED_NAME_COLUMN_DB_TYPE)
  private String columnDbType;

  public static final String SERIALIZED_NAME_COLUMN_NAME = "columnName";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  public static final String SERIALIZED_NAME_COLUMN_TYPE = "columnType";
  @SerializedName(SERIALIZED_NAME_COLUMN_TYPE)
  private String columnType;

  public static final String SERIALIZED_NAME_RAW_COLUMN_NAME = "rawColumnName";
  @SerializedName(SERIALIZED_NAME_RAW_COLUMN_NAME)
  private String rawColumnName;

  public GrpcprotoTableColumn() { 
  }

  public GrpcprotoTableColumn columnDbType(String columnDbType) {
    
    this.columnDbType = columnDbType;
    return this;
  }

   /**
   * Get columnDbType
   * @return columnDbType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumnDbType() {
    return columnDbType;
  }


  public void setColumnDbType(String columnDbType) {
    this.columnDbType = columnDbType;
  }


  public GrpcprotoTableColumn columnName(String columnName) {
    
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


  public GrpcprotoTableColumn columnType(String columnType) {
    
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


  public GrpcprotoTableColumn rawColumnName(String rawColumnName) {
    
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
    GrpcprotoTableColumn grpcprotoTableColumn = (GrpcprotoTableColumn) o;
    return Objects.equals(this.columnDbType, grpcprotoTableColumn.columnDbType) &&
        Objects.equals(this.columnName, grpcprotoTableColumn.columnName) &&
        Objects.equals(this.columnType, grpcprotoTableColumn.columnType) &&
        Objects.equals(this.rawColumnName, grpcprotoTableColumn.rawColumnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnDbType, columnName, columnType, rawColumnName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrpcprotoTableColumn {\n");
    sb.append("    columnDbType: ").append(toIndentedString(columnDbType)).append("\n");
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
    openapiFields.add("columnDbType");
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
  * @throws IOException if the JSON Object is invalid with respect to GrpcprotoTableColumn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GrpcprotoTableColumn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GrpcprotoTableColumn is not found in the empty JSON string", GrpcprotoTableColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GrpcprotoTableColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GrpcprotoTableColumn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("columnDbType") != null && !jsonObj.get("columnDbType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnDbType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnDbType").toString()));
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
       if (!GrpcprotoTableColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GrpcprotoTableColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GrpcprotoTableColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GrpcprotoTableColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<GrpcprotoTableColumn>() {
           @Override
           public void write(JsonWriter out, GrpcprotoTableColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GrpcprotoTableColumn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GrpcprotoTableColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GrpcprotoTableColumn
  * @throws IOException if the JSON string is invalid with respect to GrpcprotoTableColumn
  */
  public static GrpcprotoTableColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GrpcprotoTableColumn.class);
  }

 /**
  * Convert an instance of GrpcprotoTableColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
