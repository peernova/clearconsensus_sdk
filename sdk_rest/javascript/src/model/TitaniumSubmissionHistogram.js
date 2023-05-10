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
 * The TitaniumSubmissionHistogram model module.
 * @module model/TitaniumSubmissionHistogram
 * @version 1.0.0
 */
class TitaniumSubmissionHistogram {
    /**
     * Constructs a new <code>TitaniumSubmissionHistogram</code>.
     * @alias module:model/TitaniumSubmissionHistogram
     */
    constructor() { 
        
        TitaniumSubmissionHistogram.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumSubmissionHistogram</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumSubmissionHistogram} obj Optional instance to populate.
     * @return {module:model/TitaniumSubmissionHistogram} The populated <code>TitaniumSubmissionHistogram</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumSubmissionHistogram();

            if (data.hasOwnProperty('highSeverity')) {
                obj['highSeverity'] = TitaniumPredefinedFilter.constructFromObject(data['highSeverity']);
            }
            if (data.hasOwnProperty('lowSeverity')) {
                obj['lowSeverity'] = TitaniumPredefinedFilter.constructFromObject(data['lowSeverity']);
            }
            if (data.hasOwnProperty('mediumSeverity')) {
                obj['mediumSeverity'] = TitaniumPredefinedFilter.constructFromObject(data['mediumSeverity']);
            }
            if (data.hasOwnProperty('totalInvalidRows')) {
                obj['totalInvalidRows'] = ApiClient.convertToType(data['totalInvalidRows'], 'Number');
            }
            if (data.hasOwnProperty('totalParseErrors')) {
                obj['totalParseErrors'] = ApiClient.convertToType(data['totalParseErrors'], 'Number');
            }
            if (data.hasOwnProperty('totalRows')) {
                obj['totalRows'] = ApiClient.convertToType(data['totalRows'], 'Number');
            }
            if (data.hasOwnProperty('valid')) {
                obj['valid'] = TitaniumPredefinedFilter.constructFromObject(data['valid']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumPredefinedFilter} highSeverity
 */
TitaniumSubmissionHistogram.prototype['highSeverity'] = undefined;

/**
 * @member {module:model/TitaniumPredefinedFilter} lowSeverity
 */
TitaniumSubmissionHistogram.prototype['lowSeverity'] = undefined;

/**
 * @member {module:model/TitaniumPredefinedFilter} mediumSeverity
 */
TitaniumSubmissionHistogram.prototype['mediumSeverity'] = undefined;

/**
 * @member {Number} totalInvalidRows
 */
TitaniumSubmissionHistogram.prototype['totalInvalidRows'] = undefined;

/**
 * @member {Number} totalParseErrors
 */
TitaniumSubmissionHistogram.prototype['totalParseErrors'] = undefined;

/**
 * @member {Number} totalRows
 */
TitaniumSubmissionHistogram.prototype['totalRows'] = undefined;

/**
 * @member {module:model/TitaniumPredefinedFilter} valid
 */
TitaniumSubmissionHistogram.prototype['valid'] = undefined;






export default TitaniumSubmissionHistogram;

