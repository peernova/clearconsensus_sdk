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
import TitaniumPage from './TitaniumPage';
import TitaniumValuesRow from './TitaniumValuesRow';

/**
 * The TitaniumConsensusResultSetValues model module.
 * @module model/TitaniumConsensusResultSetValues
 * @version 1.0.0
 */
class TitaniumConsensusResultSetValues {
    /**
     * Constructs a new <code>TitaniumConsensusResultSetValues</code>.
     * @alias module:model/TitaniumConsensusResultSetValues
     */
    constructor() { 
        
        TitaniumConsensusResultSetValues.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusResultSetValues</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusResultSetValues} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusResultSetValues} The populated <code>TitaniumConsensusResultSetValues</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusResultSetValues();

            if (data.hasOwnProperty('columns')) {
                obj['columns'] = ApiClient.convertToType(data['columns'], [TitaniumColumnInfo]);
            }
            if (data.hasOwnProperty('page')) {
                obj['page'] = TitaniumPage.constructFromObject(data['page']);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], [TitaniumValuesRow]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/TitaniumColumnInfo>} columns
 */
TitaniumConsensusResultSetValues.prototype['columns'] = undefined;

/**
 * @member {module:model/TitaniumPage} page
 */
TitaniumConsensusResultSetValues.prototype['page'] = undefined;

/**
 * @member {Array.<module:model/TitaniumValuesRow>} rows
 */
TitaniumConsensusResultSetValues.prototype['rows'] = undefined;






export default TitaniumConsensusResultSetValues;
