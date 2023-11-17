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
 * TitaniumAssetDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:07:31.560674Z[UTC]")
public class TitaniumAssetDetails {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_SNAP_TIME = "snapTime";
  @SerializedName(SERIALIZED_NAME_SNAP_TIME)
  private String snapTime;

  public static final String SERIALIZED_NAME_SUB_ASSET = "subAsset";
  @SerializedName(SERIALIZED_NAME_SUB_ASSET)
  private String subAsset;

  public TitaniumAssetDetails() { 
  }

  public TitaniumAssetDetails assetId(String assetId) {
    
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


  public TitaniumAssetDetails date(String date) {
    
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


  public TitaniumAssetDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TitaniumAssetDetails service(String service) {
    
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


  public TitaniumAssetDetails snapTime(String snapTime) {
    
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


  public TitaniumAssetDetails subAsset(String subAsset) {
    
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
    TitaniumAssetDetails titaniumAssetDetails = (TitaniumAssetDetails) o;
    return Objects.equals(this.assetId, titaniumAssetDetails.assetId) &&
        Objects.equals(this.date, titaniumAssetDetails.date) &&
        Objects.equals(this.name, titaniumAssetDetails.name) &&
        Objects.equals(this.service, titaniumAssetDetails.service) &&
        Objects.equals(this.snapTime, titaniumAssetDetails.snapTime) &&
        Objects.equals(this.subAsset, titaniumAssetDetails.subAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, date, name, service, snapTime, subAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumAssetDetails {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("assetId");
    openapiFields.add("date");
    openapiFields.add("name");
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
  * @throws IOException if the JSON Object is invalid with respect to TitaniumAssetDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumAssetDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumAssetDetails is not found in the empty JSON string", TitaniumAssetDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumAssetDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumAssetDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
       if (!TitaniumAssetDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumAssetDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumAssetDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumAssetDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumAssetDetails>() {
           @Override
           public void write(JsonWriter out, TitaniumAssetDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumAssetDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumAssetDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumAssetDetails
  * @throws IOException if the JSON string is invalid with respect to TitaniumAssetDetails
  */
  public static TitaniumAssetDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumAssetDetails.class);
  }

 /**
  * Convert an instance of TitaniumAssetDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

