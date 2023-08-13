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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TitaniumDateAndValue;

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
 * TitaniumEvpQualityScore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-13T18:34:39.175680Z[UTC]")
public class TitaniumEvpQualityScore {
  public static final String SERIALIZED_NAME_HISTORY = "history";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private List<TitaniumDateAndValue> history = null;

  public static final String SERIALIZED_NAME_INDICATIVE_COUNT = "indicativeCount";
  @SerializedName(SERIALIZED_NAME_INDICATIVE_COUNT)
  private String indicativeCount;

  public static final String SERIALIZED_NAME_ORDER_COUNT = "orderCount";
  @SerializedName(SERIALIZED_NAME_ORDER_COUNT)
  private String orderCount;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Object score;

  public static final String SERIALIZED_NAME_TRADE_COUNT = "tradeCount";
  @SerializedName(SERIALIZED_NAME_TRADE_COUNT)
  private String tradeCount;

  public TitaniumEvpQualityScore() { 
  }

  public TitaniumEvpQualityScore history(List<TitaniumDateAndValue> history) {
    
    this.history = history;
    return this;
  }

  public TitaniumEvpQualityScore addHistoryItem(TitaniumDateAndValue historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumDateAndValue> getHistory() {
    return history;
  }


  public void setHistory(List<TitaniumDateAndValue> history) {
    this.history = history;
  }


  public TitaniumEvpQualityScore indicativeCount(String indicativeCount) {
    
    this.indicativeCount = indicativeCount;
    return this;
  }

   /**
   * Get indicativeCount
   * @return indicativeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIndicativeCount() {
    return indicativeCount;
  }


  public void setIndicativeCount(String indicativeCount) {
    this.indicativeCount = indicativeCount;
  }


  public TitaniumEvpQualityScore orderCount(String orderCount) {
    
    this.orderCount = orderCount;
    return this;
  }

   /**
   * Get orderCount
   * @return orderCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderCount() {
    return orderCount;
  }


  public void setOrderCount(String orderCount) {
    this.orderCount = orderCount;
  }


  public TitaniumEvpQualityScore score(Object score) {
    
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getScore() {
    return score;
  }


  public void setScore(Object score) {
    this.score = score;
  }


  public TitaniumEvpQualityScore tradeCount(String tradeCount) {
    
    this.tradeCount = tradeCount;
    return this;
  }

   /**
   * Get tradeCount
   * @return tradeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeCount() {
    return tradeCount;
  }


  public void setTradeCount(String tradeCount) {
    this.tradeCount = tradeCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumEvpQualityScore titaniumEvpQualityScore = (TitaniumEvpQualityScore) o;
    return Objects.equals(this.history, titaniumEvpQualityScore.history) &&
        Objects.equals(this.indicativeCount, titaniumEvpQualityScore.indicativeCount) &&
        Objects.equals(this.orderCount, titaniumEvpQualityScore.orderCount) &&
        Objects.equals(this.score, titaniumEvpQualityScore.score) &&
        Objects.equals(this.tradeCount, titaniumEvpQualityScore.tradeCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, indicativeCount, orderCount, score, tradeCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumEvpQualityScore {\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    indicativeCount: ").append(toIndentedString(indicativeCount)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    tradeCount: ").append(toIndentedString(tradeCount)).append("\n");
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
    openapiFields.add("history");
    openapiFields.add("indicativeCount");
    openapiFields.add("orderCount");
    openapiFields.add("score");
    openapiFields.add("tradeCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumEvpQualityScore
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumEvpQualityScore.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumEvpQualityScore is not found in the empty JSON string", TitaniumEvpQualityScore.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumEvpQualityScore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumEvpQualityScore` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayhistory = jsonObj.getAsJsonArray("history");
      if (jsonArrayhistory != null) {
        // ensure the json data is an array
        if (!jsonObj.get("history").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `history` to be an array in the JSON string but got `%s`", jsonObj.get("history").toString()));
        }

        // validate the optional field `history` (array)
        for (int i = 0; i < jsonArrayhistory.size(); i++) {
          TitaniumDateAndValue.validateJsonObject(jsonArrayhistory.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("indicativeCount") != null && !jsonObj.get("indicativeCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indicativeCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indicativeCount").toString()));
      }
      if (jsonObj.get("orderCount") != null && !jsonObj.get("orderCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderCount").toString()));
      }
      if (jsonObj.get("tradeCount") != null && !jsonObj.get("tradeCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tradeCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tradeCount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumEvpQualityScore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumEvpQualityScore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumEvpQualityScore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumEvpQualityScore.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumEvpQualityScore>() {
           @Override
           public void write(JsonWriter out, TitaniumEvpQualityScore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumEvpQualityScore read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumEvpQualityScore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumEvpQualityScore
  * @throws IOException if the JSON string is invalid with respect to TitaniumEvpQualityScore
  */
  public static TitaniumEvpQualityScore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumEvpQualityScore.class);
  }

 /**
  * Convert an instance of TitaniumEvpQualityScore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

