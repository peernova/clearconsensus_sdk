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
 * TitaniumChallengeCreateResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T18:50:06.087841Z[UTC]")
public class TitaniumChallengeCreateResponseData {
  public static final String SERIALIZED_NAME_TICKET_ID = "ticketId";
  @SerializedName(SERIALIZED_NAME_TICKET_ID)
  private String ticketId;

  public TitaniumChallengeCreateResponseData() { 
  }

  public TitaniumChallengeCreateResponseData ticketId(String ticketId) {
    
    this.ticketId = ticketId;
    return this;
  }

   /**
   * Get ticketId
   * @return ticketId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTicketId() {
    return ticketId;
  }


  public void setTicketId(String ticketId) {
    this.ticketId = ticketId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumChallengeCreateResponseData titaniumChallengeCreateResponseData = (TitaniumChallengeCreateResponseData) o;
    return Objects.equals(this.ticketId, titaniumChallengeCreateResponseData.ticketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ticketId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumChallengeCreateResponseData {\n");
    sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
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
    openapiFields.add("ticketId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumChallengeCreateResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumChallengeCreateResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumChallengeCreateResponseData is not found in the empty JSON string", TitaniumChallengeCreateResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumChallengeCreateResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumChallengeCreateResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ticketId") != null && !jsonObj.get("ticketId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticketId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticketId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumChallengeCreateResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumChallengeCreateResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumChallengeCreateResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumChallengeCreateResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumChallengeCreateResponseData>() {
           @Override
           public void write(JsonWriter out, TitaniumChallengeCreateResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumChallengeCreateResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumChallengeCreateResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumChallengeCreateResponseData
  * @throws IOException if the JSON string is invalid with respect to TitaniumChallengeCreateResponseData
  */
  public static TitaniumChallengeCreateResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumChallengeCreateResponseData.class);
  }

 /**
  * Convert an instance of TitaniumChallengeCreateResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

