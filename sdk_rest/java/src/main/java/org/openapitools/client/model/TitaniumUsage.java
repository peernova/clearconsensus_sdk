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
 * TitaniumUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:01:00.350127Z[UTC]")
public class TitaniumUsage {
  public static final String SERIALIZED_NAME_USAGE_NAME = "usageName";
  @SerializedName(SERIALIZED_NAME_USAGE_NAME)
  private String usageName;

  public static final String SERIALIZED_NAME_USAGE_TYPE = "usageType";
  @SerializedName(SERIALIZED_NAME_USAGE_TYPE)
  private String usageType;

  public TitaniumUsage() { 
  }

  public TitaniumUsage usageName(String usageName) {
    
    this.usageName = usageName;
    return this;
  }

   /**
   * Get usageName
   * @return usageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsageName() {
    return usageName;
  }


  public void setUsageName(String usageName) {
    this.usageName = usageName;
  }


  public TitaniumUsage usageType(String usageType) {
    
    this.usageType = usageType;
    return this;
  }

   /**
   * Get usageType
   * @return usageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsageType() {
    return usageType;
  }


  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumUsage titaniumUsage = (TitaniumUsage) o;
    return Objects.equals(this.usageName, titaniumUsage.usageName) &&
        Objects.equals(this.usageType, titaniumUsage.usageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usageName, usageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumUsage {\n");
    sb.append("    usageName: ").append(toIndentedString(usageName)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
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
    openapiFields.add("usageName");
    openapiFields.add("usageType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumUsage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumUsage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumUsage is not found in the empty JSON string", TitaniumUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumUsage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("usageName") != null && !jsonObj.get("usageName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usageName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usageName").toString()));
      }
      if (jsonObj.get("usageType") != null && !jsonObj.get("usageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usageType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumUsage>() {
           @Override
           public void write(JsonWriter out, TitaniumUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumUsage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumUsage
  * @throws IOException if the JSON string is invalid with respect to TitaniumUsage
  */
  public static TitaniumUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumUsage.class);
  }

 /**
  * Convert an instance of TitaniumUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

