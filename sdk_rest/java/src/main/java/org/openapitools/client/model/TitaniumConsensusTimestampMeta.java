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
 * TitaniumConsensusTimestampMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumConsensusTimestampMeta {
  public static final String SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP = "consensusRunTimestamp";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_RUN_TIMESTAMP)
  private String consensusRunTimestamp;

  public static final String SERIALIZED_NAME_SUBMITTED_DATES = "submittedDates";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DATES)
  private List<String> submittedDates = null;

  public TitaniumConsensusTimestampMeta() { 
  }

  public TitaniumConsensusTimestampMeta consensusRunTimestamp(String consensusRunTimestamp) {
    
    this.consensusRunTimestamp = consensusRunTimestamp;
    return this;
  }

   /**
   * Get consensusRunTimestamp
   * @return consensusRunTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsensusRunTimestamp() {
    return consensusRunTimestamp;
  }


  public void setConsensusRunTimestamp(String consensusRunTimestamp) {
    this.consensusRunTimestamp = consensusRunTimestamp;
  }


  public TitaniumConsensusTimestampMeta submittedDates(List<String> submittedDates) {
    
    this.submittedDates = submittedDates;
    return this;
  }

  public TitaniumConsensusTimestampMeta addSubmittedDatesItem(String submittedDatesItem) {
    if (this.submittedDates == null) {
      this.submittedDates = new ArrayList<>();
    }
    this.submittedDates.add(submittedDatesItem);
    return this;
  }

   /**
   * Get submittedDates
   * @return submittedDates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSubmittedDates() {
    return submittedDates;
  }


  public void setSubmittedDates(List<String> submittedDates) {
    this.submittedDates = submittedDates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusTimestampMeta titaniumConsensusTimestampMeta = (TitaniumConsensusTimestampMeta) o;
    return Objects.equals(this.consensusRunTimestamp, titaniumConsensusTimestampMeta.consensusRunTimestamp) &&
        Objects.equals(this.submittedDates, titaniumConsensusTimestampMeta.submittedDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consensusRunTimestamp, submittedDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusTimestampMeta {\n");
    sb.append("    consensusRunTimestamp: ").append(toIndentedString(consensusRunTimestamp)).append("\n");
    sb.append("    submittedDates: ").append(toIndentedString(submittedDates)).append("\n");
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
    openapiFields.add("consensusRunTimestamp");
    openapiFields.add("submittedDates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusTimestampMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusTimestampMeta.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusTimestampMeta is not found in the empty JSON string", TitaniumConsensusTimestampMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusTimestampMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusTimestampMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("consensusRunTimestamp") != null && !jsonObj.get("consensusRunTimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusRunTimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusRunTimestamp").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("submittedDates") != null && !jsonObj.get("submittedDates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedDates` to be an array in the JSON string but got `%s`", jsonObj.get("submittedDates").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusTimestampMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusTimestampMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusTimestampMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusTimestampMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusTimestampMeta>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusTimestampMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusTimestampMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusTimestampMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusTimestampMeta
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusTimestampMeta
  */
  public static TitaniumConsensusTimestampMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusTimestampMeta.class);
  }

 /**
  * Convert an instance of TitaniumConsensusTimestampMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

