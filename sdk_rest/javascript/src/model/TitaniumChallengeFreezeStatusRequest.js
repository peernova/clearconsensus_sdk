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
 * The TitaniumChallengeFreezeStatusRequest model module.
 * @module model/TitaniumChallengeFreezeStatusRequest
 * @version 1.0.0
 */
class TitaniumChallengeFreezeStatusRequest {
    /**
     * Constructs a new <code>TitaniumChallengeFreezeStatusRequest</code>.
     * @alias module:model/TitaniumChallengeFreezeStatusRequest
     */
    constructor() { 
        
        TitaniumChallengeFreezeStatusRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChallengeFreezeStatusRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChallengeFreezeStatusRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumChallengeFreezeStatusRequest} The populated <code>TitaniumChallengeFreezeStatusRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChallengeFreezeStatusRequest();

            if (data.hasOwnProperty('consensusRunId')) {
                obj['consensusRunId'] = ApiClient.convertToType(data['consensusRunId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} consensusRunId
 */
TitaniumChallengeFreezeStatusRequest.prototype['consensusRunId'] = undefined;






export default TitaniumChallengeFreezeStatusRequest;

