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
 * TitaniumChallengeFreezeStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:04:19.570721Z[UTC]")
public class TitaniumChallengeFreezeStatusRequest {
  public static final String SERIALIZED_NAME_CONSENSUS_RUN_ID = "consensusRunId";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_RUN_ID)
  private String consensusRunId;

  public TitaniumChallengeFreezeStatusRequest() { 
  }

  public TitaniumChallengeFreezeStatusRequest consensusRunId(String consensusRunId) {
    
    this.consensusRunId = consensusRunId;
    return this;
  }

   /**
   * Get consensusRunId
   * @return consensusRunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsensusRunId() {
    return consensusRunId;
  }


  public void setConsensusRunId(String consensusRunId) {
    this.consensusRunId = consensusRunId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumChallengeFreezeStatusRequest titaniumChallengeFreezeStatusRequest = (TitaniumChallengeFreezeStatusRequest) o;
    return Objects.equals(this.consensusRunId, titaniumChallengeFreezeStatusRequest.consensusRunId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consensusRunId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumChallengeFreezeStatusRequest {\n");
    sb.append("    consensusRunId: ").append(toIndentedString(consensusRunId)).append("\n");
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
    openapiFields.add("consensusRunId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumChallengeFreezeStatusRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumChallengeFreezeStatusRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumChallengeFreezeStatusRequest is not found in the empty JSON string", TitaniumChallengeFreezeStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumChallengeFreezeStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumChallengeFreezeStatusRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("consensusRunId") != null && !jsonObj.get("consensusRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusRunId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumChallengeFreezeStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumChallengeFreezeStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumChallengeFreezeStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumChallengeFreezeStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumChallengeFreezeStatusRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumChallengeFreezeStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumChallengeFreezeStatusRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumChallengeFreezeStatusRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumChallengeFreezeStatusRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumChallengeFreezeStatusRequest
  */
  public static TitaniumChallengeFreezeStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumChallengeFreezeStatusRequest.class);
  }

 /**
  * Convert an instance of TitaniumChallengeFreezeStatusRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

