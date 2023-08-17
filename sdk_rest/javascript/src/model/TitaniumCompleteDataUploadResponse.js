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

/**
 * The TitaniumCompleteDataUploadResponse model module.
 * @module model/TitaniumCompleteDataUploadResponse
 * @version 1.0.0
 */
class TitaniumCompleteDataUploadResponse {
    /**
     * Constructs a new <code>TitaniumCompleteDataUploadResponse</code>.
     * @alias module:model/TitaniumCompleteDataUploadResponse
     */
    constructor() { 
        
        TitaniumCompleteDataUploadResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumCompleteDataUploadResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumCompleteDataUploadResponse} obj Optional instance to populate.
     * @return {module:model/TitaniumCompleteDataUploadResponse} The populated <code>TitaniumCompleteDataUploadResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumCompleteDataUploadResponse();

            if (data.hasOwnProperty('error')) {
                obj['error'] = TitaniumError.constructFromObject(data['error']);
            }
            if (data.hasOwnProperty('success')) {
                obj['success'] = ApiClient.convertToType(data['success'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumError} error
 */
TitaniumCompleteDataUploadResponse.prototype['error'] = undefined;

/**
 * @member {Boolean} success
 */
TitaniumCompleteDataUploadResponse.prototype['success'] = undefined;






export default TitaniumCompleteDataUploadResponse;

