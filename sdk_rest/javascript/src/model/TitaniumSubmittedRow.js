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
 * The TitaniumSubmittedRow model module.
 * @module model/TitaniumSubmittedRow
 * @version 1.0.0
 */
class TitaniumSubmittedRow {
    /**
     * Constructs a new <code>TitaniumSubmittedRow</code>.
     * @alias module:model/TitaniumSubmittedRow
     */
    constructor() { 
        
        TitaniumSubmittedRow.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumSubmittedRow</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumSubmittedRow} obj Optional instance to populate.
     * @return {module:model/TitaniumSubmittedRow} The populated <code>TitaniumSubmittedRow</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumSubmittedRow();

            if (data.hasOwnProperty('benchmark')) {
                obj['benchmark'] = ApiClient.convertToType(data['benchmark'], 'String');
            }
            if (data.hasOwnProperty('outlier')) {
                obj['outlier'] = ApiClient.convertToType(data['outlier'], 'String');
            }
            if (data.hasOwnProperty('validationErrorCount')) {
                obj['validationErrorCount'] = ApiClient.convertToType(data['validationErrorCount'], 'Number');
            }
            if (data.hasOwnProperty('values')) {
                obj['values'] = ApiClient.convertToType(data['values'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} benchmark
 */
TitaniumSubmittedRow.prototype['benchmark'] = undefined;

/**
 * @member {String} outlier
 */
TitaniumSubmittedRow.prototype['outlier'] = undefined;

/**
 * @member {Number} validationErrorCount
 */
TitaniumSubmittedRow.prototype['validationErrorCount'] = undefined;

/**
 * @member {Array.<Object>} values
 */
TitaniumSubmittedRow.prototype['values'] = undefined;






export default TitaniumSubmittedRow;

