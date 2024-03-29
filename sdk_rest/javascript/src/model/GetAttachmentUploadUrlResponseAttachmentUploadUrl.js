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
 * The GetAttachmentUploadUrlResponseAttachmentUploadUrl model module.
 * @module model/GetAttachmentUploadUrlResponseAttachmentUploadUrl
 * @version 1.0.0
 */
class GetAttachmentUploadUrlResponseAttachmentUploadUrl {
    /**
     * Constructs a new <code>GetAttachmentUploadUrlResponseAttachmentUploadUrl</code>.
     * @alias module:model/GetAttachmentUploadUrlResponseAttachmentUploadUrl
     */
    constructor() { 
        
        GetAttachmentUploadUrlResponseAttachmentUploadUrl.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetAttachmentUploadUrlResponseAttachmentUploadUrl</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetAttachmentUploadUrlResponseAttachmentUploadUrl} obj Optional instance to populate.
     * @return {module:model/GetAttachmentUploadUrlResponseAttachmentUploadUrl} The populated <code>GetAttachmentUploadUrlResponseAttachmentUploadUrl</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetAttachmentUploadUrlResponseAttachmentUploadUrl();

            if (data.hasOwnProperty('attachmentId')) {
                obj['attachmentId'] = ApiClient.convertToType(data['attachmentId'], 'String');
            }
            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('uploadUrl')) {
                obj['uploadUrl'] = ApiClient.convertToType(data['uploadUrl'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} attachmentId
 */
GetAttachmentUploadUrlResponseAttachmentUploadUrl.prototype['attachmentId'] = undefined;

/**
 * @member {String} fileName
 */
GetAttachmentUploadUrlResponseAttachmentUploadUrl.prototype['fileName'] = undefined;

/**
 * @member {String} uploadUrl
 */
GetAttachmentUploadUrlResponseAttachmentUploadUrl.prototype['uploadUrl'] = undefined;






export default GetAttachmentUploadUrlResponseAttachmentUploadUrl;

