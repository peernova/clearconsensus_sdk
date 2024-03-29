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
import TitaniumAssetM from './TitaniumAssetM';
import TitaniumMarket from './TitaniumMarket';
import TitaniumUser from './TitaniumUser';

/**
 * The TitaniumUserNotification model module.
 * @module model/TitaniumUserNotification
 * @version 1.0.0
 */
class TitaniumUserNotification {
    /**
     * Constructs a new <code>TitaniumUserNotification</code>.
     * @alias module:model/TitaniumUserNotification
     */
    constructor() { 
        
        TitaniumUserNotification.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumUserNotification</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumUserNotification} obj Optional instance to populate.
     * @return {module:model/TitaniumUserNotification} The populated <code>TitaniumUserNotification</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumUserNotification();

            if (data.hasOwnProperty('asset')) {
                obj['asset'] = TitaniumAssetM.constructFromObject(data['asset']);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = TitaniumMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('user')) {
                obj['user'] = TitaniumUser.constructFromObject(data['user']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/TitaniumAssetM} asset
 */
TitaniumUserNotification.prototype['asset'] = undefined;

/**
 * @member {String} id
 */
TitaniumUserNotification.prototype['id'] = undefined;

/**
 * @member {module:model/TitaniumMarket} market
 */
TitaniumUserNotification.prototype['market'] = undefined;

/**
 * @member {String} type
 */
TitaniumUserNotification.prototype['type'] = undefined;

/**
 * @member {module:model/TitaniumUser} user
 */
TitaniumUserNotification.prototype['user'] = undefined;

/**
 * @member {String} value
 */
TitaniumUserNotification.prototype['value'] = undefined;






export default TitaniumUserNotification;

