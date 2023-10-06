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
 * The TitaniumSubmissionRangeColumn model module.
 * @module model/TitaniumSubmissionRangeColumn
 * @version 1.0.0
 */
class TitaniumSubmissionRangeColumn {
    /**
     * Constructs a new <code>TitaniumSubmissionRangeColumn</code>.
     * @alias module:model/TitaniumSubmissionRangeColumn
     */
    constructor() { 
        
        TitaniumSubmissionRangeColumn.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumSubmissionRangeColumn</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumSubmissionRangeColumn} obj Optional instance to populate.
     * @return {module:model/TitaniumSubmissionRangeColumn} The populated <code>TitaniumSubmissionRangeColumn</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumSubmissionRangeColumn();

            if (data.hasOwnProperty('absDiffFromMean')) {
                obj['absDiffFromMean'] = ApiClient.convertToType(data['absDiffFromMean'], Object);
            }
            if (data.hasOwnProperty('mean')) {
                obj['mean'] = ApiClient.convertToType(data['mean'], Object);
            }
            if (data.hasOwnProperty('meanAbsDiffFromLatestTrade')) {
                obj['meanAbsDiffFromLatestTrade'] = ApiClient.convertToType(data['meanAbsDiffFromLatestTrade'], Object);
            }
            if (data.hasOwnProperty('stdDev')) {
                obj['stdDev'] = ApiClient.convertToType(data['stdDev'], Object);
            }
            if (data.hasOwnProperty('subPriceDiff')) {
                obj['subPriceDiff'] = ApiClient.convertToType(data['subPriceDiff'], Object);
            }
            if (data.hasOwnProperty('submissionMax')) {
                obj['submissionMax'] = ApiClient.convertToType(data['submissionMax'], Object);
            }
            if (data.hasOwnProperty('submissionMin')) {
                obj['submissionMin'] = ApiClient.convertToType(data['submissionMin'], Object);
            }
            if (data.hasOwnProperty('validCount')) {
                obj['validCount'] = ApiClient.convertToType(data['validCount'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object} absDiffFromMean
 */
TitaniumSubmissionRangeColumn.prototype['absDiffFromMean'] = undefined;

/**
 * @member {Object} mean
 */
TitaniumSubmissionRangeColumn.prototype['mean'] = undefined;

/**
 * @member {Object} meanAbsDiffFromLatestTrade
 */
TitaniumSubmissionRangeColumn.prototype['meanAbsDiffFromLatestTrade'] = undefined;

/**
 * @member {Object} stdDev
 */
TitaniumSubmissionRangeColumn.prototype['stdDev'] = undefined;

/**
 * @member {Object} subPriceDiff
 */
TitaniumSubmissionRangeColumn.prototype['subPriceDiff'] = undefined;

/**
 * @member {Object} submissionMax
 */
TitaniumSubmissionRangeColumn.prototype['submissionMax'] = undefined;

/**
 * @member {Object} submissionMin
 */
TitaniumSubmissionRangeColumn.prototype['submissionMin'] = undefined;

/**
 * @member {Object} validCount
 */
TitaniumSubmissionRangeColumn.prototype['validCount'] = undefined;






export default TitaniumSubmissionRangeColumn;
