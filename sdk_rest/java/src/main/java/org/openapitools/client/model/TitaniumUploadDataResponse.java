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
import org.openapitools.client.model.TitaniumError;

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
 * TitaniumUploadDataResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:14:13.231702Z[UTC]")
public class TitaniumUploadDataResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private TitaniumError error;

  public static final String SERIALIZED_NAME_S3_URL = "s3Url";
  @SerializedName(SERIALIZED_NAME_S3_URL)
  private String s3Url;

  public static final String SERIALIZED_NAME_TUS_PAYLOAD = "tusPayload";
  @SerializedName(SERIALIZED_NAME_TUS_PAYLOAD)
  private String tusPayload;

  public TitaniumUploadDataResponse() { 
  }

  public TitaniumUploadDataResponse error(TitaniumError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumError getError() {
    return error;
  }


  public void setError(TitaniumError error) {
    this.error = error;
  }


  public TitaniumUploadDataResponse s3Url(String s3Url) {
    
    this.s3Url = s3Url;
    return this;
  }

   /**
   * Get s3Url
   * @return s3Url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getS3Url() {
    return s3Url;
  }


  public void setS3Url(String s3Url) {
    this.s3Url = s3Url;
  }


  public TitaniumUploadDataResponse tusPayload(String tusPayload) {
    
    this.tusPayload = tusPayload;
    return this;
  }

   /**
   * Get tusPayload
   * @return tusPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTusPayload() {
    return tusPayload;
  }


  public void setTusPayload(String tusPayload) {
    this.tusPayload = tusPayload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumUploadDataResponse titaniumUploadDataResponse = (TitaniumUploadDataResponse) o;
    return Objects.equals(this.error, titaniumUploadDataResponse.error) &&
        Objects.equals(this.s3Url, titaniumUploadDataResponse.s3Url) &&
        Objects.equals(this.tusPayload, titaniumUploadDataResponse.tusPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, s3Url, tusPayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumUploadDataResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    s3Url: ").append(toIndentedString(s3Url)).append("\n");
    sb.append("    tusPayload: ").append(toIndentedString(tusPayload)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("s3Url");
    openapiFields.add("tusPayload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumUploadDataResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumUploadDataResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumUploadDataResponse is not found in the empty JSON string", TitaniumUploadDataResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumUploadDataResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumUploadDataResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `error`
      if (jsonObj.getAsJsonObject("error") != null) {
        TitaniumError.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      if (jsonObj.get("s3Url") != null && !jsonObj.get("s3Url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `s3Url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("s3Url").toString()));
      }
      if (jsonObj.get("tusPayload") != null && !jsonObj.get("tusPayload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tusPayload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tusPayload").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumUploadDataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumUploadDataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumUploadDataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumUploadDataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumUploadDataResponse>() {
           @Override
           public void write(JsonWriter out, TitaniumUploadDataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumUploadDataResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumUploadDataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumUploadDataResponse
  * @throws IOException if the JSON string is invalid with respect to TitaniumUploadDataResponse
  */
  public static TitaniumUploadDataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumUploadDataResponse.class);
  }

 /**
  * Convert an instance of TitaniumUploadDataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

