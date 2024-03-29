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
import GetChallengeDetailsResponseCommonChallengeData from './GetChallengeDetailsResponseCommonChallengeData';
import TitaniumAttachment from './TitaniumAttachment';

/**
 * The GetChallengeDetailsResponseResult model module.
 * @module model/GetChallengeDetailsResponseResult
 * @version 1.0.0
 */
class GetChallengeDetailsResponseResult {
    /**
     * Constructs a new <code>GetChallengeDetailsResponseResult</code>.
     * @alias module:model/GetChallengeDetailsResponseResult
     */
    constructor() { 
        
        GetChallengeDetailsResponseResult.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GetChallengeDetailsResponseResult</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GetChallengeDetailsResponseResult} obj Optional instance to populate.
     * @return {module:model/GetChallengeDetailsResponseResult} The populated <code>GetChallengeDetailsResponseResult</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GetChallengeDetailsResponseResult();

            if (data.hasOwnProperty('attachments')) {
                obj['attachments'] = ApiClient.convertToType(data['attachments'], [TitaniumAttachment]);
            }
            if (data.hasOwnProperty('challengeData')) {
                obj['challengeData'] = ApiClient.convertToType(data['challengeData'], Object);
            }
            if (data.hasOwnProperty('commonChallengeData')) {
                obj['commonChallengeData'] = GetChallengeDetailsResponseCommonChallengeData.constructFromObject(data['commonChallengeData']);
            }
            if (data.hasOwnProperty('totalNumber')) {
                obj['totalNumber'] = ApiClient.convertToType(data['totalNumber'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/TitaniumAttachment>} attachments
 */
GetChallengeDetailsResponseResult.prototype['attachments'] = undefined;

/**
 * @member {Object} challengeData
 */
GetChallengeDetailsResponseResult.prototype['challengeData'] = undefined;

/**
 * @member {module:model/GetChallengeDetailsResponseCommonChallengeData} commonChallengeData
 */
GetChallengeDetailsResponseResult.prototype['commonChallengeData'] = undefined;

/**
 * @member {Object} totalNumber
 */
GetChallengeDetailsResponseResult.prototype['totalNumber'] = undefined;






export default GetChallengeDetailsResponseResult;

