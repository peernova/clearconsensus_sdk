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
import org.openapitools.client.model.ProtoGroupPolicyDto;

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
 * ProtoGroupPolicies
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-14T17:50:41.602636Z[UTC]")
public class ProtoGroupPolicies {
  public static final String SERIALIZED_NAME_GROUP_POLICY = "groupPolicy";
  @SerializedName(SERIALIZED_NAME_GROUP_POLICY)
  private List<ProtoGroupPolicyDto> groupPolicy = null;

  public ProtoGroupPolicies() { 
  }

  public ProtoGroupPolicies groupPolicy(List<ProtoGroupPolicyDto> groupPolicy) {
    
    this.groupPolicy = groupPolicy;
    return this;
  }

  public ProtoGroupPolicies addGroupPolicyItem(ProtoGroupPolicyDto groupPolicyItem) {
    if (this.groupPolicy == null) {
      this.groupPolicy = new ArrayList<>();
    }
    this.groupPolicy.add(groupPolicyItem);
    return this;
  }

   /**
   * Get groupPolicy
   * @return groupPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProtoGroupPolicyDto> getGroupPolicy() {
    return groupPolicy;
  }


  public void setGroupPolicy(List<ProtoGroupPolicyDto> groupPolicy) {
    this.groupPolicy = groupPolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtoGroupPolicies protoGroupPolicies = (ProtoGroupPolicies) o;
    return Objects.equals(this.groupPolicy, protoGroupPolicies.groupPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtoGroupPolicies {\n");
    sb.append("    groupPolicy: ").append(toIndentedString(groupPolicy)).append("\n");
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
    openapiFields.add("groupPolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProtoGroupPolicies
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProtoGroupPolicies.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProtoGroupPolicies is not found in the empty JSON string", ProtoGroupPolicies.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProtoGroupPolicies.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProtoGroupPolicies` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraygroupPolicy = jsonObj.getAsJsonArray("groupPolicy");
      if (jsonArraygroupPolicy != null) {
        // ensure the json data is an array
        if (!jsonObj.get("groupPolicy").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `groupPolicy` to be an array in the JSON string but got `%s`", jsonObj.get("groupPolicy").toString()));
        }

        // validate the optional field `groupPolicy` (array)
        for (int i = 0; i < jsonArraygroupPolicy.size(); i++) {
          ProtoGroupPolicyDto.validateJsonObject(jsonArraygroupPolicy.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProtoGroupPolicies.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProtoGroupPolicies' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProtoGroupPolicies> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProtoGroupPolicies.class));

       return (TypeAdapter<T>) new TypeAdapter<ProtoGroupPolicies>() {
           @Override
           public void write(JsonWriter out, ProtoGroupPolicies value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProtoGroupPolicies read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProtoGroupPolicies given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProtoGroupPolicies
  * @throws IOException if the JSON string is invalid with respect to ProtoGroupPolicies
  */
  public static ProtoGroupPolicies fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProtoGroupPolicies.class);
  }

 /**
  * Convert an instance of ProtoGroupPolicies to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

