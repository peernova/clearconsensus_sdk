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
import org.openapitools.client.model.TitaniumDynamicLut;
import org.openapitools.client.model.TitaniumErrorDefinition;

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
 * TitaniumRuleDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-18T10:44:48.827920Z[UTC]")
public class TitaniumRuleDefinition {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private TitaniumErrorDefinition error;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;

  public static final String SERIALIZED_NAME_LOOKUPTABLE = "lookuptable";
  @SerializedName(SERIALIZED_NAME_LOOKUPTABLE)
  private TitaniumDynamicLut lookuptable;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;

  public static final String SERIALIZED_NAME_RULE_TYPE = "ruleType";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private String ruleType;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public TitaniumRuleDefinition() { 
  }

  public TitaniumRuleDefinition description(String description) {
    
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


  public TitaniumRuleDefinition error(TitaniumErrorDefinition error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumErrorDefinition getError() {
    return error;
  }


  public void setError(TitaniumErrorDefinition error) {
    this.error = error;
  }


  public TitaniumRuleDefinition filter(String filter) {
    
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


  public TitaniumRuleDefinition lookuptable(TitaniumDynamicLut lookuptable) {
    
    this.lookuptable = lookuptable;
    return this;
  }

   /**
   * Get lookuptable
   * @return lookuptable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumDynamicLut getLookuptable() {
    return lookuptable;
  }


  public void setLookuptable(TitaniumDynamicLut lookuptable) {
    this.lookuptable = lookuptable;
  }


  public TitaniumRuleDefinition name(String name) {
    
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


  public TitaniumRuleDefinition rule(String rule) {
    
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


  public TitaniumRuleDefinition ruleType(String ruleType) {
    
    this.ruleType = ruleType;
    return this;
  }

   /**
   * Get ruleType
   * @return ruleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRuleType() {
    return ruleType;
  }


  public void setRuleType(String ruleType) {
    this.ruleType = ruleType;
  }


  public TitaniumRuleDefinition severity(Integer severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeverity() {
    return severity;
  }


  public void setSeverity(Integer severity) {
    this.severity = severity;
  }


  public TitaniumRuleDefinition tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public TitaniumRuleDefinition addTagsItem(String tagsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumRuleDefinition titaniumRuleDefinition = (TitaniumRuleDefinition) o;
    return Objects.equals(this.description, titaniumRuleDefinition.description) &&
        Objects.equals(this.error, titaniumRuleDefinition.error) &&
        Objects.equals(this.filter, titaniumRuleDefinition.filter) &&
        Objects.equals(this.lookuptable, titaniumRuleDefinition.lookuptable) &&
        Objects.equals(this.name, titaniumRuleDefinition.name) &&
        Objects.equals(this.rule, titaniumRuleDefinition.rule) &&
        Objects.equals(this.ruleType, titaniumRuleDefinition.ruleType) &&
        Objects.equals(this.severity, titaniumRuleDefinition.severity) &&
        Objects.equals(this.tags, titaniumRuleDefinition.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, error, filter, lookuptable, name, rule, ruleType, severity, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumRuleDefinition {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    lookuptable: ").append(toIndentedString(lookuptable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("filter");
    openapiFields.add("lookuptable");
    openapiFields.add("name");
    openapiFields.add("rule");
    openapiFields.add("ruleType");
    openapiFields.add("severity");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumRuleDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumRuleDefinition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumRuleDefinition is not found in the empty JSON string", TitaniumRuleDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumRuleDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumRuleDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `error`
      if (jsonObj.getAsJsonObject("error") != null) {
        TitaniumErrorDefinition.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filter").toString()));
      }
      // validate the optional field `lookuptable`
      if (jsonObj.getAsJsonObject("lookuptable") != null) {
        TitaniumDynamicLut.validateJsonObject(jsonObj.getAsJsonObject("lookuptable"));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("rule") != null && !jsonObj.get("rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule").toString()));
      }
      if (jsonObj.get("ruleType") != null && !jsonObj.get("ruleType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleType").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumRuleDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumRuleDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumRuleDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumRuleDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumRuleDefinition>() {
           @Override
           public void write(JsonWriter out, TitaniumRuleDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumRuleDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumRuleDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumRuleDefinition
  * @throws IOException if the JSON string is invalid with respect to TitaniumRuleDefinition
  */
  public static TitaniumRuleDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumRuleDefinition.class);
  }

 /**
  * Convert an instance of TitaniumRuleDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

