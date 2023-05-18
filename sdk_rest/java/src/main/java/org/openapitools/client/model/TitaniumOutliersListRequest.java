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
import org.openapitools.client.model.TitaniumLimit;
import org.openapitools.client.model.TitaniumOrderBy;

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
 * TitaniumOutliersListRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-18T19:12:46.243982Z[UTC]")
public class TitaniumOutliersListRequest {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP = "consensusRunTimestamp";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP)
  private String consensusRunTimestamp;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private TitaniumLimit limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private TitaniumOrderBy orderBy;

  public static final String SERIALIZED_NAME_SUBMITTED_DATE = "submittedDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DATE)
  private String submittedDate;

  public static final String SERIALIZED_NAME_SUBMITTED_ID = "submittedId";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ID)
  private String submittedId;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumOutliersListRequest() { 
  }

  public TitaniumOutliersListRequest assetId(String assetId) {
    
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


  public TitaniumOutliersListRequest consensusRunTimestamp(String consensusRunTimestamp) {
    
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


  public TitaniumOutliersListRequest filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public TitaniumOutliersListRequest limit(TitaniumLimit limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumLimit getLimit() {
    return limit;
  }


  public void setLimit(TitaniumLimit limit) {
    this.limit = limit;
  }


  public TitaniumOutliersListRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public TitaniumOutliersListRequest orderBy(TitaniumOrderBy orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumOrderBy getOrderBy() {
    return orderBy;
  }


  public void setOrderBy(TitaniumOrderBy orderBy) {
    this.orderBy = orderBy;
  }


  public TitaniumOutliersListRequest submittedDate(String submittedDate) {
    
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


  public TitaniumOutliersListRequest submittedId(String submittedId) {
    
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


  public TitaniumOutliersListRequest traceName(String traceName) {
    
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
    TitaniumOutliersListRequest titaniumOutliersListRequest = (TitaniumOutliersListRequest) o;
    return Objects.equals(this.assetId, titaniumOutliersListRequest.assetId) &&
        Objects.equals(this.consensusRunTimestamp, titaniumOutliersListRequest.consensusRunTimestamp) &&
        Objects.equals(this.filter, titaniumOutliersListRequest.filter) &&
        Objects.equals(this.limit, titaniumOutliersListRequest.limit) &&
        Objects.equals(this.offset, titaniumOutliersListRequest.offset) &&
        Objects.equals(this.orderBy, titaniumOutliersListRequest.orderBy) &&
        Objects.equals(this.submittedDate, titaniumOutliersListRequest.submittedDate) &&
        Objects.equals(this.submittedId, titaniumOutliersListRequest.submittedId) &&
        Objects.equals(this.traceName, titaniumOutliersListRequest.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, consensusRunTimestamp, filter, limit, offset, orderBy, submittedDate, submittedId, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumOutliersListRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    consensusRunTimestamp: ").append(toIndentedString(consensusRunTimestamp)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
    openapiFields.add("consensusRunTimestamp");
    openapiFields.add("filter");
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("orderBy");
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
  * @throws IOException if the JSON Object is invalid with respect to TitaniumOutliersListRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumOutliersListRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumOutliersListRequest is not found in the empty JSON string", TitaniumOutliersListRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumOutliersListRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumOutliersListRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("consensusRunTimestamp") != null && !jsonObj.get("consensusRunTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusRunTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusRunTimestamp").toString()));
      }
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // validate the optional field `limit`
      if (jsonObj.getAsJsonObject("limit") != null) {
        TitaniumLimit.validateJsonObject(jsonObj.getAsJsonObject("limit"));
      }
      // validate the optional field `orderBy`
      if (jsonObj.getAsJsonObject("orderBy") != null) {
        TitaniumOrderBy.validateJsonObject(jsonObj.getAsJsonObject("orderBy"));
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
       if (!TitaniumOutliersListRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumOutliersListRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumOutliersListRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumOutliersListRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumOutliersListRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumOutliersListRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumOutliersListRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumOutliersListRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumOutliersListRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumOutliersListRequest
  */
  public static TitaniumOutliersListRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumOutliersListRequest.class);
  }

 /**
  * Convert an instance of TitaniumOutliersListRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

