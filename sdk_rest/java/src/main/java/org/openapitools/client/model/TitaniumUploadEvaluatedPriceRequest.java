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
 * TitaniumUploadEvaluatedPriceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:14:13.231702Z[UTC]")
public class TitaniumUploadEvaluatedPriceRequest {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private String _file;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumUploadEvaluatedPriceRequest() { 
  }

  public TitaniumUploadEvaluatedPriceRequest assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public TitaniumUploadEvaluatedPriceRequest date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public TitaniumUploadEvaluatedPriceRequest _file(String _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFile() {
    return _file;
  }


  public void setFile(String _file) {
    this._file = _file;
  }


  public TitaniumUploadEvaluatedPriceRequest fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public TitaniumUploadEvaluatedPriceRequest traceName(String traceName) {
    
    this.traceName = traceName;
    return this;
  }

   /**
   * Get traceName
   * @return traceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTraceName() {
    return traceName;
  }


  public void setTraceName(String traceName) {
    this.traceName = traceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumUploadEvaluatedPriceRequest titaniumUploadEvaluatedPriceRequest = (TitaniumUploadEvaluatedPriceRequest) o;
    return Objects.equals(this.assetId, titaniumUploadEvaluatedPriceRequest.assetId) &&
        Objects.equals(this.date, titaniumUploadEvaluatedPriceRequest.date) &&
        Objects.equals(this._file, titaniumUploadEvaluatedPriceRequest._file) &&
        Objects.equals(this.fileName, titaniumUploadEvaluatedPriceRequest.fileName) &&
        Objects.equals(this.traceName, titaniumUploadEvaluatedPriceRequest.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, date, _file, fileName, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumUploadEvaluatedPriceRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    traceName: ").append(toIndentedString(traceName)).append("\n");
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
    openapiFields.add("assetId");
    openapiFields.add("date");
    openapiFields.add("file");
    openapiFields.add("fileName");
    openapiFields.add("traceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumUploadEvaluatedPriceRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumUploadEvaluatedPriceRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumUploadEvaluatedPriceRequest is not found in the empty JSON string", TitaniumUploadEvaluatedPriceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumUploadEvaluatedPriceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumUploadEvaluatedPriceRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (jsonObj.get("file") != null && !jsonObj.get("file").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file").toString()));
      }
      if (jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (jsonObj.get("traceName") != null && !jsonObj.get("traceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumUploadEvaluatedPriceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumUploadEvaluatedPriceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumUploadEvaluatedPriceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumUploadEvaluatedPriceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumUploadEvaluatedPriceRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumUploadEvaluatedPriceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumUploadEvaluatedPriceRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumUploadEvaluatedPriceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumUploadEvaluatedPriceRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumUploadEvaluatedPriceRequest
  */
  public static TitaniumUploadEvaluatedPriceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumUploadEvaluatedPriceRequest.class);
  }

 /**
  * Convert an instance of TitaniumUploadEvaluatedPriceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

