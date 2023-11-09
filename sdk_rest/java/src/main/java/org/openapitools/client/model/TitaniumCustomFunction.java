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
import org.openapitools.client.model.TitaniumCustomFunctionUsage;

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
 * TitaniumCustomFunction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:54:23.319614Z[UTC]")
public class TitaniumCustomFunction {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DEFINITION = "definition";
  @SerializedName(SERIALIZED_NAME_DEFINITION)
  private String definition;

  public static final String SERIALIZED_NAME_DESCRIPTOR_NAME = "descriptorName";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR_NAME)
  private String descriptorName;

  public static final String SERIALIZED_NAME_DESCRIPTOR_TYPE = "descriptorType";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR_TYPE)
  private String descriptorType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OUTPUT_TYPE = "outputType";
  @SerializedName(SERIALIZED_NAME_OUTPUT_TYPE)
  private String outputType;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private List<TitaniumCustomFunctionUsage> usages = null;

  public TitaniumCustomFunction() { 
  }

  public TitaniumCustomFunction category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public TitaniumCustomFunction definition(String definition) {
    
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefinition() {
    return definition;
  }


  public void setDefinition(String definition) {
    this.definition = definition;
  }


  public TitaniumCustomFunction descriptorName(String descriptorName) {
    
    this.descriptorName = descriptorName;
    return this;
  }

   /**
   * Get descriptorName
   * @return descriptorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescriptorName() {
    return descriptorName;
  }


  public void setDescriptorName(String descriptorName) {
    this.descriptorName = descriptorName;
  }


  public TitaniumCustomFunction descriptorType(String descriptorType) {
    
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


  public TitaniumCustomFunction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TitaniumCustomFunction outputType(String outputType) {
    
    this.outputType = outputType;
    return this;
  }

   /**
   * Get outputType
   * @return outputType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutputType() {
    return outputType;
  }


  public void setOutputType(String outputType) {
    this.outputType = outputType;
  }


  public TitaniumCustomFunction scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public TitaniumCustomFunction uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public TitaniumCustomFunction usages(List<TitaniumCustomFunctionUsage> usages) {
    
    this.usages = usages;
    return this;
  }

  public TitaniumCustomFunction addUsagesItem(TitaniumCustomFunctionUsage usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * Get usages
   * @return usages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumCustomFunctionUsage> getUsages() {
    return usages;
  }


  public void setUsages(List<TitaniumCustomFunctionUsage> usages) {
    this.usages = usages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumCustomFunction titaniumCustomFunction = (TitaniumCustomFunction) o;
    return Objects.equals(this.category, titaniumCustomFunction.category) &&
        Objects.equals(this.definition, titaniumCustomFunction.definition) &&
        Objects.equals(this.descriptorName, titaniumCustomFunction.descriptorName) &&
        Objects.equals(this.descriptorType, titaniumCustomFunction.descriptorType) &&
        Objects.equals(this.name, titaniumCustomFunction.name) &&
        Objects.equals(this.outputType, titaniumCustomFunction.outputType) &&
        Objects.equals(this.scope, titaniumCustomFunction.scope) &&
        Objects.equals(this.uid, titaniumCustomFunction.uid) &&
        Objects.equals(this.usages, titaniumCustomFunction.usages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, definition, descriptorName, descriptorType, name, outputType, scope, uid, usages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumCustomFunction {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    descriptorName: ").append(toIndentedString(descriptorName)).append("\n");
    sb.append("    descriptorType: ").append(toIndentedString(descriptorType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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
    openapiFields.add("category");
    openapiFields.add("definition");
    openapiFields.add("descriptorName");
    openapiFields.add("descriptorType");
    openapiFields.add("name");
    openapiFields.add("outputType");
    openapiFields.add("scope");
    openapiFields.add("uid");
    openapiFields.add("usages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumCustomFunction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumCustomFunction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumCustomFunction is not found in the empty JSON string", TitaniumCustomFunction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumCustomFunction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumCustomFunction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("definition") != null && !jsonObj.get("definition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `definition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("definition").toString()));
      }
      if (jsonObj.get("descriptorName") != null && !jsonObj.get("descriptorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptorName").toString()));
      }
      if (jsonObj.get("descriptorType") != null && !jsonObj.get("descriptorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptorType").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("outputType") != null && !jsonObj.get("outputType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outputType").toString()));
      }
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if (jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
      JsonArray jsonArrayusages = jsonObj.getAsJsonArray("usages");
      if (jsonArrayusages != null) {
        // ensure the json data is an array
        if (!jsonObj.get("usages").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `usages` to be an array in the JSON string but got `%s`", jsonObj.get("usages").toString()));
        }

        // validate the optional field `usages` (array)
        for (int i = 0; i < jsonArrayusages.size(); i++) {
          TitaniumCustomFunctionUsage.validateJsonObject(jsonArrayusages.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumCustomFunction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumCustomFunction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumCustomFunction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumCustomFunction.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumCustomFunction>() {
           @Override
           public void write(JsonWriter out, TitaniumCustomFunction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumCustomFunction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumCustomFunction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumCustomFunction
  * @throws IOException if the JSON string is invalid with respect to TitaniumCustomFunction
  */
  public static TitaniumCustomFunction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumCustomFunction.class);
  }

 /**
  * Convert an instance of TitaniumCustomFunction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

