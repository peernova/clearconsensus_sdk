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
import org.openapitools.client.model.TitaniumAnnotation;

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
 * TitaniumUploadDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T15:16:31.525591Z[UTC]")
public class TitaniumUploadDataRequest {
  public static final String SERIALIZED_NAME_ANNOTATION = "annotation";
  @SerializedName(SERIALIZED_NAME_ANNOTATION)
  private TitaniumAnnotation annotation;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public TitaniumUploadDataRequest() { 
  }

  public TitaniumUploadDataRequest annotation(TitaniumAnnotation annotation) {
    
    this.annotation = annotation;
    return this;
  }

   /**
   * Get annotation
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumAnnotation getAnnotation() {
    return annotation;
  }


  public void setAnnotation(TitaniumAnnotation annotation) {
    this.annotation = annotation;
  }


  public TitaniumUploadDataRequest client(String client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClient() {
    return client;
  }


  public void setClient(String client) {
    this.client = client;
  }


  public TitaniumUploadDataRequest fileName(String fileName) {
    
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


  public TitaniumUploadDataRequest protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumUploadDataRequest titaniumUploadDataRequest = (TitaniumUploadDataRequest) o;
    return Objects.equals(this.annotation, titaniumUploadDataRequest.annotation) &&
        Objects.equals(this.client, titaniumUploadDataRequest.client) &&
        Objects.equals(this.fileName, titaniumUploadDataRequest.fileName) &&
        Objects.equals(this.protocol, titaniumUploadDataRequest.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotation, client, fileName, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumUploadDataRequest {\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
    openapiFields.add("annotation");
    openapiFields.add("client");
    openapiFields.add("fileName");
    openapiFields.add("protocol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumUploadDataRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumUploadDataRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumUploadDataRequest is not found in the empty JSON string", TitaniumUploadDataRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumUploadDataRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumUploadDataRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `annotation`
      if (jsonObj.getAsJsonObject("annotation") != null) {
        TitaniumAnnotation.validateJsonObject(jsonObj.getAsJsonObject("annotation"));
      }
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client").toString()));
      }
      if (jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (jsonObj.get("protocol") != null && !jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumUploadDataRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumUploadDataRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumUploadDataRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumUploadDataRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumUploadDataRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumUploadDataRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumUploadDataRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumUploadDataRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumUploadDataRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumUploadDataRequest
  */
  public static TitaniumUploadDataRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumUploadDataRequest.class);
  }

 /**
  * Convert an instance of TitaniumUploadDataRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

