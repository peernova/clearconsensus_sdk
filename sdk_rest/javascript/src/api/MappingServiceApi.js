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
import TitaniumDescriptorPairBasedAcknowledgeResponse from '../model/TitaniumDescriptorPairBasedAcknowledgeResponse';
import TitaniumDescriptorPairBasedGetDefinition from '../model/TitaniumDescriptorPairBasedGetDefinition';
import TitaniumListRequest from '../model/TitaniumListRequest';
import TitaniumListVersionResponse from '../model/TitaniumListVersionResponse';
import TitaniumMappingRuleDefinition from '../model/TitaniumMappingRuleDefinition';
import TitaniumMappingRuleList from '../model/TitaniumMappingRuleList';
import TitaniumMappingRuleResponse from '../model/TitaniumMappingRuleResponse';

/**
* MappingService service.
* @module api/MappingServiceApi
* @version 1.0.0
*/
export default class MappingServiceApi {

    /**
    * Constructs a new MappingServiceApi. 
    * @alias module:api/MappingServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the mappingServiceAddMappingRule operation.
     * @callback module:api/MappingServiceApi~mappingServiceAddMappingRuleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumDescriptorPairBasedAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * AddMappingRule AddMappingRule is an API used to add a specific mapping rule to the system. The name provided for the mapping rule must match the asset class and descriptor names. If a mapping rule with the same name already exists, it will be updated. This API accepts a MappingRuleDefinition object as its parameter,which includes information about the mapping rule being added. The response from this API is a DescriptorPairBasedAcknowledgeResponse,which acknowledges the addition of the mapping rule.
     * Example of request for regular user : {   \"src_descriptor\":\"foreign_exchange-vanilla-forwards\",   \"dest_descriptor\":\"foreign_exchange-vanilla-forwards\",   \"transformations\":[      {         \"targetColumn\":\"submission_date\",         \"sourceColumn\":\"date\"      },      {         \"targetColumn\":\"submission_asset\",         \"rule\":\"{ \\\"$to_upper\\\": { \\\"$trim\\\" : \\\"fx_test_for_bank1.submission_asset\\\" }}\",         \"name\": \"upper case asset\",         \"description\": \"i am optional...\"      }   ] }  Example of request for Back Office : {   \"src_descriptor\":\"foreign_exchange-vanilla-forwards\",   \"dest_descriptor\":\"foreign_exchange-vanilla-forwards\",   \"scope\":\"global\",   \"transformations\":[      {         \"targetColumn\":\"submission_date\",         \"sourceColumn\":\"another_date\"      },      {         \"targetColumn\":\"submission_asset\",         \"rule\":\"{ \\\"$to_upper\\\": { \\\"$trim\\\" : \\\"fx_test_for_bank1.submission_asset\\\" }}\",         \"name\": \"upper case asset\",         \"description\": \"i am optional...\"      }   ] }  Example of response : {   \"data\":{      \"uid\":\"fc8b57b7-cc90-11ec-b784-8dfc726b351f\",      \"src_descriptor\":\"foreign_exchange-vanilla-forwards\",      \"dest_descriptor\":\"foreign_exchange-vanilla-forwards\"   } }  Example of error response : {   \"error\":{      \"code\":70,      \"message\":\"Missing argument: rule name.\"   } }
     * @param {module:model/TitaniumMappingRuleDefinition} body 
     * @param {module:api/MappingServiceApi~mappingServiceAddMappingRuleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumDescriptorPairBasedAcknowledgeResponse}
     */
    mappingServiceAddMappingRule(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling mappingServiceAddMappingRule");
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
      let returnType = TitaniumDescriptorPairBasedAcknowledgeResponse;
      return this.apiClient.callApi(
        '/api/v1/mapping/rule/add', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the mappingServiceDisableMappingRule operation.
     * @callback module:api/MappingServiceApi~mappingServiceDisableMappingRuleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumDescriptorPairBasedAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * DisableMappingRule is used to disable a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedGetDefinition object as its parameter, which specifies the source and destination descriptors for the mapping rule. The response from this it is a DescriptorPairBasedAcknowledgeResponse, which acknowledges the disablement of the mapping rule.
     * Request: {  \"src_descriptor\":\"foreign_exchange-vanilla-options\",  \"dest_descriptor\":\"foreign_exchange-vanilla-options\"  \"scope\": \"Zbank1\" }  Response: {    \"data\": {        \"uid\": \"\",        \"src_descriptor\":\"foreign_exchange-vanilla-options\",        \"dest_descriptor\":\"foreign_exchange-vanilla-options\"    } }
     * @param {module:model/TitaniumDescriptorPairBasedGetDefinition} body 
     * @param {module:api/MappingServiceApi~mappingServiceDisableMappingRuleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumDescriptorPairBasedAcknowledgeResponse}
     */
    mappingServiceDisableMappingRule(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling mappingServiceDisableMappingRule");
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
      let returnType = TitaniumDescriptorPairBasedAcknowledgeResponse;
      return this.apiClient.callApi(
        '/api/v1/mapping/rule/disable', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the mappingServiceEnableMappingRule operation.
     * @callback module:api/MappingServiceApi~mappingServiceEnableMappingRuleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumDescriptorPairBasedAcknowledgeResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * EnableMappingRule is used to enable a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedGetDefinition object as its parameter, which specifies the source and destination descriptors for the mapping rule. The response from this it is a DescriptorPairBasedAcknowledgeResponse, which acknowledges the enablement of the mapping rule.
     * Request: {  \"src_descriptor\":\"foreign_exchange-vanilla-options\",  \"dest_descriptor\":\"foreign_exchange-vanilla-options\"  \"scope\": \"Zbank1\" }  Response: {    \"data\": {        \"uid\": \"\",        \"src_descriptor\":\"foreign_exchange-vanilla-options\",        \"dest_descriptor\":\"foreign_exchange-vanilla-options\"    } }
     * @param {module:model/TitaniumDescriptorPairBasedGetDefinition} body 
     * @param {module:api/MappingServiceApi~mappingServiceEnableMappingRuleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumDescriptorPairBasedAcknowledgeResponse}
     */
    mappingServiceEnableMappingRule(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling mappingServiceEnableMappingRule");
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
      let returnType = TitaniumDescriptorPairBasedAcknowledgeResponse;
      return this.apiClient.callApi(
        '/api/v1/mapping/rule/enable', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the mappingServiceGetMappingRule operation.
     * @callback module:api/MappingServiceApi~mappingServiceGetMappingRuleCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMappingRuleResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetMappingRule is used to retrieve a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedGetDefinition object as its parameter, which specifies the source and destination descriptors for the mapping rule. The response from this it is a MappingRuleResponse, which includes information about the retrieved mapping rule.
     * Example of request for regular user : {   \"identifier\":{      \"uid\":\"fc8b57b7-cc90-11ec-b784-8dfc726b351f\"   } } Or : {      \"src_descriptor\":\"foreign_exchange-vanilla-forwards\",      \"dest_descriptor\":\"foreign_exchange-vanilla-forwards\" }  Example of request for Back Office : {   \"identifier\":{       \"uid\":\"fc8b57b7-cc90-11ec-b784-8dfc726b351f\"   },   \"scope\":\"bank1\" } Or : {   \"src_descriptor\":\"foreign_exchange-vanilla-forwards\",   \"dest_descriptor\":\"foreign_exchange-vanilla-forwards\",   \"scope\":\"bank1\" }  Example of response : { \"data\": {  \"uid\": \"\",  \"srcDescriptor\": \"foreign_exchange-vanilla-options\",  \"destDescriptor\": \"foreign_exchange-vanilla-options\",  \"transformations\": [   {    \"name\": \"\",    \"targetColumn\": \"snap_date\",    \"sourceColumn\": \"submission_date\",    \"rule\": \"\",    \"description\": \"\"   }  ],  \"scope\": \"\" } }  Example of error response : {   \"error\":{      \"code\":70,      \"message\":\"Can't get mapping rule: [[empty] of service [MAPPINGRULESET] does not exist in namespace [bank1]].\"   } }
     * @param {module:model/TitaniumDescriptorPairBasedGetDefinition} body 
     * @param {module:api/MappingServiceApi~mappingServiceGetMappingRuleCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMappingRuleResponse}
     */
    mappingServiceGetMappingRule(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling mappingServiceGetMappingRule");
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
      let returnType = TitaniumMappingRuleResponse;
      return this.apiClient.callApi(
        '/api/v1/mapping/rule/get', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the mappingServiceGetMappingRuleVersion operation.
     * @callback module:api/MappingServiceApi~mappingServiceGetMappingRuleVersionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMappingRuleResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetMappingRuleVersion is used to retrieve a specific version of a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedVersionRequest object as its parameter, which includes the scope, source descriptor, destination descriptor, and version ID for the mapping rule. The response from it is a MappingRuleResponse, which includes information about the retrieved version of the mapping rule.
     * Example of request : GET /api/v1/validation/rule/version/fx_fwd_1/fx_fwd_2/teTYb9Fs_lIOoPQJukM6dY3aJdiMqT-SdBPdvYfJAjk=  Example of response : {   \"definition\":\"{\\\"src_descriptor\\\":\\\"foreign_exchange-vanilla-forwards\\\",\\\"dest_descriptor\\\":\\\"foreign_exchange-vanilla-forwards\\\",\\\"transformations\\\":[{\\\"targetColumnName\\\":\\\"submission_date\\\",\\\"sourceColumnName\\\":\\\"another_date\\\"},{\\\"rule\\\":\\\"{ \\\\\\\"$to_upper\\\\\\\": { \\\\\\\"$trim\\\\\\\" : \\\\\\\"fx_test_for_bank1.submission_asset\\\\\\\" }}\\\",\\\"targetColumnName\\\":\\\"submission_asset\\\", \\\"name\\\": \\\"upper case asset\\\", \\\"description\\\": \\\"i am optional...\\\"}]}\" }
     * @param {String} scope 
     * @param {String} srcDescriptor 
     * @param {String} destDescriptor 
     * @param {String} versionId 
     * @param {module:api/MappingServiceApi~mappingServiceGetMappingRuleVersionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMappingRuleResponse}
     */
    mappingServiceGetMappingRuleVersion(scope, srcDescriptor, destDescriptor, versionId, callback) {
      let postBody = null;
      // verify the required parameter 'scope' is set
      if (scope === undefined || scope === null) {
        throw new Error("Missing the required parameter 'scope' when calling mappingServiceGetMappingRuleVersion");
      }
      // verify the required parameter 'srcDescriptor' is set
      if (srcDescriptor === undefined || srcDescriptor === null) {
        throw new Error("Missing the required parameter 'srcDescriptor' when calling mappingServiceGetMappingRuleVersion");
      }
      // verify the required parameter 'destDescriptor' is set
      if (destDescriptor === undefined || destDescriptor === null) {
        throw new Error("Missing the required parameter 'destDescriptor' when calling mappingServiceGetMappingRuleVersion");
      }
      // verify the required parameter 'versionId' is set
      if (versionId === undefined || versionId === null) {
        throw new Error("Missing the required parameter 'versionId' when calling mappingServiceGetMappingRuleVersion");
      }

      let pathParams = {
        'scope': scope,
        'srcDescriptor': srcDescriptor,
        'destDescriptor': destDescriptor,
        'versionId': versionId
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
      let returnType = TitaniumMappingRuleResponse;
      return this.apiClient.callApi(
        '/api/v1/mapping/rule/version/{scope}/{srcDescriptor}/{destDescriptor}/{versionId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the mappingServiceListMappingRuleVersions operation.
     * @callback module:api/MappingServiceApi~mappingServiceListMappingRuleVersionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumListVersionResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ListMappingRuleVersions is used to retrieve a list of all versions of a mapping rule for a given descriptor pair. It accepts a DescriptorPairBasedGetDefinition object as its parameter, which specifies the source and destination descriptors for the mapping rule. The response from this it is a ListVersionResponse, which includes information about all versions of the mapping rule.
     * Example of request : {  \"scope\": \"global\",  \"src_descriptor\":\"foreign_exchange-vanilla-options\",  \"dest_descriptor\":\"foreign_exchange-vanilla-options\" }  Example of response : {   \"data\":{      \"versions\":[         {            \"versionId\":\"EKc9bpBGCbLJmBqOpP0FTqtNusxgZrgCheGXj_MTj7A=\",            \"createdAt\":\"2022-05-05 11:33:59.0\"         },         {            \"versionId\":\"JKLFLkhV3SC-fqO0L-WTswr5ttHLfnvF8rMlLnkafAc=\",            \"createdAt\":\"2022-05-05 11:32:42.0\"         }      ]   } }
     * @param {module:model/TitaniumDescriptorPairBasedGetDefinition} body 
     * @param {module:api/MappingServiceApi~mappingServiceListMappingRuleVersionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumListVersionResponse}
     */
    mappingServiceListMappingRuleVersions(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling mappingServiceListMappingRuleVersions");
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
        '/api/v1/mapping/rule/versions', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the mappingServiceListMappingRules operation.
     * @callback module:api/MappingServiceApi~mappingServiceListMappingRulesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMappingRuleList} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ListMappingRules is used to retrieve a list of all mapping rules in the system. It accepts a ListRequest object as its parameter, which includes optional parameters for filtering the results. The response from this it is a MappingRuleList, which includes information about all mapping rules in the system that match the provided filter parameters.
     * Example of request : {   \"scope\":\"global\" } Or optionally use filter: {   \"scope\":\"global\",   \"filter\": \".*vanilla.*__.*vanilla.*\" // all mapping rules from any vanilla to any vanilla }  Example of response : {    \"data\": {        \"results\": [            {                \"uid\": \"Djqreg7gTs7CV2rSyyucOWCFjK7ldgS9yQX0o0rEiV0=\",                \"src_descriptor\": \"foreign_exchange-vanilla-forwards\",                \"dest_descriptor\": \"foreign_exchange-vanilla-forwards\"             },            {                \"uid\": \"Djqreg7gTs7CV2rSyyucOWCFjK7ldgS9yQX0o0rEiV0=\",                \"src_descriptor\": \"foreign_exchange-vanilla-options\",                \"dest_descriptor\": \"foreign_exchange-vanilla-options\"            }        ]    } }
     * @param {module:model/TitaniumListRequest} body 
     * @param {module:api/MappingServiceApi~mappingServiceListMappingRulesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMappingRuleList}
     */
    mappingServiceListMappingRules(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling mappingServiceListMappingRules");
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
      let returnType = TitaniumMappingRuleList;
      return this.apiClient.callApi(
        '/api/v1/mapping/rule/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
