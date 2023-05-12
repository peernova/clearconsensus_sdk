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
import TitaniumNameAliasPair from './TitaniumNameAliasPair';

/**
 * The TitaniumGenericChartMetadata model module.
 * @module model/TitaniumGenericChartMetadata
 * @version 1.0.0
 */
class TitaniumGenericChartMetadata {
    /**
     * Constructs a new <code>TitaniumGenericChartMetadata</code>.
     * @alias module:model/TitaniumGenericChartMetadata
     */
    constructor() { 
        
        TitaniumGenericChartMetadata.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumGenericChartMetadata</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumGenericChartMetadata} obj Optional instance to populate.
     * @return {module:model/TitaniumGenericChartMetadata} The populated <code>TitaniumGenericChartMetadata</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumGenericChartMetadata();

            if (data.hasOwnProperty('filter')) {
                obj['filter'] = ApiClient.convertToType(data['filter'], 'String');
            }
            if (data.hasOwnProperty('groupBy')) {
                obj['groupBy'] = ApiClient.convertToType(data['groupBy'], [TitaniumNameAliasPair]);
            }
            if (data.hasOwnProperty('metrics')) {
                obj['metrics'] = ApiClient.convertToType(data['metrics'], [TitaniumNameAliasPair]);
            }
            if (data.hasOwnProperty('rowLimit')) {
                obj['rowLimit'] = ApiClient.convertToType(data['rowLimit'], 'Number');
            }
            if (data.hasOwnProperty('selectFields')) {
                obj['selectFields'] = ApiClient.convertToType(data['selectFields'], [TitaniumNameAliasPair]);
            }
            if (data.hasOwnProperty('seriesLimit')) {
                obj['seriesLimit'] = ApiClient.convertToType(data['seriesLimit'], 'Number');
            }
            if (data.hasOwnProperty('sortBy')) {
                obj['sortBy'] = ApiClient.convertToType(data['sortBy'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} filter
 */
TitaniumGenericChartMetadata.prototype['filter'] = undefined;

/**
 * @member {Array.<module:model/TitaniumNameAliasPair>} groupBy
 */
TitaniumGenericChartMetadata.prototype['groupBy'] = undefined;

/**
 * @member {Array.<module:model/TitaniumNameAliasPair>} metrics
 */
TitaniumGenericChartMetadata.prototype['metrics'] = undefined;

/**
 * @member {Number} rowLimit
 */
TitaniumGenericChartMetadata.prototype['rowLimit'] = undefined;

/**
 * @member {Array.<module:model/TitaniumNameAliasPair>} selectFields
 */
TitaniumGenericChartMetadata.prototype['selectFields'] = undefined;

/**
 * @member {Number} seriesLimit
 */
TitaniumGenericChartMetadata.prototype['seriesLimit'] = undefined;

/**
 * @member {String} sortBy
 */
TitaniumGenericChartMetadata.prototype['sortBy'] = undefined;






export default TitaniumGenericChartMetadata;
