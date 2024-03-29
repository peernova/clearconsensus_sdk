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
import org.openapitools.client.model.TitaniumFilterPack;
import org.openapitools.client.model.TitaniumOrderBy;
import org.openapitools.client.model.TitaniumPage;

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
 * TitaniumGetConsensusRunsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumGetConsensusRunsRequest {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_FILTER_PACK = "filterPack";
  @SerializedName(SERIALIZED_NAME_FILTER_PACK)
  private TitaniumFilterPack filterPack;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private TitaniumOrderBy orderBy;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private TitaniumPage page;

  public static final String SERIALIZED_NAME_PARTICIPANT = "participant";
  @SerializedName(SERIALIZED_NAME_PARTICIPANT)
  private String participant;

  public static final String SERIALIZED_NAME_SHOW_ARCHIVED = "showArchived";
  @SerializedName(SERIALIZED_NAME_SHOW_ARCHIVED)
  private Boolean showArchived;

  public static final String SERIALIZED_NAME_SNAP_DATE_FROM = "snapDateFrom";
  @SerializedName(SERIALIZED_NAME_SNAP_DATE_FROM)
  private String snapDateFrom;

  public static final String SERIALIZED_NAME_SNAP_DATE_TO = "snapDateTo";
  @SerializedName(SERIALIZED_NAME_SNAP_DATE_TO)
  private String snapDateTo;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumGetConsensusRunsRequest() { 
  }

  public TitaniumGetConsensusRunsRequest assetId(String assetId) {
    
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


  public TitaniumGetConsensusRunsRequest filterPack(TitaniumFilterPack filterPack) {
    
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


  public TitaniumGetConsensusRunsRequest orderBy(TitaniumOrderBy orderBy) {
    
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


  public TitaniumGetConsensusRunsRequest page(TitaniumPage page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumPage getPage() {
    return page;
  }


  public void setPage(TitaniumPage page) {
    this.page = page;
  }


  public TitaniumGetConsensusRunsRequest participant(String participant) {
    
    this.participant = participant;
    return this;
  }

   /**
   * Get participant
   * @return participant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParticipant() {
    return participant;
  }


  public void setParticipant(String participant) {
    this.participant = participant;
  }


  public TitaniumGetConsensusRunsRequest showArchived(Boolean showArchived) {
    
    this.showArchived = showArchived;
    return this;
  }

   /**
   * Get showArchived
   * @return showArchived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShowArchived() {
    return showArchived;
  }


  public void setShowArchived(Boolean showArchived) {
    this.showArchived = showArchived;
  }


  public TitaniumGetConsensusRunsRequest snapDateFrom(String snapDateFrom) {
    
    this.snapDateFrom = snapDateFrom;
    return this;
  }

   /**
   * Get snapDateFrom
   * @return snapDateFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnapDateFrom() {
    return snapDateFrom;
  }


  public void setSnapDateFrom(String snapDateFrom) {
    this.snapDateFrom = snapDateFrom;
  }


  public TitaniumGetConsensusRunsRequest snapDateTo(String snapDateTo) {
    
    this.snapDateTo = snapDateTo;
    return this;
  }

   /**
   * Get snapDateTo
   * @return snapDateTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnapDateTo() {
    return snapDateTo;
  }


  public void setSnapDateTo(String snapDateTo) {
    this.snapDateTo = snapDateTo;
  }


  public TitaniumGetConsensusRunsRequest traceName(String traceName) {
    
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
    TitaniumGetConsensusRunsRequest titaniumGetConsensusRunsRequest = (TitaniumGetConsensusRunsRequest) o;
    return Objects.equals(this.assetId, titaniumGetConsensusRunsRequest.assetId) &&
        Objects.equals(this.filterPack, titaniumGetConsensusRunsRequest.filterPack) &&
        Objects.equals(this.orderBy, titaniumGetConsensusRunsRequest.orderBy) &&
        Objects.equals(this.page, titaniumGetConsensusRunsRequest.page) &&
        Objects.equals(this.participant, titaniumGetConsensusRunsRequest.participant) &&
        Objects.equals(this.showArchived, titaniumGetConsensusRunsRequest.showArchived) &&
        Objects.equals(this.snapDateFrom, titaniumGetConsensusRunsRequest.snapDateFrom) &&
        Objects.equals(this.snapDateTo, titaniumGetConsensusRunsRequest.snapDateTo) &&
        Objects.equals(this.traceName, titaniumGetConsensusRunsRequest.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, filterPack, orderBy, page, participant, showArchived, snapDateFrom, snapDateTo, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumGetConsensusRunsRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    filterPack: ").append(toIndentedString(filterPack)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
    sb.append("    showArchived: ").append(toIndentedString(showArchived)).append("\n");
    sb.append("    snapDateFrom: ").append(toIndentedString(snapDateFrom)).append("\n");
    sb.append("    snapDateTo: ").append(toIndentedString(snapDateTo)).append("\n");
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
    openapiFields.add("filterPack");
    openapiFields.add("orderBy");
    openapiFields.add("page");
    openapiFields.add("participant");
    openapiFields.add("showArchived");
    openapiFields.add("snapDateFrom");
    openapiFields.add("snapDateTo");
    openapiFields.add("traceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumGetConsensusRunsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumGetConsensusRunsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumGetConsensusRunsRequest is not found in the empty JSON string", TitaniumGetConsensusRunsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumGetConsensusRunsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumGetConsensusRunsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      // validate the optional field `filterPack`
      if (jsonObj.getAsJsonObject("filterPack") != null) {
        TitaniumFilterPack.validateJsonObject(jsonObj.getAsJsonObject("filterPack"));
      }
      // validate the optional field `orderBy`
      if (jsonObj.getAsJsonObject("orderBy") != null) {
        TitaniumOrderBy.validateJsonObject(jsonObj.getAsJsonObject("orderBy"));
      }
      // validate the optional field `page`
      if (jsonObj.getAsJsonObject("page") != null) {
        TitaniumPage.validateJsonObject(jsonObj.getAsJsonObject("page"));
      }
      if (jsonObj.get("participant") != null && !jsonObj.get("participant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `participant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("participant").toString()));
      }
      if (jsonObj.get("snapDateFrom") != null && !jsonObj.get("snapDateFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapDateFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapDateFrom").toString()));
      }
      if (jsonObj.get("snapDateTo") != null && !jsonObj.get("snapDateTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapDateTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapDateTo").toString()));
      }
      if (jsonObj.get("traceName") != null && !jsonObj.get("traceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumGetConsensusRunsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumGetConsensusRunsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumGetConsensusRunsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumGetConsensusRunsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumGetConsensusRunsRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumGetConsensusRunsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumGetConsensusRunsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumGetConsensusRunsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumGetConsensusRunsRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumGetConsensusRunsRequest
  */
  public static TitaniumGetConsensusRunsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumGetConsensusRunsRequest.class);
  }

 /**
  * Convert an instance of TitaniumGetConsensusRunsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

