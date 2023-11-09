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
 * TitaniumConsensusDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T10:18:15.973724Z[UTC]")
public class TitaniumConsensusDetail {
  public static final String SERIALIZED_NAME_CALCULATION_DETAIL = "calculationDetail";
  @SerializedName(SERIALIZED_NAME_CALCULATION_DETAIL)
  private String calculationDetail;

  public static final String SERIALIZED_NAME_CALCULATION_STATUS = "calculationStatus";
  @SerializedName(SERIALIZED_NAME_CALCULATION_STATUS)
  private String calculationStatus;

  public static final String SERIALIZED_NAME_HIGHEST_SEV = "highestSev";
  @SerializedName(SERIALIZED_NAME_HIGHEST_SEV)
  private String highestSev;

  public static final String SERIALIZED_NAME_PARSE_STATUS = "parseStatus";
  @SerializedName(SERIALIZED_NAME_PARSE_STATUS)
  private String parseStatus;

  public TitaniumConsensusDetail() { 
  }

  public TitaniumConsensusDetail calculationDetail(String calculationDetail) {
    
    this.calculationDetail = calculationDetail;
    return this;
  }

   /**
   * Get calculationDetail
   * @return calculationDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCalculationDetail() {
    return calculationDetail;
  }


  public void setCalculationDetail(String calculationDetail) {
    this.calculationDetail = calculationDetail;
  }


  public TitaniumConsensusDetail calculationStatus(String calculationStatus) {
    
    this.calculationStatus = calculationStatus;
    return this;
  }

   /**
   * Get calculationStatus
   * @return calculationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCalculationStatus() {
    return calculationStatus;
  }


  public void setCalculationStatus(String calculationStatus) {
    this.calculationStatus = calculationStatus;
  }


  public TitaniumConsensusDetail highestSev(String highestSev) {
    
    this.highestSev = highestSev;
    return this;
  }

   /**
   * Get highestSev
   * @return highestSev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHighestSev() {
    return highestSev;
  }


  public void setHighestSev(String highestSev) {
    this.highestSev = highestSev;
  }


  public TitaniumConsensusDetail parseStatus(String parseStatus) {
    
    this.parseStatus = parseStatus;
    return this;
  }

   /**
   * Get parseStatus
   * @return parseStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParseStatus() {
    return parseStatus;
  }


  public void setParseStatus(String parseStatus) {
    this.parseStatus = parseStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusDetail titaniumConsensusDetail = (TitaniumConsensusDetail) o;
    return Objects.equals(this.calculationDetail, titaniumConsensusDetail.calculationDetail) &&
        Objects.equals(this.calculationStatus, titaniumConsensusDetail.calculationStatus) &&
        Objects.equals(this.highestSev, titaniumConsensusDetail.highestSev) &&
        Objects.equals(this.parseStatus, titaniumConsensusDetail.parseStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationDetail, calculationStatus, highestSev, parseStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusDetail {\n");
    sb.append("    calculationDetail: ").append(toIndentedString(calculationDetail)).append("\n");
    sb.append("    calculationStatus: ").append(toIndentedString(calculationStatus)).append("\n");
    sb.append("    highestSev: ").append(toIndentedString(highestSev)).append("\n");
    sb.append("    parseStatus: ").append(toIndentedString(parseStatus)).append("\n");
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
    openapiFields.add("calculationDetail");
    openapiFields.add("calculationStatus");
    openapiFields.add("highestSev");
    openapiFields.add("parseStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusDetail is not found in the empty JSON string", TitaniumConsensusDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("calculationDetail") != null && !jsonObj.get("calculationDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calculationDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calculationDetail").toString()));
      }
      if (jsonObj.get("calculationStatus") != null && !jsonObj.get("calculationStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `calculationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("calculationStatus").toString()));
      }
      if (jsonObj.get("highestSev") != null && !jsonObj.get("highestSev").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `highestSev` to be a primitive type in the JSON string but got `%s`", jsonObj.get("highestSev").toString()));
      }
      if (jsonObj.get("parseStatus") != null && !jsonObj.get("parseStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parseStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parseStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusDetail>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusDetail
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusDetail
  */
  public static TitaniumConsensusDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusDetail.class);
  }

 /**
  * Convert an instance of TitaniumConsensusDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

