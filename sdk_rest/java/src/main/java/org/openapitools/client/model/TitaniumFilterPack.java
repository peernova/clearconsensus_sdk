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
import org.openapitools.client.model.TitaniumFilter;

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
 * TitaniumFilterPack
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:25:13.078291Z[UTC]")
public class TitaniumFilterPack {
  public static final String SERIALIZED_NAME_FILTER_PACKS = "filterPacks";
  @SerializedName(SERIALIZED_NAME_FILTER_PACKS)
  private List<TitaniumFilterPack> filterPacks = null;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<TitaniumFilter> filters = null;

  public static final String SERIALIZED_NAME_LOGICAL_OPERATION = "logicalOperation";
  @SerializedName(SERIALIZED_NAME_LOGICAL_OPERATION)
  private String logicalOperation;

  public TitaniumFilterPack() { 
  }

  public TitaniumFilterPack filterPacks(List<TitaniumFilterPack> filterPacks) {
    
    this.filterPacks = filterPacks;
    return this;
  }

  public TitaniumFilterPack addFilterPacksItem(TitaniumFilterPack filterPacksItem) {
    if (this.filterPacks == null) {
      this.filterPacks = new ArrayList<>();
    }
    this.filterPacks.add(filterPacksItem);
    return this;
  }

   /**
   * Get filterPacks
   * @return filterPacks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumFilterPack> getFilterPacks() {
    return filterPacks;
  }


  public void setFilterPacks(List<TitaniumFilterPack> filterPacks) {
    this.filterPacks = filterPacks;
  }


  public TitaniumFilterPack filters(List<TitaniumFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public TitaniumFilterPack addFiltersItem(TitaniumFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<TitaniumFilter> filters) {
    this.filters = filters;
  }


  public TitaniumFilterPack logicalOperation(String logicalOperation) {
    
    this.logicalOperation = logicalOperation;
    return this;
  }

   /**
   * Get logicalOperation
   * @return logicalOperation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogicalOperation() {
    return logicalOperation;
  }


  public void setLogicalOperation(String logicalOperation) {
    this.logicalOperation = logicalOperation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumFilterPack titaniumFilterPack = (TitaniumFilterPack) o;
    return Objects.equals(this.filterPacks, titaniumFilterPack.filterPacks) &&
        Objects.equals(this.filters, titaniumFilterPack.filters) &&
        Objects.equals(this.logicalOperation, titaniumFilterPack.logicalOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterPacks, filters, logicalOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumFilterPack {\n");
    sb.append("    filterPacks: ").append(toIndentedString(filterPacks)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    logicalOperation: ").append(toIndentedString(logicalOperation)).append("\n");
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
    openapiFields.add("filterPacks");
    openapiFields.add("filters");
    openapiFields.add("logicalOperation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumFilterPack
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumFilterPack.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumFilterPack is not found in the empty JSON string", TitaniumFilterPack.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumFilterPack.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumFilterPack` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfilterPacks = jsonObj.getAsJsonArray("filterPacks");
      if (jsonArrayfilterPacks != null) {
        // ensure the json data is an array
        if (!jsonObj.get("filterPacks").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `filterPacks` to be an array in the JSON string but got `%s`", jsonObj.get("filterPacks").toString()));
        }

        // validate the optional field `filterPacks` (array)
        for (int i = 0; i < jsonArrayfilterPacks.size(); i++) {
          TitaniumFilterPack.validateJsonObject(jsonArrayfilterPacks.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayfilters = jsonObj.getAsJsonArray("filters");
      if (jsonArrayfilters != null) {
        // ensure the json data is an array
        if (!jsonObj.get("filters").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `filters` to be an array in the JSON string but got `%s`", jsonObj.get("filters").toString()));
        }

        // validate the optional field `filters` (array)
        for (int i = 0; i < jsonArrayfilters.size(); i++) {
          TitaniumFilter.validateJsonObject(jsonArrayfilters.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("logicalOperation") != null && !jsonObj.get("logicalOperation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logicalOperation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logicalOperation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumFilterPack.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumFilterPack' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumFilterPack> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumFilterPack.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumFilterPack>() {
           @Override
           public void write(JsonWriter out, TitaniumFilterPack value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumFilterPack read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumFilterPack given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumFilterPack
  * @throws IOException if the JSON string is invalid with respect to TitaniumFilterPack
  */
  public static TitaniumFilterPack fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumFilterPack.class);
  }

 /**
  * Convert an instance of TitaniumFilterPack to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

