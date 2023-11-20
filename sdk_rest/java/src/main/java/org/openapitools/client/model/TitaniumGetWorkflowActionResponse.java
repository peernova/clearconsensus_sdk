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
 * TitaniumGetWorkflowActionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:31:21.732898Z[UTC]")
public class TitaniumGetWorkflowActionResponse {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INPUT_ARGUMENTS = "inputArguments";
  @SerializedName(SERIALIZED_NAME_INPUT_ARGUMENTS)
  private List<String> inputArguments = null;

  public static final String SERIALIZED_NAME_OUTPUT_ARGUMENT = "outputArgument";
  @SerializedName(SERIALIZED_NAME_OUTPUT_ARGUMENT)
  private String outputArgument;

  public TitaniumGetWorkflowActionResponse() { 
  }

  public TitaniumGetWorkflowActionResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TitaniumGetWorkflowActionResponse inputArguments(List<String> inputArguments) {
    
    this.inputArguments = inputArguments;
    return this;
  }

  public TitaniumGetWorkflowActionResponse addInputArgumentsItem(String inputArgumentsItem) {
    if (this.inputArguments == null) {
      this.inputArguments = new ArrayList<>();
    }
    this.inputArguments.add(inputArgumentsItem);
    return this;
  }

   /**
   * Get inputArguments
   * @return inputArguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getInputArguments() {
    return inputArguments;
  }


  public void setInputArguments(List<String> inputArguments) {
    this.inputArguments = inputArguments;
  }


  public TitaniumGetWorkflowActionResponse outputArgument(String outputArgument) {
    
    this.outputArgument = outputArgument;
    return this;
  }

   /**
   * Get outputArgument
   * @return outputArgument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutputArgument() {
    return outputArgument;
  }


  public void setOutputArgument(String outputArgument) {
    this.outputArgument = outputArgument;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumGetWorkflowActionResponse titaniumGetWorkflowActionResponse = (TitaniumGetWorkflowActionResponse) o;
    return Objects.equals(this.description, titaniumGetWorkflowActionResponse.description) &&
        Objects.equals(this.inputArguments, titaniumGetWorkflowActionResponse.inputArguments) &&
        Objects.equals(this.outputArgument, titaniumGetWorkflowActionResponse.outputArgument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, inputArguments, outputArgument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumGetWorkflowActionResponse {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inputArguments: ").append(toIndentedString(inputArguments)).append("\n");
    sb.append("    outputArgument: ").append(toIndentedString(outputArgument)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("inputArguments");
    openapiFields.add("outputArgument");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumGetWorkflowActionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumGetWorkflowActionResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumGetWorkflowActionResponse is not found in the empty JSON string", TitaniumGetWorkflowActionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumGetWorkflowActionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumGetWorkflowActionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("inputArguments") != null && !jsonObj.get("inputArguments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputArguments` to be an array in the JSON string but got `%s`", jsonObj.get("inputArguments").toString()));
      }
      if (jsonObj.get("outputArgument") != null && !jsonObj.get("outputArgument").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputArgument` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outputArgument").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumGetWorkflowActionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumGetWorkflowActionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumGetWorkflowActionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumGetWorkflowActionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumGetWorkflowActionResponse>() {
           @Override
           public void write(JsonWriter out, TitaniumGetWorkflowActionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumGetWorkflowActionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumGetWorkflowActionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumGetWorkflowActionResponse
  * @throws IOException if the JSON string is invalid with respect to TitaniumGetWorkflowActionResponse
  */
  public static TitaniumGetWorkflowActionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumGetWorkflowActionResponse.class);
  }

 /**
  * Convert an instance of TitaniumGetWorkflowActionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

