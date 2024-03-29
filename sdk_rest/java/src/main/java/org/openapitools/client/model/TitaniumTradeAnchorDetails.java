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
import java.math.BigDecimal;

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
 * TitaniumTradeAnchorDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumTradeAnchorDetails {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DISTANCE_TO_CONSENSUS = "distanceToConsensus";
  @SerializedName(SERIALIZED_NAME_DISTANCE_TO_CONSENSUS)
  private BigDecimal distanceToConsensus;

  public static final String SERIALIZED_NAME_LATEST_TRADE_PRICE = "latestTradePrice";
  @SerializedName(SERIALIZED_NAME_LATEST_TRADE_PRICE)
  private BigDecimal latestTradePrice;

  public static final String SERIALIZED_NAME_NOTIONAL = "notional";
  @SerializedName(SERIALIZED_NAME_NOTIONAL)
  private BigDecimal notional;

  public static final String SERIALIZED_NAME_PRICING_AGE = "pricingAge";
  @SerializedName(SERIALIZED_NAME_PRICING_AGE)
  private String pricingAge;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TRADE_EXECUTION_TIME = "tradeExecutionTime";
  @SerializedName(SERIALIZED_NAME_TRADE_EXECUTION_TIME)
  private String tradeExecutionTime;

  public TitaniumTradeAnchorDetails() { 
  }

  public TitaniumTradeAnchorDetails currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TitaniumTradeAnchorDetails distanceToConsensus(BigDecimal distanceToConsensus) {
    
    this.distanceToConsensus = distanceToConsensus;
    return this;
  }

   /**
   * Get distanceToConsensus
   * @return distanceToConsensus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDistanceToConsensus() {
    return distanceToConsensus;
  }


  public void setDistanceToConsensus(BigDecimal distanceToConsensus) {
    this.distanceToConsensus = distanceToConsensus;
  }


  public TitaniumTradeAnchorDetails latestTradePrice(BigDecimal latestTradePrice) {
    
    this.latestTradePrice = latestTradePrice;
    return this;
  }

   /**
   * Get latestTradePrice
   * @return latestTradePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getLatestTradePrice() {
    return latestTradePrice;
  }


  public void setLatestTradePrice(BigDecimal latestTradePrice) {
    this.latestTradePrice = latestTradePrice;
  }


  public TitaniumTradeAnchorDetails notional(BigDecimal notional) {
    
    this.notional = notional;
    return this;
  }

   /**
   * Get notional
   * @return notional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNotional() {
    return notional;
  }


  public void setNotional(BigDecimal notional) {
    this.notional = notional;
  }


  public TitaniumTradeAnchorDetails pricingAge(String pricingAge) {
    
    this.pricingAge = pricingAge;
    return this;
  }

   /**
   * Get pricingAge
   * @return pricingAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPricingAge() {
    return pricingAge;
  }


  public void setPricingAge(String pricingAge) {
    this.pricingAge = pricingAge;
  }


  public TitaniumTradeAnchorDetails source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public TitaniumTradeAnchorDetails tradeExecutionTime(String tradeExecutionTime) {
    
    this.tradeExecutionTime = tradeExecutionTime;
    return this;
  }

   /**
   * Get tradeExecutionTime
   * @return tradeExecutionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeExecutionTime() {
    return tradeExecutionTime;
  }


  public void setTradeExecutionTime(String tradeExecutionTime) {
    this.tradeExecutionTime = tradeExecutionTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumTradeAnchorDetails titaniumTradeAnchorDetails = (TitaniumTradeAnchorDetails) o;
    return Objects.equals(this.currency, titaniumTradeAnchorDetails.currency) &&
        Objects.equals(this.distanceToConsensus, titaniumTradeAnchorDetails.distanceToConsensus) &&
        Objects.equals(this.latestTradePrice, titaniumTradeAnchorDetails.latestTradePrice) &&
        Objects.equals(this.notional, titaniumTradeAnchorDetails.notional) &&
        Objects.equals(this.pricingAge, titaniumTradeAnchorDetails.pricingAge) &&
        Objects.equals(this.source, titaniumTradeAnchorDetails.source) &&
        Objects.equals(this.tradeExecutionTime, titaniumTradeAnchorDetails.tradeExecutionTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, distanceToConsensus, latestTradePrice, notional, pricingAge, source, tradeExecutionTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumTradeAnchorDetails {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    distanceToConsensus: ").append(toIndentedString(distanceToConsensus)).append("\n");
    sb.append("    latestTradePrice: ").append(toIndentedString(latestTradePrice)).append("\n");
    sb.append("    notional: ").append(toIndentedString(notional)).append("\n");
    sb.append("    pricingAge: ").append(toIndentedString(pricingAge)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tradeExecutionTime: ").append(toIndentedString(tradeExecutionTime)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("distanceToConsensus");
    openapiFields.add("latestTradePrice");
    openapiFields.add("notional");
    openapiFields.add("pricingAge");
    openapiFields.add("source");
    openapiFields.add("tradeExecutionTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumTradeAnchorDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumTradeAnchorDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumTradeAnchorDetails is not found in the empty JSON string", TitaniumTradeAnchorDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumTradeAnchorDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumTradeAnchorDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (jsonObj.get("pricingAge") != null && !jsonObj.get("pricingAge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pricingAge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pricingAge").toString()));
      }
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (jsonObj.get("tradeExecutionTime") != null && !jsonObj.get("tradeExecutionTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tradeExecutionTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tradeExecutionTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumTradeAnchorDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumTradeAnchorDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumTradeAnchorDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumTradeAnchorDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumTradeAnchorDetails>() {
           @Override
           public void write(JsonWriter out, TitaniumTradeAnchorDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumTradeAnchorDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumTradeAnchorDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumTradeAnchorDetails
  * @throws IOException if the JSON string is invalid with respect to TitaniumTradeAnchorDetails
  */
  public static TitaniumTradeAnchorDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumTradeAnchorDetails.class);
  }

 /**
  * Convert an instance of TitaniumTradeAnchorDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

