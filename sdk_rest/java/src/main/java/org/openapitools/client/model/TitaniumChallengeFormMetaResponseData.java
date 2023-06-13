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
import org.openapitools.client.model.TitaniumChallengeFormGeneralRow;
import org.openapitools.client.model.TitaniumChallengeFormOneOfFields;

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
 * TitaniumChallengeFormMetaResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-13T15:25:10.766422Z[UTC]")
public class TitaniumChallengeFormMetaResponseData {
  public static final String SERIALIZED_NAME_ONE_OF_FIELDS = "oneOfFields";
  @SerializedName(SERIALIZED_NAME_ONE_OF_FIELDS)
  private List<TitaniumChallengeFormOneOfFields> oneOfFields = null;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<TitaniumChallengeFormGeneralRow> rows = null;

  public TitaniumChallengeFormMetaResponseData() { 
  }

  public TitaniumChallengeFormMetaResponseData oneOfFields(List<TitaniumChallengeFormOneOfFields> oneOfFields) {
    
    this.oneOfFields = oneOfFields;
    return this;
  }

  public TitaniumChallengeFormMetaResponseData addOneOfFieldsItem(TitaniumChallengeFormOneOfFields oneOfFieldsItem) {
    if (this.oneOfFields == null) {
      this.oneOfFields = new ArrayList<>();
    }
    this.oneOfFields.add(oneOfFieldsItem);
    return this;
  }

   /**
   * Get oneOfFields
   * @return oneOfFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumChallengeFormOneOfFields> getOneOfFields() {
    return oneOfFields;
  }


  public void setOneOfFields(List<TitaniumChallengeFormOneOfFields> oneOfFields) {
    this.oneOfFields = oneOfFields;
  }


  public TitaniumChallengeFormMetaResponseData rows(List<TitaniumChallengeFormGeneralRow> rows) {
    
    this.rows = rows;
    return this;
  }

  public TitaniumChallengeFormMetaResponseData addRowsItem(TitaniumChallengeFormGeneralRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumChallengeFormGeneralRow> getRows() {
    return rows;
  }


  public void setRows(List<TitaniumChallengeFormGeneralRow> rows) {
    this.rows = rows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumChallengeFormMetaResponseData titaniumChallengeFormMetaResponseData = (TitaniumChallengeFormMetaResponseData) o;
    return Objects.equals(this.oneOfFields, titaniumChallengeFormMetaResponseData.oneOfFields) &&
        Objects.equals(this.rows, titaniumChallengeFormMetaResponseData.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneOfFields, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumChallengeFormMetaResponseData {\n");
    sb.append("    oneOfFields: ").append(toIndentedString(oneOfFields)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
    openapiFields.add("oneOfFields");
    openapiFields.add("rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumChallengeFormMetaResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumChallengeFormMetaResponseData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumChallengeFormMetaResponseData is not found in the empty JSON string", TitaniumChallengeFormMetaResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumChallengeFormMetaResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumChallengeFormMetaResponseData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayoneOfFields = jsonObj.getAsJsonArray("oneOfFields");
      if (jsonArrayoneOfFields != null) {
        // ensure the json data is an array
        if (!jsonObj.get("oneOfFields").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `oneOfFields` to be an array in the JSON string but got `%s`", jsonObj.get("oneOfFields").toString()));
        }

        // validate the optional field `oneOfFields` (array)
        for (int i = 0; i < jsonArrayoneOfFields.size(); i++) {
          TitaniumChallengeFormOneOfFields.validateJsonObject(jsonArrayoneOfFields.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayrows = jsonObj.getAsJsonArray("rows");
      if (jsonArrayrows != null) {
        // ensure the json data is an array
        if (!jsonObj.get("rows").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
        }

        // validate the optional field `rows` (array)
        for (int i = 0; i < jsonArrayrows.size(); i++) {
          TitaniumChallengeFormGeneralRow.validateJsonObject(jsonArrayrows.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumChallengeFormMetaResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumChallengeFormMetaResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumChallengeFormMetaResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumChallengeFormMetaResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumChallengeFormMetaResponseData>() {
           @Override
           public void write(JsonWriter out, TitaniumChallengeFormMetaResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumChallengeFormMetaResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumChallengeFormMetaResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumChallengeFormMetaResponseData
  * @throws IOException if the JSON string is invalid with respect to TitaniumChallengeFormMetaResponseData
  */
  public static TitaniumChallengeFormMetaResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumChallengeFormMetaResponseData.class);
  }

 /**
  * Convert an instance of TitaniumChallengeFormMetaResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

