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
 * GetAttachmentUploadUrlResponseAttachmentUploadUrl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T10:39:00.881675Z[UTC]")
public class GetAttachmentUploadUrlResponseAttachmentUploadUrl {
  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "attachmentId";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  private String attachmentId;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_UPLOAD_URL = "uploadUrl";
  @SerializedName(SERIALIZED_NAME_UPLOAD_URL)
  private String uploadUrl;

  public GetAttachmentUploadUrlResponseAttachmentUploadUrl() { 
  }

  public GetAttachmentUploadUrlResponseAttachmentUploadUrl attachmentId(String attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * Get attachmentId
   * @return attachmentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttachmentId() {
    return attachmentId;
  }


  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }


  public GetAttachmentUploadUrlResponseAttachmentUploadUrl fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public GetAttachmentUploadUrlResponseAttachmentUploadUrl uploadUrl(String uploadUrl) {
    
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * Get uploadUrl
   * @return uploadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUploadUrl() {
    return uploadUrl;
  }


  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAttachmentUploadUrlResponseAttachmentUploadUrl getAttachmentUploadUrlResponseAttachmentUploadUrl = (GetAttachmentUploadUrlResponseAttachmentUploadUrl) o;
    return Objects.equals(this.attachmentId, getAttachmentUploadUrlResponseAttachmentUploadUrl.attachmentId) &&
        Objects.equals(this.fileName, getAttachmentUploadUrlResponseAttachmentUploadUrl.fileName) &&
        Objects.equals(this.uploadUrl, getAttachmentUploadUrlResponseAttachmentUploadUrl.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, fileName, uploadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttachmentUploadUrlResponseAttachmentUploadUrl {\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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
    openapiFields.add("attachmentId");
    openapiFields.add("fileName");
    openapiFields.add("uploadUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAttachmentUploadUrlResponseAttachmentUploadUrl
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetAttachmentUploadUrlResponseAttachmentUploadUrl.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAttachmentUploadUrlResponseAttachmentUploadUrl is not found in the empty JSON string", GetAttachmentUploadUrlResponseAttachmentUploadUrl.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetAttachmentUploadUrlResponseAttachmentUploadUrl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAttachmentUploadUrlResponseAttachmentUploadUrl` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("attachmentId") != null && !jsonObj.get("attachmentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachmentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attachmentId").toString()));
      }
      if (jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (jsonObj.get("uploadUrl") != null && !jsonObj.get("uploadUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uploadUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uploadUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAttachmentUploadUrlResponseAttachmentUploadUrl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAttachmentUploadUrlResponseAttachmentUploadUrl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAttachmentUploadUrlResponseAttachmentUploadUrl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAttachmentUploadUrlResponseAttachmentUploadUrl.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAttachmentUploadUrlResponseAttachmentUploadUrl>() {
           @Override
           public void write(JsonWriter out, GetAttachmentUploadUrlResponseAttachmentUploadUrl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAttachmentUploadUrlResponseAttachmentUploadUrl read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAttachmentUploadUrlResponseAttachmentUploadUrl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAttachmentUploadUrlResponseAttachmentUploadUrl
  * @throws IOException if the JSON string is invalid with respect to GetAttachmentUploadUrlResponseAttachmentUploadUrl
  */
  public static GetAttachmentUploadUrlResponseAttachmentUploadUrl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAttachmentUploadUrlResponseAttachmentUploadUrl.class);
  }

 /**
  * Convert an instance of GetAttachmentUploadUrlResponseAttachmentUploadUrl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

