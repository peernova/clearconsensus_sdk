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
 * TitaniumRunCalculatorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-10T17:17:04.398283Z[UTC]")
public class TitaniumRunCalculatorRequest {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_CLIENTS = "clients";
  @SerializedName(SERIALIZED_NAME_CLIENTS)
  private List<String> clients = null;

  public static final String SERIALIZED_NAME_CONSENSUS_RUN_REASON = "consensusRunReason";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_RUN_REASON)
  private String consensusRunReason;

  public static final String SERIALIZED_NAME_DATES = "dates";
  @SerializedName(SERIALIZED_NAME_DATES)
  private List<String> dates = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TRACE_NAME = "traceName";
  @SerializedName(SERIALIZED_NAME_TRACE_NAME)
  private String traceName;

  public TitaniumRunCalculatorRequest() { 
  }

  public TitaniumRunCalculatorRequest assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public TitaniumRunCalculatorRequest clients(List<String> clients) {
    
    this.clients = clients;
    return this;
  }

  public TitaniumRunCalculatorRequest addClientsItem(String clientsItem) {
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

  public List<String> getClients() {
    return clients;
  }


  public void setClients(List<String> clients) {
    this.clients = clients;
  }


  public TitaniumRunCalculatorRequest consensusRunReason(String consensusRunReason) {
    
    this.consensusRunReason = consensusRunReason;
    return this;
  }

   /**
   * Get consensusRunReason
   * @return consensusRunReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConsensusRunReason() {
    return consensusRunReason;
  }


  public void setConsensusRunReason(String consensusRunReason) {
    this.consensusRunReason = consensusRunReason;
  }


  public TitaniumRunCalculatorRequest dates(List<String> dates) {
    
    this.dates = dates;
    return this;
  }

  public TitaniumRunCalculatorRequest addDatesItem(String datesItem) {
    if (this.dates == null) {
      this.dates = new ArrayList<>();
    }
    this.dates.add(datesItem);
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDates() {
    return dates;
  }


  public void setDates(List<String> dates) {
    this.dates = dates;
  }


  public TitaniumRunCalculatorRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TitaniumRunCalculatorRequest traceName(String traceName) {
    
    this.traceName = traceName;
    return this;
  }

   /**
   * Get traceName
   * @return traceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTraceName() {
    return traceName;
  }


  public void setTraceName(String traceName) {
    this.traceName = traceName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumRunCalculatorRequest titaniumRunCalculatorRequest = (TitaniumRunCalculatorRequest) o;
    return Objects.equals(this.assetId, titaniumRunCalculatorRequest.assetId) &&
        Objects.equals(this.clients, titaniumRunCalculatorRequest.clients) &&
        Objects.equals(this.consensusRunReason, titaniumRunCalculatorRequest.consensusRunReason) &&
        Objects.equals(this.dates, titaniumRunCalculatorRequest.dates) &&
        Objects.equals(this.description, titaniumRunCalculatorRequest.description) &&
        Objects.equals(this.traceName, titaniumRunCalculatorRequest.traceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, clients, consensusRunReason, dates, description, traceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumRunCalculatorRequest {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    consensusRunReason: ").append(toIndentedString(consensusRunReason)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    traceName: ").append(toIndentedString(traceName)).append("\n");
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
    openapiFields.add("assetId");
    openapiFields.add("clients");
    openapiFields.add("consensusRunReason");
    openapiFields.add("dates");
    openapiFields.add("description");
    openapiFields.add("traceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumRunCalculatorRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumRunCalculatorRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumRunCalculatorRequest is not found in the empty JSON string", TitaniumRunCalculatorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumRunCalculatorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumRunCalculatorRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("clients") != null && !jsonObj.get("clients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `clients` to be an array in the JSON string but got `%s`", jsonObj.get("clients").toString()));
      }
      if (jsonObj.get("consensusRunReason") != null && !jsonObj.get("consensusRunReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consensusRunReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consensusRunReason").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("dates") != null && !jsonObj.get("dates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dates` to be an array in the JSON string but got `%s`", jsonObj.get("dates").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("traceName") != null && !jsonObj.get("traceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumRunCalculatorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumRunCalculatorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumRunCalculatorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumRunCalculatorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumRunCalculatorRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumRunCalculatorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumRunCalculatorRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumRunCalculatorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumRunCalculatorRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumRunCalculatorRequest
  */
  public static TitaniumRunCalculatorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumRunCalculatorRequest.class);
  }

 /**
  * Convert an instance of TitaniumRunCalculatorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
