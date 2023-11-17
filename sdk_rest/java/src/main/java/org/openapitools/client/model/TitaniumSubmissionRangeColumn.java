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
 * TitaniumSubmissionRangeColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:42:50.364277Z[UTC]")
public class TitaniumSubmissionRangeColumn {
  public static final String SERIALIZED_NAME_ABS_DIFF_FROM_MEAN = "absDiffFromMean";
  @SerializedName(SERIALIZED_NAME_ABS_DIFF_FROM_MEAN)
  private Object absDiffFromMean;

  public static final String SERIALIZED_NAME_MEAN = "mean";
  @SerializedName(SERIALIZED_NAME_MEAN)
  private Object mean;

  public static final String SERIALIZED_NAME_MEAN_ABS_DIFF_FROM_LATEST_TRADE = "meanAbsDiffFromLatestTrade";
  @SerializedName(SERIALIZED_NAME_MEAN_ABS_DIFF_FROM_LATEST_TRADE)
  private Object meanAbsDiffFromLatestTrade;

  public static final String SERIALIZED_NAME_STD_DEV = "stdDev";
  @SerializedName(SERIALIZED_NAME_STD_DEV)
  private Object stdDev;

  public static final String SERIALIZED_NAME_SUB_PRICE_DIFF = "subPriceDiff";
  @SerializedName(SERIALIZED_NAME_SUB_PRICE_DIFF)
  private Object subPriceDiff;

  public static final String SERIALIZED_NAME_SUBMISSION_MAX = "submissionMax";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_MAX)
  private Object submissionMax;

  public static final String SERIALIZED_NAME_SUBMISSION_MIN = "submissionMin";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_MIN)
  private Object submissionMin;

  public static final String SERIALIZED_NAME_VALID_COUNT = "validCount";
  @SerializedName(SERIALIZED_NAME_VALID_COUNT)
  private Object validCount;

  public TitaniumSubmissionRangeColumn() { 
  }

  public TitaniumSubmissionRangeColumn absDiffFromMean(Object absDiffFromMean) {
    
    this.absDiffFromMean = absDiffFromMean;
    return this;
  }

   /**
   * Get absDiffFromMean
   * @return absDiffFromMean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAbsDiffFromMean() {
    return absDiffFromMean;
  }


  public void setAbsDiffFromMean(Object absDiffFromMean) {
    this.absDiffFromMean = absDiffFromMean;
  }


  public TitaniumSubmissionRangeColumn mean(Object mean) {
    
    this.mean = mean;
    return this;
  }

   /**
   * Get mean
   * @return mean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMean() {
    return mean;
  }


  public void setMean(Object mean) {
    this.mean = mean;
  }


  public TitaniumSubmissionRangeColumn meanAbsDiffFromLatestTrade(Object meanAbsDiffFromLatestTrade) {
    
    this.meanAbsDiffFromLatestTrade = meanAbsDiffFromLatestTrade;
    return this;
  }

   /**
   * Get meanAbsDiffFromLatestTrade
   * @return meanAbsDiffFromLatestTrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMeanAbsDiffFromLatestTrade() {
    return meanAbsDiffFromLatestTrade;
  }


  public void setMeanAbsDiffFromLatestTrade(Object meanAbsDiffFromLatestTrade) {
    this.meanAbsDiffFromLatestTrade = meanAbsDiffFromLatestTrade;
  }


  public TitaniumSubmissionRangeColumn stdDev(Object stdDev) {
    
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


  public TitaniumSubmissionRangeColumn subPriceDiff(Object subPriceDiff) {
    
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


  public TitaniumSubmissionRangeColumn submissionMax(Object submissionMax) {
    
    this.submissionMax = submissionMax;
    return this;
  }

   /**
   * Get submissionMax
   * @return submissionMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSubmissionMax() {
    return submissionMax;
  }


  public void setSubmissionMax(Object submissionMax) {
    this.submissionMax = submissionMax;
  }


  public TitaniumSubmissionRangeColumn submissionMin(Object submissionMin) {
    
    this.submissionMin = submissionMin;
    return this;
  }

   /**
   * Get submissionMin
   * @return submissionMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSubmissionMin() {
    return submissionMin;
  }


  public void setSubmissionMin(Object submissionMin) {
    this.submissionMin = submissionMin;
  }


  public TitaniumSubmissionRangeColumn validCount(Object validCount) {
    
    this.validCount = validCount;
    return this;
  }

   /**
   * Get validCount
   * @return validCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValidCount() {
    return validCount;
  }


  public void setValidCount(Object validCount) {
    this.validCount = validCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumSubmissionRangeColumn titaniumSubmissionRangeColumn = (TitaniumSubmissionRangeColumn) o;
    return Objects.equals(this.absDiffFromMean, titaniumSubmissionRangeColumn.absDiffFromMean) &&
        Objects.equals(this.mean, titaniumSubmissionRangeColumn.mean) &&
        Objects.equals(this.meanAbsDiffFromLatestTrade, titaniumSubmissionRangeColumn.meanAbsDiffFromLatestTrade) &&
        Objects.equals(this.stdDev, titaniumSubmissionRangeColumn.stdDev) &&
        Objects.equals(this.subPriceDiff, titaniumSubmissionRangeColumn.subPriceDiff) &&
        Objects.equals(this.submissionMax, titaniumSubmissionRangeColumn.submissionMax) &&
        Objects.equals(this.submissionMin, titaniumSubmissionRangeColumn.submissionMin) &&
        Objects.equals(this.validCount, titaniumSubmissionRangeColumn.validCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absDiffFromMean, mean, meanAbsDiffFromLatestTrade, stdDev, subPriceDiff, submissionMax, submissionMin, validCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumSubmissionRangeColumn {\n");
    sb.append("    absDiffFromMean: ").append(toIndentedString(absDiffFromMean)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    meanAbsDiffFromLatestTrade: ").append(toIndentedString(meanAbsDiffFromLatestTrade)).append("\n");
    sb.append("    stdDev: ").append(toIndentedString(stdDev)).append("\n");
    sb.append("    subPriceDiff: ").append(toIndentedString(subPriceDiff)).append("\n");
    sb.append("    submissionMax: ").append(toIndentedString(submissionMax)).append("\n");
    sb.append("    submissionMin: ").append(toIndentedString(submissionMin)).append("\n");
    sb.append("    validCount: ").append(toIndentedString(validCount)).append("\n");
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
    openapiFields.add("absDiffFromMean");
    openapiFields.add("mean");
    openapiFields.add("meanAbsDiffFromLatestTrade");
    openapiFields.add("stdDev");
    openapiFields.add("subPriceDiff");
    openapiFields.add("submissionMax");
    openapiFields.add("submissionMin");
    openapiFields.add("validCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumSubmissionRangeColumn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumSubmissionRangeColumn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumSubmissionRangeColumn is not found in the empty JSON string", TitaniumSubmissionRangeColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumSubmissionRangeColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumSubmissionRangeColumn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumSubmissionRangeColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumSubmissionRangeColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumSubmissionRangeColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumSubmissionRangeColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumSubmissionRangeColumn>() {
           @Override
           public void write(JsonWriter out, TitaniumSubmissionRangeColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumSubmissionRangeColumn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumSubmissionRangeColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumSubmissionRangeColumn
  * @throws IOException if the JSON string is invalid with respect to TitaniumSubmissionRangeColumn
  */
  public static TitaniumSubmissionRangeColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumSubmissionRangeColumn.class);
  }

 /**
  * Convert an instance of TitaniumSubmissionRangeColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

