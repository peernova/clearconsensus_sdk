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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TitaniumConsensusScores;
import org.openapitools.client.model.TitaniumInstrumentSubmissionStatus;
import org.openapitools.client.model.TitaniumStringKeyVal;

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
 * TitaniumConsensusExplorerInstrumentDetailsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumConsensusExplorerInstrumentDetailsData {
  public static final String SERIALIZED_NAME_CONSENSUS_SCORES = "consensusScores";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_SCORES)
  private TitaniumConsensusScores consensusScores;

  public static final String SERIALIZED_NAME_INSTRUMENT_DETAILS = "instrumentDetails";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_DETAILS)
  private List<TitaniumStringKeyVal> instrumentDetails = null;

  public static final String SERIALIZED_NAME_INSTRUMENT_SUBMISSION_STATUS = "instrumentSubmissionStatus";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_SUBMISSION_STATUS)
  private TitaniumInstrumentSubmissionStatus instrumentSubmissionStatus;

  public static final String SERIALIZED_NAME_SUBMISSION_ID = "submissionId";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ID)
  private String submissionId;

  public TitaniumConsensusExplorerInstrumentDetailsData() { 
  }

  public TitaniumConsensusExplorerInstrumentDetailsData consensusScores(TitaniumConsensusScores consensusScores) {
    
    this.consensusScores = consensusScores;
    return this;
  }

   /**
   * Get consensusScores
   * @return consensusScores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumConsensusScores getConsensusScores() {
    return consensusScores;
  }


  public void setConsensusScores(TitaniumConsensusScores consensusScores) {
    this.consensusScores = consensusScores;
  }


  public TitaniumConsensusExplorerInstrumentDetailsData instrumentDetails(List<TitaniumStringKeyVal> instrumentDetails) {
    
    this.instrumentDetails = instrumentDetails;
    return this;
  }

  public TitaniumConsensusExplorerInstrumentDetailsData addInstrumentDetailsItem(TitaniumStringKeyVal instrumentDetailsItem) {
    if (this.instrumentDetails == null) {
      this.instrumentDetails = new ArrayList<>();
    }
    this.instrumentDetails.add(instrumentDetailsItem);
    return this;
  }

   /**
   * Get instrumentDetails
   * @return instrumentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumStringKeyVal> getInstrumentDetails() {
    return instrumentDetails;
  }


  public void setInstrumentDetails(List<TitaniumStringKeyVal> instrumentDetails) {
    this.instrumentDetails = instrumentDetails;
  }


  public TitaniumConsensusExplorerInstrumentDetailsData instrumentSubmissionStatus(TitaniumInstrumentSubmissionStatus instrumentSubmissionStatus) {
    
    this.instrumentSubmissionStatus = instrumentSubmissionStatus;
    return this;
  }

   /**
   * Get instrumentSubmissionStatus
   * @return instrumentSubmissionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumInstrumentSubmissionStatus getInstrumentSubmissionStatus() {
    return instrumentSubmissionStatus;
  }


  public void setInstrumentSubmissionStatus(TitaniumInstrumentSubmissionStatus instrumentSubmissionStatus) {
    this.instrumentSubmissionStatus = instrumentSubmissionStatus;
  }


  public TitaniumConsensusExplorerInstrumentDetailsData submissionId(String submissionId) {
    
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Get submissionId
   * @return submissionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubmissionId() {
    return submissionId;
  }


  public void setSubmissionId(String submissionId) {
    this.submissionId = submissionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusExplorerInstrumentDetailsData titaniumConsensusExplorerInstrumentDetailsData = (TitaniumConsensusExplorerInstrumentDetailsData) o;
    return Objects.equals(this.consensusScores, titaniumConsensusExplorerInstrumentDetailsData.consensusScores) &&
        Objects.equals(this.instrumentDetails, titaniumConsensusExplorerInstrumentDetailsData.instrumentDetails) &&
        Objects.equals(this.instrumentSubmissionStatus, titaniumConsensusExplorerInstrumentDetailsData.instrumentSubmissionStatus) &&
        Objects.equals(this.submissionId, titaniumConsensusExplorerInstrumentDetailsData.submissionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consensusScores, instrumentDetails, instrumentSubmissionStatus, submissionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusExplorerInstrumentDetailsData {\n");
    sb.append("    consensusScores: ").append(toIndentedString(consensusScores)).append("\n");
    sb.append("    instrumentDetails: ").append(toIndentedString(instrumentDetails)).append("\n");
    sb.append("    instrumentSubmissionStatus: ").append(toIndentedString(instrumentSubmissionStatus)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
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
    openapiFields.add("consensusScores");
    openapiFields.add("instrumentDetails");
    openapiFields.add("instrumentSubmissionStatus");
    openapiFields.add("submissionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusExplorerInstrumentDetailsData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusExplorerInstrumentDetailsData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusExplorerInstrumentDetailsData is not found in the empty JSON string", TitaniumConsensusExplorerInstrumentDetailsData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusExplorerInstrumentDetailsData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusExplorerInstrumentDetailsData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `consensusScores`
      if (jsonObj.getAsJsonObject("consensusScores") != null) {
        TitaniumConsensusScores.validateJsonObject(jsonObj.getAsJsonObject("consensusScores"));
      }
      JsonArray jsonArrayinstrumentDetails = jsonObj.getAsJsonArray("instrumentDetails");
      if (jsonArrayinstrumentDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("instrumentDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `instrumentDetails` to be an array in the JSON string but got `%s`", jsonObj.get("instrumentDetails").toString()));
        }

        // validate the optional field `instrumentDetails` (array)
        for (int i = 0; i < jsonArrayinstrumentDetails.size(); i++) {
          TitaniumStringKeyVal.validateJsonObject(jsonArrayinstrumentDetails.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `instrumentSubmissionStatus`
      if (jsonObj.getAsJsonObject("instrumentSubmissionStatus") != null) {
        TitaniumInstrumentSubmissionStatus.validateJsonObject(jsonObj.getAsJsonObject("instrumentSubmissionStatus"));
      }
      if (jsonObj.get("submissionId") != null && !jsonObj.get("submissionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submissionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submissionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusExplorerInstrumentDetailsData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusExplorerInstrumentDetailsData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusExplorerInstrumentDetailsData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusExplorerInstrumentDetailsData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusExplorerInstrumentDetailsData>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusExplorerInstrumentDetailsData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusExplorerInstrumentDetailsData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusExplorerInstrumentDetailsData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusExplorerInstrumentDetailsData
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusExplorerInstrumentDetailsData
  */
  public static TitaniumConsensusExplorerInstrumentDetailsData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusExplorerInstrumentDetailsData.class);
  }

 /**
  * Convert an instance of TitaniumConsensusExplorerInstrumentDetailsData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

