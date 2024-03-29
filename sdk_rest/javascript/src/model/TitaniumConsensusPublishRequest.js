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
 * The TitaniumConsensusPublishRequest model module.
 * @module model/TitaniumConsensusPublishRequest
 * @version 1.0.0
 */
class TitaniumConsensusPublishRequest {
    /**
     * Constructs a new <code>TitaniumConsensusPublishRequest</code>.
     * @alias module:model/TitaniumConsensusPublishRequest
     */
    constructor() { 
        
        TitaniumConsensusPublishRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusPublishRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusPublishRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusPublishRequest} The populated <code>TitaniumConsensusPublishRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusPublishRequest();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('consensusTrackingId')) {
                obj['consensusTrackingId'] = ApiClient.convertToType(data['consensusTrackingId'], 'String');
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
TitaniumConsensusPublishRequest.prototype['assetId'] = undefined;

/**
 * @member {String} consensusTrackingId
 */
TitaniumConsensusPublishRequest.prototype['consensusTrackingId'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumConsensusPublishRequest.prototype['traceName'] = undefined;






export default TitaniumConsensusPublishRequest;

