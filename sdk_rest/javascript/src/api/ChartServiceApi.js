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
import TitaniumGetChartDataRequest from '../model/TitaniumGetChartDataRequest';
import TitaniumGetChartDataResponse from '../model/TitaniumGetChartDataResponse';

/**
* ChartService service.
* @module api/ChartServiceApi
* @version 1.0.0
*/
export default class ChartServiceApi {

    /**
    * Constructs a new ChartServiceApi. 
    * @alias module:api/ChartServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the chartServiceGetChartData operation.
     * @callback module:api/ChartServiceApi~chartServiceGetChartDataCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumGetChartDataResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumGetChartDataRequest} body 
     * @param {module:api/ChartServiceApi~chartServiceGetChartDataCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumGetChartDataResponse}
     */
    chartServiceGetChartData(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling chartServiceGetChartData");
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
      let returnType = TitaniumGetChartDataResponse;
      return this.apiClient.callApi(
        '/api/v1/analytics/chart-data', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}