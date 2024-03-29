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
import FileServiceGetFilePreviewRequest from '../model/FileServiceGetFilePreviewRequest';
import RpcStatus from '../model/RpcStatus';
import TitaniumFileDelimiterSetting from '../model/TitaniumFileDelimiterSetting';
import TitaniumFileDescriptorSetting from '../model/TitaniumFileDescriptorSetting';
import TitaniumFileHistoryRequest from '../model/TitaniumFileHistoryRequest';
import TitaniumFileHistoryResponse from '../model/TitaniumFileHistoryResponse';
import TitaniumFileList from '../model/TitaniumFileList';
import TitaniumFilePreview from '../model/TitaniumFilePreview';
import TitaniumFileSubmissionRequest from '../model/TitaniumFileSubmissionRequest';
import TitaniumGetFileExportUrlRequest from '../model/TitaniumGetFileExportUrlRequest';
import TitaniumGetFileExportUrlResponse from '../model/TitaniumGetFileExportUrlResponse';
import TitaniumListRequest from '../model/TitaniumListRequest';
import TitaniumMessageResponse from '../model/TitaniumMessageResponse';
import TitaniumSetFileDelimiterRequest from '../model/TitaniumSetFileDelimiterRequest';
import TitaniumSetFileDescriptorRequest from '../model/TitaniumSetFileDescriptorRequest';

/**
* FileService service.
* @module api/FileServiceApi
* @version 1.0.0
*/
export default class FileServiceApi {

    /**
    * Constructs a new FileServiceApi. 
    * @alias module:api/FileServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the fileServiceFileHistory operation.
     * @callback module:api/FileServiceApi~fileServiceFileHistoryCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumFileHistoryResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * FileHistory retrieves the history for a specified file.
     * @param {module:model/TitaniumFileHistoryRequest} body 
     * @param {module:api/FileServiceApi~fileServiceFileHistoryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumFileHistoryResponse}
     */
    fileServiceFileHistory(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling fileServiceFileHistory");
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
      let returnType = TitaniumFileHistoryResponse;
      return this.apiClient.callApi(
        '/api/v1/file-history', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fileServiceFileSubmission operation.
     * @callback module:api/FileServiceApi~fileServiceFileSubmissionCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumMessageResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * FileSubmission submits a file for processing.
     * @param {module:model/TitaniumFileSubmissionRequest} body 
     * @param {module:api/FileServiceApi~fileServiceFileSubmissionCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumMessageResponse}
     */
    fileServiceFileSubmission(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling fileServiceFileSubmission");
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
        '/api/v1/file-submission', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fileServiceGetFileDelimiter operation.
     * @callback module:api/FileServiceApi~fileServiceGetFileDelimiterCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumFileDelimiterSetting} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetFileDelimiter retrieves the delimiter for a specified file.
     * @param {String} filename 
     * @param {module:model/FileServiceGetFilePreviewRequest} body 
     * @param {module:api/FileServiceApi~fileServiceGetFileDelimiterCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumFileDelimiterSetting}
     */
    fileServiceGetFileDelimiter(filename, body, callback) {
      let postBody = body;
      // verify the required parameter 'filename' is set
      if (filename === undefined || filename === null) {
        throw new Error("Missing the required parameter 'filename' when calling fileServiceGetFileDelimiter");
      }
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling fileServiceGetFileDelimiter");
      }

      let pathParams = {
        'filename': filename
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
      let returnType = TitaniumFileDelimiterSetting;
      return this.apiClient.callApi(
        '/api/v1/import/{filename}/delimiter', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fileServiceGetFileDescriptor operation.
     * @callback module:api/FileServiceApi~fileServiceGetFileDescriptorCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumFileDescriptorSetting} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetFileDescriptor retrieves the descriptor for a specified file.
     * @param {String} filename 
     * @param {module:model/FileServiceGetFilePreviewRequest} body 
     * @param {module:api/FileServiceApi~fileServiceGetFileDescriptorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumFileDescriptorSetting}
     */
    fileServiceGetFileDescriptor(filename, body, callback) {
      let postBody = body;
      // verify the required parameter 'filename' is set
      if (filename === undefined || filename === null) {
        throw new Error("Missing the required parameter 'filename' when calling fileServiceGetFileDescriptor");
      }
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling fileServiceGetFileDescriptor");
      }

      let pathParams = {
        'filename': filename
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
      let returnType = TitaniumFileDescriptorSetting;
      return this.apiClient.callApi(
        '/api/v1/import/{filename}/descriptor', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fileServiceGetFileExportUrl operation.
     * @callback module:api/FileServiceApi~fileServiceGetFileExportUrlCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumGetFileExportUrlResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetFileExportUrl retrieves the export URL for a specified file.
     * @param {module:model/TitaniumGetFileExportUrlRequest} body 
     * @param {module:api/FileServiceApi~fileServiceGetFileExportUrlCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumGetFileExportUrlResponse}
     */
    fileServiceGetFileExportUrl(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling fileServiceGetFileExportUrl");
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
      let returnType = TitaniumGetFileExportUrlResponse;
      return this.apiClient.callApi(
        '/api/v1/raw-file', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fileServiceGetFilePreview operation.
     * @callback module:api/FileServiceApi~fileServiceGetFilePreviewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumFilePreview} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * GetFilePreview retrieves a preview of a specified file.
     * @param {String} filename 
     * @param {module:model/FileServiceGetFilePreviewRequest} body 
     * @param {module:api/FileServiceApi~fileServiceGetFilePreviewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumFilePreview}
     */
    fileServiceGetFilePreview(filename, body, callback) {
      let postBody = body;
      // verify the required parameter 'filename' is set
      if (filename === undefined || filename === null) {
        throw new Error("Missing the required parameter 'filename' when calling fileServiceGetFilePreview");
      }
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling fileServiceGetFilePreview");
      }

      let pathParams = {
        'filename': filename
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
      let returnType = TitaniumFilePreview;
      return this.apiClient.callApi(
        '/api/v1/import/{filename}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fileServiceListFiles operation.
     * @callback module:api/FileServiceApi~fileServiceListFilesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/TitaniumFileList} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * ListFiles retrieves a list of files.
     * @param {module:model/TitaniumListRequest} body 
     * @param {module:api/FileServiceApi~fileServiceListFilesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/TitaniumFileList}
     */
    fileServiceListFiles(body, callback) {
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling fileServiceListFiles");
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
      let returnType = TitaniumFileList;
      return this.apiClient.callApi(
        '/api/v1/import/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fileServiceSetFileDelimiter operation.
     * @callback module:api/FileServiceApi~fileServiceSetFileDelimiterCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * SetFileDelimiter sets the delimiter for a specified file.
     * @param {String} fileIdentifierFilename 
     * @param {module:model/TitaniumSetFileDelimiterRequest} body 
     * @param {module:api/FileServiceApi~fileServiceSetFileDelimiterCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    fileServiceSetFileDelimiter(fileIdentifierFilename, body, callback) {
      let postBody = body;
      // verify the required parameter 'fileIdentifierFilename' is set
      if (fileIdentifierFilename === undefined || fileIdentifierFilename === null) {
        throw new Error("Missing the required parameter 'fileIdentifierFilename' when calling fileServiceSetFileDelimiter");
      }
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling fileServiceSetFileDelimiter");
      }

      let pathParams = {
        'fileIdentifier.filename': fileIdentifierFilename
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
      let returnType = Object;
      return this.apiClient.callApi(
        '/api/v1/import/{fileIdentifier.filename}/delimiter', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fileServiceSetFileDescriptor operation.
     * @callback module:api/FileServiceApi~fileServiceSetFileDescriptorCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * SetFileDescriptor sets the descriptor for a specified file.
     * @param {String} fileIdentifierFilename 
     * @param {module:model/TitaniumSetFileDescriptorRequest} body 
     * @param {module:api/FileServiceApi~fileServiceSetFileDescriptorCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    fileServiceSetFileDescriptor(fileIdentifierFilename, body, callback) {
      let postBody = body;
      // verify the required parameter 'fileIdentifierFilename' is set
      if (fileIdentifierFilename === undefined || fileIdentifierFilename === null) {
        throw new Error("Missing the required parameter 'fileIdentifierFilename' when calling fileServiceSetFileDescriptor");
      }
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling fileServiceSetFileDescriptor");
      }

      let pathParams = {
        'fileIdentifier.filename': fileIdentifierFilename
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
      let returnType = Object;
      return this.apiClient.callApi(
        '/api/v1/import/{fileIdentifier.filename}/descriptor', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
