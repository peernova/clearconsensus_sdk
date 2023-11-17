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
import org.openapitools.client.model.ErrorValidationErrorDetail;

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
 * GrpcprotoError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T19:16:25.794270Z[UTC]")
public class GrpcprotoError {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private Integer code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_VALIDATION_ERROR_DETAILS = "validationErrorDetails";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERROR_DETAILS)
  private List<ErrorValidationErrorDetail> validationErrorDetails = null;

  public GrpcprotoError() { 
  }

  public GrpcprotoError code(Integer code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCode() {
    return code;
  }


  public void setCode(Integer code) {
    this.code = code;
  }


  public GrpcprotoError message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public GrpcprotoError validationErrorDetails(List<ErrorValidationErrorDetail> validationErrorDetails) {
    
    this.validationErrorDetails = validationErrorDetails;
    return this;
  }

  public GrpcprotoError addValidationErrorDetailsItem(ErrorValidationErrorDetail validationErrorDetailsItem) {
    if (this.validationErrorDetails == null) {
      this.validationErrorDetails = new ArrayList<>();
    }
    this.validationErrorDetails.add(validationErrorDetailsItem);
    return this;
  }

   /**
   * Get validationErrorDetails
   * @return validationErrorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ErrorValidationErrorDetail> getValidationErrorDetails() {
    return validationErrorDetails;
  }


  public void setValidationErrorDetails(List<ErrorValidationErrorDetail> validationErrorDetails) {
    this.validationErrorDetails = validationErrorDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrpcprotoError grpcprotoError = (GrpcprotoError) o;
    return Objects.equals(this.code, grpcprotoError.code) &&
        Objects.equals(this.message, grpcprotoError.message) &&
        Objects.equals(this.validationErrorDetails, grpcprotoError.validationErrorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, validationErrorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrpcprotoError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validationErrorDetails: ").append(toIndentedString(validationErrorDetails)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("message");
    openapiFields.add("validationErrorDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GrpcprotoError
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GrpcprotoError.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GrpcprotoError is not found in the empty JSON string", GrpcprotoError.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GrpcprotoError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GrpcprotoError` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      JsonArray jsonArrayvalidationErrorDetails = jsonObj.getAsJsonArray("validationErrorDetails");
      if (jsonArrayvalidationErrorDetails != null) {
        // ensure the json data is an array
        if (!jsonObj.get("validationErrorDetails").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `validationErrorDetails` to be an array in the JSON string but got `%s`", jsonObj.get("validationErrorDetails").toString()));
        }

        // validate the optional field `validationErrorDetails` (array)
        for (int i = 0; i < jsonArrayvalidationErrorDetails.size(); i++) {
          ErrorValidationErrorDetail.validateJsonObject(jsonArrayvalidationErrorDetails.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GrpcprotoError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GrpcprotoError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GrpcprotoError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GrpcprotoError.class));

       return (TypeAdapter<T>) new TypeAdapter<GrpcprotoError>() {
           @Override
           public void write(JsonWriter out, GrpcprotoError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GrpcprotoError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GrpcprotoError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GrpcprotoError
  * @throws IOException if the JSON string is invalid with respect to GrpcprotoError
  */
  public static GrpcprotoError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GrpcprotoError.class);
  }

 /**
  * Convert an instance of GrpcprotoError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

