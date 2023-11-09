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
import org.openapitools.client.model.TitaniumChart;

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
 * TitaniumChartSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:22:18.538272Z[UTC]")
public class TitaniumChartSource {
  public static final String SERIALIZED_NAME_CHARTS = "charts";
  @SerializedName(SERIALIZED_NAME_CHARTS)
  private List<TitaniumChart> charts = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public TitaniumChartSource() { 
  }

  public TitaniumChartSource charts(List<TitaniumChart> charts) {
    
    this.charts = charts;
    return this;
  }

  public TitaniumChartSource addChartsItem(TitaniumChart chartsItem) {
    if (this.charts == null) {
      this.charts = new ArrayList<>();
    }
    this.charts.add(chartsItem);
    return this;
  }

   /**
   * Get charts
   * @return charts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumChart> getCharts() {
    return charts;
  }


  public void setCharts(List<TitaniumChart> charts) {
    this.charts = charts;
  }


  public TitaniumChartSource name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumChartSource titaniumChartSource = (TitaniumChartSource) o;
    return Objects.equals(this.charts, titaniumChartSource.charts) &&
        Objects.equals(this.name, titaniumChartSource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charts, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumChartSource {\n");
    sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("charts");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumChartSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumChartSource.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumChartSource is not found in the empty JSON string", TitaniumChartSource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumChartSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumChartSource` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycharts = jsonObj.getAsJsonArray("charts");
      if (jsonArraycharts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("charts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `charts` to be an array in the JSON string but got `%s`", jsonObj.get("charts").toString()));
        }

        // validate the optional field `charts` (array)
        for (int i = 0; i < jsonArraycharts.size(); i++) {
          TitaniumChart.validateJsonObject(jsonArraycharts.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumChartSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumChartSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumChartSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumChartSource.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumChartSource>() {
           @Override
           public void write(JsonWriter out, TitaniumChartSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumChartSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumChartSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumChartSource
  * @throws IOException if the JSON string is invalid with respect to TitaniumChartSource
  */
  public static TitaniumChartSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumChartSource.class);
  }

 /**
  * Convert an instance of TitaniumChartSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

