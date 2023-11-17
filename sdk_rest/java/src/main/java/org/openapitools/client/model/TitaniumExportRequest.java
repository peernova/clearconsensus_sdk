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
import org.openapitools.client.model.TitaniumFilter;
import org.openapitools.client.model.TitaniumFilterPack;
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
 * TitaniumExportRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:37:28.016539Z[UTC]")
public class TitaniumExportRequest {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP = "consensusRunTimestamp";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP)
  private String consensusRunTimestamp;

  public static final String SERIALIZED_NAME_FILTER_PACK = "filterPack";
  @SerializedName(SERIALIZED_NAME_FILTER_PACK)
  private TitaniumFilterPack filterPack;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<TitaniumFilter> filters = null;

  public static final String SERIALIZED_NAME_INCLUDE_HEADER = "includeHeader";
  @SerializedName(SERIALIZED_NAME_INCLUDE_HEADER)
  private Boolean includeHeader;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private TitaniumOrderBy orderBy;

  public static final String SERIALIZED_NAME_SUBMISSION_DATE = "submissionDate";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_DATE)
  private String submissionDate;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumExportRequest() { 
  }

  public TitaniumExportRequest assetId(String assetId) {
    
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


  public TitaniumExportRequest consensusRunTimestamp(String consensusRunTimestamp) {
    
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


  public TitaniumExportRequest filterPack(TitaniumFilterPack filterPack) {
    
    this.filterPack = filterPack;
    return this;
  }

   /**
   * Get filterPack
   * @return filterPack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumFilterPack getFilterPack() {
    return filterPack;
  }


  public void setFilterPack(TitaniumFilterPack filterPack) {
    this.filterPack = filterPack;
  }


  public TitaniumExportRequest filters(List<TitaniumFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public TitaniumExportRequest addFiltersItem(TitaniumFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<TitaniumFilter> filters) {
    this.filters = filters;
  }


  public TitaniumExportRequest includeHeader(Boolean includeHeader) {
    
    this.includeHeader = includeHeader;
    return this;
  }

   /**
   * Get includeHeader
   * @return includeHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeHeader() {
    return includeHeader;
  }


  public void setIncludeHeader(Boolean includeHeader) {
    this.includeHeader = includeHeader;
  }


  public TitaniumExportRequest orderBy(TitaniumOrderBy orderBy) {
    
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


  public TitaniumExportRequest submissionDate(String submissionDate) {
    
    this.submissionDate = submissionDate;
    return this;
  }

   /**
   * Get submissionDate
   * @return submissionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubmissionDate() {
    return submissionDate;
  }


  public void setSubmissionDate(String submissionDate) {
    this.submissionDate = submissionDate;
  }


  public TitaniumExportRequest traceName(String traceName) {
    
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
    TitaniumExportRequest titaniumExportRequest = (TitaniumExportRequest) o;
    return Objects.equals(this.assetId, titaniumExportRequest.assetId) &&
        Objects.equals(this.consensusRunTimestamp, titaniumExportRequest.consensusRunTimestamp) &&
        Objects.equals(this.filterPack, titaniumExportRequest.filterPack) &&
        Objects.equals(this.filters, titaniumExportRequest.filters) &&
        Objects.equals(this.includeHeader, titaniumExportRequest.includeHeader) &&
        Objects.equals(this.orderBy, titaniumExportRequest.orderBy) &&
        Objects.equals(this.submissionDate, titaniumExportRequest.submissionDate) &&
        Objects.equals(this.traceName, titaniumExportRequest.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, consensusRunTimestamp, filterPack, filters, includeHeader, orderBy, submissionDate, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumExportRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    consensusRunTimestamp: ").append(toIndentedString(consensusRunTimestamp)).append("\n");
    sb.append("    filterPack: ").append(toIndentedString(filterPack)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    includeHeader: ").append(toIndentedString(includeHeader)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    submissionDate: ").append(toIndentedString(submissionDate)).append("\n");
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
    openapiFields.add("filterPack");
    openapiFields.add("filters");
    openapiFields.add("includeHeader");
    openapiFields.add("orderBy");
    openapiFields.add("submissionDate");
    openapiFields.add("traceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumExportRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumExportRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumExportRequest is not found in the empty JSON string", TitaniumExportRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumExportRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumExportRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("consensusRunTimestamp") != null && !jsonObj.get("consensusRunTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusRunTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusRunTimestamp").toString()));
      }
      // validate the optional field `filterPack`
      if (jsonObj.getAsJsonObject("filterPack") != null) {
        TitaniumFilterPack.validateJsonObject(jsonObj.getAsJsonObject("filterPack"));
      }
      JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
      if (jsonArrayfilters != null) {
        // ensure the json data is an array
        if (!jsonObj.get("filters").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
        }

        // validate the optional field `filters` (array)
        for (int i = 0; i < jsonArrayfilters.size(); i++) {
          TitaniumFilter.validateJsonObject(jsonArrayfilters.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `orderBy`
      if (jsonObj.getAsJsonObject("orderBy") != null) {
        TitaniumOrderBy.validateJsonObject(jsonObj.getAsJsonObject("orderBy"));
      }
      if (jsonObj.get("submissionDate") != null && !jsonObj.get("submissionDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submissionDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submissionDate").toString()));
      }
      if (jsonObj.get("traceName") != null && !jsonObj.get("traceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumExportRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumExportRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumExportRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumExportRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumExportRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumExportRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumExportRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumExportRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumExportRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumExportRequest
  */
  public static TitaniumExportRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumExportRequest.class);
  }

 /**
  * Convert an instance of TitaniumExportRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

