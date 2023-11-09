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
import org.openapitools.client.model.TitaniumGetDefinition;

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
 * TitaniumCustomFunctionGetDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T10:27:52.648843Z[UTC]")
public class TitaniumCustomFunctionGetDefinition {
  public static final String SERIALIZED_NAME_DESCRIPTOR_TYPE = "descriptorType";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR_TYPE)
  private String descriptorType;

  public static final String SERIALIZED_NAME_ID_SCOPE = "idScope";
  @SerializedName(SERIALIZED_NAME_ID_SCOPE)
  private TitaniumGetDefinition idScope;

  public TitaniumCustomFunctionGetDefinition() { 
  }

  public TitaniumCustomFunctionGetDefinition descriptorType(String descriptorType) {
    
    this.descriptorType = descriptorType;
    return this;
  }

   /**
   * Get descriptorType
   * @return descriptorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptorType() {
    return descriptorType;
  }


  public void setDescriptorType(String descriptorType) {
    this.descriptorType = descriptorType;
  }


  public TitaniumCustomFunctionGetDefinition idScope(TitaniumGetDefinition idScope) {
    
    this.idScope = idScope;
    return this;
  }

   /**
   * Get idScope
   * @return idScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumGetDefinition getIdScope() {
    return idScope;
  }


  public void setIdScope(TitaniumGetDefinition idScope) {
    this.idScope = idScope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumCustomFunctionGetDefinition titaniumCustomFunctionGetDefinition = (TitaniumCustomFunctionGetDefinition) o;
    return Objects.equals(this.descriptorType, titaniumCustomFunctionGetDefinition.descriptorType) &&
        Objects.equals(this.idScope, titaniumCustomFunctionGetDefinition.idScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptorType, idScope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumCustomFunctionGetDefinition {\n");
    sb.append("    descriptorType: ").append(toIndentedString(descriptorType)).append("\n");
    sb.append("    idScope: ").append(toIndentedString(idScope)).append("\n");
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
    openapiFields.add("descriptorType");
    openapiFields.add("idScope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumCustomFunctionGetDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumCustomFunctionGetDefinition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumCustomFunctionGetDefinition is not found in the empty JSON string", TitaniumCustomFunctionGetDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumCustomFunctionGetDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumCustomFunctionGetDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("descriptorType") != null && !jsonObj.get("descriptorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptorType").toString()));
      }
      // validate the optional field `idScope`
      if (jsonObj.getAsJsonObject("idScope") != null) {
        TitaniumGetDefinition.validateJsonObject(jsonObj.getAsJsonObject("idScope"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumCustomFunctionGetDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumCustomFunctionGetDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumCustomFunctionGetDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumCustomFunctionGetDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumCustomFunctionGetDefinition>() {
           @Override
           public void write(JsonWriter out, TitaniumCustomFunctionGetDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumCustomFunctionGetDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumCustomFunctionGetDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumCustomFunctionGetDefinition
  * @throws IOException if the JSON string is invalid with respect to TitaniumCustomFunctionGetDefinition
  */
  public static TitaniumCustomFunctionGetDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumCustomFunctionGetDefinition.class);
  }

 /**
  * Convert an instance of TitaniumCustomFunctionGetDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

