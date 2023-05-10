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
import TitaniumColumnInfo from './TitaniumColumnInfo';

/**
 * The TitaniumViewRow model module.
 * @module model/TitaniumViewRow
 * @version 1.0.0
 */
class TitaniumViewRow {
    /**
     * Constructs a new <code>TitaniumViewRow</code>.
     * @alias module:model/TitaniumViewRow
     */
    constructor() { 
        
        TitaniumViewRow.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumViewRow</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumViewRow} obj Optional instance to populate.
     * @return {module:model/TitaniumViewRow} The populated <code>TitaniumViewRow</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumViewRow();

            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [TitaniumColumnInfo]);
            }
            if (data.hasOwnProperty('values')) {
                obj['values'] = ApiClient.convertToType(data['values'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/TitaniumColumnInfo>} columns
 */
TitaniumViewRow.prototype['columns'] = undefined;

/**
 * @member {Array.<Object>} values
 */
TitaniumViewRow.prototype['values'] = undefined;






export default TitaniumViewRow;

