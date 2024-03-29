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
 * The TitaniumSupportedFieldsValues model module.
 * @module model/TitaniumSupportedFieldsValues
 * @version 1.0.0
 */
class TitaniumSupportedFieldsValues {
    /**
     * Constructs a new <code>TitaniumSupportedFieldsValues</code>.
     * @alias module:model/TitaniumSupportedFieldsValues
     */
    constructor() { 
        
        TitaniumSupportedFieldsValues.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumSupportedFieldsValues</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumSupportedFieldsValues} obj Optional instance to populate.
     * @return {module:model/TitaniumSupportedFieldsValues} The populated <code>TitaniumSupportedFieldsValues</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumSupportedFieldsValues();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('field')) {
                obj['field'] = ApiClient.convertToType(data['field'], 'String');
            }
            if (data.hasOwnProperty('traceName')) {
                obj['traceName'] = ApiClient.convertToType(data['traceName'], 'String');
            }
            if (data.hasOwnProperty('values')) {
                obj['values'] = ApiClient.convertToType(data['values'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} assetId
 */
TitaniumSupportedFieldsValues.prototype['assetId'] = undefined;

/**
 * @member {String} field
 */
TitaniumSupportedFieldsValues.prototype['field'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumSupportedFieldsValues.prototype['traceName'] = undefined;

/**
 * @member {Array.<String>} values
 */
TitaniumSupportedFieldsValues.prototype['values'] = undefined;






export default TitaniumSupportedFieldsValues;

