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
import org.openapitools.client.model.TitaniumError;
import org.openapitools.client.model.TitaniumUser;

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
 * TitaniumUserResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-13T17:19:24.039488Z[UTC]")
public class TitaniumUserResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private TitaniumError error;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TitaniumUser user;

  public TitaniumUserResponse() { 
  }

  public TitaniumUserResponse error(TitaniumError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumError getError() {
    return error;
  }


  public void setError(TitaniumError error) {
    this.error = error;
  }


  public TitaniumUserResponse user(TitaniumUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumUser getUser() {
    return user;
  }


  public void setUser(TitaniumUser user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumUserResponse titaniumUserResponse = (TitaniumUserResponse) o;
    return Objects.equals(this.error, titaniumUserResponse.error) &&
        Objects.equals(this.user, titaniumUserResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumUserResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumUserResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumUserResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumUserResponse is not found in the empty JSON string", TitaniumUserResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumUserResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumUserResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `error`
      if (jsonObj.getAsJsonObject("error") != null) {
        TitaniumError.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      // validate the optional field `user`
      if (jsonObj.getAsJsonObject("user") != null) {
        TitaniumUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumUserResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumUserResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumUserResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumUserResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumUserResponse>() {
           @Override
           public void write(JsonWriter out, TitaniumUserResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumUserResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumUserResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumUserResponse
  * @throws IOException if the JSON string is invalid with respect to TitaniumUserResponse
  */
  public static TitaniumUserResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumUserResponse.class);
  }

 /**
  * Convert an instance of TitaniumUserResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

