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
import TitaniumOutliersRow from './TitaniumOutliersRow';

/**
 * The TitaniumOutliersResponseData model module.
 * @module model/TitaniumOutliersResponseData
 * @version 1.0.0
 */
class TitaniumOutliersResponseData {
    /**
     * Constructs a new <code>TitaniumOutliersResponseData</code>.
     * @alias module:model/TitaniumOutliersResponseData
     */
    constructor() { 
        
        TitaniumOutliersResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumOutliersResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumOutliersResponseData} obj Optional instance to populate.
     * @return {module:model/TitaniumOutliersResponseData} The populated <code>TitaniumOutliersResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumOutliersResponseData();

            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [TitaniumColumnInfo]);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], [TitaniumOutliersRow]);
            }
            if (data.hasOwnProperty('totalRows')) {
                obj['totalRows'] = ApiClient.convertToType(data['totalRows'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/TitaniumColumnInfo>} columns
 */
TitaniumOutliersResponseData.prototype['columns'] = undefined;

/**
 * @member {Array.<module:model/TitaniumOutliersRow>} rows
 */
TitaniumOutliersResponseData.prototype['rows'] = undefined;

/**
 * @member {Number} totalRows
 */
TitaniumOutliersResponseData.prototype['totalRows'] = undefined;






export default TitaniumOutliersResponseData;

