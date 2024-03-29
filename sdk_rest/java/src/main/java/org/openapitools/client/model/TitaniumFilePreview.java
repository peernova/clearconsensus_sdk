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
import org.openapitools.client.model.TitaniumDescriptorDefinition;
import org.openapitools.client.model.TitaniumFileDelimiterSetting;

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
 * TitaniumFilePreview
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumFilePreview {
  public static final String SERIALIZED_NAME_DELIMITER_SETTING = "delimiterSetting";
  @SerializedName(SERIALIZED_NAME_DELIMITER_SETTING)
  private TitaniumFileDelimiterSetting delimiterSetting;

  public static final String SERIALIZED_NAME_DESCRIPTOR_DEFINITION = "descriptorDefinition";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR_DEFINITION)
  private TitaniumDescriptorDefinition descriptorDefinition;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<Object> rows = null;

  public TitaniumFilePreview() { 
  }

  public TitaniumFilePreview delimiterSetting(TitaniumFileDelimiterSetting delimiterSetting) {
    
    this.delimiterSetting = delimiterSetting;
    return this;
  }

   /**
   * Get delimiterSetting
   * @return delimiterSetting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumFileDelimiterSetting getDelimiterSetting() {
    return delimiterSetting;
  }


  public void setDelimiterSetting(TitaniumFileDelimiterSetting delimiterSetting) {
    this.delimiterSetting = delimiterSetting;
  }


  public TitaniumFilePreview descriptorDefinition(TitaniumDescriptorDefinition descriptorDefinition) {
    
    this.descriptorDefinition = descriptorDefinition;
    return this;
  }

   /**
   * Get descriptorDefinition
   * @return descriptorDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumDescriptorDefinition getDescriptorDefinition() {
    return descriptorDefinition;
  }


  public void setDescriptorDefinition(TitaniumDescriptorDefinition descriptorDefinition) {
    this.descriptorDefinition = descriptorDefinition;
  }


  public TitaniumFilePreview rows(List<Object> rows) {
    
    this.rows = rows;
    return this;
  }

  public TitaniumFilePreview addRowsItem(Object rowsItem) {
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

  public List<Object> getRows() {
    return rows;
  }


  public void setRows(List<Object> rows) {
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
    TitaniumFilePreview titaniumFilePreview = (TitaniumFilePreview) o;
    return Objects.equals(this.delimiterSetting, titaniumFilePreview.delimiterSetting) &&
        Objects.equals(this.descriptorDefinition, titaniumFilePreview.descriptorDefinition) &&
        Objects.equals(this.rows, titaniumFilePreview.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delimiterSetting, descriptorDefinition, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumFilePreview {\n");
    sb.append("    delimiterSetting: ").append(toIndentedString(delimiterSetting)).append("\n");
    sb.append("    descriptorDefinition: ").append(toIndentedString(descriptorDefinition)).append("\n");
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
    openapiFields.add("delimiterSetting");
    openapiFields.add("descriptorDefinition");
    openapiFields.add("rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumFilePreview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumFilePreview.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumFilePreview is not found in the empty JSON string", TitaniumFilePreview.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumFilePreview.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumFilePreview` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `delimiterSetting`
      if (jsonObj.getAsJsonObject("delimiterSetting") != null) {
        TitaniumFileDelimiterSetting.validateJsonObject(jsonObj.getAsJsonObject("delimiterSetting"));
      }
      // validate the optional field `descriptorDefinition`
      if (jsonObj.getAsJsonObject("descriptorDefinition") != null) {
        TitaniumDescriptorDefinition.validateJsonObject(jsonObj.getAsJsonObject("descriptorDefinition"));
      }
      // ensure the json data is an array
      if (jsonObj.get("rows") != null && !jsonObj.get("rows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumFilePreview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumFilePreview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumFilePreview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumFilePreview.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumFilePreview>() {
           @Override
           public void write(JsonWriter out, TitaniumFilePreview value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumFilePreview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumFilePreview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumFilePreview
  * @throws IOException if the JSON string is invalid with respect to TitaniumFilePreview
  */
  public static TitaniumFilePreview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumFilePreview.class);
  }

 /**
  * Convert an instance of TitaniumFilePreview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

