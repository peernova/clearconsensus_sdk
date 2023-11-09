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
import org.openapitools.client.model.TitaniumGenericChartMetadata;

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
 * TitaniumGenericChartMetadataDataQuality
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:41:41.039267Z[UTC]")
public class TitaniumGenericChartMetadataDataQuality {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_CHART_METADATA = "chartMetadata";
  @SerializedName(SERIALIZED_NAME_CHART_METADATA)
  private TitaniumGenericChartMetadata chartMetadata;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  public static final String SERIALIZED_NAME_DATE_RANGE_FILTER = "dateRangeFilter";
  @SerializedName(SERIALIZED_NAME_DATE_RANGE_FILTER)
  private String dateRangeFilter;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumGenericChartMetadataDataQuality() { 
  }

  public TitaniumGenericChartMetadataDataQuality assetId(String assetId) {
    
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


  public TitaniumGenericChartMetadataDataQuality chartMetadata(TitaniumGenericChartMetadata chartMetadata) {
    
    this.chartMetadata = chartMetadata;
    return this;
  }

   /**
   * Get chartMetadata
   * @return chartMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumGenericChartMetadata getChartMetadata() {
    return chartMetadata;
  }


  public void setChartMetadata(TitaniumGenericChartMetadata chartMetadata) {
    this.chartMetadata = chartMetadata;
  }


  public TitaniumGenericChartMetadataDataQuality client(String client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClient() {
    return client;
  }


  public void setClient(String client) {
    this.client = client;
  }


  public TitaniumGenericChartMetadataDataQuality dateRangeFilter(String dateRangeFilter) {
    
    this.dateRangeFilter = dateRangeFilter;
    return this;
  }

   /**
   * Get dateRangeFilter
   * @return dateRangeFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateRangeFilter() {
    return dateRangeFilter;
  }


  public void setDateRangeFilter(String dateRangeFilter) {
    this.dateRangeFilter = dateRangeFilter;
  }


  public TitaniumGenericChartMetadataDataQuality id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TitaniumGenericChartMetadataDataQuality traceName(String traceName) {
    
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
    TitaniumGenericChartMetadataDataQuality titaniumGenericChartMetadataDataQuality = (TitaniumGenericChartMetadataDataQuality) o;
    return Objects.equals(this.assetId, titaniumGenericChartMetadataDataQuality.assetId) &&
        Objects.equals(this.chartMetadata, titaniumGenericChartMetadataDataQuality.chartMetadata) &&
        Objects.equals(this.client, titaniumGenericChartMetadataDataQuality.client) &&
        Objects.equals(this.dateRangeFilter, titaniumGenericChartMetadataDataQuality.dateRangeFilter) &&
        Objects.equals(this.id, titaniumGenericChartMetadataDataQuality.id) &&
        Objects.equals(this.traceName, titaniumGenericChartMetadataDataQuality.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, chartMetadata, client, dateRangeFilter, id, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumGenericChartMetadataDataQuality {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    chartMetadata: ").append(toIndentedString(chartMetadata)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    dateRangeFilter: ").append(toIndentedString(dateRangeFilter)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("chartMetadata");
    openapiFields.add("client");
    openapiFields.add("dateRangeFilter");
    openapiFields.add("id");
    openapiFields.add("traceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumGenericChartMetadataDataQuality
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumGenericChartMetadataDataQuality.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumGenericChartMetadataDataQuality is not found in the empty JSON string", TitaniumGenericChartMetadataDataQuality.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumGenericChartMetadataDataQuality.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumGenericChartMetadataDataQuality` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      // validate the optional field `chartMetadata`
      if (jsonObj.getAsJsonObject("chartMetadata") != null) {
        TitaniumGenericChartMetadata.validateJsonObject(jsonObj.getAsJsonObject("chartMetadata"));
      }
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client").toString()));
      }
      if (jsonObj.get("dateRangeFilter") != null && !jsonObj.get("dateRangeFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateRangeFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateRangeFilter").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("traceName") != null && !jsonObj.get("traceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumGenericChartMetadataDataQuality.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumGenericChartMetadataDataQuality' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumGenericChartMetadataDataQuality> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumGenericChartMetadataDataQuality.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumGenericChartMetadataDataQuality>() {
           @Override
           public void write(JsonWriter out, TitaniumGenericChartMetadataDataQuality value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumGenericChartMetadataDataQuality read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumGenericChartMetadataDataQuality given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumGenericChartMetadataDataQuality
  * @throws IOException if the JSON string is invalid with respect to TitaniumGenericChartMetadataDataQuality
  */
  public static TitaniumGenericChartMetadataDataQuality fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumGenericChartMetadataDataQuality.class);
  }

 /**
  * Convert an instance of TitaniumGenericChartMetadataDataQuality to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

