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
import org.openapitools.client.model.TitaniumFileDelimiterSetting;
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
 * TitaniumSetFileDelimiterRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-18T15:03:48.379217Z[UTC]")
public class TitaniumSetFileDelimiterRequest {
  public static final String SERIALIZED_NAME_DELIMITER_SETTING = "delimiterSetting";
  @SerializedName(SERIALIZED_NAME_DELIMITER_SETTING)
  private TitaniumFileDelimiterSetting delimiterSetting;

  public static final String SERIALIZED_NAME_FILE_IDENTIFIER = "fileIdentifier";
  @SerializedName(SERIALIZED_NAME_FILE_IDENTIFIER)
  private TitaniumFileIdentifier fileIdentifier;

  public TitaniumSetFileDelimiterRequest() { 
  }

  public TitaniumSetFileDelimiterRequest delimiterSetting(TitaniumFileDelimiterSetting delimiterSetting) {
    
    this.delimiterSetting = delimiterSetting;
    return this;
  }

   /**
   * Get delimiterSetting
   * @return delimiterSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumFileDelimiterSetting getDelimiterSetting() {
    return delimiterSetting;
  }


  public void setDelimiterSetting(TitaniumFileDelimiterSetting delimiterSetting) {
    this.delimiterSetting = delimiterSetting;
  }


  public TitaniumSetFileDelimiterRequest fileIdentifier(TitaniumFileIdentifier fileIdentifier) {
    
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
    TitaniumSetFileDelimiterRequest titaniumSetFileDelimiterRequest = (TitaniumSetFileDelimiterRequest) o;
    return Objects.equals(this.delimiterSetting, titaniumSetFileDelimiterRequest.delimiterSetting) &&
        Objects.equals(this.fileIdentifier, titaniumSetFileDelimiterRequest.fileIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delimiterSetting, fileIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumSetFileDelimiterRequest {\n");
    sb.append("    delimiterSetting: ").append(toIndentedString(delimiterSetting)).append("\n");
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
    openapiFields.add("delimiterSetting");
    openapiFields.add("fileIdentifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumSetFileDelimiterRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumSetFileDelimiterRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumSetFileDelimiterRequest is not found in the empty JSON string", TitaniumSetFileDelimiterRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumSetFileDelimiterRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumSetFileDelimiterRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `delimiterSetting`
      if (jsonObj.getAsJsonObject("delimiterSetting") != null) {
        TitaniumFileDelimiterSetting.validateJsonObject(jsonObj.getAsJsonObject("delimiterSetting"));
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
       if (!TitaniumSetFileDelimiterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumSetFileDelimiterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumSetFileDelimiterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumSetFileDelimiterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumSetFileDelimiterRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumSetFileDelimiterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumSetFileDelimiterRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumSetFileDelimiterRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumSetFileDelimiterRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumSetFileDelimiterRequest
  */
  public static TitaniumSetFileDelimiterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumSetFileDelimiterRequest.class);
  }

 /**
  * Convert an instance of TitaniumSetFileDelimiterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

