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
 * TitaniumChartsCurrenciesResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumChartsCurrenciesResponseData {
  public static final String SERIALIZED_NAME_CURRENCY_PAIRS = "currencyPairs";
  @SerializedName(SERIALIZED_NAME_CURRENCY_PAIRS)
  private List<String> currencyPairs = null;

  public TitaniumChartsCurrenciesResponseData() { 
  }

  public TitaniumChartsCurrenciesResponseData currencyPairs(List<String> currencyPairs) {
    
    this.currencyPairs = currencyPairs;
    return this;
  }

  public TitaniumChartsCurrenciesResponseData addCurrencyPairsItem(String currencyPairsItem) {
    if (this.currencyPairs == null) {
      this.currencyPairs = new ArrayList<>();
    }
    this.currencyPairs.add(currencyPairsItem);
    return this;
  }

   /**
   * Get currencyPairs
   * @return currencyPairs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCurrencyPairs() {
    return currencyPairs;
  }


  public void setCurrencyPairs(List<String> currencyPairs) {
    this.currencyPairs = currencyPairs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumChartsCurrenciesResponseData titaniumChartsCurrenciesResponseData = (TitaniumChartsCurrenciesResponseData) o;
    return Objects.equals(this.currencyPairs, titaniumChartsCurrenciesResponseData.currencyPairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyPairs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumChartsCurrenciesResponseData {\n");
    sb.append("    currencyPairs: ").append(toIndentedString(currencyPairs)).append("\n");
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
    openapiFields.add("currencyPairs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumChartsCurrenciesResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumChartsCurrenciesResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumChartsCurrenciesResponseData is not found in the empty JSON string", TitaniumChartsCurrenciesResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumChartsCurrenciesResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumChartsCurrenciesResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("currencyPairs") != null && !jsonObj.get("currencyPairs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyPairs` to be an array in the JSON string but got `%s`", jsonObj.get("currencyPairs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumChartsCurrenciesResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumChartsCurrenciesResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumChartsCurrenciesResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumChartsCurrenciesResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumChartsCurrenciesResponseData>() {
           @Override
           public void write(JsonWriter out, TitaniumChartsCurrenciesResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumChartsCurrenciesResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumChartsCurrenciesResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumChartsCurrenciesResponseData
  * @throws IOException if the JSON string is invalid with respect to TitaniumChartsCurrenciesResponseData
  */
  public static TitaniumChartsCurrenciesResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumChartsCurrenciesResponseData.class);
  }

 /**
  * Convert an instance of TitaniumChartsCurrenciesResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

