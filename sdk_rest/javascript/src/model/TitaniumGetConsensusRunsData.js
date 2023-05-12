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
 * The TitaniumGetConsensusRunsData model module.
 * @module model/TitaniumGetConsensusRunsData
 * @version 1.0.0
 */
class TitaniumGetConsensusRunsData {
    /**
     * Constructs a new <code>TitaniumGetConsensusRunsData</code>.
     * @alias module:model/TitaniumGetConsensusRunsData
     */
    constructor() { 
        
        TitaniumGetConsensusRunsData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumGetConsensusRunsData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumGetConsensusRunsData} obj Optional instance to populate.
     * @return {module:model/TitaniumGetConsensusRunsData} The populated <code>TitaniumGetConsensusRunsData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumGetConsensusRunsData();

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
TitaniumGetConsensusRunsData.prototype['columns'] = undefined;

/**
 * @member {module:model/TitaniumPage} page
 */
TitaniumGetConsensusRunsData.prototype['page'] = undefined;

/**
 * @member {Array.<module:model/TitaniumValuesRow>} rows
 */
TitaniumGetConsensusRunsData.prototype['rows'] = undefined;






export default TitaniumGetConsensusRunsData;
