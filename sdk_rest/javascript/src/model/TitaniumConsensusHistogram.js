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
import TitaniumPredefinedFilter from './TitaniumPredefinedFilter';

/**
 * The TitaniumConsensusHistogram model module.
 * @module model/TitaniumConsensusHistogram
 * @version 1.0.0
 */
class TitaniumConsensusHistogram {
    /**
     * Constructs a new <code>TitaniumConsensusHistogram</code>.
     * @alias module:model/TitaniumConsensusHistogram
     */
    constructor() { 
        
        TitaniumConsensusHistogram.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumConsensusHistogram</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumConsensusHistogram} obj Optional instance to populate.
     * @return {module:model/TitaniumConsensusHistogram} The populated <code>TitaniumConsensusHistogram</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumConsensusHistogram();

            if (data.hasOwnProperty('highSeverity')) {
                obj['highSeverity'] = TitaniumPredefinedFilter.constructFromObject(data['highSeverity']);
            }
            if (data.hasOwnProperty('noConsensus')) {
                obj['noConsensus'] = TitaniumPredefinedFilter.constructFromObject(data['noConsensus']);
            }
            if (data.hasOwnProperty('nonOutliers')) {
                obj['nonOutliers'] = TitaniumPredefinedFilter.constructFromObject(data['nonOutliers']);
            }
            if (data.hasOwnProperty('outliers')) {
                obj['outliers'] = TitaniumPredefinedFilter.constructFromObject(data['outliers']);
            }
            if (data.hasOwnProperty('rows')) {
                obj['rows'] = ApiClient.convertToType(data['rows'], 'Number');
            }
            if (data.hasOwnProperty('totalParseErrors')) {
                obj['totalParseErrors'] = ApiClient.convertToType(data['totalParseErrors'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumPredefinedFilter} highSeverity
 */
TitaniumConsensusHistogram.prototype['highSeverity'] = undefined;

/**
 * @member {module:model/TitaniumPredefinedFilter} noConsensus
 */
TitaniumConsensusHistogram.prototype['noConsensus'] = undefined;

/**
 * @member {module:model/TitaniumPredefinedFilter} nonOutliers
 */
TitaniumConsensusHistogram.prototype['nonOutliers'] = undefined;

/**
 * @member {module:model/TitaniumPredefinedFilter} outliers
 */
TitaniumConsensusHistogram.prototype['outliers'] = undefined;

/**
 * @member {Number} rows
 */
TitaniumConsensusHistogram.prototype['rows'] = undefined;

/**
 * @member {Number} totalParseErrors
 */
TitaniumConsensusHistogram.prototype['totalParseErrors'] = undefined;






export default TitaniumConsensusHistogram;

