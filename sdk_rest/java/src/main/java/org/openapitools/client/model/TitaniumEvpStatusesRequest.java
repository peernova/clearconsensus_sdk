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
import org.openapitools.client.model.TitaniumSliceRequestData;

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
 * TitaniumEvpStatusesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumEvpStatusesRequest {
  public static final String SERIALIZED_NAME_SLICE_REQUEST_DATA = "sliceRequestData";
  @SerializedName(SERIALIZED_NAME_SLICE_REQUEST_DATA)
  private TitaniumSliceRequestData sliceRequestData;

  public TitaniumEvpStatusesRequest() { 
  }

  public TitaniumEvpStatusesRequest sliceRequestData(TitaniumSliceRequestData sliceRequestData) {
    
    this.sliceRequestData = sliceRequestData;
    return this;
  }

   /**
   * Get sliceRequestData
   * @return sliceRequestData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumSliceRequestData getSliceRequestData() {
    return sliceRequestData;
  }


  public void setSliceRequestData(TitaniumSliceRequestData sliceRequestData) {
    this.sliceRequestData = sliceRequestData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumEvpStatusesRequest titaniumEvpStatusesRequest = (TitaniumEvpStatusesRequest) o;
    return Objects.equals(this.sliceRequestData, titaniumEvpStatusesRequest.sliceRequestData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sliceRequestData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumEvpStatusesRequest {\n");
    sb.append("    sliceRequestData: ").append(toIndentedString(sliceRequestData)).append("\n");
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
    openapiFields.add("sliceRequestData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumEvpStatusesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumEvpStatusesRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumEvpStatusesRequest is not found in the empty JSON string", TitaniumEvpStatusesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumEvpStatusesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumEvpStatusesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `sliceRequestData`
      if (jsonObj.getAsJsonObject("sliceRequestData") != null) {
        TitaniumSliceRequestData.validateJsonObject(jsonObj.getAsJsonObject("sliceRequestData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumEvpStatusesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumEvpStatusesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumEvpStatusesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumEvpStatusesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumEvpStatusesRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumEvpStatusesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumEvpStatusesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumEvpStatusesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumEvpStatusesRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumEvpStatusesRequest
  */
  public static TitaniumEvpStatusesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumEvpStatusesRequest.class);
  }

 /**
  * Convert an instance of TitaniumEvpStatusesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

