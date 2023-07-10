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
import TitaniumAddAssetRequest from '../model/TitaniumAddAssetRequest';
import TitaniumAssetsRequest from '../model/TitaniumAssetsRequest';
import TitaniumAssetsResponse from '../model/TitaniumAssetsResponse';
import TitaniumClientName from '../model/TitaniumClientName';
import TitaniumEvpStatusesRequest from '../model/TitaniumEvpStatusesRequest';
import TitaniumEvpStatusesResponse from '../model/TitaniumEvpStatusesResponse';
import TitaniumExportReportRequest from '../model/TitaniumExportReportRequest';
import TitaniumExportResponse from '../model/TitaniumExportResponse';
import TitaniumListClientsResponse from '../model/TitaniumListClientsResponse';
import TitaniumMessageResponse from '../model/TitaniumMessageResponse';
import TitaniumOperatorOutliersRequest from '../model/TitaniumOperatorOutliersRequest';
import TitaniumOperatorOutliersResponse from '../model/TitaniumOperatorOutliersResponse';
import TitaniumOutliersRequest from '../model/TitaniumOutliersRequest';
import TitaniumOutliersResponse from '../model/TitaniumOutliersResponse';
import TitaniumRecentAssetsRequest from '../model/TitaniumRecentAssetsRequest';
import TitaniumRecentAssetsResponse from '../model/TitaniumRecentAssetsResponse';
import TitaniumSupportedFieldsValues from '../model/TitaniumSupportedFieldsValues';
import TitaniumUploadDTCCRequest from '../model/TitaniumUploadDTCCRequest';
import TitaniumUploadEVPRequest from '../model/TitaniumUploadEVPRequest';
import TitaniumUploadURLResponse from '../model/TitaniumUploadURLResponse';

/**
* OperatorServicePrivate service.
* @module api/OperatorServicePrivateApi
* @version 1.0.0
*/
export default class OperatorServicePrivateApi {

    /**
    * Constructs a new OperatorServicePrivateApi. 
    * @alias module:api/OperatorServicePrivateApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the operatorServicePrivateAddAsset operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateAddAssetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * AddAsset adds asset to the system.
     * @param {module:model/TitaniumAddAssetRequest} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateAddAssetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    operatorServicePrivateAddAsset(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateAddAsset");
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
        '/api/v1/operator/assets/add', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateAddClient operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateAddClientCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumClientName} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateAddClientCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    operatorServicePrivateAddClient(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateAddClient");
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
        '/api/v1/operator/client/add', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateAddSupportedFields operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateAddSupportedFieldsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumSupportedFieldsValues} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateAddSupportedFieldsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    operatorServicePrivateAddSupportedFields(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateAddSupportedFields");
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
        '/api/v1/operator/add/field-values', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateAssets operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateAssetsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAssetsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumAssetsRequest} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateAssetsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAssetsResponse}
     */
    operatorServicePrivateAssets(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateAssets");
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
      let returnType = TitaniumAssetsResponse;
      return this.apiClient.callApi(
        '/api/v1/operator/assets', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateCreateSupportedFields operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateCreateSupportedFieldsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumSupportedFieldsValues} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateCreateSupportedFieldsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    operatorServicePrivateCreateSupportedFields(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateCreateSupportedFields");
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
        '/api/v1/operator/create/field-values', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateDeleteSupportedFields operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateDeleteSupportedFieldsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumSupportedFieldsValues} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateDeleteSupportedFieldsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    operatorServicePrivateDeleteSupportedFields(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateDeleteSupportedFields");
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
        '/api/v1/operator/delete/field-values', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateEvpStatuses operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateEvpStatusesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumEvpStatusesResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumEvpStatusesRequest} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateEvpStatusesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumEvpStatusesResponse}
     */
    operatorServicePrivateEvpStatuses(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateEvpStatuses");
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
      let returnType = TitaniumEvpStatusesResponse;
      return this.apiClient.callApi(
        '/api/v1/operator/evaluated-prices/slice', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateExportReport operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateExportReportCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumExportResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ExportReport returns pre signed s3 urls which can be used for export report(and compression type)
     * @param {module:model/TitaniumExportReportRequest} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateExportReportCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumExportResponse}
     */
    operatorServicePrivateExportReport(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateExportReport");
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
        '/api/v1/operator/report', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateListClients operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateListClientsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumListClientsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateListClientsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumListClientsResponse}
     */
    operatorServicePrivateListClients(callback) {
      let postBody = null;

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
      let returnType = TitaniumListClientsResponse;
      return this.apiClient.callApi(
        '/api/v1/operator/client/list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateOperatorOutliers operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateOperatorOutliersCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumOperatorOutliersResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumOperatorOutliersRequest} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateOperatorOutliersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumOperatorOutliersResponse}
     */
    operatorServicePrivateOperatorOutliers(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateOperatorOutliers");
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
      let returnType = TitaniumOperatorOutliersResponse;
      return this.apiClient.callApi(
        '/api/v1/operator-outliers', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateOutliers operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateOutliersCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumOutliersResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumOutliersRequest} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateOutliersCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumOutliersResponse}
     */
    operatorServicePrivateOutliers(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateOutliers");
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
      let returnType = TitaniumOutliersResponse;
      return this.apiClient.callApi(
        '/api/v1/operator/outliers', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateRecentAssets operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateRecentAssetsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumRecentAssetsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumRecentAssetsRequest} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateRecentAssetsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumRecentAssetsResponse}
     */
    operatorServicePrivateRecentAssets(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateRecentAssets");
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
      let returnType = TitaniumRecentAssetsResponse;
      return this.apiClient.callApi(
        '/api/v1/operator/recentassets', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateUploadDTCC operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateUploadDTCCCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumUploadURLResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumUploadDTCCRequest} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateUploadDTCCCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumUploadURLResponse}
     */
    operatorServicePrivateUploadDTCC(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateUploadDTCC");
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
        '/api/v1/operator/dtcc-trades/upload', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the operatorServicePrivateUploadEVP operation.
     * @callback module:api/OperatorServicePrivateApi~operatorServicePrivateUploadEVPCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumUploadURLResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumUploadEVPRequest} body 
     * @param {module:api/OperatorServicePrivateApi~operatorServicePrivateUploadEVPCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumUploadURLResponse}
     */
    operatorServicePrivateUploadEVP(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling operatorServicePrivateUploadEVP");
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
        '/api/v1/operator/evp/upload', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
