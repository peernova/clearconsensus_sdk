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
import org.openapitools.client.model.TitaniumFilterPack;

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
 * TitaniumSubGroupKeySearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:55:38.819796Z[UTC]")
public class TitaniumSubGroupKeySearch {
  public static final String SERIALIZED_NAME_GROUP_KEYS = "groupKeys";
  @SerializedName(SERIALIZED_NAME_GROUP_KEYS)
  private TitaniumFilterPack groupKeys;

  public static final String SERIALIZED_NAME_SUB_SUBMITTED_DATE = "subSubmittedDate";
  @SerializedName(SERIALIZED_NAME_SUB_SUBMITTED_DATE)
  private String subSubmittedDate;

  public TitaniumSubGroupKeySearch() { 
  }

  public TitaniumSubGroupKeySearch groupKeys(TitaniumFilterPack groupKeys) {
    
    this.groupKeys = groupKeys;
    return this;
  }

   /**
   * Get groupKeys
   * @return groupKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumFilterPack getGroupKeys() {
    return groupKeys;
  }


  public void setGroupKeys(TitaniumFilterPack groupKeys) {
    this.groupKeys = groupKeys;
  }


  public TitaniumSubGroupKeySearch subSubmittedDate(String subSubmittedDate) {
    
    this.subSubmittedDate = subSubmittedDate;
    return this;
  }

   /**
   * Get subSubmittedDate
   * @return subSubmittedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubSubmittedDate() {
    return subSubmittedDate;
  }


  public void setSubSubmittedDate(String subSubmittedDate) {
    this.subSubmittedDate = subSubmittedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumSubGroupKeySearch titaniumSubGroupKeySearch = (TitaniumSubGroupKeySearch) o;
    return Objects.equals(this.groupKeys, titaniumSubGroupKeySearch.groupKeys) &&
        Objects.equals(this.subSubmittedDate, titaniumSubGroupKeySearch.subSubmittedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupKeys, subSubmittedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumSubGroupKeySearch {\n");
    sb.append("    groupKeys: ").append(toIndentedString(groupKeys)).append("\n");
    sb.append("    subSubmittedDate: ").append(toIndentedString(subSubmittedDate)).append("\n");
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
    openapiFields.add("groupKeys");
    openapiFields.add("subSubmittedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumSubGroupKeySearch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumSubGroupKeySearch.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumSubGroupKeySearch is not found in the empty JSON string", TitaniumSubGroupKeySearch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumSubGroupKeySearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumSubGroupKeySearch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `groupKeys`
      if (jsonObj.getAsJsonObject("groupKeys") != null) {
        TitaniumFilterPack.validateJsonObject(jsonObj.getAsJsonObject("groupKeys"));
      }
      if (jsonObj.get("subSubmittedDate") != null && !jsonObj.get("subSubmittedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subSubmittedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subSubmittedDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumSubGroupKeySearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumSubGroupKeySearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumSubGroupKeySearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumSubGroupKeySearch.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumSubGroupKeySearch>() {
           @Override
           public void write(JsonWriter out, TitaniumSubGroupKeySearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumSubGroupKeySearch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumSubGroupKeySearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumSubGroupKeySearch
  * @throws IOException if the JSON string is invalid with respect to TitaniumSubGroupKeySearch
  */
  public static TitaniumSubGroupKeySearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumSubGroupKeySearch.class);
  }

 /**
  * Convert an instance of TitaniumSubGroupKeySearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

