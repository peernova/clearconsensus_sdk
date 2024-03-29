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
 * TitaniumSubmissionEvidenceTableColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-24T18:40:39.548142Z[UTC]")
public class TitaniumSubmissionEvidenceTableColumn {
  public static final String SERIALIZED_NAME_ABS_DIFF_FROM_EVIDENCE = "absDiffFromEvidence";
  @SerializedName(SERIALIZED_NAME_ABS_DIFF_FROM_EVIDENCE)
  private Object absDiffFromEvidence;

  public static final String SERIALIZED_NAME_EVI_PRICE_ABS_DIFF_FROM_LATEST_TRADE = "eviPriceAbsDiffFromLatestTrade";
  @SerializedName(SERIALIZED_NAME_EVI_PRICE_ABS_DIFF_FROM_LATEST_TRADE)
  private Object eviPriceAbsDiffFromLatestTrade;

  public static final String SERIALIZED_NAME_EVIDENCE = "evidence";
  @SerializedName(SERIALIZED_NAME_EVIDENCE)
  private Object evidence;

  public static final String SERIALIZED_NAME_LOWER_BOUNDARY = "lowerBoundary";
  @SerializedName(SERIALIZED_NAME_LOWER_BOUNDARY)
  private Object lowerBoundary;

  public static final String SERIALIZED_NAME_PARTICIPANTS_COUNT = "participantsCount";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTS_COUNT)
  private Object participantsCount;

  public static final String SERIALIZED_NAME_STD_DEV = "stdDev";
  @SerializedName(SERIALIZED_NAME_STD_DEV)
  private Object stdDev;

  public static final String SERIALIZED_NAME_SUB_PRICE_DIFF = "subPriceDiff";
  @SerializedName(SERIALIZED_NAME_SUB_PRICE_DIFF)
  private Object subPriceDiff;

  public static final String SERIALIZED_NAME_UPPER_BOUNDARY = "upperBoundary";
  @SerializedName(SERIALIZED_NAME_UPPER_BOUNDARY)
  private Object upperBoundary;

  public TitaniumSubmissionEvidenceTableColumn() { 
  }

  public TitaniumSubmissionEvidenceTableColumn absDiffFromEvidence(Object absDiffFromEvidence) {
    
    this.absDiffFromEvidence = absDiffFromEvidence;
    return this;
  }

   /**
   * Get absDiffFromEvidence
   * @return absDiffFromEvidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAbsDiffFromEvidence() {
    return absDiffFromEvidence;
  }


  public void setAbsDiffFromEvidence(Object absDiffFromEvidence) {
    this.absDiffFromEvidence = absDiffFromEvidence;
  }


  public TitaniumSubmissionEvidenceTableColumn eviPriceAbsDiffFromLatestTrade(Object eviPriceAbsDiffFromLatestTrade) {
    
    this.eviPriceAbsDiffFromLatestTrade = eviPriceAbsDiffFromLatestTrade;
    return this;
  }

   /**
   * Get eviPriceAbsDiffFromLatestTrade
   * @return eviPriceAbsDiffFromLatestTrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEviPriceAbsDiffFromLatestTrade() {
    return eviPriceAbsDiffFromLatestTrade;
  }


  public void setEviPriceAbsDiffFromLatestTrade(Object eviPriceAbsDiffFromLatestTrade) {
    this.eviPriceAbsDiffFromLatestTrade = eviPriceAbsDiffFromLatestTrade;
  }


  public TitaniumSubmissionEvidenceTableColumn evidence(Object evidence) {
    
    this.evidence = evidence;
    return this;
  }

   /**
   * Get evidence
   * @return evidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getEvidence() {
    return evidence;
  }


  public void setEvidence(Object evidence) {
    this.evidence = evidence;
  }


  public TitaniumSubmissionEvidenceTableColumn lowerBoundary(Object lowerBoundary) {
    
    this.lowerBoundary = lowerBoundary;
    return this;
  }

   /**
   * Get lowerBoundary
   * @return lowerBoundary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLowerBoundary() {
    return lowerBoundary;
  }


  public void setLowerBoundary(Object lowerBoundary) {
    this.lowerBoundary = lowerBoundary;
  }


  public TitaniumSubmissionEvidenceTableColumn participantsCount(Object participantsCount) {
    
    this.participantsCount = participantsCount;
    return this;
  }

   /**
   * Get participantsCount
   * @return participantsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getParticipantsCount() {
    return participantsCount;
  }


  public void setParticipantsCount(Object participantsCount) {
    this.participantsCount = participantsCount;
  }


  public TitaniumSubmissionEvidenceTableColumn stdDev(Object stdDev) {
    
    this.stdDev = stdDev;
    return this;
  }

   /**
   * Get stdDev
   * @return stdDev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStdDev() {
    return stdDev;
  }


  public void setStdDev(Object stdDev) {
    this.stdDev = stdDev;
  }


  public TitaniumSubmissionEvidenceTableColumn subPriceDiff(Object subPriceDiff) {
    
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


  public TitaniumSubmissionEvidenceTableColumn upperBoundary(Object upperBoundary) {
    
    this.upperBoundary = upperBoundary;
    return this;
  }

   /**
   * Get upperBoundary
   * @return upperBoundary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getUpperBoundary() {
    return upperBoundary;
  }


  public void setUpperBoundary(Object upperBoundary) {
    this.upperBoundary = upperBoundary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumSubmissionEvidenceTableColumn titaniumSubmissionEvidenceTableColumn = (TitaniumSubmissionEvidenceTableColumn) o;
    return Objects.equals(this.absDiffFromEvidence, titaniumSubmissionEvidenceTableColumn.absDiffFromEvidence) &&
        Objects.equals(this.eviPriceAbsDiffFromLatestTrade, titaniumSubmissionEvidenceTableColumn.eviPriceAbsDiffFromLatestTrade) &&
        Objects.equals(this.evidence, titaniumSubmissionEvidenceTableColumn.evidence) &&
        Objects.equals(this.lowerBoundary, titaniumSubmissionEvidenceTableColumn.lowerBoundary) &&
        Objects.equals(this.participantsCount, titaniumSubmissionEvidenceTableColumn.participantsCount) &&
        Objects.equals(this.stdDev, titaniumSubmissionEvidenceTableColumn.stdDev) &&
        Objects.equals(this.subPriceDiff, titaniumSubmissionEvidenceTableColumn.subPriceDiff) &&
        Objects.equals(this.upperBoundary, titaniumSubmissionEvidenceTableColumn.upperBoundary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absDiffFromEvidence, eviPriceAbsDiffFromLatestTrade, evidence, lowerBoundary, participantsCount, stdDev, subPriceDiff, upperBoundary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumSubmissionEvidenceTableColumn {\n");
    sb.append("    absDiffFromEvidence: ").append(toIndentedString(absDiffFromEvidence)).append("\n");
    sb.append("    eviPriceAbsDiffFromLatestTrade: ").append(toIndentedString(eviPriceAbsDiffFromLatestTrade)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    lowerBoundary: ").append(toIndentedString(lowerBoundary)).append("\n");
    sb.append("    participantsCount: ").append(toIndentedString(participantsCount)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    subPriceDiff: ").append(toIndentedString(subPriceDiff)).append("\n");
    sb.append("    upperBoundary: ").append(toIndentedString(upperBoundary)).append("\n");
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
    openapiFields.add("absDiffFromEvidence");
    openapiFields.add("eviPriceAbsDiffFromLatestTrade");
    openapiFields.add("evidence");
    openapiFields.add("lowerBoundary");
    openapiFields.add("participantsCount");
    openapiFields.add("stdDev");
    openapiFields.add("subPriceDiff");
    openapiFields.add("upperBoundary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumSubmissionEvidenceTableColumn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumSubmissionEvidenceTableColumn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumSubmissionEvidenceTableColumn is not found in the empty JSON string", TitaniumSubmissionEvidenceTableColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumSubmissionEvidenceTableColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumSubmissionEvidenceTableColumn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumSubmissionEvidenceTableColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumSubmissionEvidenceTableColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumSubmissionEvidenceTableColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumSubmissionEvidenceTableColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumSubmissionEvidenceTableColumn>() {
           @Override
           public void write(JsonWriter out, TitaniumSubmissionEvidenceTableColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumSubmissionEvidenceTableColumn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumSubmissionEvidenceTableColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumSubmissionEvidenceTableColumn
  * @throws IOException if the JSON string is invalid with respect to TitaniumSubmissionEvidenceTableColumn
  */
  public static TitaniumSubmissionEvidenceTableColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumSubmissionEvidenceTableColumn.class);
  }

 /**
  * Convert an instance of TitaniumSubmissionEvidenceTableColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

