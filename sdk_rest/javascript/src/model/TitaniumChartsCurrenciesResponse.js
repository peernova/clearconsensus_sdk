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
import TitaniumChartsCurrenciesResponseData from './TitaniumChartsCurrenciesResponseData';
import TitaniumError from './TitaniumError';

/**
 * The TitaniumChartsCurrenciesResponse model module.
 * @module model/TitaniumChartsCurrenciesResponse
 * @version 1.0.0
 */
class TitaniumChartsCurrenciesResponse {
    /**
     * Constructs a new <code>TitaniumChartsCurrenciesResponse</code>.
     * @alias module:model/TitaniumChartsCurrenciesResponse
     */
    constructor() { 
        
        TitaniumChartsCurrenciesResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChartsCurrenciesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChartsCurrenciesResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumChartsCurrenciesResponse} The populated <code>TitaniumChartsCurrenciesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChartsCurrenciesResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumChartsCurrenciesResponseData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumChartsCurrenciesResponseData} data
 */
TitaniumChartsCurrenciesResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumChartsCurrenciesResponse.prototype['error'] = undefined;






export default TitaniumChartsCurrenciesResponse;

