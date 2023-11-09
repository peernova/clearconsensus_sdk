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
import org.openapitools.client.model.TitaniumFileDescriptorSetting;
import org.openapitools.client.model.TitaniumFileIdentifier;

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
 * TitaniumSetFileDescriptorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T09:52:19.062379Z[UTC]")
public class TitaniumSetFileDescriptorRequest {
  public static final String SERIALIZED_NAME_DESCRIPTOR_SETTING = "descriptorSetting";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR_SETTING)
  private TitaniumFileDescriptorSetting descriptorSetting;

  public static final String SERIALIZED_NAME_FILE_IDENTIFIER = "fileIdentifier";
  @SerializedName(SERIALIZED_NAME_FILE_IDENTIFIER)
  private TitaniumFileIdentifier fileIdentifier;

  public TitaniumSetFileDescriptorRequest() { 
  }

  public TitaniumSetFileDescriptorRequest descriptorSetting(TitaniumFileDescriptorSetting descriptorSetting) {
    
    this.descriptorSetting = descriptorSetting;
    return this;
  }

   /**
   * Get descriptorSetting
   * @return descriptorSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumFileDescriptorSetting getDescriptorSetting() {
    return descriptorSetting;
  }


  public void setDescriptorSetting(TitaniumFileDescriptorSetting descriptorSetting) {
    this.descriptorSetting = descriptorSetting;
  }


  public TitaniumSetFileDescriptorRequest fileIdentifier(TitaniumFileIdentifier fileIdentifier) {
    
    this.fileIdentifier = fileIdentifier;
    return this;
  }

   /**
   * Get fileIdentifier
   * @return fileIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumFileIdentifier getFileIdentifier() {
    return fileIdentifier;
  }


  public void setFileIdentifier(TitaniumFileIdentifier fileIdentifier) {
    this.fileIdentifier = fileIdentifier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumSetFileDescriptorRequest titaniumSetFileDescriptorRequest = (TitaniumSetFileDescriptorRequest) o;
    return Objects.equals(this.descriptorSetting, titaniumSetFileDescriptorRequest.descriptorSetting) &&
        Objects.equals(this.fileIdentifier, titaniumSetFileDescriptorRequest.fileIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptorSetting, fileIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumSetFileDescriptorRequest {\n");
    sb.append("    descriptorSetting: ").append(toIndentedString(descriptorSetting)).append("\n");
    sb.append("    fileIdentifier: ").append(toIndentedString(fileIdentifier)).append("\n");
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
    openapiFields.add("descriptorSetting");
    openapiFields.add("fileIdentifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumSetFileDescriptorRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumSetFileDescriptorRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumSetFileDescriptorRequest is not found in the empty JSON string", TitaniumSetFileDescriptorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumSetFileDescriptorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumSetFileDescriptorRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `descriptorSetting`
      if (jsonObj.getAsJsonObject("descriptorSetting") != null) {
        TitaniumFileDescriptorSetting.validateJsonObject(jsonObj.getAsJsonObject("descriptorSetting"));
      }
      // validate the optional field `fileIdentifier`
      if (jsonObj.getAsJsonObject("fileIdentifier") != null) {
        TitaniumFileIdentifier.validateJsonObject(jsonObj.getAsJsonObject("fileIdentifier"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumSetFileDescriptorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumSetFileDescriptorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumSetFileDescriptorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumSetFileDescriptorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumSetFileDescriptorRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumSetFileDescriptorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumSetFileDescriptorRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumSetFileDescriptorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumSetFileDescriptorRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumSetFileDescriptorRequest
  */
  public static TitaniumSetFileDescriptorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumSetFileDescriptorRequest.class);
  }

 /**
  * Convert an instance of TitaniumSetFileDescriptorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

