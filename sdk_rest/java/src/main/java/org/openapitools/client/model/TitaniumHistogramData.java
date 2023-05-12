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
import org.openapitools.client.model.TitaniumConsensusHistogram;
import org.openapitools.client.model.TitaniumSubmissionHistogram;

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
 * TitaniumHistogramData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-12T16:18:26.451720Z[UTC]")
public class TitaniumHistogramData {
  public static final String SERIALIZED_NAME_CONSENSUS_HISTOGRAM = "consensusHistogram";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_HISTOGRAM)
  private TitaniumConsensusHistogram consensusHistogram;

  public static final String SERIALIZED_NAME_SUBMISSION_HISTOGRAM = "submissionHistogram";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_HISTOGRAM)
  private TitaniumSubmissionHistogram submissionHistogram;

  public TitaniumHistogramData() { 
  }

  public TitaniumHistogramData consensusHistogram(TitaniumConsensusHistogram consensusHistogram) {
    
    this.consensusHistogram = consensusHistogram;
    return this;
  }

   /**
   * Get consensusHistogram
   * @return consensusHistogram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumConsensusHistogram getConsensusHistogram() {
    return consensusHistogram;
  }


  public void setConsensusHistogram(TitaniumConsensusHistogram consensusHistogram) {
    this.consensusHistogram = consensusHistogram;
  }


  public TitaniumHistogramData submissionHistogram(TitaniumSubmissionHistogram submissionHistogram) {
    
    this.submissionHistogram = submissionHistogram;
    return this;
  }

   /**
   * Get submissionHistogram
   * @return submissionHistogram
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumSubmissionHistogram getSubmissionHistogram() {
    return submissionHistogram;
  }


  public void setSubmissionHistogram(TitaniumSubmissionHistogram submissionHistogram) {
    this.submissionHistogram = submissionHistogram;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumHistogramData titaniumHistogramData = (TitaniumHistogramData) o;
    return Objects.equals(this.consensusHistogram, titaniumHistogramData.consensusHistogram) &&
        Objects.equals(this.submissionHistogram, titaniumHistogramData.submissionHistogram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consensusHistogram, submissionHistogram);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumHistogramData {\n");
    sb.append("    consensusHistogram: ").append(toIndentedString(consensusHistogram)).append("\n");
    sb.append("    submissionHistogram: ").append(toIndentedString(submissionHistogram)).append("\n");
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
    openapiFields.add("consensusHistogram");
    openapiFields.add("submissionHistogram");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumHistogramData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumHistogramData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumHistogramData is not found in the empty JSON string", TitaniumHistogramData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumHistogramData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumHistogramData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `consensusHistogram`
      if (jsonObj.getAsJsonObject("consensusHistogram") != null) {
        TitaniumConsensusHistogram.validateJsonObject(jsonObj.getAsJsonObject("consensusHistogram"));
      }
      // validate the optional field `submissionHistogram`
      if (jsonObj.getAsJsonObject("submissionHistogram") != null) {
        TitaniumSubmissionHistogram.validateJsonObject(jsonObj.getAsJsonObject("submissionHistogram"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumHistogramData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumHistogramData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumHistogramData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumHistogramData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumHistogramData>() {
           @Override
           public void write(JsonWriter out, TitaniumHistogramData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumHistogramData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumHistogramData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumHistogramData
  * @throws IOException if the JSON string is invalid with respect to TitaniumHistogramData
  */
  public static TitaniumHistogramData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumHistogramData.class);
  }

 /**
  * Convert an instance of TitaniumHistogramData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
