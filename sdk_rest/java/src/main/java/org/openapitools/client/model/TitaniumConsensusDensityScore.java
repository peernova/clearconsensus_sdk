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
 * TitaniumConsensusDensityScore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:31:21.732898Z[UTC]")
public class TitaniumConsensusDensityScore {
  public static final String SERIALIZED_NAME_BIMODALITY_SCORE = "bimodalityScore";
  @SerializedName(SERIALIZED_NAME_BIMODALITY_SCORE)
  private Object bimodalityScore;

  public static final String SERIALIZED_NAME_DISPERSION = "dispersion";
  @SerializedName(SERIALIZED_NAME_DISPERSION)
  private Object dispersion;

  public static final String SERIALIZED_NAME_EVP_ALIGNMENT_SCORE = "evpAlignmentScore";
  @SerializedName(SERIALIZED_NAME_EVP_ALIGNMENT_SCORE)
  private Object evpAlignmentScore;

  public static final String SERIALIZED_NAME_HISTORY = "history";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private List<TitaniumDateAndValue> history = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Object score;

  public static final String SERIALIZED_NAME_TRADE_ALIGNMENT_SCORE = "tradeAlignmentScore";
  @SerializedName(SERIALIZED_NAME_TRADE_ALIGNMENT_SCORE)
  private Object tradeAlignmentScore;

  public TitaniumConsensusDensityScore() { 
  }

  public TitaniumConsensusDensityScore bimodalityScore(Object bimodalityScore) {
    
    this.bimodalityScore = bimodalityScore;
    return this;
  }

   /**
   * Get bimodalityScore
   * @return bimodalityScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBimodalityScore() {
    return bimodalityScore;
  }


  public void setBimodalityScore(Object bimodalityScore) {
    this.bimodalityScore = bimodalityScore;
  }


  public TitaniumConsensusDensityScore dispersion(Object dispersion) {
    
    this.dispersion = dispersion;
    return this;
  }

   /**
   * Get dispersion
   * @return dispersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDispersion() {
    return dispersion;
  }


  public void setDispersion(Object dispersion) {
    this.dispersion = dispersion;
  }


  public TitaniumConsensusDensityScore evpAlignmentScore(Object evpAlignmentScore) {
    
    this.evpAlignmentScore = evpAlignmentScore;
    return this;
  }

   /**
   * Get evpAlignmentScore
   * @return evpAlignmentScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEvpAlignmentScore() {
    return evpAlignmentScore;
  }


  public void setEvpAlignmentScore(Object evpAlignmentScore) {
    this.evpAlignmentScore = evpAlignmentScore;
  }


  public TitaniumConsensusDensityScore history(List<TitaniumDateAndValue> history) {
    
    this.history = history;
    return this;
  }

  public TitaniumConsensusDensityScore addHistoryItem(TitaniumDateAndValue historyItem) {
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


  public TitaniumConsensusDensityScore score(Object score) {
    
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


  public TitaniumConsensusDensityScore tradeAlignmentScore(Object tradeAlignmentScore) {
    
    this.tradeAlignmentScore = tradeAlignmentScore;
    return this;
  }

   /**
   * Get tradeAlignmentScore
   * @return tradeAlignmentScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTradeAlignmentScore() {
    return tradeAlignmentScore;
  }


  public void setTradeAlignmentScore(Object tradeAlignmentScore) {
    this.tradeAlignmentScore = tradeAlignmentScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusDensityScore titaniumConsensusDensityScore = (TitaniumConsensusDensityScore) o;
    return Objects.equals(this.bimodalityScore, titaniumConsensusDensityScore.bimodalityScore) &&
        Objects.equals(this.dispersion, titaniumConsensusDensityScore.dispersion) &&
        Objects.equals(this.evpAlignmentScore, titaniumConsensusDensityScore.evpAlignmentScore) &&
        Objects.equals(this.history, titaniumConsensusDensityScore.history) &&
        Objects.equals(this.score, titaniumConsensusDensityScore.score) &&
        Objects.equals(this.tradeAlignmentScore, titaniumConsensusDensityScore.tradeAlignmentScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bimodalityScore, dispersion, evpAlignmentScore, history, score, tradeAlignmentScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusDensityScore {\n");
    sb.append("    bimodalityScore: ").append(toIndentedString(bimodalityScore)).append("\n");
    sb.append("    dispersion: ").append(toIndentedString(dispersion)).append("\n");
    sb.append("    evpAlignmentScore: ").append(toIndentedString(evpAlignmentScore)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    tradeAlignmentScore: ").append(toIndentedString(tradeAlignmentScore)).append("\n");
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
    openapiFields.add("bimodalityScore");
    openapiFields.add("dispersion");
    openapiFields.add("evpAlignmentScore");
    openapiFields.add("history");
    openapiFields.add("score");
    openapiFields.add("tradeAlignmentScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusDensityScore
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusDensityScore.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusDensityScore is not found in the empty JSON string", TitaniumConsensusDensityScore.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusDensityScore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusDensityScore` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusDensityScore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusDensityScore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusDensityScore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusDensityScore.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusDensityScore>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusDensityScore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusDensityScore read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusDensityScore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusDensityScore
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusDensityScore
  */
  public static TitaniumConsensusDensityScore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusDensityScore.class);
  }

 /**
  * Convert an instance of TitaniumConsensusDensityScore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

