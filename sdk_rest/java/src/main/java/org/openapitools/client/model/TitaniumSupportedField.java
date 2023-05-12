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
 * TitaniumSupportedField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-12T16:18:26.451720Z[UTC]")
public class TitaniumSupportedField {
  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private String asset;

  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrumentType";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private String instrumentType;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private TitaniumLimit limit;

  public static final String SERIALIZED_NAME_MATCH_PATTERN = "matchPattern";
  @SerializedName(SERIALIZED_NAME_MATCH_PATTERN)
  private String matchPattern;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_SUBMITTED_DATE = "submittedDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DATE)
  private String submittedDate;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumSupportedField() { 
  }

  public TitaniumSupportedField asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAsset() {
    return asset;
  }


  public void setAsset(String asset) {
    this.asset = asset;
  }


  public TitaniumSupportedField assetId(String assetId) {
    
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


  public TitaniumSupportedField field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public TitaniumSupportedField filter(String filter) {
    
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


  public TitaniumSupportedField instrumentType(String instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * Get instrumentType
   * @return instrumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }


  public TitaniumSupportedField limit(TitaniumLimit limit) {
    
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


  public TitaniumSupportedField matchPattern(String matchPattern) {
    
    this.matchPattern = matchPattern;
    return this;
  }

   /**
   * Get matchPattern
   * @return matchPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchPattern() {
    return matchPattern;
  }


  public void setMatchPattern(String matchPattern) {
    this.matchPattern = matchPattern;
  }


  public TitaniumSupportedField offset(Integer offset) {
    
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


  public TitaniumSupportedField service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }


  public TitaniumSupportedField submittedDate(String submittedDate) {
    
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


  public TitaniumSupportedField traceName(String traceName) {
    
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
    TitaniumSupportedField titaniumSupportedField = (TitaniumSupportedField) o;
    return Objects.equals(this.asset, titaniumSupportedField.asset) &&
        Objects.equals(this.assetId, titaniumSupportedField.assetId) &&
        Objects.equals(this.field, titaniumSupportedField.field) &&
        Objects.equals(this.filter, titaniumSupportedField.filter) &&
        Objects.equals(this.instrumentType, titaniumSupportedField.instrumentType) &&
        Objects.equals(this.limit, titaniumSupportedField.limit) &&
        Objects.equals(this.matchPattern, titaniumSupportedField.matchPattern) &&
        Objects.equals(this.offset, titaniumSupportedField.offset) &&
        Objects.equals(this.service, titaniumSupportedField.service) &&
        Objects.equals(this.submittedDate, titaniumSupportedField.submittedDate) &&
        Objects.equals(this.traceName, titaniumSupportedField.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, assetId, field, filter, instrumentType, limit, matchPattern, offset, service, submittedDate, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumSupportedField {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    matchPattern: ").append(toIndentedString(matchPattern)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
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
    openapiFields.add("asset");
    openapiFields.add("assetId");
    openapiFields.add("field");
    openapiFields.add("filter");
    openapiFields.add("instrumentType");
    openapiFields.add("limit");
    openapiFields.add("matchPattern");
    openapiFields.add("offset");
    openapiFields.add("service");
    openapiFields.add("submittedDate");
    openapiFields.add("traceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumSupportedField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumSupportedField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumSupportedField is not found in the empty JSON string", TitaniumSupportedField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumSupportedField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumSupportedField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("asset") != null && !jsonObj.get("asset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset").toString()));
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("field") != null && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      if (jsonObj.get("instrumentType") != null && !jsonObj.get("instrumentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrumentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrumentType").toString()));
      }
      // validate the optional field `limit`
      if (jsonObj.getAsJsonObject("limit") != null) {
        TitaniumLimit.validateJsonObject(jsonObj.getAsJsonObject("limit"));
      }
      if (jsonObj.get("matchPattern") != null && !jsonObj.get("matchPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchPattern").toString()));
      }
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
      if (jsonObj.get("submittedDate") != null && !jsonObj.get("submittedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submittedDate").toString()));
      }
      if (jsonObj.get("traceName") != null && !jsonObj.get("traceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumSupportedField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumSupportedField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumSupportedField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumSupportedField.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumSupportedField>() {
           @Override
           public void write(JsonWriter out, TitaniumSupportedField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumSupportedField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumSupportedField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumSupportedField
  * @throws IOException if the JSON string is invalid with respect to TitaniumSupportedField
  */
  public static TitaniumSupportedField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumSupportedField.class);
  }

 /**
  * Convert an instance of TitaniumSupportedField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
