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
import org.openapitools.client.model.TitaniumColumnInfo;
import org.openapitools.client.model.TitaniumPage;
import org.openapitools.client.model.TitaniumValuesRow;

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
 * TitaniumConsensusResultSetValues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:27:45.570258Z[UTC]")
public class TitaniumConsensusResultSetValues {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<TitaniumColumnInfo> columns = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private TitaniumPage page;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<TitaniumValuesRow> rows = null;

  public TitaniumConsensusResultSetValues() { 
  }

  public TitaniumConsensusResultSetValues columns(List<TitaniumColumnInfo> columns) {
    
    this.columns = columns;
    return this;
  }

  public TitaniumConsensusResultSetValues addColumnsItem(TitaniumColumnInfo columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumColumnInfo> getColumns() {
    return columns;
  }


  public void setColumns(List<TitaniumColumnInfo> columns) {
    this.columns = columns;
  }


  public TitaniumConsensusResultSetValues page(TitaniumPage page) {
    
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumPage getPage() {
    return page;
  }


  public void setPage(TitaniumPage page) {
    this.page = page;
  }


  public TitaniumConsensusResultSetValues rows(List<TitaniumValuesRow> rows) {
    
    this.rows = rows;
    return this;
  }

  public TitaniumConsensusResultSetValues addRowsItem(TitaniumValuesRow rowsItem) {
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

  public List<TitaniumValuesRow> getRows() {
    return rows;
  }


  public void setRows(List<TitaniumValuesRow> rows) {
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
    TitaniumConsensusResultSetValues titaniumConsensusResultSetValues = (TitaniumConsensusResultSetValues) o;
    return Objects.equals(this.columns, titaniumConsensusResultSetValues.columns) &&
        Objects.equals(this.page, titaniumConsensusResultSetValues.page) &&
        Objects.equals(this.rows, titaniumConsensusResultSetValues.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, page, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumConsensusResultSetValues {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
    openapiFields.add("columns");
    openapiFields.add("page");
    openapiFields.add("rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumConsensusResultSetValues
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumConsensusResultSetValues.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumConsensusResultSetValues is not found in the empty JSON string", TitaniumConsensusResultSetValues.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumConsensusResultSetValues.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumConsensusResultSetValues` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
      if (jsonArraycolumns != null) {
        // ensure the json data is an array
        if (!jsonObj.get("columns").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
        }

        // validate the optional field `columns` (array)
        for (int i = 0; i < jsonArraycolumns.size(); i++) {
          TitaniumColumnInfo.validateJsonObject(jsonArraycolumns.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `page`
      if (jsonObj.getAsJsonObject("page") != null) {
        TitaniumPage.validateJsonObject(jsonObj.getAsJsonObject("page"));
      }
      JsonArray jsonArrayrows = jsonObj.getAsJsonArray("rows");
      if (jsonArrayrows != null) {
        // ensure the json data is an array
        if (!jsonObj.get("rows").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
        }

        // validate the optional field `rows` (array)
        for (int i = 0; i < jsonArrayrows.size(); i++) {
          TitaniumValuesRow.validateJsonObject(jsonArrayrows.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumConsensusResultSetValues.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumConsensusResultSetValues' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumConsensusResultSetValues> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumConsensusResultSetValues.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumConsensusResultSetValues>() {
           @Override
           public void write(JsonWriter out, TitaniumConsensusResultSetValues value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumConsensusResultSetValues read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumConsensusResultSetValues given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumConsensusResultSetValues
  * @throws IOException if the JSON string is invalid with respect to TitaniumConsensusResultSetValues
  */
  public static TitaniumConsensusResultSetValues fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumConsensusResultSetValues.class);
  }

 /**
  * Convert an instance of TitaniumConsensusResultSetValues to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

