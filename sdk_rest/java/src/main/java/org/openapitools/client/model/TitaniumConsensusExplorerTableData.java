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
import org.openapitools.client.model.TitaniumComparisonTable;

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
 * TitaniumConsensusExplorerTableData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-24T17:35:03.597161Z[UTC]")
public class TitaniumConsensusExplorerTableData {
  public static final String SERIALIZED_NAME_COMPARISON_TABLE = "comparisonTable";
  @SerializedName(SERIALIZED_NAME_COMPARISON_TABLE)
  private TitaniumComparisonTable comparisonTable;

  public TitaniumConsensusExplorerTableData() { 
  }

  public TitaniumConsensusExplorerTableData comparisonTable(TitaniumComparisonTable comparisonTable) {
    
    this.comparisonTable = comparisonTable;
    return this;
  }

   /**
   * Get comparisonTable
   * @return comparisonTable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumComparisonTable getComparisonTable() {
    return comparisonTable;
  }


  public void setComparisonTable(TitaniumComparisonTable comparisonTable) {
    this.comparisonTable = comparisonTable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumConsensusExplorerTableData titaniumConsensusExplorerTableData = (TitaniumConsensusExplorerTableData) o;
    return Objects.equals(this.comparisonTable, titaniumConsensusExplorerTableData.comparisonTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonTable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusExplorerTableData {\n");
    sb.append("    comparisonTable: ").append(toIndentedString(comparisonTable)).append("\n");
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
    openapiFields.add("comparisonTable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusExplorerTableData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusExplorerTableData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusExplorerTableData is not found in the empty JSON string", TitaniumConsensusExplorerTableData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusExplorerTableData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusExplorerTableData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `comparisonTable`
      if (jsonObj.getAsJsonObject("comparisonTable") != null) {
        TitaniumComparisonTable.validateJsonObject(jsonObj.getAsJsonObject("comparisonTable"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusExplorerTableData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusExplorerTableData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusExplorerTableData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusExplorerTableData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusExplorerTableData>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusExplorerTableData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusExplorerTableData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusExplorerTableData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusExplorerTableData
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusExplorerTableData
  */
  public static TitaniumConsensusExplorerTableData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusExplorerTableData.class);
  }

 /**
  * Convert an instance of TitaniumConsensusExplorerTableData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

