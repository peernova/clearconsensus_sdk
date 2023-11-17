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
 * FileIdentifier contains information about a file including its filename, upload date, and status.
 */
@ApiModel(description = "FileIdentifier contains information about a file including its filename, upload date, and status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:04:19.570721Z[UTC]")
public class FileServiceGetFilePreviewRequest {
  public static final String SERIALIZED_NAME_FILE_STATUS = "fileStatus";
  @SerializedName(SERIALIZED_NAME_FILE_STATUS)
  private String fileStatus;

  public static final String SERIALIZED_NAME_UPLOAD_DATE = "uploadDate";
  @SerializedName(SERIALIZED_NAME_UPLOAD_DATE)
  private String uploadDate;

  public FileServiceGetFilePreviewRequest() { 
  }

  public FileServiceGetFilePreviewRequest fileStatus(String fileStatus) {
    
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


  public FileServiceGetFilePreviewRequest uploadDate(String uploadDate) {
    
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
    FileServiceGetFilePreviewRequest fileServiceGetFilePreviewRequest = (FileServiceGetFilePreviewRequest) o;
    return Objects.equals(this.fileStatus, fileServiceGetFilePreviewRequest.fileStatus) &&
        Objects.equals(this.uploadDate, fileServiceGetFilePreviewRequest.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileStatus, uploadDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileServiceGetFilePreviewRequest {\n");
    sb.append("    fileStatus: ").append(toIndentedString(fileStatus)).append("\n");
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
    openapiFields.add("uploadDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FileServiceGetFilePreviewRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FileServiceGetFilePreviewRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FileServiceGetFilePreviewRequest is not found in the empty JSON string", FileServiceGetFilePreviewRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FileServiceGetFilePreviewRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FileServiceGetFilePreviewRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fileStatus") != null && !jsonObj.get("fileStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileStatus").toString()));
      }
      if (jsonObj.get("uploadDate") != null && !jsonObj.get("uploadDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploadDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploadDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileServiceGetFilePreviewRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileServiceGetFilePreviewRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileServiceGetFilePreviewRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileServiceGetFilePreviewRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FileServiceGetFilePreviewRequest>() {
           @Override
           public void write(JsonWriter out, FileServiceGetFilePreviewRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileServiceGetFilePreviewRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileServiceGetFilePreviewRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileServiceGetFilePreviewRequest
  * @throws IOException if the JSON string is invalid with respect to FileServiceGetFilePreviewRequest
  */
  public static FileServiceGetFilePreviewRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileServiceGetFilePreviewRequest.class);
  }

 /**
  * Convert an instance of FileServiceGetFilePreviewRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

