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
import org.openapitools.client.model.TitaniumConsensusResultSetInfo;

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
 * TitaniumConsensusRunInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:16:25.794270Z[UTC]")
public class TitaniumConsensusRunInfo {
  public static final String SERIALIZED_NAME_CONSENSUS_RESULT_SET_INFO = "consensusResultSetInfo";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_RESULT_SET_INFO)
  private List<TitaniumConsensusResultSetInfo> consensusResultSetInfo = null;

  public static final String SERIALIZED_NAME_CONSENSUS_RUN_ID = "consensusRunId";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_RUN_ID)
  private String consensusRunId;

  public static final String SERIALIZED_NAME_NUMBER_OF_PARTICIPANTS = "numberOfParticipants";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PARTICIPANTS)
  private Integer numberOfParticipants;

  public static final String SERIALIZED_NAME_RUN_BY = "runBy";
  @SerializedName(SERIALIZED_NAME_RUN_BY)
  private String runBy;

  public TitaniumConsensusRunInfo() { 
  }

  public TitaniumConsensusRunInfo consensusResultSetInfo(List<TitaniumConsensusResultSetInfo> consensusResultSetInfo) {
    
    this.consensusResultSetInfo = consensusResultSetInfo;
    return this;
  }

  public TitaniumConsensusRunInfo addConsensusResultSetInfoItem(TitaniumConsensusResultSetInfo consensusResultSetInfoItem) {
    if (this.consensusResultSetInfo == null) {
      this.consensusResultSetInfo = new ArrayList<>();
    }
    this.consensusResultSetInfo.add(consensusResultSetInfoItem);
    return this;
  }

   /**
   * Get consensusResultSetInfo
   * @return consensusResultSetInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumConsensusResultSetInfo> getConsensusResultSetInfo() {
    return consensusResultSetInfo;
  }


  public void setConsensusResultSetInfo(List<TitaniumConsensusResultSetInfo> consensusResultSetInfo) {
    this.consensusResultSetInfo = consensusResultSetInfo;
  }


  public TitaniumConsensusRunInfo consensusRunId(String consensusRunId) {
    
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


  public TitaniumConsensusRunInfo numberOfParticipants(Integer numberOfParticipants) {
    
    this.numberOfParticipants = numberOfParticipants;
    return this;
  }

   /**
   * Get numberOfParticipants
   * @return numberOfParticipants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumberOfParticipants() {
    return numberOfParticipants;
  }


  public void setNumberOfParticipants(Integer numberOfParticipants) {
    this.numberOfParticipants = numberOfParticipants;
  }


  public TitaniumConsensusRunInfo runBy(String runBy) {
    
    this.runBy = runBy;
    return this;
  }

   /**
   * Get runBy
   * @return runBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunBy() {
    return runBy;
  }


  public void setRunBy(String runBy) {
    this.runBy = runBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusRunInfo titaniumConsensusRunInfo = (TitaniumConsensusRunInfo) o;
    return Objects.equals(this.consensusResultSetInfo, titaniumConsensusRunInfo.consensusResultSetInfo) &&
        Objects.equals(this.consensusRunId, titaniumConsensusRunInfo.consensusRunId) &&
        Objects.equals(this.numberOfParticipants, titaniumConsensusRunInfo.numberOfParticipants) &&
        Objects.equals(this.runBy, titaniumConsensusRunInfo.runBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consensusResultSetInfo, consensusRunId, numberOfParticipants, runBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusRunInfo {\n");
    sb.append("    consensusResultSetInfo: ").append(toIndentedString(consensusResultSetInfo)).append("\n");
    sb.append("    consensusRunId: ").append(toIndentedString(consensusRunId)).append("\n");
    sb.append("    numberOfParticipants: ").append(toIndentedString(numberOfParticipants)).append("\n");
    sb.append("    runBy: ").append(toIndentedString(runBy)).append("\n");
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
    openapiFields.add("consensusResultSetInfo");
    openapiFields.add("consensusRunId");
    openapiFields.add("numberOfParticipants");
    openapiFields.add("runBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusRunInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusRunInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusRunInfo is not found in the empty JSON string", TitaniumConsensusRunInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusRunInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusRunInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayconsensusResultSetInfo = jsonObj.getAsJsonArray("consensusResultSetInfo");
      if (jsonArrayconsensusResultSetInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("consensusResultSetInfo").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `consensusResultSetInfo` to be an array in the JSON string but got `%s`", jsonObj.get("consensusResultSetInfo").toString()));
        }

        // validate the optional field `consensusResultSetInfo` (array)
        for (int i = 0; i < jsonArrayconsensusResultSetInfo.size(); i++) {
          TitaniumConsensusResultSetInfo.validateJsonObject(jsonArrayconsensusResultSetInfo.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("consensusRunId") != null && !jsonObj.get("consensusRunId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusRunId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusRunId").toString()));
      }
      if (jsonObj.get("runBy") != null && !jsonObj.get("runBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusRunInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusRunInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusRunInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusRunInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusRunInfo>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusRunInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusRunInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusRunInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusRunInfo
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusRunInfo
  */
  public static TitaniumConsensusRunInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusRunInfo.class);
  }

 /**
  * Convert an instance of TitaniumConsensusRunInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

