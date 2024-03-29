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
 * TitaniumGetUserNotificationByMarketRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumGetUserNotificationByMarketRequest {
  public static final String SERIALIZED_NAME_MARKET_ID = "marketId";
  @SerializedName(SERIALIZED_NAME_MARKET_ID)
  private String marketId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public TitaniumGetUserNotificationByMarketRequest() { 
  }

  public TitaniumGetUserNotificationByMarketRequest marketId(String marketId) {
    
    this.marketId = marketId;
    return this;
  }

   /**
   * Get marketId
   * @return marketId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMarketId() {
    return marketId;
  }


  public void setMarketId(String marketId) {
    this.marketId = marketId;
  }


  public TitaniumGetUserNotificationByMarketRequest userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumGetUserNotificationByMarketRequest titaniumGetUserNotificationByMarketRequest = (TitaniumGetUserNotificationByMarketRequest) o;
    return Objects.equals(this.marketId, titaniumGetUserNotificationByMarketRequest.marketId) &&
        Objects.equals(this.userId, titaniumGetUserNotificationByMarketRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumGetUserNotificationByMarketRequest {\n");
    sb.append("    marketId: ").append(toIndentedString(marketId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("marketId");
    openapiFields.add("userId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumGetUserNotificationByMarketRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumGetUserNotificationByMarketRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumGetUserNotificationByMarketRequest is not found in the empty JSON string", TitaniumGetUserNotificationByMarketRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumGetUserNotificationByMarketRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumGetUserNotificationByMarketRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("marketId") != null && !jsonObj.get("marketId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketId").toString()));
      }
      if (jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumGetUserNotificationByMarketRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumGetUserNotificationByMarketRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumGetUserNotificationByMarketRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumGetUserNotificationByMarketRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumGetUserNotificationByMarketRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumGetUserNotificationByMarketRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumGetUserNotificationByMarketRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumGetUserNotificationByMarketRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumGetUserNotificationByMarketRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumGetUserNotificationByMarketRequest
  */
  public static TitaniumGetUserNotificationByMarketRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumGetUserNotificationByMarketRequest.class);
  }

 /**
  * Convert an instance of TitaniumGetUserNotificationByMarketRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

