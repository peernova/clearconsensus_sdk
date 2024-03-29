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
import TitaniumMessageResponse from '../model/TitaniumMessageResponse';
import TitaniumOnBoardRequest from '../model/TitaniumOnBoardRequest';
import TitaniumRunCalculatorRequest from '../model/TitaniumRunCalculatorRequest';
import TitaniumRunConsensusRequest from '../model/TitaniumRunConsensusRequest';
import TitaniumUploadEvaluatedPriceRequest from '../model/TitaniumUploadEvaluatedPriceRequest';

/**
* AdminService service.
* @module api/AdminServiceApi
* @version 1.0.0
*/
export default class AdminServiceApi {

    /**
    * Constructs a new AdminServiceApi. 
    * @alias module:api/AdminServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the adminServiceOnBoard operation.
     * @callback module:api/AdminServiceApi~adminServiceOnBoardCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumOnBoardRequest} body 
     * @param {module:api/AdminServiceApi~adminServiceOnBoardCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    adminServiceOnBoard(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling adminServiceOnBoard");
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
      let returnType = TitaniumMessageResponse;
      return this.apiClient.callApi(
        '/api/v1/onboard', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the adminServiceRunCalculator operation.
     * @callback module:api/AdminServiceApi~adminServiceRunCalculatorCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumRunCalculatorRequest} body 
     * @param {module:api/AdminServiceApi~adminServiceRunCalculatorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    adminServiceRunCalculator(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling adminServiceRunCalculator");
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
      let returnType = TitaniumMessageResponse;
      return this.apiClient.callApi(
        '/api/v1/calculator/run', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the adminServiceRunConsensus operation.
     * @callback module:api/AdminServiceApi~adminServiceRunConsensusCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumRunConsensusRequest} body 
     * @param {module:api/AdminServiceApi~adminServiceRunConsensusCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    adminServiceRunConsensus(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling adminServiceRunConsensus");
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
      let returnType = TitaniumMessageResponse;
      return this.apiClient.callApi(
        '/api/v1/consensus/run', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the adminServiceUploadEvaluatedPrice operation.
     * @callback module:api/AdminServiceApi~adminServiceUploadEvaluatedPriceCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumUploadEvaluatedPriceRequest} body 
     * @param {module:api/AdminServiceApi~adminServiceUploadEvaluatedPriceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    adminServiceUploadEvaluatedPrice(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling adminServiceUploadEvaluatedPrice");
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
      let returnType = TitaniumMessageResponse;
      return this.apiClient.callApi(
        '/api/v1/upload/evaluated-price', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
