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
import org.openapitools.client.model.TitaniumEvpStatus;

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
 * TitaniumEvpStatuses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:50:10.371088Z[UTC]")
public class TitaniumEvpStatuses {
  public static final String SERIALIZED_NAME_EVP_STATUSES = "evpStatuses";
  @SerializedName(SERIALIZED_NAME_EVP_STATUSES)
  private List<TitaniumEvpStatus> evpStatuses = null;

  public TitaniumEvpStatuses() { 
  }

  public TitaniumEvpStatuses evpStatuses(List<TitaniumEvpStatus> evpStatuses) {
    
    this.evpStatuses = evpStatuses;
    return this;
  }

  public TitaniumEvpStatuses addEvpStatusesItem(TitaniumEvpStatus evpStatusesItem) {
    if (this.evpStatuses == null) {
      this.evpStatuses = new ArrayList<>();
    }
    this.evpStatuses.add(evpStatusesItem);
    return this;
  }

   /**
   * Get evpStatuses
   * @return evpStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumEvpStatus> getEvpStatuses() {
    return evpStatuses;
  }


  public void setEvpStatuses(List<TitaniumEvpStatus> evpStatuses) {
    this.evpStatuses = evpStatuses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumEvpStatuses titaniumEvpStatuses = (TitaniumEvpStatuses) o;
    return Objects.equals(this.evpStatuses, titaniumEvpStatuses.evpStatuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evpStatuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumEvpStatuses {\n");
    sb.append("    evpStatuses: ").append(toIndentedString(evpStatuses)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumEvpStatuses
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumEvpStatuses.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumEvpStatuses is not found in the empty JSON string", TitaniumEvpStatuses.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumEvpStatuses.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumEvpStatuses` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayevpStatuses = jsonObj.getAsJsonArray("evpStatuses");
      if (jsonArrayevpStatuses != null) {
        // ensure the json data is an array
        if (!jsonObj.get("evpStatuses").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `evpStatuses` to be an array in the JSON string but got `%s`", jsonObj.get("evpStatuses").toString()));
        }

        // validate the optional field `evpStatuses` (array)
        for (int i = 0; i < jsonArrayevpStatuses.size(); i++) {
          TitaniumEvpStatus.validateJsonObject(jsonArrayevpStatuses.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumEvpStatuses.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumEvpStatuses' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumEvpStatuses> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumEvpStatuses.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumEvpStatuses>() {
           @Override
           public void write(JsonWriter out, TitaniumEvpStatuses value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumEvpStatuses read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumEvpStatuses given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumEvpStatuses
  * @throws IOException if the JSON string is invalid with respect to TitaniumEvpStatuses
  */
  public static TitaniumEvpStatuses fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumEvpStatuses.class);
  }

 /**
  * Convert an instance of TitaniumEvpStatuses to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

