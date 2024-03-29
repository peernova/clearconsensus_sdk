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
 * TitaniumFileIdentifier
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumFileIdentifier {
  public static final String SERIALIZED_NAME_FILE_STATUS = "fileStatus";
  @SerializedName(SERIALIZED_NAME_FILE_STATUS)
  private String fileStatus;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_UPLOAD_DATE = "uploadDate";
  @SerializedName(SERIALIZED_NAME_UPLOAD_DATE)
  private String uploadDate;

  public TitaniumFileIdentifier() { 
  }

  public TitaniumFileIdentifier fileStatus(String fileStatus) {
    
    this.fileStatus = fileStatus;
    return this;
  }

   /**
   * Get fileStatus
   * @return fileStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileStatus() {
    return fileStatus;
  }


  public void setFileStatus(String fileStatus) {
    this.fileStatus = fileStatus;
  }


  public TitaniumFileIdentifier filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public TitaniumFileIdentifier uploadDate(String uploadDate) {
    
    this.uploadDate = uploadDate;
    return this;
  }

   /**
   * Get uploadDate
   * @return uploadDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUploadDate() {
    return uploadDate;
  }


  public void setUploadDate(String uploadDate) {
    this.uploadDate = uploadDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumFileIdentifier titaniumFileIdentifier = (TitaniumFileIdentifier) o;
    return Objects.equals(this.fileStatus, titaniumFileIdentifier.fileStatus) &&
        Objects.equals(this.filename, titaniumFileIdentifier.filename) &&
        Objects.equals(this.uploadDate, titaniumFileIdentifier.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileStatus, filename, uploadDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumFileIdentifier {\n");
    sb.append("    fileStatus: ").append(toIndentedString(fileStatus)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
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
    openapiFields.add("fileStatus");
    openapiFields.add("filename");
    openapiFields.add("uploadDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumFileIdentifier
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumFileIdentifier.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumFileIdentifier is not found in the empty JSON string", TitaniumFileIdentifier.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumFileIdentifier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumFileIdentifier` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fileStatus") != null && !jsonObj.get("fileStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileStatus").toString()));
      }
      if (jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      if (jsonObj.get("uploadDate") != null && !jsonObj.get("uploadDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploadDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploadDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumFileIdentifier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumFileIdentifier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumFileIdentifier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumFileIdentifier.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumFileIdentifier>() {
           @Override
           public void write(JsonWriter out, TitaniumFileIdentifier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumFileIdentifier read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumFileIdentifier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumFileIdentifier
  * @throws IOException if the JSON string is invalid with respect to TitaniumFileIdentifier
  */
  public static TitaniumFileIdentifier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumFileIdentifier.class);
  }

 /**
  * Convert an instance of TitaniumFileIdentifier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

