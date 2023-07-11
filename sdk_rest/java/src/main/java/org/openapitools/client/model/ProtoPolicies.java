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
import org.openapitools.client.model.ProtoPolicyDto;

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
 * ProtoPolicies
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-10T17:17:04.398283Z[UTC]")
public class ProtoPolicies {
  public static final String SERIALIZED_NAME_POLICY_DTO = "policyDto";
  @SerializedName(SERIALIZED_NAME_POLICY_DTO)
  private List<ProtoPolicyDto> policyDto = null;

  public ProtoPolicies() { 
  }

  public ProtoPolicies policyDto(List<ProtoPolicyDto> policyDto) {
    
    this.policyDto = policyDto;
    return this;
  }

  public ProtoPolicies addPolicyDtoItem(ProtoPolicyDto policyDtoItem) {
    if (this.policyDto == null) {
      this.policyDto = new ArrayList<>();
    }
    this.policyDto.add(policyDtoItem);
    return this;
  }

   /**
   * Get policyDto
   * @return policyDto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProtoPolicyDto> getPolicyDto() {
    return policyDto;
  }


  public void setPolicyDto(List<ProtoPolicyDto> policyDto) {
    this.policyDto = policyDto;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtoPolicies protoPolicies = (ProtoPolicies) o;
    return Objects.equals(this.policyDto, protoPolicies.policyDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyDto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtoPolicies {\n");
    sb.append("    policyDto: ").append(toIndentedString(policyDto)).append("\n");
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
    openapiFields.add("policyDto");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProtoPolicies
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProtoPolicies.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProtoPolicies is not found in the empty JSON string", ProtoPolicies.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProtoPolicies.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProtoPolicies` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraypolicyDto = jsonObj.getAsJsonArray("policyDto");
      if (jsonArraypolicyDto != null) {
        // ensure the json data is an array
        if (!jsonObj.get("policyDto").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `policyDto` to be an array in the JSON string but got `%s`", jsonObj.get("policyDto").toString()));
        }

        // validate the optional field `policyDto` (array)
        for (int i = 0; i < jsonArraypolicyDto.size(); i++) {
          ProtoPolicyDto.validateJsonObject(jsonArraypolicyDto.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProtoPolicies.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProtoPolicies' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProtoPolicies> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProtoPolicies.class));

       return (TypeAdapter<T>) new TypeAdapter<ProtoPolicies>() {
           @Override
           public void write(JsonWriter out, ProtoPolicies value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProtoPolicies read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProtoPolicies given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProtoPolicies
  * @throws IOException if the JSON string is invalid with respect to ProtoPolicies
  */
  public static ProtoPolicies fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProtoPolicies.class);
  }

 /**
  * Convert an instance of ProtoPolicies to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
