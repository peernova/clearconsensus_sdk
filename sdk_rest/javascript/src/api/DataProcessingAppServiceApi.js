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
import TitaniumRunDataProcessingAppRequest from '../model/TitaniumRunDataProcessingAppRequest';
import TitaniumRunDataProcessingAppResponse from '../model/TitaniumRunDataProcessingAppResponse';

/**
* DataProcessingAppService service.
* @module api/DataProcessingAppServiceApi
* @version 1.0.0
*/
export default class DataProcessingAppServiceApi {

    /**
    * Constructs a new DataProcessingAppServiceApi. 
    * @alias module:api/DataProcessingAppServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the dataProcessingAppServiceRunDataProcessingApp operation.
     * @callback module:api/DataProcessingAppServiceApi~dataProcessingAppServiceRunDataProcessingAppCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumRunDataProcessingAppResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * RunDataProcessingApp triggers jobs that are responsible to processing of received data.
     * @param {module:model/TitaniumRunDataProcessingAppRequest} body 
     * @param {module:api/DataProcessingAppServiceApi~dataProcessingAppServiceRunDataProcessingAppCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumRunDataProcessingAppResponse}
     */
    dataProcessingAppServiceRunDataProcessingApp(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dataProcessingAppServiceRunDataProcessingApp");
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
      let returnType = TitaniumRunDataProcessingAppResponse;
      return this.apiClient.callApi(
        '/api/v1/dataprocessingapp/run', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
