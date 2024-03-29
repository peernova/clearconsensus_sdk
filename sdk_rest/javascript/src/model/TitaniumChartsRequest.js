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
 * The TitaniumChartsRequest model module.
 * @module model/TitaniumChartsRequest
 * @version 1.0.0
 */
class TitaniumChartsRequest {
    /**
     * Constructs a new <code>TitaniumChartsRequest</code>.
     * @alias module:model/TitaniumChartsRequest
     */
    constructor() { 
        
        TitaniumChartsRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChartsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChartsRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumChartsRequest} The populated <code>TitaniumChartsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChartsRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('client')) {
                obj['client'] = ApiClient.convertToType(data['client'], 'String');
            }
            if (data.hasOwnProperty('submittedDate')) {
                obj['submittedDate'] = ApiClient.convertToType(data['submittedDate'], 'String');
            }
            if (data.hasOwnProperty('traceName')) {
                obj['traceName'] = ApiClient.convertToType(data['traceName'], 'String');
            }
            if (data.hasOwnProperty('underlying')) {
                obj['underlying'] = ApiClient.convertToType(data['underlying'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} assetId
 */
TitaniumChartsRequest.prototype['assetId'] = undefined;

/**
 * @member {String} client
 */
TitaniumChartsRequest.prototype['client'] = undefined;

/**
 * @member {String} submittedDate
 */
TitaniumChartsRequest.prototype['submittedDate'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumChartsRequest.prototype['traceName'] = undefined;

/**
 * @member {String} underlying
 */
TitaniumChartsRequest.prototype['underlying'] = undefined;






export default TitaniumChartsRequest;

