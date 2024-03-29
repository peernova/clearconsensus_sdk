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
import TitaniumEntityDefinition from '../model/TitaniumEntityDefinition';
import TitaniumEntityIdentifier from '../model/TitaniumEntityIdentifier';

/**
* MetadataEntityService service.
* @module api/MetadataEntityServiceApi
* @version 1.0.0
*/
export default class MetadataEntityServiceApi {

    /**
    * Constructs a new MetadataEntityServiceApi. 
    * @alias module:api/MetadataEntityServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the metadataEntityServiceAddEntity operation.
     * @callback module:api/MetadataEntityServiceApi~metadataEntityServiceAddEntityCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumEntityDefinition} body 
     * @param {module:api/MetadataEntityServiceApi~metadataEntityServiceAddEntityCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    metadataEntityServiceAddEntity(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling metadataEntityServiceAddEntity");
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
        '/api/v1/entity/add', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the metadataEntityServiceDisableEntity operation.
     * @callback module:api/MetadataEntityServiceApi~metadataEntityServiceDisableEntityCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumEntityIdentifier} body 
     * @param {module:api/MetadataEntityServiceApi~metadataEntityServiceDisableEntityCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    metadataEntityServiceDisableEntity(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling metadataEntityServiceDisableEntity");
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
        '/api/v1/entity/disable', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the metadataEntityServiceEnableEntity operation.
     * @callback module:api/MetadataEntityServiceApi~metadataEntityServiceEnableEntityCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumEntityIdentifier} body 
     * @param {module:api/MetadataEntityServiceApi~metadataEntityServiceEnableEntityCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    metadataEntityServiceEnableEntity(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling metadataEntityServiceEnableEntity");
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
        '/api/v1/entity/enable', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the metadataEntityServiceGetEntity operation.
     * @callback module:api/MetadataEntityServiceApi~metadataEntityServiceGetEntityCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumEntityDefinition} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumEntityIdentifier} body 
     * @param {module:api/MetadataEntityServiceApi~metadataEntityServiceGetEntityCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumEntityDefinition}
     */
    metadataEntityServiceGetEntity(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling metadataEntityServiceGetEntity");
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
      let returnType = TitaniumEntityDefinition;
      return this.apiClient.callApi(
        '/api/v1/entity/get', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
