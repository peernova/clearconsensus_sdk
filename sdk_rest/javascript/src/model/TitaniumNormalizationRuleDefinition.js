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
import TitaniumTransformation from './TitaniumTransformation';

/**
 * The TitaniumNormalizationRuleDefinition model module.
 * @module model/TitaniumNormalizationRuleDefinition
 * @version 1.0.0
 */
class TitaniumNormalizationRuleDefinition {
    /**
     * Constructs a new <code>TitaniumNormalizationRuleDefinition</code>.
     * @alias module:model/TitaniumNormalizationRuleDefinition
     */
    constructor() { 
        
        TitaniumNormalizationRuleDefinition.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumNormalizationRuleDefinition</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumNormalizationRuleDefinition} obj Optional instance to populate.
     * @return {module:model/TitaniumNormalizationRuleDefinition} The populated <code>TitaniumNormalizationRuleDefinition</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumNormalizationRuleDefinition();

            if (data.hasOwnProperty('descriptorName')) {
                obj['descriptorName'] = ApiClient.convertToType(data['descriptorName'], 'String');
            }
            if (data.hasOwnProperty('scope')) {
                obj['scope'] = ApiClient.convertToType(data['scope'], 'String');
            }
            if (data.hasOwnProperty('transformations')) {
                obj['transformations'] = ApiClient.convertToType(data['transformations'], [TitaniumTransformation]);
            }
            if (data.hasOwnProperty('uid')) {
                obj['uid'] = ApiClient.convertToType(data['uid'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} descriptorName
 */
TitaniumNormalizationRuleDefinition.prototype['descriptorName'] = undefined;

/**
 * @member {String} scope
 */
TitaniumNormalizationRuleDefinition.prototype['scope'] = undefined;

/**
 * @member {Array.<module:model/TitaniumTransformation>} transformations
 */
TitaniumNormalizationRuleDefinition.prototype['transformations'] = undefined;

/**
 * @member {String} uid
 */
TitaniumNormalizationRuleDefinition.prototype['uid'] = undefined;






export default TitaniumNormalizationRuleDefinition;

