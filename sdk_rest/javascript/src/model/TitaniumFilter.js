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
 * The TitaniumFilter model module.
 * @module model/TitaniumFilter
 * @version 1.0.0
 */
class TitaniumFilter {
    /**
     * Constructs a new <code>TitaniumFilter</code>.
     * @alias module:model/TitaniumFilter
     */
    constructor() { 
        
        TitaniumFilter.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumFilter} obj Optional instance to populate.
     * @return {module:model/TitaniumFilter} The populated <code>TitaniumFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumFilter();

            if (data.hasOwnProperty('key')) {
                obj['key'] = ApiClient.convertToType(data['key'], 'String');
            }
            if (data.hasOwnProperty('operator')) {
                obj['operator'] = ApiClient.convertToType(data['operator'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {String} key
 */
TitaniumFilter.prototype['key'] = undefined;

/**
 * @member {String} operator
 */
TitaniumFilter.prototype['operator'] = undefined;

/**
 * @member {Object} value
 */
TitaniumFilter.prototype['value'] = undefined;






export default TitaniumFilter;

