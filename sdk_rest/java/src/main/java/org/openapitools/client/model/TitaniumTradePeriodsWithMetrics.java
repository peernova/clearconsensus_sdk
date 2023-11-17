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
import org.openapitools.client.model.TitaniumTradePeriodMetrics;

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
 * TitaniumTradePeriodsWithMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T18:58:45.076336Z[UTC]")
public class TitaniumTradePeriodsWithMetrics {
  public static final String SERIALIZED_NAME_LESS_DAY = "lessDay";
  @SerializedName(SERIALIZED_NAME_LESS_DAY)
  private TitaniumTradePeriodMetrics lessDay;

  public static final String SERIALIZED_NAME_LESS_MONTH = "lessMonth";
  @SerializedName(SERIALIZED_NAME_LESS_MONTH)
  private TitaniumTradePeriodMetrics lessMonth;

  public static final String SERIALIZED_NAME_LESS_WEEK = "lessWeek";
  @SerializedName(SERIALIZED_NAME_LESS_WEEK)
  private TitaniumTradePeriodMetrics lessWeek;

  public TitaniumTradePeriodsWithMetrics() { 
  }

  public TitaniumTradePeriodsWithMetrics lessDay(TitaniumTradePeriodMetrics lessDay) {
    
    this.lessDay = lessDay;
    return this;
  }

   /**
   * Get lessDay
   * @return lessDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumTradePeriodMetrics getLessDay() {
    return lessDay;
  }


  public void setLessDay(TitaniumTradePeriodMetrics lessDay) {
    this.lessDay = lessDay;
  }


  public TitaniumTradePeriodsWithMetrics lessMonth(TitaniumTradePeriodMetrics lessMonth) {
    
    this.lessMonth = lessMonth;
    return this;
  }

   /**
   * Get lessMonth
   * @return lessMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumTradePeriodMetrics getLessMonth() {
    return lessMonth;
  }


  public void setLessMonth(TitaniumTradePeriodMetrics lessMonth) {
    this.lessMonth = lessMonth;
  }


  public TitaniumTradePeriodsWithMetrics lessWeek(TitaniumTradePeriodMetrics lessWeek) {
    
    this.lessWeek = lessWeek;
    return this;
  }

   /**
   * Get lessWeek
   * @return lessWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumTradePeriodMetrics getLessWeek() {
    return lessWeek;
  }


  public void setLessWeek(TitaniumTradePeriodMetrics lessWeek) {
    this.lessWeek = lessWeek;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumTradePeriodsWithMetrics titaniumTradePeriodsWithMetrics = (TitaniumTradePeriodsWithMetrics) o;
    return Objects.equals(this.lessDay, titaniumTradePeriodsWithMetrics.lessDay) &&
        Objects.equals(this.lessMonth, titaniumTradePeriodsWithMetrics.lessMonth) &&
        Objects.equals(this.lessWeek, titaniumTradePeriodsWithMetrics.lessWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lessDay, lessMonth, lessWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumTradePeriodsWithMetrics {\n");
    sb.append("    lessDay: ").append(toIndentedString(lessDay)).append("\n");
    sb.append("    lessMonth: ").append(toIndentedString(lessMonth)).append("\n");
    sb.append("    lessWeek: ").append(toIndentedString(lessWeek)).append("\n");
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
    openapiFields.add("lessDay");
    openapiFields.add("lessMonth");
    openapiFields.add("lessWeek");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumTradePeriodsWithMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumTradePeriodsWithMetrics.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumTradePeriodsWithMetrics is not found in the empty JSON string", TitaniumTradePeriodsWithMetrics.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumTradePeriodsWithMetrics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumTradePeriodsWithMetrics` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `lessDay`
      if (jsonObj.getAsJsonObject("lessDay") != null) {
        TitaniumTradePeriodMetrics.validateJsonObject(jsonObj.getAsJsonObject("lessDay"));
      }
      // validate the optional field `lessMonth`
      if (jsonObj.getAsJsonObject("lessMonth") != null) {
        TitaniumTradePeriodMetrics.validateJsonObject(jsonObj.getAsJsonObject("lessMonth"));
      }
      // validate the optional field `lessWeek`
      if (jsonObj.getAsJsonObject("lessWeek") != null) {
        TitaniumTradePeriodMetrics.validateJsonObject(jsonObj.getAsJsonObject("lessWeek"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumTradePeriodsWithMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumTradePeriodsWithMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumTradePeriodsWithMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumTradePeriodsWithMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumTradePeriodsWithMetrics>() {
           @Override
           public void write(JsonWriter out, TitaniumTradePeriodsWithMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumTradePeriodsWithMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumTradePeriodsWithMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumTradePeriodsWithMetrics
  * @throws IOException if the JSON string is invalid with respect to TitaniumTradePeriodsWithMetrics
  */
  public static TitaniumTradePeriodsWithMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumTradePeriodsWithMetrics.class);
  }

 /**
  * Convert an instance of TitaniumTradePeriodsWithMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

