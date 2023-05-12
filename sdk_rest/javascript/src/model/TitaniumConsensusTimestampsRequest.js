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
 * The TitaniumConsensusTimestampsRequest model module.
 * @module model/TitaniumConsensusTimestampsRequest
 * @version 1.0.0
 */
class TitaniumConsensusTimestampsRequest {
    /**
     * Constructs a new <code>TitaniumConsensusTimestampsRequest</code>.
     * @alias module:model/TitaniumConsensusTimestampsRequest
     */
    constructor() { 
        
        TitaniumConsensusTimestampsRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusTimestampsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusTimestampsRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusTimestampsRequest} The populated <code>TitaniumConsensusTimestampsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusTimestampsRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
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
TitaniumConsensusTimestampsRequest.prototype['assetId'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumConsensusTimestampsRequest.prototype['traceName'] = undefined;






export default TitaniumConsensusTimestampsRequest;
