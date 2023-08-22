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
import org.openapitools.client.model.TitaniumClientName;

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
 * TitaniumListClientsResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-22T20:56:14.323833Z[UTC]")
public class TitaniumListClientsResponseData {
  public static final String SERIALIZED_NAME_CLIENTS = "clients";
  @SerializedName(SERIALIZED_NAME_CLIENTS)
  private List<TitaniumClientName> clients = null;

  public TitaniumListClientsResponseData() { 
  }

  public TitaniumListClientsResponseData clients(List<TitaniumClientName> clients) {
    
    this.clients = clients;
    return this;
  }

  public TitaniumListClientsResponseData addClientsItem(TitaniumClientName clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumClientName> getClients() {
    return clients;
  }


  public void setClients(List<TitaniumClientName> clients) {
    this.clients = clients;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumListClientsResponseData titaniumListClientsResponseData = (TitaniumListClientsResponseData) o;
    return Objects.equals(this.clients, titaniumListClientsResponseData.clients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumListClientsResponseData {\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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
    openapiFields.add("clients");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumListClientsResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumListClientsResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumListClientsResponseData is not found in the empty JSON string", TitaniumListClientsResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumListClientsResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumListClientsResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayclients = jsonObj.getAsJsonArray("clients");
      if (jsonArrayclients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("clients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `clients` to be an array in the JSON string but got `%s`", jsonObj.get("clients").toString()));
        }

        // validate the optional field `clients` (array)
        for (int i = 0; i < jsonArrayclients.size(); i++) {
          TitaniumClientName.validateJsonObject(jsonArrayclients.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumListClientsResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumListClientsResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumListClientsResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumListClientsResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumListClientsResponseData>() {
           @Override
           public void write(JsonWriter out, TitaniumListClientsResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumListClientsResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumListClientsResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumListClientsResponseData
  * @throws IOException if the JSON string is invalid with respect to TitaniumListClientsResponseData
  */
  public static TitaniumListClientsResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumListClientsResponseData.class);
  }

 /**
  * Convert an instance of TitaniumListClientsResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

