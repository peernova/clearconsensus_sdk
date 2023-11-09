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
 * TitaniumConsensusDecisionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T09:49:10.073376Z[UTC]")
public class TitaniumConsensusDecisionRequest {
  public static final String SERIALIZED_NAME_CONSENSUS_TRACKING_ID = "consensusTrackingId";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_TRACKING_ID)
  private String consensusTrackingId;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private String decision;

  public TitaniumConsensusDecisionRequest() { 
  }

  public TitaniumConsensusDecisionRequest consensusTrackingId(String consensusTrackingId) {
    
    this.consensusTrackingId = consensusTrackingId;
    return this;
  }

   /**
   * Get consensusTrackingId
   * @return consensusTrackingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsensusTrackingId() {
    return consensusTrackingId;
  }


  public void setConsensusTrackingId(String consensusTrackingId) {
    this.consensusTrackingId = consensusTrackingId;
  }


  public TitaniumConsensusDecisionRequest decision(String decision) {
    
    this.decision = decision;
    return this;
  }

   /**
   * Get decision
   * @return decision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDecision() {
    return decision;
  }


  public void setDecision(String decision) {
    this.decision = decision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusDecisionRequest titaniumConsensusDecisionRequest = (TitaniumConsensusDecisionRequest) o;
    return Objects.equals(this.consensusTrackingId, titaniumConsensusDecisionRequest.consensusTrackingId) &&
        Objects.equals(this.decision, titaniumConsensusDecisionRequest.decision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consensusTrackingId, decision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusDecisionRequest {\n");
    sb.append("    consensusTrackingId: ").append(toIndentedString(consensusTrackingId)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
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
    openapiFields.add("consensusTrackingId");
    openapiFields.add("decision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusDecisionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusDecisionRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusDecisionRequest is not found in the empty JSON string", TitaniumConsensusDecisionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusDecisionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusDecisionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("consensusTrackingId") != null && !jsonObj.get("consensusTrackingId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusTrackingId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusTrackingId").toString()));
      }
      if (jsonObj.get("decision") != null && !jsonObj.get("decision").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `decision` to be a primitive type in the JSON string but got `%s`", jsonObj.get("decision").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusDecisionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusDecisionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusDecisionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusDecisionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusDecisionRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusDecisionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusDecisionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusDecisionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusDecisionRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusDecisionRequest
  */
  public static TitaniumConsensusDecisionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusDecisionRequest.class);
  }

 /**
  * Convert an instance of TitaniumConsensusDecisionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

