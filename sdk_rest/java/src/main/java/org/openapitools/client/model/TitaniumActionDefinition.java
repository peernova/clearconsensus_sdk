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
import org.openapitools.client.model.TitaniumArgument;

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
 * TitaniumActionDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-09T11:41:41.039267Z[UTC]")
public class TitaniumActionDefinition {
  public static final String SERIALIZED_NAME_ACTION_TYPE = "actionType";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private String actionType;

  public static final String SERIALIZED_NAME_DEPENDS_ON = "dependsOn";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON)
  private List<String> dependsOn = null;

  public static final String SERIALIZED_NAME_DO_NOT_RUN_IF = "doNotRunIf";
  @SerializedName(SERIALIZED_NAME_DO_NOT_RUN_IF)
  private String doNotRunIf;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IGNORE_FAILURE = "ignoreFailure";
  @SerializedName(SERIALIZED_NAME_IGNORE_FAILURE)
  private Boolean ignoreFailure;

  public static final String SERIALIZED_NAME_INPUT_ARGUMENTS = "inputArguments";
  @SerializedName(SERIALIZED_NAME_INPUT_ARGUMENTS)
  private List<TitaniumArgument> inputArguments = null;

  public static final String SERIALIZED_NAME_OUTPUT_ARGUMENT = "outputArgument";
  @SerializedName(SERIALIZED_NAME_OUTPUT_ARGUMENT)
  private String outputArgument;

  public static final String SERIALIZED_NAME_QUEUE = "queue";
  @SerializedName(SERIALIZED_NAME_QUEUE)
  private String queue;

  public static final String SERIALIZED_NAME_RETRIES = "retries";
  @SerializedName(SERIALIZED_NAME_RETRIES)
  private Integer retries;

  public static final String SERIALIZED_NAME_RUN_IF = "runIf";
  @SerializedName(SERIALIZED_NAME_RUN_IF)
  private String runIf;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Integer timeoutSeconds;

  public TitaniumActionDefinition() { 
  }

  public TitaniumActionDefinition actionType(String actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionType() {
    return actionType;
  }


  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public TitaniumActionDefinition dependsOn(List<String> dependsOn) {
    
    this.dependsOn = dependsOn;
    return this;
  }

  public TitaniumActionDefinition addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

   /**
   * Get dependsOn
   * @return dependsOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDependsOn() {
    return dependsOn;
  }


  public void setDependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
  }


  public TitaniumActionDefinition doNotRunIf(String doNotRunIf) {
    
    this.doNotRunIf = doNotRunIf;
    return this;
  }

   /**
   * Get doNotRunIf
   * @return doNotRunIf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDoNotRunIf() {
    return doNotRunIf;
  }


  public void setDoNotRunIf(String doNotRunIf) {
    this.doNotRunIf = doNotRunIf;
  }


  public TitaniumActionDefinition id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TitaniumActionDefinition ignoreFailure(Boolean ignoreFailure) {
    
    this.ignoreFailure = ignoreFailure;
    return this;
  }

   /**
   * Get ignoreFailure
   * @return ignoreFailure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIgnoreFailure() {
    return ignoreFailure;
  }


  public void setIgnoreFailure(Boolean ignoreFailure) {
    this.ignoreFailure = ignoreFailure;
  }


  public TitaniumActionDefinition inputArguments(List<TitaniumArgument> inputArguments) {
    
    this.inputArguments = inputArguments;
    return this;
  }

  public TitaniumActionDefinition addInputArgumentsItem(TitaniumArgument inputArgumentsItem) {
    if (this.inputArguments == null) {
      this.inputArguments = new ArrayList<>();
    }
    this.inputArguments.add(inputArgumentsItem);
    return this;
  }

   /**
   * Get inputArguments
   * @return inputArguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumArgument> getInputArguments() {
    return inputArguments;
  }


  public void setInputArguments(List<TitaniumArgument> inputArguments) {
    this.inputArguments = inputArguments;
  }


  public TitaniumActionDefinition outputArgument(String outputArgument) {
    
    this.outputArgument = outputArgument;
    return this;
  }

   /**
   * Get outputArgument
   * @return outputArgument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutputArgument() {
    return outputArgument;
  }


  public void setOutputArgument(String outputArgument) {
    this.outputArgument = outputArgument;
  }


  public TitaniumActionDefinition queue(String queue) {
    
    this.queue = queue;
    return this;
  }

   /**
   * Get queue
   * @return queue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueue() {
    return queue;
  }


  public void setQueue(String queue) {
    this.queue = queue;
  }


  public TitaniumActionDefinition retries(Integer retries) {
    
    this.retries = retries;
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRetries() {
    return retries;
  }


  public void setRetries(Integer retries) {
    this.retries = retries;
  }


  public TitaniumActionDefinition runIf(String runIf) {
    
    this.runIf = runIf;
    return this;
  }

   /**
   * Get runIf
   * @return runIf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunIf() {
    return runIf;
  }


  public void setRunIf(String runIf) {
    this.runIf = runIf;
  }


  public TitaniumActionDefinition timeoutSeconds(Integer timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Get timeoutSeconds
   * @return timeoutSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumActionDefinition titaniumActionDefinition = (TitaniumActionDefinition) o;
    return Objects.equals(this.actionType, titaniumActionDefinition.actionType) &&
        Objects.equals(this.dependsOn, titaniumActionDefinition.dependsOn) &&
        Objects.equals(this.doNotRunIf, titaniumActionDefinition.doNotRunIf) &&
        Objects.equals(this.id, titaniumActionDefinition.id) &&
        Objects.equals(this.ignoreFailure, titaniumActionDefinition.ignoreFailure) &&
        Objects.equals(this.inputArguments, titaniumActionDefinition.inputArguments) &&
        Objects.equals(this.outputArgument, titaniumActionDefinition.outputArgument) &&
        Objects.equals(this.queue, titaniumActionDefinition.queue) &&
        Objects.equals(this.retries, titaniumActionDefinition.retries) &&
        Objects.equals(this.runIf, titaniumActionDefinition.runIf) &&
        Objects.equals(this.timeoutSeconds, titaniumActionDefinition.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, dependsOn, doNotRunIf, id, ignoreFailure, inputArguments, outputArgument, queue, retries, runIf, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumActionDefinition {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    doNotRunIf: ").append(toIndentedString(doNotRunIf)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreFailure: ").append(toIndentedString(ignoreFailure)).append("\n");
    sb.append("    inputArguments: ").append(toIndentedString(inputArguments)).append("\n");
    sb.append("    outputArgument: ").append(toIndentedString(outputArgument)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    runIf: ").append(toIndentedString(runIf)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
    openapiFields.add("actionType");
    openapiFields.add("dependsOn");
    openapiFields.add("doNotRunIf");
    openapiFields.add("id");
    openapiFields.add("ignoreFailure");
    openapiFields.add("inputArguments");
    openapiFields.add("outputArgument");
    openapiFields.add("queue");
    openapiFields.add("retries");
    openapiFields.add("runIf");
    openapiFields.add("timeoutSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumActionDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumActionDefinition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumActionDefinition is not found in the empty JSON string", TitaniumActionDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumActionDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumActionDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("actionType") != null && !jsonObj.get("actionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionType").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("dependsOn") != null && !jsonObj.get("dependsOn").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependsOn` to be an array in the JSON string but got `%s`", jsonObj.get("dependsOn").toString()));
      }
      if (jsonObj.get("doNotRunIf") != null && !jsonObj.get("doNotRunIf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doNotRunIf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doNotRunIf").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      JsonArray jsonArrayinputArguments = jsonObj.getAsJsonArray("inputArguments");
      if (jsonArrayinputArguments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("inputArguments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `inputArguments` to be an array in the JSON string but got `%s`", jsonObj.get("inputArguments").toString()));
        }

        // validate the optional field `inputArguments` (array)
        for (int i = 0; i < jsonArrayinputArguments.size(); i++) {
          TitaniumArgument.validateJsonObject(jsonArrayinputArguments.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("outputArgument") != null && !jsonObj.get("outputArgument").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputArgument` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outputArgument").toString()));
      }
      if (jsonObj.get("queue") != null && !jsonObj.get("queue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queue").toString()));
      }
      if (jsonObj.get("runIf") != null && !jsonObj.get("runIf").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runIf` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runIf").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumActionDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumActionDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumActionDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumActionDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumActionDefinition>() {
           @Override
           public void write(JsonWriter out, TitaniumActionDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumActionDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumActionDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumActionDefinition
  * @throws IOException if the JSON string is invalid with respect to TitaniumActionDefinition
  */
  public static TitaniumActionDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumActionDefinition.class);
  }

 /**
  * Convert an instance of TitaniumActionDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

