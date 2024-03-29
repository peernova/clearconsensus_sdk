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
import TitaniumHistogramData from './TitaniumHistogramData';

/**
 * The TitaniumHistogramResponse model module.
 * @module model/TitaniumHistogramResponse
 * @version 1.0.0
 */
class TitaniumHistogramResponse {
    /**
     * Constructs a new <code>TitaniumHistogramResponse</code>.
     * @alias module:model/TitaniumHistogramResponse
     */
    constructor() { 
        
        TitaniumHistogramResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumHistogramResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumHistogramResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumHistogramResponse} The populated <code>TitaniumHistogramResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumHistogramResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumHistogramData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumHistogramData} data
 */
TitaniumHistogramResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumHistogramResponse.prototype['error'] = undefined;






export default TitaniumHistogramResponse;

