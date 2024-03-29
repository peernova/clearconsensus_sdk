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
 * TitaniumDescriptorPairBasedIdentifier
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumDescriptorPairBasedIdentifier {
  public static final String SERIALIZED_NAME_DEST_DESCRIPTOR = "destDescriptor";
  @SerializedName(SERIALIZED_NAME_DEST_DESCRIPTOR)
  private String destDescriptor;

  public static final String SERIALIZED_NAME_SRC_DESCRIPTOR = "srcDescriptor";
  @SerializedName(SERIALIZED_NAME_SRC_DESCRIPTOR)
  private String srcDescriptor;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public TitaniumDescriptorPairBasedIdentifier() { 
  }

  public TitaniumDescriptorPairBasedIdentifier destDescriptor(String destDescriptor) {
    
    this.destDescriptor = destDescriptor;
    return this;
  }

   /**
   * Get destDescriptor
   * @return destDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestDescriptor() {
    return destDescriptor;
  }


  public void setDestDescriptor(String destDescriptor) {
    this.destDescriptor = destDescriptor;
  }


  public TitaniumDescriptorPairBasedIdentifier srcDescriptor(String srcDescriptor) {
    
    this.srcDescriptor = srcDescriptor;
    return this;
  }

   /**
   * Get srcDescriptor
   * @return srcDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSrcDescriptor() {
    return srcDescriptor;
  }


  public void setSrcDescriptor(String srcDescriptor) {
    this.srcDescriptor = srcDescriptor;
  }


  public TitaniumDescriptorPairBasedIdentifier uid(String uid) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumDescriptorPairBasedIdentifier titaniumDescriptorPairBasedIdentifier = (TitaniumDescriptorPairBasedIdentifier) o;
    return Objects.equals(this.destDescriptor, titaniumDescriptorPairBasedIdentifier.destDescriptor) &&
        Objects.equals(this.srcDescriptor, titaniumDescriptorPairBasedIdentifier.srcDescriptor) &&
        Objects.equals(this.uid, titaniumDescriptorPairBasedIdentifier.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destDescriptor, srcDescriptor, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumDescriptorPairBasedIdentifier {\n");
    sb.append("    destDescriptor: ").append(toIndentedString(destDescriptor)).append("\n");
    sb.append("    srcDescriptor: ").append(toIndentedString(srcDescriptor)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
    openapiFields.add("destDescriptor");
    openapiFields.add("srcDescriptor");
    openapiFields.add("uid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumDescriptorPairBasedIdentifier
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumDescriptorPairBasedIdentifier.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumDescriptorPairBasedIdentifier is not found in the empty JSON string", TitaniumDescriptorPairBasedIdentifier.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumDescriptorPairBasedIdentifier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumDescriptorPairBasedIdentifier` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("destDescriptor") != null && !jsonObj.get("destDescriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destDescriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destDescriptor").toString()));
      }
      if (jsonObj.get("srcDescriptor") != null && !jsonObj.get("srcDescriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `srcDescriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("srcDescriptor").toString()));
      }
      if (jsonObj.get("uid") != null && !jsonObj.get("uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumDescriptorPairBasedIdentifier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumDescriptorPairBasedIdentifier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumDescriptorPairBasedIdentifier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumDescriptorPairBasedIdentifier.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumDescriptorPairBasedIdentifier>() {
           @Override
           public void write(JsonWriter out, TitaniumDescriptorPairBasedIdentifier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumDescriptorPairBasedIdentifier read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumDescriptorPairBasedIdentifier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumDescriptorPairBasedIdentifier
  * @throws IOException if the JSON string is invalid with respect to TitaniumDescriptorPairBasedIdentifier
  */
  public static TitaniumDescriptorPairBasedIdentifier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumDescriptorPairBasedIdentifier.class);
  }

 /**
  * Convert an instance of TitaniumDescriptorPairBasedIdentifier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

