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
 * TitaniumOrderBy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-18T10:44:48.827920Z[UTC]")
public class TitaniumOrderBy {
  public static final String SERIALIZED_NAME_COLUMN = "column";
  @SerializedName(SERIALIZED_NAME_COLUMN)
  private String column;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private String order;

  public TitaniumOrderBy() { 
  }

  public TitaniumOrderBy column(String column) {
    
    this.column = column;
    return this;
  }

   /**
   * Get column
   * @return column
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getColumn() {
    return column;
  }


  public void setColumn(String column) {
    this.column = column;
  }


  public TitaniumOrderBy order(String order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrder() {
    return order;
  }


  public void setOrder(String order) {
    this.order = order;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumOrderBy titaniumOrderBy = (TitaniumOrderBy) o;
    return Objects.equals(this.column, titaniumOrderBy.column) &&
        Objects.equals(this.order, titaniumOrderBy.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumOrderBy {\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
    openapiFields.add("column");
    openapiFields.add("order");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumOrderBy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumOrderBy.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumOrderBy is not found in the empty JSON string", TitaniumOrderBy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumOrderBy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumOrderBy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("column") != null && !jsonObj.get("column").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `column` to be a primitive type in the JSON string but got `%s`", jsonObj.get("column").toString()));
      }
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumOrderBy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumOrderBy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumOrderBy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumOrderBy.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumOrderBy>() {
           @Override
           public void write(JsonWriter out, TitaniumOrderBy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumOrderBy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumOrderBy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumOrderBy
  * @throws IOException if the JSON string is invalid with respect to TitaniumOrderBy
  */
  public static TitaniumOrderBy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumOrderBy.class);
  }

 /**
  * Convert an instance of TitaniumOrderBy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

