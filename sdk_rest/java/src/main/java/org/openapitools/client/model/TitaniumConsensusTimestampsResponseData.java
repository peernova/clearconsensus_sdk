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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.TitaniumConsensusTimestampMeta;

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
 * TitaniumConsensusTimestampsResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumConsensusTimestampsResponseData {
  public static final String SERIALIZED_NAME_TIMESTAMPS = "timestamps";
  @SerializedName(SERIALIZED_NAME_TIMESTAMPS)
  private List<TitaniumConsensusTimestampMeta> timestamps = null;

  public TitaniumConsensusTimestampsResponseData() { 
  }

  public TitaniumConsensusTimestampsResponseData timestamps(List<TitaniumConsensusTimestampMeta> timestamps) {
    
    this.timestamps = timestamps;
    return this;
  }

  public TitaniumConsensusTimestampsResponseData addTimestampsItem(TitaniumConsensusTimestampMeta timestampsItem) {
    if (this.timestamps == null) {
      this.timestamps = new ArrayList<>();
    }
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumConsensusTimestampMeta> getTimestamps() {
    return timestamps;
  }


  public void setTimestamps(List<TitaniumConsensusTimestampMeta> timestamps) {
    this.timestamps = timestamps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusTimestampsResponseData titaniumConsensusTimestampsResponseData = (TitaniumConsensusTimestampsResponseData) o;
    return Objects.equals(this.timestamps, titaniumConsensusTimestampsResponseData.timestamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusTimestampsResponseData {\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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
    openapiFields.add("timestamps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusTimestampsResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusTimestampsResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusTimestampsResponseData is not found in the empty JSON string", TitaniumConsensusTimestampsResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusTimestampsResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusTimestampsResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraytimestamps = jsonObj.getAsJsonArray("timestamps");
      if (jsonArraytimestamps != null) {
        // ensure the json data is an array
        if (!jsonObj.get("timestamps").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `timestamps` to be an array in the JSON string but got `%s`", jsonObj.get("timestamps").toString()));
        }

        // validate the optional field `timestamps` (array)
        for (int i = 0; i < jsonArraytimestamps.size(); i++) {
          TitaniumConsensusTimestampMeta.validateJsonObject(jsonArraytimestamps.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusTimestampsResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusTimestampsResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusTimestampsResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusTimestampsResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusTimestampsResponseData>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusTimestampsResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusTimestampsResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusTimestampsResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusTimestampsResponseData
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusTimestampsResponseData
  */
  public static TitaniumConsensusTimestampsResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusTimestampsResponseData.class);
  }

 /**
  * Convert an instance of TitaniumConsensusTimestampsResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

