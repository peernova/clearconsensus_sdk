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
 * The ProtoUsernamePermissionRequest model module.
 * @module model/ProtoUsernamePermissionRequest
 * @version 1.0.0
 */
class ProtoUsernamePermissionRequest {
    /**
     * Constructs a new <code>ProtoUsernamePermissionRequest</code>.
     * @alias module:model/ProtoUsernamePermissionRequest
     */
    constructor() { 
        
        ProtoUsernamePermissionRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProtoUsernamePermissionRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ProtoUsernamePermissionRequest} obj Optional instance to populate.
     * @return {module:model/ProtoUsernamePermissionRequest} The populated <code>ProtoUsernamePermissionRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProtoUsernamePermissionRequest();

            if (data.hasOwnProperty('permission')) {
                obj['permission'] = ApiClient.convertToType(data['permission'], 'String');
            }
            if (data.hasOwnProperty('username')) {
                obj['username'] = ApiClient.convertToType(data['username'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} permission
 */
ProtoUsernamePermissionRequest.prototype['permission'] = undefined;

/**
 * @member {String} username
 */
ProtoUsernamePermissionRequest.prototype['username'] = undefined;






export default ProtoUsernamePermissionRequest;

