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
import org.openapitools.client.model.TitaniumRuleDefinition;

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
 * TitaniumCriteriaDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T10:30:15.521341Z[UTC]")
public class TitaniumCriteriaDefinition {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<String> metadata = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_VALIDATIONS = "validations";
  @SerializedName(SERIALIZED_NAME_VALIDATIONS)
  private List<TitaniumRuleDefinition> validations = null;

  public TitaniumCriteriaDefinition() { 
  }

  public TitaniumCriteriaDefinition description(String description) {
    
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


  public TitaniumCriteriaDefinition metadata(List<String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public TitaniumCriteriaDefinition addMetadataItem(String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<String> metadata) {
    this.metadata = metadata;
  }


  public TitaniumCriteriaDefinition name(String name) {
    
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


  public TitaniumCriteriaDefinition rule(String rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }


  public TitaniumCriteriaDefinition tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public TitaniumCriteriaDefinition addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public TitaniumCriteriaDefinition validations(List<TitaniumRuleDefinition> validations) {
    
    this.validations = validations;
    return this;
  }

  public TitaniumCriteriaDefinition addValidationsItem(TitaniumRuleDefinition validationsItem) {
    if (this.validations == null) {
      this.validations = new ArrayList<>();
    }
    this.validations.add(validationsItem);
    return this;
  }

   /**
   * Get validations
   * @return validations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumRuleDefinition> getValidations() {
    return validations;
  }


  public void setValidations(List<TitaniumRuleDefinition> validations) {
    this.validations = validations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumCriteriaDefinition titaniumCriteriaDefinition = (TitaniumCriteriaDefinition) o;
    return Objects.equals(this.description, titaniumCriteriaDefinition.description) &&
        Objects.equals(this.metadata, titaniumCriteriaDefinition.metadata) &&
        Objects.equals(this.name, titaniumCriteriaDefinition.name) &&
        Objects.equals(this.rule, titaniumCriteriaDefinition.rule) &&
        Objects.equals(this.tags, titaniumCriteriaDefinition.tags) &&
        Objects.equals(this.validations, titaniumCriteriaDefinition.validations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, metadata, name, rule, tags, validations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumCriteriaDefinition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    validations: ").append(toIndentedString(validations)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("rule");
    openapiFields.add("tags");
    openapiFields.add("validations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumCriteriaDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumCriteriaDefinition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumCriteriaDefinition is not found in the empty JSON string", TitaniumCriteriaDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumCriteriaDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumCriteriaDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("rule") != null && !jsonObj.get("rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      JsonArray jsonArrayvalidations = jsonObj.getAsJsonArray("validations");
      if (jsonArrayvalidations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("validations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `validations` to be an array in the JSON string but got `%s`", jsonObj.get("validations").toString()));
        }

        // validate the optional field `validations` (array)
        for (int i = 0; i < jsonArrayvalidations.size(); i++) {
          TitaniumRuleDefinition.validateJsonObject(jsonArrayvalidations.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumCriteriaDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumCriteriaDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumCriteriaDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumCriteriaDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumCriteriaDefinition>() {
           @Override
           public void write(JsonWriter out, TitaniumCriteriaDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumCriteriaDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumCriteriaDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumCriteriaDefinition
  * @throws IOException if the JSON string is invalid with respect to TitaniumCriteriaDefinition
  */
  public static TitaniumCriteriaDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumCriteriaDefinition.class);
  }

 /**
  * Convert an instance of TitaniumCriteriaDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

