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
 * TitaniumExportPresignedUrlResponseResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-16T13:49:58.694330Z[UTC]")
public class TitaniumExportPresignedUrlResponseResponseData {
  public static final String SERIALIZED_NAME_COMPRESSION = "compression";
  @SerializedName(SERIALIZED_NAME_COMPRESSION)
  private String compression;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_GET_REQUEST_URL = "getRequestUrl";
  @SerializedName(SERIALIZED_NAME_GET_REQUEST_URL)
  private String getRequestUrl;

  public TitaniumExportPresignedUrlResponseResponseData() { 
  }

  public TitaniumExportPresignedUrlResponseResponseData compression(String compression) {
    
    this.compression = compression;
    return this;
  }

   /**
   * Get compression
   * @return compression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCompression() {
    return compression;
  }


  public void setCompression(String compression) {
    this.compression = compression;
  }


  public TitaniumExportPresignedUrlResponseResponseData fileName(String fileName) {
    
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


  public TitaniumExportPresignedUrlResponseResponseData getRequestUrl(String getRequestUrl) {
    
    this.getRequestUrl = getRequestUrl;
    return this;
  }

   /**
   * Get getRequestUrl
   * @return getRequestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGetRequestUrl() {
    return getRequestUrl;
  }


  public void setGetRequestUrl(String getRequestUrl) {
    this.getRequestUrl = getRequestUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumExportPresignedUrlResponseResponseData titaniumExportPresignedUrlResponseResponseData = (TitaniumExportPresignedUrlResponseResponseData) o;
    return Objects.equals(this.compression, titaniumExportPresignedUrlResponseResponseData.compression) &&
        Objects.equals(this.fileName, titaniumExportPresignedUrlResponseResponseData.fileName) &&
        Objects.equals(this.getRequestUrl, titaniumExportPresignedUrlResponseResponseData.getRequestUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compression, fileName, getRequestUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumExportPresignedUrlResponseResponseData {\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    getRequestUrl: ").append(toIndentedString(getRequestUrl)).append("\n");
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
    openapiFields.add("compression");
    openapiFields.add("fileName");
    openapiFields.add("getRequestUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumExportPresignedUrlResponseResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumExportPresignedUrlResponseResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumExportPresignedUrlResponseResponseData is not found in the empty JSON string", TitaniumExportPresignedUrlResponseResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumExportPresignedUrlResponseResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumExportPresignedUrlResponseResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("compression") != null && !jsonObj.get("compression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `compression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("compression").toString()));
      }
      if (jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (jsonObj.get("getRequestUrl") != null && !jsonObj.get("getRequestUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `getRequestUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("getRequestUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumExportPresignedUrlResponseResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumExportPresignedUrlResponseResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumExportPresignedUrlResponseResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumExportPresignedUrlResponseResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumExportPresignedUrlResponseResponseData>() {
           @Override
           public void write(JsonWriter out, TitaniumExportPresignedUrlResponseResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumExportPresignedUrlResponseResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumExportPresignedUrlResponseResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumExportPresignedUrlResponseResponseData
  * @throws IOException if the JSON string is invalid with respect to TitaniumExportPresignedUrlResponseResponseData
  */
  public static TitaniumExportPresignedUrlResponseResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumExportPresignedUrlResponseResponseData.class);
  }

 /**
  * Convert an instance of TitaniumExportPresignedUrlResponseResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

