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
import org.openapitools.client.model.TitaniumAssetsList;

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
 * TitaniumOnBoardRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumOnBoardRequest {
  public static final String SERIALIZED_NAME_AUTHORIZED = "authorized";
  @SerializedName(SERIALIZED_NAME_AUTHORIZED)
  private TitaniumAssetsList authorized;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "publicKey";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public TitaniumOnBoardRequest() { 
  }

  public TitaniumOnBoardRequest authorized(TitaniumAssetsList authorized) {
    
    this.authorized = authorized;
    return this;
  }

   /**
   * Get authorized
   * @return authorized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TitaniumAssetsList getAuthorized() {
    return authorized;
  }


  public void setAuthorized(TitaniumAssetsList authorized) {
    this.authorized = authorized;
  }


  public TitaniumOnBoardRequest client(String client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClient() {
    return client;
  }


  public void setClient(String client) {
    this.client = client;
  }


  public TitaniumOnBoardRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public TitaniumOnBoardRequest publicKey(String publicKey) {
    
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPublicKey() {
    return publicKey;
  }


  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public TitaniumOnBoardRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumOnBoardRequest titaniumOnBoardRequest = (TitaniumOnBoardRequest) o;
    return Objects.equals(this.authorized, titaniumOnBoardRequest.authorized) &&
        Objects.equals(this.client, titaniumOnBoardRequest.client) &&
        Objects.equals(this.password, titaniumOnBoardRequest.password) &&
        Objects.equals(this.publicKey, titaniumOnBoardRequest.publicKey) &&
        Objects.equals(this.username, titaniumOnBoardRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorized, client, password, publicKey, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumOnBoardRequest {\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("authorized");
    openapiFields.add("client");
    openapiFields.add("password");
    openapiFields.add("publicKey");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumOnBoardRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumOnBoardRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumOnBoardRequest is not found in the empty JSON string", TitaniumOnBoardRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumOnBoardRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumOnBoardRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `authorized`
      if (jsonObj.getAsJsonObject("authorized") != null) {
        TitaniumAssetsList.validateJsonObject(jsonObj.getAsJsonObject("authorized"));
      }
      if (jsonObj.get("client") != null && !jsonObj.get("client").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client").toString()));
      }
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if (jsonObj.get("publicKey") != null && !jsonObj.get("publicKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicKey").toString()));
      }
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumOnBoardRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumOnBoardRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumOnBoardRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumOnBoardRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumOnBoardRequest>() {
           @Override
           public void write(JsonWriter out, TitaniumOnBoardRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumOnBoardRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumOnBoardRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumOnBoardRequest
  * @throws IOException if the JSON string is invalid with respect to TitaniumOnBoardRequest
  */
  public static TitaniumOnBoardRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumOnBoardRequest.class);
  }

 /**
  * Convert an instance of TitaniumOnBoardRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

