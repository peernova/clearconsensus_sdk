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
import TitaniumValidationRuleDefinition from './TitaniumValidationRuleDefinition';

/**
 * The TitaniumGetValidationRuleResponse model module.
 * @module model/TitaniumGetValidationRuleResponse
 * @version 1.0.0
 */
class TitaniumGetValidationRuleResponse {
    /**
     * Constructs a new <code>TitaniumGetValidationRuleResponse</code>.
     * @alias module:model/TitaniumGetValidationRuleResponse
     */
    constructor() { 
        
        TitaniumGetValidationRuleResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumGetValidationRuleResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumGetValidationRuleResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumGetValidationRuleResponse} The populated <code>TitaniumGetValidationRuleResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumGetValidationRuleResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumValidationRuleDefinition.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumValidationRuleDefinition} data
 */
TitaniumGetValidationRuleResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumGetValidationRuleResponse.prototype['error'] = undefined;






export default TitaniumGetValidationRuleResponse;

