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
import org.openapitools.client.model.TitaniumDateAndValue;

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
 * TitaniumBimodality
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-06T18:33:51.913217Z[UTC]")
public class TitaniumBimodality {
  public static final String SERIALIZED_NAME_BIMODALITY_INDEX = "bimodalityIndex";
  @SerializedName(SERIALIZED_NAME_BIMODALITY_INDEX)
  private Object bimodalityIndex;

  public static final String SERIALIZED_NAME_HISTORY = "history";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private List<TitaniumDateAndValue> history = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public TitaniumBimodality() { 
  }

  public TitaniumBimodality bimodalityIndex(Object bimodalityIndex) {
    
    this.bimodalityIndex = bimodalityIndex;
    return this;
  }

   /**
   * Get bimodalityIndex
   * @return bimodalityIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getBimodalityIndex() {
    return bimodalityIndex;
  }


  public void setBimodalityIndex(Object bimodalityIndex) {
    this.bimodalityIndex = bimodalityIndex;
  }


  public TitaniumBimodality history(List<TitaniumDateAndValue> history) {
    
    this.history = history;
    return this;
  }

  public TitaniumBimodality addHistoryItem(TitaniumDateAndValue historyItem) {
    if (this.history == null) {
      this.history = new ArrayList<>();
    }
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumDateAndValue> getHistory() {
    return history;
  }


  public void setHistory(List<TitaniumDateAndValue> history) {
    this.history = history;
  }


  public TitaniumBimodality value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumBimodality titaniumBimodality = (TitaniumBimodality) o;
    return Objects.equals(this.bimodalityIndex, titaniumBimodality.bimodalityIndex) &&
        Objects.equals(this.history, titaniumBimodality.history) &&
        Objects.equals(this.value, titaniumBimodality.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bimodalityIndex, history, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumBimodality {\n");
    sb.append("    bimodalityIndex: ").append(toIndentedString(bimodalityIndex)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("bimodalityIndex");
    openapiFields.add("history");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumBimodality
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumBimodality.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumBimodality is not found in the empty JSON string", TitaniumBimodality.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumBimodality.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumBimodality` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayhistory = jsonObj.getAsJsonArray("history");
      if (jsonArrayhistory != null) {
        // ensure the json data is an array
        if (!jsonObj.get("history").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `history` to be an array in the JSON string but got `%s`", jsonObj.get("history").toString()));
        }

        // validate the optional field `history` (array)
        for (int i = 0; i < jsonArrayhistory.size(); i++) {
          TitaniumDateAndValue.validateJsonObject(jsonArrayhistory.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumBimodality.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumBimodality' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumBimodality> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumBimodality.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumBimodality>() {
           @Override
           public void write(JsonWriter out, TitaniumBimodality value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumBimodality read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumBimodality given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumBimodality
  * @throws IOException if the JSON string is invalid with respect to TitaniumBimodality
  */
  public static TitaniumBimodality fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumBimodality.class);
  }

 /**
  * Convert an instance of TitaniumBimodality to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

