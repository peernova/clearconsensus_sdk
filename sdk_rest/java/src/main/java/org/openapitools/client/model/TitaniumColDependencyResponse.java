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
import org.openapitools.client.model.TitaniumColDependency;

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
 * TitaniumColDependencyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T09:47:12.614194Z[UTC]")
public class TitaniumColDependencyResponse {
  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<TitaniumColDependency> dependencies = null;

  public TitaniumColDependencyResponse() { 
  }

  public TitaniumColDependencyResponse dependencies(List<TitaniumColDependency> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public TitaniumColDependencyResponse addDependenciesItem(TitaniumColDependency dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Get dependencies
   * @return dependencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumColDependency> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<TitaniumColDependency> dependencies) {
    this.dependencies = dependencies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumColDependencyResponse titaniumColDependencyResponse = (TitaniumColDependencyResponse) o;
    return Objects.equals(this.dependencies, titaniumColDependencyResponse.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumColDependencyResponse {\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
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
    openapiFields.add("dependencies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumColDependencyResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumColDependencyResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumColDependencyResponse is not found in the empty JSON string", TitaniumColDependencyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumColDependencyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumColDependencyResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraydependencies = jsonObj.getAsJsonArray("dependencies");
      if (jsonArraydependencies != null) {
        // ensure the json data is an array
        if (!jsonObj.get("dependencies").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `dependencies` to be an array in the JSON string but got `%s`", jsonObj.get("dependencies").toString()));
        }

        // validate the optional field `dependencies` (array)
        for (int i = 0; i < jsonArraydependencies.size(); i++) {
          TitaniumColDependency.validateJsonObject(jsonArraydependencies.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumColDependencyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumColDependencyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumColDependencyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumColDependencyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumColDependencyResponse>() {
           @Override
           public void write(JsonWriter out, TitaniumColDependencyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumColDependencyResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumColDependencyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumColDependencyResponse
  * @throws IOException if the JSON string is invalid with respect to TitaniumColDependencyResponse
  */
  public static TitaniumColDependencyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumColDependencyResponse.class);
  }

 /**
  * Convert an instance of TitaniumColDependencyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
