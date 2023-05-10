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
import org.openapitools.client.model.TitaniumRange;

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
 * TitaniumChartRanges
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-10T18:18:07.053431Z[UTC]")
public class TitaniumChartRanges {
  public static final String SERIALIZED_NAME_CHALLENGE_OVERLAY_CONSENSUS = "challengeOverlayConsensus";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_OVERLAY_CONSENSUS)
  private TitaniumRange challengeOverlayConsensus;

  public static final String SERIALIZED_NAME_EVP = "evp";
  @SerializedName(SERIALIZED_NAME_EVP)
  private TitaniumRange evp;

  public static final String SERIALIZED_NAME_EXPERT_POST_CHALLENGE = "expertPostChallenge";
  @SerializedName(SERIALIZED_NAME_EXPERT_POST_CHALLENGE)
  private TitaniumRange expertPostChallenge;

  public static final String SERIALIZED_NAME_EXPERT_PRE_CHALLENGE = "expertPreChallenge";
  @SerializedName(SERIALIZED_NAME_EXPERT_PRE_CHALLENGE)
  private TitaniumRange expertPreChallenge;

  public static final String SERIALIZED_NAME_MARKET_DATA_OVERLAY_CONSENSUS = "marketDataOverlayConsensus";
  @SerializedName(SERIALIZED_NAME_MARKET_DATA_OVERLAY_CONSENSUS)
  private TitaniumRange marketDataOverlayConsensus;

  public static final String SERIALIZED_NAME_SUBMISSION_MEAN_MEDIAN = "submissionMeanMedian";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_MEAN_MEDIAN)
  private TitaniumRange submissionMeanMedian;

  public static final String SERIALIZED_NAME_SUBMISSION_MIN_MAX = "submissionMinMax";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_MIN_MAX)
  private TitaniumRange submissionMinMax;

  public static final String SERIALIZED_NAME_SUBMISSION_ONLY_CONSENSUS = "submissionOnlyConsensus";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ONLY_CONSENSUS)
  private TitaniumRange submissionOnlyConsensus;

  public TitaniumChartRanges() { 
  }

  public TitaniumChartRanges challengeOverlayConsensus(TitaniumRange challengeOverlayConsensus) {
    
    this.challengeOverlayConsensus = challengeOverlayConsensus;
    return this;
  }

   /**
   * Get challengeOverlayConsensus
   * @return challengeOverlayConsensus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRange getChallengeOverlayConsensus() {
    return challengeOverlayConsensus;
  }


  public void setChallengeOverlayConsensus(TitaniumRange challengeOverlayConsensus) {
    this.challengeOverlayConsensus = challengeOverlayConsensus;
  }


  public TitaniumChartRanges evp(TitaniumRange evp) {
    
    this.evp = evp;
    return this;
  }

   /**
   * Get evp
   * @return evp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRange getEvp() {
    return evp;
  }


  public void setEvp(TitaniumRange evp) {
    this.evp = evp;
  }


  public TitaniumChartRanges expertPostChallenge(TitaniumRange expertPostChallenge) {
    
    this.expertPostChallenge = expertPostChallenge;
    return this;
  }

   /**
   * Get expertPostChallenge
   * @return expertPostChallenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRange getExpertPostChallenge() {
    return expertPostChallenge;
  }


  public void setExpertPostChallenge(TitaniumRange expertPostChallenge) {
    this.expertPostChallenge = expertPostChallenge;
  }


  public TitaniumChartRanges expertPreChallenge(TitaniumRange expertPreChallenge) {
    
    this.expertPreChallenge = expertPreChallenge;
    return this;
  }

   /**
   * Get expertPreChallenge
   * @return expertPreChallenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRange getExpertPreChallenge() {
    return expertPreChallenge;
  }


  public void setExpertPreChallenge(TitaniumRange expertPreChallenge) {
    this.expertPreChallenge = expertPreChallenge;
  }


  public TitaniumChartRanges marketDataOverlayConsensus(TitaniumRange marketDataOverlayConsensus) {
    
    this.marketDataOverlayConsensus = marketDataOverlayConsensus;
    return this;
  }

   /**
   * Get marketDataOverlayConsensus
   * @return marketDataOverlayConsensus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRange getMarketDataOverlayConsensus() {
    return marketDataOverlayConsensus;
  }


  public void setMarketDataOverlayConsensus(TitaniumRange marketDataOverlayConsensus) {
    this.marketDataOverlayConsensus = marketDataOverlayConsensus;
  }


  public TitaniumChartRanges submissionMeanMedian(TitaniumRange submissionMeanMedian) {
    
    this.submissionMeanMedian = submissionMeanMedian;
    return this;
  }

   /**
   * Get submissionMeanMedian
   * @return submissionMeanMedian
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRange getSubmissionMeanMedian() {
    return submissionMeanMedian;
  }


  public void setSubmissionMeanMedian(TitaniumRange submissionMeanMedian) {
    this.submissionMeanMedian = submissionMeanMedian;
  }


  public TitaniumChartRanges submissionMinMax(TitaniumRange submissionMinMax) {
    
    this.submissionMinMax = submissionMinMax;
    return this;
  }

   /**
   * Get submissionMinMax
   * @return submissionMinMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRange getSubmissionMinMax() {
    return submissionMinMax;
  }


  public void setSubmissionMinMax(TitaniumRange submissionMinMax) {
    this.submissionMinMax = submissionMinMax;
  }


  public TitaniumChartRanges submissionOnlyConsensus(TitaniumRange submissionOnlyConsensus) {
    
    this.submissionOnlyConsensus = submissionOnlyConsensus;
    return this;
  }

   /**
   * Get submissionOnlyConsensus
   * @return submissionOnlyConsensus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRange getSubmissionOnlyConsensus() {
    return submissionOnlyConsensus;
  }


  public void setSubmissionOnlyConsensus(TitaniumRange submissionOnlyConsensus) {
    this.submissionOnlyConsensus = submissionOnlyConsensus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumChartRanges titaniumChartRanges = (TitaniumChartRanges) o;
    return Objects.equals(this.challengeOverlayConsensus, titaniumChartRanges.challengeOverlayConsensus) &&
        Objects.equals(this.evp, titaniumChartRanges.evp) &&
        Objects.equals(this.expertPostChallenge, titaniumChartRanges.expertPostChallenge) &&
        Objects.equals(this.expertPreChallenge, titaniumChartRanges.expertPreChallenge) &&
        Objects.equals(this.marketDataOverlayConsensus, titaniumChartRanges.marketDataOverlayConsensus) &&
        Objects.equals(this.submissionMeanMedian, titaniumChartRanges.submissionMeanMedian) &&
        Objects.equals(this.submissionMinMax, titaniumChartRanges.submissionMinMax) &&
        Objects.equals(this.submissionOnlyConsensus, titaniumChartRanges.submissionOnlyConsensus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeOverlayConsensus, evp, expertPostChallenge, expertPreChallenge, marketDataOverlayConsensus, submissionMeanMedian, submissionMinMax, submissionOnlyConsensus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumChartRanges {\n");
    sb.append("    challengeOverlayConsensus: ").append(toIndentedString(challengeOverlayConsensus)).append("\n");
    sb.append("    evp: ").append(toIndentedString(evp)).append("\n");
    sb.append("    expertPostChallenge: ").append(toIndentedString(expertPostChallenge)).append("\n");
    sb.append("    expertPreChallenge: ").append(toIndentedString(expertPreChallenge)).append("\n");
    sb.append("    marketDataOverlayConsensus: ").append(toIndentedString(marketDataOverlayConsensus)).append("\n");
    sb.append("    submissionMeanMedian: ").append(toIndentedString(submissionMeanMedian)).append("\n");
    sb.append("    submissionMinMax: ").append(toIndentedString(submissionMinMax)).append("\n");
    sb.append("    submissionOnlyConsensus: ").append(toIndentedString(submissionOnlyConsensus)).append("\n");
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
    openapiFields.add("challengeOverlayConsensus");
    openapiFields.add("evp");
    openapiFields.add("expertPostChallenge");
    openapiFields.add("expertPreChallenge");
    openapiFields.add("marketDataOverlayConsensus");
    openapiFields.add("submissionMeanMedian");
    openapiFields.add("submissionMinMax");
    openapiFields.add("submissionOnlyConsensus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumChartRanges
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumChartRanges.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumChartRanges is not found in the empty JSON string", TitaniumChartRanges.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumChartRanges.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumChartRanges` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `challengeOverlayConsensus`
      if (jsonObj.getAsJsonObject("challengeOverlayConsensus") != null) {
        TitaniumRange.validateJsonObject(jsonObj.getAsJsonObject("challengeOverlayConsensus"));
      }
      // validate the optional field `evp`
      if (jsonObj.getAsJsonObject("evp") != null) {
        TitaniumRange.validateJsonObject(jsonObj.getAsJsonObject("evp"));
      }
      // validate the optional field `expertPostChallenge`
      if (jsonObj.getAsJsonObject("expertPostChallenge") != null) {
        TitaniumRange.validateJsonObject(jsonObj.getAsJsonObject("expertPostChallenge"));
      }
      // validate the optional field `expertPreChallenge`
      if (jsonObj.getAsJsonObject("expertPreChallenge") != null) {
        TitaniumRange.validateJsonObject(jsonObj.getAsJsonObject("expertPreChallenge"));
      }
      // validate the optional field `marketDataOverlayConsensus`
      if (jsonObj.getAsJsonObject("marketDataOverlayConsensus") != null) {
        TitaniumRange.validateJsonObject(jsonObj.getAsJsonObject("marketDataOverlayConsensus"));
      }
      // validate the optional field `submissionMeanMedian`
      if (jsonObj.getAsJsonObject("submissionMeanMedian") != null) {
        TitaniumRange.validateJsonObject(jsonObj.getAsJsonObject("submissionMeanMedian"));
      }
      // validate the optional field `submissionMinMax`
      if (jsonObj.getAsJsonObject("submissionMinMax") != null) {
        TitaniumRange.validateJsonObject(jsonObj.getAsJsonObject("submissionMinMax"));
      }
      // validate the optional field `submissionOnlyConsensus`
      if (jsonObj.getAsJsonObject("submissionOnlyConsensus") != null) {
        TitaniumRange.validateJsonObject(jsonObj.getAsJsonObject("submissionOnlyConsensus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumChartRanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumChartRanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumChartRanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumChartRanges.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumChartRanges>() {
           @Override
           public void write(JsonWriter out, TitaniumChartRanges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumChartRanges read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumChartRanges given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumChartRanges
  * @throws IOException if the JSON string is invalid with respect to TitaniumChartRanges
  */
  public static TitaniumChartRanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumChartRanges.class);
  }

 /**
  * Convert an instance of TitaniumChartRanges to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

