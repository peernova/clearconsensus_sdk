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
 * The TitaniumEntityDefinition model module.
 * @module model/TitaniumEntityDefinition
 * @version 1.0.0
 */
class TitaniumEntityDefinition {
    /**
     * Constructs a new <code>TitaniumEntityDefinition</code>.
     * @alias module:model/TitaniumEntityDefinition
     */
    constructor() { 
        
        TitaniumEntityDefinition.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumEntityDefinition</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumEntityDefinition} obj Optional instance to populate.
     * @return {module:model/TitaniumEntityDefinition} The populated <code>TitaniumEntityDefinition</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumEntityDefinition();

            if (data.hasOwnProperty('definition')) {
                obj['definition'] = ApiClient.convertToType(data['definition'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('scope')) {
                obj['scope'] = ApiClient.convertToType(data['scope'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} definition
 */
TitaniumEntityDefinition.prototype['definition'] = undefined;

/**
 * @member {String} name
 */
TitaniumEntityDefinition.prototype['name'] = undefined;

/**
 * @member {String} scope
 */
TitaniumEntityDefinition.prototype['scope'] = undefined;

/**
 * @member {String} type
 */
TitaniumEntityDefinition.prototype['type'] = undefined;






export default TitaniumEntityDefinition;

