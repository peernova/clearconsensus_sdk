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
 * TitaniumKVAsset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-12T16:18:26.451720Z[UTC]")
public class TitaniumKVAsset {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;

  public static final String SERIALIZED_NAME_TTL_DATE = "ttlDate";
  @SerializedName(SERIALIZED_NAME_TTL_DATE)
  private String ttlDate;

  public static final String SERIALIZED_NAME_TTL_FROM = "ttlFrom";
  @SerializedName(SERIALIZED_NAME_TTL_FROM)
  private String ttlFrom;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;

  public TitaniumKVAsset() { 
  }

  public TitaniumKVAsset key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TitaniumKVAsset ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  public TitaniumKVAsset ttlDate(String ttlDate) {
    
    this.ttlDate = ttlDate;
    return this;
  }

   /**
   * Get ttlDate
   * @return ttlDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTtlDate() {
    return ttlDate;
  }


  public void setTtlDate(String ttlDate) {
    this.ttlDate = ttlDate;
  }


  public TitaniumKVAsset ttlFrom(String ttlFrom) {
    
    this.ttlFrom = ttlFrom;
    return this;
  }

   /**
   * Get ttlFrom
   * @return ttlFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTtlFrom() {
    return ttlFrom;
  }


  public void setTtlFrom(String ttlFrom) {
    this.ttlFrom = ttlFrom;
  }


  public TitaniumKVAsset value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumKVAsset titaniumKVAsset = (TitaniumKVAsset) o;
    return Objects.equals(this.key, titaniumKVAsset.key) &&
        Objects.equals(this.ttl, titaniumKVAsset.ttl) &&
        Objects.equals(this.ttlDate, titaniumKVAsset.ttlDate) &&
        Objects.equals(this.ttlFrom, titaniumKVAsset.ttlFrom) &&
        Objects.equals(this.value, titaniumKVAsset.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, ttl, ttlDate, ttlFrom, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumKVAsset {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    ttlDate: ").append(toIndentedString(ttlDate)).append("\n");
    sb.append("    ttlFrom: ").append(toIndentedString(ttlFrom)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("ttl");
    openapiFields.add("ttlDate");
    openapiFields.add("ttlFrom");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumKVAsset
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumKVAsset.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumKVAsset is not found in the empty JSON string", TitaniumKVAsset.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumKVAsset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumKVAsset` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
      if (jsonObj.get("ttlDate") != null && !jsonObj.get("ttlDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttlDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttlDate").toString()));
      }
      if (jsonObj.get("ttlFrom") != null && !jsonObj.get("ttlFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttlFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttlFrom").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumKVAsset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumKVAsset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumKVAsset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumKVAsset.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumKVAsset>() {
           @Override
           public void write(JsonWriter out, TitaniumKVAsset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumKVAsset read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumKVAsset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumKVAsset
  * @throws IOException if the JSON string is invalid with respect to TitaniumKVAsset
  */
  public static TitaniumKVAsset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumKVAsset.class);
  }

 /**
  * Convert an instance of TitaniumKVAsset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
