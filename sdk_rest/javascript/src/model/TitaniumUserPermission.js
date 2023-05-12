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
 * The TitaniumUserPermission model module.
 * @module model/TitaniumUserPermission
 * @version 1.0.0
 */
class TitaniumUserPermission {
    /**
     * Constructs a new <code>TitaniumUserPermission</code>.
     * @alias module:model/TitaniumUserPermission
     */
    constructor() { 
        
        TitaniumUserPermission.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TitaniumUserPermission</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TitaniumUserPermission} obj Optional instance to populate.
     * @return {module:model/TitaniumUserPermission} The populated <code>TitaniumUserPermission</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TitaniumUserPermission();

            if (data.hasOwnProperty('assetId')) {
                obj['assetId'] = ApiClient.convertToType(data['assetId'], 'String');
            }
            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ApiClient.convertToType(data['enabled'], 'Boolean');
            }
            if (data.hasOwnProperty('traceName')) {
                obj['traceName'] = ApiClient.convertToType(data['traceName'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} assetId
 */
TitaniumUserPermission.prototype['assetId'] = undefined;

/**
 * @member {Boolean} enabled
 */
TitaniumUserPermission.prototype['enabled'] = undefined;

/**
 * @member {String} traceName
 */
TitaniumUserPermission.prototype['traceName'] = undefined;

/**
 * @member {String} type
 */
TitaniumUserPermission.prototype['type'] = undefined;






export default TitaniumUserPermission;
