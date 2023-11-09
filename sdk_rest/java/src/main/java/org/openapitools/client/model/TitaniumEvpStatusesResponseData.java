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
import org.openapitools.client.model.TitaniumEvpStatuses;
import org.openapitools.client.model.TitaniumSlice;

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
 * TitaniumEvpStatusesResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T10:08:28.733850Z[UTC]")
public class TitaniumEvpStatusesResponseData {
  public static final String SERIALIZED_NAME_EVP_STATUSES = "evpStatuses";
  @SerializedName(SERIALIZED_NAME_EVP_STATUSES)
  private TitaniumEvpStatuses evpStatuses;

  public static final String SERIALIZED_NAME_SLICE = "slice";
  @SerializedName(SERIALIZED_NAME_SLICE)
  private TitaniumSlice slice;

  public TitaniumEvpStatusesResponseData() { 
  }

  public TitaniumEvpStatusesResponseData evpStatuses(TitaniumEvpStatuses evpStatuses) {
    
    this.evpStatuses = evpStatuses;
    return this;
  }

   /**
   * Get evpStatuses
   * @return evpStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumEvpStatuses getEvpStatuses() {
    return evpStatuses;
  }


  public void setEvpStatuses(TitaniumEvpStatuses evpStatuses) {
    this.evpStatuses = evpStatuses;
  }


  public TitaniumEvpStatusesResponseData slice(TitaniumSlice slice) {
    
    this.slice = slice;
    return this;
  }

   /**
   * Get slice
   * @return slice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumSlice getSlice() {
    return slice;
  }


  public void setSlice(TitaniumSlice slice) {
    this.slice = slice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumEvpStatusesResponseData titaniumEvpStatusesResponseData = (TitaniumEvpStatusesResponseData) o;
    return Objects.equals(this.evpStatuses, titaniumEvpStatusesResponseData.evpStatuses) &&
        Objects.equals(this.slice, titaniumEvpStatusesResponseData.slice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evpStatuses, slice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumEvpStatusesResponseData {\n");
    sb.append("    evpStatuses: ").append(toIndentedString(evpStatuses)).append("\n");
    sb.append("    slice: ").append(toIndentedString(slice)).append("\n");
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
    openapiFields.add("evpStatuses");
    openapiFields.add("slice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumEvpStatusesResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumEvpStatusesResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumEvpStatusesResponseData is not found in the empty JSON string", TitaniumEvpStatusesResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumEvpStatusesResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumEvpStatusesResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `evpStatuses`
      if (jsonObj.getAsJsonObject("evpStatuses") != null) {
        TitaniumEvpStatuses.validateJsonObject(jsonObj.getAsJsonObject("evpStatuses"));
      }
      // validate the optional field `slice`
      if (jsonObj.getAsJsonObject("slice") != null) {
        TitaniumSlice.validateJsonObject(jsonObj.getAsJsonObject("slice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumEvpStatusesResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumEvpStatusesResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumEvpStatusesResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumEvpStatusesResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumEvpStatusesResponseData>() {
           @Override
           public void write(JsonWriter out, TitaniumEvpStatusesResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumEvpStatusesResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumEvpStatusesResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumEvpStatusesResponseData
  * @throws IOException if the JSON string is invalid with respect to TitaniumEvpStatusesResponseData
  */
  public static TitaniumEvpStatusesResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumEvpStatusesResponseData.class);
  }

 /**
  * Convert an instance of TitaniumEvpStatusesResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

