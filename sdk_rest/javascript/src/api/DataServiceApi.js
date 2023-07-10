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
import TitaniumExportRequest from '../model/TitaniumExportRequest';
import TitaniumExportResponse from '../model/TitaniumExportResponse';
import TitaniumMessageResponse from '../model/TitaniumMessageResponse';
import TitaniumSubmittedRequest from '../model/TitaniumSubmittedRequest';
import TitaniumSubmittedResponse from '../model/TitaniumSubmittedResponse';
import TitaniumUploadAuthorizationResponse from '../model/TitaniumUploadAuthorizationResponse';
import TitaniumUploadNotifyRequest from '../model/TitaniumUploadNotifyRequest';
import TitaniumUploadURLRequest from '../model/TitaniumUploadURLRequest';
import TitaniumUploadURLResponse from '../model/TitaniumUploadURLResponse';

/**
* DataService service.
* @module api/DataServiceApi
* @version 1.0.0
*/
export default class DataServiceApi {

    /**
    * Constructs a new DataServiceApi. 
    * @alias module:api/DataServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the dataServiceAuthorizeUpload operation.
     * @callback module:api/DataServiceApi~dataServiceAuthorizeUploadCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumUploadAuthorizationResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * AuthorizeUpload shows availability of uploading for user.
     * @param {module:model/TitaniumUploadURLRequest} body 
     * @param {module:api/DataServiceApi~dataServiceAuthorizeUploadCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumUploadAuthorizationResponse}
     */
    dataServiceAuthorizeUpload(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dataServiceAuthorizeUpload");
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
      let returnType = TitaniumUploadAuthorizationResponse;
      return this.apiClient.callApi(
        '/api/v1/internal/upload/authorize', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dataServiceExport operation.
     * @callback module:api/DataServiceApi~dataServiceExportCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumExportResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Export exports data according to the request.
     * @param {module:model/TitaniumExportRequest} body 
     * @param {module:api/DataServiceApi~dataServiceExportCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumExportResponse}
     */
    dataServiceExport(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dataServiceExport");
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
      let returnType = TitaniumExportResponse;
      return this.apiClient.callApi(
        '/api/v1/export', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dataServiceNotifyUpload operation.
     * @callback module:api/DataServiceApi~dataServiceNotifyUploadCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * NotifyUpload returns message with notify that data was uploaded according to url in request.
     * @param {module:model/TitaniumUploadNotifyRequest} body 
     * @param {module:api/DataServiceApi~dataServiceNotifyUploadCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    dataServiceNotifyUpload(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dataServiceNotifyUpload");
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
        '/api/v1/internal/upload/notify', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dataServiceSubmitted operation.
     * @callback module:api/DataServiceApi~dataServiceSubmittedCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumSubmittedResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Submitted returns submitted data based on the request made.
     * @param {module:model/TitaniumSubmittedRequest} body 
     * @param {module:api/DataServiceApi~dataServiceSubmittedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumSubmittedResponse}
     */
    dataServiceSubmitted(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dataServiceSubmitted");
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
      let returnType = TitaniumSubmittedResponse;
      return this.apiClient.callApi(
        '/api/v1/submitted', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the dataServiceUploadURL operation.
     * @callback module:api/DataServiceApi~dataServiceUploadURLCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumUploadURLResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * UploadURL returns a pre-signed S3 URL for uploading data.
     * @param {module:model/TitaniumUploadURLRequest} body 
     * @param {module:api/DataServiceApi~dataServiceUploadURLCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumUploadURLResponse}
     */
    dataServiceUploadURL(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling dataServiceUploadURL");
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
      let returnType = TitaniumUploadURLResponse;
      return this.apiClient.callApi(
        '/api/v1/upload/url', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
