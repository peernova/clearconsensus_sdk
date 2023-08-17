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
import org.openapitools.client.model.TitaniumAvailableTrades;
import org.openapitools.client.model.TitaniumCohortConsensusColumn;
import org.openapitools.client.model.TitaniumEvidentalPricing;
import org.openapitools.client.model.TitaniumSubmissionEvidenceTableColumn;
import org.openapitools.client.model.TitaniumSubmissionExplorerTableColumn;
import org.openapitools.client.model.TitaniumSubmissionStatisticsExplorerTableColumn;

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
 * TitaniumComparisonTable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T22:57:04.952222Z[UTC]")
public class TitaniumComparisonTable {
  public static final String SERIALIZED_NAME_AVAILABLE_TRADES = "availableTrades";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_TRADES)
  private TitaniumAvailableTrades availableTrades;

  public static final String SERIALIZED_NAME_COHORT_CONSENSUS_COLUMN = "cohortConsensusColumn";
  @SerializedName(SERIALIZED_NAME_COHORT_CONSENSUS_COLUMN)
  private TitaniumCohortConsensusColumn cohortConsensusColumn;

  public static final String SERIALIZED_NAME_EVIDENTIAL_PRICING = "evidentialPricing";
  @SerializedName(SERIALIZED_NAME_EVIDENTIAL_PRICING)
  private TitaniumEvidentalPricing evidentialPricing;

  public static final String SERIALIZED_NAME_SUBMISSION = "submission";
  @SerializedName(SERIALIZED_NAME_SUBMISSION)
  private TitaniumSubmissionExplorerTableColumn submission;

  public static final String SERIALIZED_NAME_SUBMISSION_EVIDENCE = "submissionEvidence";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_EVIDENCE)
  private TitaniumSubmissionEvidenceTableColumn submissionEvidence;

  public static final String SERIALIZED_NAME_SUBMISSION_STATISTICS = "submissionStatistics";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_STATISTICS)
  private TitaniumSubmissionStatisticsExplorerTableColumn submissionStatistics;

  public TitaniumComparisonTable() { 
  }

  public TitaniumComparisonTable availableTrades(TitaniumAvailableTrades availableTrades) {
    
    this.availableTrades = availableTrades;
    return this;
  }

   /**
   * Get availableTrades
   * @return availableTrades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumAvailableTrades getAvailableTrades() {
    return availableTrades;
  }


  public void setAvailableTrades(TitaniumAvailableTrades availableTrades) {
    this.availableTrades = availableTrades;
  }


  public TitaniumComparisonTable cohortConsensusColumn(TitaniumCohortConsensusColumn cohortConsensusColumn) {
    
    this.cohortConsensusColumn = cohortConsensusColumn;
    return this;
  }

   /**
   * Get cohortConsensusColumn
   * @return cohortConsensusColumn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumCohortConsensusColumn getCohortConsensusColumn() {
    return cohortConsensusColumn;
  }


  public void setCohortConsensusColumn(TitaniumCohortConsensusColumn cohortConsensusColumn) {
    this.cohortConsensusColumn = cohortConsensusColumn;
  }


  public TitaniumComparisonTable evidentialPricing(TitaniumEvidentalPricing evidentialPricing) {
    
    this.evidentialPricing = evidentialPricing;
    return this;
  }

   /**
   * Get evidentialPricing
   * @return evidentialPricing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumEvidentalPricing getEvidentialPricing() {
    return evidentialPricing;
  }


  public void setEvidentialPricing(TitaniumEvidentalPricing evidentialPricing) {
    this.evidentialPricing = evidentialPricing;
  }


  public TitaniumComparisonTable submission(TitaniumSubmissionExplorerTableColumn submission) {
    
    this.submission = submission;
    return this;
  }

   /**
   * Get submission
   * @return submission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumSubmissionExplorerTableColumn getSubmission() {
    return submission;
  }


  public void setSubmission(TitaniumSubmissionExplorerTableColumn submission) {
    this.submission = submission;
  }


  public TitaniumComparisonTable submissionEvidence(TitaniumSubmissionEvidenceTableColumn submissionEvidence) {
    
    this.submissionEvidence = submissionEvidence;
    return this;
  }

   /**
   * Get submissionEvidence
   * @return submissionEvidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumSubmissionEvidenceTableColumn getSubmissionEvidence() {
    return submissionEvidence;
  }


  public void setSubmissionEvidence(TitaniumSubmissionEvidenceTableColumn submissionEvidence) {
    this.submissionEvidence = submissionEvidence;
  }


  public TitaniumComparisonTable submissionStatistics(TitaniumSubmissionStatisticsExplorerTableColumn submissionStatistics) {
    
    this.submissionStatistics = submissionStatistics;
    return this;
  }

   /**
   * Get submissionStatistics
   * @return submissionStatistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumSubmissionStatisticsExplorerTableColumn getSubmissionStatistics() {
    return submissionStatistics;
  }


  public void setSubmissionStatistics(TitaniumSubmissionStatisticsExplorerTableColumn submissionStatistics) {
    this.submissionStatistics = submissionStatistics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumComparisonTable titaniumComparisonTable = (TitaniumComparisonTable) o;
    return Objects.equals(this.availableTrades, titaniumComparisonTable.availableTrades) &&
        Objects.equals(this.cohortConsensusColumn, titaniumComparisonTable.cohortConsensusColumn) &&
        Objects.equals(this.evidentialPricing, titaniumComparisonTable.evidentialPricing) &&
        Objects.equals(this.submission, titaniumComparisonTable.submission) &&
        Objects.equals(this.submissionEvidence, titaniumComparisonTable.submissionEvidence) &&
        Objects.equals(this.submissionStatistics, titaniumComparisonTable.submissionStatistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableTrades, cohortConsensusColumn, evidentialPricing, submission, submissionEvidence, submissionStatistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumComparisonTable {\n");
    sb.append("    availableTrades: ").append(toIndentedString(availableTrades)).append("\n");
    sb.append("    cohortConsensusColumn: ").append(toIndentedString(cohortConsensusColumn)).append("\n");
    sb.append("    evidentialPricing: ").append(toIndentedString(evidentialPricing)).append("\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    submissionEvidence: ").append(toIndentedString(submissionEvidence)).append("\n");
    sb.append("    submissionStatistics: ").append(toIndentedString(submissionStatistics)).append("\n");
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
    openapiFields.add("availableTrades");
    openapiFields.add("cohortConsensusColumn");
    openapiFields.add("evidentialPricing");
    openapiFields.add("submission");
    openapiFields.add("submissionEvidence");
    openapiFields.add("submissionStatistics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumComparisonTable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumComparisonTable.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumComparisonTable is not found in the empty JSON string", TitaniumComparisonTable.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumComparisonTable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumComparisonTable` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `availableTrades`
      if (jsonObj.getAsJsonObject("availableTrades") != null) {
        TitaniumAvailableTrades.validateJsonObject(jsonObj.getAsJsonObject("availableTrades"));
      }
      // validate the optional field `cohortConsensusColumn`
      if (jsonObj.getAsJsonObject("cohortConsensusColumn") != null) {
        TitaniumCohortConsensusColumn.validateJsonObject(jsonObj.getAsJsonObject("cohortConsensusColumn"));
      }
      // validate the optional field `evidentialPricing`
      if (jsonObj.getAsJsonObject("evidentialPricing") != null) {
        TitaniumEvidentalPricing.validateJsonObject(jsonObj.getAsJsonObject("evidentialPricing"));
      }
      // validate the optional field `submission`
      if (jsonObj.getAsJsonObject("submission") != null) {
        TitaniumSubmissionExplorerTableColumn.validateJsonObject(jsonObj.getAsJsonObject("submission"));
      }
      // validate the optional field `submissionEvidence`
      if (jsonObj.getAsJsonObject("submissionEvidence") != null) {
        TitaniumSubmissionEvidenceTableColumn.validateJsonObject(jsonObj.getAsJsonObject("submissionEvidence"));
      }
      // validate the optional field `submissionStatistics`
      if (jsonObj.getAsJsonObject("submissionStatistics") != null) {
        TitaniumSubmissionStatisticsExplorerTableColumn.validateJsonObject(jsonObj.getAsJsonObject("submissionStatistics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumComparisonTable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumComparisonTable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumComparisonTable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumComparisonTable.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumComparisonTable>() {
           @Override
           public void write(JsonWriter out, TitaniumComparisonTable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumComparisonTable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumComparisonTable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumComparisonTable
  * @throws IOException if the JSON string is invalid with respect to TitaniumComparisonTable
  */
  public static TitaniumComparisonTable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumComparisonTable.class);
  }

 /**
  * Convert an instance of TitaniumComparisonTable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

