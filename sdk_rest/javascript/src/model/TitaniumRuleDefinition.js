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
import TitaniumDynamicLut from './TitaniumDynamicLut';
import TitaniumErrorDefinition from './TitaniumErrorDefinition';

/**
 * The TitaniumRuleDefinition model module.
 * @module model/TitaniumRuleDefinition
 * @version 1.0.0
 */
class TitaniumRuleDefinition {
    /**
     * Constructs a new <code>TitaniumRuleDefinition</code>.
     * @alias module:model/TitaniumRuleDefinition
     */
    constructor() { 
        
        TitaniumRuleDefinition.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumRuleDefinition</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumRuleDefinition} obj Optional instance to populate.
     * @return {module:model/TitaniumRuleDefinition} The populated <code>TitaniumRuleDefinition</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumRuleDefinition();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumErrorDefinition.constructFromObject(data['error']);
            }
            if (data.hasOwnProperty('filter')) {
                obj['filter'] = ApiClient.convertToType(data['filter'], 'String');
            }
            if (data.hasOwnProperty('lookuptable')) {
                obj['lookuptable'] = TitaniumDynamicLut.constructFromObject(data['lookuptable']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('rule')) {
                obj['rule'] = ApiClient.convertToType(data['rule'], 'String');
            }
            if (data.hasOwnProperty('ruleType')) {
                obj['ruleType'] = ApiClient.convertToType(data['ruleType'], 'String');
            }
            if (data.hasOwnProperty('severity')) {
                obj['severity'] = ApiClient.convertToType(data['severity'], 'Number');
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} description
 */
TitaniumRuleDefinition.prototype['description'] = undefined;

/**
 * @member {module:model/TitaniumErrorDefinition} error
 */
TitaniumRuleDefinition.prototype['error'] = undefined;

/**
 * @member {String} filter
 */
TitaniumRuleDefinition.prototype['filter'] = undefined;

/**
 * @member {module:model/TitaniumDynamicLut} lookuptable
 */
TitaniumRuleDefinition.prototype['lookuptable'] = undefined;

/**
 * @member {String} name
 */
TitaniumRuleDefinition.prototype['name'] = undefined;

/**
 * @member {String} rule
 */
TitaniumRuleDefinition.prototype['rule'] = undefined;

/**
 * @member {String} ruleType
 */
TitaniumRuleDefinition.prototype['ruleType'] = undefined;

/**
 * @member {Number} severity
 */
TitaniumRuleDefinition.prototype['severity'] = undefined;

/**
 * @member {Array.<String>} tags
 */
TitaniumRuleDefinition.prototype['tags'] = undefined;






export default TitaniumRuleDefinition;
