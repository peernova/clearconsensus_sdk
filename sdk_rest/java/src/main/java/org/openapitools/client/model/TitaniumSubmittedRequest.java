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
import org.openapitools.client.model.TitaniumCollapseTableRequest;
import org.openapitools.client.model.TitaniumTableRequest;

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
 * TitaniumSubmittedRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:38:32.244224Z[UTC]")
public class TitaniumSubmittedRequest {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_COLLAPSE_TABLE_CONFIG = "collapseTableConfig";
  @SerializedName(SERIALIZED_NAME_COLLAPSE_TABLE_CONFIG)
  private TitaniumCollapseTableRequest collapseTableConfig;

  public static final String SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP = "consensusRunTimestamp";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP)
  private String consensusRunTimestamp;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_SUBMITTED_DATE = "submittedDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DATE)
  private String submittedDate;

  public static final String SERIALIZED_NAME_TABLE_CONFIG = "tableConfig";
  @SerializedName(SERIALIZED_NAME_TABLE_CONFIG)
  private TitaniumTableRequest tableConfig;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumSubmittedRequest() { 
  }

  public TitaniumSubmittedRequest assetId(String assetId) {
    
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


  public TitaniumSubmittedRequest collapseTableConfig(TitaniumCollapseTableRequest collapseTableConfig) {
    
    this.collapseTableConfig = collapseTableConfig;
    return this;
  }

   /**
   * Get collapseTableConfig
   * @return collapseTableConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumCollapseTableRequest getCollapseTableConfig() {
    return collapseTableConfig;
  }


  public void setCollapseTableConfig(TitaniumCollapseTableRequest collapseTableConfig) {
    this.collapseTableConfig = collapseTableConfig;
  }


  public TitaniumSubmittedRequest consensusRunTimestamp(String consensusRunTimestamp) {
    
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


  public TitaniumSubmittedRequest dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public TitaniumSubmittedRequest submittedDate(String submittedDate) {
    
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


  public TitaniumSubmittedRequest tableConfig(TitaniumTableRequest tableConfig) {
    
    this.tableConfig = tableConfig;
    return this;
  }

   /**
   * Get tableConfig
   * @return tableConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumTableRequest getTableConfig() {
    return tableConfig;
  }


  public void setTableConfig(TitaniumTableRequest tableConfig) {
    this.tableConfig = tableConfig;
  }


  public TitaniumSubmittedRequest traceName(String traceName) {
    
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
    TitaniumSubmittedRequest titaniumSubmittedRequest = (TitaniumSubmittedRequest) o;
    return Objects.equals(this.assetId, titaniumSubmittedRequest.assetId) &&
        Objects.equals(this.collapseTableConfig, titaniumSubmittedRequest.collapseTableConfig) &&
        Objects.equals(this.consensusRunTimestamp, titaniumSubmittedRequest.consensusRunTimestamp) &&
        Objects.equals(this.dataType, titaniumSubmittedRequest.dataType) &&
        Objects.equals(this.submittedDate, titaniumSubmittedRequest.submittedDate) &&
        Objects.equals(this.tableConfig, titaniumSubmittedRequest.tableConfig) &&
        Objects.equals(this.traceName, titaniumSubmittedRequest.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, collapseTableConfig, consensusRunTimestamp, dataType, submittedDate, tableConfig, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumSubmittedRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    collapseTableConfig: ").append(toIndentedString(collapseTableConfig)).append("\n");
    sb.append("    consensusRunTimestamp: ").append(toIndentedString(consensusRunTimestamp)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    tableConfig: ").append(toIndentedString(tableConfig)).append("\n");
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
    openapiFields.add("collapseTableConfig");
    openapiFields.add("consensusRunTimestamp");
    openapiFields.add("dataType");
    openapiFields.add("submittedDate");
    openapiFields.add("tableConfig");
    openapiFields.add("traceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumSubmittedRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumSubmittedRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumSubmittedRequest is not found in the empty JSON string", TitaniumSubmittedRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumSubmittedRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumSubmittedRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      // validate the optional field `collapseTableConfig`
      if (jsonObj.getAsJsonObject("collapseTableConfig") != null) {
        TitaniumCollapseTableRequest.validateJsonObject(jsonObj.getAsJsonObject("collapseTableConfig"));
      }
      if (jsonObj.get("consensusRunTimestamp") != null && !jsonObj.get("consensusRunTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusRunTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusRunTimestamp").toString()));
      }
      if (jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
      if (jsonObj.get("submittedDate") != null && !jsonObj.get("submittedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submittedDate").toString()));
      }
      // validate the optional field `tableConfig`
      if (jsonObj.getAsJsonObject("tableConfig") != null) {
        TitaniumTableRequest.validateJsonObject(jsonObj.getAsJsonObject("tableConfig"));
      }
      if (jsonObj.get("traceName") != null && !jsonObj.get("traceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumSubmittedRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumSubmittedRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumSubmittedRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumSubmittedRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumSubmittedRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumSubmittedRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumSubmittedRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumSubmittedRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumSubmittedRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumSubmittedRequest
  */
  public static TitaniumSubmittedRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumSubmittedRequest.class);
  }

 /**
  * Convert an instance of TitaniumSubmittedRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

