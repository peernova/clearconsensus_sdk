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
import TitaniumChallengeActiveRequest from '../model/TitaniumChallengeActiveRequest';
import TitaniumChallengeActiveResponse from '../model/TitaniumChallengeActiveResponse';
import TitaniumChallengeCreateRequest from '../model/TitaniumChallengeCreateRequest';
import TitaniumChallengeCreateResponse from '../model/TitaniumChallengeCreateResponse';
import TitaniumChallengeDecisionRequest from '../model/TitaniumChallengeDecisionRequest';
import TitaniumChallengeFormMetaRequest from '../model/TitaniumChallengeFormMetaRequest';
import TitaniumChallengeFormMetaResponse from '../model/TitaniumChallengeFormMetaResponse';
import TitaniumChallengeFreezeActionRequest from '../model/TitaniumChallengeFreezeActionRequest';
import TitaniumChallengeFreezeStatusRequest from '../model/TitaniumChallengeFreezeStatusRequest';
import TitaniumChallengeHistoryRequest from '../model/TitaniumChallengeHistoryRequest';
import TitaniumChallengeHistoryResponse from '../model/TitaniumChallengeHistoryResponse';
import TitaniumChallengeListRequest from '../model/TitaniumChallengeListRequest';
import TitaniumChallengeListResponse from '../model/TitaniumChallengeListResponse';
import TitaniumGetAttachmentUploadUrlRequest from '../model/TitaniumGetAttachmentUploadUrlRequest';
import TitaniumGetAttachmentUploadUrlResponse from '../model/TitaniumGetAttachmentUploadUrlResponse';
import TitaniumGetChallengeDetailsRequest from '../model/TitaniumGetChallengeDetailsRequest';
import TitaniumGetChallengeDetailsResponse from '../model/TitaniumGetChallengeDetailsResponse';
import TitaniumMessageResponse from '../model/TitaniumMessageResponse';
import TitaniumStatusResponse from '../model/TitaniumStatusResponse';

/**
* ChallengeService service.
* @module api/ChallengeServiceApi
* @version 1.0.0
*/
export default class ChallengeServiceApi {

    /**
    * Constructs a new ChallengeServiceApi. 
    * @alias module:api/ChallengeServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the challengeServiceChallengeActive operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceChallengeActiveCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumChallengeActiveResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ChallengeActive returns active challenges(according to request) in active status(challenge process is active).
     * @param {module:model/TitaniumChallengeActiveRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceChallengeActiveCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumChallengeActiveResponse}
     */
    challengeServiceChallengeActive(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceChallengeActive");
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
      let returnType = TitaniumChallengeActiveResponse;
      return this.apiClient.callApi(
        '/api/v1/operator/challenge/active', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the challengeServiceChallengeCreate operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceChallengeCreateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumChallengeCreateResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ChallengeCreate creates challenge in the system.(Initiate process by dealer) To create \"challenger\" needs to be authorised and challenge can be created only if one of their own submitted data points has been declared an outlier in the published Consensus. Need to specify asset and fill out evidence information. Returns response that contains ticket ID of the Challenge or the Error.
     * @param {module:model/TitaniumChallengeCreateRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceChallengeCreateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumChallengeCreateResponse}
     */
    challengeServiceChallengeCreate(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceChallengeCreate");
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
      let returnType = TitaniumChallengeCreateResponse;
      return this.apiClient.callApi(
        '/api/v1/challenge/create', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the challengeServiceChallengeDecision operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceChallengeDecisionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ChallengeDecision sets decision of the challenge according to request.
     * @param {module:model/TitaniumChallengeDecisionRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceChallengeDecisionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    challengeServiceChallengeDecision(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceChallengeDecision");
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
        '/api/v1/operator/challenge/decision', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the challengeServiceChallengeFormMeta operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceChallengeFormMetaCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumChallengeFormMetaResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ChallengeFormMeta is used to request information(template) about the form fields required to submit a challenge for a specific asset and evidence type. Returns response with template with pre-filled data.
     * @param {module:model/TitaniumChallengeFormMetaRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceChallengeFormMetaCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumChallengeFormMetaResponse}
     */
    challengeServiceChallengeFormMeta(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceChallengeFormMeta");
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
      let returnType = TitaniumChallengeFormMetaResponse;
      return this.apiClient.callApi(
        '/api/v1/challenge/form-meta', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the challengeServiceChallengeFreezeAction operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceChallengeFreezeActionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ChallengeFreezeAction makes challenge process stopped or not according to request.
     * @param {module:model/TitaniumChallengeFreezeActionRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceChallengeFreezeActionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    challengeServiceChallengeFreezeAction(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceChallengeFreezeAction");
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
        '/api/v1/operator/challenge/freeze', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the challengeServiceChallengeFreezeStatus operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceChallengeFreezeStatusCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumStatusResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ChallengeFreezeStatus returns StatusResponse that contains string that represents freeze status of challenges if the challenge process is stopped and nothing if the one is not. Challenge can be stopped by operator.Dealer can see the freeze status using this method. Need to specify consensus(where outliers exists) run timestamp.
     * @param {module:model/TitaniumChallengeFreezeStatusRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceChallengeFreezeStatusCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumStatusResponse}
     */
    challengeServiceChallengeFreezeStatus(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceChallengeFreezeStatus");
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
      let returnType = TitaniumStatusResponse;
      return this.apiClient.callApi(
        '/api/v1/challenge/freeze/status', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the challengeServiceChallengeHistory operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceChallengeHistoryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumChallengeHistoryResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ChallengeHistory return already closed challenges according to request.
     * @param {module:model/TitaniumChallengeHistoryRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceChallengeHistoryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumChallengeHistoryResponse}
     */
    challengeServiceChallengeHistory(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceChallengeHistory");
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
      let returnType = TitaniumChallengeHistoryResponse;
      return this.apiClient.callApi(
        '/api/v1/operator/challenge/history', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the challengeServiceChallengeList operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceChallengeListCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumChallengeListResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ChallengeList returns list of challenges according to request.
     * @param {module:model/TitaniumChallengeListRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceChallengeListCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumChallengeListResponse}
     */
    challengeServiceChallengeList(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceChallengeList");
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
      let returnType = TitaniumChallengeListResponse;
      return this.apiClient.callApi(
        '/api/v1/operator/challenge/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the challengeServiceGetChallengeAttachmentUploadUrl operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceGetChallengeAttachmentUploadUrlCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumGetAttachmentUploadUrlResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetChallengeAttachmentUploadUrl returns string that represents s3 URL that can be used to upload attachment for the challenge. The file in attachment can be any file that provides additional information about the disputable outlier. Need to specify asset ID, submitted ID and file name.
     * @param {module:model/TitaniumGetAttachmentUploadUrlRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceGetChallengeAttachmentUploadUrlCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumGetAttachmentUploadUrlResponse}
     */
    challengeServiceGetChallengeAttachmentUploadUrl(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceGetChallengeAttachmentUploadUrl");
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
      let returnType = TitaniumGetAttachmentUploadUrlResponse;
      return this.apiClient.callApi(
        '/api/v1/challenge/attachment_upload_urls', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the challengeServiceGetChallengeDetails operation.
     * @callback module:api/ChallengeServiceApi~challengeServiceGetChallengeDetailsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumGetChallengeDetailsResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/TitaniumGetChallengeDetailsRequest} body 
     * @param {module:api/ChallengeServiceApi~challengeServiceGetChallengeDetailsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumGetChallengeDetailsResponse}
     */
    challengeServiceGetChallengeDetails(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling challengeServiceGetChallengeDetails");
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
      let returnType = TitaniumGetChallengeDetailsResponse;
      return this.apiClient.callApi(
        '/api/v1/challenge-details', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
