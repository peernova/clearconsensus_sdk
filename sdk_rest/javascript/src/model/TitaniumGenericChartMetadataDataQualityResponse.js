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
import TitaniumError from './TitaniumError';
import TitaniumGenericChartResponse from './TitaniumGenericChartResponse';

/**
 * The TitaniumGenericChartMetadataDataQualityResponse model module.
 * @module model/TitaniumGenericChartMetadataDataQualityResponse
 * @version 1.0.0
 */
class TitaniumGenericChartMetadataDataQualityResponse {
    /**
     * Constructs a new <code>TitaniumGenericChartMetadataDataQualityResponse</code>.
     * @alias module:model/TitaniumGenericChartMetadataDataQualityResponse
     */
    constructor() { 
        
        TitaniumGenericChartMetadataDataQualityResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumGenericChartMetadataDataQualityResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumGenericChartMetadataDataQualityResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumGenericChartMetadataDataQualityResponse} The populated <code>TitaniumGenericChartMetadataDataQualityResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumGenericChartMetadataDataQualityResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumGenericChartResponse.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumGenericChartResponse} data
 */
TitaniumGenericChartMetadataDataQualityResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumGenericChartMetadataDataQualityResponse.prototype['error'] = undefined;






export default TitaniumGenericChartMetadataDataQualityResponse;

