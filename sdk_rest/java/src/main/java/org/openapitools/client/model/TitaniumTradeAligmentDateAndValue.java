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
 * TitaniumTradeAligmentDateAndValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-06T18:33:51.913217Z[UTC]")
public class TitaniumTradeAligmentDateAndValue {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Object score;

  public static final String SERIALIZED_NAME_SCORE_STATUS = "scoreStatus";
  @SerializedName(SERIALIZED_NAME_SCORE_STATUS)
  private String scoreStatus;

  public TitaniumTradeAligmentDateAndValue() { 
  }

  public TitaniumTradeAligmentDateAndValue date(String date) {
    
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


  public TitaniumTradeAligmentDateAndValue score(Object score) {
    
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


  public TitaniumTradeAligmentDateAndValue scoreStatus(String scoreStatus) {
    
    this.scoreStatus = scoreStatus;
    return this;
  }

   /**
   * Get scoreStatus
   * @return scoreStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScoreStatus() {
    return scoreStatus;
  }


  public void setScoreStatus(String scoreStatus) {
    this.scoreStatus = scoreStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumTradeAligmentDateAndValue titaniumTradeAligmentDateAndValue = (TitaniumTradeAligmentDateAndValue) o;
    return Objects.equals(this.date, titaniumTradeAligmentDateAndValue.date) &&
        Objects.equals(this.score, titaniumTradeAligmentDateAndValue.score) &&
        Objects.equals(this.scoreStatus, titaniumTradeAligmentDateAndValue.scoreStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, score, scoreStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumTradeAligmentDateAndValue {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    scoreStatus: ").append(toIndentedString(scoreStatus)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("score");
    openapiFields.add("scoreStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumTradeAligmentDateAndValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumTradeAligmentDateAndValue.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumTradeAligmentDateAndValue is not found in the empty JSON string", TitaniumTradeAligmentDateAndValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumTradeAligmentDateAndValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumTradeAligmentDateAndValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (jsonObj.get("scoreStatus") != null && !jsonObj.get("scoreStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scoreStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scoreStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumTradeAligmentDateAndValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumTradeAligmentDateAndValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumTradeAligmentDateAndValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumTradeAligmentDateAndValue.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumTradeAligmentDateAndValue>() {
           @Override
           public void write(JsonWriter out, TitaniumTradeAligmentDateAndValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumTradeAligmentDateAndValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumTradeAligmentDateAndValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumTradeAligmentDateAndValue
  * @throws IOException if the JSON string is invalid with respect to TitaniumTradeAligmentDateAndValue
  */
  public static TitaniumTradeAligmentDateAndValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumTradeAligmentDateAndValue.class);
  }

 /**
  * Convert an instance of TitaniumTradeAligmentDateAndValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

