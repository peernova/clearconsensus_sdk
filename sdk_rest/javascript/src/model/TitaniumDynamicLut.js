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
 * The TitaniumDynamicLut model module.
 * @module model/TitaniumDynamicLut
 * @version 1.0.0
 */
class TitaniumDynamicLut {
    /**
     * Constructs a new <code>TitaniumDynamicLut</code>.
     * @alias module:model/TitaniumDynamicLut
     */
    constructor() { 
        
        TitaniumDynamicLut.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumDynamicLut</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumDynamicLut} obj Optional instance to populate.
     * @return {module:model/TitaniumDynamicLut} The populated <code>TitaniumDynamicLut</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumDynamicLut();

            if (data.hasOwnProperty('filter')) {
                obj['filter'] = ApiClient.convertToType(data['filter'], 'String');
            }
            if (data.hasOwnProperty('key')) {
                obj['key'] = ApiClient.convertToType(data['key'], ['String']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {String} filter
 */
TitaniumDynamicLut.prototype['filter'] = undefined;

/**
 * @member {Array.<String>} key
 */
TitaniumDynamicLut.prototype['key'] = undefined;

/**
 * @member {String} type
 */
TitaniumDynamicLut.prototype['type'] = undefined;

/**
 * @member {Object} value
 */
TitaniumDynamicLut.prototype['value'] = undefined;






export default TitaniumDynamicLut;

