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
 * The TitaniumAddAssetRequest model module.
 * @module model/TitaniumAddAssetRequest
 * @version 1.0.0
 */
class TitaniumAddAssetRequest {
    /**
     * Constructs a new <code>TitaniumAddAssetRequest</code>.
     * @alias module:model/TitaniumAddAssetRequest
     */
    constructor() { 
        
        TitaniumAddAssetRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumAddAssetRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumAddAssetRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumAddAssetRequest} The populated <code>TitaniumAddAssetRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumAddAssetRequest();

            if (data.hasOwnProperty('asset')) {
                obj['asset'] = ApiClient.convertToType(data['asset'], 'String');
            }
            if (data.hasOwnProperty('instrumentType')) {
                obj['instrumentType'] = ApiClient.convertToType(data['instrumentType'], 'String');
            }
            if (data.hasOwnProperty('service')) {
                obj['service'] = ApiClient.convertToType(data['service'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} asset
 */
TitaniumAddAssetRequest.prototype['asset'] = undefined;

/**
 * @member {String} instrumentType
 */
TitaniumAddAssetRequest.prototype['instrumentType'] = undefined;

/**
 * @member {String} service
 */
TitaniumAddAssetRequest.prototype['service'] = undefined;






export default TitaniumAddAssetRequest;
