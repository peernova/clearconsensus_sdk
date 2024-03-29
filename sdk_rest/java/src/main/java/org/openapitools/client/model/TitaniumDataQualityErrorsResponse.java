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
import org.openapitools.client.model.TitaniumSeverityToDataQuality;
import org.openapitools.client.model.TitaniumSubmittedData;

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
 * TitaniumDataQualityErrorsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumDataQualityErrorsResponse {
  public static final String SERIALIZED_NAME_DATA_QUALITY_ERRORS = "dataQualityErrors";
  @SerializedName(SERIALIZED_NAME_DATA_QUALITY_ERRORS)
  private TitaniumSeverityToDataQuality dataQualityErrors;

  public static final String SERIALIZED_NAME_SUBMITTED_DATA = "submittedData";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DATA)
  private List<TitaniumSubmittedData> submittedData = null;

  public static final String SERIALIZED_NAME_TOTAL_ROWS = "totalRows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  private Integer totalRows;

  public TitaniumDataQualityErrorsResponse() { 
  }

  public TitaniumDataQualityErrorsResponse dataQualityErrors(TitaniumSeverityToDataQuality dataQualityErrors) {
    
    this.dataQualityErrors = dataQualityErrors;
    return this;
  }

   /**
   * Get dataQualityErrors
   * @return dataQualityErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumSeverityToDataQuality getDataQualityErrors() {
    return dataQualityErrors;
  }


  public void setDataQualityErrors(TitaniumSeverityToDataQuality dataQualityErrors) {
    this.dataQualityErrors = dataQualityErrors;
  }


  public TitaniumDataQualityErrorsResponse submittedData(List<TitaniumSubmittedData> submittedData) {
    
    this.submittedData = submittedData;
    return this;
  }

  public TitaniumDataQualityErrorsResponse addSubmittedDataItem(TitaniumSubmittedData submittedDataItem) {
    if (this.submittedData == null) {
      this.submittedData = new ArrayList<>();
    }
    this.submittedData.add(submittedDataItem);
    return this;
  }

   /**
   * Get submittedData
   * @return submittedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumSubmittedData> getSubmittedData() {
    return submittedData;
  }


  public void setSubmittedData(List<TitaniumSubmittedData> submittedData) {
    this.submittedData = submittedData;
  }


  public TitaniumDataQualityErrorsResponse totalRows(Integer totalRows) {
    
    this.totalRows = totalRows;
    return this;
  }

   /**
   * Get totalRows
   * @return totalRows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalRows() {
    return totalRows;
  }


  public void setTotalRows(Integer totalRows) {
    this.totalRows = totalRows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumDataQualityErrorsResponse titaniumDataQualityErrorsResponse = (TitaniumDataQualityErrorsResponse) o;
    return Objects.equals(this.dataQualityErrors, titaniumDataQualityErrorsResponse.dataQualityErrors) &&
        Objects.equals(this.submittedData, titaniumDataQualityErrorsResponse.submittedData) &&
        Objects.equals(this.totalRows, titaniumDataQualityErrorsResponse.totalRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataQualityErrors, submittedData, totalRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumDataQualityErrorsResponse {\n");
    sb.append("    dataQualityErrors: ").append(toIndentedString(dataQualityErrors)).append("\n");
    sb.append("    submittedData: ").append(toIndentedString(submittedData)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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
    openapiFields.add("dataQualityErrors");
    openapiFields.add("submittedData");
    openapiFields.add("totalRows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumDataQualityErrorsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumDataQualityErrorsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumDataQualityErrorsResponse is not found in the empty JSON string", TitaniumDataQualityErrorsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumDataQualityErrorsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumDataQualityErrorsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `dataQualityErrors`
      if (jsonObj.getAsJsonObject("dataQualityErrors") != null) {
        TitaniumSeverityToDataQuality.validateJsonObject(jsonObj.getAsJsonObject("dataQualityErrors"));
      }
      JsonArray jsonArraysubmittedData = jsonObj.getAsJsonArray("submittedData");
      if (jsonArraysubmittedData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("submittedData").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `submittedData` to be an array in the JSON string but got `%s`", jsonObj.get("submittedData").toString()));
        }

        // validate the optional field `submittedData` (array)
        for (int i = 0; i < jsonArraysubmittedData.size(); i++) {
          TitaniumSubmittedData.validateJsonObject(jsonArraysubmittedData.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumDataQualityErrorsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumDataQualityErrorsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumDataQualityErrorsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumDataQualityErrorsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumDataQualityErrorsResponse>() {
           @Override
           public void write(JsonWriter out, TitaniumDataQualityErrorsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumDataQualityErrorsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumDataQualityErrorsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumDataQualityErrorsResponse
  * @throws IOException if the JSON string is invalid with respect to TitaniumDataQualityErrorsResponse
  */
  public static TitaniumDataQualityErrorsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumDataQualityErrorsResponse.class);
  }

 /**
  * Convert an instance of TitaniumDataQualityErrorsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

