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
import org.openapitools.client.model.ProtoSearchCriteriaLimit;
import org.openapitools.client.model.ProtoSearchCriteriaOrderBy;

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
 * ProtoSearchCriteria
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class ProtoSearchCriteria {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private ProtoSearchCriteriaLimit limit;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private ProtoSearchCriteriaOrderBy orderBy;

  public ProtoSearchCriteria() { 
  }

  public ProtoSearchCriteria filter(String filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFilter() {
    return filter;
  }


  public void setFilter(String filter) {
    this.filter = filter;
  }


  public ProtoSearchCriteria limit(ProtoSearchCriteriaLimit limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProtoSearchCriteriaLimit getLimit() {
    return limit;
  }


  public void setLimit(ProtoSearchCriteriaLimit limit) {
    this.limit = limit;
  }


  public ProtoSearchCriteria offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public ProtoSearchCriteria orderBy(ProtoSearchCriteriaOrderBy orderBy) {
    
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProtoSearchCriteriaOrderBy getOrderBy() {
    return orderBy;
  }


  public void setOrderBy(ProtoSearchCriteriaOrderBy orderBy) {
    this.orderBy = orderBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtoSearchCriteria protoSearchCriteria = (ProtoSearchCriteria) o;
    return Objects.equals(this.filter, protoSearchCriteria.filter) &&
        Objects.equals(this.limit, protoSearchCriteria.limit) &&
        Objects.equals(this.offset, protoSearchCriteria.offset) &&
        Objects.equals(this.orderBy, protoSearchCriteria.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, limit, offset, orderBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtoSearchCriteria {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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
    openapiFields.add("filter");
    openapiFields.add("limit");
    openapiFields.add("offset");
    openapiFields.add("orderBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProtoSearchCriteria
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProtoSearchCriteria.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProtoSearchCriteria is not found in the empty JSON string", ProtoSearchCriteria.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProtoSearchCriteria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProtoSearchCriteria` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // validate the optional field `limit`
      if (jsonObj.getAsJsonObject("limit") != null) {
        ProtoSearchCriteriaLimit.validateJsonObject(jsonObj.getAsJsonObject("limit"));
      }
      // validate the optional field `orderBy`
      if (jsonObj.getAsJsonObject("orderBy") != null) {
        ProtoSearchCriteriaOrderBy.validateJsonObject(jsonObj.getAsJsonObject("orderBy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProtoSearchCriteria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProtoSearchCriteria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProtoSearchCriteria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProtoSearchCriteria.class));

       return (TypeAdapter<T>) new TypeAdapter<ProtoSearchCriteria>() {
           @Override
           public void write(JsonWriter out, ProtoSearchCriteria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProtoSearchCriteria read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProtoSearchCriteria given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProtoSearchCriteria
  * @throws IOException if the JSON string is invalid with respect to ProtoSearchCriteria
  */
  public static ProtoSearchCriteria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProtoSearchCriteria.class);
  }

 /**
  * Convert an instance of ProtoSearchCriteria to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

