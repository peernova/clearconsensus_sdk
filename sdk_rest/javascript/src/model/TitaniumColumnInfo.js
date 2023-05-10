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
 * The TitaniumColumnInfo model module.
 * @module model/TitaniumColumnInfo
 * @version 1.0.0
 */
class TitaniumColumnInfo {
    /**
     * Constructs a new <code>TitaniumColumnInfo</code>.
     * @alias module:model/TitaniumColumnInfo
     */
    constructor() { 
        
        TitaniumColumnInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumColumnInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumColumnInfo} obj Optional instance to populate.
     * @return {module:model/TitaniumColumnInfo} The populated <code>TitaniumColumnInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumColumnInfo();

            if (data.hasOwnProperty('columnDbType')) {
                obj['columnDbType'] = ApiClient.convertToType(data['columnDbType'], 'String');
            }
            if (data.hasOwnProperty('columnName')) {
                obj['columnName'] = ApiClient.convertToType(data['columnName'], 'String');
            }
            if (data.hasOwnProperty('columnType')) {
                obj['columnType'] = ApiClient.convertToType(data['columnType'], 'String');
            }
            if (data.hasOwnProperty('rawColumnName')) {
                obj['rawColumnName'] = ApiClient.convertToType(data['rawColumnName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} columnDbType
 */
TitaniumColumnInfo.prototype['columnDbType'] = undefined;

/**
 * @member {String} columnName
 */
TitaniumColumnInfo.prototype['columnName'] = undefined;

/**
 * @member {String} columnType
 */
TitaniumColumnInfo.prototype['columnType'] = undefined;

/**
 * @member {String} rawColumnName
 */
TitaniumColumnInfo.prototype['rawColumnName'] = undefined;






export default TitaniumColumnInfo;

