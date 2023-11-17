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
import java.math.BigDecimal;

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
 * TitaniumEvpAnchorDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:33:01.612151Z[UTC]")
public class TitaniumEvpAnchorDetails {
  public static final String SERIALIZED_NAME_DISTANCE_TO_CONSENSUS = "distanceToConsensus";
  @SerializedName(SERIALIZED_NAME_DISTANCE_TO_CONSENSUS)
  private BigDecimal distanceToConsensus;

  public static final String SERIALIZED_NAME_MID = "mid";
  @SerializedName(SERIALIZED_NAME_MID)
  private Object mid;

  public static final String SERIALIZED_NAME_MID_CALCULATED = "midCalculated";
  @SerializedName(SERIALIZED_NAME_MID_CALCULATED)
  private Object midCalculated;

  public TitaniumEvpAnchorDetails() { 
  }

  public TitaniumEvpAnchorDetails distanceToConsensus(BigDecimal distanceToConsensus) {
    
    this.distanceToConsensus = distanceToConsensus;
    return this;
  }

   /**
   * Get distanceToConsensus
   * @return distanceToConsensus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDistanceToConsensus() {
    return distanceToConsensus;
  }


  public void setDistanceToConsensus(BigDecimal distanceToConsensus) {
    this.distanceToConsensus = distanceToConsensus;
  }


  public TitaniumEvpAnchorDetails mid(Object mid) {
    
    this.mid = mid;
    return this;
  }

   /**
   * Get mid
   * @return mid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMid() {
    return mid;
  }


  public void setMid(Object mid) {
    this.mid = mid;
  }


  public TitaniumEvpAnchorDetails midCalculated(Object midCalculated) {
    
    this.midCalculated = midCalculated;
    return this;
  }

   /**
   * Get midCalculated
   * @return midCalculated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMidCalculated() {
    return midCalculated;
  }


  public void setMidCalculated(Object midCalculated) {
    this.midCalculated = midCalculated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumEvpAnchorDetails titaniumEvpAnchorDetails = (TitaniumEvpAnchorDetails) o;
    return Objects.equals(this.distanceToConsensus, titaniumEvpAnchorDetails.distanceToConsensus) &&
        Objects.equals(this.mid, titaniumEvpAnchorDetails.mid) &&
        Objects.equals(this.midCalculated, titaniumEvpAnchorDetails.midCalculated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceToConsensus, mid, midCalculated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumEvpAnchorDetails {\n");
    sb.append("    distanceToConsensus: ").append(toIndentedString(distanceToConsensus)).append("\n");
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    midCalculated: ").append(toIndentedString(midCalculated)).append("\n");
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
    openapiFields.add("distanceToConsensus");
    openapiFields.add("mid");
    openapiFields.add("midCalculated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumEvpAnchorDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumEvpAnchorDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumEvpAnchorDetails is not found in the empty JSON string", TitaniumEvpAnchorDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumEvpAnchorDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumEvpAnchorDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumEvpAnchorDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumEvpAnchorDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumEvpAnchorDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumEvpAnchorDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumEvpAnchorDetails>() {
           @Override
           public void write(JsonWriter out, TitaniumEvpAnchorDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumEvpAnchorDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumEvpAnchorDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumEvpAnchorDetails
  * @throws IOException if the JSON string is invalid with respect to TitaniumEvpAnchorDetails
  */
  public static TitaniumEvpAnchorDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumEvpAnchorDetails.class);
  }

 /**
  * Convert an instance of TitaniumEvpAnchorDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

