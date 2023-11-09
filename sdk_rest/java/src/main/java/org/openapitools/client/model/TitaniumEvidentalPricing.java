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
 * TitaniumEvidentalPricing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T10:48:07.724819Z[UTC]")
public class TitaniumEvidentalPricing {
  public static final String SERIALIZED_NAME_ABS_DIFF_FROM_EVP_MID = "absDiffFromEvpMid";
  @SerializedName(SERIALIZED_NAME_ABS_DIFF_FROM_EVP_MID)
  private Object absDiffFromEvpMid;

  public static final String SERIALIZED_NAME_ASK = "ask";
  @SerializedName(SERIALIZED_NAME_ASK)
  private Object ask;

  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Object bid;

  public static final String SERIALIZED_NAME_EVP_MID_ABS_DIFF_FROM_LATEST_TRADE = "evpMidAbsDiffFromLatestTrade";
  @SerializedName(SERIALIZED_NAME_EVP_MID_ABS_DIFF_FROM_LATEST_TRADE)
  private Object evpMidAbsDiffFromLatestTrade;

  public static final String SERIALIZED_NAME_MID = "mid";
  @SerializedName(SERIALIZED_NAME_MID)
  private Object mid;

  public static final String SERIALIZED_NAME_SUB_PRICE_DIFF = "subPriceDiff";
  @SerializedName(SERIALIZED_NAME_SUB_PRICE_DIFF)
  private Object subPriceDiff;

  public static final String SERIALIZED_NAME_TRADES_OR_ORDERS_COUNT = "tradesOrOrdersCount";
  @SerializedName(SERIALIZED_NAME_TRADES_OR_ORDERS_COUNT)
  private Object tradesOrOrdersCount;

  public TitaniumEvidentalPricing() { 
  }

  public TitaniumEvidentalPricing absDiffFromEvpMid(Object absDiffFromEvpMid) {
    
    this.absDiffFromEvpMid = absDiffFromEvpMid;
    return this;
  }

   /**
   * Get absDiffFromEvpMid
   * @return absDiffFromEvpMid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAbsDiffFromEvpMid() {
    return absDiffFromEvpMid;
  }


  public void setAbsDiffFromEvpMid(Object absDiffFromEvpMid) {
    this.absDiffFromEvpMid = absDiffFromEvpMid;
  }


  public TitaniumEvidentalPricing ask(Object ask) {
    
    this.ask = ask;
    return this;
  }

   /**
   * Get ask
   * @return ask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAsk() {
    return ask;
  }


  public void setAsk(Object ask) {
    this.ask = ask;
  }


  public TitaniumEvidentalPricing bid(Object bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * Get bid
   * @return bid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBid() {
    return bid;
  }


  public void setBid(Object bid) {
    this.bid = bid;
  }


  public TitaniumEvidentalPricing evpMidAbsDiffFromLatestTrade(Object evpMidAbsDiffFromLatestTrade) {
    
    this.evpMidAbsDiffFromLatestTrade = evpMidAbsDiffFromLatestTrade;
    return this;
  }

   /**
   * Get evpMidAbsDiffFromLatestTrade
   * @return evpMidAbsDiffFromLatestTrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEvpMidAbsDiffFromLatestTrade() {
    return evpMidAbsDiffFromLatestTrade;
  }


  public void setEvpMidAbsDiffFromLatestTrade(Object evpMidAbsDiffFromLatestTrade) {
    this.evpMidAbsDiffFromLatestTrade = evpMidAbsDiffFromLatestTrade;
  }


  public TitaniumEvidentalPricing mid(Object mid) {
    
    this.mid = mid;
    return this;
  }

   /**
   * Get mid
   * @return mid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMid() {
    return mid;
  }


  public void setMid(Object mid) {
    this.mid = mid;
  }


  public TitaniumEvidentalPricing subPriceDiff(Object subPriceDiff) {
    
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


  public TitaniumEvidentalPricing tradesOrOrdersCount(Object tradesOrOrdersCount) {
    
    this.tradesOrOrdersCount = tradesOrOrdersCount;
    return this;
  }

   /**
   * Get tradesOrOrdersCount
   * @return tradesOrOrdersCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTradesOrOrdersCount() {
    return tradesOrOrdersCount;
  }


  public void setTradesOrOrdersCount(Object tradesOrOrdersCount) {
    this.tradesOrOrdersCount = tradesOrOrdersCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumEvidentalPricing titaniumEvidentalPricing = (TitaniumEvidentalPricing) o;
    return Objects.equals(this.absDiffFromEvpMid, titaniumEvidentalPricing.absDiffFromEvpMid) &&
        Objects.equals(this.ask, titaniumEvidentalPricing.ask) &&
        Objects.equals(this.bid, titaniumEvidentalPricing.bid) &&
        Objects.equals(this.evpMidAbsDiffFromLatestTrade, titaniumEvidentalPricing.evpMidAbsDiffFromLatestTrade) &&
        Objects.equals(this.mid, titaniumEvidentalPricing.mid) &&
        Objects.equals(this.subPriceDiff, titaniumEvidentalPricing.subPriceDiff) &&
        Objects.equals(this.tradesOrOrdersCount, titaniumEvidentalPricing.tradesOrOrdersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absDiffFromEvpMid, ask, bid, evpMidAbsDiffFromLatestTrade, mid, subPriceDiff, tradesOrOrdersCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumEvidentalPricing {\n");
    sb.append("    absDiffFromEvpMid: ").append(toIndentedString(absDiffFromEvpMid)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    evpMidAbsDiffFromLatestTrade: ").append(toIndentedString(evpMidAbsDiffFromLatestTrade)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    subPriceDiff: ").append(toIndentedString(subPriceDiff)).append("\n");
    sb.append("    tradesOrOrdersCount: ").append(toIndentedString(tradesOrOrdersCount)).append("\n");
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
    openapiFields.add("absDiffFromEvpMid");
    openapiFields.add("ask");
    openapiFields.add("bid");
    openapiFields.add("evpMidAbsDiffFromLatestTrade");
    openapiFields.add("mid");
    openapiFields.add("subPriceDiff");
    openapiFields.add("tradesOrOrdersCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumEvidentalPricing
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumEvidentalPricing.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumEvidentalPricing is not found in the empty JSON string", TitaniumEvidentalPricing.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumEvidentalPricing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumEvidentalPricing` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumEvidentalPricing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumEvidentalPricing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumEvidentalPricing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumEvidentalPricing.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumEvidentalPricing>() {
           @Override
           public void write(JsonWriter out, TitaniumEvidentalPricing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumEvidentalPricing read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumEvidentalPricing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumEvidentalPricing
  * @throws IOException if the JSON string is invalid with respect to TitaniumEvidentalPricing
  */
  public static TitaniumEvidentalPricing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumEvidentalPricing.class);
  }

 /**
  * Convert an instance of TitaniumEvidentalPricing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

