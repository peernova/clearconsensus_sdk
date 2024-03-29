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
import org.openapitools.client.model.TitaniumActionDefinition;

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
 * TitaniumWorkflowDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-20T18:38:13.218897Z[UTC]")
public class TitaniumWorkflowDefinition {
  public static final String SERIALIZED_NAME_ACTION_LIST = "actionList";
  @SerializedName(SERIALIZED_NAME_ACTION_LIST)
  private List<TitaniumActionDefinition> actionList = null;

  public static final String SERIALIZED_NAME_MAX_ATTEMPTS = "maxAttempts";
  @SerializedName(SERIALIZED_NAME_MAX_ATTEMPTS)
  private Integer maxAttempts;

  public static final String SERIALIZED_NAME_PREDEFINED_ARGUMENTS = "predefinedArguments";
  @SerializedName(SERIALIZED_NAME_PREDEFINED_ARGUMENTS)
  private Object predefinedArguments;

  public static final String SERIALIZED_NAME_RUNTIME_ARGUMENTS = "runtimeArguments";
  @SerializedName(SERIALIZED_NAME_RUNTIME_ARGUMENTS)
  private List<String> runtimeArguments = null;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private String schedule;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public static final String SERIALIZED_NAME_WORKFLOW_QUEUE = "workflowQueue";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_QUEUE)
  private String workflowQueue;

  public TitaniumWorkflowDefinition() { 
  }

  public TitaniumWorkflowDefinition actionList(List<TitaniumActionDefinition> actionList) {
    
    this.actionList = actionList;
    return this;
  }

  public TitaniumWorkflowDefinition addActionListItem(TitaniumActionDefinition actionListItem) {
    if (this.actionList == null) {
      this.actionList = new ArrayList<>();
    }
    this.actionList.add(actionListItem);
    return this;
  }

   /**
   * Get actionList
   * @return actionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TitaniumActionDefinition> getActionList() {
    return actionList;
  }


  public void setActionList(List<TitaniumActionDefinition> actionList) {
    this.actionList = actionList;
  }


  public TitaniumWorkflowDefinition maxAttempts(Integer maxAttempts) {
    
    this.maxAttempts = maxAttempts;
    return this;
  }

   /**
   * Get maxAttempts
   * @return maxAttempts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxAttempts() {
    return maxAttempts;
  }


  public void setMaxAttempts(Integer maxAttempts) {
    this.maxAttempts = maxAttempts;
  }


  public TitaniumWorkflowDefinition predefinedArguments(Object predefinedArguments) {
    
    this.predefinedArguments = predefinedArguments;
    return this;
  }

   /**
   * Get predefinedArguments
   * @return predefinedArguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPredefinedArguments() {
    return predefinedArguments;
  }


  public void setPredefinedArguments(Object predefinedArguments) {
    this.predefinedArguments = predefinedArguments;
  }


  public TitaniumWorkflowDefinition runtimeArguments(List<String> runtimeArguments) {
    
    this.runtimeArguments = runtimeArguments;
    return this;
  }

  public TitaniumWorkflowDefinition addRuntimeArgumentsItem(String runtimeArgumentsItem) {
    if (this.runtimeArguments == null) {
      this.runtimeArguments = new ArrayList<>();
    }
    this.runtimeArguments.add(runtimeArgumentsItem);
    return this;
  }

   /**
   * Get runtimeArguments
   * @return runtimeArguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRuntimeArguments() {
    return runtimeArguments;
  }


  public void setRuntimeArguments(List<String> runtimeArguments) {
    this.runtimeArguments = runtimeArguments;
  }


  public TitaniumWorkflowDefinition schedule(String schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchedule() {
    return schedule;
  }


  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }


  public TitaniumWorkflowDefinition timeout(String timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeout() {
    return timeout;
  }


  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }


  public TitaniumWorkflowDefinition workflowName(String workflowName) {
    
    this.workflowName = workflowName;
    return this;
  }

   /**
   * Get workflowName
   * @return workflowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkflowName() {
    return workflowName;
  }


  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }


  public TitaniumWorkflowDefinition workflowQueue(String workflowQueue) {
    
    this.workflowQueue = workflowQueue;
    return this;
  }

   /**
   * Get workflowQueue
   * @return workflowQueue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkflowQueue() {
    return workflowQueue;
  }


  public void setWorkflowQueue(String workflowQueue) {
    this.workflowQueue = workflowQueue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TitaniumWorkflowDefinition titaniumWorkflowDefinition = (TitaniumWorkflowDefinition) o;
    return Objects.equals(this.actionList, titaniumWorkflowDefinition.actionList) &&
        Objects.equals(this.maxAttempts, titaniumWorkflowDefinition.maxAttempts) &&
        Objects.equals(this.predefinedArguments, titaniumWorkflowDefinition.predefinedArguments) &&
        Objects.equals(this.runtimeArguments, titaniumWorkflowDefinition.runtimeArguments) &&
        Objects.equals(this.schedule, titaniumWorkflowDefinition.schedule) &&
        Objects.equals(this.timeout, titaniumWorkflowDefinition.timeout) &&
        Objects.equals(this.workflowName, titaniumWorkflowDefinition.workflowName) &&
        Objects.equals(this.workflowQueue, titaniumWorkflowDefinition.workflowQueue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionList, maxAttempts, predefinedArguments, runtimeArguments, schedule, timeout, workflowName, workflowQueue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TitaniumWorkflowDefinition {\n");
    sb.append("    actionList: ").append(toIndentedString(actionList)).append("\n");
    sb.append("    maxAttempts: ").append(toIndentedString(maxAttempts)).append("\n");
    sb.append("    predefinedArguments: ").append(toIndentedString(predefinedArguments)).append("\n");
    sb.append("    runtimeArguments: ").append(toIndentedString(runtimeArguments)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
    sb.append("    workflowQueue: ").append(toIndentedString(workflowQueue)).append("\n");
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
    openapiFields.add("actionList");
    openapiFields.add("maxAttempts");
    openapiFields.add("predefinedArguments");
    openapiFields.add("runtimeArguments");
    openapiFields.add("schedule");
    openapiFields.add("timeout");
    openapiFields.add("workflowName");
    openapiFields.add("workflowQueue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TitaniumWorkflowDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TitaniumWorkflowDefinition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TitaniumWorkflowDefinition is not found in the empty JSON string", TitaniumWorkflowDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TitaniumWorkflowDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TitaniumWorkflowDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayactionList = jsonObj.getAsJsonArray("actionList");
      if (jsonArrayactionList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("actionList").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `actionList` to be an array in the JSON string but got `%s`", jsonObj.get("actionList").toString()));
        }

        // validate the optional field `actionList` (array)
        for (int i = 0; i < jsonArrayactionList.size(); i++) {
          TitaniumActionDefinition.validateJsonObject(jsonArrayactionList.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("runtimeArguments") != null && !jsonObj.get("runtimeArguments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `runtimeArguments` to be an array in the JSON string but got `%s`", jsonObj.get("runtimeArguments").toString()));
      }
      if (jsonObj.get("schedule") != null && !jsonObj.get("schedule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schedule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schedule").toString()));
      }
      if (jsonObj.get("timeout") != null && !jsonObj.get("timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeout").toString()));
      }
      if (jsonObj.get("workflowName") != null && !jsonObj.get("workflowName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowName").toString()));
      }
      if (jsonObj.get("workflowQueue") != null && !jsonObj.get("workflowQueue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowQueue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowQueue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TitaniumWorkflowDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TitaniumWorkflowDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TitaniumWorkflowDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TitaniumWorkflowDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<TitaniumWorkflowDefinition>() {
           @Override
           public void write(JsonWriter out, TitaniumWorkflowDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TitaniumWorkflowDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TitaniumWorkflowDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TitaniumWorkflowDefinition
  * @throws IOException if the JSON string is invalid with respect to TitaniumWorkflowDefinition
  */
  public static TitaniumWorkflowDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TitaniumWorkflowDefinition.class);
  }

 /**
  * Convert an instance of TitaniumWorkflowDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

