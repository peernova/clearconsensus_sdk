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
import TitaniumRecentAssetsResponseData from './TitaniumRecentAssetsResponseData';

/**
 * The TitaniumRecentAssetsResponse model module.
 * @module model/TitaniumRecentAssetsResponse
 * @version 1.0.0
 */
class TitaniumRecentAssetsResponse {
    /**
     * Constructs a new <code>TitaniumRecentAssetsResponse</code>.
     * @alias module:model/TitaniumRecentAssetsResponse
     */
    constructor() { 
        
        TitaniumRecentAssetsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumRecentAssetsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumRecentAssetsResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumRecentAssetsResponse} The populated <code>TitaniumRecentAssetsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumRecentAssetsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = TitaniumRecentAssetsResponseData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumRecentAssetsResponseData} data
 */
TitaniumRecentAssetsResponse.prototype['data'] = undefined;

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumRecentAssetsResponse.prototype['error'] = undefined;






export default TitaniumRecentAssetsResponse;
