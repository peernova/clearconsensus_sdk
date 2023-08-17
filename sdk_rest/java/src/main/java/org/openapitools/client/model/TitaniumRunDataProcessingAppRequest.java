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
 * TitaniumRunDataProcessingAppRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T22:57:04.952222Z[UTC]")
public class TitaniumRunDataProcessingAppRequest {
  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private String asset;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_DESCRIPTOR_NAME = "descriptorName";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR_NAME)
  private String descriptorName;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrumentType";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private String instrumentType;

  public static final String SERIALIZED_NAME_MAPPER_RULE = "mapperRule";
  @SerializedName(SERIALIZED_NAME_MAPPER_RULE)
  private String mapperRule;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_SNAP_TIME = "snapTime";
  @SerializedName(SERIALIZED_NAME_SNAP_TIME)
  private String snapTime;

  public static final String SERIALIZED_NAME_VALIDATION_RULE = "validationRule";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RULE)
  private String validationRule;

  public TitaniumRunDataProcessingAppRequest() { 
  }

  public TitaniumRunDataProcessingAppRequest asset(String asset) {
    
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


  public TitaniumRunDataProcessingAppRequest date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public TitaniumRunDataProcessingAppRequest descriptorName(String descriptorName) {
    
    this.descriptorName = descriptorName;
    return this;
  }

   /**
   * Get descriptorName
   * @return descriptorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptorName() {
    return descriptorName;
  }


  public void setDescriptorName(String descriptorName) {
    this.descriptorName = descriptorName;
  }


  public TitaniumRunDataProcessingAppRequest fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public TitaniumRunDataProcessingAppRequest input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInput() {
    return input;
  }


  public void setInput(String input) {
    this.input = input;
  }


  public TitaniumRunDataProcessingAppRequest instrumentType(String instrumentType) {
    
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


  public TitaniumRunDataProcessingAppRequest mapperRule(String mapperRule) {
    
    this.mapperRule = mapperRule;
    return this;
  }

   /**
   * Get mapperRule
   * @return mapperRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMapperRule() {
    return mapperRule;
  }


  public void setMapperRule(String mapperRule) {
    this.mapperRule = mapperRule;
  }


  public TitaniumRunDataProcessingAppRequest service(String service) {
    
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


  public TitaniumRunDataProcessingAppRequest snapTime(String snapTime) {
    
    this.snapTime = snapTime;
    return this;
  }

   /**
   * Get snapTime
   * @return snapTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnapTime() {
    return snapTime;
  }


  public void setSnapTime(String snapTime) {
    this.snapTime = snapTime;
  }


  public TitaniumRunDataProcessingAppRequest validationRule(String validationRule) {
    
    this.validationRule = validationRule;
    return this;
  }

   /**
   * Get validationRule
   * @return validationRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidationRule() {
    return validationRule;
  }


  public void setValidationRule(String validationRule) {
    this.validationRule = validationRule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumRunDataProcessingAppRequest titaniumRunDataProcessingAppRequest = (TitaniumRunDataProcessingAppRequest) o;
    return Objects.equals(this.asset, titaniumRunDataProcessingAppRequest.asset) &&
        Objects.equals(this.date, titaniumRunDataProcessingAppRequest.date) &&
        Objects.equals(this.descriptorName, titaniumRunDataProcessingAppRequest.descriptorName) &&
        Objects.equals(this.fileName, titaniumRunDataProcessingAppRequest.fileName) &&
        Objects.equals(this.input, titaniumRunDataProcessingAppRequest.input) &&
        Objects.equals(this.instrumentType, titaniumRunDataProcessingAppRequest.instrumentType) &&
        Objects.equals(this.mapperRule, titaniumRunDataProcessingAppRequest.mapperRule) &&
        Objects.equals(this.service, titaniumRunDataProcessingAppRequest.service) &&
        Objects.equals(this.snapTime, titaniumRunDataProcessingAppRequest.snapTime) &&
        Objects.equals(this.validationRule, titaniumRunDataProcessingAppRequest.validationRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, date, descriptorName, fileName, input, instrumentType, mapperRule, service, snapTime, validationRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumRunDataProcessingAppRequest {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    descriptorName: ").append(toIndentedString(descriptorName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    mapperRule: ").append(toIndentedString(mapperRule)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    snapTime: ").append(toIndentedString(snapTime)).append("\n");
    sb.append("    validationRule: ").append(toIndentedString(validationRule)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("descriptorName");
    openapiFields.add("fileName");
    openapiFields.add("input");
    openapiFields.add("instrumentType");
    openapiFields.add("mapperRule");
    openapiFields.add("service");
    openapiFields.add("snapTime");
    openapiFields.add("validationRule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumRunDataProcessingAppRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumRunDataProcessingAppRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumRunDataProcessingAppRequest is not found in the empty JSON string", TitaniumRunDataProcessingAppRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumRunDataProcessingAppRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumRunDataProcessingAppRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("asset") != null && !jsonObj.get("asset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset").toString()));
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (jsonObj.get("descriptorName") != null && !jsonObj.get("descriptorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptorName").toString()));
      }
      if (jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (jsonObj.get("input") != null && !jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if (jsonObj.get("instrumentType") != null && !jsonObj.get("instrumentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrumentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrumentType").toString()));
      }
      if (jsonObj.get("mapperRule") != null && !jsonObj.get("mapperRule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mapperRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mapperRule").toString()));
      }
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service").toString()));
      }
      if (jsonObj.get("snapTime") != null && !jsonObj.get("snapTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapTime").toString()));
      }
      if (jsonObj.get("validationRule") != null && !jsonObj.get("validationRule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationRule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationRule").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumRunDataProcessingAppRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumRunDataProcessingAppRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumRunDataProcessingAppRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumRunDataProcessingAppRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumRunDataProcessingAppRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumRunDataProcessingAppRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumRunDataProcessingAppRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumRunDataProcessingAppRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumRunDataProcessingAppRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumRunDataProcessingAppRequest
  */
  public static TitaniumRunDataProcessingAppRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumRunDataProcessingAppRequest.class);
  }

 /**
  * Convert an instance of TitaniumRunDataProcessingAppRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

