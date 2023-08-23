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
 * TitaniumPopUpViewRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-23T10:04:56.045876Z[UTC]")
public class TitaniumPopUpViewRequest {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_CONSENSUS_ID = "consensusId";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_ID)
  private String consensusId;

  public static final String SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP = "consensusRunTimestamp";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP)
  private String consensusRunTimestamp;

  public static final String SERIALIZED_NAME_EVALUATED_PRICE_ID = "evaluatedPriceId";
  @SerializedName(SERIALIZED_NAME_EVALUATED_PRICE_ID)
  private String evaluatedPriceId;

  public static final String SERIALIZED_NAME_SUBMITTED_DATE = "submittedDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DATE)
  private String submittedDate;

  public static final String SERIALIZED_NAME_SUBMITTED_ID = "submittedId";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ID)
  private String submittedId;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumPopUpViewRequest() { 
  }

  public TitaniumPopUpViewRequest assetId(String assetId) {
    
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


  public TitaniumPopUpViewRequest consensusId(String consensusId) {
    
    this.consensusId = consensusId;
    return this;
  }

   /**
   * Get consensusId
   * @return consensusId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsensusId() {
    return consensusId;
  }


  public void setConsensusId(String consensusId) {
    this.consensusId = consensusId;
  }


  public TitaniumPopUpViewRequest consensusRunTimestamp(String consensusRunTimestamp) {
    
    this.consensusRunTimestamp = consensusRunTimestamp;
    return this;
  }

   /**
   * Get consensusRunTimestamp
   * @return consensusRunTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsensusRunTimestamp() {
    return consensusRunTimestamp;
  }


  public void setConsensusRunTimestamp(String consensusRunTimestamp) {
    this.consensusRunTimestamp = consensusRunTimestamp;
  }


  public TitaniumPopUpViewRequest evaluatedPriceId(String evaluatedPriceId) {
    
    this.evaluatedPriceId = evaluatedPriceId;
    return this;
  }

   /**
   * Get evaluatedPriceId
   * @return evaluatedPriceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEvaluatedPriceId() {
    return evaluatedPriceId;
  }


  public void setEvaluatedPriceId(String evaluatedPriceId) {
    this.evaluatedPriceId = evaluatedPriceId;
  }


  public TitaniumPopUpViewRequest submittedDate(String submittedDate) {
    
    this.submittedDate = submittedDate;
    return this;
  }

   /**
   * Get submittedDate
   * @return submittedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubmittedDate() {
    return submittedDate;
  }


  public void setSubmittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
  }


  public TitaniumPopUpViewRequest submittedId(String submittedId) {
    
    this.submittedId = submittedId;
    return this;
  }

   /**
   * Get submittedId
   * @return submittedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubmittedId() {
    return submittedId;
  }


  public void setSubmittedId(String submittedId) {
    this.submittedId = submittedId;
  }


  public TitaniumPopUpViewRequest traceName(String traceName) {
    
    this.traceName = traceName;
    return this;
  }

   /**
   * Get traceName
   * @return traceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTraceName() {
    return traceName;
  }


  public void setTraceName(String traceName) {
    this.traceName = traceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumPopUpViewRequest titaniumPopUpViewRequest = (TitaniumPopUpViewRequest) o;
    return Objects.equals(this.assetId, titaniumPopUpViewRequest.assetId) &&
        Objects.equals(this.consensusId, titaniumPopUpViewRequest.consensusId) &&
        Objects.equals(this.consensusRunTimestamp, titaniumPopUpViewRequest.consensusRunTimestamp) &&
        Objects.equals(this.evaluatedPriceId, titaniumPopUpViewRequest.evaluatedPriceId) &&
        Objects.equals(this.submittedDate, titaniumPopUpViewRequest.submittedDate) &&
        Objects.equals(this.submittedId, titaniumPopUpViewRequest.submittedId) &&
        Objects.equals(this.traceName, titaniumPopUpViewRequest.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, consensusId, consensusRunTimestamp, evaluatedPriceId, submittedDate, submittedId, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumPopUpViewRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    consensusId: ").append(toIndentedString(consensusId)).append("\n");
    sb.append("    consensusRunTimestamp: ").append(toIndentedString(consensusRunTimestamp)).append("\n");
    sb.append("    evaluatedPriceId: ").append(toIndentedString(evaluatedPriceId)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    submittedId: ").append(toIndentedString(submittedId)).append("\n");
    sb.append("    traceName: ").append(toIndentedString(traceName)).append("\n");
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
    openapiFields.add("consensusId");
    openapiFields.add("consensusRunTimestamp");
    openapiFields.add("evaluatedPriceId");
    openapiFields.add("submittedDate");
    openapiFields.add("submittedId");
    openapiFields.add("traceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumPopUpViewRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumPopUpViewRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumPopUpViewRequest is not found in the empty JSON string", TitaniumPopUpViewRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumPopUpViewRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumPopUpViewRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("consensusId") != null && !jsonObj.get("consensusId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusId").toString()));
      }
      if (jsonObj.get("consensusRunTimestamp") != null && !jsonObj.get("consensusRunTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusRunTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusRunTimestamp").toString()));
      }
      if (jsonObj.get("evaluatedPriceId") != null && !jsonObj.get("evaluatedPriceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `evaluatedPriceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("evaluatedPriceId").toString()));
      }
      if (jsonObj.get("submittedDate") != null && !jsonObj.get("submittedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submittedDate").toString()));
      }
      if (jsonObj.get("submittedId") != null && !jsonObj.get("submittedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submittedId").toString()));
      }
      if (jsonObj.get("traceName") != null && !jsonObj.get("traceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumPopUpViewRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumPopUpViewRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumPopUpViewRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumPopUpViewRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumPopUpViewRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumPopUpViewRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumPopUpViewRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumPopUpViewRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumPopUpViewRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumPopUpViewRequest
  */
  public static TitaniumPopUpViewRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumPopUpViewRequest.class);
  }

 /**
  * Convert an instance of TitaniumPopUpViewRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

