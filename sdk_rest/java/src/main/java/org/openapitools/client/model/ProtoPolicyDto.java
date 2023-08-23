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
 * ProtoPolicyDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-23T12:34:39.246234Z[UTC]")
public class ProtoPolicyDto {
  public static final String SERIALIZED_NAME_ADDON = "addon";
  @SerializedName(SERIALIZED_NAME_ADDON)
  private String addon;

  public static final String SERIALIZED_NAME_API = "api";
  @SerializedName(SERIALIZED_NAME_API)
  private String api;

  public static final String SERIALIZED_NAME_API_PERMISSION = "apiPermission";
  @SerializedName(SERIALIZED_NAME_API_PERMISSION)
  private String apiPermission;

  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private String asset;

  public static final String SERIALIZED_NAME_ASSET_PERMISSION = "assetPermission";
  @SerializedName(SERIALIZED_NAME_ASSET_PERMISSION)
  private String assetPermission;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public ProtoPolicyDto() { 
  }

  public ProtoPolicyDto addon(String addon) {
    
    this.addon = addon;
    return this;
  }

   /**
   * Get addon
   * @return addon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddon() {
    return addon;
  }


  public void setAddon(String addon) {
    this.addon = addon;
  }


  public ProtoPolicyDto api(String api) {
    
    this.api = api;
    return this;
  }

   /**
   * Get api
   * @return api
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApi() {
    return api;
  }


  public void setApi(String api) {
    this.api = api;
  }


  public ProtoPolicyDto apiPermission(String apiPermission) {
    
    this.apiPermission = apiPermission;
    return this;
  }

   /**
   * Get apiPermission
   * @return apiPermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiPermission() {
    return apiPermission;
  }


  public void setApiPermission(String apiPermission) {
    this.apiPermission = apiPermission;
  }


  public ProtoPolicyDto asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAsset() {
    return asset;
  }


  public void setAsset(String asset) {
    this.asset = asset;
  }


  public ProtoPolicyDto assetPermission(String assetPermission) {
    
    this.assetPermission = assetPermission;
    return this;
  }

   /**
   * Get assetPermission
   * @return assetPermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetPermission() {
    return assetPermission;
  }


  public void setAssetPermission(String assetPermission) {
    this.assetPermission = assetPermission;
  }


  public ProtoPolicyDto type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ProtoPolicyDto username(String username) {
    
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
    ProtoPolicyDto protoPolicyDto = (ProtoPolicyDto) o;
    return Objects.equals(this.addon, protoPolicyDto.addon) &&
        Objects.equals(this.api, protoPolicyDto.api) &&
        Objects.equals(this.apiPermission, protoPolicyDto.apiPermission) &&
        Objects.equals(this.asset, protoPolicyDto.asset) &&
        Objects.equals(this.assetPermission, protoPolicyDto.assetPermission) &&
        Objects.equals(this.type, protoPolicyDto.type) &&
        Objects.equals(this.username, protoPolicyDto.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addon, api, apiPermission, asset, assetPermission, type, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtoPolicyDto {\n");
    sb.append("    addon: ").append(toIndentedString(addon)).append("\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    apiPermission: ").append(toIndentedString(apiPermission)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    assetPermission: ").append(toIndentedString(assetPermission)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("addon");
    openapiFields.add("api");
    openapiFields.add("apiPermission");
    openapiFields.add("asset");
    openapiFields.add("assetPermission");
    openapiFields.add("type");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProtoPolicyDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProtoPolicyDto.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProtoPolicyDto is not found in the empty JSON string", ProtoPolicyDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProtoPolicyDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProtoPolicyDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("addon") != null && !jsonObj.get("addon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addon").toString()));
      }
      if (jsonObj.get("api") != null && !jsonObj.get("api").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api").toString()));
      }
      if (jsonObj.get("apiPermission") != null && !jsonObj.get("apiPermission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiPermission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiPermission").toString()));
      }
      if (jsonObj.get("asset") != null && !jsonObj.get("asset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `asset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("asset").toString()));
      }
      if (jsonObj.get("assetPermission") != null && !jsonObj.get("assetPermission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetPermission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetPermission").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProtoPolicyDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProtoPolicyDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProtoPolicyDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProtoPolicyDto.class));

       return (TypeAdapter<T>) new TypeAdapter<ProtoPolicyDto>() {
           @Override
           public void write(JsonWriter out, ProtoPolicyDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProtoPolicyDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProtoPolicyDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProtoPolicyDto
  * @throws IOException if the JSON string is invalid with respect to ProtoPolicyDto
  */
  public static ProtoPolicyDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProtoPolicyDto.class);
  }

 /**
  * Convert an instance of ProtoPolicyDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

