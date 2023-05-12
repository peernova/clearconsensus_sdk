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
 * The TitaniumChallengeFormGeneralRowPrecision model module.
 * @module model/TitaniumChallengeFormGeneralRowPrecision
 * @version 1.0.0
 */
class TitaniumChallengeFormGeneralRowPrecision {
    /**
     * Constructs a new <code>TitaniumChallengeFormGeneralRowPrecision</code>.
     * @alias module:model/TitaniumChallengeFormGeneralRowPrecision
     */
    constructor() { 
        
        TitaniumChallengeFormGeneralRowPrecision.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChallengeFormGeneralRowPrecision</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChallengeFormGeneralRowPrecision} obj Optional instance to populate.
     * @return {module:model/TitaniumChallengeFormGeneralRowPrecision} The populated <code>TitaniumChallengeFormGeneralRowPrecision</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChallengeFormGeneralRowPrecision();

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
TitaniumChallengeFormGeneralRowPrecision.prototype['value'] = undefined;






export default TitaniumChallengeFormGeneralRowPrecision;
