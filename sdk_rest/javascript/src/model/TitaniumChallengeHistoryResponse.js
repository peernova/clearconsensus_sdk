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
import TitaniumChallengeHistoryResponseData from './TitaniumChallengeHistoryResponseData';
import TitaniumError from './TitaniumError';

/**
 * The TitaniumChallengeHistoryResponse model module.
 * @module model/TitaniumChallengeHistoryResponse
 * @version 1.0.0
 */
class TitaniumChallengeHistoryResponse {
    /**
     * Constructs a new <code>TitaniumChallengeHistoryResponse</code>.
     * @alias module:model/TitaniumChallengeHistoryResponse
     */
    constructor() { 
        
        TitaniumChallengeHistoryResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChallengeHistoryResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChallengeHistoryResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumChallengeHistoryResponse} The populated <code>TitaniumChallengeHistoryResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChallengeHistoryResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumChallengeHistoryResponseData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumChallengeHistoryResponseData} data
 */
TitaniumChallengeHistoryResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumChallengeHistoryResponse.prototype['error'] = undefined;






export default TitaniumChallengeHistoryResponse;

