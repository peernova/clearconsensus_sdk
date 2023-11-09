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
 * GetChallengeDetailsResponseCommonChallengeData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:32:53.124361Z[UTC]")
public class GetChallengeDetailsResponseCommonChallengeData {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_EVIDENCE_TYPE = "evidenceType";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_TYPE)
  private String evidenceType;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public GetChallengeDetailsResponseCommonChallengeData() { 
  }

  public GetChallengeDetailsResponseCommonChallengeData date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public GetChallengeDetailsResponseCommonChallengeData evidenceType(String evidenceType) {
    
    this.evidenceType = evidenceType;
    return this;
  }

   /**
   * Get evidenceType
   * @return evidenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEvidenceType() {
    return evidenceType;
  }


  public void setEvidenceType(String evidenceType) {
    this.evidenceType = evidenceType;
  }


  public GetChallengeDetailsResponseCommonChallengeData time(String time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTime() {
    return time;
  }


  public void setTime(String time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChallengeDetailsResponseCommonChallengeData getChallengeDetailsResponseCommonChallengeData = (GetChallengeDetailsResponseCommonChallengeData) o;
    return Objects.equals(this.date, getChallengeDetailsResponseCommonChallengeData.date) &&
        Objects.equals(this.evidenceType, getChallengeDetailsResponseCommonChallengeData.evidenceType) &&
        Objects.equals(this.time, getChallengeDetailsResponseCommonChallengeData.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, evidenceType, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChallengeDetailsResponseCommonChallengeData {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    evidenceType: ").append(toIndentedString(evidenceType)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("evidenceType");
    openapiFields.add("time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetChallengeDetailsResponseCommonChallengeData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetChallengeDetailsResponseCommonChallengeData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetChallengeDetailsResponseCommonChallengeData is not found in the empty JSON string", GetChallengeDetailsResponseCommonChallengeData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetChallengeDetailsResponseCommonChallengeData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetChallengeDetailsResponseCommonChallengeData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("date") != null && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if (jsonObj.get("evidenceType") != null && !jsonObj.get("evidenceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `evidenceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("evidenceType").toString()));
      }
      if (jsonObj.get("time") != null && !jsonObj.get("time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetChallengeDetailsResponseCommonChallengeData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetChallengeDetailsResponseCommonChallengeData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetChallengeDetailsResponseCommonChallengeData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetChallengeDetailsResponseCommonChallengeData.class));

       return (TypeAdapter<T>) new TypeAdapter<GetChallengeDetailsResponseCommonChallengeData>() {
           @Override
           public void write(JsonWriter out, GetChallengeDetailsResponseCommonChallengeData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetChallengeDetailsResponseCommonChallengeData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetChallengeDetailsResponseCommonChallengeData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetChallengeDetailsResponseCommonChallengeData
  * @throws IOException if the JSON string is invalid with respect to GetChallengeDetailsResponseCommonChallengeData
  */
  public static GetChallengeDetailsResponseCommonChallengeData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetChallengeDetailsResponseCommonChallengeData.class);
  }

 /**
  * Convert an instance of GetChallengeDetailsResponseCommonChallengeData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

