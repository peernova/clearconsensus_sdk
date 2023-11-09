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
 * TitaniumGetSubmissionFilesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:09:41.112152Z[UTC]")
public class TitaniumGetSubmissionFilesRequest {
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

  public static final String SERIALIZED_NAME_SNAP_DATE_FROM = "snapDateFrom";
  @SerializedName(SERIALIZED_NAME_SNAP_DATE_FROM)
  private String snapDateFrom;

  public static final String SERIALIZED_NAME_SNAP_DATE_TO = "snapDateTo";
  @SerializedName(SERIALIZED_NAME_SNAP_DATE_TO)
  private String snapDateTo;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumGetSubmissionFilesRequest() { 
  }

  public TitaniumGetSubmissionFilesRequest assetId(String assetId) {
    
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


  public TitaniumGetSubmissionFilesRequest filterPack(TitaniumFilterPack filterPack) {
    
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


  public TitaniumGetSubmissionFilesRequest orderBy(TitaniumOrderBy orderBy) {
    
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


  public TitaniumGetSubmissionFilesRequest page(TitaniumPage page) {
    
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


  public TitaniumGetSubmissionFilesRequest snapDateFrom(String snapDateFrom) {
    
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


  public TitaniumGetSubmissionFilesRequest snapDateTo(String snapDateTo) {
    
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


  public TitaniumGetSubmissionFilesRequest traceName(String traceName) {
    
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
    TitaniumGetSubmissionFilesRequest titaniumGetSubmissionFilesRequest = (TitaniumGetSubmissionFilesRequest) o;
    return Objects.equals(this.assetId, titaniumGetSubmissionFilesRequest.assetId) &&
        Objects.equals(this.filterPack, titaniumGetSubmissionFilesRequest.filterPack) &&
        Objects.equals(this.orderBy, titaniumGetSubmissionFilesRequest.orderBy) &&
        Objects.equals(this.page, titaniumGetSubmissionFilesRequest.page) &&
        Objects.equals(this.snapDateFrom, titaniumGetSubmissionFilesRequest.snapDateFrom) &&
        Objects.equals(this.snapDateTo, titaniumGetSubmissionFilesRequest.snapDateTo) &&
        Objects.equals(this.traceName, titaniumGetSubmissionFilesRequest.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, filterPack, orderBy, page, snapDateFrom, snapDateTo, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumGetSubmissionFilesRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    filterPack: ").append(toIndentedString(filterPack)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
  * @throws IOException if the JSON Object is invalid with respect to TitaniumGetSubmissionFilesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumGetSubmissionFilesRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumGetSubmissionFilesRequest is not found in the empty JSON string", TitaniumGetSubmissionFilesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumGetSubmissionFilesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumGetSubmissionFilesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!TitaniumGetSubmissionFilesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumGetSubmissionFilesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumGetSubmissionFilesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumGetSubmissionFilesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumGetSubmissionFilesRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumGetSubmissionFilesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumGetSubmissionFilesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumGetSubmissionFilesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumGetSubmissionFilesRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumGetSubmissionFilesRequest
  */
  public static TitaniumGetSubmissionFilesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumGetSubmissionFilesRequest.class);
  }

 /**
  * Convert an instance of TitaniumGetSubmissionFilesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

