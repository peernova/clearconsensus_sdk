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
import org.openapitools.client.model.TitaniumChartRanges;
import org.openapitools.client.model.TitaniumCohortConsensusRangeTabData;
import org.openapitools.client.model.TitaniumRangePoint;

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
 * TitaniumConsensusExplorerRangeData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:01:11.763467Z[UTC]")
public class TitaniumConsensusExplorerRangeData {
  public static final String SERIALIZED_NAME_ANCHOR_POINT = "anchorPoint";
  @SerializedName(SERIALIZED_NAME_ANCHOR_POINT)
  private TitaniumRangePoint anchorPoint;

  public static final String SERIALIZED_NAME_BIMODAL_LEFT_MEAN = "bimodalLeftMean";
  @SerializedName(SERIALIZED_NAME_BIMODAL_LEFT_MEAN)
  private TitaniumRangePoint bimodalLeftMean;

  public static final String SERIALIZED_NAME_BIMODAL_RIGHT_MEAN = "bimodalRightMean";
  @SerializedName(SERIALIZED_NAME_BIMODAL_RIGHT_MEAN)
  private TitaniumRangePoint bimodalRightMean;

  public static final String SERIALIZED_NAME_CHART_RANGES = "chartRanges";
  @SerializedName(SERIALIZED_NAME_CHART_RANGES)
  private TitaniumChartRanges chartRanges;

  public static final String SERIALIZED_NAME_COHORT_CONSENSUS_PRICE = "cohortConsensusPrice";
  @SerializedName(SERIALIZED_NAME_COHORT_CONSENSUS_PRICE)
  private TitaniumRangePoint cohortConsensusPrice;

  public static final String SERIALIZED_NAME_COHORT_CONSENSUS_RANGE_TAB_DATA = "cohortConsensusRangeTabData";
  @SerializedName(SERIALIZED_NAME_COHORT_CONSENSUS_RANGE_TAB_DATA)
  private TitaniumCohortConsensusRangeTabData cohortConsensusRangeTabData;

  public static final String SERIALIZED_NAME_EVP_MID = "evpMid";
  @SerializedName(SERIALIZED_NAME_EVP_MID)
  private TitaniumRangePoint evpMid;

  public static final String SERIALIZED_NAME_SUBMISSION_EVIDENCE_PRICE = "submissionEvidencePrice";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_EVIDENCE_PRICE)
  private TitaniumRangePoint submissionEvidencePrice;

  public static final String SERIALIZED_NAME_SUBMISSION_MEAN = "submissionMean";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_MEAN)
  private TitaniumRangePoint submissionMean;

  public static final String SERIALIZED_NAME_SUBMISSION_POINT = "submissionPoint";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_POINT)
  private TitaniumRangePoint submissionPoint;

  public TitaniumConsensusExplorerRangeData() { 
  }

  public TitaniumConsensusExplorerRangeData anchorPoint(TitaniumRangePoint anchorPoint) {
    
    this.anchorPoint = anchorPoint;
    return this;
  }

   /**
   * Get anchorPoint
   * @return anchorPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRangePoint getAnchorPoint() {
    return anchorPoint;
  }


  public void setAnchorPoint(TitaniumRangePoint anchorPoint) {
    this.anchorPoint = anchorPoint;
  }


  public TitaniumConsensusExplorerRangeData bimodalLeftMean(TitaniumRangePoint bimodalLeftMean) {
    
    this.bimodalLeftMean = bimodalLeftMean;
    return this;
  }

   /**
   * Get bimodalLeftMean
   * @return bimodalLeftMean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRangePoint getBimodalLeftMean() {
    return bimodalLeftMean;
  }


  public void setBimodalLeftMean(TitaniumRangePoint bimodalLeftMean) {
    this.bimodalLeftMean = bimodalLeftMean;
  }


  public TitaniumConsensusExplorerRangeData bimodalRightMean(TitaniumRangePoint bimodalRightMean) {
    
    this.bimodalRightMean = bimodalRightMean;
    return this;
  }

   /**
   * Get bimodalRightMean
   * @return bimodalRightMean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRangePoint getBimodalRightMean() {
    return bimodalRightMean;
  }


  public void setBimodalRightMean(TitaniumRangePoint bimodalRightMean) {
    this.bimodalRightMean = bimodalRightMean;
  }


  public TitaniumConsensusExplorerRangeData chartRanges(TitaniumChartRanges chartRanges) {
    
    this.chartRanges = chartRanges;
    return this;
  }

   /**
   * Get chartRanges
   * @return chartRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumChartRanges getChartRanges() {
    return chartRanges;
  }


  public void setChartRanges(TitaniumChartRanges chartRanges) {
    this.chartRanges = chartRanges;
  }


  public TitaniumConsensusExplorerRangeData cohortConsensusPrice(TitaniumRangePoint cohortConsensusPrice) {
    
    this.cohortConsensusPrice = cohortConsensusPrice;
    return this;
  }

   /**
   * Get cohortConsensusPrice
   * @return cohortConsensusPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRangePoint getCohortConsensusPrice() {
    return cohortConsensusPrice;
  }


  public void setCohortConsensusPrice(TitaniumRangePoint cohortConsensusPrice) {
    this.cohortConsensusPrice = cohortConsensusPrice;
  }


  public TitaniumConsensusExplorerRangeData cohortConsensusRangeTabData(TitaniumCohortConsensusRangeTabData cohortConsensusRangeTabData) {
    
    this.cohortConsensusRangeTabData = cohortConsensusRangeTabData;
    return this;
  }

   /**
   * Get cohortConsensusRangeTabData
   * @return cohortConsensusRangeTabData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumCohortConsensusRangeTabData getCohortConsensusRangeTabData() {
    return cohortConsensusRangeTabData;
  }


  public void setCohortConsensusRangeTabData(TitaniumCohortConsensusRangeTabData cohortConsensusRangeTabData) {
    this.cohortConsensusRangeTabData = cohortConsensusRangeTabData;
  }


  public TitaniumConsensusExplorerRangeData evpMid(TitaniumRangePoint evpMid) {
    
    this.evpMid = evpMid;
    return this;
  }

   /**
   * Get evpMid
   * @return evpMid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRangePoint getEvpMid() {
    return evpMid;
  }


  public void setEvpMid(TitaniumRangePoint evpMid) {
    this.evpMid = evpMid;
  }


  public TitaniumConsensusExplorerRangeData submissionEvidencePrice(TitaniumRangePoint submissionEvidencePrice) {
    
    this.submissionEvidencePrice = submissionEvidencePrice;
    return this;
  }

   /**
   * Get submissionEvidencePrice
   * @return submissionEvidencePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRangePoint getSubmissionEvidencePrice() {
    return submissionEvidencePrice;
  }


  public void setSubmissionEvidencePrice(TitaniumRangePoint submissionEvidencePrice) {
    this.submissionEvidencePrice = submissionEvidencePrice;
  }


  public TitaniumConsensusExplorerRangeData submissionMean(TitaniumRangePoint submissionMean) {
    
    this.submissionMean = submissionMean;
    return this;
  }

   /**
   * Get submissionMean
   * @return submissionMean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRangePoint getSubmissionMean() {
    return submissionMean;
  }


  public void setSubmissionMean(TitaniumRangePoint submissionMean) {
    this.submissionMean = submissionMean;
  }


  public TitaniumConsensusExplorerRangeData submissionPoint(TitaniumRangePoint submissionPoint) {
    
    this.submissionPoint = submissionPoint;
    return this;
  }

   /**
   * Get submissionPoint
   * @return submissionPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumRangePoint getSubmissionPoint() {
    return submissionPoint;
  }


  public void setSubmissionPoint(TitaniumRangePoint submissionPoint) {
    this.submissionPoint = submissionPoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusExplorerRangeData titaniumConsensusExplorerRangeData = (TitaniumConsensusExplorerRangeData) o;
    return Objects.equals(this.anchorPoint, titaniumConsensusExplorerRangeData.anchorPoint) &&
        Objects.equals(this.bimodalLeftMean, titaniumConsensusExplorerRangeData.bimodalLeftMean) &&
        Objects.equals(this.bimodalRightMean, titaniumConsensusExplorerRangeData.bimodalRightMean) &&
        Objects.equals(this.chartRanges, titaniumConsensusExplorerRangeData.chartRanges) &&
        Objects.equals(this.cohortConsensusPrice, titaniumConsensusExplorerRangeData.cohortConsensusPrice) &&
        Objects.equals(this.cohortConsensusRangeTabData, titaniumConsensusExplorerRangeData.cohortConsensusRangeTabData) &&
        Objects.equals(this.evpMid, titaniumConsensusExplorerRangeData.evpMid) &&
        Objects.equals(this.submissionEvidencePrice, titaniumConsensusExplorerRangeData.submissionEvidencePrice) &&
        Objects.equals(this.submissionMean, titaniumConsensusExplorerRangeData.submissionMean) &&
        Objects.equals(this.submissionPoint, titaniumConsensusExplorerRangeData.submissionPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorPoint, bimodalLeftMean, bimodalRightMean, chartRanges, cohortConsensusPrice, cohortConsensusRangeTabData, evpMid, submissionEvidencePrice, submissionMean, submissionPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusExplorerRangeData {\n");
    sb.append("    anchorPoint: ").append(toIndentedString(anchorPoint)).append("\n");
    sb.append("    bimodalLeftMean: ").append(toIndentedString(bimodalLeftMean)).append("\n");
    sb.append("    bimodalRightMean: ").append(toIndentedString(bimodalRightMean)).append("\n");
    sb.append("    chartRanges: ").append(toIndentedString(chartRanges)).append("\n");
    sb.append("    cohortConsensusPrice: ").append(toIndentedString(cohortConsensusPrice)).append("\n");
    sb.append("    cohortConsensusRangeTabData: ").append(toIndentedString(cohortConsensusRangeTabData)).append("\n");
    sb.append("    evpMid: ").append(toIndentedString(evpMid)).append("\n");
    sb.append("    submissionEvidencePrice: ").append(toIndentedString(submissionEvidencePrice)).append("\n");
    sb.append("    submissionMean: ").append(toIndentedString(submissionMean)).append("\n");
    sb.append("    submissionPoint: ").append(toIndentedString(submissionPoint)).append("\n");
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
    openapiFields.add("anchorPoint");
    openapiFields.add("bimodalLeftMean");
    openapiFields.add("bimodalRightMean");
    openapiFields.add("chartRanges");
    openapiFields.add("cohortConsensusPrice");
    openapiFields.add("cohortConsensusRangeTabData");
    openapiFields.add("evpMid");
    openapiFields.add("submissionEvidencePrice");
    openapiFields.add("submissionMean");
    openapiFields.add("submissionPoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusExplorerRangeData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusExplorerRangeData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusExplorerRangeData is not found in the empty JSON string", TitaniumConsensusExplorerRangeData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusExplorerRangeData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusExplorerRangeData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `anchorPoint`
      if (jsonObj.getAsJsonObject("anchorPoint") != null) {
        TitaniumRangePoint.validateJsonObject(jsonObj.getAsJsonObject("anchorPoint"));
      }
      // validate the optional field `bimodalLeftMean`
      if (jsonObj.getAsJsonObject("bimodalLeftMean") != null) {
        TitaniumRangePoint.validateJsonObject(jsonObj.getAsJsonObject("bimodalLeftMean"));
      }
      // validate the optional field `bimodalRightMean`
      if (jsonObj.getAsJsonObject("bimodalRightMean") != null) {
        TitaniumRangePoint.validateJsonObject(jsonObj.getAsJsonObject("bimodalRightMean"));
      }
      // validate the optional field `chartRanges`
      if (jsonObj.getAsJsonObject("chartRanges") != null) {
        TitaniumChartRanges.validateJsonObject(jsonObj.getAsJsonObject("chartRanges"));
      }
      // validate the optional field `cohortConsensusPrice`
      if (jsonObj.getAsJsonObject("cohortConsensusPrice") != null) {
        TitaniumRangePoint.validateJsonObject(jsonObj.getAsJsonObject("cohortConsensusPrice"));
      }
      // validate the optional field `cohortConsensusRangeTabData`
      if (jsonObj.getAsJsonObject("cohortConsensusRangeTabData") != null) {
        TitaniumCohortConsensusRangeTabData.validateJsonObject(jsonObj.getAsJsonObject("cohortConsensusRangeTabData"));
      }
      // validate the optional field `evpMid`
      if (jsonObj.getAsJsonObject("evpMid") != null) {
        TitaniumRangePoint.validateJsonObject(jsonObj.getAsJsonObject("evpMid"));
      }
      // validate the optional field `submissionEvidencePrice`
      if (jsonObj.getAsJsonObject("submissionEvidencePrice") != null) {
        TitaniumRangePoint.validateJsonObject(jsonObj.getAsJsonObject("submissionEvidencePrice"));
      }
      // validate the optional field `submissionMean`
      if (jsonObj.getAsJsonObject("submissionMean") != null) {
        TitaniumRangePoint.validateJsonObject(jsonObj.getAsJsonObject("submissionMean"));
      }
      // validate the optional field `submissionPoint`
      if (jsonObj.getAsJsonObject("submissionPoint") != null) {
        TitaniumRangePoint.validateJsonObject(jsonObj.getAsJsonObject("submissionPoint"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusExplorerRangeData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusExplorerRangeData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusExplorerRangeData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusExplorerRangeData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusExplorerRangeData>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusExplorerRangeData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusExplorerRangeData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusExplorerRangeData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusExplorerRangeData
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusExplorerRangeData
  */
  public static TitaniumConsensusExplorerRangeData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusExplorerRangeData.class);
  }

 /**
  * Convert an instance of TitaniumConsensusExplorerRangeData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

