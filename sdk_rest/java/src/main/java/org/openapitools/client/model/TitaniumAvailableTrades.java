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
 * TitaniumAvailableTrades
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumAvailableTrades {
  public static final String SERIALIZED_NAME_ABS_DIFF_FROM_LATEST_TRADE = "absDiffFromLatestTrade";
  @SerializedName(SERIALIZED_NAME_ABS_DIFF_FROM_LATEST_TRADE)
  private Object absDiffFromLatestTrade;

  public static final String SERIALIZED_NAME_DAY_TRADE_NUMBER = "dayTradeNumber";
  @SerializedName(SERIALIZED_NAME_DAY_TRADE_NUMBER)
  private String dayTradeNumber;

  public static final String SERIALIZED_NAME_LATEST_TRADE_PRICE = "latestTradePrice";
  @SerializedName(SERIALIZED_NAME_LATEST_TRADE_PRICE)
  private Object latestTradePrice;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Object max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Object min;

  public static final String SERIALIZED_NAME_MONTH_TRADE_NUMBER = "monthTradeNumber";
  @SerializedName(SERIALIZED_NAME_MONTH_TRADE_NUMBER)
  private String monthTradeNumber;

  public static final String SERIALIZED_NAME_SUB_PRICE_ABS_DIFF_FROM_LATEST_TRADE = "subPriceAbsDiffFromLatestTrade";
  @SerializedName(SERIALIZED_NAME_SUB_PRICE_ABS_DIFF_FROM_LATEST_TRADE)
  private Object subPriceAbsDiffFromLatestTrade;

  public static final String SERIALIZED_NAME_SUB_PRICE_DIFF = "subPriceDiff";
  @SerializedName(SERIALIZED_NAME_SUB_PRICE_DIFF)
  private Object subPriceDiff;

  public static final String SERIALIZED_NAME_WEEK_TRADE_NUMBER = "weekTradeNumber";
  @SerializedName(SERIALIZED_NAME_WEEK_TRADE_NUMBER)
  private String weekTradeNumber;

  public TitaniumAvailableTrades() { 
  }

  public TitaniumAvailableTrades absDiffFromLatestTrade(Object absDiffFromLatestTrade) {
    
    this.absDiffFromLatestTrade = absDiffFromLatestTrade;
    return this;
  }

   /**
   * Get absDiffFromLatestTrade
   * @return absDiffFromLatestTrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAbsDiffFromLatestTrade() {
    return absDiffFromLatestTrade;
  }


  public void setAbsDiffFromLatestTrade(Object absDiffFromLatestTrade) {
    this.absDiffFromLatestTrade = absDiffFromLatestTrade;
  }


  public TitaniumAvailableTrades dayTradeNumber(String dayTradeNumber) {
    
    this.dayTradeNumber = dayTradeNumber;
    return this;
  }

   /**
   * Get dayTradeNumber
   * @return dayTradeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDayTradeNumber() {
    return dayTradeNumber;
  }


  public void setDayTradeNumber(String dayTradeNumber) {
    this.dayTradeNumber = dayTradeNumber;
  }


  public TitaniumAvailableTrades latestTradePrice(Object latestTradePrice) {
    
    this.latestTradePrice = latestTradePrice;
    return this;
  }

   /**
   * Get latestTradePrice
   * @return latestTradePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLatestTradePrice() {
    return latestTradePrice;
  }


  public void setLatestTradePrice(Object latestTradePrice) {
    this.latestTradePrice = latestTradePrice;
  }


  public TitaniumAvailableTrades max(Object max) {
    
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMax() {
    return max;
  }


  public void setMax(Object max) {
    this.max = max;
  }


  public TitaniumAvailableTrades min(Object min) {
    
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMin() {
    return min;
  }


  public void setMin(Object min) {
    this.min = min;
  }


  public TitaniumAvailableTrades monthTradeNumber(String monthTradeNumber) {
    
    this.monthTradeNumber = monthTradeNumber;
    return this;
  }

   /**
   * Get monthTradeNumber
   * @return monthTradeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMonthTradeNumber() {
    return monthTradeNumber;
  }


  public void setMonthTradeNumber(String monthTradeNumber) {
    this.monthTradeNumber = monthTradeNumber;
  }


  public TitaniumAvailableTrades subPriceAbsDiffFromLatestTrade(Object subPriceAbsDiffFromLatestTrade) {
    
    this.subPriceAbsDiffFromLatestTrade = subPriceAbsDiffFromLatestTrade;
    return this;
  }

   /**
   * Get subPriceAbsDiffFromLatestTrade
   * @return subPriceAbsDiffFromLatestTrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSubPriceAbsDiffFromLatestTrade() {
    return subPriceAbsDiffFromLatestTrade;
  }


  public void setSubPriceAbsDiffFromLatestTrade(Object subPriceAbsDiffFromLatestTrade) {
    this.subPriceAbsDiffFromLatestTrade = subPriceAbsDiffFromLatestTrade;
  }


  public TitaniumAvailableTrades subPriceDiff(Object subPriceDiff) {
    
    this.subPriceDiff = subPriceDiff;
    return this;
  }

   /**
   * Get subPriceDiff
   * @return subPriceDiff
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSubPriceDiff() {
    return subPriceDiff;
  }


  public void setSubPriceDiff(Object subPriceDiff) {
    this.subPriceDiff = subPriceDiff;
  }


  public TitaniumAvailableTrades weekTradeNumber(String weekTradeNumber) {
    
    this.weekTradeNumber = weekTradeNumber;
    return this;
  }

   /**
   * Get weekTradeNumber
   * @return weekTradeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWeekTradeNumber() {
    return weekTradeNumber;
  }


  public void setWeekTradeNumber(String weekTradeNumber) {
    this.weekTradeNumber = weekTradeNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumAvailableTrades titaniumAvailableTrades = (TitaniumAvailableTrades) o;
    return Objects.equals(this.absDiffFromLatestTrade, titaniumAvailableTrades.absDiffFromLatestTrade) &&
        Objects.equals(this.dayTradeNumber, titaniumAvailableTrades.dayTradeNumber) &&
        Objects.equals(this.latestTradePrice, titaniumAvailableTrades.latestTradePrice) &&
        Objects.equals(this.max, titaniumAvailableTrades.max) &&
        Objects.equals(this.min, titaniumAvailableTrades.min) &&
        Objects.equals(this.monthTradeNumber, titaniumAvailableTrades.monthTradeNumber) &&
        Objects.equals(this.subPriceAbsDiffFromLatestTrade, titaniumAvailableTrades.subPriceAbsDiffFromLatestTrade) &&
        Objects.equals(this.subPriceDiff, titaniumAvailableTrades.subPriceDiff) &&
        Objects.equals(this.weekTradeNumber, titaniumAvailableTrades.weekTradeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absDiffFromLatestTrade, dayTradeNumber, latestTradePrice, max, min, monthTradeNumber, subPriceAbsDiffFromLatestTrade, subPriceDiff, weekTradeNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumAvailableTrades {\n");
    sb.append("    absDiffFromLatestTrade: ").append(toIndentedString(absDiffFromLatestTrade)).append("\n");
    sb.append("    dayTradeNumber: ").append(toIndentedString(dayTradeNumber)).append("\n");
    sb.append("    latestTradePrice: ").append(toIndentedString(latestTradePrice)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    monthTradeNumber: ").append(toIndentedString(monthTradeNumber)).append("\n");
    sb.append("    subPriceAbsDiffFromLatestTrade: ").append(toIndentedString(subPriceAbsDiffFromLatestTrade)).append("\n");
    sb.append("    subPriceDiff: ").append(toIndentedString(subPriceDiff)).append("\n");
    sb.append("    weekTradeNumber: ").append(toIndentedString(weekTradeNumber)).append("\n");
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
    openapiFields.add("absDiffFromLatestTrade");
    openapiFields.add("dayTradeNumber");
    openapiFields.add("latestTradePrice");
    openapiFields.add("max");
    openapiFields.add("min");
    openapiFields.add("monthTradeNumber");
    openapiFields.add("subPriceAbsDiffFromLatestTrade");
    openapiFields.add("subPriceDiff");
    openapiFields.add("weekTradeNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumAvailableTrades
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumAvailableTrades.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumAvailableTrades is not found in the empty JSON string", TitaniumAvailableTrades.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumAvailableTrades.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumAvailableTrades` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("dayTradeNumber") != null && !jsonObj.get("dayTradeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dayTradeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dayTradeNumber").toString()));
      }
      if (jsonObj.get("monthTradeNumber") != null && !jsonObj.get("monthTradeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `monthTradeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("monthTradeNumber").toString()));
      }
      if (jsonObj.get("weekTradeNumber") != null && !jsonObj.get("weekTradeNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weekTradeNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weekTradeNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumAvailableTrades.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumAvailableTrades' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumAvailableTrades> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumAvailableTrades.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumAvailableTrades>() {
           @Override
           public void write(JsonWriter out, TitaniumAvailableTrades value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumAvailableTrades read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumAvailableTrades given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumAvailableTrades
  * @throws IOException if the JSON string is invalid with respect to TitaniumAvailableTrades
  */
  public static TitaniumAvailableTrades fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumAvailableTrades.class);
  }

 /**
  * Convert an instance of TitaniumAvailableTrades to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

