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
import org.openapitools.client.model.TitaniumEvpAnchorDetails;
import org.openapitools.client.model.TitaniumSubmissionEvidenceAnchorDetails;
import org.openapitools.client.model.TitaniumTradeAnchorDetails;
import org.openapitools.client.model.TitaniumTradePeriodsWithMetrics;

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
 * TitaniumCohortConsensusRangeTabData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-21T10:43:08.721052Z[UTC]")
public class TitaniumCohortConsensusRangeTabData {
  public static final String SERIALIZED_NAME_DISTANCE_TO_ANCHOR = "distanceToAnchor";
  @SerializedName(SERIALIZED_NAME_DISTANCE_TO_ANCHOR)
  private Object distanceToAnchor;

  public static final String SERIALIZED_NAME_DISTANCE_TO_CONSENSUS = "distanceToConsensus";
  @SerializedName(SERIALIZED_NAME_DISTANCE_TO_CONSENSUS)
  private Object distanceToConsensus;

  public static final String SERIALIZED_NAME_EVP_ANCHOR_DETAILS = "evpAnchorDetails";
  @SerializedName(SERIALIZED_NAME_EVP_ANCHOR_DETAILS)
  private TitaniumEvpAnchorDetails evpAnchorDetails;

  public static final String SERIALIZED_NAME_EXPERTISE_RANK = "expertiseRank";
  @SerializedName(SERIALIZED_NAME_EXPERTISE_RANK)
  private Object expertiseRank;

  public static final String SERIALIZED_NAME_EXPERTISE_SCORE = "expertiseScore";
  @SerializedName(SERIALIZED_NAME_EXPERTISE_SCORE)
  private Object expertiseScore;

  public static final String SERIALIZED_NAME_EXPERTS_COUNT = "expertsCount";
  @SerializedName(SERIALIZED_NAME_EXPERTS_COUNT)
  private Integer expertsCount;

  public static final String SERIALIZED_NAME_SUBMISSION_EVIDENCE_ANCHOR_DETAILS = "submissionEvidenceAnchorDetails";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_EVIDENCE_ANCHOR_DETAILS)
  private TitaniumSubmissionEvidenceAnchorDetails submissionEvidenceAnchorDetails;

  public static final String SERIALIZED_NAME_TRADE_ANCHOR_DETAILS = "tradeAnchorDetails";
  @SerializedName(SERIALIZED_NAME_TRADE_ANCHOR_DETAILS)
  private TitaniumTradeAnchorDetails tradeAnchorDetails;

  public static final String SERIALIZED_NAME_TRADE_PERIODS_WITH_METRICS = "tradePeriodsWithMetrics";
  @SerializedName(SERIALIZED_NAME_TRADE_PERIODS_WITH_METRICS)
  private TitaniumTradePeriodsWithMetrics tradePeriodsWithMetrics;

  public TitaniumCohortConsensusRangeTabData() { 
  }

  public TitaniumCohortConsensusRangeTabData distanceToAnchor(Object distanceToAnchor) {
    
    this.distanceToAnchor = distanceToAnchor;
    return this;
  }

   /**
   * Get distanceToAnchor
   * @return distanceToAnchor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDistanceToAnchor() {
    return distanceToAnchor;
  }


  public void setDistanceToAnchor(Object distanceToAnchor) {
    this.distanceToAnchor = distanceToAnchor;
  }


  public TitaniumCohortConsensusRangeTabData distanceToConsensus(Object distanceToConsensus) {
    
    this.distanceToConsensus = distanceToConsensus;
    return this;
  }

   /**
   * Get distanceToConsensus
   * @return distanceToConsensus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDistanceToConsensus() {
    return distanceToConsensus;
  }


  public void setDistanceToConsensus(Object distanceToConsensus) {
    this.distanceToConsensus = distanceToConsensus;
  }


  public TitaniumCohortConsensusRangeTabData evpAnchorDetails(TitaniumEvpAnchorDetails evpAnchorDetails) {
    
    this.evpAnchorDetails = evpAnchorDetails;
    return this;
  }

   /**
   * Get evpAnchorDetails
   * @return evpAnchorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumEvpAnchorDetails getEvpAnchorDetails() {
    return evpAnchorDetails;
  }


  public void setEvpAnchorDetails(TitaniumEvpAnchorDetails evpAnchorDetails) {
    this.evpAnchorDetails = evpAnchorDetails;
  }


  public TitaniumCohortConsensusRangeTabData expertiseRank(Object expertiseRank) {
    
    this.expertiseRank = expertiseRank;
    return this;
  }

   /**
   * Get expertiseRank
   * @return expertiseRank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getExpertiseRank() {
    return expertiseRank;
  }


  public void setExpertiseRank(Object expertiseRank) {
    this.expertiseRank = expertiseRank;
  }


  public TitaniumCohortConsensusRangeTabData expertiseScore(Object expertiseScore) {
    
    this.expertiseScore = expertiseScore;
    return this;
  }

   /**
   * Get expertiseScore
   * @return expertiseScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getExpertiseScore() {
    return expertiseScore;
  }


  public void setExpertiseScore(Object expertiseScore) {
    this.expertiseScore = expertiseScore;
  }


  public TitaniumCohortConsensusRangeTabData expertsCount(Integer expertsCount) {
    
    this.expertsCount = expertsCount;
    return this;
  }

   /**
   * Get expertsCount
   * @return expertsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getExpertsCount() {
    return expertsCount;
  }


  public void setExpertsCount(Integer expertsCount) {
    this.expertsCount = expertsCount;
  }


  public TitaniumCohortConsensusRangeTabData submissionEvidenceAnchorDetails(TitaniumSubmissionEvidenceAnchorDetails submissionEvidenceAnchorDetails) {
    
    this.submissionEvidenceAnchorDetails = submissionEvidenceAnchorDetails;
    return this;
  }

   /**
   * Get submissionEvidenceAnchorDetails
   * @return submissionEvidenceAnchorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumSubmissionEvidenceAnchorDetails getSubmissionEvidenceAnchorDetails() {
    return submissionEvidenceAnchorDetails;
  }


  public void setSubmissionEvidenceAnchorDetails(TitaniumSubmissionEvidenceAnchorDetails submissionEvidenceAnchorDetails) {
    this.submissionEvidenceAnchorDetails = submissionEvidenceAnchorDetails;
  }


  public TitaniumCohortConsensusRangeTabData tradeAnchorDetails(TitaniumTradeAnchorDetails tradeAnchorDetails) {
    
    this.tradeAnchorDetails = tradeAnchorDetails;
    return this;
  }

   /**
   * Get tradeAnchorDetails
   * @return tradeAnchorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumTradeAnchorDetails getTradeAnchorDetails() {
    return tradeAnchorDetails;
  }


  public void setTradeAnchorDetails(TitaniumTradeAnchorDetails tradeAnchorDetails) {
    this.tradeAnchorDetails = tradeAnchorDetails;
  }


  public TitaniumCohortConsensusRangeTabData tradePeriodsWithMetrics(TitaniumTradePeriodsWithMetrics tradePeriodsWithMetrics) {
    
    this.tradePeriodsWithMetrics = tradePeriodsWithMetrics;
    return this;
  }

   /**
   * Get tradePeriodsWithMetrics
   * @return tradePeriodsWithMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumTradePeriodsWithMetrics getTradePeriodsWithMetrics() {
    return tradePeriodsWithMetrics;
  }


  public void setTradePeriodsWithMetrics(TitaniumTradePeriodsWithMetrics tradePeriodsWithMetrics) {
    this.tradePeriodsWithMetrics = tradePeriodsWithMetrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumCohortConsensusRangeTabData titaniumCohortConsensusRangeTabData = (TitaniumCohortConsensusRangeTabData) o;
    return Objects.equals(this.distanceToAnchor, titaniumCohortConsensusRangeTabData.distanceToAnchor) &&
        Objects.equals(this.distanceToConsensus, titaniumCohortConsensusRangeTabData.distanceToConsensus) &&
        Objects.equals(this.evpAnchorDetails, titaniumCohortConsensusRangeTabData.evpAnchorDetails) &&
        Objects.equals(this.expertiseRank, titaniumCohortConsensusRangeTabData.expertiseRank) &&
        Objects.equals(this.expertiseScore, titaniumCohortConsensusRangeTabData.expertiseScore) &&
        Objects.equals(this.expertsCount, titaniumCohortConsensusRangeTabData.expertsCount) &&
        Objects.equals(this.submissionEvidenceAnchorDetails, titaniumCohortConsensusRangeTabData.submissionEvidenceAnchorDetails) &&
        Objects.equals(this.tradeAnchorDetails, titaniumCohortConsensusRangeTabData.tradeAnchorDetails) &&
        Objects.equals(this.tradePeriodsWithMetrics, titaniumCohortConsensusRangeTabData.tradePeriodsWithMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceToAnchor, distanceToConsensus, evpAnchorDetails, expertiseRank, expertiseScore, expertsCount, submissionEvidenceAnchorDetails, tradeAnchorDetails, tradePeriodsWithMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumCohortConsensusRangeTabData {\n");
    sb.append("    distanceToAnchor: ").append(toIndentedString(distanceToAnchor)).append("\n");
    sb.append("    distanceToConsensus: ").append(toIndentedString(distanceToConsensus)).append("\n");
    sb.append("    evpAnchorDetails: ").append(toIndentedString(evpAnchorDetails)).append("\n");
    sb.append("    expertiseRank: ").append(toIndentedString(expertiseRank)).append("\n");
    sb.append("    expertiseScore: ").append(toIndentedString(expertiseScore)).append("\n");
    sb.append("    expertsCount: ").append(toIndentedString(expertsCount)).append("\n");
    sb.append("    submissionEvidenceAnchorDetails: ").append(toIndentedString(submissionEvidenceAnchorDetails)).append("\n");
    sb.append("    tradeAnchorDetails: ").append(toIndentedString(tradeAnchorDetails)).append("\n");
    sb.append("    tradePeriodsWithMetrics: ").append(toIndentedString(tradePeriodsWithMetrics)).append("\n");
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
    openapiFields.add("distanceToAnchor");
    openapiFields.add("distanceToConsensus");
    openapiFields.add("evpAnchorDetails");
    openapiFields.add("expertiseRank");
    openapiFields.add("expertiseScore");
    openapiFields.add("expertsCount");
    openapiFields.add("submissionEvidenceAnchorDetails");
    openapiFields.add("tradeAnchorDetails");
    openapiFields.add("tradePeriodsWithMetrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumCohortConsensusRangeTabData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumCohortConsensusRangeTabData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumCohortConsensusRangeTabData is not found in the empty JSON string", TitaniumCohortConsensusRangeTabData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumCohortConsensusRangeTabData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumCohortConsensusRangeTabData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `evpAnchorDetails`
      if (jsonObj.getAsJsonObject("evpAnchorDetails") != null) {
        TitaniumEvpAnchorDetails.validateJsonObject(jsonObj.getAsJsonObject("evpAnchorDetails"));
      }
      // validate the optional field `submissionEvidenceAnchorDetails`
      if (jsonObj.getAsJsonObject("submissionEvidenceAnchorDetails") != null) {
        TitaniumSubmissionEvidenceAnchorDetails.validateJsonObject(jsonObj.getAsJsonObject("submissionEvidenceAnchorDetails"));
      }
      // validate the optional field `tradeAnchorDetails`
      if (jsonObj.getAsJsonObject("tradeAnchorDetails") != null) {
        TitaniumTradeAnchorDetails.validateJsonObject(jsonObj.getAsJsonObject("tradeAnchorDetails"));
      }
      // validate the optional field `tradePeriodsWithMetrics`
      if (jsonObj.getAsJsonObject("tradePeriodsWithMetrics") != null) {
        TitaniumTradePeriodsWithMetrics.validateJsonObject(jsonObj.getAsJsonObject("tradePeriodsWithMetrics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumCohortConsensusRangeTabData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumCohortConsensusRangeTabData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumCohortConsensusRangeTabData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumCohortConsensusRangeTabData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumCohortConsensusRangeTabData>() {
           @Override
           public void write(JsonWriter out, TitaniumCohortConsensusRangeTabData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumCohortConsensusRangeTabData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumCohortConsensusRangeTabData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumCohortConsensusRangeTabData
  * @throws IOException if the JSON string is invalid with respect to TitaniumCohortConsensusRangeTabData
  */
  public static TitaniumCohortConsensusRangeTabData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumCohortConsensusRangeTabData.class);
  }

 /**
  * Convert an instance of TitaniumCohortConsensusRangeTabData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
