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
import TitaniumGenericChartResponseRow from './TitaniumGenericChartResponseRow';

/**
 * The TitaniumGenericChartResponse model module.
 * @module model/TitaniumGenericChartResponse
 * @version 1.0.0
 */
class TitaniumGenericChartResponse {
    /**
     * Constructs a new <code>TitaniumGenericChartResponse</code>.
     * @alias module:model/TitaniumGenericChartResponse
     */
    constructor() { 
        
        TitaniumGenericChartResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumGenericChartResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumGenericChartResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumGenericChartResponse} The populated <code>TitaniumGenericChartResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumGenericChartResponse();

            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [TitaniumColumnInfo]);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], [TitaniumGenericChartResponseRow]);
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
TitaniumGenericChartResponse.prototype['columns'] = undefined;

/**
 * @member {Array.<module:model/TitaniumGenericChartResponseRow>} rows
 */
TitaniumGenericChartResponse.prototype['rows'] = undefined;

/**
 * @member {Number} totalRows
 */
TitaniumGenericChartResponse.prototype['totalRows'] = undefined;






export default TitaniumGenericChartResponse;

