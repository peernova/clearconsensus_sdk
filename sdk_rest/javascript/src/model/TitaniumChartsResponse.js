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
import TitaniumChartsResponseData from './TitaniumChartsResponseData';
import TitaniumError from './TitaniumError';

/**
 * The TitaniumChartsResponse model module.
 * @module model/TitaniumChartsResponse
 * @version 1.0.0
 */
class TitaniumChartsResponse {
    /**
     * Constructs a new <code>TitaniumChartsResponse</code>.
     * @alias module:model/TitaniumChartsResponse
     */
    constructor() { 
        
        TitaniumChartsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumChartsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumChartsResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumChartsResponse} The populated <code>TitaniumChartsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumChartsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumChartsResponseData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumChartsResponseData} data
 */
TitaniumChartsResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumChartsResponse.prototype['error'] = undefined;






export default TitaniumChartsResponse;
