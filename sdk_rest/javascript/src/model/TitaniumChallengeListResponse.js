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
import TitaniumChallengeListResponseData from './TitaniumChallengeListResponseData';
import TitaniumError from './TitaniumError';

/**
 * The TitaniumChallengeListResponse model module.
 * @module model/TitaniumChallengeListResponse
 * @version 1.0.0
 */
class TitaniumChallengeListResponse {
    /**
     * Constructs a new <code>TitaniumChallengeListResponse</code>.
     * @alias module:model/TitaniumChallengeListResponse
     */
    constructor() { 
        
        TitaniumChallengeListResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChallengeListResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChallengeListResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumChallengeListResponse} The populated <code>TitaniumChallengeListResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChallengeListResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumChallengeListResponseData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumChallengeListResponseData} data
 */
TitaniumChallengeListResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumChallengeListResponse.prototype['error'] = undefined;






export default TitaniumChallengeListResponse;
