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
import TitaniumChallengeFormGeneralRow from './TitaniumChallengeFormGeneralRow';
import TitaniumChallengeFormOneOfFields from './TitaniumChallengeFormOneOfFields';

/**
 * The TitaniumChallengeFormMetaResponseData model module.
 * @module model/TitaniumChallengeFormMetaResponseData
 * @version 1.0.0
 */
class TitaniumChallengeFormMetaResponseData {
    /**
     * Constructs a new <code>TitaniumChallengeFormMetaResponseData</code>.
     * @alias module:model/TitaniumChallengeFormMetaResponseData
     */
    constructor() { 
        
        TitaniumChallengeFormMetaResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChallengeFormMetaResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChallengeFormMetaResponseData} obj Optional instance to populate.
     * @return {module:model/TitaniumChallengeFormMetaResponseData} The populated <code>TitaniumChallengeFormMetaResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChallengeFormMetaResponseData();

            if (data.hasOwnProperty('oneOfFields')) {
                obj['oneOfFields'] = ApiClient.convertToType(data['oneOfFields'], [TitaniumChallengeFormOneOfFields]);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], [TitaniumChallengeFormGeneralRow]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/TitaniumChallengeFormOneOfFields>} oneOfFields
 */
TitaniumChallengeFormMetaResponseData.prototype['oneOfFields'] = undefined;

/**
 * @member {Array.<module:model/TitaniumChallengeFormGeneralRow>} rows
 */
TitaniumChallengeFormMetaResponseData.prototype['rows'] = undefined;






export default TitaniumChallengeFormMetaResponseData;
