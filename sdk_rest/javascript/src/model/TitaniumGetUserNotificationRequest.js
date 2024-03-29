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
 * The TitaniumGetUserNotificationRequest model module.
 * @module model/TitaniumGetUserNotificationRequest
 * @version 1.0.0
 */
class TitaniumGetUserNotificationRequest {
    /**
     * Constructs a new <code>TitaniumGetUserNotificationRequest</code>.
     * @alias module:model/TitaniumGetUserNotificationRequest
     */
    constructor() { 
        
        TitaniumGetUserNotificationRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumGetUserNotificationRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumGetUserNotificationRequest} obj Optional instance to populate.
     * @return {module:model/TitaniumGetUserNotificationRequest} The populated <code>TitaniumGetUserNotificationRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumGetUserNotificationRequest();

            if (data.hasOwnProperty('userId')) {
                obj['userId'] = ApiClient.convertToType(data['userId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} userId
 */
TitaniumGetUserNotificationRequest.prototype['userId'] = undefined;






export default TitaniumGetUserNotificationRequest;

