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
import TitaniumAssetsListRequest from '../model/TitaniumAssetsListRequest';
import TitaniumAssetsListResponse from '../model/TitaniumAssetsListResponse';
import TitaniumAssetsRequest from '../model/TitaniumAssetsRequest';
import TitaniumAssetsResponse from '../model/TitaniumAssetsResponse';
import TitaniumRecentAssetsRequest from '../model/TitaniumRecentAssetsRequest';
import TitaniumRecentAssetsResponse from '../model/TitaniumRecentAssetsResponse';

/**
* AssetsService service.
* @module api/AssetsServiceApi
* @version 1.0.0
*/
export default class AssetsServiceApi {

    /**
    * Constructs a new AssetsServiceApi. 
    * @alias module:api/AssetsServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the assetsServiceAssets operation.
     * @callback module:api/AssetsServiceApi~assetsServiceAssetsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAssetsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Assets returns asset from the system according to request.
     * @param {module:model/TitaniumAssetsRequest} body 
     * @param {module:api/AssetsServiceApi~assetsServiceAssetsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAssetsResponse}
     */
    assetsServiceAssets(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling assetsServiceAssets");
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
        '/api/v1/assets', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the assetsServiceAssetsList operation.
     * @callback module:api/AssetsServiceApi~assetsServiceAssetsListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAssetsListResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * AssetsList return list of assets according to snap time.
     * @param {module:model/TitaniumAssetsListRequest} body 
     * @param {module:api/AssetsServiceApi~assetsServiceAssetsListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAssetsListResponse}
     */
    assetsServiceAssetsList(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling assetsServiceAssetsList");
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
      let returnType = TitaniumAssetsListResponse;
      return this.apiClient.callApi(
        '/api/v1/assets/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the assetsServiceRecentAssets operation.
     * @callback module:api/AssetsServiceApi~assetsServiceRecentAssetsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumRecentAssetsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * RecentAssets returns recent added assets according to request.
     * @param {module:model/TitaniumRecentAssetsRequest} body 
     * @param {module:api/AssetsServiceApi~assetsServiceRecentAssetsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumRecentAssetsResponse}
     */
    assetsServiceRecentAssets(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling assetsServiceRecentAssets");
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
        '/api/v1/recentassets', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the assetsServiceSupportedAssets operation.
     * @callback module:api/AssetsServiceApi~assetsServiceSupportedAssetsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumAssetsListResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:api/AssetsServiceApi~assetsServiceSupportedAssetsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumAssetsListResponse}
     */
    assetsServiceSupportedAssets(callback) {
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
      let returnType = TitaniumAssetsListResponse;
      return this.apiClient.callApi(
        '/api/v1/supported/assets', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
