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
 * TitaniumCompleteDataUploadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:06:27.755775Z[UTC]")
public class TitaniumCompleteDataUploadRequest {
  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private String asset;

  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_SNAP_TIME = "snapTime";
  @SerializedName(SERIALIZED_NAME_SNAP_TIME)
  private String snapTime;

  public static final String SERIALIZED_NAME_SUB_ASSET = "subAsset";
  @SerializedName(SERIALIZED_NAME_SUB_ASSET)
  private String subAsset;

  public TitaniumCompleteDataUploadRequest() { 
  }

  public TitaniumCompleteDataUploadRequest asset(String asset) {
    
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


  public TitaniumCompleteDataUploadRequest assetId(String assetId) {
    
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


  public TitaniumCompleteDataUploadRequest client(String client) {
    
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


  public TitaniumCompleteDataUploadRequest date(String date) {
    
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


  public TitaniumCompleteDataUploadRequest service(String service) {
    
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


  public TitaniumCompleteDataUploadRequest snapTime(String snapTime) {
    
    this.snapTime = snapTime;
    return this;
  }

   /**
   * Get snapTime
   * @return snapTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnapTime() {
    return snapTime;
  }


  public void setSnapTime(String snapTime) {
    this.snapTime = snapTime;
  }


  public TitaniumCompleteDataUploadRequest subAsset(String subAsset) {
    
    this.subAsset = subAsset;
    return this;
  }

   /**
   * Get subAsset
   * @return subAsset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubAsset() {
    return subAsset;
  }


  public void setSubAsset(String subAsset) {
    this.subAsset = subAsset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumCompleteDataUploadRequest titaniumCompleteDataUploadRequest = (TitaniumCompleteDataUploadRequest) o;
    return Objects.equals(this.asset, titaniumCompleteDataUploadRequest.asset) &&
        Objects.equals(this.assetId, titaniumCompleteDataUploadRequest.assetId) &&
        Objects.equals(this.client, titaniumCompleteDataUploadRequest.client) &&
        Objects.equals(this.date, titaniumCompleteDataUploadRequest.date) &&
        Objects.equals(this.service, titaniumCompleteDataUploadRequest.service) &&
        Objects.equals(this.snapTime, titaniumCompleteDataUploadRequest.snapTime) &&
        Objects.equals(this.subAsset, titaniumCompleteDataUploadRequest.subAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, assetId, client, date, service, snapTime, subAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumCompleteDataUploadRequest {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    snapTime: ").append(toIndentedString(snapTime)).append("\n");
    sb.append("    subAsset: ").append(toIndentedString(subAsset)).append("\n");
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
    openapiFields.add("assetId");
    openapiFields.add("client");
    openapiFields.add("date");
    openapiFields.add("service");
    openapiFields.add("snapTime");
    openapiFields.add("subAsset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumCompleteDataUploadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumCompleteDataUploadRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumCompleteDataUploadRequest is not found in the empty JSON string", TitaniumCompleteDataUploadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumCompleteDataUploadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumCompleteDataUploadRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("asset") != null && !jsonObj.get("asset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset").toString()));
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client").toString()));
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
      if (jsonObj.get("snapTime") != null && !jsonObj.get("snapTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapTime").toString()));
      }
      if (jsonObj.get("subAsset") != null && !jsonObj.get("subAsset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subAsset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subAsset").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumCompleteDataUploadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumCompleteDataUploadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumCompleteDataUploadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumCompleteDataUploadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumCompleteDataUploadRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumCompleteDataUploadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumCompleteDataUploadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumCompleteDataUploadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumCompleteDataUploadRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumCompleteDataUploadRequest
  */
  public static TitaniumCompleteDataUploadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumCompleteDataUploadRequest.class);
  }

 /**
  * Convert an instance of TitaniumCompleteDataUploadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

