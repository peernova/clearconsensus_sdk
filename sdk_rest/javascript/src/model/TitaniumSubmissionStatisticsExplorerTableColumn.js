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
 * The TitaniumSubmissionStatisticsExplorerTableColumn model module.
 * @module model/TitaniumSubmissionStatisticsExplorerTableColumn
 * @version 1.0.0
 */
class TitaniumSubmissionStatisticsExplorerTableColumn {
    /**
     * Constructs a new <code>TitaniumSubmissionStatisticsExplorerTableColumn</code>.
     * @alias module:model/TitaniumSubmissionStatisticsExplorerTableColumn
     */
    constructor() { 
        
        TitaniumSubmissionStatisticsExplorerTableColumn.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumSubmissionStatisticsExplorerTableColumn</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumSubmissionStatisticsExplorerTableColumn} obj Optional instance to populate.
     * @return {module:model/TitaniumSubmissionStatisticsExplorerTableColumn} The populated <code>TitaniumSubmissionStatisticsExplorerTableColumn</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumSubmissionStatisticsExplorerTableColumn();

            if (data.hasOwnProperty('absDiffFromStatisticalMean')) {
                obj['absDiffFromStatisticalMean'] = ApiClient.convertToType(data['absDiffFromStatisticalMean'], Object);
            }
            if (data.hasOwnProperty('lowerBoundary')) {
                obj['lowerBoundary'] = ApiClient.convertToType(data['lowerBoundary'], Object);
            }
            if (data.hasOwnProperty('max')) {
                obj['max'] = ApiClient.convertToType(data['max'], Object);
            }
            if (data.hasOwnProperty('min')) {
                obj['min'] = ApiClient.convertToType(data['min'], Object);
            }
            if (data.hasOwnProperty('statisticalMean')) {
                obj['statisticalMean'] = ApiClient.convertToType(data['statisticalMean'], Object);
            }
            if (data.hasOwnProperty('stdDev')) {
                obj['stdDev'] = ApiClient.convertToType(data['stdDev'], Object);
            }
            if (data.hasOwnProperty('subPriceDiff')) {
                obj['subPriceDiff'] = ApiClient.convertToType(data['subPriceDiff'], Object);
            }
            if (data.hasOwnProperty('subValidPointsCount')) {
                obj['subValidPointsCount'] = ApiClient.convertToType(data['subValidPointsCount'], 'String');
            }
            if (data.hasOwnProperty('upperBoundary')) {
                obj['upperBoundary'] = ApiClient.convertToType(data['upperBoundary'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object} absDiffFromStatisticalMean
 */
TitaniumSubmissionStatisticsExplorerTableColumn.prototype['absDiffFromStatisticalMean'] = undefined;

/**
 * @member {Object} lowerBoundary
 */
TitaniumSubmissionStatisticsExplorerTableColumn.prototype['lowerBoundary'] = undefined;

/**
 * @member {Object} max
 */
TitaniumSubmissionStatisticsExplorerTableColumn.prototype['max'] = undefined;

/**
 * @member {Object} min
 */
TitaniumSubmissionStatisticsExplorerTableColumn.prototype['min'] = undefined;

/**
 * @member {Object} statisticalMean
 */
TitaniumSubmissionStatisticsExplorerTableColumn.prototype['statisticalMean'] = undefined;

/**
 * @member {Object} stdDev
 */
TitaniumSubmissionStatisticsExplorerTableColumn.prototype['stdDev'] = undefined;

/**
 * @member {Object} subPriceDiff
 */
TitaniumSubmissionStatisticsExplorerTableColumn.prototype['subPriceDiff'] = undefined;

/**
 * @member {String} subValidPointsCount
 */
TitaniumSubmissionStatisticsExplorerTableColumn.prototype['subValidPointsCount'] = undefined;

/**
 * @member {Object} upperBoundary
 */
TitaniumSubmissionStatisticsExplorerTableColumn.prototype['upperBoundary'] = undefined;






export default TitaniumSubmissionStatisticsExplorerTableColumn;

