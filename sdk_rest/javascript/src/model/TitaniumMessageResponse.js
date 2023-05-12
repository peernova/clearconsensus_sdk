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
import TitaniumMessageResponseData from './TitaniumMessageResponseData';

/**
 * The TitaniumMessageResponse model module.
 * @module model/TitaniumMessageResponse
 * @version 1.0.0
 */
class TitaniumMessageResponse {
    /**
     * Constructs a new <code>TitaniumMessageResponse</code>.
     * @alias module:model/TitaniumMessageResponse
     */
    constructor() { 
        
        TitaniumMessageResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumMessageResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumMessageResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumMessageResponse} The populated <code>TitaniumMessageResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumMessageResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumMessageResponseData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumMessageResponseData} data
 */
TitaniumMessageResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumMessageResponse.prototype['error'] = undefined;






export default TitaniumMessageResponse;
