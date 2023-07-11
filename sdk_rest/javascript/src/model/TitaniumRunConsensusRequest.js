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
 * The TitaniumRunConsensusRequest model module.
 * @module model/TitaniumRunConsensusRequest
 * @version 1.0.0
 */
class TitaniumRunConsensusRequest {
    /**
     * Constructs a new <code>TitaniumRunConsensusRequest</code>.
     * @alias module:model/TitaniumRunConsensusRequest
     */
    constructor() { 
        
        TitaniumRunConsensusRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumRunConsensusRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumRunConsensusRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumRunConsensusRequest} The populated <code>TitaniumRunConsensusRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumRunConsensusRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('clients')) {
                obj['clients'] = ApiClient.convertToType(data['clients'], ['String']);
            }
            if (data.hasOwnProperty('dates')) {
                obj['dates'] = ApiClient.convertToType(data['dates'], ['String']);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
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
TitaniumRunConsensusRequest.prototype['assetId'] = undefined;

/**
 * @member {Array.<String>} clients
 */
TitaniumRunConsensusRequest.prototype['clients'] = undefined;

/**
 * @member {Array.<String>} dates
 */
TitaniumRunConsensusRequest.prototype['dates'] = undefined;

/**
 * @member {String} description
 */
TitaniumRunConsensusRequest.prototype['description'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumRunConsensusRequest.prototype['traceName'] = undefined;






export default TitaniumRunConsensusRequest;
