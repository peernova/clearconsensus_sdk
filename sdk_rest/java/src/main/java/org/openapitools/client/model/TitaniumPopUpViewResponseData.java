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
import org.openapitools.client.model.TitaniumConsensusDetail;
import org.openapitools.client.model.TitaniumDataQualityErrors;
import org.openapitools.client.model.TitaniumStringKeyVal;
import org.openapitools.client.model.TitaniumViewRow;

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
 * TitaniumPopUpViewResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumPopUpViewResponseData {
  public static final String SERIALIZED_NAME_BENCHMARK = "benchmark";
  @SerializedName(SERIALIZED_NAME_BENCHMARK)
  private String benchmark;

  public static final String SERIALIZED_NAME_CONSENSUS = "consensus";
  @SerializedName(SERIALIZED_NAME_CONSENSUS)
  private TitaniumViewRow consensus;

  public static final String SERIALIZED_NAME_CONSENSUS_DETAILS = "consensusDetails";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_DETAILS)
  private TitaniumConsensusDetail consensusDetails;

  public static final String SERIALIZED_NAME_DATA_QUALITY_ERRORS = "dataQualityErrors";
  @SerializedName(SERIALIZED_NAME_DATA_QUALITY_ERRORS)
  private TitaniumDataQualityErrors dataQualityErrors;

  public static final String SERIALIZED_NAME_EVALUATED_PRICE = "evaluatedPrice";
  @SerializedName(SERIALIZED_NAME_EVALUATED_PRICE)
  private TitaniumViewRow evaluatedPrice;

  public static final String SERIALIZED_NAME_GROUPING_KEYS = "groupingKeys";
  @SerializedName(SERIALIZED_NAME_GROUPING_KEYS)
  private List<TitaniumStringKeyVal> groupingKeys = null;

  public static final String SERIALIZED_NAME_OUTLIER = "outlier";
  @SerializedName(SERIALIZED_NAME_OUTLIER)
  private String outlier;

  public static final String SERIALIZED_NAME_RANGES_CHART = "rangesChart";
  @SerializedName(SERIALIZED_NAME_RANGES_CHART)
  private String rangesChart;

  public static final String SERIALIZED_NAME_SUBMISSION = "submission";
  @SerializedName(SERIALIZED_NAME_SUBMISSION)
  private TitaniumViewRow submission;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private String validationErrors;

  public TitaniumPopUpViewResponseData() { 
  }

  public TitaniumPopUpViewResponseData benchmark(String benchmark) {
    
    this.benchmark = benchmark;
    return this;
  }

   /**
   * Get benchmark
   * @return benchmark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBenchmark() {
    return benchmark;
  }


  public void setBenchmark(String benchmark) {
    this.benchmark = benchmark;
  }


  public TitaniumPopUpViewResponseData consensus(TitaniumViewRow consensus) {
    
    this.consensus = consensus;
    return this;
  }

   /**
   * Get consensus
   * @return consensus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumViewRow getConsensus() {
    return consensus;
  }


  public void setConsensus(TitaniumViewRow consensus) {
    this.consensus = consensus;
  }


  public TitaniumPopUpViewResponseData consensusDetails(TitaniumConsensusDetail consensusDetails) {
    
    this.consensusDetails = consensusDetails;
    return this;
  }

   /**
   * Get consensusDetails
   * @return consensusDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumConsensusDetail getConsensusDetails() {
    return consensusDetails;
  }


  public void setConsensusDetails(TitaniumConsensusDetail consensusDetails) {
    this.consensusDetails = consensusDetails;
  }


  public TitaniumPopUpViewResponseData dataQualityErrors(TitaniumDataQualityErrors dataQualityErrors) {
    
    this.dataQualityErrors = dataQualityErrors;
    return this;
  }

   /**
   * Get dataQualityErrors
   * @return dataQualityErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumDataQualityErrors getDataQualityErrors() {
    return dataQualityErrors;
  }


  public void setDataQualityErrors(TitaniumDataQualityErrors dataQualityErrors) {
    this.dataQualityErrors = dataQualityErrors;
  }


  public TitaniumPopUpViewResponseData evaluatedPrice(TitaniumViewRow evaluatedPrice) {
    
    this.evaluatedPrice = evaluatedPrice;
    return this;
  }

   /**
   * Get evaluatedPrice
   * @return evaluatedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumViewRow getEvaluatedPrice() {
    return evaluatedPrice;
  }


  public void setEvaluatedPrice(TitaniumViewRow evaluatedPrice) {
    this.evaluatedPrice = evaluatedPrice;
  }


  public TitaniumPopUpViewResponseData groupingKeys(List<TitaniumStringKeyVal> groupingKeys) {
    
    this.groupingKeys = groupingKeys;
    return this;
  }

  public TitaniumPopUpViewResponseData addGroupingKeysItem(TitaniumStringKeyVal groupingKeysItem) {
    if (this.groupingKeys == null) {
      this.groupingKeys = new ArrayList<>();
    }
    this.groupingKeys.add(groupingKeysItem);
    return this;
  }

   /**
   * Get groupingKeys
   * @return groupingKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumStringKeyVal> getGroupingKeys() {
    return groupingKeys;
  }


  public void setGroupingKeys(List<TitaniumStringKeyVal> groupingKeys) {
    this.groupingKeys = groupingKeys;
  }


  public TitaniumPopUpViewResponseData outlier(String outlier) {
    
    this.outlier = outlier;
    return this;
  }

   /**
   * Get outlier
   * @return outlier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutlier() {
    return outlier;
  }


  public void setOutlier(String outlier) {
    this.outlier = outlier;
  }


  public TitaniumPopUpViewResponseData rangesChart(String rangesChart) {
    
    this.rangesChart = rangesChart;
    return this;
  }

   /**
   * Get rangesChart
   * @return rangesChart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRangesChart() {
    return rangesChart;
  }


  public void setRangesChart(String rangesChart) {
    this.rangesChart = rangesChart;
  }


  public TitaniumPopUpViewResponseData submission(TitaniumViewRow submission) {
    
    this.submission = submission;
    return this;
  }

   /**
   * Get submission
   * @return submission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumViewRow getSubmission() {
    return submission;
  }


  public void setSubmission(TitaniumViewRow submission) {
    this.submission = submission;
  }


  public TitaniumPopUpViewResponseData validationErrors(String validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(String validationErrors) {
    this.validationErrors = validationErrors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumPopUpViewResponseData titaniumPopUpViewResponseData = (TitaniumPopUpViewResponseData) o;
    return Objects.equals(this.benchmark, titaniumPopUpViewResponseData.benchmark) &&
        Objects.equals(this.consensus, titaniumPopUpViewResponseData.consensus) &&
        Objects.equals(this.consensusDetails, titaniumPopUpViewResponseData.consensusDetails) &&
        Objects.equals(this.dataQualityErrors, titaniumPopUpViewResponseData.dataQualityErrors) &&
        Objects.equals(this.evaluatedPrice, titaniumPopUpViewResponseData.evaluatedPrice) &&
        Objects.equals(this.groupingKeys, titaniumPopUpViewResponseData.groupingKeys) &&
        Objects.equals(this.outlier, titaniumPopUpViewResponseData.outlier) &&
        Objects.equals(this.rangesChart, titaniumPopUpViewResponseData.rangesChart) &&
        Objects.equals(this.submission, titaniumPopUpViewResponseData.submission) &&
        Objects.equals(this.validationErrors, titaniumPopUpViewResponseData.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benchmark, consensus, consensusDetails, dataQualityErrors, evaluatedPrice, groupingKeys, outlier, rangesChart, submission, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumPopUpViewResponseData {\n");
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
    sb.append("    consensus: ").append(toIndentedString(consensus)).append("\n");
    sb.append("    consensusDetails: ").append(toIndentedString(consensusDetails)).append("\n");
    sb.append("    dataQualityErrors: ").append(toIndentedString(dataQualityErrors)).append("\n");
    sb.append("    evaluatedPrice: ").append(toIndentedString(evaluatedPrice)).append("\n");
    sb.append("    groupingKeys: ").append(toIndentedString(groupingKeys)).append("\n");
    sb.append("    outlier: ").append(toIndentedString(outlier)).append("\n");
    sb.append("    rangesChart: ").append(toIndentedString(rangesChart)).append("\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
    openapiFields.add("benchmark");
    openapiFields.add("consensus");
    openapiFields.add("consensusDetails");
    openapiFields.add("dataQualityErrors");
    openapiFields.add("evaluatedPrice");
    openapiFields.add("groupingKeys");
    openapiFields.add("outlier");
    openapiFields.add("rangesChart");
    openapiFields.add("submission");
    openapiFields.add("validationErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumPopUpViewResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumPopUpViewResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumPopUpViewResponseData is not found in the empty JSON string", TitaniumPopUpViewResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumPopUpViewResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumPopUpViewResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("benchmark") != null && !jsonObj.get("benchmark").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benchmark` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benchmark").toString()));
      }
      // validate the optional field `consensus`
      if (jsonObj.getAsJsonObject("consensus") != null) {
        TitaniumViewRow.validateJsonObject(jsonObj.getAsJsonObject("consensus"));
      }
      // validate the optional field `consensusDetails`
      if (jsonObj.getAsJsonObject("consensusDetails") != null) {
        TitaniumConsensusDetail.validateJsonObject(jsonObj.getAsJsonObject("consensusDetails"));
      }
      // validate the optional field `dataQualityErrors`
      if (jsonObj.getAsJsonObject("dataQualityErrors") != null) {
        TitaniumDataQualityErrors.validateJsonObject(jsonObj.getAsJsonObject("dataQualityErrors"));
      }
      // validate the optional field `evaluatedPrice`
      if (jsonObj.getAsJsonObject("evaluatedPrice") != null) {
        TitaniumViewRow.validateJsonObject(jsonObj.getAsJsonObject("evaluatedPrice"));
      }
      JsonArray jsonArraygroupingKeys = jsonObj.getAsJsonArray("groupingKeys");
      if (jsonArraygroupingKeys != null) {
        // ensure the json data is an array
        if (!jsonObj.get("groupingKeys").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `groupingKeys` to be an array in the JSON string but got `%s`", jsonObj.get("groupingKeys").toString()));
        }

        // validate the optional field `groupingKeys` (array)
        for (int i = 0; i < jsonArraygroupingKeys.size(); i++) {
          TitaniumStringKeyVal.validateJsonObject(jsonArraygroupingKeys.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("outlier") != null && !jsonObj.get("outlier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outlier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outlier").toString()));
      }
      if (jsonObj.get("rangesChart") != null && !jsonObj.get("rangesChart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rangesChart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rangesChart").toString()));
      }
      // validate the optional field `submission`
      if (jsonObj.getAsJsonObject("submission") != null) {
        TitaniumViewRow.validateJsonObject(jsonObj.getAsJsonObject("submission"));
      }
      if (jsonObj.get("validationErrors") != null && !jsonObj.get("validationErrors").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationErrors` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationErrors").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumPopUpViewResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumPopUpViewResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumPopUpViewResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumPopUpViewResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumPopUpViewResponseData>() {
           @Override
           public void write(JsonWriter out, TitaniumPopUpViewResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumPopUpViewResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumPopUpViewResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumPopUpViewResponseData
  * @throws IOException if the JSON string is invalid with respect to TitaniumPopUpViewResponseData
  */
  public static TitaniumPopUpViewResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumPopUpViewResponseData.class);
  }

 /**
  * Convert an instance of TitaniumPopUpViewResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

