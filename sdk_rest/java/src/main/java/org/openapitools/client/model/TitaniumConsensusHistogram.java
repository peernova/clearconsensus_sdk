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
 * TitaniumConsensusHistogram
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:07:31.560674Z[UTC]")
public class TitaniumConsensusHistogram {
  public static final String SERIALIZED_NAME_HIGH_SEVERITY = "highSeverity";
  @SerializedName(SERIALIZED_NAME_HIGH_SEVERITY)
  private TitaniumPredefinedFilter highSeverity;

  public static final String SERIALIZED_NAME_NO_CONSENSUS = "noConsensus";
  @SerializedName(SERIALIZED_NAME_NO_CONSENSUS)
  private TitaniumPredefinedFilter noConsensus;

  public static final String SERIALIZED_NAME_NON_OUTLIERS = "nonOutliers";
  @SerializedName(SERIALIZED_NAME_NON_OUTLIERS)
  private TitaniumPredefinedFilter nonOutliers;

  public static final String SERIALIZED_NAME_OUTLIERS = "outliers";
  @SerializedName(SERIALIZED_NAME_OUTLIERS)
  private TitaniumPredefinedFilter outliers;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private Integer rows;

  public static final String SERIALIZED_NAME_TOTAL_PARSE_ERRORS = "totalParseErrors";
  @SerializedName(SERIALIZED_NAME_TOTAL_PARSE_ERRORS)
  private Integer totalParseErrors;

  public TitaniumConsensusHistogram() { 
  }

  public TitaniumConsensusHistogram highSeverity(TitaniumPredefinedFilter highSeverity) {
    
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


  public TitaniumConsensusHistogram noConsensus(TitaniumPredefinedFilter noConsensus) {
    
    this.noConsensus = noConsensus;
    return this;
  }

   /**
   * Get noConsensus
   * @return noConsensus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumPredefinedFilter getNoConsensus() {
    return noConsensus;
  }


  public void setNoConsensus(TitaniumPredefinedFilter noConsensus) {
    this.noConsensus = noConsensus;
  }


  public TitaniumConsensusHistogram nonOutliers(TitaniumPredefinedFilter nonOutliers) {
    
    this.nonOutliers = nonOutliers;
    return this;
  }

   /**
   * Get nonOutliers
   * @return nonOutliers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumPredefinedFilter getNonOutliers() {
    return nonOutliers;
  }


  public void setNonOutliers(TitaniumPredefinedFilter nonOutliers) {
    this.nonOutliers = nonOutliers;
  }


  public TitaniumConsensusHistogram outliers(TitaniumPredefinedFilter outliers) {
    
    this.outliers = outliers;
    return this;
  }

   /**
   * Get outliers
   * @return outliers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumPredefinedFilter getOutliers() {
    return outliers;
  }


  public void setOutliers(TitaniumPredefinedFilter outliers) {
    this.outliers = outliers;
  }


  public TitaniumConsensusHistogram rows(Integer rows) {
    
    this.rows = rows;
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRows() {
    return rows;
  }


  public void setRows(Integer rows) {
    this.rows = rows;
  }


  public TitaniumConsensusHistogram totalParseErrors(Integer totalParseErrors) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusHistogram titaniumConsensusHistogram = (TitaniumConsensusHistogram) o;
    return Objects.equals(this.highSeverity, titaniumConsensusHistogram.highSeverity) &&
        Objects.equals(this.noConsensus, titaniumConsensusHistogram.noConsensus) &&
        Objects.equals(this.nonOutliers, titaniumConsensusHistogram.nonOutliers) &&
        Objects.equals(this.outliers, titaniumConsensusHistogram.outliers) &&
        Objects.equals(this.rows, titaniumConsensusHistogram.rows) &&
        Objects.equals(this.totalParseErrors, titaniumConsensusHistogram.totalParseErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highSeverity, noConsensus, nonOutliers, outliers, rows, totalParseErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusHistogram {\n");
    sb.append("    highSeverity: ").append(toIndentedString(highSeverity)).append("\n");
    sb.append("    noConsensus: ").append(toIndentedString(noConsensus)).append("\n");
    sb.append("    nonOutliers: ").append(toIndentedString(nonOutliers)).append("\n");
    sb.append("    outliers: ").append(toIndentedString(outliers)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    totalParseErrors: ").append(toIndentedString(totalParseErrors)).append("\n");
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
    openapiFields.add("noConsensus");
    openapiFields.add("nonOutliers");
    openapiFields.add("outliers");
    openapiFields.add("rows");
    openapiFields.add("totalParseErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusHistogram
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusHistogram.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusHistogram is not found in the empty JSON string", TitaniumConsensusHistogram.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusHistogram.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusHistogram` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `highSeverity`
      if (jsonObj.getAsJsonObject("highSeverity") != null) {
        TitaniumPredefinedFilter.validateJsonObject(jsonObj.getAsJsonObject("highSeverity"));
      }
      // validate the optional field `noConsensus`
      if (jsonObj.getAsJsonObject("noConsensus") != null) {
        TitaniumPredefinedFilter.validateJsonObject(jsonObj.getAsJsonObject("noConsensus"));
      }
      // validate the optional field `nonOutliers`
      if (jsonObj.getAsJsonObject("nonOutliers") != null) {
        TitaniumPredefinedFilter.validateJsonObject(jsonObj.getAsJsonObject("nonOutliers"));
      }
      // validate the optional field `outliers`
      if (jsonObj.getAsJsonObject("outliers") != null) {
        TitaniumPredefinedFilter.validateJsonObject(jsonObj.getAsJsonObject("outliers"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusHistogram.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusHistogram' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusHistogram> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusHistogram.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusHistogram>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusHistogram value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusHistogram read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusHistogram given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusHistogram
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusHistogram
  */
  public static TitaniumConsensusHistogram fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusHistogram.class);
  }

 /**
  * Convert an instance of TitaniumConsensusHistogram to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

