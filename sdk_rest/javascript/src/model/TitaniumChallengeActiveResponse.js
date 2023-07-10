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
import TitaniumChallengeActiveResponseData from './TitaniumChallengeActiveResponseData';
import TitaniumError from './TitaniumError';

/**
 * The TitaniumChallengeActiveResponse model module.
 * @module model/TitaniumChallengeActiveResponse
 * @version 1.0.0
 */
class TitaniumChallengeActiveResponse {
    /**
     * Constructs a new <code>TitaniumChallengeActiveResponse</code>.
     * @alias module:model/TitaniumChallengeActiveResponse
     */
    constructor() { 
        
        TitaniumChallengeActiveResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChallengeActiveResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChallengeActiveResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumChallengeActiveResponse} The populated <code>TitaniumChallengeActiveResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChallengeActiveResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumChallengeActiveResponseData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumChallengeActiveResponseData} data
 */
TitaniumChallengeActiveResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumChallengeActiveResponse.prototype['error'] = undefined;






export default TitaniumChallengeActiveResponse;

