/**
 * clearconsensus-sdk
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import RpcStatus from '../model/RpcStatus';
import TitaniumAcknowledgeResponse from '../model/TitaniumAcknowledgeResponse';
import TitaniumCustomFunction from '../model/TitaniumCustomFunction';
import TitaniumCustomFunctionDefinitionResponse from '../model/TitaniumCustomFunctionDefinitionResponse';
import TitaniumCustomFunctionGetDefinition from '../model/TitaniumCustomFunctionGetDefinition';
import TitaniumGetDefinition from '../model/TitaniumGetDefinition';
import TitaniumListCustomFunctionRequest from '../model/TitaniumListCustomFunctionRequest';
import TitaniumListCustomFunctionResponse from '../model/TitaniumListCustomFunctionResponse';
import TitaniumListVersionResponse from '../model/TitaniumListVersionResponse';

/**
* CustomFunctionService service.
* @module api/CustomFunctionServiceApi
* @version 1.0.0
*/
export default class CustomFunctionServiceApi {

    /**
    * Constructs a new CustomFunctionServiceApi. 
    * @alias module:api/CustomFunctionServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the customFunctionServiceAddCustomFunction operation.
     * @callback module:api/CustomFunctionServiceApi~customFunctionServiceAddCustomFunctionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * AddCustomFunction allows the user to create a new custom function by sending a CustomFunction message. It returns an AcknowledgeResponse indicating whether the custom function was successfully added or not.
     * @param {module:model/TitaniumCustomFunction} body 
     * @param {module:api/CustomFunctionServiceApi~customFunctionServiceAddCustomFunctionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    customFunctionServiceAddCustomFunction(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling customFunctionServiceAddCustomFunction");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = TitaniumAcknowledgeResponse;
      return this.apiClient.callApi(
        '/api/v1/customfunction/add', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the customFunctionServiceGetCustomFunction operation.
     * @callback module:api/CustomFunctionServiceApi~customFunctionServiceGetCustomFunctionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumCustomFunctionDefinitionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetCustomFunction retrieves the definition of a specific custom function. The custom function is specified in the CustomFunctionGetDefinition message, which includes its ID and scope. The method returns a CustomFunctionDefinitionResponse that contains either the custom function definition or an error.
     * @param {module:model/TitaniumCustomFunctionGetDefinition} body 
     * @param {module:api/CustomFunctionServiceApi~customFunctionServiceGetCustomFunctionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumCustomFunctionDefinitionResponse}
     */
    customFunctionServiceGetCustomFunction(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling customFunctionServiceGetCustomFunction");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = TitaniumCustomFunctionDefinitionResponse;
      return this.apiClient.callApi(
        '/api/v1/customfunction/get', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the customFunctionServiceListCustomFunctionVersions operation.
     * @callback module:api/CustomFunctionServiceApi~customFunctionServiceListCustomFunctionVersionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumListVersionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ListCustomFunctionVersions lists all the versions of a specific custom function. The custom function is specified in the GetDefinition message, which includes its ID and scope. The method returns a ListVersionResponse that contains either a list of versions or an error.
     * @param {module:model/TitaniumGetDefinition} body 
     * @param {module:api/CustomFunctionServiceApi~customFunctionServiceListCustomFunctionVersionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumListVersionResponse}
     */
    customFunctionServiceListCustomFunctionVersions(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling customFunctionServiceListCustomFunctionVersions");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = TitaniumListVersionResponse;
      return this.apiClient.callApi(
        '/api/v1/customfunction/versions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the customFunctionServiceListCustomFunctions operation.
     * @callback module:api/CustomFunctionServiceApi~customFunctionServiceListCustomFunctionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumListCustomFunctionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ListCustomFunctions lists all the custom functions that match the specified criteria. The criteria are defined in the ListCustomFunctionRequest message, which includes the descriptor name and the type of the custom function descriptor. The method returns a ListCustomFunctionResponse that contains either a list of custom functions or an error.
     * @param {module:model/TitaniumListCustomFunctionRequest} body 
     * @param {module:api/CustomFunctionServiceApi~customFunctionServiceListCustomFunctionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumListCustomFunctionResponse}
     */
    customFunctionServiceListCustomFunctions(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling customFunctionServiceListCustomFunctions");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = TitaniumListCustomFunctionResponse;
      return this.apiClient.callApi(
        '/api/v1/customfunction/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
