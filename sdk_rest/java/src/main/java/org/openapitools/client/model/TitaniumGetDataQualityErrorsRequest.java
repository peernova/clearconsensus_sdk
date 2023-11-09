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
import org.openapitools.client.model.TitaniumFilterPack;

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
 * TitaniumGetDataQualityErrorsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:32:53.124361Z[UTC]")
public class TitaniumGetDataQualityErrorsRequest {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_GROUP_KEYS = "groupKeys";
  @SerializedName(SERIALIZED_NAME_GROUP_KEYS)
  private TitaniumFilterPack groupKeys;

  public static final String SERIALIZED_NAME_SUBMISSION_ID = "submissionId";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ID)
  private String submissionId;

  public static final String SERIALIZED_NAME_SUBMITTED_DATE = "submittedDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DATE)
  private String submittedDate;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumGetDataQualityErrorsRequest() { 
  }

  public TitaniumGetDataQualityErrorsRequest assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public TitaniumGetDataQualityErrorsRequest groupKeys(TitaniumFilterPack groupKeys) {
    
    this.groupKeys = groupKeys;
    return this;
  }

   /**
   * Get groupKeys
   * @return groupKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumFilterPack getGroupKeys() {
    return groupKeys;
  }


  public void setGroupKeys(TitaniumFilterPack groupKeys) {
    this.groupKeys = groupKeys;
  }


  public TitaniumGetDataQualityErrorsRequest submissionId(String submissionId) {
    
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Get submissionId
   * @return submissionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubmissionId() {
    return submissionId;
  }


  public void setSubmissionId(String submissionId) {
    this.submissionId = submissionId;
  }


  public TitaniumGetDataQualityErrorsRequest submittedDate(String submittedDate) {
    
    this.submittedDate = submittedDate;
    return this;
  }

   /**
   * Get submittedDate
   * @return submittedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubmittedDate() {
    return submittedDate;
  }


  public void setSubmittedDate(String submittedDate) {
    this.submittedDate = submittedDate;
  }


  public TitaniumGetDataQualityErrorsRequest traceName(String traceName) {
    
    this.traceName = traceName;
    return this;
  }

   /**
   * Get traceName
   * @return traceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTraceName() {
    return traceName;
  }


  public void setTraceName(String traceName) {
    this.traceName = traceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumGetDataQualityErrorsRequest titaniumGetDataQualityErrorsRequest = (TitaniumGetDataQualityErrorsRequest) o;
    return Objects.equals(this.assetId, titaniumGetDataQualityErrorsRequest.assetId) &&
        Objects.equals(this.groupKeys, titaniumGetDataQualityErrorsRequest.groupKeys) &&
        Objects.equals(this.submissionId, titaniumGetDataQualityErrorsRequest.submissionId) &&
        Objects.equals(this.submittedDate, titaniumGetDataQualityErrorsRequest.submittedDate) &&
        Objects.equals(this.traceName, titaniumGetDataQualityErrorsRequest.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, groupKeys, submissionId, submittedDate, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumGetDataQualityErrorsRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    groupKeys: ").append(toIndentedString(groupKeys)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    traceName: ").append(toIndentedString(traceName)).append("\n");
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
    openapiFields.add("assetId");
    openapiFields.add("groupKeys");
    openapiFields.add("submissionId");
    openapiFields.add("submittedDate");
    openapiFields.add("traceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumGetDataQualityErrorsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumGetDataQualityErrorsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumGetDataQualityErrorsRequest is not found in the empty JSON string", TitaniumGetDataQualityErrorsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumGetDataQualityErrorsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumGetDataQualityErrorsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      // validate the optional field `groupKeys`
      if (jsonObj.getAsJsonObject("groupKeys") != null) {
        TitaniumFilterPack.validateJsonObject(jsonObj.getAsJsonObject("groupKeys"));
      }
      if (jsonObj.get("submissionId") != null && !jsonObj.get("submissionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submissionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submissionId").toString()));
      }
      if (jsonObj.get("submittedDate") != null && !jsonObj.get("submittedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submittedDate").toString()));
      }
      if (jsonObj.get("traceName") != null && !jsonObj.get("traceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumGetDataQualityErrorsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumGetDataQualityErrorsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumGetDataQualityErrorsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumGetDataQualityErrorsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumGetDataQualityErrorsRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumGetDataQualityErrorsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumGetDataQualityErrorsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumGetDataQualityErrorsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumGetDataQualityErrorsRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumGetDataQualityErrorsRequest
  */
  public static TitaniumGetDataQualityErrorsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumGetDataQualityErrorsRequest.class);
  }

 /**
  * Convert an instance of TitaniumGetDataQualityErrorsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

