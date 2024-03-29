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
import TitaniumLoginResponseData from './TitaniumLoginResponseData';

/**
 * The TitaniumLoginResponse model module.
 * @module model/TitaniumLoginResponse
 * @version 1.0.0
 */
class TitaniumLoginResponse {
    /**
     * Constructs a new <code>TitaniumLoginResponse</code>.
     * @alias module:model/TitaniumLoginResponse
     */
    constructor() { 
        
        TitaniumLoginResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumLoginResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumLoginResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumLoginResponse} The populated <code>TitaniumLoginResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumLoginResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumLoginResponseData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumLoginResponseData} data
 */
TitaniumLoginResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumLoginResponse.prototype['error'] = undefined;






export default TitaniumLoginResponse;

