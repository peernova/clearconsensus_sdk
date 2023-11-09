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
 * TitaniumAddAssetRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T10:30:15.521341Z[UTC]")
public class TitaniumAddAssetRequest {
  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private String asset;

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrumentType";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private String instrumentType;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public TitaniumAddAssetRequest() { 
  }

  public TitaniumAddAssetRequest asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAsset() {
    return asset;
  }


  public void setAsset(String asset) {
    this.asset = asset;
  }


  public TitaniumAddAssetRequest instrumentType(String instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * Get instrumentType
   * @return instrumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }


  public TitaniumAddAssetRequest service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumAddAssetRequest titaniumAddAssetRequest = (TitaniumAddAssetRequest) o;
    return Objects.equals(this.asset, titaniumAddAssetRequest.asset) &&
        Objects.equals(this.instrumentType, titaniumAddAssetRequest.instrumentType) &&
        Objects.equals(this.service, titaniumAddAssetRequest.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, instrumentType, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumAddAssetRequest {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
    openapiFields.add("asset");
    openapiFields.add("instrumentType");
    openapiFields.add("service");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumAddAssetRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumAddAssetRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumAddAssetRequest is not found in the empty JSON string", TitaniumAddAssetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumAddAssetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumAddAssetRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("asset") != null && !jsonObj.get("asset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset").toString()));
      }
      if (jsonObj.get("instrumentType") != null && !jsonObj.get("instrumentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrumentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrumentType").toString()));
      }
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumAddAssetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumAddAssetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumAddAssetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumAddAssetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumAddAssetRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumAddAssetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumAddAssetRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumAddAssetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumAddAssetRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumAddAssetRequest
  */
  public static TitaniumAddAssetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumAddAssetRequest.class);
  }

 /**
  * Convert an instance of TitaniumAddAssetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

