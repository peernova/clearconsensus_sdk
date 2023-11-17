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
 * TitaniumGetFileExportUrlRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:25:13.078291Z[UTC]")
public class TitaniumGetFileExportUrlRequest {
  public static final String SERIALIZED_NAME_EXPORT_TYPE = "exportType";
  @SerializedName(SERIALIZED_NAME_EXPORT_TYPE)
  private String exportType;

  public static final String SERIALIZED_NAME_SUBMITTED_DATE = "submittedDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_DATE)
  private String submittedDate;

  public static final String SERIALIZED_NAME_SUBMITTED_ID = "submittedId";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ID)
  private String submittedId;

  public TitaniumGetFileExportUrlRequest() { 
  }

  public TitaniumGetFileExportUrlRequest exportType(String exportType) {
    
    this.exportType = exportType;
    return this;
  }

   /**
   * Get exportType
   * @return exportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExportType() {
    return exportType;
  }


  public void setExportType(String exportType) {
    this.exportType = exportType;
  }


  public TitaniumGetFileExportUrlRequest submittedDate(String submittedDate) {
    
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


  public TitaniumGetFileExportUrlRequest submittedId(String submittedId) {
    
    this.submittedId = submittedId;
    return this;
  }

   /**
   * Get submittedId
   * @return submittedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubmittedId() {
    return submittedId;
  }


  public void setSubmittedId(String submittedId) {
    this.submittedId = submittedId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumGetFileExportUrlRequest titaniumGetFileExportUrlRequest = (TitaniumGetFileExportUrlRequest) o;
    return Objects.equals(this.exportType, titaniumGetFileExportUrlRequest.exportType) &&
        Objects.equals(this.submittedDate, titaniumGetFileExportUrlRequest.submittedDate) &&
        Objects.equals(this.submittedId, titaniumGetFileExportUrlRequest.submittedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportType, submittedDate, submittedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumGetFileExportUrlRequest {\n");
    sb.append("    exportType: ").append(toIndentedString(exportType)).append("\n");
    sb.append("    submittedDate: ").append(toIndentedString(submittedDate)).append("\n");
    sb.append("    submittedId: ").append(toIndentedString(submittedId)).append("\n");
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
    openapiFields.add("exportType");
    openapiFields.add("submittedDate");
    openapiFields.add("submittedId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumGetFileExportUrlRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumGetFileExportUrlRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumGetFileExportUrlRequest is not found in the empty JSON string", TitaniumGetFileExportUrlRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumGetFileExportUrlRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumGetFileExportUrlRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("exportType") != null && !jsonObj.get("exportType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exportType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exportType").toString()));
      }
      if (jsonObj.get("submittedDate") != null && !jsonObj.get("submittedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submittedDate").toString()));
      }
      if (jsonObj.get("submittedId") != null && !jsonObj.get("submittedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submittedId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumGetFileExportUrlRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumGetFileExportUrlRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumGetFileExportUrlRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumGetFileExportUrlRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumGetFileExportUrlRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumGetFileExportUrlRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumGetFileExportUrlRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumGetFileExportUrlRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumGetFileExportUrlRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumGetFileExportUrlRequest
  */
  public static TitaniumGetFileExportUrlRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumGetFileExportUrlRequest.class);
  }

 /**
  * Convert an instance of TitaniumGetFileExportUrlRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

