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

import ApiClient from '../ApiClient';

/**
 * The FileServiceGetFilePreviewRequest model module.
 * @module model/FileServiceGetFilePreviewRequest
 * @version 1.0.0
 */
class FileServiceGetFilePreviewRequest {
    /**
     * Constructs a new <code>FileServiceGetFilePreviewRequest</code>.
     * FileIdentifier contains information about a file including its filename, upload date, and status.
     * @alias module:model/FileServiceGetFilePreviewRequest
     */
    constructor() { 
        
        FileServiceGetFilePreviewRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FileServiceGetFilePreviewRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FileServiceGetFilePreviewRequest} obj Optional instance to populate.
     * @return {module:model/FileServiceGetFilePreviewRequest} The populated <code>FileServiceGetFilePreviewRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FileServiceGetFilePreviewRequest();

            if (data.hasOwnProperty('fileStatus')) {
                obj['fileStatus'] = ApiClient.convertToType(data['fileStatus'], 'String');
            }
            if (data.hasOwnProperty('uploadDate')) {
                obj['uploadDate'] = ApiClient.convertToType(data['uploadDate'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} fileStatus
 */
FileServiceGetFilePreviewRequest.prototype['fileStatus'] = undefined;

/**
 * @member {String} uploadDate
 */
FileServiceGetFilePreviewRequest.prototype['uploadDate'] = undefined;






export default FileServiceGetFilePreviewRequest;
