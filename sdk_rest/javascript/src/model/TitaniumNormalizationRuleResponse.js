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
import TitaniumError from './TitaniumError';
import TitaniumNormalizationRuleDefinition from './TitaniumNormalizationRuleDefinition';

/**
 * The TitaniumNormalizationRuleResponse model module.
 * @module model/TitaniumNormalizationRuleResponse
 * @version 1.0.0
 */
class TitaniumNormalizationRuleResponse {
    /**
     * Constructs a new <code>TitaniumNormalizationRuleResponse</code>.
     * @alias module:model/TitaniumNormalizationRuleResponse
     */
    constructor() { 
        
        TitaniumNormalizationRuleResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumNormalizationRuleResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumNormalizationRuleResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumNormalizationRuleResponse} The populated <code>TitaniumNormalizationRuleResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumNormalizationRuleResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumNormalizationRuleDefinition.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumNormalizationRuleDefinition} data
 */
TitaniumNormalizationRuleResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumNormalizationRuleResponse.prototype['error'] = undefined;






export default TitaniumNormalizationRuleResponse;
