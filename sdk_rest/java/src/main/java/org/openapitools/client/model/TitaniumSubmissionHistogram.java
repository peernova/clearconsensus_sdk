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
import org.openapitools.client.model.TitaniumPredefinedFilter;

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
 * TitaniumSubmissionHistogram
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-12T16:18:26.451720Z[UTC]")
public class TitaniumSubmissionHistogram {
  public static final String SERIALIZED_NAME_HIGH_SEVERITY = "highSeverity";
  @SerializedName(SERIALIZED_NAME_HIGH_SEVERITY)
  private TitaniumPredefinedFilter highSeverity;

  public static final String SERIALIZED_NAME_LOW_SEVERITY = "lowSeverity";
  @SerializedName(SERIALIZED_NAME_LOW_SEVERITY)
  private TitaniumPredefinedFilter lowSeverity;

  public static final String SERIALIZED_NAME_MEDIUM_SEVERITY = "mediumSeverity";
  @SerializedName(SERIALIZED_NAME_MEDIUM_SEVERITY)
  private TitaniumPredefinedFilter mediumSeverity;

  public static final String SERIALIZED_NAME_TOTAL_INVALID_ROWS = "totalInvalidRows";
  @SerializedName(SERIALIZED_NAME_TOTAL_INVALID_ROWS)
  private Integer totalInvalidRows;

  public static final String SERIALIZED_NAME_TOTAL_PARSE_ERRORS = "totalParseErrors";
  @SerializedName(SERIALIZED_NAME_TOTAL_PARSE_ERRORS)
  private Integer totalParseErrors;

  public static final String SERIALIZED_NAME_TOTAL_ROWS = "totalRows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  private Integer totalRows;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private TitaniumPredefinedFilter valid;

  public TitaniumSubmissionHistogram() { 
  }

  public TitaniumSubmissionHistogram highSeverity(TitaniumPredefinedFilter highSeverity) {
    
    this.highSeverity = highSeverity;
    return this;
  }

   /**
   * Get highSeverity
   * @return highSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumPredefinedFilter getHighSeverity() {
    return highSeverity;
  }


  public void setHighSeverity(TitaniumPredefinedFilter highSeverity) {
    this.highSeverity = highSeverity;
  }


  public TitaniumSubmissionHistogram lowSeverity(TitaniumPredefinedFilter lowSeverity) {
    
    this.lowSeverity = lowSeverity;
    return this;
  }

   /**
   * Get lowSeverity
   * @return lowSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumPredefinedFilter getLowSeverity() {
    return lowSeverity;
  }


  public void setLowSeverity(TitaniumPredefinedFilter lowSeverity) {
    this.lowSeverity = lowSeverity;
  }


  public TitaniumSubmissionHistogram mediumSeverity(TitaniumPredefinedFilter mediumSeverity) {
    
    this.mediumSeverity = mediumSeverity;
    return this;
  }

   /**
   * Get mediumSeverity
   * @return mediumSeverity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumPredefinedFilter getMediumSeverity() {
    return mediumSeverity;
  }


  public void setMediumSeverity(TitaniumPredefinedFilter mediumSeverity) {
    this.mediumSeverity = mediumSeverity;
  }


  public TitaniumSubmissionHistogram totalInvalidRows(Integer totalInvalidRows) {
    
    this.totalInvalidRows = totalInvalidRows;
    return this;
  }

   /**
   * Get totalInvalidRows
   * @return totalInvalidRows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalInvalidRows() {
    return totalInvalidRows;
  }


  public void setTotalInvalidRows(Integer totalInvalidRows) {
    this.totalInvalidRows = totalInvalidRows;
  }


  public TitaniumSubmissionHistogram totalParseErrors(Integer totalParseErrors) {
    
    this.totalParseErrors = totalParseErrors;
    return this;
  }

   /**
   * Get totalParseErrors
   * @return totalParseErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalParseErrors() {
    return totalParseErrors;
  }


  public void setTotalParseErrors(Integer totalParseErrors) {
    this.totalParseErrors = totalParseErrors;
  }


  public TitaniumSubmissionHistogram totalRows(Integer totalRows) {
    
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


  public TitaniumSubmissionHistogram valid(TitaniumPredefinedFilter valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumPredefinedFilter getValid() {
    return valid;
  }


  public void setValid(TitaniumPredefinedFilter valid) {
    this.valid = valid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumSubmissionHistogram titaniumSubmissionHistogram = (TitaniumSubmissionHistogram) o;
    return Objects.equals(this.highSeverity, titaniumSubmissionHistogram.highSeverity) &&
        Objects.equals(this.lowSeverity, titaniumSubmissionHistogram.lowSeverity) &&
        Objects.equals(this.mediumSeverity, titaniumSubmissionHistogram.mediumSeverity) &&
        Objects.equals(this.totalInvalidRows, titaniumSubmissionHistogram.totalInvalidRows) &&
        Objects.equals(this.totalParseErrors, titaniumSubmissionHistogram.totalParseErrors) &&
        Objects.equals(this.totalRows, titaniumSubmissionHistogram.totalRows) &&
        Objects.equals(this.valid, titaniumSubmissionHistogram.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highSeverity, lowSeverity, mediumSeverity, totalInvalidRows, totalParseErrors, totalRows, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumSubmissionHistogram {\n");
    sb.append("    highSeverity: ").append(toIndentedString(highSeverity)).append("\n");
    sb.append("    lowSeverity: ").append(toIndentedString(lowSeverity)).append("\n");
    sb.append("    mediumSeverity: ").append(toIndentedString(mediumSeverity)).append("\n");
    sb.append("    totalInvalidRows: ").append(toIndentedString(totalInvalidRows)).append("\n");
    sb.append("    totalParseErrors: ").append(toIndentedString(totalParseErrors)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
    openapiFields.add("highSeverity");
    openapiFields.add("lowSeverity");
    openapiFields.add("mediumSeverity");
    openapiFields.add("totalInvalidRows");
    openapiFields.add("totalParseErrors");
    openapiFields.add("totalRows");
    openapiFields.add("valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumSubmissionHistogram
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumSubmissionHistogram.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumSubmissionHistogram is not found in the empty JSON string", TitaniumSubmissionHistogram.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumSubmissionHistogram.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumSubmissionHistogram` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `highSeverity`
      if (jsonObj.getAsJsonObject("highSeverity") != null) {
        TitaniumPredefinedFilter.validateJsonObject(jsonObj.getAsJsonObject("highSeverity"));
      }
      // validate the optional field `lowSeverity`
      if (jsonObj.getAsJsonObject("lowSeverity") != null) {
        TitaniumPredefinedFilter.validateJsonObject(jsonObj.getAsJsonObject("lowSeverity"));
      }
      // validate the optional field `mediumSeverity`
      if (jsonObj.getAsJsonObject("mediumSeverity") != null) {
        TitaniumPredefinedFilter.validateJsonObject(jsonObj.getAsJsonObject("mediumSeverity"));
      }
      // validate the optional field `valid`
      if (jsonObj.getAsJsonObject("valid") != null) {
        TitaniumPredefinedFilter.validateJsonObject(jsonObj.getAsJsonObject("valid"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumSubmissionHistogram.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumSubmissionHistogram' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumSubmissionHistogram> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumSubmissionHistogram.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumSubmissionHistogram>() {
           @Override
           public void write(JsonWriter out, TitaniumSubmissionHistogram value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumSubmissionHistogram read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumSubmissionHistogram given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumSubmissionHistogram
  * @throws IOException if the JSON string is invalid with respect to TitaniumSubmissionHistogram
  */
  public static TitaniumSubmissionHistogram fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumSubmissionHistogram.class);
  }

 /**
  * Convert an instance of TitaniumSubmissionHistogram to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
