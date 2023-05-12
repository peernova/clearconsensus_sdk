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
import TitaniumDescriptorDefinition from '../model/TitaniumDescriptorDefinition';
import TitaniumDescriptorDefinitionResponse from '../model/TitaniumDescriptorDefinitionResponse';
import TitaniumDescriptorList from '../model/TitaniumDescriptorList';
import TitaniumEnableDisableRequest from '../model/TitaniumEnableDisableRequest';
import TitaniumGetDefinition from '../model/TitaniumGetDefinition';
import TitaniumListRequest from '../model/TitaniumListRequest';
import TitaniumListVersionResponse from '../model/TitaniumListVersionResponse';

/**
* DbDescriptorService service.
* @module api/DbDescriptorServiceApi
* @version 1.0.0
*/
export default class DbDescriptorServiceApi {

    /**
    * Constructs a new DbDescriptorServiceApi. 
    * @alias module:api/DbDescriptorServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the dbDescriptorServiceAddDbDescriptor operation.
     * @callback module:api/DbDescriptorServiceApi~dbDescriptorServiceAddDbDescriptorCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumDescriptorDefinition} body 
     * @param {module:api/DbDescriptorServiceApi~dbDescriptorServiceAddDbDescriptorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    dbDescriptorServiceAddDbDescriptor(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dbDescriptorServiceAddDbDescriptor");
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
        '/api/v1/db/descriptor/add', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dbDescriptorServiceDisableDbDescriptor operation.
     * @callback module:api/DbDescriptorServiceApi~dbDescriptorServiceDisableDbDescriptorCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumEnableDisableRequest} body 
     * @param {module:api/DbDescriptorServiceApi~dbDescriptorServiceDisableDbDescriptorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    dbDescriptorServiceDisableDbDescriptor(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dbDescriptorServiceDisableDbDescriptor");
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
        '/api/v1/db/descriptor/disable', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dbDescriptorServiceEnableDbDescriptor operation.
     * @callback module:api/DbDescriptorServiceApi~dbDescriptorServiceEnableDbDescriptorCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumEnableDisableRequest} body 
     * @param {module:api/DbDescriptorServiceApi~dbDescriptorServiceEnableDbDescriptorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAcknowledgeResponse}
     */
    dbDescriptorServiceEnableDbDescriptor(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dbDescriptorServiceEnableDbDescriptor");
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
        '/api/v1/db/descriptor/enable', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dbDescriptorServiceGetDbDescriptor operation.
     * @callback module:api/DbDescriptorServiceApi~dbDescriptorServiceGetDbDescriptorCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumDescriptorDefinitionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumGetDefinition} body 
     * @param {module:api/DbDescriptorServiceApi~dbDescriptorServiceGetDbDescriptorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumDescriptorDefinitionResponse}
     */
    dbDescriptorServiceGetDbDescriptor(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dbDescriptorServiceGetDbDescriptor");
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
      let returnType = TitaniumDescriptorDefinitionResponse;
      return this.apiClient.callApi(
        '/api/v1/db/descriptor/get', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dbDescriptorServiceGetDbDescriptorVersion operation.
     * @callback module:api/DbDescriptorServiceApi~dbDescriptorServiceGetDbDescriptorVersionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumDescriptorDefinitionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} name 
     * @param {String} versionId 
     * @param {Object} opts Optional parameters
     * @param {String} opts.scope 
     * @param {String} opts.descriptorName 
     * @param {module:api/DbDescriptorServiceApi~dbDescriptorServiceGetDbDescriptorVersionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumDescriptorDefinitionResponse}
     */
    dbDescriptorServiceGetDbDescriptorVersion(name, versionId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'name' is set
      if (name === undefined || name === null) {
        throw new Error("Missing the required parameter 'name' when calling dbDescriptorServiceGetDbDescriptorVersion");
      }
      // verify the required parameter 'versionId' is set
      if (versionId === undefined || versionId === null) {
        throw new Error("Missing the required parameter 'versionId' when calling dbDescriptorServiceGetDbDescriptorVersion");
      }

      let pathParams = {
        'name': name,
        'versionId': versionId
      };
      let queryParams = {
        'scope': opts['scope'],
        'descriptorName': opts['descriptorName']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['*/*'];
      let returnType = TitaniumDescriptorDefinitionResponse;
      return this.apiClient.callApi(
        '/api/v1/db/descriptor/version/{name}/{versionId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dbDescriptorServiceListDbDescriptorVersions operation.
     * @callback module:api/DbDescriptorServiceApi~dbDescriptorServiceListDbDescriptorVersionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumListVersionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumGetDefinition} body 
     * @param {module:api/DbDescriptorServiceApi~dbDescriptorServiceListDbDescriptorVersionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumListVersionResponse}
     */
    dbDescriptorServiceListDbDescriptorVersions(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dbDescriptorServiceListDbDescriptorVersions");
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
        '/api/v1/db/descriptor/versions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dbDescriptorServiceListDbDescriptors operation.
     * @callback module:api/DbDescriptorServiceApi~dbDescriptorServiceListDbDescriptorsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumDescriptorList} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumListRequest} body 
     * @param {module:api/DbDescriptorServiceApi~dbDescriptorServiceListDbDescriptorsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumDescriptorList}
     */
    dbDescriptorServiceListDbDescriptors(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dbDescriptorServiceListDbDescriptors");
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
      let returnType = TitaniumDescriptorList;
      return this.apiClient.callApi(
        '/api/v1/db/descriptor/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}