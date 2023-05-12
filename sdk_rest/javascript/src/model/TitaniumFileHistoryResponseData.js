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
import TitaniumFileHistoryRow from './TitaniumFileHistoryRow';

/**
 * The TitaniumFileHistoryResponseData model module.
 * @module model/TitaniumFileHistoryResponseData
 * @version 1.0.0
 */
class TitaniumFileHistoryResponseData {
    /**
     * Constructs a new <code>TitaniumFileHistoryResponseData</code>.
     * @alias module:model/TitaniumFileHistoryResponseData
     */
    constructor() { 
        
        TitaniumFileHistoryResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumFileHistoryResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumFileHistoryResponseData} obj Optional instance to populate.
     * @return {module:model/TitaniumFileHistoryResponseData} The populated <code>TitaniumFileHistoryResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumFileHistoryResponseData();

            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [TitaniumColumnInfo]);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], [TitaniumFileHistoryRow]);
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
TitaniumFileHistoryResponseData.prototype['columns'] = undefined;

/**
 * @member {Array.<module:model/TitaniumFileHistoryRow>} rows
 */
TitaniumFileHistoryResponseData.prototype['rows'] = undefined;

/**
 * @member {Number} totalRows
 */
TitaniumFileHistoryResponseData.prototype['totalRows'] = undefined;






export default TitaniumFileHistoryResponseData;
