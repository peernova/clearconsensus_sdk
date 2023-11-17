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
import org.openapitools.client.model.TitaniumDateAndValue;

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
 * TitaniumInstrumentSubmissionStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:38:32.244224Z[UTC]")
public class TitaniumInstrumentSubmissionStatus {
  public static final String SERIALIZED_NAME_CONSENSUS_STATUS = "consensusStatus";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_STATUS)
  private String consensusStatus;

  public static final String SERIALIZED_NAME_CONSENSUS_STATUS_DETAILS = "consensusStatusDetails";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_STATUS_DETAILS)
  private String consensusStatusDetails;

  public static final String SERIALIZED_NAME_CONSENSUS_STATUS_DETAILS_HISTORY = "consensusStatusDetailsHistory";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_STATUS_DETAILS_HISTORY)
  private List<TitaniumDateAndValue> consensusStatusDetailsHistory = null;

  public static final String SERIALIZED_NAME_CONSENSUS_STATUS_HISTORY = "consensusStatusHistory";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_STATUS_HISTORY)
  private List<TitaniumDateAndValue> consensusStatusHistory = null;

  public static final String SERIALIZED_NAME_DQE_HISTORY = "dqeHistory";
  @SerializedName(SERIALIZED_NAME_DQE_HISTORY)
  private List<TitaniumDateAndValue> dqeHistory = null;

  public static final String SERIALIZED_NAME_HIGHEST_DQE = "highestDqe";
  @SerializedName(SERIALIZED_NAME_HIGHEST_DQE)
  private String highestDqe;

  public static final String SERIALIZED_NAME_PARTICIPANT_COHORT_CONSENSUS_STATUS = "participantCohortConsensusStatus";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_COHORT_CONSENSUS_STATUS)
  private String participantCohortConsensusStatus;

  public static final String SERIALIZED_NAME_PARTICIPANT_COHORT_CONSENSUS_STATUS_HISTORY = "participantCohortConsensusStatusHistory";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_COHORT_CONSENSUS_STATUS_HISTORY)
  private List<TitaniumDateAndValue> participantCohortConsensusStatusHistory = null;

  public static final String SERIALIZED_NAME_PARTICIPANT_SUBMISSIONS_EVIDENCE_STATUS = "participantSubmissionsEvidenceStatus";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_SUBMISSIONS_EVIDENCE_STATUS)
  private String participantSubmissionsEvidenceStatus;

  public static final String SERIALIZED_NAME_PARTICIPANT_SUBMISSIONS_EVIDENCE_STATUS_HISTORY = "participantSubmissionsEvidenceStatusHistory";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT_SUBMISSIONS_EVIDENCE_STATUS_HISTORY)
  private List<TitaniumDateAndValue> participantSubmissionsEvidenceStatusHistory = null;

  public TitaniumInstrumentSubmissionStatus() { 
  }

  public TitaniumInstrumentSubmissionStatus consensusStatus(String consensusStatus) {
    
    this.consensusStatus = consensusStatus;
    return this;
  }

   /**
   * Get consensusStatus
   * @return consensusStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsensusStatus() {
    return consensusStatus;
  }


  public void setConsensusStatus(String consensusStatus) {
    this.consensusStatus = consensusStatus;
  }


  public TitaniumInstrumentSubmissionStatus consensusStatusDetails(String consensusStatusDetails) {
    
    this.consensusStatusDetails = consensusStatusDetails;
    return this;
  }

   /**
   * Get consensusStatusDetails
   * @return consensusStatusDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsensusStatusDetails() {
    return consensusStatusDetails;
  }


  public void setConsensusStatusDetails(String consensusStatusDetails) {
    this.consensusStatusDetails = consensusStatusDetails;
  }


  public TitaniumInstrumentSubmissionStatus consensusStatusDetailsHistory(List<TitaniumDateAndValue> consensusStatusDetailsHistory) {
    
    this.consensusStatusDetailsHistory = consensusStatusDetailsHistory;
    return this;
  }

  public TitaniumInstrumentSubmissionStatus addConsensusStatusDetailsHistoryItem(TitaniumDateAndValue consensusStatusDetailsHistoryItem) {
    if (this.consensusStatusDetailsHistory == null) {
      this.consensusStatusDetailsHistory = new ArrayList<>();
    }
    this.consensusStatusDetailsHistory.add(consensusStatusDetailsHistoryItem);
    return this;
  }

   /**
   * Get consensusStatusDetailsHistory
   * @return consensusStatusDetailsHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumDateAndValue> getConsensusStatusDetailsHistory() {
    return consensusStatusDetailsHistory;
  }


  public void setConsensusStatusDetailsHistory(List<TitaniumDateAndValue> consensusStatusDetailsHistory) {
    this.consensusStatusDetailsHistory = consensusStatusDetailsHistory;
  }


  public TitaniumInstrumentSubmissionStatus consensusStatusHistory(List<TitaniumDateAndValue> consensusStatusHistory) {
    
    this.consensusStatusHistory = consensusStatusHistory;
    return this;
  }

  public TitaniumInstrumentSubmissionStatus addConsensusStatusHistoryItem(TitaniumDateAndValue consensusStatusHistoryItem) {
    if (this.consensusStatusHistory == null) {
      this.consensusStatusHistory = new ArrayList<>();
    }
    this.consensusStatusHistory.add(consensusStatusHistoryItem);
    return this;
  }

   /**
   * Get consensusStatusHistory
   * @return consensusStatusHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumDateAndValue> getConsensusStatusHistory() {
    return consensusStatusHistory;
  }


  public void setConsensusStatusHistory(List<TitaniumDateAndValue> consensusStatusHistory) {
    this.consensusStatusHistory = consensusStatusHistory;
  }


  public TitaniumInstrumentSubmissionStatus dqeHistory(List<TitaniumDateAndValue> dqeHistory) {
    
    this.dqeHistory = dqeHistory;
    return this;
  }

  public TitaniumInstrumentSubmissionStatus addDqeHistoryItem(TitaniumDateAndValue dqeHistoryItem) {
    if (this.dqeHistory == null) {
      this.dqeHistory = new ArrayList<>();
    }
    this.dqeHistory.add(dqeHistoryItem);
    return this;
  }

   /**
   * Get dqeHistory
   * @return dqeHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumDateAndValue> getDqeHistory() {
    return dqeHistory;
  }


  public void setDqeHistory(List<TitaniumDateAndValue> dqeHistory) {
    this.dqeHistory = dqeHistory;
  }


  public TitaniumInstrumentSubmissionStatus highestDqe(String highestDqe) {
    
    this.highestDqe = highestDqe;
    return this;
  }

   /**
   * Get highestDqe
   * @return highestDqe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHighestDqe() {
    return highestDqe;
  }


  public void setHighestDqe(String highestDqe) {
    this.highestDqe = highestDqe;
  }


  public TitaniumInstrumentSubmissionStatus participantCohortConsensusStatus(String participantCohortConsensusStatus) {
    
    this.participantCohortConsensusStatus = participantCohortConsensusStatus;
    return this;
  }

   /**
   * Get participantCohortConsensusStatus
   * @return participantCohortConsensusStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParticipantCohortConsensusStatus() {
    return participantCohortConsensusStatus;
  }


  public void setParticipantCohortConsensusStatus(String participantCohortConsensusStatus) {
    this.participantCohortConsensusStatus = participantCohortConsensusStatus;
  }


  public TitaniumInstrumentSubmissionStatus participantCohortConsensusStatusHistory(List<TitaniumDateAndValue> participantCohortConsensusStatusHistory) {
    
    this.participantCohortConsensusStatusHistory = participantCohortConsensusStatusHistory;
    return this;
  }

  public TitaniumInstrumentSubmissionStatus addParticipantCohortConsensusStatusHistoryItem(TitaniumDateAndValue participantCohortConsensusStatusHistoryItem) {
    if (this.participantCohortConsensusStatusHistory == null) {
      this.participantCohortConsensusStatusHistory = new ArrayList<>();
    }
    this.participantCohortConsensusStatusHistory.add(participantCohortConsensusStatusHistoryItem);
    return this;
  }

   /**
   * Get participantCohortConsensusStatusHistory
   * @return participantCohortConsensusStatusHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumDateAndValue> getParticipantCohortConsensusStatusHistory() {
    return participantCohortConsensusStatusHistory;
  }


  public void setParticipantCohortConsensusStatusHistory(List<TitaniumDateAndValue> participantCohortConsensusStatusHistory) {
    this.participantCohortConsensusStatusHistory = participantCohortConsensusStatusHistory;
  }


  public TitaniumInstrumentSubmissionStatus participantSubmissionsEvidenceStatus(String participantSubmissionsEvidenceStatus) {
    
    this.participantSubmissionsEvidenceStatus = participantSubmissionsEvidenceStatus;
    return this;
  }

   /**
   * Get participantSubmissionsEvidenceStatus
   * @return participantSubmissionsEvidenceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParticipantSubmissionsEvidenceStatus() {
    return participantSubmissionsEvidenceStatus;
  }


  public void setParticipantSubmissionsEvidenceStatus(String participantSubmissionsEvidenceStatus) {
    this.participantSubmissionsEvidenceStatus = participantSubmissionsEvidenceStatus;
  }


  public TitaniumInstrumentSubmissionStatus participantSubmissionsEvidenceStatusHistory(List<TitaniumDateAndValue> participantSubmissionsEvidenceStatusHistory) {
    
    this.participantSubmissionsEvidenceStatusHistory = participantSubmissionsEvidenceStatusHistory;
    return this;
  }

  public TitaniumInstrumentSubmissionStatus addParticipantSubmissionsEvidenceStatusHistoryItem(TitaniumDateAndValue participantSubmissionsEvidenceStatusHistoryItem) {
    if (this.participantSubmissionsEvidenceStatusHistory == null) {
      this.participantSubmissionsEvidenceStatusHistory = new ArrayList<>();
    }
    this.participantSubmissionsEvidenceStatusHistory.add(participantSubmissionsEvidenceStatusHistoryItem);
    return this;
  }

   /**
   * Get participantSubmissionsEvidenceStatusHistory
   * @return participantSubmissionsEvidenceStatusHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumDateAndValue> getParticipantSubmissionsEvidenceStatusHistory() {
    return participantSubmissionsEvidenceStatusHistory;
  }


  public void setParticipantSubmissionsEvidenceStatusHistory(List<TitaniumDateAndValue> participantSubmissionsEvidenceStatusHistory) {
    this.participantSubmissionsEvidenceStatusHistory = participantSubmissionsEvidenceStatusHistory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumInstrumentSubmissionStatus titaniumInstrumentSubmissionStatus = (TitaniumInstrumentSubmissionStatus) o;
    return Objects.equals(this.consensusStatus, titaniumInstrumentSubmissionStatus.consensusStatus) &&
        Objects.equals(this.consensusStatusDetails, titaniumInstrumentSubmissionStatus.consensusStatusDetails) &&
        Objects.equals(this.consensusStatusDetailsHistory, titaniumInstrumentSubmissionStatus.consensusStatusDetailsHistory) &&
        Objects.equals(this.consensusStatusHistory, titaniumInstrumentSubmissionStatus.consensusStatusHistory) &&
        Objects.equals(this.dqeHistory, titaniumInstrumentSubmissionStatus.dqeHistory) &&
        Objects.equals(this.highestDqe, titaniumInstrumentSubmissionStatus.highestDqe) &&
        Objects.equals(this.participantCohortConsensusStatus, titaniumInstrumentSubmissionStatus.participantCohortConsensusStatus) &&
        Objects.equals(this.participantCohortConsensusStatusHistory, titaniumInstrumentSubmissionStatus.participantCohortConsensusStatusHistory) &&
        Objects.equals(this.participantSubmissionsEvidenceStatus, titaniumInstrumentSubmissionStatus.participantSubmissionsEvidenceStatus) &&
        Objects.equals(this.participantSubmissionsEvidenceStatusHistory, titaniumInstrumentSubmissionStatus.participantSubmissionsEvidenceStatusHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consensusStatus, consensusStatusDetails, consensusStatusDetailsHistory, consensusStatusHistory, dqeHistory, highestDqe, participantCohortConsensusStatus, participantCohortConsensusStatusHistory, participantSubmissionsEvidenceStatus, participantSubmissionsEvidenceStatusHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumInstrumentSubmissionStatus {\n");
    sb.append("    consensusStatus: ").append(toIndentedString(consensusStatus)).append("\n");
    sb.append("    consensusStatusDetails: ").append(toIndentedString(consensusStatusDetails)).append("\n");
    sb.append("    consensusStatusDetailsHistory: ").append(toIndentedString(consensusStatusDetailsHistory)).append("\n");
    sb.append("    consensusStatusHistory: ").append(toIndentedString(consensusStatusHistory)).append("\n");
    sb.append("    dqeHistory: ").append(toIndentedString(dqeHistory)).append("\n");
    sb.append("    highestDqe: ").append(toIndentedString(highestDqe)).append("\n");
    sb.append("    participantCohortConsensusStatus: ").append(toIndentedString(participantCohortConsensusStatus)).append("\n");
    sb.append("    participantCohortConsensusStatusHistory: ").append(toIndentedString(participantCohortConsensusStatusHistory)).append("\n");
    sb.append("    participantSubmissionsEvidenceStatus: ").append(toIndentedString(participantSubmissionsEvidenceStatus)).append("\n");
    sb.append("    participantSubmissionsEvidenceStatusHistory: ").append(toIndentedString(participantSubmissionsEvidenceStatusHistory)).append("\n");
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
    openapiFields.add("consensusStatus");
    openapiFields.add("consensusStatusDetails");
    openapiFields.add("consensusStatusDetailsHistory");
    openapiFields.add("consensusStatusHistory");
    openapiFields.add("dqeHistory");
    openapiFields.add("highestDqe");
    openapiFields.add("participantCohortConsensusStatus");
    openapiFields.add("participantCohortConsensusStatusHistory");
    openapiFields.add("participantSubmissionsEvidenceStatus");
    openapiFields.add("participantSubmissionsEvidenceStatusHistory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumInstrumentSubmissionStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumInstrumentSubmissionStatus.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumInstrumentSubmissionStatus is not found in the empty JSON string", TitaniumInstrumentSubmissionStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumInstrumentSubmissionStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumInstrumentSubmissionStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("consensusStatus") != null && !jsonObj.get("consensusStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusStatus").toString()));
      }
      if (jsonObj.get("consensusStatusDetails") != null && !jsonObj.get("consensusStatusDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusStatusDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusStatusDetails").toString()));
      }
      JsonArray jsonArrayconsensusStatusDetailsHistory = jsonObj.getAsJsonArray("consensusStatusDetailsHistory");
      if (jsonArrayconsensusStatusDetailsHistory != null) {
        // ensure the json data is an array
        if (!jsonObj.get("consensusStatusDetailsHistory").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `consensusStatusDetailsHistory` to be an array in the JSON string but got `%s`", jsonObj.get("consensusStatusDetailsHistory").toString()));
        }

        // validate the optional field `consensusStatusDetailsHistory` (array)
        for (int i = 0; i < jsonArrayconsensusStatusDetailsHistory.size(); i++) {
          TitaniumDateAndValue.validateJsonObject(jsonArrayconsensusStatusDetailsHistory.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayconsensusStatusHistory = jsonObj.getAsJsonArray("consensusStatusHistory");
      if (jsonArrayconsensusStatusHistory != null) {
        // ensure the json data is an array
        if (!jsonObj.get("consensusStatusHistory").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `consensusStatusHistory` to be an array in the JSON string but got `%s`", jsonObj.get("consensusStatusHistory").toString()));
        }

        // validate the optional field `consensusStatusHistory` (array)
        for (int i = 0; i < jsonArrayconsensusStatusHistory.size(); i++) {
          TitaniumDateAndValue.validateJsonObject(jsonArrayconsensusStatusHistory.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraydqeHistory = jsonObj.getAsJsonArray("dqeHistory");
      if (jsonArraydqeHistory != null) {
        // ensure the json data is an array
        if (!jsonObj.get("dqeHistory").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `dqeHistory` to be an array in the JSON string but got `%s`", jsonObj.get("dqeHistory").toString()));
        }

        // validate the optional field `dqeHistory` (array)
        for (int i = 0; i < jsonArraydqeHistory.size(); i++) {
          TitaniumDateAndValue.validateJsonObject(jsonArraydqeHistory.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("highestDqe") != null && !jsonObj.get("highestDqe").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `highestDqe` to be a primitive type in the JSON string but got `%s`", jsonObj.get("highestDqe").toString()));
      }
      if (jsonObj.get("participantCohortConsensusStatus") != null && !jsonObj.get("participantCohortConsensusStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `participantCohortConsensusStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("participantCohortConsensusStatus").toString()));
      }
      JsonArray jsonArrayparticipantCohortConsensusStatusHistory = jsonObj.getAsJsonArray("participantCohortConsensusStatusHistory");
      if (jsonArrayparticipantCohortConsensusStatusHistory != null) {
        // ensure the json data is an array
        if (!jsonObj.get("participantCohortConsensusStatusHistory").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `participantCohortConsensusStatusHistory` to be an array in the JSON string but got `%s`", jsonObj.get("participantCohortConsensusStatusHistory").toString()));
        }

        // validate the optional field `participantCohortConsensusStatusHistory` (array)
        for (int i = 0; i < jsonArrayparticipantCohortConsensusStatusHistory.size(); i++) {
          TitaniumDateAndValue.validateJsonObject(jsonArrayparticipantCohortConsensusStatusHistory.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("participantSubmissionsEvidenceStatus") != null && !jsonObj.get("participantSubmissionsEvidenceStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `participantSubmissionsEvidenceStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("participantSubmissionsEvidenceStatus").toString()));
      }
      JsonArray jsonArrayparticipantSubmissionsEvidenceStatusHistory = jsonObj.getAsJsonArray("participantSubmissionsEvidenceStatusHistory");
      if (jsonArrayparticipantSubmissionsEvidenceStatusHistory != null) {
        // ensure the json data is an array
        if (!jsonObj.get("participantSubmissionsEvidenceStatusHistory").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `participantSubmissionsEvidenceStatusHistory` to be an array in the JSON string but got `%s`", jsonObj.get("participantSubmissionsEvidenceStatusHistory").toString()));
        }

        // validate the optional field `participantSubmissionsEvidenceStatusHistory` (array)
        for (int i = 0; i < jsonArrayparticipantSubmissionsEvidenceStatusHistory.size(); i++) {
          TitaniumDateAndValue.validateJsonObject(jsonArrayparticipantSubmissionsEvidenceStatusHistory.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumInstrumentSubmissionStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumInstrumentSubmissionStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumInstrumentSubmissionStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumInstrumentSubmissionStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumInstrumentSubmissionStatus>() {
           @Override
           public void write(JsonWriter out, TitaniumInstrumentSubmissionStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumInstrumentSubmissionStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumInstrumentSubmissionStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumInstrumentSubmissionStatus
  * @throws IOException if the JSON string is invalid with respect to TitaniumInstrumentSubmissionStatus
  */
  public static TitaniumInstrumentSubmissionStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumInstrumentSubmissionStatus.class);
  }

 /**
  * Convert an instance of TitaniumInstrumentSubmissionStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

