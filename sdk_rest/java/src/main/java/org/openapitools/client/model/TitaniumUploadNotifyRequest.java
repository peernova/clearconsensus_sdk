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
 * TitaniumUploadNotifyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:16:25.794270Z[UTC]")
public class TitaniumUploadNotifyRequest {
  public static final String SERIALIZED_NAME_CURRENT_PATH = "currentPath";
  @SerializedName(SERIALIZED_NAME_CURRENT_PATH)
  private String currentPath;

  public static final String SERIALIZED_NAME_TARGET_PATH = "targetPath";
  @SerializedName(SERIALIZED_NAME_TARGET_PATH)
  private String targetPath;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public TitaniumUploadNotifyRequest() { 
  }

  public TitaniumUploadNotifyRequest currentPath(String currentPath) {
    
    this.currentPath = currentPath;
    return this;
  }

   /**
   * Get currentPath
   * @return currentPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentPath() {
    return currentPath;
  }


  public void setCurrentPath(String currentPath) {
    this.currentPath = currentPath;
  }


  public TitaniumUploadNotifyRequest targetPath(String targetPath) {
    
    this.targetPath = targetPath;
    return this;
  }

   /**
   * Get targetPath
   * @return targetPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetPath() {
    return targetPath;
  }


  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }


  public TitaniumUploadNotifyRequest uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumUploadNotifyRequest titaniumUploadNotifyRequest = (TitaniumUploadNotifyRequest) o;
    return Objects.equals(this.currentPath, titaniumUploadNotifyRequest.currentPath) &&
        Objects.equals(this.targetPath, titaniumUploadNotifyRequest.targetPath) &&
        Objects.equals(this.uuid, titaniumUploadNotifyRequest.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPath, targetPath, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumUploadNotifyRequest {\n");
    sb.append("    currentPath: ").append(toIndentedString(currentPath)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
    openapiFields.add("currentPath");
    openapiFields.add("targetPath");
    openapiFields.add("uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumUploadNotifyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumUploadNotifyRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumUploadNotifyRequest is not found in the empty JSON string", TitaniumUploadNotifyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumUploadNotifyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumUploadNotifyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("currentPath") != null && !jsonObj.get("currentPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentPath").toString()));
      }
      if (jsonObj.get("targetPath") != null && !jsonObj.get("targetPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetPath").toString()));
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumUploadNotifyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumUploadNotifyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumUploadNotifyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumUploadNotifyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumUploadNotifyRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumUploadNotifyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumUploadNotifyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumUploadNotifyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumUploadNotifyRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumUploadNotifyRequest
  */
  public static TitaniumUploadNotifyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumUploadNotifyRequest.class);
  }

 /**
  * Convert an instance of TitaniumUploadNotifyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

