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
import TitaniumGetDefinition from '../model/TitaniumGetDefinition';
import TitaniumListRequest from '../model/TitaniumListRequest';
import TitaniumListRuleResponse from '../model/TitaniumListRuleResponse';
import TitaniumListVersionResponse from '../model/TitaniumListVersionResponse';
import TitaniumNormalizationRuleDefinition from '../model/TitaniumNormalizationRuleDefinition';
import TitaniumNormalizationRuleResponse from '../model/TitaniumNormalizationRuleResponse';

/**
* NormalizationService service.
* @module api/NormalizationServiceApi
* @version 1.0.0
*/
export default class NormalizationServiceApi {

    /**
    * Constructs a new NormalizationServiceApi. 
    * @alias module:api/NormalizationServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the normalizationServiceAddNormalizationRule operation.
     * @callback module:api/NormalizationServiceApi~normalizationServiceAddNormalizationRuleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumNormalizationRuleDefinition} body 
     * @param {module:api/NormalizationServiceApi~normalizationServiceAddNormalizationRuleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    normalizationServiceAddNormalizationRule(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling normalizationServiceAddNormalizationRule");
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
        '/api/v1/normalization/rule/add', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the normalizationServiceDisableNormalizationRule operation.
     * @callback module:api/NormalizationServiceApi~normalizationServiceDisableNormalizationRuleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumGetDefinition} body 
     * @param {module:api/NormalizationServiceApi~normalizationServiceDisableNormalizationRuleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    normalizationServiceDisableNormalizationRule(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling normalizationServiceDisableNormalizationRule");
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
        '/api/v1/normalization/rule/disable', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the normalizationServiceEnableNormalizationRule operation.
     * @callback module:api/NormalizationServiceApi~normalizationServiceEnableNormalizationRuleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumGetDefinition} body 
     * @param {module:api/NormalizationServiceApi~normalizationServiceEnableNormalizationRuleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    normalizationServiceEnableNormalizationRule(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling normalizationServiceEnableNormalizationRule");
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
        '/api/v1/normalization/rule/enable', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the normalizationServiceGetNormalizationRule operation.
     * @callback module:api/NormalizationServiceApi~normalizationServiceGetNormalizationRuleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumNormalizationRuleResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumGetDefinition} body 
     * @param {module:api/NormalizationServiceApi~normalizationServiceGetNormalizationRuleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumNormalizationRuleResponse}
     */
    normalizationServiceGetNormalizationRule(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling normalizationServiceGetNormalizationRule");
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
      let returnType = TitaniumNormalizationRuleResponse;
      return this.apiClient.callApi(
        '/api/v1/normalization/rule/get', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the normalizationServiceGetNormalizationRuleVersion operation.
     * @callback module:api/NormalizationServiceApi~normalizationServiceGetNormalizationRuleVersionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumNormalizationRuleResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} descriptorName 
     * @param {String} versionId 
     * @param {Object} opts Optional parameters
     * @param {String} opts.name 
     * @param {String} opts.scope 
     * @param {module:api/NormalizationServiceApi~normalizationServiceGetNormalizationRuleVersionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumNormalizationRuleResponse}
     */
    normalizationServiceGetNormalizationRuleVersion(descriptorName, versionId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'descriptorName' is set
      if (descriptorName === undefined || descriptorName === null) {
        throw new Error("Missing the required parameter 'descriptorName' when calling normalizationServiceGetNormalizationRuleVersion");
      }
      // verify the required parameter 'versionId' is set
      if (versionId === undefined || versionId === null) {
        throw new Error("Missing the required parameter 'versionId' when calling normalizationServiceGetNormalizationRuleVersion");
      }

      let pathParams = {
        'descriptorName': descriptorName,
        'versionId': versionId
      };
      let queryParams = {
        'name': opts['name'],
        'scope': opts['scope']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = TitaniumNormalizationRuleResponse;
      return this.apiClient.callApi(
        '/api/v1/normalization/rule/version/{descriptorName}/{versionId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the normalizationServiceListNormalizationRuleVersions operation.
     * @callback module:api/NormalizationServiceApi~normalizationServiceListNormalizationRuleVersionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumListVersionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumGetDefinition} body 
     * @param {module:api/NormalizationServiceApi~normalizationServiceListNormalizationRuleVersionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumListVersionResponse}
     */
    normalizationServiceListNormalizationRuleVersions(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling normalizationServiceListNormalizationRuleVersions");
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
        '/api/v1/normalization/rule/versions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the normalizationServiceListNormalizationRules operation.
     * @callback module:api/NormalizationServiceApi~normalizationServiceListNormalizationRulesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumListRuleResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumListRequest} body 
     * @param {module:api/NormalizationServiceApi~normalizationServiceListNormalizationRulesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumListRuleResponse}
     */
    normalizationServiceListNormalizationRules(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling normalizationServiceListNormalizationRules");
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
      let returnType = TitaniumListRuleResponse;
      return this.apiClient.callApi(
        '/api/v1/normalization/rule/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
