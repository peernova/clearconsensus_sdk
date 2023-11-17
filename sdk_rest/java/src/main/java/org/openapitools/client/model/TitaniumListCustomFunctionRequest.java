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
import org.openapitools.client.model.TitaniumListRequest;

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
 * TitaniumListCustomFunctionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:21:54.486708Z[UTC]")
public class TitaniumListCustomFunctionRequest {
  public static final String SERIALIZED_NAME_DESCRIPTOR_NAME = "descriptorName";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR_NAME)
  private String descriptorName;

  public static final String SERIALIZED_NAME_DESCRIPTOR_TYPE = "descriptorType";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR_TYPE)
  private String descriptorType;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private TitaniumListRequest request;

  public TitaniumListCustomFunctionRequest() { 
  }

  public TitaniumListCustomFunctionRequest descriptorName(String descriptorName) {
    
    this.descriptorName = descriptorName;
    return this;
  }

   /**
   * Get descriptorName
   * @return descriptorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptorName() {
    return descriptorName;
  }


  public void setDescriptorName(String descriptorName) {
    this.descriptorName = descriptorName;
  }


  public TitaniumListCustomFunctionRequest descriptorType(String descriptorType) {
    
    this.descriptorType = descriptorType;
    return this;
  }

   /**
   * Get descriptorType
   * @return descriptorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptorType() {
    return descriptorType;
  }


  public void setDescriptorType(String descriptorType) {
    this.descriptorType = descriptorType;
  }


  public TitaniumListCustomFunctionRequest request(TitaniumListRequest request) {
    
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumListRequest getRequest() {
    return request;
  }


  public void setRequest(TitaniumListRequest request) {
    this.request = request;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumListCustomFunctionRequest titaniumListCustomFunctionRequest = (TitaniumListCustomFunctionRequest) o;
    return Objects.equals(this.descriptorName, titaniumListCustomFunctionRequest.descriptorName) &&
        Objects.equals(this.descriptorType, titaniumListCustomFunctionRequest.descriptorType) &&
        Objects.equals(this.request, titaniumListCustomFunctionRequest.request);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptorName, descriptorType, request);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumListCustomFunctionRequest {\n");
    sb.append("    descriptorName: ").append(toIndentedString(descriptorName)).append("\n");
    sb.append("    descriptorType: ").append(toIndentedString(descriptorType)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
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
    openapiFields.add("descriptorName");
    openapiFields.add("descriptorType");
    openapiFields.add("request");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumListCustomFunctionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumListCustomFunctionRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumListCustomFunctionRequest is not found in the empty JSON string", TitaniumListCustomFunctionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumListCustomFunctionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumListCustomFunctionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("descriptorName") != null && !jsonObj.get("descriptorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptorName").toString()));
      }
      if (jsonObj.get("descriptorType") != null && !jsonObj.get("descriptorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptorType").toString()));
      }
      // validate the optional field `request`
      if (jsonObj.getAsJsonObject("request") != null) {
        TitaniumListRequest.validateJsonObject(jsonObj.getAsJsonObject("request"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumListCustomFunctionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumListCustomFunctionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumListCustomFunctionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumListCustomFunctionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumListCustomFunctionRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumListCustomFunctionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumListCustomFunctionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumListCustomFunctionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumListCustomFunctionRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumListCustomFunctionRequest
  */
  public static TitaniumListCustomFunctionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumListCustomFunctionRequest.class);
  }

 /**
  * Convert an instance of TitaniumListCustomFunctionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

