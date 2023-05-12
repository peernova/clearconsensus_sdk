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
 * The TitaniumUploadURLRequest model module.
 * @module model/TitaniumUploadURLRequest
 * @version 1.0.0
 */
class TitaniumUploadURLRequest {
    /**
     * Constructs a new <code>TitaniumUploadURLRequest</code>.
     * @alias module:model/TitaniumUploadURLRequest
     */
    constructor() { 
        
        TitaniumUploadURLRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumUploadURLRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumUploadURLRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumUploadURLRequest} The populated <code>TitaniumUploadURLRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumUploadURLRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('client')) {
                obj['client'] = ApiClient.convertToType(data['client'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('descriptorName')) {
                obj['descriptorName'] = ApiClient.convertToType(data['descriptorName'], 'String');
            }
            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('traceName')) {
                obj['traceName'] = ApiClient.convertToType(data['traceName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} assetId
 */
TitaniumUploadURLRequest.prototype['assetId'] = undefined;

/**
 * @member {String} client
 */
TitaniumUploadURLRequest.prototype['client'] = undefined;

/**
 * @member {String} date
 */
TitaniumUploadURLRequest.prototype['date'] = undefined;

/**
 * @member {String} descriptorName
 */
TitaniumUploadURLRequest.prototype['descriptorName'] = undefined;

/**
 * @member {String} fileName
 */
TitaniumUploadURLRequest.prototype['fileName'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumUploadURLRequest.prototype['traceName'] = undefined;






export default TitaniumUploadURLRequest;
