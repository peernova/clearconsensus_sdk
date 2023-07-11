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
 * The TitaniumUploadEvaluatedPriceRequest model module.
 * @module model/TitaniumUploadEvaluatedPriceRequest
 * @version 1.0.0
 */
class TitaniumUploadEvaluatedPriceRequest {
    /**
     * Constructs a new <code>TitaniumUploadEvaluatedPriceRequest</code>.
     * @alias module:model/TitaniumUploadEvaluatedPriceRequest
     */
    constructor() { 
        
        TitaniumUploadEvaluatedPriceRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumUploadEvaluatedPriceRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumUploadEvaluatedPriceRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumUploadEvaluatedPriceRequest} The populated <code>TitaniumUploadEvaluatedPriceRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumUploadEvaluatedPriceRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('file')) {
                obj['file'] = ApiClient.convertToType(data['file'], 'String');
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
TitaniumUploadEvaluatedPriceRequest.prototype['assetId'] = undefined;

/**
 * @member {String} date
 */
TitaniumUploadEvaluatedPriceRequest.prototype['date'] = undefined;

/**
 * @member {String} file
 */
TitaniumUploadEvaluatedPriceRequest.prototype['file'] = undefined;

/**
 * @member {String} fileName
 */
TitaniumUploadEvaluatedPriceRequest.prototype['fileName'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumUploadEvaluatedPriceRequest.prototype['traceName'] = undefined;






export default TitaniumUploadEvaluatedPriceRequest;
