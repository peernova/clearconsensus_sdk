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
import GrpcprotoError from './GrpcprotoError';
import ProtoEntityDto from './ProtoEntityDto';

/**
 * The ProtoEntityResponse model module.
 * @module model/ProtoEntityResponse
 * @version 1.0.0
 */
class ProtoEntityResponse {
    /**
     * Constructs a new <code>ProtoEntityResponse</code>.
     * @alias module:model/ProtoEntityResponse
     */
    constructor() { 
        
        ProtoEntityResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProtoEntityResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProtoEntityResponse} obj Optional instance to populate.
     * @return {module:model/ProtoEntityResponse} The populated <code>ProtoEntityResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProtoEntityResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ProtoEntityDto.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('error')) {
                obj['error'] = GrpcprotoError.constructFromObject(data['error']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ProtoEntityDto} data
 */
ProtoEntityResponse.prototype['data'] = undefined;

/**
 * @member {module:model/GrpcprotoError} error
 */
ProtoEntityResponse.prototype['error'] = undefined;






export default ProtoEntityResponse;
