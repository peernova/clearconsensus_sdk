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
 * TitaniumSubmissionColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:38:32.244224Z[UTC]")
public class TitaniumSubmissionColumn {
  public static final String SERIALIZED_NAME_SUBMISSION_PRICE = "submissionPrice";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_PRICE)
  private Object submissionPrice;

  public TitaniumSubmissionColumn() { 
  }

  public TitaniumSubmissionColumn submissionPrice(Object submissionPrice) {
    
    this.submissionPrice = submissionPrice;
    return this;
  }

   /**
   * Get submissionPrice
   * @return submissionPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSubmissionPrice() {
    return submissionPrice;
  }


  public void setSubmissionPrice(Object submissionPrice) {
    this.submissionPrice = submissionPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumSubmissionColumn titaniumSubmissionColumn = (TitaniumSubmissionColumn) o;
    return Objects.equals(this.submissionPrice, titaniumSubmissionColumn.submissionPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumSubmissionColumn {\n");
    sb.append("    submissionPrice: ").append(toIndentedString(submissionPrice)).append("\n");
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
    openapiFields.add("submissionPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumSubmissionColumn
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumSubmissionColumn.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumSubmissionColumn is not found in the empty JSON string", TitaniumSubmissionColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumSubmissionColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumSubmissionColumn` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumSubmissionColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumSubmissionColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumSubmissionColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumSubmissionColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumSubmissionColumn>() {
           @Override
           public void write(JsonWriter out, TitaniumSubmissionColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumSubmissionColumn read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumSubmissionColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumSubmissionColumn
  * @throws IOException if the JSON string is invalid with respect to TitaniumSubmissionColumn
  */
  public static TitaniumSubmissionColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumSubmissionColumn.class);
  }

 /**
  * Convert an instance of TitaniumSubmissionColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

