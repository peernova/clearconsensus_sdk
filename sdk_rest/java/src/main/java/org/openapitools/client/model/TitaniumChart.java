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
import org.openapitools.client.model.TitaniumChartPoint;

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
 * TitaniumChart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T10:39:00.881675Z[UTC]")
public class TitaniumChart {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private List<TitaniumChartPoint> points = null;

  public TitaniumChart() { 
  }

  public TitaniumChart name(String name) {
    
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


  public TitaniumChart points(List<TitaniumChartPoint> points) {
    
    this.points = points;
    return this;
  }

  public TitaniumChart addPointsItem(TitaniumChartPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumChartPoint> getPoints() {
    return points;
  }


  public void setPoints(List<TitaniumChartPoint> points) {
    this.points = points;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumChart titaniumChart = (TitaniumChart) o;
    return Objects.equals(this.name, titaniumChart.name) &&
        Objects.equals(this.points, titaniumChart.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumChart {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("points");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumChart
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumChart.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumChart is not found in the empty JSON string", TitaniumChart.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumChart.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumChart` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArraypoints = jsonObj.getAsJsonArray("points");
      if (jsonArraypoints != null) {
        // ensure the json data is an array
        if (!jsonObj.get("points").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `points` to be an array in the JSON string but got `%s`", jsonObj.get("points").toString()));
        }

        // validate the optional field `points` (array)
        for (int i = 0; i < jsonArraypoints.size(); i++) {
          TitaniumChartPoint.validateJsonObject(jsonArraypoints.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumChart.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumChart' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumChart> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumChart.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumChart>() {
           @Override
           public void write(JsonWriter out, TitaniumChart value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumChart read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumChart given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumChart
  * @throws IOException if the JSON string is invalid with respect to TitaniumChart
  */
  public static TitaniumChart fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumChart.class);
  }

 /**
  * Convert an instance of TitaniumChart to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

