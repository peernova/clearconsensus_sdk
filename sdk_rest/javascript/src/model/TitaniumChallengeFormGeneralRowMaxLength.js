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
 * The TitaniumChallengeFormGeneralRowMaxLength model module.
 * @module model/TitaniumChallengeFormGeneralRowMaxLength
 * @version 1.0.0
 */
class TitaniumChallengeFormGeneralRowMaxLength {
    /**
     * Constructs a new <code>TitaniumChallengeFormGeneralRowMaxLength</code>.
     * @alias module:model/TitaniumChallengeFormGeneralRowMaxLength
     */
    constructor() { 
        
        TitaniumChallengeFormGeneralRowMaxLength.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChallengeFormGeneralRowMaxLength</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChallengeFormGeneralRowMaxLength} obj Optional instance to populate.
     * @return {module:model/TitaniumChallengeFormGeneralRowMaxLength} The populated <code>TitaniumChallengeFormGeneralRowMaxLength</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChallengeFormGeneralRowMaxLength();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} value
 */
TitaniumChallengeFormGeneralRowMaxLength.prototype['value'] = undefined;






export default TitaniumChallengeFormGeneralRowMaxLength;

